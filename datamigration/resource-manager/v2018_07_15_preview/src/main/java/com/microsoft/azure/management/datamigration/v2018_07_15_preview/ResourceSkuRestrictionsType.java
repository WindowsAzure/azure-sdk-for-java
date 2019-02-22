/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResourceSkuRestrictionsType.
 */
public final class ResourceSkuRestrictionsType extends ExpandableStringEnum<ResourceSkuRestrictionsType> {
    /** Static value location for ResourceSkuRestrictionsType. */
    public static final ResourceSkuRestrictionsType LOCATION = fromString("location");

    /**
     * Creates or finds a ResourceSkuRestrictionsType from its string representation.
     * @param name a name to look for
     * @return the corresponding ResourceSkuRestrictionsType
     */
    @JsonCreator
    public static ResourceSkuRestrictionsType fromString(String name) {
        return fromString(name, ResourceSkuRestrictionsType.class);
    }

    /**
     * @return known ResourceSkuRestrictionsType values
     */
    public static Collection<ResourceSkuRestrictionsType> values() {
        return values(ResourceSkuRestrictionsType.class);
    }
}
