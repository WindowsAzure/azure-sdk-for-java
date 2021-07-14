// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The NotificationRegistrationProperties model. */
@Fluent
public final class NotificationRegistrationProperties extends NotificationRegistrationPropertiesAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotificationRegistrationProperties.class);

    /** {@inheritDoc} */
    @Override
    public NotificationRegistrationProperties withNotificationMode(NotificationMode notificationMode) {
        super.withNotificationMode(notificationMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NotificationRegistrationProperties withMessageScope(MessageScope messageScope) {
        super.withMessageScope(messageScope);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NotificationRegistrationProperties withIncludedEvents(List<String> includedEvents) {
        super.withIncludedEvents(includedEvents);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NotificationRegistrationProperties withNotificationEndpoints(
        List<NotificationEndpoint> notificationEndpoints) {
        super.withNotificationEndpoints(notificationEndpoints);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
