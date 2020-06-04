// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an item-level warning.
 */
@Fluent
public final class SearchIndexerWarning {
    /*
     * The key of the item which generated a warning.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /*
     * The message describing the warning that occurred while processing the
     * item.
     */
    @JsonProperty(value = "message", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The name of the source at which the warning originated. For example,
     * this could refer to a particular skill in the attached skillset. This
     * may not be always available.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Additional, verbose details about the warning to assist in debugging the
     * indexer. This may not be always available.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /*
     * A link to a troubleshooting guide for these classes of warnings. This
     * may not be always available.
     */
    @JsonProperty(value = "documentationLink", access = JsonProperty.Access.WRITE_ONLY)
    private String documentationLink;

    /**
     * Get the key property: The key of the item which generated a warning.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Get the message property: The message describing the warning that
     * occurred while processing the item.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the name property: The name of the source at which the warning
     * originated. For example, this could refer to a particular skill in the
     * attached skillset. This may not be always available.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the details property: Additional, verbose details about the warning
     * to assist in debugging the indexer. This may not be always available.
     *
     * @return the details value.
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Get the documentationLink property: A link to a troubleshooting guide
     * for these classes of warnings. This may not be always available.
     *
     * @return the documentationLink value.
     */
    public String getDocumentationLink() {
        return this.documentationLink;
    }
}
