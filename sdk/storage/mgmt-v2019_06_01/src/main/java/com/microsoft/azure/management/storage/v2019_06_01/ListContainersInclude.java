/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ListContainersInclude.
 */
public final class ListContainersInclude extends ExpandableStringEnum<ListContainersInclude> {
    /** Static value deleted for ListContainersInclude. */
    public static final ListContainersInclude DELETED = fromString("deleted");

    /**
     * Creates or finds a ListContainersInclude from its string representation.
     * @param name a name to look for
     * @return the corresponding ListContainersInclude
     */
    @JsonCreator
    public static ListContainersInclude fromString(String name) {
        return fromString(name, ListContainersInclude.class);
    }

    /**
     * @return known ListContainersInclude values
     */
    public static Collection<ListContainersInclude> values() {
        return values(ListContainersInclude.class);
    }
}
