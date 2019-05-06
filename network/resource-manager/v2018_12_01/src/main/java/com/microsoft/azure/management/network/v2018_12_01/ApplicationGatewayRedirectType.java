/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewayRedirectType.
 */
public final class ApplicationGatewayRedirectType extends ExpandableStringEnum<ApplicationGatewayRedirectType> {
    /** Static value Permanent for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType PERMANENT = fromString("Permanent");

    /** Static value Found for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType FOUND = fromString("Found");

    /** Static value SeeOther for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType SEE_OTHER = fromString("SeeOther");

    /** Static value Temporary for ApplicationGatewayRedirectType. */
    public static final ApplicationGatewayRedirectType TEMPORARY = fromString("Temporary");

    /**
     * Creates or finds a ApplicationGatewayRedirectType from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayRedirectType
     */
    @JsonCreator
    public static ApplicationGatewayRedirectType fromString(String name) {
        return fromString(name, ApplicationGatewayRedirectType.class);
    }

    /**
     * @return known ApplicationGatewayRedirectType values
     */
    public static Collection<ApplicationGatewayRedirectType> values() {
        return values(ApplicationGatewayRedirectType.class);
    }
}
