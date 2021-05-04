// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.Map;

/** Represents a lab. */
@JsonFlatten
@Fluent
public class LabFragment extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabFragment.class);

    /*
     * Maximum number of users allowed in the lab.
     */
    @JsonProperty(value = "properties.maxUsersInLab")
    private Integer maxUsersInLab;

    /*
     * Maximum duration a user can use an environment for in the lab.
     */
    @JsonProperty(value = "properties.usageQuota")
    private Duration usageQuota;

    /*
     * Lab user access mode (open to all vs. restricted to those listed on the
     * lab).
     */
    @JsonProperty(value = "properties.userAccessMode")
    private LabUserAccessMode userAccessMode;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the maxUsersInLab property: Maximum number of users allowed in the lab.
     *
     * @return the maxUsersInLab value.
     */
    public Integer maxUsersInLab() {
        return this.maxUsersInLab;
    }

    /**
     * Set the maxUsersInLab property: Maximum number of users allowed in the lab.
     *
     * @param maxUsersInLab the maxUsersInLab value to set.
     * @return the LabFragment object itself.
     */
    public LabFragment withMaxUsersInLab(Integer maxUsersInLab) {
        this.maxUsersInLab = maxUsersInLab;
        return this;
    }

    /**
     * Get the usageQuota property: Maximum duration a user can use an environment for in the lab.
     *
     * @return the usageQuota value.
     */
    public Duration usageQuota() {
        return this.usageQuota;
    }

    /**
     * Set the usageQuota property: Maximum duration a user can use an environment for in the lab.
     *
     * @param usageQuota the usageQuota value to set.
     * @return the LabFragment object itself.
     */
    public LabFragment withUsageQuota(Duration usageQuota) {
        this.usageQuota = usageQuota;
        return this;
    }

    /**
     * Get the userAccessMode property: Lab user access mode (open to all vs. restricted to those listed on the lab).
     *
     * @return the userAccessMode value.
     */
    public LabUserAccessMode userAccessMode() {
        return this.userAccessMode;
    }

    /**
     * Set the userAccessMode property: Lab user access mode (open to all vs. restricted to those listed on the lab).
     *
     * @param userAccessMode the userAccessMode value to set.
     * @return the LabFragment object itself.
     */
    public LabFragment withUserAccessMode(LabUserAccessMode userAccessMode) {
        this.userAccessMode = userAccessMode;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the LabFragment object itself.
     */
    public LabFragment withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set.
     * @return the LabFragment object itself.
     */
    public LabFragment withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LabFragment withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LabFragment withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
