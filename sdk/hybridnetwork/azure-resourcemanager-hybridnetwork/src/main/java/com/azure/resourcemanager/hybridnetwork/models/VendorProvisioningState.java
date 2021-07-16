// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VendorProvisioningState. */
public final class VendorProvisioningState extends ExpandableStringEnum<VendorProvisioningState> {
    /** Static value Unknown for VendorProvisioningState. */
    public static final VendorProvisioningState UNKNOWN = fromString("Unknown");

    /** Static value NotProvisioned for VendorProvisioningState. */
    public static final VendorProvisioningState NOT_PROVISIONED = fromString("NotProvisioned");

    /** Static value Provisioning for VendorProvisioningState. */
    public static final VendorProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Provisioned for VendorProvisioningState. */
    public static final VendorProvisioningState PROVISIONED = fromString("Provisioned");

    /** Static value Deprovisioned for VendorProvisioningState. */
    public static final VendorProvisioningState DEPROVISIONED = fromString("Deprovisioned");

    /** Static value UserDataValidationFailed for VendorProvisioningState. */
    public static final VendorProvisioningState USER_DATA_VALIDATION_FAILED = fromString("UserDataValidationFailed");

    /**
     * Creates or finds a VendorProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VendorProvisioningState.
     */
    @JsonCreator
    public static VendorProvisioningState fromString(String name) {
        return fromString(name, VendorProvisioningState.class);
    }

    /** @return known VendorProvisioningState values. */
    public static Collection<VendorProvisioningState> values() {
        return values(VendorProvisioningState.class);
    }
}
