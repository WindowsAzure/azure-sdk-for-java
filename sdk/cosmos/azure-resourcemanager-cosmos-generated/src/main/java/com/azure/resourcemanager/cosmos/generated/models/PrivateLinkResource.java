// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.resourcemanager.cosmos.generated.fluent.models.PrivateLinkResourceInner;
import java.util.List;

/** An immutable client-side representation of PrivateLinkResource. */
public interface PrivateLinkResource {
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
     * Gets the groupId property: The private link resource group id.
     *
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the requiredMembers property: The private link resource required member names.
     *
     * @return the requiredMembers value.
     */
    List<String> requiredMembers();

    /**
     * Gets the requiredZoneNames property: The private link resource required zone names.
     *
     * @return the requiredZoneNames value.
     */
    List<String> requiredZoneNames();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.PrivateLinkResourceInner object.
     *
     * @return the inner object.
     */
    PrivateLinkResourceInner innerModel();
}
