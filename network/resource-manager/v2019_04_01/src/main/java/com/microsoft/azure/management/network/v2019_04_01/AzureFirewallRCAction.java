/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the AzureFirewallRCAction.
 */
public class AzureFirewallRCAction {
    /**
     * The type of action. Possible values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "type")
    private AzureFirewallRCActionType type;

    /**
     * Get the type of action. Possible values include: 'Allow', 'Deny'.
     *
     * @return the type value
     */
    public AzureFirewallRCActionType type() {
        return this.type;
    }

    /**
     * Set the type of action. Possible values include: 'Allow', 'Deny'.
     *
     * @param type the type value to set
     * @return the AzureFirewallRCAction object itself.
     */
    public AzureFirewallRCAction withType(AzureFirewallRCActionType type) {
        this.type = type;
        return this;
    }

}
