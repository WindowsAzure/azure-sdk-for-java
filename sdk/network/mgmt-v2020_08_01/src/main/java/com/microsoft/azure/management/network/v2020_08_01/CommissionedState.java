/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CommissionedState.
 */
public final class CommissionedState extends ExpandableStringEnum<CommissionedState> {
    /** Static value Provisioning for CommissionedState. */
    public static final CommissionedState PROVISIONING = fromString("Provisioning");

    /** Static value Provisioned for CommissionedState. */
    public static final CommissionedState PROVISIONED = fromString("Provisioned");

    /** Static value Commissioning for CommissionedState. */
    public static final CommissionedState COMMISSIONING = fromString("Commissioning");

    /** Static value Commissioned for CommissionedState. */
    public static final CommissionedState COMMISSIONED = fromString("Commissioned");

    /** Static value Decommissioning for CommissionedState. */
    public static final CommissionedState DECOMMISSIONING = fromString("Decommissioning");

    /** Static value Deprovisioning for CommissionedState. */
    public static final CommissionedState DEPROVISIONING = fromString("Deprovisioning");

    /**
     * Creates or finds a CommissionedState from its string representation.
     * @param name a name to look for
     * @return the corresponding CommissionedState
     */
    @JsonCreator
    public static CommissionedState fromString(String name) {
        return fromString(name, CommissionedState.class);
    }

    /**
     * @return known CommissionedState values
     */
    public static Collection<CommissionedState> values() {
        return values(CommissionedState.class);
    }
}
