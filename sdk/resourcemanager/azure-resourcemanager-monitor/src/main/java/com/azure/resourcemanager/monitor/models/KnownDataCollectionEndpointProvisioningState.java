// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KnownDataCollectionEndpointProvisioningState. */
public final class KnownDataCollectionEndpointProvisioningState
    extends ExpandableStringEnum<KnownDataCollectionEndpointProvisioningState> {
    /** Static value Creating for KnownDataCollectionEndpointProvisioningState. */
    public static final KnownDataCollectionEndpointProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for KnownDataCollectionEndpointProvisioningState. */
    public static final KnownDataCollectionEndpointProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for KnownDataCollectionEndpointProvisioningState. */
    public static final KnownDataCollectionEndpointProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for KnownDataCollectionEndpointProvisioningState. */
    public static final KnownDataCollectionEndpointProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for KnownDataCollectionEndpointProvisioningState. */
    public static final KnownDataCollectionEndpointProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a KnownDataCollectionEndpointProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownDataCollectionEndpointProvisioningState.
     */
    @JsonCreator
    public static KnownDataCollectionEndpointProvisioningState fromString(String name) {
        return fromString(name, KnownDataCollectionEndpointProvisioningState.class);
    }

    /** @return known KnownDataCollectionEndpointProvisioningState values. */
    public static Collection<KnownDataCollectionEndpointProvisioningState> values() {
        return values(KnownDataCollectionEndpointProvisioningState.class);
    }
}
