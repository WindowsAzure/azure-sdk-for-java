/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DdosSettingsProtectionCoverage.
 */
public final class DdosSettingsProtectionCoverage extends ExpandableStringEnum<DdosSettingsProtectionCoverage> {
    /** Static value Basic for DdosSettingsProtectionCoverage. */
    public static final DdosSettingsProtectionCoverage BASIC = fromString("Basic");

    /** Static value Standard for DdosSettingsProtectionCoverage. */
    public static final DdosSettingsProtectionCoverage STANDARD = fromString("Standard");

    /**
     * Creates or finds a DdosSettingsProtectionCoverage from its string representation.
     * @param name a name to look for
     * @return the corresponding DdosSettingsProtectionCoverage
     */
    @JsonCreator
    public static DdosSettingsProtectionCoverage fromString(String name) {
        return fromString(name, DdosSettingsProtectionCoverage.class);
    }

    /**
     * @return known DdosSettingsProtectionCoverage values
     */
    public static Collection<DdosSettingsProtectionCoverage> values() {
        return values(DdosSettingsProtectionCoverage.class);
    }
}
