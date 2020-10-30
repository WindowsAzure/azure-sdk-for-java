/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServiceLevel.
 */
public final class ServiceLevel extends ExpandableStringEnum<ServiceLevel> {
    /** Static value Standard for ServiceLevel. */
    public static final ServiceLevel STANDARD = fromString("Standard");

    /** Static value Premium for ServiceLevel. */
    public static final ServiceLevel PREMIUM = fromString("Premium");

    /** Static value Ultra for ServiceLevel. */
    public static final ServiceLevel ULTRA = fromString("Ultra");

    /**
     * Creates or finds a ServiceLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding ServiceLevel
     */
    @JsonCreator
    public static ServiceLevel fromString(String name) {
        return fromString(name, ServiceLevel.class);
    }

    /**
     * @return known ServiceLevel values
     */
    public static Collection<ServiceLevel> values() {
        return values(ServiceLevel.class);
    }
}
