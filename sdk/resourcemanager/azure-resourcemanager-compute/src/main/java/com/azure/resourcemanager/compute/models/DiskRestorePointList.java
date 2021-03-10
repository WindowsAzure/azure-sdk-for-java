// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.DiskRestorePointInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Disk Restore Points operation response. */
@Fluent
public final class DiskRestorePointList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskRestorePointList.class);

    /*
     * A list of disk restore points.
     */
    @JsonProperty(value = "value", required = true)
    private List<DiskRestorePointInner> value;

    /*
     * The uri to fetch the next page of disk restore points. Call ListNext()
     * with this to fetch the next page of disk restore points.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of disk restore points.
     *
     * @return the value value.
     */
    public List<DiskRestorePointInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of disk restore points.
     *
     * @param value the value value to set.
     * @return the DiskRestorePointList object itself.
     */
    public DiskRestorePointList withValue(List<DiskRestorePointInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of disk restore points. Call ListNext() with this to
     * fetch the next page of disk restore points.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of disk restore points. Call ListNext() with this to
     * fetch the next page of disk restore points.
     *
     * @param nextLink the nextLink value to set.
     * @return the DiskRestorePointList object itself.
     */
    public DiskRestorePointList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model DiskRestorePointList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
