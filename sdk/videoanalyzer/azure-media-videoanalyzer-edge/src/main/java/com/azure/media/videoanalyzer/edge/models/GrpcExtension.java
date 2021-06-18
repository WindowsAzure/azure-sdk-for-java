// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * GRPC extension processor allows pipeline extension plugins to be connected to the pipeline through over a gRPC
 * channel. Extension plugins must act as an gRPC server. Please see https://aka.ms/ava-extension-grpc for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.GrpcExtension")
@Fluent
public final class GrpcExtension extends ExtensionProcessorBase {
    /*
     * Specifies how media is transferred to the extension plugin.
     */
    @JsonProperty(value = "dataTransfer", required = true)
    private GrpcExtensionDataTransfer dataTransfer;

    /*
     * An optional configuration string that is sent to the extension plugin.
     * The configuration string is specific to each custom extension and it not
     * understood neither validated by Video Analyzer. Please see
     * https://aka.ms/ava-extension-grpc for details.
     */
    @JsonProperty(value = "extensionConfiguration")
    private String extensionConfiguration;

    /**
     * Creates an instance of GrpcExtension class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     * @param endpoint the endpoint value to set.
     * @param image the image value to set.
     * @param dataTransfer the dataTransfer value to set.
     */
    @JsonCreator
    public GrpcExtension(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs,
            @JsonProperty(value = "endpoint", required = true) EndpointBase endpoint,
            @JsonProperty(value = "image", required = true) ImageProperties image,
            @JsonProperty(value = "dataTransfer", required = true) GrpcExtensionDataTransfer dataTransfer) {
        super(name, inputs, endpoint, image);
        this.dataTransfer = dataTransfer;
    }

    /**
     * Get the dataTransfer property: Specifies how media is transferred to the extension plugin.
     *
     * @return the dataTransfer value.
     */
    public GrpcExtensionDataTransfer getDataTransfer() {
        return this.dataTransfer;
    }

    /**
     * Get the extensionConfiguration property: An optional configuration string that is sent to the extension plugin.
     * The configuration string is specific to each custom extension and it not understood neither validated by Video
     * Analyzer. Please see https://aka.ms/ava-extension-grpc for details.
     *
     * @return the extensionConfiguration value.
     */
    public String getExtensionConfiguration() {
        return this.extensionConfiguration;
    }

    /**
     * Set the extensionConfiguration property: An optional configuration string that is sent to the extension plugin.
     * The configuration string is specific to each custom extension and it not understood neither validated by Video
     * Analyzer. Please see https://aka.ms/ava-extension-grpc for details.
     *
     * @param extensionConfiguration the extensionConfiguration value to set.
     * @return the GrpcExtension object itself.
     */
    public GrpcExtension setExtensionConfiguration(String extensionConfiguration) {
        this.extensionConfiguration = extensionConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GrpcExtension setSamplingOptions(SamplingOptions samplingOptions) {
        super.setSamplingOptions(samplingOptions);
        return this;
    }
}
