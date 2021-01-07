// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphOnlineMeetingProviderType. */
public final class MicrosoftGraphOnlineMeetingProviderType
    extends ExpandableStringEnum<MicrosoftGraphOnlineMeetingProviderType> {
    /** Static value unknown for MicrosoftGraphOnlineMeetingProviderType. */
    public static final MicrosoftGraphOnlineMeetingProviderType UNKNOWN = fromString("unknown");

    /** Static value skypeForBusiness for MicrosoftGraphOnlineMeetingProviderType. */
    public static final MicrosoftGraphOnlineMeetingProviderType SKYPE_FOR_BUSINESS = fromString("skypeForBusiness");

    /** Static value skypeForConsumer for MicrosoftGraphOnlineMeetingProviderType. */
    public static final MicrosoftGraphOnlineMeetingProviderType SKYPE_FOR_CONSUMER = fromString("skypeForConsumer");

    /** Static value teamsForBusiness for MicrosoftGraphOnlineMeetingProviderType. */
    public static final MicrosoftGraphOnlineMeetingProviderType TEAMS_FOR_BUSINESS = fromString("teamsForBusiness");

    /**
     * Creates or finds a MicrosoftGraphOnlineMeetingProviderType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphOnlineMeetingProviderType.
     */
    @JsonCreator
    public static MicrosoftGraphOnlineMeetingProviderType fromString(String name) {
        return fromString(name, MicrosoftGraphOnlineMeetingProviderType.class);
    }

    /** @return known MicrosoftGraphOnlineMeetingProviderType values. */
    public static Collection<MicrosoftGraphOnlineMeetingProviderType> values() {
        return values(MicrosoftGraphOnlineMeetingProviderType.class);
    }
}
