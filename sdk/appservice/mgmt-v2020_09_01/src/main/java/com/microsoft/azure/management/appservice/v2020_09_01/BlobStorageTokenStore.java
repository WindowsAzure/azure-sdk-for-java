/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The BlobStorageTokenStore model.
 */
@JsonFlatten
public class BlobStorageTokenStore extends ProxyOnlyResource {
    /**
     * The sasUrlSettingName property.
     */
    @JsonProperty(value = "properties.sasUrlSettingName")
    private String sasUrlSettingName;

    /**
     * Get the sasUrlSettingName value.
     *
     * @return the sasUrlSettingName value
     */
    public String sasUrlSettingName() {
        return this.sasUrlSettingName;
    }

    /**
     * Set the sasUrlSettingName value.
     *
     * @param sasUrlSettingName the sasUrlSettingName value to set
     * @return the BlobStorageTokenStore object itself.
     */
    public BlobStorageTokenStore withSasUrlSettingName(String sasUrlSettingName) {
        this.sasUrlSettingName = sasUrlSettingName;
        return this;
    }

}
