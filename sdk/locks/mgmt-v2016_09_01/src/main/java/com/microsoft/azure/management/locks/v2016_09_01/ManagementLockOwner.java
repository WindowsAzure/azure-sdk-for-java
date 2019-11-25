/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.locks.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lock owner properties.
 */
public class ManagementLockOwner {
    /**
     * The application ID of the lock owner.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /**
     * Get the application ID of the lock owner.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the application ID of the lock owner.
     *
     * @param applicationId the applicationId value to set
     * @return the ManagementLockOwner object itself.
     */
    public ManagementLockOwner withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

}
