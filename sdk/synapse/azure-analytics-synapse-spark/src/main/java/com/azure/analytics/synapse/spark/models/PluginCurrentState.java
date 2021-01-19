// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PluginCurrentState. */
public final class PluginCurrentState extends ExpandableStringEnum<PluginCurrentState> {
    /** Static value Preparation for PluginCurrentState. */
    public static final PluginCurrentState PREPARATION = fromString("Preparation");

    /** Static value ResourceAcquisition for PluginCurrentState. */
    public static final PluginCurrentState RESOURCE_ACQUISITION = fromString("ResourceAcquisition");

    /** Static value Queued for PluginCurrentState. */
    public static final PluginCurrentState QUEUED = fromString("Queued");

    /** Static value Submission for PluginCurrentState. */
    public static final PluginCurrentState SUBMISSION = fromString("Submission");

    /** Static value Monitoring for PluginCurrentState. */
    public static final PluginCurrentState MONITORING = fromString("Monitoring");

    /** Static value Cleanup for PluginCurrentState. */
    public static final PluginCurrentState CLEANUP = fromString("Cleanup");

    /** Static value Ended for PluginCurrentState. */
    public static final PluginCurrentState ENDED = fromString("Ended");

    /**
     * Creates or finds a PluginCurrentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PluginCurrentState.
     */
    @JsonCreator
    public static PluginCurrentState fromString(String name) {
        return fromString(name, PluginCurrentState.class);
    }

    /** @return known PluginCurrentState values. */
    public static Collection<PluginCurrentState> values() {
        return values(PluginCurrentState.class);
    }
}
