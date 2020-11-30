// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ParquetCompressionCodec. */
public final class ParquetCompressionCodec extends ExpandableStringEnum<ParquetCompressionCodec> {
    /** Static value none for ParquetCompressionCodec. */
    public static final ParquetCompressionCodec NONE = fromString("none");

    /** Static value gzip for ParquetCompressionCodec. */
    public static final ParquetCompressionCodec GZIP = fromString("gzip");

    /** Static value snappy for ParquetCompressionCodec. */
    public static final ParquetCompressionCodec SNAPPY = fromString("snappy");

    /** Static value lzo for ParquetCompressionCodec. */
    public static final ParquetCompressionCodec LZO = fromString("lzo");

    /**
     * Creates or finds a ParquetCompressionCodec from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ParquetCompressionCodec.
     */
    @JsonCreator
    public static ParquetCompressionCodec fromString(String name) {
        return fromString(name, ParquetCompressionCodec.class);
    }

    /** @return known ParquetCompressionCodec values. */
    public static Collection<ParquetCompressionCodec> values() {
        return values(ParquetCompressionCodec.class);
    }
}
