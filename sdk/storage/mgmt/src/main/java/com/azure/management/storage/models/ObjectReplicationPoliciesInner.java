// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ObjectReplicationPolicies model. */
@Fluent
public final class ObjectReplicationPoliciesInner {
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
     * @return the ObjectReplicationPoliciesInner object itself.
     */
    public ObjectReplicationPoliciesInner withValue(List<ObjectReplicationPolicyInner> value) {
        this.value = value;
        return this;
    }
}
