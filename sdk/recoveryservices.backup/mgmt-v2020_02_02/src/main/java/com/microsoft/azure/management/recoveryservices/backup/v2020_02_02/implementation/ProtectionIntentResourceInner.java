/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Base class for backup ProtectionIntent.
 */
@SkipParentValidation
public class ProtectionIntentResourceInner extends Resource {
    /**
     * ProtectionIntentResource properties.
     */
    @JsonProperty(value = "properties")
    private ProtectionIntentInner properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get protectionIntentResource properties.
     *
     * @return the properties value
     */
    public ProtectionIntentInner properties() {
        return this.properties;
    }

    /**
     * Set protectionIntentResource properties.
     *
     * @param properties the properties value to set
     * @return the ProtectionIntentResourceInner object itself.
     */
    public ProtectionIntentResourceInner withProperties(ProtectionIntentInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the ProtectionIntentResourceInner object itself.
     */
    public ProtectionIntentResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
