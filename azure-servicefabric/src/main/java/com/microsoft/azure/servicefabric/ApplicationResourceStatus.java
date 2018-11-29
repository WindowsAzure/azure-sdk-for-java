/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationResourceStatus.
 */
public final class ApplicationResourceStatus extends ExpandableStringEnum<ApplicationResourceStatus> {
    /** Static value Invalid for ApplicationResourceStatus. */
    public static final ApplicationResourceStatus INVALID = fromString("Invalid");

    /** Static value Ready for ApplicationResourceStatus. */
    public static final ApplicationResourceStatus READY = fromString("Ready");

    /** Static value Upgrading for ApplicationResourceStatus. */
    public static final ApplicationResourceStatus UPGRADING = fromString("Upgrading");

    /** Static value Creating for ApplicationResourceStatus. */
    public static final ApplicationResourceStatus CREATING = fromString("Creating");

    /** Static value Deleting for ApplicationResourceStatus. */
    public static final ApplicationResourceStatus DELETING = fromString("Deleting");

    /** Static value Failed for ApplicationResourceStatus. */
    public static final ApplicationResourceStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ApplicationResourceStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationResourceStatus
     */
    @JsonCreator
    public static ApplicationResourceStatus fromString(String name) {
        return fromString(name, ApplicationResourceStatus.class);
    }

    /**
     * @return known ApplicationResourceStatus values
     */
    public static Collection<ApplicationResourceStatus> values() {
        return values(ApplicationResourceStatus.class);
    }
}
