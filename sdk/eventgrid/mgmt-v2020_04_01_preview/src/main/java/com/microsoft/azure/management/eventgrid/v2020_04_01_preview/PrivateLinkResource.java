/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.EventGridManager;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.PrivateLinkResourceInner;
import java.util.List;

/**
 * Type representing PrivateLinkResource.
 */
public interface PrivateLinkResource extends HasInner<PrivateLinkResourceInner>, HasManager<EventGridManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the groupId value.
     */
    String groupId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the requiredMembers value.
     */
    List<String> requiredMembers();

    /**
     * @return the requiredZoneNames value.
     */
    List<String> requiredZoneNames();

    /**
     * @return the type value.
     */
    String type();

}
