/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InsightsType.
 */
public final class InsightsType extends ExpandableStringEnum<InsightsType> {
    /** Static value AudioInsightsOnly for InsightsType. */
    public static final InsightsType AUDIO_INSIGHTS_ONLY = fromString("AudioInsightsOnly");

    /** Static value VideoInsightsOnly for InsightsType. */
    public static final InsightsType VIDEO_INSIGHTS_ONLY = fromString("VideoInsightsOnly");

    /** Static value AllInsights for InsightsType. */
    public static final InsightsType ALL_INSIGHTS = fromString("AllInsights");

    /**
     * Creates or finds a InsightsType from its string representation.
     * @param name a name to look for
     * @return the corresponding InsightsType
     */
    @JsonCreator
    public static InsightsType fromString(String name) {
        return fromString(name, InsightsType.class);
    }

    /**
     * @return known InsightsType values
     */
    public static Collection<InsightsType> values() {
        return values(InsightsType.class);
    }
}
