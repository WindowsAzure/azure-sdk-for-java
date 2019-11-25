/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.CorsRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The properties of File services in storage account.
 */
@JsonFlatten
public class FileServicePropertiesInner extends ProxyResource {
    /**
     * Specifies CORS rules for the File service. You can include up to five
     * CorsRule elements in the request. If no CorsRule elements are included
     * in the request body, all CORS rules will be deleted, and CORS will be
     * disabled for the File service.
     */
    @JsonProperty(value = "properties.cors")
    private CorsRules cors;

    /**
     * Get specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     *
     * @return the cors value
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     *
     * @param cors the cors value to set
     * @return the FileServicePropertiesInner object itself.
     */
    public FileServicePropertiesInner withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

}
