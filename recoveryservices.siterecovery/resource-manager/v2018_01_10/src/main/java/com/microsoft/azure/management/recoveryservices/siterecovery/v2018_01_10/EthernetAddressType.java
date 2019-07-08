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
 * Defines values for EthernetAddressType.
 */
public final class EthernetAddressType extends ExpandableStringEnum<EthernetAddressType> {
    /** Static value Dynamic for EthernetAddressType. */
    public static final EthernetAddressType DYNAMIC = fromString("Dynamic");

    /** Static value Static for EthernetAddressType. */
    public static final EthernetAddressType STATIC = fromString("Static");

    /**
     * Creates or finds a EthernetAddressType from its string representation.
     * @param name a name to look for
     * @return the corresponding EthernetAddressType
     */
    @JsonCreator
    public static EthernetAddressType fromString(String name) {
        return fromString(name, EthernetAddressType.class);
    }

    /**
     * @return known EthernetAddressType values
     */
    public static Collection<EthernetAddressType> values() {
        return values(EthernetAddressType.class);
    }
}
