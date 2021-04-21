// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Namespace/NotificationHub Regenerate Keys. */
@Fluent
public final class PolicykeyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicykeyResource.class);

    /*
     * Name of the key that has to be regenerated for the
     * Namespace/Notification Hub Authorization Rule. The value can be Primary
     * Key/Secondary Key.
     */
    @JsonProperty(value = "policyKey")
    private String policyKey;

    /**
     * Get the policyKey property: Name of the key that has to be regenerated for the Namespace/Notification Hub
     * Authorization Rule. The value can be Primary Key/Secondary Key.
     *
     * @return the policyKey value.
     */
    public String policyKey() {
        return this.policyKey;
    }

    /**
     * Set the policyKey property: Name of the key that has to be regenerated for the Namespace/Notification Hub
     * Authorization Rule. The value can be Primary Key/Secondary Key.
     *
     * @param policyKey the policyKey value to set.
     * @return the PolicykeyResource object itself.
     */
    public PolicykeyResource withPolicyKey(String policyKey) {
        this.policyKey = policyKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
