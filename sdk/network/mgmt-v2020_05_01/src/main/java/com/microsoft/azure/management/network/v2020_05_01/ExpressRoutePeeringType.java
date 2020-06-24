/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExpressRoutePeeringType.
 */
public final class ExpressRoutePeeringType extends ExpandableStringEnum<ExpressRoutePeeringType> {
    /** Static value AzurePublicPeering for ExpressRoutePeeringType. */
    public static final ExpressRoutePeeringType AZURE_PUBLIC_PEERING = fromString("AzurePublicPeering");

    /** Static value AzurePrivatePeering for ExpressRoutePeeringType. */
    public static final ExpressRoutePeeringType AZURE_PRIVATE_PEERING = fromString("AzurePrivatePeering");

    /** Static value MicrosoftPeering for ExpressRoutePeeringType. */
    public static final ExpressRoutePeeringType MICROSOFT_PEERING = fromString("MicrosoftPeering");

    /**
     * Creates or finds a ExpressRoutePeeringType from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRoutePeeringType
     */
    @JsonCreator
    public static ExpressRoutePeeringType fromString(String name) {
        return fromString(name, ExpressRoutePeeringType.class);
    }

    /**
     * @return known ExpressRoutePeeringType values
     */
    public static Collection<ExpressRoutePeeringType> values() {
        return values(ExpressRoutePeeringType.class);
    }
}
