// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Automation key which is used to register a DSC Node. */
@Immutable
public final class Key {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Key.class);

    /*
     * Automation key name.
     */
    @JsonProperty(value = "KeyName", access = JsonProperty.Access.WRITE_ONLY)
    private AutomationKeyName keyName;

    /*
     * Automation key permissions.
     */
    @JsonProperty(value = "Permissions", access = JsonProperty.Access.WRITE_ONLY)
    private AutomationKeyPermissions permissions;

    /*
     * Value of the Automation Key used for registration.
     */
    @JsonProperty(value = "Value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the keyName property: Automation key name.
     *
     * @return the keyName value.
     */
    public AutomationKeyName keyName() {
        return this.keyName;
    }

    /**
     * Get the permissions property: Automation key permissions.
     *
     * @return the permissions value.
     */
    public AutomationKeyPermissions permissions() {
        return this.permissions;
    }

    /**
     * Get the value property: Value of the Automation Key used for registration.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
