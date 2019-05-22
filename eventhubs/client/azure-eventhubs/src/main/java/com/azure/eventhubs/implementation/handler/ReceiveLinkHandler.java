// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs.implementation.handler;

import com.azure.eventhubs.implementation.ConnectionProperties;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Event;
import org.apache.qpid.proton.engine.Link;
import org.apache.qpid.proton.engine.Receiver;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import java.util.concurrent.atomic.AtomicBoolean;

public class ReceiveLinkHandler extends LinkHandler {
    private final String receiverName;
    private AtomicBoolean isFirstResponse = new AtomicBoolean(true);
    private final Flux<Delivery> deliveries;
    private FluxSink<Delivery> deliverySink;

    public ReceiveLinkHandler(final ConnectionProperties properties, final String receiverName) {
        super(properties.connectionId(), properties.host());
        this.deliveries = Flux.create(sink -> {
            deliverySink = sink;
        });
        this.receiverName = receiverName;
    }

    public Flux<Delivery> getDeliveredMessages() {
        return deliveries;
    }

    @Override
    public void close() {
        deliverySink.complete();
        super.close();
    }

    @Override
    public void onLinkLocalOpen(Event event) {
        final Link link = event.getLink();
        if (link instanceof Receiver) {
            logger.asInformational().log("onLinkLocalOpen receiverName[{}], linkName[{}], localSource[{}]",
                receiverName, link.getName(), link.getSource());
        }
    }

    @Override
    public void onLinkRemoteOpen(Event event) {
        final Link link = event.getLink();
        if (link instanceof Receiver) {
            if (link.getRemoteSource() != null) {
                logger.asInformational().log("onLinkRemoteOpen receiverName[{}], linkName[{}], remoteSource[{}]",
                    receiverName, link.getName(), link.getRemoteSource());

                if (isFirstResponse.getAndSet(false)) {
                    onNext(EndpointState.ACTIVE);
                }
            } else {
                logger.asInformational().log("onLinkRemoteOpen receiverName[{}], linkName[{}], action[waitingForError]",
                    receiverName, link.getName());
            }
        }
    }

    @Override
    public void onDelivery(Event event) {
        if (isFirstResponse.getAndSet(false)) {
            onNext(EndpointState.ACTIVE);
        }

        final Delivery delivery = event.getDelivery();
        final Receiver link = (Receiver) delivery.getLink();

        // If a message spans across deliveries (for ex: 200k message will be 4 frames (deliveries) 64k 64k 64k 8k),
        // all until "last-1" deliveries will be partial
        // reactor will raise onDelivery event for all of these - we only need the last one
        if (!delivery.isPartial()) {
            // One of our customers hit an issue - where duplicate 'Delivery' events are raised to Reactor in proton-j layer
            // While processing the duplicate event - reactor hits an IllegalStateException in proton-j layer
            // before we fix proton-j - this work around ensures that we ignore the duplicate Delivery event
            if (delivery.isSettled()) {
                if (link != null) {
                    logger.asInformational().log("onDelivery receiverName[{}], linkName[{}], updatedLinkCredit[{}], remoteCredit[{}], "
                            + "remoteCondition[{}], delivery.isSettled[{}]",
                        receiverName, link.getName(), link.getCredit(), link.getRemoteCredit(), link.getRemoteCondition(), delivery.isSettled());
                } else {
                    logger.asWarning().log("delivery.isSettled[{}]", delivery.isSettled());
                }
            } else {
                deliverySink.next(delivery);
            }
        }

        if (link != null) {
            logger.asTrace().log("onDelivery receiverName[{}], linkName[{}], updatedLinkCredit[{}], remoteCredit[{}], "
                    + "remoteCondition[{}], delivery.isPartial[{}]",
                receiverName, link.getName(), link.getCredit(), link.getRemoteCredit(), link.getRemoteCondition(), delivery.isPartial());
        }
    }
}
