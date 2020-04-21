/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApiType.
 */
public final class ApiType extends ExpandableStringEnum<ApiType> {
    /** Static value http for ApiType. */
    public static final ApiType HTTP = fromString("http");

    /** Static value soap for ApiType. */
    public static final ApiType SOAP = fromString("soap");

    /**
     * Creates or finds a ApiType from its string representation.
     * @param name a name to look for
     * @return the corresponding ApiType
     */
    @JsonCreator
    public static ApiType fromString(String name) {
        return fromString(name, ApiType.class);
    }

    /**
     * @return known ApiType values
     */
    public static Collection<ApiType> values() {
        return values(ApiType.class);
    }
}
