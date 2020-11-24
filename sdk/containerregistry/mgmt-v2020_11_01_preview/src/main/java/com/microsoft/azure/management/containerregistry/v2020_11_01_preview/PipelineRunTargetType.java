/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PipelineRunTargetType.
 */
public final class PipelineRunTargetType extends ExpandableStringEnum<PipelineRunTargetType> {
    /** Static value AzureStorageBlob for PipelineRunTargetType. */
    public static final PipelineRunTargetType AZURE_STORAGE_BLOB = fromString("AzureStorageBlob");

    /**
     * Creates or finds a PipelineRunTargetType from its string representation.
     * @param name a name to look for
     * @return the corresponding PipelineRunTargetType
     */
    @JsonCreator
    public static PipelineRunTargetType fromString(String name) {
        return fromString(name, PipelineRunTargetType.class);
    }

    /**
     * @return known PipelineRunTargetType values
     */
    public static Collection<PipelineRunTargetType> values() {
        return values(PipelineRunTargetType.class);
    }
}
