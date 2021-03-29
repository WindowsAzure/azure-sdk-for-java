/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HTTPMethod.
 */
public final class HTTPMethod extends ExpandableStringEnum<HTTPMethod> {
    /** Static value Get for HTTPMethod. */
    public static final HTTPMethod GET = fromString("Get");

    /**
     * Creates or finds a HTTPMethod from its string representation.
     * @param name a name to look for
     * @return the corresponding HTTPMethod
     */
    @JsonCreator
    public static HTTPMethod fromString(String name) {
        return fromString(name, HTTPMethod.class);
    }

    /**
     * @return known HTTPMethod values
     */
    public static Collection<HTTPMethod> values() {
        return values(HTTPMethod.class);
    }
}
