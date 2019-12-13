// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.rest;

import com.azure.core.util.paging.ContinuablePage;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a paginated REST response from the service.
 *
 * @param <T> Type of items in the page response.
 */
public interface Page<T> extends ContinuablePage<String, T> {
    /**
     * @return list of elements in the page.
     *
     * @deprecated use {@link this#getElements()}.
     */
    @Deprecated
    default List<T> getItems() {
        return this.getElements().stream().collect(Collectors.toList());
    }
}
