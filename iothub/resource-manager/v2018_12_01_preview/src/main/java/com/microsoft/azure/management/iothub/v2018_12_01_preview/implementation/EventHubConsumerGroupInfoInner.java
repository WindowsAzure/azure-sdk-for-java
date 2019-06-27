/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * The properties of the EventHubConsumerGroupInfo object.
 */
public class EventHubConsumerGroupInfoInner extends ProxyResource {
    /**
     * The tags.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /**
     * The etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the tags.
     *
     * @return the properties value
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the tags.
     *
     * @param properties the properties value to set
     * @return the EventHubConsumerGroupInfoInner object itself.
     */
    public EventHubConsumerGroupInfoInner withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
