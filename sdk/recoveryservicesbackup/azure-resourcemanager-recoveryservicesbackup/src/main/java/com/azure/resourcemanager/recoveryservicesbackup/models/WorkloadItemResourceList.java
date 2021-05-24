// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadItemResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of WorkloadItem resources. */
@Fluent
public final class WorkloadItemResourceList extends ResourceList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkloadItemResourceList.class);

    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<WorkloadItemResourceInner> value;

    /**
     * Get the value property: List of resources.
     *
     * @return the value value.
     */
    public List<WorkloadItemResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     *
     * @param value the value value to set.
     * @return the WorkloadItemResourceList object itself.
     */
    public WorkloadItemResourceList withValue(List<WorkloadItemResourceInner> value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkloadItemResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
