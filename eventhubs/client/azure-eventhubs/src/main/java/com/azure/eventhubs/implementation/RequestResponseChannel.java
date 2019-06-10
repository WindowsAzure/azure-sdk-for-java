// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs.implementation;

import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.implementation.logging.ServiceLogger;
import com.azure.eventhubs.implementation.handler.ReceiveLinkHandler;
import com.azure.eventhubs.implementation.handler.SendLinkHandler;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.UnsignedLong;
import org.apache.qpid.proton.amqp.messaging.Source;
import org.apache.qpid.proton.amqp.messaging.Target;
import org.apache.qpid.proton.amqp.transport.ReceiverSettleMode;
import org.apache.qpid.proton.amqp.transport.SenderSettleMode;
import org.apache.qpid.proton.engine.BaseHandler;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Receiver;
import org.apache.qpid.proton.engine.Sender;
import org.apache.qpid.proton.engine.Session;
import org.apache.qpid.proton.message.Message;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

import static java.nio.charset.StandardCharsets.UTF_8;

class RequestResponseChannel implements Closeable {
    private final ConcurrentSkipListMap<UnsignedLong, MonoSink<Message>> unconfirmedSends = new ConcurrentSkipListMap<>();
    private final ServiceLogger logger = new ServiceLogger(RequestResponseChannel.class);

    private final Sender sendLink;
    private final Receiver receiveLink;
    private final String replyTo;
    private final AtomicBoolean hasOpened = new AtomicBoolean();
    private final AtomicLong requestId = new AtomicLong(0);
    private final SendLinkHandler sendLinkHandler;
    private final ReceiveLinkHandler receiveLinkHandler;
    private final Disposable subscription;

    RequestResponseChannel(String connectionId, String host, String linkName, String path, Session session) {

        this.replyTo = path.replace("$", "") + "-client-reply-to";
        this.sendLink = session.sender(linkName + ":sender");
        final Target target = new Target();
        target.setAddress(path);
        this.sendLink.setTarget(target);
        sendLink.setSource(new Source());
        this.sendLink.setSenderSettleMode(SenderSettleMode.SETTLED);
        this.sendLinkHandler = new SendLinkHandler(connectionId, host, linkName);
        BaseHandler.setHandler(sendLink, sendLinkHandler);

        this.receiveLink = session.receiver(linkName + ":receiver");
        final Source source = new Source();
        source.setAddress(path);
        this.receiveLink.setSource(source);
        final Target receiverTarget = new Target();
        receiverTarget.setAddress(replyTo);
        this.receiveLink.setTarget(receiverTarget);
        this.receiveLink.setSenderSettleMode(SenderSettleMode.SETTLED);
        this.receiveLink.setReceiverSettleMode(ReceiverSettleMode.SECOND);
        this.receiveLinkHandler = new ReceiveLinkHandler(connectionId, host, linkName);
        BaseHandler.setHandler(this.receiveLink, receiveLinkHandler);

        this.subscription = receiveLinkHandler.getDeliveredMessages().map(this::decodeDelivery).subscribe(message -> {
            logger.asInfo().log("Setting message: {}", message.getCorrelationId());
            settleMessage(message);
        }, this::handleException);
    }

    @Override
    public void close() {
        this.subscription.dispose();

        if (hasOpened.getAndSet(false)) {
            sendLink.close();
            receiveLink.close();
        }
    }

    public Mono<Message> sendWithAck(final Message message, final ReactorDispatcher dispatcher) {
        start();

        if (message == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        if (message.getMessageId() != null) {
            throw new IllegalArgumentException("message.getMessageId() should be null");
        }
        if (message.getReplyTo() != null) {
            throw new IllegalArgumentException("message.getReplyTo() should be null");
        }

        final UnsignedLong messageId = UnsignedLong.valueOf(requestId.incrementAndGet());
        message.setMessageId(messageId);
        message.setReplyTo(replyTo);

        return Mono.when(
            sendLinkHandler.getEndpointStates().takeUntil(x -> x == EndpointState.ACTIVE),
            receiveLinkHandler.getEndpointStates().takeUntil(x -> x == EndpointState.ACTIVE)).then(
            Mono.create(sink -> {
                try {
                    dispatcher.invoke(() -> {
                        unconfirmedSends.putIfAbsent(messageId, sink);
                        send(message);
                    });
                } catch (IOException e) {
                    sink.error(e);
                }
            }));
    }

    private void start() {
        if (!hasOpened.getAndSet(true)) {
            sendLink.open();
            receiveLink.open();
        }
    }

    // Not thread-safe This must be invoked from reactor/dispatcher thread. And assumes that this is run on a link
    // that is open.
    private void send(final Message message) {
        sendLink.delivery(UUID.randomUUID().toString().replace("-", "").getBytes(UTF_8));

        final int payloadSize = AmqpUtil.getDataSerializedSize(message) + 512; // need buffer for headers
        final byte[] bytes = new byte[payloadSize];
        final int encodedSize = message.encode(bytes, 0, payloadSize);

        receiveLink.flow(1);
        sendLink.send(bytes, 0, encodedSize);
        sendLink.advance();
    }

    private Message decodeDelivery(Delivery delivery) {
        final Message response = Proton.message();
        final int msgSize = delivery.pending();
        final byte[] buffer = new byte[msgSize];

        final int read = receiveLink.recv(buffer, 0, msgSize);

        response.decode(buffer, 0, read);
        delivery.settle();

        return response;
    }

    private void settleMessage(Message message) {
        final String id = String.valueOf(message.getCorrelationId());
        final UnsignedLong correlationId = UnsignedLong.valueOf(id);
        final MonoSink<Message> sink = unconfirmedSends.remove(correlationId);

        if (sink != null) {
            sink.success(message);
        } else {
            logger.asWarning().log("Received a delivery that was not a known pending message: {}", id);
        }
    }

    private void handleException(Throwable error) {
        if (error instanceof AmqpException) {
            AmqpException exception = (AmqpException) error;

            if (!exception.isTransient()) {
                logger.asError().log("Exception encountered. Closing channel and clearing unconfirmed sends.", exception);
                close();

                unconfirmedSends.forEach((key, value) -> {
                    value.error(error);
                });
            }
        }
    }
}
