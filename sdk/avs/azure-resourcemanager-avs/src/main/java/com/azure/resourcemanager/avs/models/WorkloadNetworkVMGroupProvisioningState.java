// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkloadNetworkVMGroupProvisioningState. */
public final class WorkloadNetworkVMGroupProvisioningState
    extends ExpandableStringEnum<WorkloadNetworkVMGroupProvisioningState> {
    /** Static value Succeeded for WorkloadNetworkVMGroupProvisioningState. */
    public static final WorkloadNetworkVMGroupProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for WorkloadNetworkVMGroupProvisioningState. */
    public static final WorkloadNetworkVMGroupProvisioningState FAILED = fromString("Failed");

    /** Static value Building for WorkloadNetworkVMGroupProvisioningState. */
    public static final WorkloadNetworkVMGroupProvisioningState BUILDING = fromString("Building");

    /** Static value Deleting for WorkloadNetworkVMGroupProvisioningState. */
    public static final WorkloadNetworkVMGroupProvisioningState DELETING = fromString("Deleting");

    /** Static value Updating for WorkloadNetworkVMGroupProvisioningState. */
    public static final WorkloadNetworkVMGroupProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a WorkloadNetworkVMGroupProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkloadNetworkVMGroupProvisioningState.
     */
    @JsonCreator
    public static WorkloadNetworkVMGroupProvisioningState fromString(String name) {
        return fromString(name, WorkloadNetworkVMGroupProvisioningState.class);
    }

    /** @return known WorkloadNetworkVMGroupProvisioningState values. */
    public static Collection<WorkloadNetworkVMGroupProvisioningState> values() {
        return values(WorkloadNetworkVMGroupProvisioningState.class);
    }
}
