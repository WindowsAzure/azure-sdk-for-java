/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ActionsRequired.
 */
public final class ActionsRequired extends ExpandableStringEnum<ActionsRequired> {
    /** Static value None for ActionsRequired. */
    public static final ActionsRequired NONE = fromString("None");

    /** Static value Recreate for ActionsRequired. */
    public static final ActionsRequired RECREATE = fromString("Recreate");

    /**
     * Creates or finds a ActionsRequired from its string representation.
     * @param name a name to look for
     * @return the corresponding ActionsRequired
     */
    @JsonCreator
    public static ActionsRequired fromString(String name) {
        return fromString(name, ActionsRequired.class);
    }

    /**
     * @return known ActionsRequired values
     */
    public static Collection<ActionsRequired> values() {
        return values(ActionsRequired.class);
    }
}
