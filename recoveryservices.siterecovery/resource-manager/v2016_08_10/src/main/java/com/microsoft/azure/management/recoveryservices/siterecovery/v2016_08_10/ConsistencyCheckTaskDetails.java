/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class contains monitoring details of all the inconsistent Protected
 * Entities in Vmm.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ConsistencyCheckTaskDetails")
public class ConsistencyCheckTaskDetails extends TaskTypeDetails {
    /**
     * The list of inconsistent Vm details.
     */
    @JsonProperty(value = "vmDetails")
    private List<InconsistentVmDetails> vmDetails;

    /**
     * Get the list of inconsistent Vm details.
     *
     * @return the vmDetails value
     */
    public List<InconsistentVmDetails> vmDetails() {
        return this.vmDetails;
    }

    /**
     * Set the list of inconsistent Vm details.
     *
     * @param vmDetails the vmDetails value to set
     * @return the ConsistencyCheckTaskDetails object itself.
     */
    public ConsistencyCheckTaskDetails withVmDetails(List<InconsistentVmDetails> vmDetails) {
        this.vmDetails = vmDetails;
        return this;
    }

}
