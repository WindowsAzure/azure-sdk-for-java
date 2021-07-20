// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of association of a data collection rule with a monitored Azure resource. */
@Fluent
public class DataCollectionRuleAssociation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataCollectionRuleAssociation.class);

    /*
     * Description of the association.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The resource ID of the data collection rule that is to be associated.
     */
    @JsonProperty(value = "dataCollectionRuleId")
    private String dataCollectionRuleId;

    /*
     * The resource ID of the data collection endpoint that is to be
     * associated.
     */
    @JsonProperty(value = "dataCollectionEndpointId")
    private String dataCollectionEndpointId;

    /*
     * The resource provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KnownDataCollectionRuleAssociationProvisioningState provisioningState;

    /**
     * Get the description property: Description of the association.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the association.
     *
     * @param description the description value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    public DataCollectionRuleAssociation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dataCollectionRuleId property: The resource ID of the data collection rule that is to be associated.
     *
     * @return the dataCollectionRuleId value.
     */
    public String dataCollectionRuleId() {
        return this.dataCollectionRuleId;
    }

    /**
     * Set the dataCollectionRuleId property: The resource ID of the data collection rule that is to be associated.
     *
     * @param dataCollectionRuleId the dataCollectionRuleId value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    public DataCollectionRuleAssociation withDataCollectionRuleId(String dataCollectionRuleId) {
        this.dataCollectionRuleId = dataCollectionRuleId;
        return this;
    }

    /**
     * Get the dataCollectionEndpointId property: The resource ID of the data collection endpoint that is to be
     * associated.
     *
     * @return the dataCollectionEndpointId value.
     */
    public String dataCollectionEndpointId() {
        return this.dataCollectionEndpointId;
    }

    /**
     * Set the dataCollectionEndpointId property: The resource ID of the data collection endpoint that is to be
     * associated.
     *
     * @param dataCollectionEndpointId the dataCollectionEndpointId value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    public DataCollectionRuleAssociation withDataCollectionEndpointId(String dataCollectionEndpointId) {
        this.dataCollectionEndpointId = dataCollectionEndpointId;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public KnownDataCollectionRuleAssociationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
