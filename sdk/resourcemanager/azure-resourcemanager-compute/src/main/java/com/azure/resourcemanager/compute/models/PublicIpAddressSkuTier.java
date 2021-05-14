// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PublicIpAddressSkuTier. */
public final class PublicIpAddressSkuTier extends ExpandableStringEnum<PublicIpAddressSkuTier> {
    /** Static value Regional for PublicIpAddressSkuTier. */
    public static final PublicIpAddressSkuTier REGIONAL = fromString("Regional");

    /** Static value Global for PublicIpAddressSkuTier. */
    public static final PublicIpAddressSkuTier GLOBAL = fromString("Global");

    /**
     * Creates or finds a PublicIpAddressSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublicIpAddressSkuTier.
     */
    @JsonCreator
    public static PublicIpAddressSkuTier fromString(String name) {
        return fromString(name, PublicIpAddressSkuTier.class);
    }

    /** @return known PublicIpAddressSkuTier values. */
    public static Collection<PublicIpAddressSkuTier> values() {
        return values(PublicIpAddressSkuTier.class);
    }
}
