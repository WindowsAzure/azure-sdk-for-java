/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CommunicationType.
 */
public final class CommunicationType extends ExpandableStringEnum<CommunicationType> {
    /** Static value web for CommunicationType. */
    public static final CommunicationType WEB = fromString("web");

    /** Static value phone for CommunicationType. */
    public static final CommunicationType PHONE = fromString("phone");

    /**
     * Creates or finds a CommunicationType from its string representation.
     * @param name a name to look for
     * @return the corresponding CommunicationType
     */
    @JsonCreator
    public static CommunicationType fromString(String name) {
        return fromString(name, CommunicationType.class);
    }

    /**
     * @return known CommunicationType values
     */
    public static Collection<CommunicationType> values() {
        return values(CommunicationType.class);
    }
}
