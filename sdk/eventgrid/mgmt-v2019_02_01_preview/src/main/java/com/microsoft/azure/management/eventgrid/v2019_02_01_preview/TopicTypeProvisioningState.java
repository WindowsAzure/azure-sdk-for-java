/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TopicTypeProvisioningState.
 */
public final class TopicTypeProvisioningState extends ExpandableStringEnum<TopicTypeProvisioningState> {
    /** Static value Creating for TopicTypeProvisioningState. */
    public static final TopicTypeProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for TopicTypeProvisioningState. */
    public static final TopicTypeProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for TopicTypeProvisioningState. */
    public static final TopicTypeProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for TopicTypeProvisioningState. */
    public static final TopicTypeProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for TopicTypeProvisioningState. */
    public static final TopicTypeProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for TopicTypeProvisioningState. */
    public static final TopicTypeProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a TopicTypeProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding TopicTypeProvisioningState
     */
    @JsonCreator
    public static TopicTypeProvisioningState fromString(String name) {
        return fromString(name, TopicTypeProvisioningState.class);
    }

    /**
     * @return known TopicTypeProvisioningState values
     */
    public static Collection<TopicTypeProvisioningState> values() {
        return values(TopicTypeProvisioningState.class);
    }
}
