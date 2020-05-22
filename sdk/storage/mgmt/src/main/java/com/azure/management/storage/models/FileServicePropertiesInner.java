// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.CorsRules;
import com.azure.management.storage.DeleteRetentionPolicy;
import com.azure.management.storage.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FileServiceProperties model. */
@JsonFlatten
@Fluent
public class FileServicePropertiesInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileServicePropertiesInner.class);

    /*
     * Sku name and tier.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Specifies CORS rules for the File service. You can include up to five
     * CorsRule elements in the request. If no CorsRule elements are included
     * in the request body, all CORS rules will be deleted, and CORS will be
     * disabled for the File service.
     */
    @JsonProperty(value = "properties.cors")
    private CorsRules cors;

    /*
     * The file service properties for share soft delete.
     */
    @JsonProperty(value = "properties.shareDeleteRetentionPolicy")
    private DeleteRetentionPolicy shareDeleteRetentionPolicy;

    /**
     * Get the sku property: Sku name and tier.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the File service.
     *
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the File service.
     *
     * @param cors the cors value to set.
     * @return the FileServicePropertiesInner object itself.
     */
    public FileServicePropertiesInner withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     *
     * @return the shareDeleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy shareDeleteRetentionPolicy() {
        return this.shareDeleteRetentionPolicy;
    }

    /**
     * Set the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     *
     * @param shareDeleteRetentionPolicy the shareDeleteRetentionPolicy value to set.
     * @return the FileServicePropertiesInner object itself.
     */
    public FileServicePropertiesInner withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (cors() != null) {
            cors().validate();
        }
        if (shareDeleteRetentionPolicy() != null) {
            shareDeleteRetentionPolicy().validate();
        }
    }
}
