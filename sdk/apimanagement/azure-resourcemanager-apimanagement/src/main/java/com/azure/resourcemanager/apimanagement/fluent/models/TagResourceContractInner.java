// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.ApiTagResourceContractProperties;
import com.azure.resourcemanager.apimanagement.models.OperationTagResourceContractProperties;
import com.azure.resourcemanager.apimanagement.models.ProductTagResourceContractProperties;
import com.azure.resourcemanager.apimanagement.models.TagResourceContractProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TagResource contract properties. */
@Fluent
public final class TagResourceContractInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagResourceContractInner.class);

    /*
     * Tag associated with the resource.
     */
    @JsonProperty(value = "tag", required = true)
    private TagResourceContractProperties tag;

    /*
     * Api associated with the tag.
     */
    @JsonProperty(value = "api")
    private ApiTagResourceContractProperties api;

    /*
     * Operation associated with the tag.
     */
    @JsonProperty(value = "operation")
    private OperationTagResourceContractProperties operation;

    /*
     * Product associated with the tag.
     */
    @JsonProperty(value = "product")
    private ProductTagResourceContractProperties product;

    /**
     * Get the tag property: Tag associated with the resource.
     *
     * @return the tag value.
     */
    public TagResourceContractProperties tag() {
        return this.tag;
    }

    /**
     * Set the tag property: Tag associated with the resource.
     *
     * @param tag the tag value to set.
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withTag(TagResourceContractProperties tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the api property: Api associated with the tag.
     *
     * @return the api value.
     */
    public ApiTagResourceContractProperties api() {
        return this.api;
    }

    /**
     * Set the api property: Api associated with the tag.
     *
     * @param api the api value to set.
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withApi(ApiTagResourceContractProperties api) {
        this.api = api;
        return this;
    }

    /**
     * Get the operation property: Operation associated with the tag.
     *
     * @return the operation value.
     */
    public OperationTagResourceContractProperties operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation associated with the tag.
     *
     * @param operation the operation value to set.
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withOperation(OperationTagResourceContractProperties operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the product property: Product associated with the tag.
     *
     * @return the product value.
     */
    public ProductTagResourceContractProperties product() {
        return this.product;
    }

    /**
     * Set the product property: Product associated with the tag.
     *
     * @param product the product value to set.
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withProduct(ProductTagResourceContractProperties product) {
        this.product = product;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tag() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tag in model TagResourceContractInner"));
        } else {
            tag().validate();
        }
        if (api() != null) {
            api().validate();
        }
        if (operation() != null) {
            operation().validate();
        }
        if (product() != null) {
            product().validate();
        }
    }
}
