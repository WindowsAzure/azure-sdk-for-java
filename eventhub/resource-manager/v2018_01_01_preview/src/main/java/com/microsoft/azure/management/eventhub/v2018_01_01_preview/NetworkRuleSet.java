/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation.EventHubManager;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation.NetworkRuleSetInner;
import java.util.List;

/**
 * Type representing NetworkRuleSet.
 */
public interface NetworkRuleSet extends HasInner<NetworkRuleSetInner>, HasManager<EventHubManager> {
    /**
     * @return the defaultAction value.
     */
    DefaultAction defaultAction();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipRules value.
     */
    List<NWRuleSetIpRules> ipRules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualNetworkRules value.
     */
    List<NWRuleSetVirtualNetworkRules> virtualNetworkRules();

}
