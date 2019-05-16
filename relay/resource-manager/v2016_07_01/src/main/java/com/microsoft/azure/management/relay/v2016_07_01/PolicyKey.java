/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2016_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PolicyKey.
 */
public final class PolicyKey extends ExpandableStringEnum<PolicyKey> {
    /** Static value PrimaryKey for PolicyKey. */
    public static final PolicyKey PRIMARY_KEY = fromString("PrimaryKey");

    /** Static value SecondaryKey for PolicyKey. */
    public static final PolicyKey SECONDARY_KEY = fromString("SecondaryKey");

    /**
     * Creates or finds a PolicyKey from its string representation.
     * @param name a name to look for
     * @return the corresponding PolicyKey
     */
    @JsonCreator
    public static PolicyKey fromString(String name) {
        return fromString(name, PolicyKey.class);
    }

    /**
     * @return known PolicyKey values
     */
    public static Collection<PolicyKey> values() {
        return values(PolicyKey.class);
    }
}
