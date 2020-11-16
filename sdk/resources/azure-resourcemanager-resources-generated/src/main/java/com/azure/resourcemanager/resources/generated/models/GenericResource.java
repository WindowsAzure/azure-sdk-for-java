// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.resourcemanager.resources.generated.fluent.models.GenericResourceInner;
import java.util.Map;

/** An immutable client-side representation of GenericResource. */
public interface GenericResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the plan property: The plan of the resource.
     *
     * @return the plan value.
     */
    Plan plan();

    /**
     * Gets the properties property: The resource properties.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the managedBy property: ID of the resource that manages this resource.
     *
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * Gets the sku property: The SKU of the resource.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the inner com.azure.resourcemanager.resources.generated.fluent.models.GenericResourceInner object.
     *
     * @return the inner object.
     */
    GenericResourceInner innerModel();
}
