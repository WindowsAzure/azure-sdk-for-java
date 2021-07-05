// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A deleted server. */
@JsonFlatten
@Immutable
public class DeletedServerInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedServerInner.class);

    /*
     * The version of the deleted server.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The deletion time of the deleted server.
     */
    @JsonProperty(value = "properties.deletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionTime;

    /*
     * The original ID of the server before deletion.
     */
    @JsonProperty(value = "properties.originalId", access = JsonProperty.Access.WRITE_ONLY)
    private String originalId;

    /*
     * The fully qualified domain name of the server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /**
     * Get the version property: The version of the deleted server.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the deletionTime property: The deletion time of the deleted server.
     *
     * @return the deletionTime value.
     */
    public OffsetDateTime deletionTime() {
        return this.deletionTime;
    }

    /**
     * Get the originalId property: The original ID of the server before deletion.
     *
     * @return the originalId value.
     */
    public String originalId() {
        return this.originalId;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of the server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
