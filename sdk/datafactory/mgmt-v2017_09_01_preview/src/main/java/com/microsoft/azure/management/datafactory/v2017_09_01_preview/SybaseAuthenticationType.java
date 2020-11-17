/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SybaseAuthenticationType.
 */
public final class SybaseAuthenticationType extends ExpandableStringEnum<SybaseAuthenticationType> {
    /** Static value Basic for SybaseAuthenticationType. */
    public static final SybaseAuthenticationType BASIC = fromString("Basic");

    /** Static value Windows for SybaseAuthenticationType. */
    public static final SybaseAuthenticationType WINDOWS = fromString("Windows");

    /**
     * Creates or finds a SybaseAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding SybaseAuthenticationType
     */
    @JsonCreator
    public static SybaseAuthenticationType fromString(String name) {
        return fromString(name, SybaseAuthenticationType.class);
    }

    /**
     * @return known SybaseAuthenticationType values
     */
    public static Collection<SybaseAuthenticationType> values() {
        return values(SybaseAuthenticationType.class);
    }
}
