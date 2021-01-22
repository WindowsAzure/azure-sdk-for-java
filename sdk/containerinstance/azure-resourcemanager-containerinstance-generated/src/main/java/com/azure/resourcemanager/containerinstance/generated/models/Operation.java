// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.resourcemanager.containerinstance.generated.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: The name of the operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The display information of the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the properties property: The additional properties.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the origin property: The intended executor of the operation.
     *
     * @return the origin value.
     */
    ContainerInstanceOperationsOrigin origin();

    /**
     * Gets the inner com.azure.resourcemanager.containerinstance.generated.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}
