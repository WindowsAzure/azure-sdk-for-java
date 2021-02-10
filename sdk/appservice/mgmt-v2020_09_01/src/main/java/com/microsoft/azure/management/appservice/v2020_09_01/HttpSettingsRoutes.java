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
 * The HttpSettingsRoutes model.
 */
@JsonFlatten
public class HttpSettingsRoutes extends ProxyOnlyResource {
    /**
     * The apiPrefix property.
     */
    @JsonProperty(value = "properties.apiPrefix")
    private String apiPrefix;

    /**
     * Get the apiPrefix value.
     *
     * @return the apiPrefix value
     */
    public String apiPrefix() {
        return this.apiPrefix;
    }

    /**
     * Set the apiPrefix value.
     *
     * @param apiPrefix the apiPrefix value to set
     * @return the HttpSettingsRoutes object itself.
     */
    public HttpSettingsRoutes withApiPrefix(String apiPrefix) {
        this.apiPrefix = apiPrefix;
        return this;
    }

}
