/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProcessorArchitecture.
 */
public final class ProcessorArchitecture extends ExpandableStringEnum<ProcessorArchitecture> {
    /** Static value Amd64 for ProcessorArchitecture. */
    public static final ProcessorArchitecture AMD64 = fromString("Amd64");

    /** Static value X86 for ProcessorArchitecture. */
    public static final ProcessorArchitecture X86 = fromString("X86");

    /**
     * Creates or finds a ProcessorArchitecture from its string representation.
     * @param name a name to look for
     * @return the corresponding ProcessorArchitecture
     */
    @JsonCreator
    public static ProcessorArchitecture fromString(String name) {
        return fromString(name, ProcessorArchitecture.class);
    }

    /**
     * @return known ProcessorArchitecture values
     */
    public static Collection<ProcessorArchitecture> values() {
        return values(ProcessorArchitecture.class);
    }
}
