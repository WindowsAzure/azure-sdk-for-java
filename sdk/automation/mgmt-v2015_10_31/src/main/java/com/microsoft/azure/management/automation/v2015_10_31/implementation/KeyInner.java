/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.AutomationKeyName;
import com.microsoft.azure.management.automation.v2015_10_31.AutomationKeyPermissions;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Automation key which is used to register a DSC Node.
 */
public class KeyInner {
    /**
     * Automation key name. Possible values include: 'Primary', 'Secondary'.
     */
    @JsonProperty(value = "KeyName", access = JsonProperty.Access.WRITE_ONLY)
    private AutomationKeyName keyName;

    /**
     * Automation key permissions. Possible values include: 'Read', 'Full'.
     */
    @JsonProperty(value = "Permissions", access = JsonProperty.Access.WRITE_ONLY)
    private AutomationKeyPermissions permissions;

    /**
     * Value of the Automation Key used for registration.
     */
    @JsonProperty(value = "Value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get automation key name. Possible values include: 'Primary', 'Secondary'.
     *
     * @return the keyName value
     */
    public AutomationKeyName keyName() {
        return this.keyName;
    }

    /**
     * Get automation key permissions. Possible values include: 'Read', 'Full'.
     *
     * @return the permissions value
     */
    public AutomationKeyPermissions permissions() {
        return this.permissions;
    }

    /**
     * Get value of the Automation Key used for registration.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
