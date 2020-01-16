/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewayBackendHealthServerHealth.
 */
public final class ApplicationGatewayBackendHealthServerHealth extends ExpandableStringEnum<ApplicationGatewayBackendHealthServerHealth> {
    /** Static value Unknown for ApplicationGatewayBackendHealthServerHealth. */
    public static final ApplicationGatewayBackendHealthServerHealth UNKNOWN = fromString("Unknown");

    /** Static value Up for ApplicationGatewayBackendHealthServerHealth. */
    public static final ApplicationGatewayBackendHealthServerHealth UP = fromString("Up");

    /** Static value Down for ApplicationGatewayBackendHealthServerHealth. */
    public static final ApplicationGatewayBackendHealthServerHealth DOWN = fromString("Down");

    /** Static value Partial for ApplicationGatewayBackendHealthServerHealth. */
    public static final ApplicationGatewayBackendHealthServerHealth PARTIAL = fromString("Partial");

    /** Static value Draining for ApplicationGatewayBackendHealthServerHealth. */
    public static final ApplicationGatewayBackendHealthServerHealth DRAINING = fromString("Draining");

    /**
     * Creates or finds a ApplicationGatewayBackendHealthServerHealth from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayBackendHealthServerHealth
     */
    @JsonCreator
    public static ApplicationGatewayBackendHealthServerHealth fromString(String name) {
        return fromString(name, ApplicationGatewayBackendHealthServerHealth.class);
    }

    /**
     * @return known ApplicationGatewayBackendHealthServerHealth values
     */
    public static Collection<ApplicationGatewayBackendHealthServerHealth> values() {
        return values(ApplicationGatewayBackendHealthServerHealth.class);
    }
}
