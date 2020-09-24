// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WarningCodeValue. */
public final class WarningCodeValue extends ExpandableStringEnum<WarningCodeValue> {
    /** Static value LongWordsInDocument for WarningCodeValue. */
    public static final WarningCodeValue LONG_WORDS_IN_DOCUMENT = fromString("LongWordsInDocument");

    /** Static value DocumentTruncated for WarningCodeValue. */
    public static final WarningCodeValue DOCUMENT_TRUNCATED = fromString("DocumentTruncated");

    /**
     * Creates or finds a WarningCodeValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WarningCodeValue.
     */
    @JsonCreator
    public static WarningCodeValue fromString(String name) {
        return fromString(name, WarningCodeValue.class);
    }

    /** @return known WarningCodeValue values. */
    public static Collection<WarningCodeValue> values() {
        return values(WarningCodeValue.class);
    }
}
