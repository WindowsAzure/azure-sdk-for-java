// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobIndexerParsingMode. */
public final class BlobIndexerParsingMode extends ExpandableStringEnum<BlobIndexerParsingMode> {
    /** Static value default for BlobIndexerParsingMode. */
    public static final BlobIndexerParsingMode DEFAULT = fromString("default");

    /** Static value text for BlobIndexerParsingMode. */
    public static final BlobIndexerParsingMode TEXT = fromString("text");

    /** Static value delimitedText for BlobIndexerParsingMode. */
    public static final BlobIndexerParsingMode DELIMITED_TEXT = fromString("delimitedText");

    /** Static value json for BlobIndexerParsingMode. */
    public static final BlobIndexerParsingMode JSON = fromString("json");

    /** Static value jsonArray for BlobIndexerParsingMode. */
    public static final BlobIndexerParsingMode JSON_ARRAY = fromString("jsonArray");

    /** Static value jsonLines for BlobIndexerParsingMode. */
    public static final BlobIndexerParsingMode JSON_LINES = fromString("jsonLines");

    /**
     * Creates or finds a BlobIndexerParsingMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobIndexerParsingMode.
     */
    @JsonCreator
    public static BlobIndexerParsingMode fromString(String name) {
        return fromString(name, BlobIndexerParsingMode.class);
    }

    /** @return known BlobIndexerParsingMode values. */
    public static Collection<BlobIndexerParsingMode> values() {
        return values(BlobIndexerParsingMode.class);
    }
}
