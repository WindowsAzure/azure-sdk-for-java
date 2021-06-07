// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

import com.azure.core.annotation.Fluent;

/**
 * There are different outcomes accepted by the AMQP protocol layer.
 *
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-messaging-v1.0-os.html#type-accepted">Delivery
 *     State: Accepted</a>
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-messaging-v1.0-os.html#type-released">Delivery
 *     State: Released</a>
 * @see ModifiedDeliveryOutcome
 * @see RejectedDeliveryOutcome
 * @see TransactionalDeliveryOutcome
 */
@Fluent
public class DeliveryOutcome {
    private final DeliveryState deliveryState;

    /**
     * Creates an instance of the delivery outcome with its state.
     *
     * @param deliveryState The state of the delivery.
     */
    public DeliveryOutcome(DeliveryState deliveryState) {
        this.deliveryState = deliveryState;
    }

    /**
     * Gets the delivery state.
     *
     * @return The delivery state.
     */
    public DeliveryState getDeliveryState() {
        return deliveryState;
    }
}
