/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HcxEnterpriseSiteStatus.
 */
public final class HcxEnterpriseSiteStatus extends ExpandableStringEnum<HcxEnterpriseSiteStatus> {
    /** Static value Available for HcxEnterpriseSiteStatus. */
    public static final HcxEnterpriseSiteStatus AVAILABLE = fromString("Available");

    /** Static value Consumed for HcxEnterpriseSiteStatus. */
    public static final HcxEnterpriseSiteStatus CONSUMED = fromString("Consumed");

    /** Static value Deactivated for HcxEnterpriseSiteStatus. */
    public static final HcxEnterpriseSiteStatus DEACTIVATED = fromString("Deactivated");

    /** Static value Deleted for HcxEnterpriseSiteStatus. */
    public static final HcxEnterpriseSiteStatus DELETED = fromString("Deleted");

    /**
     * Creates or finds a HcxEnterpriseSiteStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding HcxEnterpriseSiteStatus
     */
    @JsonCreator
    public static HcxEnterpriseSiteStatus fromString(String name) {
        return fromString(name, HcxEnterpriseSiteStatus.class);
    }

    /**
     * @return known HcxEnterpriseSiteStatus values
     */
    public static Collection<HcxEnterpriseSiteStatus> values() {
        return values(HcxEnterpriseSiteStatus.class);
    }
}
