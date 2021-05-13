// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.models;

import com.azure.resourcemanager.operationsmanagement.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Display metadata associated with the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.operationsmanagement.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}
