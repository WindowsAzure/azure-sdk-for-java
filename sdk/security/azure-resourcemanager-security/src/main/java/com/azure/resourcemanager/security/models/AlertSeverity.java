// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertSeverity. */
public final class AlertSeverity extends ExpandableStringEnum<AlertSeverity> {
    /** Static value Informational for AlertSeverity. */
    public static final AlertSeverity INFORMATIONAL = fromString("Informational");

    /** Static value Low for AlertSeverity. */
    public static final AlertSeverity LOW = fromString("Low");

    /** Static value Medium for AlertSeverity. */
    public static final AlertSeverity MEDIUM = fromString("Medium");

    /** Static value High for AlertSeverity. */
    public static final AlertSeverity HIGH = fromString("High");

    /**
     * Creates or finds a AlertSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertSeverity.
     */
    @JsonCreator
    public static AlertSeverity fromString(String name) {
        return fromString(name, AlertSeverity.class);
    }

    /** @return known AlertSeverity values. */
    public static Collection<AlertSeverity> values() {
        return values(AlertSeverity.class);
    }
}
