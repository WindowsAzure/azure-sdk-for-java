// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The response for an AKS service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("AKS")
@Fluent
public final class AksServiceResponse extends AksVariantResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AksServiceResponse.class);

    /*
     * The list of models.
     */
    @JsonProperty(value = "models")
    private List<Model> models;

    /*
     * The container resource requirements.
     */
    @JsonProperty(value = "containerResourceRequirements")
    private ContainerResourceRequirements containerResourceRequirements;

    /*
     * The maximum number of concurrent requests per container.
     */
    @JsonProperty(value = "maxConcurrentRequestsPerContainer")
    private Integer maxConcurrentRequestsPerContainer;

    /*
     * Maximum time a request will wait in the queue (in milliseconds). After
     * this time, the service will return 503 (Service Unavailable)
     */
    @JsonProperty(value = "maxQueueWaitMs")
    private Integer maxQueueWaitMs;

    /*
     * The name of the compute resource.
     */
    @JsonProperty(value = "computeName")
    private String computeName;

    /*
     * The Kubernetes namespace of the deployment.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * The number of replicas on the cluster.
     */
    @JsonProperty(value = "numReplicas")
    private Integer numReplicas;

    /*
     * Details of the data collection options specified.
     */
    @JsonProperty(value = "dataCollection")
    private AksServiceResponseDataCollection dataCollection;

    /*
     * Whether or not Application Insights is enabled.
     */
    @JsonProperty(value = "appInsightsEnabled")
    private Boolean appInsightsEnabled;

    /*
     * The auto scaler properties.
     */
    @JsonProperty(value = "autoScaler")
    private AksServiceResponseAutoScaler autoScaler;

    /*
     * The Uri for sending scoring requests.
     */
    @JsonProperty(value = "scoringUri", access = JsonProperty.Access.WRITE_ONLY)
    private String scoringUri;

    /*
     * The deployment status.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private AksServiceResponseDeploymentStatus deploymentStatus;

    /*
     * The scoring timeout in milliseconds.
     */
    @JsonProperty(value = "scoringTimeoutMs")
    private Integer scoringTimeoutMs;

    /*
     * The liveness probe requirements.
     */
    @JsonProperty(value = "livenessProbeRequirements")
    private AksServiceResponseLivenessProbeRequirements livenessProbeRequirements;

    /*
     * Whether or not authentication is enabled.
     */
    @JsonProperty(value = "authEnabled")
    private Boolean authEnabled;

    /*
     * Whether or not AAD authentication is enabled.
     */
    @JsonProperty(value = "aadAuthEnabled")
    private Boolean aadAuthEnabled;

    /*
     * The Uri for sending swagger requests.
     */
    @JsonProperty(value = "swaggerUri", access = JsonProperty.Access.WRITE_ONLY)
    private String swaggerUri;

    /*
     * Details on the models and configurations.
     */
    @JsonProperty(value = "modelConfigMap", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, Object> modelConfigMap;

    /*
     * The Environment, models and assets used for inferencing.
     */
    @JsonProperty(value = "environmentImageRequest")
    private AksServiceResponseEnvironmentImageRequest environmentImageRequest;

    /**
     * Get the models property: The list of models.
     *
     * @return the models value.
     */
    public List<Model> models() {
        return this.models;
    }

    /**
     * Set the models property: The list of models.
     *
     * @param models the models value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withModels(List<Model> models) {
        this.models = models;
        return this;
    }

    /**
     * Get the containerResourceRequirements property: The container resource requirements.
     *
     * @return the containerResourceRequirements value.
     */
    public ContainerResourceRequirements containerResourceRequirements() {
        return this.containerResourceRequirements;
    }

    /**
     * Set the containerResourceRequirements property: The container resource requirements.
     *
     * @param containerResourceRequirements the containerResourceRequirements value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withContainerResourceRequirements(
        ContainerResourceRequirements containerResourceRequirements) {
        this.containerResourceRequirements = containerResourceRequirements;
        return this;
    }

    /**
     * Get the maxConcurrentRequestsPerContainer property: The maximum number of concurrent requests per container.
     *
     * @return the maxConcurrentRequestsPerContainer value.
     */
    public Integer maxConcurrentRequestsPerContainer() {
        return this.maxConcurrentRequestsPerContainer;
    }

    /**
     * Set the maxConcurrentRequestsPerContainer property: The maximum number of concurrent requests per container.
     *
     * @param maxConcurrentRequestsPerContainer the maxConcurrentRequestsPerContainer value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withMaxConcurrentRequestsPerContainer(Integer maxConcurrentRequestsPerContainer) {
        this.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
        return this;
    }

    /**
     * Get the maxQueueWaitMs property: Maximum time a request will wait in the queue (in milliseconds). After this
     * time, the service will return 503 (Service Unavailable).
     *
     * @return the maxQueueWaitMs value.
     */
    public Integer maxQueueWaitMs() {
        return this.maxQueueWaitMs;
    }

    /**
     * Set the maxQueueWaitMs property: Maximum time a request will wait in the queue (in milliseconds). After this
     * time, the service will return 503 (Service Unavailable).
     *
     * @param maxQueueWaitMs the maxQueueWaitMs value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withMaxQueueWaitMs(Integer maxQueueWaitMs) {
        this.maxQueueWaitMs = maxQueueWaitMs;
        return this;
    }

    /**
     * Get the computeName property: The name of the compute resource.
     *
     * @return the computeName value.
     */
    public String computeName() {
        return this.computeName;
    }

    /**
     * Set the computeName property: The name of the compute resource.
     *
     * @param computeName the computeName value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withComputeName(String computeName) {
        this.computeName = computeName;
        return this;
    }

    /**
     * Get the namespace property: The Kubernetes namespace of the deployment.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The Kubernetes namespace of the deployment.
     *
     * @param namespace the namespace value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the numReplicas property: The number of replicas on the cluster.
     *
     * @return the numReplicas value.
     */
    public Integer numReplicas() {
        return this.numReplicas;
    }

    /**
     * Set the numReplicas property: The number of replicas on the cluster.
     *
     * @param numReplicas the numReplicas value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
        return this;
    }

    /**
     * Get the dataCollection property: Details of the data collection options specified.
     *
     * @return the dataCollection value.
     */
    public AksServiceResponseDataCollection dataCollection() {
        return this.dataCollection;
    }

    /**
     * Set the dataCollection property: Details of the data collection options specified.
     *
     * @param dataCollection the dataCollection value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withDataCollection(AksServiceResponseDataCollection dataCollection) {
        this.dataCollection = dataCollection;
        return this;
    }

    /**
     * Get the appInsightsEnabled property: Whether or not Application Insights is enabled.
     *
     * @return the appInsightsEnabled value.
     */
    public Boolean appInsightsEnabled() {
        return this.appInsightsEnabled;
    }

    /**
     * Set the appInsightsEnabled property: Whether or not Application Insights is enabled.
     *
     * @param appInsightsEnabled the appInsightsEnabled value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withAppInsightsEnabled(Boolean appInsightsEnabled) {
        this.appInsightsEnabled = appInsightsEnabled;
        return this;
    }

    /**
     * Get the autoScaler property: The auto scaler properties.
     *
     * @return the autoScaler value.
     */
    public AksServiceResponseAutoScaler autoScaler() {
        return this.autoScaler;
    }

    /**
     * Set the autoScaler property: The auto scaler properties.
     *
     * @param autoScaler the autoScaler value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withAutoScaler(AksServiceResponseAutoScaler autoScaler) {
        this.autoScaler = autoScaler;
        return this;
    }

    /**
     * Get the scoringUri property: The Uri for sending scoring requests.
     *
     * @return the scoringUri value.
     */
    public String scoringUri() {
        return this.scoringUri;
    }

    /**
     * Get the deploymentStatus property: The deployment status.
     *
     * @return the deploymentStatus value.
     */
    public AksServiceResponseDeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the scoringTimeoutMs property: The scoring timeout in milliseconds.
     *
     * @return the scoringTimeoutMs value.
     */
    public Integer scoringTimeoutMs() {
        return this.scoringTimeoutMs;
    }

    /**
     * Set the scoringTimeoutMs property: The scoring timeout in milliseconds.
     *
     * @param scoringTimeoutMs the scoringTimeoutMs value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withScoringTimeoutMs(Integer scoringTimeoutMs) {
        this.scoringTimeoutMs = scoringTimeoutMs;
        return this;
    }

    /**
     * Get the livenessProbeRequirements property: The liveness probe requirements.
     *
     * @return the livenessProbeRequirements value.
     */
    public AksServiceResponseLivenessProbeRequirements livenessProbeRequirements() {
        return this.livenessProbeRequirements;
    }

    /**
     * Set the livenessProbeRequirements property: The liveness probe requirements.
     *
     * @param livenessProbeRequirements the livenessProbeRequirements value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withLivenessProbeRequirements(
        AksServiceResponseLivenessProbeRequirements livenessProbeRequirements) {
        this.livenessProbeRequirements = livenessProbeRequirements;
        return this;
    }

    /**
     * Get the authEnabled property: Whether or not authentication is enabled.
     *
     * @return the authEnabled value.
     */
    public Boolean authEnabled() {
        return this.authEnabled;
    }

    /**
     * Set the authEnabled property: Whether or not authentication is enabled.
     *
     * @param authEnabled the authEnabled value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }

    /**
     * Get the aadAuthEnabled property: Whether or not AAD authentication is enabled.
     *
     * @return the aadAuthEnabled value.
     */
    public Boolean aadAuthEnabled() {
        return this.aadAuthEnabled;
    }

    /**
     * Set the aadAuthEnabled property: Whether or not AAD authentication is enabled.
     *
     * @param aadAuthEnabled the aadAuthEnabled value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withAadAuthEnabled(Boolean aadAuthEnabled) {
        this.aadAuthEnabled = aadAuthEnabled;
        return this;
    }

    /**
     * Get the swaggerUri property: The Uri for sending swagger requests.
     *
     * @return the swaggerUri value.
     */
    public String swaggerUri() {
        return this.swaggerUri;
    }

    /**
     * Get the modelConfigMap property: Details on the models and configurations.
     *
     * @return the modelConfigMap value.
     */
    public Map<String, Object> modelConfigMap() {
        return this.modelConfigMap;
    }

    /**
     * Get the environmentImageRequest property: The Environment, models and assets used for inferencing.
     *
     * @return the environmentImageRequest value.
     */
    public AksServiceResponseEnvironmentImageRequest environmentImageRequest() {
        return this.environmentImageRequest;
    }

    /**
     * Set the environmentImageRequest property: The Environment, models and assets used for inferencing.
     *
     * @param environmentImageRequest the environmentImageRequest value to set.
     * @return the AksServiceResponse object itself.
     */
    public AksServiceResponse withEnvironmentImageRequest(
        AksServiceResponseEnvironmentImageRequest environmentImageRequest) {
        this.environmentImageRequest = environmentImageRequest;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withIsDefault(Boolean isDefault) {
        super.withIsDefault(isDefault);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withTrafficPercentile(Float trafficPercentile) {
        super.withTrafficPercentile(trafficPercentile);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withType(VariantType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withKvTags(Map<String, String> kvTags) {
        super.withKvTags(kvTags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponse withDeploymentType(DeploymentType deploymentType) {
        super.withDeploymentType(deploymentType);
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
        if (models() != null) {
            models().forEach(e -> e.validate());
        }
        if (containerResourceRequirements() != null) {
            containerResourceRequirements().validate();
        }
        if (dataCollection() != null) {
            dataCollection().validate();
        }
        if (autoScaler() != null) {
            autoScaler().validate();
        }
        if (deploymentStatus() != null) {
            deploymentStatus().validate();
        }
        if (livenessProbeRequirements() != null) {
            livenessProbeRequirements().validate();
        }
        if (environmentImageRequest() != null) {
            environmentImageRequest().validate();
        }
    }
}
