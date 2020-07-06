/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IntegrationRuntimeAutoUpdate.
 */
public final class IntegrationRuntimeAutoUpdate extends ExpandableStringEnum<IntegrationRuntimeAutoUpdate> {
    /** Static value On for IntegrationRuntimeAutoUpdate. */
    public static final IntegrationRuntimeAutoUpdate ON = fromString("On");

    /** Static value Off for IntegrationRuntimeAutoUpdate. */
    public static final IntegrationRuntimeAutoUpdate OFF = fromString("Off");

    /**
     * Creates or finds a IntegrationRuntimeAutoUpdate from its string representation.
     * @param name a name to look for
     * @return the corresponding IntegrationRuntimeAutoUpdate
     */
    @JsonCreator
    public static IntegrationRuntimeAutoUpdate fromString(String name) {
        return fromString(name, IntegrationRuntimeAutoUpdate.class);
    }

    /**
     * @return known IntegrationRuntimeAutoUpdate values
     */
    public static Collection<IntegrationRuntimeAutoUpdate> values() {
        return values(IntegrationRuntimeAutoUpdate.class);
    }
}
