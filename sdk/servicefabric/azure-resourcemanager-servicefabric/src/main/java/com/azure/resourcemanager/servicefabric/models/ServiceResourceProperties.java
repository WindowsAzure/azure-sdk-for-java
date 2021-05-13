// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The service resource properties. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "serviceKind",
    defaultImpl = ServiceResourceProperties.class)
@JsonTypeName("ServiceResourceProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceProperties.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceProperties.class)
})
@Fluent
public class ServiceResourceProperties extends ServiceResourcePropertiesBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceResourceProperties.class);

    /*
     * The current deployment or provisioning state, which only appears in the
     * response
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The name of the service type
     */
    @JsonProperty(value = "serviceTypeName")
    private String serviceTypeName;

    /*
     * Describes how the service is partitioned.
     */
    @JsonProperty(value = "partitionDescription")
    private PartitionSchemeDescription partitionDescription;

    /*
     * The activation Mode of the service package
     */
    @JsonProperty(value = "servicePackageActivationMode")
    private ArmServicePackageActivationMode servicePackageActivationMode;

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the serviceTypeName property: The name of the service type.
     *
     * @return the serviceTypeName value.
     */
    public String serviceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set the serviceTypeName property: The name of the service type.
     *
     * @param serviceTypeName the serviceTypeName value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the partitionDescription property: Describes how the service is partitioned.
     *
     * @return the partitionDescription value.
     */
    public PartitionSchemeDescription partitionDescription() {
        return this.partitionDescription;
    }

    /**
     * Set the partitionDescription property: Describes how the service is partitioned.
     *
     * @param partitionDescription the partitionDescription value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties withPartitionDescription(PartitionSchemeDescription partitionDescription) {
        this.partitionDescription = partitionDescription;
        return this;
    }

    /**
     * Get the servicePackageActivationMode property: The activation Mode of the service package.
     *
     * @return the servicePackageActivationMode value.
     */
    public ArmServicePackageActivationMode servicePackageActivationMode() {
        return this.servicePackageActivationMode;
    }

    /**
     * Set the servicePackageActivationMode property: The activation Mode of the service package.
     *
     * @param servicePackageActivationMode the servicePackageActivationMode value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties withServicePackageActivationMode(
        ArmServicePackageActivationMode servicePackageActivationMode) {
        this.servicePackageActivationMode = servicePackageActivationMode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withPlacementConstraints(String placementConstraints) {
        super.withPlacementConstraints(placementConstraints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        super.withCorrelationScheme(correlationScheme);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withServiceLoadMetrics(List<ServiceLoadMetricDescription> serviceLoadMetrics) {
        super.withServiceLoadMetrics(serviceLoadMetrics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withServicePlacementPolicies(
        List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        super.withServicePlacementPolicies(servicePlacementPolicies);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withDefaultMoveCost(MoveCost defaultMoveCost) {
        super.withDefaultMoveCost(defaultMoveCost);
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
        if (partitionDescription() != null) {
            partitionDescription().validate();
        }
    }
}
