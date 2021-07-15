// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkloadNetworkPublicIpProvisioningState. */
public final class WorkloadNetworkPublicIpProvisioningState
    extends ExpandableStringEnum<WorkloadNetworkPublicIpProvisioningState> {
    /** Static value Succeeded for WorkloadNetworkPublicIpProvisioningState. */
    public static final WorkloadNetworkPublicIpProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for WorkloadNetworkPublicIpProvisioningState. */
    public static final WorkloadNetworkPublicIpProvisioningState FAILED = fromString("Failed");

    /** Static value Building for WorkloadNetworkPublicIpProvisioningState. */
    public static final WorkloadNetworkPublicIpProvisioningState BUILDING = fromString("Building");

    /** Static value Deleting for WorkloadNetworkPublicIpProvisioningState. */
    public static final WorkloadNetworkPublicIpProvisioningState DELETING = fromString("Deleting");

    /** Static value Updating for WorkloadNetworkPublicIpProvisioningState. */
    public static final WorkloadNetworkPublicIpProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a WorkloadNetworkPublicIpProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkloadNetworkPublicIpProvisioningState.
     */
    @JsonCreator
    public static WorkloadNetworkPublicIpProvisioningState fromString(String name) {
        return fromString(name, WorkloadNetworkPublicIpProvisioningState.class);
    }

    /** @return known WorkloadNetworkPublicIpProvisioningState values. */
    public static Collection<WorkloadNetworkPublicIpProvisioningState> values() {
        return values(WorkloadNetworkPublicIpProvisioningState.class);
    }
}
