/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PartnerTopicTypeAuthorizationState.
 */
public final class PartnerTopicTypeAuthorizationState extends ExpandableStringEnum<PartnerTopicTypeAuthorizationState> {
    /** Static value NotApplicable for PartnerTopicTypeAuthorizationState. */
    public static final PartnerTopicTypeAuthorizationState NOT_APPLICABLE = fromString("NotApplicable");

    /** Static value NotAuthorized for PartnerTopicTypeAuthorizationState. */
    public static final PartnerTopicTypeAuthorizationState NOT_AUTHORIZED = fromString("NotAuthorized");

    /** Static value Authorized for PartnerTopicTypeAuthorizationState. */
    public static final PartnerTopicTypeAuthorizationState AUTHORIZED = fromString("Authorized");

    /**
     * Creates or finds a PartnerTopicTypeAuthorizationState from its string representation.
     * @param name a name to look for
     * @return the corresponding PartnerTopicTypeAuthorizationState
     */
    @JsonCreator
    public static PartnerTopicTypeAuthorizationState fromString(String name) {
        return fromString(name, PartnerTopicTypeAuthorizationState.class);
    }

    /**
     * @return known PartnerTopicTypeAuthorizationState values
     */
    public static Collection<PartnerTopicTypeAuthorizationState> values() {
        return values(PartnerTopicTypeAuthorizationState.class);
    }
}
