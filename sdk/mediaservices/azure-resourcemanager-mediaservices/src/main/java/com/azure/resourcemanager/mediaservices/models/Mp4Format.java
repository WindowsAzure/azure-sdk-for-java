// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes the properties for an output ISO MP4 file. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.Mp4Format")
@JsonFlatten
@Fluent
public class Mp4Format extends MultiBitrateFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Mp4Format.class);

    /** {@inheritDoc} */
    @Override
    public Mp4Format withOutputFiles(List<OutputFile> outputFiles) {
        super.withOutputFiles(outputFiles);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Mp4Format withFilenamePattern(String filenamePattern) {
        super.withFilenamePattern(filenamePattern);
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
