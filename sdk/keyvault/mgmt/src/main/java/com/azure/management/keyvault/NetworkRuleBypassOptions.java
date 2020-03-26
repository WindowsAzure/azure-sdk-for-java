// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for NetworkRuleBypassOptions.
 */
public final class NetworkRuleBypassOptions extends ExpandableStringEnum<NetworkRuleBypassOptions> {
    /**
     * Static value AzureServices for NetworkRuleBypassOptions.
     */
    public static final NetworkRuleBypassOptions AZURE_SERVICES = fromString("AzureServices");

    /**
     * Static value None for NetworkRuleBypassOptions.
     */
    public static final NetworkRuleBypassOptions NONE = fromString("None");

    /**
     * Creates or finds a NetworkRuleBypassOptions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkRuleBypassOptions.
     */
    @JsonCreator
    public static NetworkRuleBypassOptions fromString(String name) {
        return fromString(name, NetworkRuleBypassOptions.class);
    }

    /**
     * @return known NetworkRuleBypassOptions values.
     */
    public static Collection<NetworkRuleBypassOptions> values() {
        return values(NetworkRuleBypassOptions.class);
    }
}
