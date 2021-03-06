/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ShareAccessType.
 */
public final class ShareAccessType extends ExpandableStringEnum<ShareAccessType> {
    /** Static value Change for ShareAccessType. */
    public static final ShareAccessType CHANGE = fromString("Change");

    /** Static value Read for ShareAccessType. */
    public static final ShareAccessType READ = fromString("Read");

    /** Static value Custom for ShareAccessType. */
    public static final ShareAccessType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a ShareAccessType from its string representation.
     * @param name a name to look for
     * @return the corresponding ShareAccessType
     */
    @JsonCreator
    public static ShareAccessType fromString(String name) {
        return fromString(name, ShareAccessType.class);
    }

    /**
     * @return known ShareAccessType values
     */
    public static Collection<ShareAccessType> values() {
        return values(ShareAccessType.class);
    }
}
