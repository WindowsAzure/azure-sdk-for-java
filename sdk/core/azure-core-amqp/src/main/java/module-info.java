// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module com.azure.core.amqp {
    requires com.azure.core;

    requires reactor.core;
    requires proton.j;

    exports com.azure.core.amqp;
    exports com.azure.core.amqp.exception;

    exports com.azure.core.amqp.implementation to
        com.azure.messaging.eventhubs;                  // FIXME this should not be a long-term solution
}
