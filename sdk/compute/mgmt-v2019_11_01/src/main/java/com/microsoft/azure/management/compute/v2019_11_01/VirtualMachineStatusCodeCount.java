/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status code and count of the virtual machine scale set instance view
 * status summary.
 */
public class VirtualMachineStatusCodeCount {
    /**
     * The instance view status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The number of instances having a particular status code.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /**
     * Get the instance view status code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the number of instances having a particular status code.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

}
