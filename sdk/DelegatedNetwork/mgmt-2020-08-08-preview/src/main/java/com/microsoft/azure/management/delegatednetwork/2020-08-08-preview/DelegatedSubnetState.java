/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DelegatedSubnetState.
 */
public final class DelegatedSubnetState extends ExpandableStringEnum<DelegatedSubnetState> {
    /** Static value Deleting for DelegatedSubnetState. */
    public static final DelegatedSubnetState DELETING = fromString("Deleting");

    /** Static value Succeeded for DelegatedSubnetState. */
    public static final DelegatedSubnetState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for DelegatedSubnetState. */
    public static final DelegatedSubnetState FAILED = fromString("Failed");

    /** Static value Provisioning for DelegatedSubnetState. */
    public static final DelegatedSubnetState PROVISIONING = fromString("Provisioning");

    /**
     * Creates or finds a DelegatedSubnetState from its string representation.
     * @param name a name to look for
     * @return the corresponding DelegatedSubnetState
     */
    @JsonCreator
    public static DelegatedSubnetState fromString(String name) {
        return fromString(name, DelegatedSubnetState.class);
    }

    /**
     * @return known DelegatedSubnetState values
     */
    public static Collection<DelegatedSubnetState> values() {
        return values(DelegatedSubnetState.class);
    }
}
