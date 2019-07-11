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
 * Defines values for MultiVmGroupCreateOption.
 */
public final class MultiVmGroupCreateOption extends ExpandableStringEnum<MultiVmGroupCreateOption> {
    /** Static value AutoCreated for MultiVmGroupCreateOption. */
    public static final MultiVmGroupCreateOption AUTO_CREATED = fromString("AutoCreated");

    /** Static value UserSpecified for MultiVmGroupCreateOption. */
    public static final MultiVmGroupCreateOption USER_SPECIFIED = fromString("UserSpecified");

    /**
     * Creates or finds a MultiVmGroupCreateOption from its string representation.
     * @param name a name to look for
     * @return the corresponding MultiVmGroupCreateOption
     */
    @JsonCreator
    public static MultiVmGroupCreateOption fromString(String name) {
        return fromString(name, MultiVmGroupCreateOption.class);
    }

    /**
     * @return known MultiVmGroupCreateOption values
     */
    public static Collection<MultiVmGroupCreateOption> values() {
        return values(MultiVmGroupCreateOption.class);
    }
}
