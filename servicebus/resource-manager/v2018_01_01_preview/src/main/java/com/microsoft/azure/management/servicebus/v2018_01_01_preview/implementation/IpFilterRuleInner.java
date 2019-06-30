/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.servicebus.v2018_01_01_preview.IPAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in a List or Get IpFilterRules operation.
 */
@JsonFlatten
public class IpFilterRuleInner extends ProxyResource {
    /**
     * IP Mask.
     */
    @JsonProperty(value = "properties.ipMask")
    private String ipMask;

    /**
     * The IP Filter Action. Possible values include: 'Accept', 'Reject'.
     */
    @JsonProperty(value = "properties.action")
    private IPAction action;

    /**
     * IP Filter name.
     */
    @JsonProperty(value = "properties.filterName")
    private String filterName;

    /**
     * Get iP Mask.
     *
     * @return the ipMask value
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set iP Mask.
     *
     * @param ipMask the ipMask value to set
     * @return the IpFilterRuleInner object itself.
     */
    public IpFilterRuleInner withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Get the IP Filter Action. Possible values include: 'Accept', 'Reject'.
     *
     * @return the action value
     */
    public IPAction action() {
        return this.action;
    }

    /**
     * Set the IP Filter Action. Possible values include: 'Accept', 'Reject'.
     *
     * @param action the action value to set
     * @return the IpFilterRuleInner object itself.
     */
    public IpFilterRuleInner withAction(IPAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get iP Filter name.
     *
     * @return the filterName value
     */
    public String filterName() {
        return this.filterName;
    }

    /**
     * Set iP Filter name.
     *
     * @param filterName the filterName value to set
     * @return the IpFilterRuleInner object itself.
     */
    public IpFilterRuleInner withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

}
