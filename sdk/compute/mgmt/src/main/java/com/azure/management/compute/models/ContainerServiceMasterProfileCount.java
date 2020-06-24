// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContainerServiceMasterProfileCount. */
public final class ContainerServiceMasterProfileCount extends ExpandableStringEnum<ContainerServiceMasterProfileCount> {
    /** Static value 1 for ContainerServiceMasterProfileCount. */
    public static final ContainerServiceMasterProfileCount ONE = fromString("1");

    /** Static value 3 for ContainerServiceMasterProfileCount. */
    public static final ContainerServiceMasterProfileCount THREE = fromString("3");

    /** Static value 5 for ContainerServiceMasterProfileCount. */
    public static final ContainerServiceMasterProfileCount FIVE = fromString("5");

    /**
     * Creates or finds a ContainerServiceMasterProfileCount from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerServiceMasterProfileCount.
     */
    @JsonCreator
    public static ContainerServiceMasterProfileCount fromString(String name) {
        return fromString(name, ContainerServiceMasterProfileCount.class);
    }

    /** @return known ContainerServiceMasterProfileCount values. */
    public static Collection<ContainerServiceMasterProfileCount> values() {
        return values(ContainerServiceMasterProfileCount.class);
    }
}
