/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ClusterPrincipalRole.
 */
public final class ClusterPrincipalRole extends ExpandableStringEnum<ClusterPrincipalRole> {
    /** Static value AllDatabasesAdmin for ClusterPrincipalRole. */
    public static final ClusterPrincipalRole ALL_DATABASES_ADMIN = fromString("AllDatabasesAdmin");

    /** Static value AllDatabasesViewer for ClusterPrincipalRole. */
    public static final ClusterPrincipalRole ALL_DATABASES_VIEWER = fromString("AllDatabasesViewer");

    /**
     * Creates or finds a ClusterPrincipalRole from its string representation.
     * @param name a name to look for
     * @return the corresponding ClusterPrincipalRole
     */
    @JsonCreator
    public static ClusterPrincipalRole fromString(String name) {
        return fromString(name, ClusterPrincipalRole.class);
    }

    /**
     * @return known ClusterPrincipalRole values
     */
    public static Collection<ClusterPrincipalRole> values() {
        return values(ClusterPrincipalRole.class);
    }
}
