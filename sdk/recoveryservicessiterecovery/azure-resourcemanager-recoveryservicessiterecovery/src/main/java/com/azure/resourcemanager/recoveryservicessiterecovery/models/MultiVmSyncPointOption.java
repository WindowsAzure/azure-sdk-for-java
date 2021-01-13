// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MultiVmSyncPointOption. */
public final class MultiVmSyncPointOption extends ExpandableStringEnum<MultiVmSyncPointOption> {
    /** Static value UseMultiVmSyncRecoveryPoint for MultiVmSyncPointOption. */
    public static final MultiVmSyncPointOption USE_MULTI_VM_SYNC_RECOVERY_POINT =
        fromString("UseMultiVmSyncRecoveryPoint");

    /** Static value UsePerVmRecoveryPoint for MultiVmSyncPointOption. */
    public static final MultiVmSyncPointOption USE_PER_VM_RECOVERY_POINT = fromString("UsePerVmRecoveryPoint");

    /**
     * Creates or finds a MultiVmSyncPointOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MultiVmSyncPointOption.
     */
    @JsonCreator
    public static MultiVmSyncPointOption fromString(String name) {
        return fromString(name, MultiVmSyncPointOption.class);
    }

    /** @return known MultiVmSyncPointOption values. */
    public static Collection<MultiVmSyncPointOption> values() {
        return values(MultiVmSyncPointOption.class);
    }
}
