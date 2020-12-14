// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.models;

import com.azure.resourcemanager.portal.fluent.models.ResourceProviderOperationInner;

/** An immutable client-side representation of ResourceProviderOperation. */
public interface ResourceProviderOperation {
    /**
     * Gets the name property: Operation name, in format of {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    String isDataAction();

    /**
     * Gets the display property: Display metadata associated with the operation.
     *
     * @return the display value.
     */
    ResourceProviderOperationDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.portal.fluent.models.ResourceProviderOperationInner object.
     *
     * @return the inner object.
     */
    ResourceProviderOperationInner innerModel();
}
