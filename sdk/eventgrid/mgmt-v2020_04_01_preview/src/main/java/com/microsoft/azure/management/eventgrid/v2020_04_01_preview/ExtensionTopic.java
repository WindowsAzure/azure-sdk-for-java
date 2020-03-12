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
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.ExtensionTopicInner;

/**
 * Type representing ExtensionTopic.
 */
public interface ExtensionTopic extends HasInner<ExtensionTopicInner>, HasManager<EventGridManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the systemTopic value.
     */
    String systemTopic();

    /**
     * @return the type value.
     */
    String type();

}
