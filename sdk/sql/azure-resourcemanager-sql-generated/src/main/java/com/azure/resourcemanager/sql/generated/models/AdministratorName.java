// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AdministratorName. */
public final class AdministratorName extends ExpandableStringEnum<AdministratorName> {
    /** Static value ActiveDirectory for AdministratorName. */
    public static final AdministratorName ACTIVE_DIRECTORY = fromString("ActiveDirectory");

    /**
     * Creates or finds a AdministratorName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AdministratorName.
     */
    @JsonCreator
    public static AdministratorName fromString(String name) {
        return fromString(name, AdministratorName.class);
    }

    /** @return known AdministratorName values. */
    public static Collection<AdministratorName> values() {
        return values(AdministratorName.class);
    }
}
