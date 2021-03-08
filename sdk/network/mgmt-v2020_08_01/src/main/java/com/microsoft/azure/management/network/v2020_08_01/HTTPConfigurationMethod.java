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
 * Defines values for HTTPConfigurationMethod.
 */
public final class HTTPConfigurationMethod extends ExpandableStringEnum<HTTPConfigurationMethod> {
    /** Static value Get for HTTPConfigurationMethod. */
    public static final HTTPConfigurationMethod GET = fromString("Get");

    /** Static value Post for HTTPConfigurationMethod. */
    public static final HTTPConfigurationMethod POST = fromString("Post");

    /**
     * Creates or finds a HTTPConfigurationMethod from its string representation.
     * @param name a name to look for
     * @return the corresponding HTTPConfigurationMethod
     */
    @JsonCreator
    public static HTTPConfigurationMethod fromString(String name) {
        return fromString(name, HTTPConfigurationMethod.class);
    }

    /**
     * @return known HTTPConfigurationMethod values
     */
    public static Collection<HTTPConfigurationMethod> values() {
        return values(HTTPConfigurationMethod.class);
    }
}
