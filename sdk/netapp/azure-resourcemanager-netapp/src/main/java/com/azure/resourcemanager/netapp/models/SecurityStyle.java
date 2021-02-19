// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityStyle. */
public final class SecurityStyle extends ExpandableStringEnum<SecurityStyle> {
    /** Static value ntfs for SecurityStyle. */
    public static final SecurityStyle NTFS = fromString("ntfs");

    /** Static value unix for SecurityStyle. */
    public static final SecurityStyle UNIX = fromString("unix");

    /**
     * Creates or finds a SecurityStyle from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityStyle.
     */
    @JsonCreator
    public static SecurityStyle fromString(String name) {
        return fromString(name, SecurityStyle.class);
    }

    /** @return known SecurityStyle values. */
    public static Collection<SecurityStyle> values() {
        return values(SecurityStyle.class);
    }
}
