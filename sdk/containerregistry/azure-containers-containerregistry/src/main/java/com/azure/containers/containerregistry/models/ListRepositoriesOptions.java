// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.annotation.Fluent;

/**
 * Additional parameters for list repositories operation.
 */
@Fluent
public final class ListRepositoriesOptions {
    private Integer maxPageSize;

    /**
     * Gets the maximum page size. It represents the number of threads being requested.
     *
     * @return The maximum page size.
     */
    public Integer getMaxPageSize() {
        return maxPageSize;
    }

    /**
     * Set the page size. It represents the number of threads being requested.
     *
     * @param maxPageSize The maximum page size.
     * @return The {@link ListRepositoriesOptions} object itself.
     */
    public ListRepositoriesOptions setMaxPageSize(Integer maxPageSize) {
        this.maxPageSize = maxPageSize;
        return this;
    }
}

