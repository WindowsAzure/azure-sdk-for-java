// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConfigurationName. */
public final class ConfigurationName extends ExpandableStringEnum<ConfigurationName> {
    /** Static value default for ConfigurationName. */
    public static final ConfigurationName DEFAULT = fromString("default");

    /**
     * Creates or finds a ConfigurationName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfigurationName.
     */
    @JsonCreator
    public static ConfigurationName fromString(String name) {
        return fromString(name, ConfigurationName.class);
    }

    /** @return known ConfigurationName values. */
    public static Collection<ConfigurationName> values() {
        return values(ConfigurationName.class);
    }
}
