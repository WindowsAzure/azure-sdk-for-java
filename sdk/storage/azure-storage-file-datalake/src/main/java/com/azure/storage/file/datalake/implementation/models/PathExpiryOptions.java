// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for PathExpiryOptions.
 */
public final class PathExpiryOptions extends ExpandableStringEnum<PathExpiryOptions> {
    /**
     * Static value NeverExpire for PathExpiryOptions.
     */
    public static final PathExpiryOptions NEVER_EXPIRE = fromString("NeverExpire");

    /**
     * Static value RelativeToCreation for PathExpiryOptions.
     */
    public static final PathExpiryOptions RELATIVE_TO_CREATION = fromString("RelativeToCreation");

    /**
     * Static value RelativeToNow for PathExpiryOptions.
     */
    public static final PathExpiryOptions RELATIVE_TO_NOW = fromString("RelativeToNow");

    /**
     * Static value Absolute for PathExpiryOptions.
     */
    public static final PathExpiryOptions ABSOLUTE = fromString("Absolute");

    /**
     * Creates or finds a PathExpiryOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PathExpiryOptions.
     */
    @JsonCreator
    public static PathExpiryOptions fromString(String name) {
        return fromString(name, PathExpiryOptions.class);
    }

    /**
     * @return known PathExpiryOptions values.
     */
    public static Collection<PathExpiryOptions> values() {
        return values(PathExpiryOptions.class);
    }
}
