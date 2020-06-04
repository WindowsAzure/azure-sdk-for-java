// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The EncodedTaskRunRequest model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("EncodedTaskRunRequest")
@Fluent
public final class EncodedTaskRunRequest extends RunRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncodedTaskRunRequest.class);

    /*
     * Base64 encoded value of the template/definition file content.
     */
    @JsonProperty(value = "encodedTaskContent", required = true)
    private String encodedTaskContent;

    /*
     * Base64 encoded value of the parameters/values file content.
     */
    @JsonProperty(value = "encodedValuesContent")
    private String encodedValuesContent;

    /*
     * The collection of overridable values that can be passed when running a
     * task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /*
     * Run timeout in seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /*
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "platform", required = true)
    private PlatformProperties platform;

    /*
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "agentConfiguration")
    private AgentProperties agentConfiguration;

    /*
     * The URL(absolute or relative) of the source context. It can be an URL to
     * a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     */
    @JsonProperty(value = "sourceLocation")
    private String sourceLocation;

    /*
     * The properties that describes a set of credentials that will be used
     * when this run is invoked.
     */
    @JsonProperty(value = "credentials")
    private Credentials credentials;

    /**
     * Get the encodedTaskContent property: Base64 encoded value of the template/definition file content.
     *
     * @return the encodedTaskContent value.
     */
    public String encodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Set the encodedTaskContent property: Base64 encoded value of the template/definition file content.
     *
     * @param encodedTaskContent the encodedTaskContent value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withEncodedTaskContent(String encodedTaskContent) {
        this.encodedTaskContent = encodedTaskContent;
        return this;
    }

    /**
     * Get the encodedValuesContent property: Base64 encoded value of the parameters/values file content.
     *
     * @return the encodedValuesContent value.
     */
    public String encodedValuesContent() {
        return this.encodedValuesContent;
    }

    /**
     * Set the encodedValuesContent property: Base64 encoded value of the parameters/values file content.
     *
     * @param encodedValuesContent the encodedValuesContent value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withEncodedValuesContent(String encodedValuesContent) {
        this.encodedValuesContent = encodedValuesContent;
        return this;
    }

    /**
     * Get the values property: The collection of overridable values that can be passed when running a task.
     *
     * @return the values value.
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the values property: The collection of overridable values that can be passed when running a task.
     *
     * @param values the values value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the timeout property: Run timeout in seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Run timeout in seconds.
     *
     * @param timeout the timeout value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run has to happen.
     *
     * @return the platform value.
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform properties against which the run has to happen.
     *
     * @param platform the platform value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     *
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the sourceLocation property: The URL(absolute or relative) of the source context. It can be an URL to a tar
     * or git repository. If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     *
     * @return the sourceLocation value.
     */
    public String sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the sourceLocation property: The URL(absolute or relative) of the source context. It can be an URL to a tar
     * or git repository. If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     *
     * @param sourceLocation the sourceLocation value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @return the credentials value.
     */
    public Credentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @param credentials the credentials value to set.
     * @return the EncodedTaskRunRequest object itself.
     */
    public EncodedTaskRunRequest withCredentials(Credentials credentials) {
        this.credentials = credentials;
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
        if (encodedTaskContent() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property encodedTaskContent in model EncodedTaskRunRequest"));
        }
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
        if (platform() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property platform in model EncodedTaskRunRequest"));
        } else {
            platform().validate();
        }
        if (agentConfiguration() != null) {
            agentConfiguration().validate();
        }
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
