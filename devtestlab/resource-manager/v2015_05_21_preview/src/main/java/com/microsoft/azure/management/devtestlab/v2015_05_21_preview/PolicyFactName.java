/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PolicyFactName.
 */
public final class PolicyFactName extends ExpandableStringEnum<PolicyFactName> {
    /** Static value UserOwnedLabVmCount for PolicyFactName. */
    public static final PolicyFactName USER_OWNED_LAB_VM_COUNT = fromString("UserOwnedLabVmCount");

    /** Static value LabVmCount for PolicyFactName. */
    public static final PolicyFactName LAB_VM_COUNT = fromString("LabVmCount");

    /** Static value LabVmSize for PolicyFactName. */
    public static final PolicyFactName LAB_VM_SIZE = fromString("LabVmSize");

    /** Static value GalleryImage for PolicyFactName. */
    public static final PolicyFactName GALLERY_IMAGE = fromString("GalleryImage");

    /** Static value UserOwnedLabVmCountInSubnet for PolicyFactName. */
    public static final PolicyFactName USER_OWNED_LAB_VM_COUNT_IN_SUBNET = fromString("UserOwnedLabVmCountInSubnet");

    /**
     * Creates or finds a PolicyFactName from its string representation.
     * @param name a name to look for
     * @return the corresponding PolicyFactName
     */
    @JsonCreator
    public static PolicyFactName fromString(String name) {
        return fromString(name, PolicyFactName.class);
    }

    /**
     * @return known PolicyFactName values
     */
    public static Collection<PolicyFactName> values() {
        return values(PolicyFactName.class);
    }
}
