/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SparkThriftTransportProtocol.
 */
public final class SparkThriftTransportProtocol extends ExpandableStringEnum<SparkThriftTransportProtocol> {
    /** Static value Binary for SparkThriftTransportProtocol. */
    public static final SparkThriftTransportProtocol BINARY = fromString("Binary");

    /** Static value SASL for SparkThriftTransportProtocol. */
    public static final SparkThriftTransportProtocol SASL = fromString("SASL");

    /** Static value HTTP  for SparkThriftTransportProtocol. */
    public static final SparkThriftTransportProtocol HTTP_ = fromString("HTTP ");

    /**
     * Creates or finds a SparkThriftTransportProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding SparkThriftTransportProtocol
     */
    @JsonCreator
    public static SparkThriftTransportProtocol fromString(String name) {
        return fromString(name, SparkThriftTransportProtocol.class);
    }

    /**
     * @return known SparkThriftTransportProtocol values
     */
    public static Collection<SparkThriftTransportProtocol> values() {
        return values(SparkThriftTransportProtocol.class);
    }
}
