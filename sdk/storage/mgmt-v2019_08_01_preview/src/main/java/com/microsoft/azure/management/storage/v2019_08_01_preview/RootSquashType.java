/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RootSquashType.
 */
public final class RootSquashType extends ExpandableStringEnum<RootSquashType> {
    /** Static value NoRootSquash for RootSquashType. */
    public static final RootSquashType NO_ROOT_SQUASH = fromString("NoRootSquash");

    /** Static value RootSquash for RootSquashType. */
    public static final RootSquashType ROOT_SQUASH = fromString("RootSquash");

    /** Static value AllSquash for RootSquashType. */
    public static final RootSquashType ALL_SQUASH = fromString("AllSquash");

    /**
     * Creates or finds a RootSquashType from its string representation.
     * @param name a name to look for
     * @return the corresponding RootSquashType
     */
    @JsonCreator
    public static RootSquashType fromString(String name) {
        return fromString(name, RootSquashType.class);
    }

    /**
     * @return known RootSquashType values
     */
    public static Collection<RootSquashType> values() {
        return values(RootSquashType.class);
    }
}
