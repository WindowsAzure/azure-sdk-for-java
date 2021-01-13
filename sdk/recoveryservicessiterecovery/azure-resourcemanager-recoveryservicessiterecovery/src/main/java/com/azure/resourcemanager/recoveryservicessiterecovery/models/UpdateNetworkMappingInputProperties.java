// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Common input details for network mapping operation. */
@Fluent
public final class UpdateNetworkMappingInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateNetworkMappingInputProperties.class);

    /*
     * Recovery fabric name.
     */
    @JsonProperty(value = "recoveryFabricName")
    private String recoveryFabricName;

    /*
     * Recovery network Id.
     */
    @JsonProperty(value = "recoveryNetworkId")
    private String recoveryNetworkId;

    /*
     * Fabrics specific input network Id.
     */
    @JsonProperty(value = "fabricSpecificDetails")
    private FabricSpecificUpdateNetworkMappingInput fabricSpecificDetails;

    /**
     * Get the recoveryFabricName property: Recovery fabric name.
     *
     * @return the recoveryFabricName value.
     */
    public String recoveryFabricName() {
        return this.recoveryFabricName;
    }

    /**
     * Set the recoveryFabricName property: Recovery fabric name.
     *
     * @param recoveryFabricName the recoveryFabricName value to set.
     * @return the UpdateNetworkMappingInputProperties object itself.
     */
    public UpdateNetworkMappingInputProperties withRecoveryFabricName(String recoveryFabricName) {
        this.recoveryFabricName = recoveryFabricName;
        return this;
    }

    /**
     * Get the recoveryNetworkId property: Recovery network Id.
     *
     * @return the recoveryNetworkId value.
     */
    public String recoveryNetworkId() {
        return this.recoveryNetworkId;
    }

    /**
     * Set the recoveryNetworkId property: Recovery network Id.
     *
     * @param recoveryNetworkId the recoveryNetworkId value to set.
     * @return the UpdateNetworkMappingInputProperties object itself.
     */
    public UpdateNetworkMappingInputProperties withRecoveryNetworkId(String recoveryNetworkId) {
        this.recoveryNetworkId = recoveryNetworkId;
        return this;
    }

    /**
     * Get the fabricSpecificDetails property: Fabrics specific input network Id.
     *
     * @return the fabricSpecificDetails value.
     */
    public FabricSpecificUpdateNetworkMappingInput fabricSpecificDetails() {
        return this.fabricSpecificDetails;
    }

    /**
     * Set the fabricSpecificDetails property: Fabrics specific input network Id.
     *
     * @param fabricSpecificDetails the fabricSpecificDetails value to set.
     * @return the UpdateNetworkMappingInputProperties object itself.
     */
    public UpdateNetworkMappingInputProperties withFabricSpecificDetails(
        FabricSpecificUpdateNetworkMappingInput fabricSpecificDetails) {
        this.fabricSpecificDetails = fabricSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fabricSpecificDetails() != null) {
            fabricSpecificDetails().validate();
        }
    }
}
