// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectivityStatusType. */
public final class ConnectivityStatusType extends ExpandableStringEnum<ConnectivityStatusType> {
    /** Static value initializing for ConnectivityStatusType. */
    public static final ConnectivityStatusType INITIALIZING = fromString("initializing");

    /** Static value success for ConnectivityStatusType. */
    public static final ConnectivityStatusType SUCCESS = fromString("success");

    /** Static value failure for ConnectivityStatusType. */
    public static final ConnectivityStatusType FAILURE = fromString("failure");

    /**
     * Creates or finds a ConnectivityStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectivityStatusType.
     */
    @JsonCreator
    public static ConnectivityStatusType fromString(String name) {
        return fromString(name, ConnectivityStatusType.class);
    }

    /** @return known ConnectivityStatusType values. */
    public static Collection<ConnectivityStatusType> values() {
        return values(ConnectivityStatusType.class);
    }
}
