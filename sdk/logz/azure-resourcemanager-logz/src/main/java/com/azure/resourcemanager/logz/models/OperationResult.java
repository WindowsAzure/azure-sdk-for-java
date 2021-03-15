// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.resourcemanager.logz.fluent.models.OperationResultInner;

/** An immutable client-side representation of OperationResult. */
public interface OperationResult {
    /**
     * Gets the name property: Operation name, i.e., {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the inner com.azure.resourcemanager.logz.fluent.models.OperationResultInner object.
     *
     * @return the inner object.
     */
    OperationResultInner innerModel();
}
