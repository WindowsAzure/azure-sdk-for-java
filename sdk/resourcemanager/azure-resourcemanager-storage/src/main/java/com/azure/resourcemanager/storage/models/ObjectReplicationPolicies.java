// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.fluent.inner.ObjectReplicationPolicyInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ObjectReplicationPolicies model. */
@Fluent
public final class ObjectReplicationPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectReplicationPolicies.class);

    /*
     * The replication policy between two storage accounts.
     */
    @JsonProperty(value = "value")
    private List<ObjectReplicationPolicyInner> value;

    /**
     * Get the value property: The replication policy between two storage accounts.
     *
     * @return the value value.
     */
    public List<ObjectReplicationPolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The replication policy between two storage accounts.
     *
     * @param value the value value to set.
     * @return the ObjectReplicationPolicies object itself.
     */
    public ObjectReplicationPolicies withValue(List<ObjectReplicationPolicyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
