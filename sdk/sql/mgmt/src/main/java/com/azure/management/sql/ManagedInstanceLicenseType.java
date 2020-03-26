// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ManagedInstanceLicenseType.
 */
public final class ManagedInstanceLicenseType extends ExpandableStringEnum<ManagedInstanceLicenseType> {
    /**
     * Static value LicenseIncluded for ManagedInstanceLicenseType.
     */
    public static final ManagedInstanceLicenseType LICENSE_INCLUDED = fromString("LicenseIncluded");

    /**
     * Static value BasePrice for ManagedInstanceLicenseType.
     */
    public static final ManagedInstanceLicenseType BASE_PRICE = fromString("BasePrice");

    /**
     * Creates or finds a ManagedInstanceLicenseType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedInstanceLicenseType.
     */
    @JsonCreator
    public static ManagedInstanceLicenseType fromString(String name) {
        return fromString(name, ManagedInstanceLicenseType.class);
    }

    /**
     * @return known ManagedInstanceLicenseType values.
     */
    public static Collection<ManagedInstanceLicenseType> values() {
        return values(ManagedInstanceLicenseType.class);
    }
}
