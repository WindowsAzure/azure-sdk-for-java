// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The Docker build step. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Docker")
@Fluent
public final class DockerTaskStep extends TaskStepProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DockerTaskStep.class);

    /*
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /*
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /*
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /*
     * The Docker file path relative to the source context.
     */
    @JsonProperty(value = "dockerFilePath", required = true)
    private String dockerFilePath;

    /*
     * The name of the target build stage for the docker build.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The collection of override arguments to be used when executing this
     * build step.
     */
    @JsonProperty(value = "arguments")
    private List<Argument> arguments;

    /**
     * Get the imageNames property: The fully qualified image names including the repository and tag.
     *
     * @return the imageNames value.
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the imageNames property: The fully qualified image names including the repository and tag.
     *
     * @param imageNames the imageNames value to set.
     * @return the DockerTaskStep object itself.
     */
    public DockerTaskStep withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the isPushEnabled property: The value of this property indicates whether the image built should be pushed to
     * the registry or not.
     *
     * @return the isPushEnabled value.
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the isPushEnabled property: The value of this property indicates whether the image built should be pushed to
     * the registry or not.
     *
     * @param isPushEnabled the isPushEnabled value to set.
     * @return the DockerTaskStep object itself.
     */
    public DockerTaskStep withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the noCache property: The value of this property indicates whether the image cache is enabled or not.
     *
     * @return the noCache value.
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the noCache property: The value of this property indicates whether the image cache is enabled or not.
     *
     * @param noCache the noCache value to set.
     * @return the DockerTaskStep object itself.
     */
    public DockerTaskStep withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the dockerFilePath property: The Docker file path relative to the source context.
     *
     * @return the dockerFilePath value.
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the dockerFilePath property: The Docker file path relative to the source context.
     *
     * @param dockerFilePath the dockerFilePath value to set.
     * @return the DockerTaskStep object itself.
     */
    public DockerTaskStep withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

    /**
     * Get the target property: The name of the target build stage for the docker build.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The name of the target build stage for the docker build.
     *
     * @param target the target value to set.
     * @return the DockerTaskStep object itself.
     */
    public DockerTaskStep withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the arguments property: The collection of override arguments to be used when executing this build step.
     *
     * @return the arguments value.
     */
    public List<Argument> arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: The collection of override arguments to be used when executing this build step.
     *
     * @param arguments the arguments value to set.
     * @return the DockerTaskStep object itself.
     */
    public DockerTaskStep withArguments(List<Argument> arguments) {
        this.arguments = arguments;
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
        if (dockerFilePath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dockerFilePath in model DockerTaskStep"));
        }
        if (arguments() != null) {
            arguments().forEach(e -> e.validate());
        }
    }
}
