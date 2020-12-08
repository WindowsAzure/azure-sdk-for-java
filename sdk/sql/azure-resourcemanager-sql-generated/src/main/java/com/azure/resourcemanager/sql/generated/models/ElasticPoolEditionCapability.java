// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The elastic pool edition capability. */
@Fluent
public final class ElasticPoolEditionCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolEditionCapability.class);

    /*
     * The elastic pool edition name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of supported elastic pool DTU levels for the edition.
     */
    @JsonProperty(value = "supportedElasticPoolPerformanceLevels", access = JsonProperty.Access.WRITE_ONLY)
    private List<ElasticPoolPerformanceLevelCapability> supportedElasticPoolPerformanceLevels;

    /*
     * Whether or not zone redundancy is supported for the edition.
     */
    @JsonProperty(value = "zoneRedundant", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundant;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the name property: The elastic pool edition name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedElasticPoolPerformanceLevels property: The list of supported elastic pool DTU levels for the
     * edition.
     *
     * @return the supportedElasticPoolPerformanceLevels value.
     */
    public List<ElasticPoolPerformanceLevelCapability> supportedElasticPoolPerformanceLevels() {
        return this.supportedElasticPoolPerformanceLevels;
    }

    /**
     * Get the zoneRedundant property: Whether or not zone redundancy is supported for the edition.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Get the status property: The status of the capability.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     *
     * @param reason the reason value to set.
     * @return the ElasticPoolEditionCapability object itself.
     */
    public ElasticPoolEditionCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedElasticPoolPerformanceLevels() != null) {
            supportedElasticPoolPerformanceLevels().forEach(e -> e.validate());
        }
    }
}
