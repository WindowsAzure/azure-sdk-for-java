// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.implementation.ReactorDispatcher;
import com.azure.core.amqp.implementation.ReactorReceiver;
import com.azure.core.amqp.implementation.TokenManager;
import com.azure.core.amqp.implementation.handler.ReceiveLinkHandler;
import org.apache.qpid.proton.amqp.messaging.Accepted;
import org.apache.qpid.proton.amqp.transport.SenderSettleMode;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.Receiver;
import org.apache.qpid.proton.message.Message;

import java.util.UUID;

import static com.azure.messaging.servicebus.implementation.MessageUtils.LOCK_TOKEN_SIZE;

/**
 * A proton-j receiver for Service Bus.
 */
class ServiceBusReactorReceiver extends ReactorReceiver {

    private final Receiver receiver;

    ServiceBusReactorReceiver(String entityPath, Receiver receiver, ReceiveLinkHandler handler,
        TokenManager tokenManager, ReactorDispatcher dispatcher) {
        super(entityPath, receiver, handler, tokenManager, dispatcher);
        this.receiver = receiver;
    }

    @Override
    protected Message decodeDelivery(Delivery delivery) {
        final Message base = super.decodeDelivery(delivery);
        final byte[] deliveryTag = delivery.getTag();
        final UUID lockToken;

        if (deliveryTag != null && deliveryTag.length == LOCK_TOKEN_SIZE) {
            lockToken = MessageUtils.convertDotNetBytesToUUID(deliveryTag);
        } else {
            lockToken = MessageUtils.ZERO_LOCK_TOKEN;
        }

        if (receiver.getSenderSettleMode() == SenderSettleMode.SETTLED) {
            // No op. Delivery comes settled from the sender
            delivery.disposition(Accepted.getInstance());
            delivery.settle();
        }
        return new MessageWithLockToken(base, lockToken);
    }
}
