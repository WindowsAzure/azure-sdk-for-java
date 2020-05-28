// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Converts alphabetic, numeric, and symbolic Unicode characters which are not
 * in the first 127 ASCII characters (the "Basic Latin" Unicode block) into
 * their ASCII equivalents, if such equivalents exist. This token filter is
 * implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.AsciiFoldingTokenFilter")
@Fluent
public final class AsciiFoldingTokenFilter extends TokenFilter {
    /*
     * A value indicating whether the original token will be kept. Default is
     * false.
     */
    @JsonProperty(value = "preserveOriginal")
    private Boolean preserveOriginal;

    /**
     * Get the preserveOriginal property: A value indicating whether the
     * original token will be kept. Default is false.
     *
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether the
     * original token will be kept. Default is false.
     *
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the AsciiFoldingTokenFilter object itself.
     */
    public AsciiFoldingTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }
}
