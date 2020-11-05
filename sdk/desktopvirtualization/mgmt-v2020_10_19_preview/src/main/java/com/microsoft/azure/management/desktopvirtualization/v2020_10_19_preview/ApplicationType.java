/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationType.
 */
public final class ApplicationType extends ExpandableStringEnum<ApplicationType> {
    /** Static value RemoteApp for ApplicationType. */
    public static final ApplicationType REMOTE_APP = fromString("RemoteApp");

    /** Static value Desktop for ApplicationType. */
    public static final ApplicationType DESKTOP = fromString("Desktop");

    /**
     * Creates or finds a ApplicationType from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationType
     */
    @JsonCreator
    public static ApplicationType fromString(String name) {
        return fromString(name, ApplicationType.class);
    }

    /**
     * @return known ApplicationType values
     */
    public static Collection<ApplicationType> values() {
        return values(ApplicationType.class);
    }
}
