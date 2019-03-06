/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SalesforceSourceReadBehavior.
 */
public final class SalesforceSourceReadBehavior extends ExpandableStringEnum<SalesforceSourceReadBehavior> {
    /** Static value Query for SalesforceSourceReadBehavior. */
    public static final SalesforceSourceReadBehavior QUERY = fromString("Query");

    /** Static value QueryAll for SalesforceSourceReadBehavior. */
    public static final SalesforceSourceReadBehavior QUERY_ALL = fromString("QueryAll");

    /**
     * Creates or finds a SalesforceSourceReadBehavior from its string representation.
     * @param name a name to look for
     * @return the corresponding SalesforceSourceReadBehavior
     */
    @JsonCreator
    public static SalesforceSourceReadBehavior fromString(String name) {
        return fromString(name, SalesforceSourceReadBehavior.class);
    }

    /**
     * @return known SalesforceSourceReadBehavior values
     */
    public static Collection<SalesforceSourceReadBehavior> values() {
        return values(SalesforceSourceReadBehavior.class);
    }
}
