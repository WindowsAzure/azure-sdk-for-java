// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IntegrationRuntimeEntityReferenceType. */
public final class IntegrationRuntimeEntityReferenceType
    extends ExpandableStringEnum<IntegrationRuntimeEntityReferenceType> {
    /** Static value IntegrationRuntimeReference for IntegrationRuntimeEntityReferenceType. */
    public static final IntegrationRuntimeEntityReferenceType INTEGRATION_RUNTIME_REFERENCE =
        fromString("IntegrationRuntimeReference");

    /** Static value LinkedServiceReference for IntegrationRuntimeEntityReferenceType. */
    public static final IntegrationRuntimeEntityReferenceType LINKED_SERVICE_REFERENCE =
        fromString("LinkedServiceReference");

    /**
     * Creates or finds a IntegrationRuntimeEntityReferenceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeEntityReferenceType.
     */
    @JsonCreator
    public static IntegrationRuntimeEntityReferenceType fromString(String name) {
        return fromString(name, IntegrationRuntimeEntityReferenceType.class);
    }

    /** @return known IntegrationRuntimeEntityReferenceType values. */
    public static Collection<IntegrationRuntimeEntityReferenceType> values() {
        return values(IntegrationRuntimeEntityReferenceType.class);
    }
}
