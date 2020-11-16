/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OnboardingStatus.
 */
public final class OnboardingStatus extends ExpandableStringEnum<OnboardingStatus> {
    /** Static value onboarded for OnboardingStatus. */
    public static final OnboardingStatus ONBOARDED = fromString("onboarded");

    /** Static value notOnboarded for OnboardingStatus. */
    public static final OnboardingStatus NOT_ONBOARDED = fromString("notOnboarded");

    /** Static value unknown for OnboardingStatus. */
    public static final OnboardingStatus UNKNOWN = fromString("unknown");

    /**
     * Creates or finds a OnboardingStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding OnboardingStatus
     */
    @JsonCreator
    public static OnboardingStatus fromString(String name) {
        return fromString(name, OnboardingStatus.class);
    }

    /**
     * @return known OnboardingStatus values
     */
    public static Collection<OnboardingStatus> values() {
        return values(OnboardingStatus.class);
    }
}
