// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerWorkspaceFeature. */
public final class ServerWorkspaceFeature extends ExpandableStringEnum<ServerWorkspaceFeature> {
    /** Static value Connected for ServerWorkspaceFeature. */
    public static final ServerWorkspaceFeature CONNECTED = fromString("Connected");

    /** Static value Disconnected for ServerWorkspaceFeature. */
    public static final ServerWorkspaceFeature DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a ServerWorkspaceFeature from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerWorkspaceFeature.
     */
    @JsonCreator
    public static ServerWorkspaceFeature fromString(String name) {
        return fromString(name, ServerWorkspaceFeature.class);
    }

    /** @return known ServerWorkspaceFeature values. */
    public static Collection<ServerWorkspaceFeature> values() {
        return values(ServerWorkspaceFeature.class);
    }
}
