// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphTeamsAppDistributionMethod. */
public final class MicrosoftGraphTeamsAppDistributionMethod
    extends ExpandableStringEnum<MicrosoftGraphTeamsAppDistributionMethod> {
    /** Static value store for MicrosoftGraphTeamsAppDistributionMethod. */
    public static final MicrosoftGraphTeamsAppDistributionMethod STORE = fromString("store");

    /** Static value organization for MicrosoftGraphTeamsAppDistributionMethod. */
    public static final MicrosoftGraphTeamsAppDistributionMethod ORGANIZATION = fromString("organization");

    /** Static value sideloaded for MicrosoftGraphTeamsAppDistributionMethod. */
    public static final MicrosoftGraphTeamsAppDistributionMethod SIDELOADED = fromString("sideloaded");

    /** Static value unknownFutureValue for MicrosoftGraphTeamsAppDistributionMethod. */
    public static final MicrosoftGraphTeamsAppDistributionMethod UNKNOWN_FUTURE_VALUE =
        fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphTeamsAppDistributionMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphTeamsAppDistributionMethod.
     */
    @JsonCreator
    public static MicrosoftGraphTeamsAppDistributionMethod fromString(String name) {
        return fromString(name, MicrosoftGraphTeamsAppDistributionMethod.class);
    }

    /** @return known MicrosoftGraphTeamsAppDistributionMethod values. */
    public static Collection<MicrosoftGraphTeamsAppDistributionMethod> values() {
        return values(MicrosoftGraphTeamsAppDistributionMethod.class);
    }
}
