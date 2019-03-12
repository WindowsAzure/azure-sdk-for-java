// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.impl;

import org.apache.qpid.proton.engine.Delivery;

public interface AmqpSender extends AmqpLink {
    void onFlow(final int creditIssued);

    void onSendComplete(final Delivery delivery);
}
