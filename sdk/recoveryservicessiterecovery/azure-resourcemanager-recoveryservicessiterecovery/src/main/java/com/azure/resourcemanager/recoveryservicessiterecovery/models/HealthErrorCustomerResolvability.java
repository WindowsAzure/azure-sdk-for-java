// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthErrorCustomerResolvability. */
public final class HealthErrorCustomerResolvability extends ExpandableStringEnum<HealthErrorCustomerResolvability> {
    /** Static value Allowed for HealthErrorCustomerResolvability. */
    public static final HealthErrorCustomerResolvability ALLOWED = fromString("Allowed");

    /** Static value NotAllowed for HealthErrorCustomerResolvability. */
    public static final HealthErrorCustomerResolvability NOT_ALLOWED = fromString("NotAllowed");

    /**
     * Creates or finds a HealthErrorCustomerResolvability from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthErrorCustomerResolvability.
     */
    @JsonCreator
    public static HealthErrorCustomerResolvability fromString(String name) {
        return fromString(name, HealthErrorCustomerResolvability.class);
    }

    /** @return known HealthErrorCustomerResolvability values. */
    public static Collection<HealthErrorCustomerResolvability> values() {
        return values(HealthErrorCustomerResolvability.class);
    }
}
