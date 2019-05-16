/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01.implementation;

import com.microsoft.azure.management.eventhub.v2017_04_01.MessagingRegionsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Messaging Region.
 */
@SkipParentValidation
public class MessagingRegionsInner extends Resource {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private MessagingRegionsProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public MessagingRegionsProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the MessagingRegionsInner object itself.
     */
    public MessagingRegionsInner withProperties(MessagingRegionsProperties properties) {
        this.properties = properties;
        return this;
    }

}
