// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceValidation. */
public final class ResourceValidation extends ExpandableStringEnum<ResourceValidation> {
    /** Static value NotSpecified for ResourceValidation. */
    public static final ResourceValidation NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value ReservedWords for ResourceValidation. */
    public static final ResourceValidation RESERVED_WORDS = fromString("ReservedWords");

    /** Static value ProfaneWords for ResourceValidation. */
    public static final ResourceValidation PROFANE_WORDS = fromString("ProfaneWords");

    /**
     * Creates or finds a ResourceValidation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceValidation.
     */
    @JsonCreator
    public static ResourceValidation fromString(String name) {
        return fromString(name, ResourceValidation.class);
    }

    /** @return known ResourceValidation values. */
    public static Collection<ResourceValidation> values() {
        return values(ResourceValidation.class);
    }
}
