// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;

/** An immutable client-side representation of TagResourceContract. */
public interface TagResourceContract {
    /**
     * Gets the tag property: Tag associated with the resource.
     *
     * @return the tag value.
     */
    TagResourceContractProperties tag();

    /**
     * Gets the api property: Api associated with the tag.
     *
     * @return the api value.
     */
    ApiTagResourceContractProperties api();

    /**
     * Gets the operation property: Operation associated with the tag.
     *
     * @return the operation value.
     */
    OperationTagResourceContractProperties operation();

    /**
     * Gets the product property: Product associated with the tag.
     *
     * @return the product value.
     */
    ProductTagResourceContractProperties product();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner object.
     *
     * @return the inner object.
     */
    TagResourceContractInner innerModel();
}
