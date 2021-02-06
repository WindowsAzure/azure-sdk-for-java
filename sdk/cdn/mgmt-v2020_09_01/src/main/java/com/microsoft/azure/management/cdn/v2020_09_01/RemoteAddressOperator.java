/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RemoteAddressOperator.
 */
public final class RemoteAddressOperator extends ExpandableStringEnum<RemoteAddressOperator> {
    /** Static value Any for RemoteAddressOperator. */
    public static final RemoteAddressOperator ANY = fromString("Any");

    /** Static value IPMatch for RemoteAddressOperator. */
    public static final RemoteAddressOperator IPMATCH = fromString("IPMatch");

    /** Static value GeoMatch for RemoteAddressOperator. */
    public static final RemoteAddressOperator GEO_MATCH = fromString("GeoMatch");

    /**
     * Creates or finds a RemoteAddressOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding RemoteAddressOperator
     */
    @JsonCreator
    public static RemoteAddressOperator fromString(String name) {
        return fromString(name, RemoteAddressOperator.class);
    }

    /**
     * @return known RemoteAddressOperator values
     */
    public static Collection<RemoteAddressOperator> values() {
        return values(RemoteAddressOperator.class);
    }
}
