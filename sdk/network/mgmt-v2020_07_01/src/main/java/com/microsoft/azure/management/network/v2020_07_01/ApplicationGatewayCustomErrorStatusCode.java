/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewayCustomErrorStatusCode.
 */
public final class ApplicationGatewayCustomErrorStatusCode extends ExpandableStringEnum<ApplicationGatewayCustomErrorStatusCode> {
    /** Static value HttpStatus403 for ApplicationGatewayCustomErrorStatusCode. */
    public static final ApplicationGatewayCustomErrorStatusCode HTTP_STATUS403 = fromString("HttpStatus403");

    /** Static value HttpStatus502 for ApplicationGatewayCustomErrorStatusCode. */
    public static final ApplicationGatewayCustomErrorStatusCode HTTP_STATUS502 = fromString("HttpStatus502");

    /**
     * Creates or finds a ApplicationGatewayCustomErrorStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayCustomErrorStatusCode
     */
    @JsonCreator
    public static ApplicationGatewayCustomErrorStatusCode fromString(String name) {
        return fromString(name, ApplicationGatewayCustomErrorStatusCode.class);
    }

    /**
     * @return known ApplicationGatewayCustomErrorStatusCode values
     */
    public static Collection<ApplicationGatewayCustomErrorStatusCode> values() {
        return values(ApplicationGatewayCustomErrorStatusCode.class);
    }
}
