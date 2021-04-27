// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.resourcemanager.servicefabric.fluent.models.OperationResultInner;

/** An immutable client-side representation of OperationResult. */
public interface OperationResult {
    /**
     * Gets the name property: The name of the operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    AvailableOperationDisplay display();

    /**
     * Gets the origin property: Origin result.
     *
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.servicefabric.fluent.models.OperationResultInner object.
     *
     * @return the inner object.
     */
    OperationResultInner innerModel();
}
