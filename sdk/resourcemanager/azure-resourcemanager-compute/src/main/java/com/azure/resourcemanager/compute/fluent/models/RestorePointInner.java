// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.ApiEntityReference;
import com.azure.resourcemanager.compute.models.ConsistencyModeTypes;
import com.azure.resourcemanager.compute.models.RestorePointProvisioningDetails;
import com.azure.resourcemanager.compute.models.RestorePointSourceMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Restore Point details. */
@Fluent
public final class RestorePointInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointInner.class);

    /*
     * The restore point properties.
     */
    @JsonProperty(value = "properties")
    private RestorePointProperties properties;

    /**
     * Get the properties property: The restore point properties.
     *
     * @return the properties value.
     */
    private RestorePointProperties properties() {
        return this.properties;
    }

    /**
     * Get the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @return the excludeDisks value.
     */
    public List<ApiEntityReference> excludeDisks() {
        return this.properties() == null ? null : this.properties().excludeDisks();
    }

    /**
     * Set the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @param excludeDisks the excludeDisks value to set.
     * @return the RestorePointInner object itself.
     */
    public RestorePointInner withExcludeDisks(List<ApiEntityReference> excludeDisks) {
        if (this.properties() == null) {
            this.properties = new RestorePointProperties();
        }
        this.properties().withExcludeDisks(excludeDisks);
        return this;
    }

    /**
     * Get the sourceMetadata property: Gets the details of the VM captured at the time of the restore point creation.
     *
     * @return the sourceMetadata value.
     */
    public RestorePointSourceMetadata sourceMetadata() {
        return this.properties() == null ? null : this.properties().sourceMetadata();
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the restore point.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.properties() == null ? null : this.properties().provisioningState();
    }

    /**
     * Get the consistencyMode property: Gets the consistency mode for the restore point. Please refer to
     * https://aka.ms/RestorePoints for more details.
     *
     * @return the consistencyMode value.
     */
    public ConsistencyModeTypes consistencyMode() {
        return this.properties() == null ? null : this.properties().consistencyMode();
    }

    /**
     * Get the provisioningDetails property: Gets the provisioning details set by the server during Create restore point
     * operation.
     *
     * @return the provisioningDetails value.
     */
    public RestorePointProvisioningDetails provisioningDetails() {
        return this.properties() == null ? null : this.properties().provisioningDetails();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
