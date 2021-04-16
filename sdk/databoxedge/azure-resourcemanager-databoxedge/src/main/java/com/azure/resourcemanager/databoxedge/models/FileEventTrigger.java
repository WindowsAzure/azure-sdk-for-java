// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.models.TriggerInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FileEvent")
@JsonFlatten
@Fluent
public class FileEventTrigger extends TriggerInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileEventTrigger.class);

    /*
     * File event source details.
     */
    @JsonProperty(value = "properties.sourceInfo", required = true)
    private FileSourceInfo sourceInfo;

    /*
     * Role sink info.
     */
    @JsonProperty(value = "properties.sinkInfo", required = true)
    private RoleSinkInfo sinkInfo;

    /*
     * A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain
     * specific IoT modules in the device, the tag can be the name or the image
     * URL of the module.
     */
    @JsonProperty(value = "properties.customContextTag")
    private String customContextTag;

    /**
     * Get the sourceInfo property: File event source details.
     *
     * @return the sourceInfo value.
     */
    public FileSourceInfo sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set the sourceInfo property: File event source details.
     *
     * @param sourceInfo the sourceInfo value to set.
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withSourceInfo(FileSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get the sinkInfo property: Role sink info.
     *
     * @return the sinkInfo value.
     */
    public RoleSinkInfo sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Set the sinkInfo property: Role sink info.
     *
     * @param sinkInfo the sinkInfo value to set.
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withSinkInfo(RoleSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
        return this;
    }

    /**
     * Get the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     *
     * @return the customContextTag value.
     */
    public String customContextTag() {
        return this.customContextTag;
    }

    /**
     * Set the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     *
     * @param customContextTag the customContextTag value to set.
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withCustomContextTag(String customContextTag) {
        this.customContextTag = customContextTag;
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
        if (sourceInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sourceInfo in model FileEventTrigger"));
        } else {
            sourceInfo().validate();
        }
        if (sinkInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sinkInfo in model FileEventTrigger"));
        } else {
            sinkInfo().validate();
        }
    }
}
