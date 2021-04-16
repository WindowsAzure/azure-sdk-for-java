// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IntegrationRuntimeAuthKeyName. */
public final class IntegrationRuntimeAuthKeyName extends ExpandableStringEnum<IntegrationRuntimeAuthKeyName> {
    /** Static value authKey1 for IntegrationRuntimeAuthKeyName. */
    public static final IntegrationRuntimeAuthKeyName AUTH_KEY1 = fromString("authKey1");

    /** Static value authKey2 for IntegrationRuntimeAuthKeyName. */
    public static final IntegrationRuntimeAuthKeyName AUTH_KEY2 = fromString("authKey2");

    /**
     * Creates or finds a IntegrationRuntimeAuthKeyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeAuthKeyName.
     */
    @JsonCreator
    public static IntegrationRuntimeAuthKeyName fromString(String name) {
        return fromString(name, IntegrationRuntimeAuthKeyName.class);
    }

    /** @return known IntegrationRuntimeAuthKeyName values. */
    public static Collection<IntegrationRuntimeAuthKeyName> values() {
        return values(IntegrationRuntimeAuthKeyName.class);
    }
}
