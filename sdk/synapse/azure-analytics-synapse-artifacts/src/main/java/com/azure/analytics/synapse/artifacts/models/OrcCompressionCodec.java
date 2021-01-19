// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrcCompressionCodec. */
public final class OrcCompressionCodec extends ExpandableStringEnum<OrcCompressionCodec> {
    /** Static value none for OrcCompressionCodec. */
    public static final OrcCompressionCodec NONE = fromString("none");

    /** Static value zlib for OrcCompressionCodec. */
    public static final OrcCompressionCodec ZLIB = fromString("zlib");

    /** Static value snappy for OrcCompressionCodec. */
    public static final OrcCompressionCodec SNAPPY = fromString("snappy");

    /**
     * Creates or finds a OrcCompressionCodec from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrcCompressionCodec.
     */
    @JsonCreator
    public static OrcCompressionCodec fromString(String name) {
        return fromString(name, OrcCompressionCodec.class);
    }

    /** @return known OrcCompressionCodec values. */
    public static Collection<OrcCompressionCodec> values() {
        return values(OrcCompressionCodec.class);
    }
}
