// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartnerTopicReadinessState. */
public final class PartnerTopicReadinessState extends ExpandableStringEnum<PartnerTopicReadinessState> {
    /** Static value NotActivatedByUserYet for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState NOT_ACTIVATED_BY_USER_YET = fromString("NotActivatedByUserYet");

    /** Static value ActivatedByUser for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState ACTIVATED_BY_USER = fromString("ActivatedByUser");

    /** Static value DeactivatedByUser for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState DEACTIVATED_BY_USER = fromString("DeactivatedByUser");

    /** Static value DeletedByUser for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState DELETED_BY_USER = fromString("DeletedByUser");

    /**
     * Creates or finds a PartnerTopicReadinessState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerTopicReadinessState.
     */
    @JsonCreator
    public static PartnerTopicReadinessState fromString(String name) {
        return fromString(name, PartnerTopicReadinessState.class);
    }

    /** @return known PartnerTopicReadinessState values. */
    public static Collection<PartnerTopicReadinessState> values() {
        return values(PartnerTopicReadinessState.class);
    }
}
