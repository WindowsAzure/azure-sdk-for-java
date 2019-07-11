/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DiskAccountType.
 */
public final class DiskAccountType extends ExpandableStringEnum<DiskAccountType> {
    /** Static value Standard_LRS for DiskAccountType. */
    public static final DiskAccountType STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Premium_LRS for DiskAccountType. */
    public static final DiskAccountType PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value StandardSSD_LRS for DiskAccountType. */
    public static final DiskAccountType STANDARD_SSD_LRS = fromString("StandardSSD_LRS");

    /**
     * Creates or finds a DiskAccountType from its string representation.
     * @param name a name to look for
     * @return the corresponding DiskAccountType
     */
    @JsonCreator
    public static DiskAccountType fromString(String name) {
        return fromString(name, DiskAccountType.class);
    }

    /**
     * @return known DiskAccountType values
     */
    public static Collection<DiskAccountType> values() {
        return values(DiskAccountType.class);
    }
}
