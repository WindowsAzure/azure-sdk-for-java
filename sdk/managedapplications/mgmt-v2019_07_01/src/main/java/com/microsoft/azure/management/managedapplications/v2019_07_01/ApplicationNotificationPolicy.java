/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed application notification policy.
 */
public class ApplicationNotificationPolicy {
    /**
     * The managed application notification endpoint.
     */
    @JsonProperty(value = "notificationEndpoints", required = true)
    private List<ApplicationNotificationEndpoint> notificationEndpoints;

    /**
     * Get the managed application notification endpoint.
     *
     * @return the notificationEndpoints value
     */
    public List<ApplicationNotificationEndpoint> notificationEndpoints() {
        return this.notificationEndpoints;
    }

    /**
     * Set the managed application notification endpoint.
     *
     * @param notificationEndpoints the notificationEndpoints value to set
     * @return the ApplicationNotificationPolicy object itself.
     */
    public ApplicationNotificationPolicy withNotificationEndpoints(List<ApplicationNotificationEndpoint> notificationEndpoints) {
        this.notificationEndpoints = notificationEndpoints;
        return this;
    }

}
