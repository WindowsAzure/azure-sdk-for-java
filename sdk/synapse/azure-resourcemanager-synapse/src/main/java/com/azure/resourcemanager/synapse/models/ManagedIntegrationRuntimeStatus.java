// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Managed integration runtime status. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Managed")
@JsonFlatten
@Immutable
public class ManagedIntegrationRuntimeStatus extends IntegrationRuntimeStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedIntegrationRuntimeStatus.class);

    /*
     * The time at which the integration runtime was created, in ISO8601
     * format.
     */
    @JsonProperty(value = "typeProperties.createTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createTime;

    /*
     * The list of nodes for managed integration runtime.
     */
    @JsonProperty(value = "typeProperties.nodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedIntegrationRuntimeNode> nodes;

    /*
     * The errors that occurred on this integration runtime.
     */
    @JsonProperty(value = "typeProperties.otherErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedIntegrationRuntimeError> otherErrors;

    /*
     * The last operation result that occurred on this integration runtime.
     */
    @JsonProperty(value = "typeProperties.lastOperation", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedIntegrationRuntimeOperationResult lastOperation;

    /**
     * Get the createTime property: The time at which the integration runtime was created, in ISO8601 format.
     *
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.createTime;
    }

    /**
     * Get the nodes property: The list of nodes for managed integration runtime.
     *
     * @return the nodes value.
     */
    public List<ManagedIntegrationRuntimeNode> nodes() {
        return this.nodes;
    }

    /**
     * Get the otherErrors property: The errors that occurred on this integration runtime.
     *
     * @return the otherErrors value.
     */
    public List<ManagedIntegrationRuntimeError> otherErrors() {
        return this.otherErrors;
    }

    /**
     * Get the lastOperation property: The last operation result that occurred on this integration runtime.
     *
     * @return the lastOperation value.
     */
    public ManagedIntegrationRuntimeOperationResult lastOperation() {
        return this.lastOperation;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (nodes() != null) {
            nodes().forEach(e -> e.validate());
        }
        if (otherErrors() != null) {
            otherErrors().forEach(e -> e.validate());
        }
        if (lastOperation() != null) {
            lastOperation().validate();
        }
    }
}
