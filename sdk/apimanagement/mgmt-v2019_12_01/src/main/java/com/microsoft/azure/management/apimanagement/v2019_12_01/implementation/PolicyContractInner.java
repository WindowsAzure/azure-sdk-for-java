/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.PolicyContentFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Policy Contract details.
 */
@JsonFlatten
public class PolicyContractInner extends ProxyResource {
    /**
     * Contents of the Policy as defined by the format.
     */
    @JsonProperty(value = "properties.value", required = true)
    private String value;

    /**
     * Format of the policyContent. Possible values include: 'xml', 'xml-link',
     * 'rawxml', 'rawxml-link'.
     */
    @JsonProperty(value = "properties.format")
    private PolicyContentFormat format;

    /**
     * Get contents of the Policy as defined by the format.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set contents of the Policy as defined by the format.
     *
     * @param value the value value to set
     * @return the PolicyContractInner object itself.
     */
    public PolicyContractInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get format of the policyContent. Possible values include: 'xml', 'xml-link', 'rawxml', 'rawxml-link'.
     *
     * @return the format value
     */
    public PolicyContentFormat format() {
        return this.format;
    }

    /**
     * Set format of the policyContent. Possible values include: 'xml', 'xml-link', 'rawxml', 'rawxml-link'.
     *
     * @param format the format value to set
     * @return the PolicyContractInner object itself.
     */
    public PolicyContractInner withFormat(PolicyContentFormat format) {
        this.format = format;
        return this;
    }

}
