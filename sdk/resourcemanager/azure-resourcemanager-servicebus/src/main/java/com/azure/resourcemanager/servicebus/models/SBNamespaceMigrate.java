// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Namespace Migrate Object. */
@Fluent
public final class SBNamespaceMigrate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SBNamespaceMigrate.class);

    /*
     * Type of namespaces
     */
    @JsonProperty(value = "targetNamespaceType", required = true)
    private NameSpaceType targetNamespaceType;

    /**
     * Get the targetNamespaceType property: Type of namespaces.
     *
     * @return the targetNamespaceType value.
     */
    public NameSpaceType targetNamespaceType() {
        return this.targetNamespaceType;
    }

    /**
     * Set the targetNamespaceType property: Type of namespaces.
     *
     * @param targetNamespaceType the targetNamespaceType value to set.
     * @return the SBNamespaceMigrate object itself.
     */
    public SBNamespaceMigrate withTargetNamespaceType(NameSpaceType targetNamespaceType) {
        this.targetNamespaceType = targetNamespaceType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetNamespaceType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetNamespaceType in model SBNamespaceMigrate"));
        }
    }
}
