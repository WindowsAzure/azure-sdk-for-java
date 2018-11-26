/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Namespace/NotificationHub Regenerate Keys.
 */
public class PolicykeyResource {
    /**
     * Name of the key that has to be regenerated for the
     * Namespace/Notification Hub Authorization Rule. The value can be Primary
     * Key/Secondary Key.
     */
    @JsonProperty(value = "policyKey")
    private String policyKey;

    /**
     * Get name of the key that has to be regenerated for the Namespace/Notification Hub Authorization Rule. The value can be Primary Key/Secondary Key.
     *
     * @return the policyKey value
     */
    public String policyKey() {
        return this.policyKey;
    }

    /**
     * Set name of the key that has to be regenerated for the Namespace/Notification Hub Authorization Rule. The value can be Primary Key/Secondary Key.
     *
     * @param policyKey the policyKey value to set
     * @return the PolicykeyResource object itself.
     */
    public PolicykeyResource withPolicyKey(String policyKey) {
        this.policyKey = policyKey;
        return this;
    }

}
