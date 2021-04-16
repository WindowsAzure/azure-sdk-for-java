// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for H265VideoProfile. */
public final class H265VideoProfile extends ExpandableStringEnum<H265VideoProfile> {
    /** Static value Auto for H265VideoProfile. */
    public static final H265VideoProfile AUTO = fromString("Auto");

    /** Static value Main for H265VideoProfile. */
    public static final H265VideoProfile MAIN = fromString("Main");

    /**
     * Creates or finds a H265VideoProfile from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding H265VideoProfile.
     */
    @JsonCreator
    public static H265VideoProfile fromString(String name) {
        return fromString(name, H265VideoProfile.class);
    }

    /** @return known H265VideoProfile values. */
    public static Collection<H265VideoProfile> values() {
        return values(H265VideoProfile.class);
    }
}
