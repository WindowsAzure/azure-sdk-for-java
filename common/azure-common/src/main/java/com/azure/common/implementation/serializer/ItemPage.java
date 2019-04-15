// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.implementation.serializer;

import com.azure.common.http.rest.Page;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

/**
 * Base class that is able to deserialize a Page JSON response. The JSON formats that it understands are:
 * {
 *      "nextLink": "",
 *      "value": [{ serialized(T) }, ... ]
 * }
 * or
 * {
 *      "nextPageLink": "",
 *      "items": [{ serialized(T) }, ... ]
 * }
 * or any other cases where the property names of that type are swapped
 * @param <T>
 */
class ItemPage<T> implements Page<T> {
    @JsonAlias({"items", "value"})
    private List<T> items;

    @JsonAlias({"nextLink", "nextPageLink"})
    private String nextLink;

    @Override
    public List<T> items() {
        return items;
    }

    @Override
    public String nextLink() {
        return nextLink;
    }
}
