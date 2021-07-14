// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkedOperationRule model. */
@Fluent
public final class LinkedOperationRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedOperationRule.class);

    /*
     * The linkedOperation property.
     */
    @JsonProperty(value = "linkedOperation", required = true)
    private LinkedOperation linkedOperation;

    /*
     * The linkedAction property.
     */
    @JsonProperty(value = "linkedAction", required = true)
    private LinkedAction linkedAction;

    /**
     * Get the linkedOperation property: The linkedOperation property.
     *
     * @return the linkedOperation value.
     */
    public LinkedOperation linkedOperation() {
        return this.linkedOperation;
    }

    /**
     * Set the linkedOperation property: The linkedOperation property.
     *
     * @param linkedOperation the linkedOperation value to set.
     * @return the LinkedOperationRule object itself.
     */
    public LinkedOperationRule withLinkedOperation(LinkedOperation linkedOperation) {
        this.linkedOperation = linkedOperation;
        return this;
    }

    /**
     * Get the linkedAction property: The linkedAction property.
     *
     * @return the linkedAction value.
     */
    public LinkedAction linkedAction() {
        return this.linkedAction;
    }

    /**
     * Set the linkedAction property: The linkedAction property.
     *
     * @param linkedAction the linkedAction value to set.
     * @return the LinkedOperationRule object itself.
     */
    public LinkedOperationRule withLinkedAction(LinkedAction linkedAction) {
        this.linkedAction = linkedAction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedOperation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedOperation in model LinkedOperationRule"));
        }
        if (linkedAction() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedAction in model LinkedOperationRule"));
        }
    }
}
