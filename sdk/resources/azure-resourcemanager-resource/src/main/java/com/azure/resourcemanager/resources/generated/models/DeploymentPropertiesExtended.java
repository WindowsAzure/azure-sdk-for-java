// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Deployment properties with additional details. */
@Immutable
public final class DeploymentPropertiesExtended {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentPropertiesExtended.class);

    /*
     * Denotes the state of provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The correlation ID of the deployment.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /*
     * The timestamp of the template deployment.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The duration of the template deployment.
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /*
     * Key/value pairs that represent deployment output.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /*
     * The list of resource providers needed for the deployment.
     */
    @JsonProperty(value = "providers", access = JsonProperty.Access.WRITE_ONLY)
    private List<ProviderInner> providers;

    /*
     * The list of deployment dependencies.
     */
    @JsonProperty(value = "dependencies", access = JsonProperty.Access.WRITE_ONLY)
    private List<Dependency> dependencies;

    /*
     * The URI referencing the template.
     */
    @JsonProperty(value = "templateLink", access = JsonProperty.Access.WRITE_ONLY)
    private TemplateLink templateLink;

    /*
     * Deployment parameters.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Object parameters;

    /*
     * The URI referencing the parameters.
     */
    @JsonProperty(value = "parametersLink", access = JsonProperty.Access.WRITE_ONLY)
    private ParametersLink parametersLink;

    /*
     * The deployment mode. Possible values are Incremental and Complete.
     */
    @JsonProperty(value = "mode", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentMode mode;

    /*
     * The debug setting of the deployment.
     */
    @JsonProperty(value = "debugSetting", access = JsonProperty.Access.WRITE_ONLY)
    private DebugSetting debugSetting;

    /*
     * The deployment on error behavior.
     */
    @JsonProperty(value = "onErrorDeployment", access = JsonProperty.Access.WRITE_ONLY)
    private OnErrorDeploymentExtended onErrorDeployment;

    /*
     * The hash produced for the template.
     */
    @JsonProperty(value = "templateHash", access = JsonProperty.Access.WRITE_ONLY)
    private String templateHash;

    /*
     * Array of provisioned resources.
     */
    @JsonProperty(value = "outputResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceReference> outputResources;

    /*
     * Array of validated resources.
     */
    @JsonProperty(value = "validatedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceReference> validatedResources;

    /*
     * The deployment error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementError error;

    /**
     * Get the provisioningState property: Denotes the state of provisioning.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the correlationId property: The correlation ID of the deployment.
     *
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the timestamp property: The timestamp of the template deployment.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the duration property: The duration of the template deployment.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Get the outputs property: Key/value pairs that represent deployment output.
     *
     * @return the outputs value.
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the providers property: The list of resource providers needed for the deployment.
     *
     * @return the providers value.
     */
    public List<ProviderInner> providers() {
        return this.providers;
    }

    /**
     * Get the dependencies property: The list of deployment dependencies.
     *
     * @return the dependencies value.
     */
    public List<Dependency> dependencies() {
        return this.dependencies;
    }

    /**
     * Get the templateLink property: The URI referencing the template.
     *
     * @return the templateLink value.
     */
    public TemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Get the parameters property: Deployment parameters.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Get the parametersLink property: The URI referencing the parameters.
     *
     * @return the parametersLink value.
     */
    public ParametersLink parametersLink() {
        return this.parametersLink;
    }

    /**
     * Get the mode property: The deployment mode. Possible values are Incremental and Complete.
     *
     * @return the mode value.
     */
    public DeploymentMode mode() {
        return this.mode;
    }

    /**
     * Get the debugSetting property: The debug setting of the deployment.
     *
     * @return the debugSetting value.
     */
    public DebugSetting debugSetting() {
        return this.debugSetting;
    }

    /**
     * Get the onErrorDeployment property: The deployment on error behavior.
     *
     * @return the onErrorDeployment value.
     */
    public OnErrorDeploymentExtended onErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Get the templateHash property: The hash produced for the template.
     *
     * @return the templateHash value.
     */
    public String templateHash() {
        return this.templateHash;
    }

    /**
     * Get the outputResources property: Array of provisioned resources.
     *
     * @return the outputResources value.
     */
    public List<ResourceReference> outputResources() {
        return this.outputResources;
    }

    /**
     * Get the validatedResources property: Array of validated resources.
     *
     * @return the validatedResources value.
     */
    public List<ResourceReference> validatedResources() {
        return this.validatedResources;
    }

    /**
     * Get the error property: The deployment error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providers() != null) {
            providers().forEach(e -> e.validate());
        }
        if (dependencies() != null) {
            dependencies().forEach(e -> e.validate());
        }
        if (templateLink() != null) {
            templateLink().validate();
        }
        if (parametersLink() != null) {
            parametersLink().validate();
        }
        if (debugSetting() != null) {
            debugSetting().validate();
        }
        if (onErrorDeployment() != null) {
            onErrorDeployment().validate();
        }
        if (outputResources() != null) {
            outputResources().forEach(e -> e.validate());
        }
        if (validatedResources() != null) {
            validatedResources().forEach(e -> e.validate());
        }
    }
}
