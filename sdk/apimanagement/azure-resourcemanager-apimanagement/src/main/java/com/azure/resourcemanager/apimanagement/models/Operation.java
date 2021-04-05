// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The object that describes the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: The operation origin.
     *
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the properties property: The operation properties.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}
