/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container mapping provider specific details.
 */
public class ProtectionContainerMappingProviderSpecificDetails {
    /**
     * Gets the class type. Overridden in derived classes.
     */
    @JsonProperty(value = "instanceType", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceType;

    /**
     * Get gets the class type. Overridden in derived classes.
     *
     * @return the instanceType value
     */
    public String instanceType() {
        return this.instanceType;
    }

}
