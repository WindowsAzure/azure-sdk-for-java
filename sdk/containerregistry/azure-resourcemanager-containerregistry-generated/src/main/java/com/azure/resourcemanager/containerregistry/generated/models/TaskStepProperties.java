// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Base properties for any task step. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = TaskStepProperties.class)
@JsonTypeName("TaskStepProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FileTask", value = FileTaskStep.class),
    @JsonSubTypes.Type(name = "EncodedTask", value = EncodedTaskStep.class),
    @JsonSubTypes.Type(name = "Docker", value = DockerTaskStep.class)
})
@Fluent
public class TaskStepProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TaskStepProperties.class);

    /*
     * List of base image dependencies for a step.
     */
    @JsonProperty(value = "baseImageDependencies", access = JsonProperty.Access.WRITE_ONLY)
    private List<BaseImageDependency> baseImageDependencies;

    /*
     * The URL(absolute or relative) of the source context for the task step.
     */
    @JsonProperty(value = "contextPath")
    private String contextPath;

    /*
     * The token (git PAT or SAS token of storage account blob) associated with
     * the context for a step.
     */
    @JsonProperty(value = "contextAccessToken")
    private String contextAccessToken;

    /**
     * Get the baseImageDependencies property: List of base image dependencies for a step.
     *
     * @return the baseImageDependencies value.
     */
    public List<BaseImageDependency> baseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * Get the contextPath property: The URL(absolute or relative) of the source context for the task step.
     *
     * @return the contextPath value.
     */
    public String contextPath() {
        return this.contextPath;
    }

    /**
     * Set the contextPath property: The URL(absolute or relative) of the source context for the task step.
     *
     * @param contextPath the contextPath value to set.
     * @return the TaskStepProperties object itself.
     */
    public TaskStepProperties withContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }

    /**
     * Get the contextAccessToken property: The token (git PAT or SAS token of storage account blob) associated with the
     * context for a step.
     *
     * @return the contextAccessToken value.
     */
    public String contextAccessToken() {
        return this.contextAccessToken;
    }

    /**
     * Set the contextAccessToken property: The token (git PAT or SAS token of storage account blob) associated with the
     * context for a step.
     *
     * @param contextAccessToken the contextAccessToken value to set.
     * @return the TaskStepProperties object itself.
     */
    public TaskStepProperties withContextAccessToken(String contextAccessToken) {
        this.contextAccessToken = contextAccessToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseImageDependencies() != null) {
            baseImageDependencies().forEach(e -> e.validate());
        }
    }
}
