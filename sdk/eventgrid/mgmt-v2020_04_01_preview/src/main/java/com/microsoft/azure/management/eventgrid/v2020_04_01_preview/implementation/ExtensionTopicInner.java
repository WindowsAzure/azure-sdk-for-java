/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Event grid Extension Topic. This is used for getting Event Grid related
 * metrics for Azure resources.
 */
@JsonFlatten
public class ExtensionTopicInner extends ProxyResource {
    /**
     * Description of the extension topic.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * System topic resource id which is mapped to the source.
     */
    @JsonProperty(value = "properties.systemTopic")
    private String systemTopic;

    /**
     * Get description of the extension topic.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the extension topic.
     *
     * @param description the description value to set
     * @return the ExtensionTopicInner object itself.
     */
    public ExtensionTopicInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get system topic resource id which is mapped to the source.
     *
     * @return the systemTopic value
     */
    public String systemTopic() {
        return this.systemTopic;
    }

    /**
     * Set system topic resource id which is mapped to the source.
     *
     * @param systemTopic the systemTopic value to set
     * @return the ExtensionTopicInner object itself.
     */
    public ExtensionTopicInner withSystemTopic(String systemTopic) {
        this.systemTopic = systemTopic;
        return this;
    }

}
