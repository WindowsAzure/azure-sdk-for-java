/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EnforcementMode.
 */
public final class EnforcementMode extends ExpandableStringEnum<EnforcementMode> {
    /** Static value Default for EnforcementMode. */
    public static final EnforcementMode DEFAULT = fromString("Default");

    /** Static value DoNotEnforce for EnforcementMode. */
    public static final EnforcementMode DO_NOT_ENFORCE = fromString("DoNotEnforce");

    /**
     * Creates or finds a EnforcementMode from its string representation.
     * @param name a name to look for
     * @return the corresponding EnforcementMode
     */
    @JsonCreator
    public static EnforcementMode fromString(String name) {
        return fromString(name, EnforcementMode.class);
    }

    /**
     * @return known EnforcementMode values
     */
    public static Collection<EnforcementMode> values() {
        return values(EnforcementMode.class);
    }
}
