/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DirectoryServiceOptions.
 */
public final class DirectoryServiceOptions extends ExpandableStringEnum<DirectoryServiceOptions> {
    /** Static value None for DirectoryServiceOptions. */
    public static final DirectoryServiceOptions NONE = fromString("None");

    /** Static value AADDS for DirectoryServiceOptions. */
    public static final DirectoryServiceOptions AADDS = fromString("AADDS");

    /** Static value AD for DirectoryServiceOptions. */
    public static final DirectoryServiceOptions AD = fromString("AD");

    /**
     * Creates or finds a DirectoryServiceOptions from its string representation.
     * @param name a name to look for
     * @return the corresponding DirectoryServiceOptions
     */
    @JsonCreator
    public static DirectoryServiceOptions fromString(String name) {
        return fromString(name, DirectoryServiceOptions.class);
    }

    /**
     * @return known DirectoryServiceOptions values
     */
    public static Collection<DirectoryServiceOptions> values() {
        return values(DirectoryServiceOptions.class);
    }
}
