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
 * Defines values for SapHanaAuthenticationType.
 */
public final class SapHanaAuthenticationType extends ExpandableStringEnum<SapHanaAuthenticationType> {
    /** Static value Basic for SapHanaAuthenticationType. */
    public static final SapHanaAuthenticationType BASIC = fromString("Basic");

    /** Static value Windows for SapHanaAuthenticationType. */
    public static final SapHanaAuthenticationType WINDOWS = fromString("Windows");

    /**
     * Creates or finds a SapHanaAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding SapHanaAuthenticationType
     */
    @JsonCreator
    public static SapHanaAuthenticationType fromString(String name) {
        return fromString(name, SapHanaAuthenticationType.class);
    }

    /**
     * @return known SapHanaAuthenticationType values
     */
    public static Collection<SapHanaAuthenticationType> values() {
        return values(SapHanaAuthenticationType.class);
    }
}
