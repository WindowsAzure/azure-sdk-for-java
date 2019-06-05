/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BearerTokenSendingMethods.
 */
public final class BearerTokenSendingMethods extends ExpandableStringEnum<BearerTokenSendingMethods> {
    /** Static value authorizationHeader for BearerTokenSendingMethods. */
    public static final BearerTokenSendingMethods AUTHORIZATION_HEADER = fromString("authorizationHeader");

    /** Static value query for BearerTokenSendingMethods. */
    public static final BearerTokenSendingMethods QUERY = fromString("query");

    /**
     * Creates or finds a BearerTokenSendingMethods from its string representation.
     * @param name a name to look for
     * @return the corresponding BearerTokenSendingMethods
     */
    @JsonCreator
    public static BearerTokenSendingMethods fromString(String name) {
        return fromString(name, BearerTokenSendingMethods.class);
    }

    /**
     * @return known BearerTokenSendingMethods values
     */
    public static Collection<BearerTokenSendingMethods> values() {
        return values(BearerTokenSendingMethods.class);
    }
}
