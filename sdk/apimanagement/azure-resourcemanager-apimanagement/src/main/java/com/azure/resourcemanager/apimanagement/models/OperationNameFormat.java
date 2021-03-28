// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationNameFormat. */
public final class OperationNameFormat extends ExpandableStringEnum<OperationNameFormat> {
    /** Static value Name for OperationNameFormat. */
    public static final OperationNameFormat NAME = fromString("Name");

    /** Static value Url for OperationNameFormat. */
    public static final OperationNameFormat URL = fromString("Url");

    /**
     * Creates or finds a OperationNameFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationNameFormat.
     */
    @JsonCreator
    public static OperationNameFormat fromString(String name) {
        return fromString(name, OperationNameFormat.class);
    }

    /** @return known OperationNameFormat values. */
    public static Collection<OperationNameFormat> values() {
        return values(OperationNameFormat.class);
    }
}
