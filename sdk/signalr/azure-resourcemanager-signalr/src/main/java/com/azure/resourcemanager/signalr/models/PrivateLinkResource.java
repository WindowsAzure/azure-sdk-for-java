// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceInner;
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
     * Gets the groupId property: Group Id of the private link resource.
     *
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the requiredMembers property: Required members of the private link resource.
     *
     * @return the requiredMembers value.
     */
    List<String> requiredMembers();

    /**
     * Gets the requiredZoneNames property: Required private DNS zone names.
     *
     * @return the requiredZoneNames value.
     */
    List<String> requiredZoneNames();

    /**
     * Gets the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     *
     * @return the shareablePrivateLinkResourceTypes value.
     */
    List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes();

    /**
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceInner object.
     *
     * @return the inner object.
     */
    PrivateLinkResourceInner innerModel();
}
