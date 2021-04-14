// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SslEnum. */
public final class SslEnum extends ExpandableStringEnum<SslEnum> {
    /** Static value Enabled for SslEnum. */
    public static final SslEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for SslEnum. */
    public static final SslEnum DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SslEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SslEnum.
     */
    @JsonCreator
    public static SslEnum fromString(String name) {
        return fromString(name, SslEnum.class);
    }

    /** @return known SslEnum values. */
    public static Collection<SslEnum> values() {
        return values(SslEnum.class);
    }
}
