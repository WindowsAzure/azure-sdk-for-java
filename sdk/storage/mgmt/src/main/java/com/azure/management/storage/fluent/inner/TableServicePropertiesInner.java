// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.models.CorsRules;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TableServiceProperties model. */
@JsonFlatten
@Fluent
public class TableServicePropertiesInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TableServicePropertiesInner.class);

    /*
     * Specifies CORS rules for the Table service. You can include up to five
     * CorsRule elements in the request. If no CorsRule elements are included
     * in the request body, all CORS rules will be deleted, and CORS will be
     * disabled for the Table service.
     */
    @JsonProperty(value = "properties.cors")
    private CorsRules cors;

    /**
     * Get the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     *
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     *
     * @param cors the cors value to set.
     * @return the TableServicePropertiesInner object itself.
     */
    public TableServicePropertiesInner withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cors() != null) {
            cors().validate();
        }
    }
}
