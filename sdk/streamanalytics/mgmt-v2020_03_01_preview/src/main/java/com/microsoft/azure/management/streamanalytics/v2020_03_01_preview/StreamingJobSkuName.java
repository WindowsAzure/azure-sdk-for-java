/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StreamingJobSkuName.
 */
public final class StreamingJobSkuName extends ExpandableStringEnum<StreamingJobSkuName> {
    /** Static value Standard for StreamingJobSkuName. */
    public static final StreamingJobSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a StreamingJobSkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding StreamingJobSkuName
     */
    @JsonCreator
    public static StreamingJobSkuName fromString(String name) {
        return fromString(name, StreamingJobSkuName.class);
    }

    /**
     * @return known StreamingJobSkuName values
     */
    public static Collection<StreamingJobSkuName> values() {
        return values(StreamingJobSkuName.class);
    }
}
