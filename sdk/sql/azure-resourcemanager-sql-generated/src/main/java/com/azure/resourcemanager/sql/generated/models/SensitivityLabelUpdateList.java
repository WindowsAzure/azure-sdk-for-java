// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelUpdateInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of sensitivity label update operations. */
@Fluent
public final class SensitivityLabelUpdateList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SensitivityLabelUpdateList.class);

    /*
     * The operations property.
     */
    @JsonProperty(value = "operations")
    private List<SensitivityLabelUpdateInner> operations;

    /**
     * Get the operations property: The operations property.
     *
     * @return the operations value.
     */
    public List<SensitivityLabelUpdateInner> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The operations property.
     *
     * @param operations the operations value to set.
     * @return the SensitivityLabelUpdateList object itself.
     */
    public SensitivityLabelUpdateList withOperations(List<SensitivityLabelUpdateInner> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
    }
}
