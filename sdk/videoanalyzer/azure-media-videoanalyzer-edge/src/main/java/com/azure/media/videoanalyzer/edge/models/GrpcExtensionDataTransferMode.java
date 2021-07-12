// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GrpcExtensionDataTransferMode. */
public final class GrpcExtensionDataTransferMode extends ExpandableStringEnum<GrpcExtensionDataTransferMode> {
    /** Static value embedded for GrpcExtensionDataTransferMode. */
    public static final GrpcExtensionDataTransferMode EMBEDDED = fromString("embedded");

    /** Static value sharedMemory for GrpcExtensionDataTransferMode. */
    public static final GrpcExtensionDataTransferMode SHARED_MEMORY = fromString("sharedMemory");

    /**
     * Creates or finds a GrpcExtensionDataTransferMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GrpcExtensionDataTransferMode.
     */
    @JsonCreator
    public static GrpcExtensionDataTransferMode fromString(String name) {
        return fromString(name, GrpcExtensionDataTransferMode.class);
    }

    /** @return known GrpcExtensionDataTransferMode values. */
    public static Collection<GrpcExtensionDataTransferMode> values() {
        return values(GrpcExtensionDataTransferMode.class);
    }
}
