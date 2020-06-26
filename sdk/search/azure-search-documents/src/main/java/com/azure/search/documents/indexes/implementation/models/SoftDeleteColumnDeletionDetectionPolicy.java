// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The SoftDeleteColumnDeletionDetectionPolicy model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy")
@JsonFlatten
@Fluent
public class SoftDeleteColumnDeletionDetectionPolicy extends DataDeletionDetectionPolicy {
    /*
     * The name of the column to use for soft-deletion detection.
     */
    @JsonProperty(value = "softDeleteColumnName")
    private String softDeleteColumnName;

    /*
     * The marker value that identifies an item as deleted.
     */
    @JsonProperty(value = "softDeleteMarkerValue")
    private String softDeleteMarkerValue;

    /**
     * Get the softDeleteColumnName property: The name of the column to use for soft-deletion detection.
     *
     * @return the softDeleteColumnName value.
     */
    public String getSoftDeleteColumnName() {
        return this.softDeleteColumnName;
    }

    /**
     * Set the softDeleteColumnName property: The name of the column to use for soft-deletion detection.
     *
     * @param softDeleteColumnName the softDeleteColumnName value to set.
     * @return the SoftDeleteColumnDeletionDetectionPolicy object itself.
     */
    public SoftDeleteColumnDeletionDetectionPolicy setSoftDeleteColumnName(String softDeleteColumnName) {
        this.softDeleteColumnName = softDeleteColumnName;
        return this;
    }

    /**
     * Get the softDeleteMarkerValue property: The marker value that identifies an item as deleted.
     *
     * @return the softDeleteMarkerValue value.
     */
    public String getSoftDeleteMarkerValue() {
        return this.softDeleteMarkerValue;
    }

    /**
     * Set the softDeleteMarkerValue property: The marker value that identifies an item as deleted.
     *
     * @param softDeleteMarkerValue the softDeleteMarkerValue value to set.
     * @return the SoftDeleteColumnDeletionDetectionPolicy object itself.
     */
    public SoftDeleteColumnDeletionDetectionPolicy setSoftDeleteMarkerValue(String softDeleteMarkerValue) {
        this.softDeleteMarkerValue = softDeleteMarkerValue;
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
    }
}
