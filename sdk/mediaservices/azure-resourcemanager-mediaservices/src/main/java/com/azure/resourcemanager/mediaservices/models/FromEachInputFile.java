// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * An InputDefinition that looks at each input file provided to select tracks specified by the IncludedTracks property.
 * Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to select tracks from each file given.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.FromEachInputFile")
@JsonFlatten
@Immutable
public class FromEachInputFile extends InputDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FromEachInputFile.class);

    /** {@inheritDoc} */
    @Override
    public FromEachInputFile withIncludedTracks(List<TrackDescriptor> includedTracks) {
        super.withIncludedTracks(includedTracks);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
