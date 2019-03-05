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
 * Unpairing input properties.
 */
public class RemoveProtectionContainerMappingInputProperties {
    /**
     * Provider specific input for unpairing.
     */
    @JsonProperty(value = "providerSpecificInput")
    private ReplicationProviderContainerUnmappingInput providerSpecificInput;

    /**
     * Get provider specific input for unpairing.
     *
     * @return the providerSpecificInput value
     */
    public ReplicationProviderContainerUnmappingInput providerSpecificInput() {
        return this.providerSpecificInput;
    }

    /**
     * Set provider specific input for unpairing.
     *
     * @param providerSpecificInput the providerSpecificInput value to set
     * @return the RemoveProtectionContainerMappingInputProperties object itself.
     */
    public RemoveProtectionContainerMappingInputProperties withProviderSpecificInput(ReplicationProviderContainerUnmappingInput providerSpecificInput) {
        this.providerSpecificInput = providerSpecificInput;
        return this;
    }

}
