// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Service Level Agreement details for a support ticket. */
@Immutable
public final class ServiceLevelAgreement {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceLevelAgreement.class);

    /*
     * Time in UTC (ISO 8601 format) when the service level agreement starts.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Time in UTC (ISO 8601 format) when the service level agreement expires.
     */
    @JsonProperty(value = "expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationTime;

    /*
     * Service Level Agreement in minutes.
     */
    @JsonProperty(value = "slaMinutes", access = JsonProperty.Access.WRITE_ONLY)
    private Integer slaMinutes;

    /**
     * Get the startTime property: Time in UTC (ISO 8601 format) when the service level agreement starts.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the expirationTime property: Time in UTC (ISO 8601 format) when the service level agreement expires.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the slaMinutes property: Service Level Agreement in minutes.
     *
     * @return the slaMinutes value.
     */
    public Integer slaMinutes() {
        return this.slaMinutes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
