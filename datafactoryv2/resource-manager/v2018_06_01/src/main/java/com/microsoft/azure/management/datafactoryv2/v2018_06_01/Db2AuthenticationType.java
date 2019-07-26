/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Db2AuthenticationType.
 */
public final class Db2AuthenticationType extends ExpandableStringEnum<Db2AuthenticationType> {
    /** Static value Basic for Db2AuthenticationType. */
    public static final Db2AuthenticationType BASIC = fromString("Basic");

    /**
     * Creates or finds a Db2AuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding Db2AuthenticationType
     */
    @JsonCreator
    public static Db2AuthenticationType fromString(String name) {
        return fromString(name, Db2AuthenticationType.class);
    }

    /**
     * @return known Db2AuthenticationType values
     */
    public static Collection<Db2AuthenticationType> values() {
        return values(Db2AuthenticationType.class);
    }
}
