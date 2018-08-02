/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IkeIntegrity.
 */
public final class IkeIntegrity extends ExpandableStringEnum<IkeIntegrity> {
    /** Static value MD5 for IkeIntegrity. */
    public static final IkeIntegrity MD5 = fromString("MD5");

    /** Static value SHA1 for IkeIntegrity. */
    public static final IkeIntegrity SHA1 = fromString("SHA1");

    /** Static value SHA256 for IkeIntegrity. */
    public static final IkeIntegrity SHA256 = fromString("SHA256");

    /** Static value SHA384 for IkeIntegrity. */
    public static final IkeIntegrity SHA384 = fromString("SHA384");

    /** Static value GCMAES256 for IkeIntegrity. */
    public static final IkeIntegrity GCMAES256 = fromString("GCMAES256");

    /** Static value GCMAES128 for IkeIntegrity. */
    public static final IkeIntegrity GCMAES128 = fromString("GCMAES128");

    /**
     * Creates or finds a IkeIntegrity from its string representation.
     * @param name a name to look for
     * @return the corresponding IkeIntegrity
     */
    @JsonCreator
    public static IkeIntegrity fromString(String name) {
        return fromString(name, IkeIntegrity.class);
    }

    /**
     * @return known IkeIntegrity values
     */
    public static Collection<IkeIntegrity> values() {
        return values(IkeIntegrity.class);
    }
}
