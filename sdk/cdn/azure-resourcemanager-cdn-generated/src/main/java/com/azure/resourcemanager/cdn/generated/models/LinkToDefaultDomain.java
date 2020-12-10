// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LinkToDefaultDomain. */
public final class LinkToDefaultDomain extends ExpandableStringEnum<LinkToDefaultDomain> {
    /** Static value Enabled for LinkToDefaultDomain. */
    public static final LinkToDefaultDomain ENABLED = fromString("Enabled");

    /** Static value Disabled for LinkToDefaultDomain. */
    public static final LinkToDefaultDomain DISABLED = fromString("Disabled");

    /**
     * Creates or finds a LinkToDefaultDomain from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LinkToDefaultDomain.
     */
    @JsonCreator
    public static LinkToDefaultDomain fromString(String name) {
        return fromString(name, LinkToDefaultDomain.class);
    }

    /** @return known LinkToDefaultDomain values. */
    public static Collection<LinkToDefaultDomain> values() {
        return values(LinkToDefaultDomain.class);
    }
}
