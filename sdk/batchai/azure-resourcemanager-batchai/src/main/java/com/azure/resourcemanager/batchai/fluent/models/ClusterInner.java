// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batchai.models.AllocationState;
import com.azure.resourcemanager.batchai.models.BatchAIError;
import com.azure.resourcemanager.batchai.models.NodeSetup;
import com.azure.resourcemanager.batchai.models.NodeStateCounts;
import com.azure.resourcemanager.batchai.models.ProvisioningState;
import com.azure.resourcemanager.batchai.models.ResourceId;
import com.azure.resourcemanager.batchai.models.ScaleSettings;
import com.azure.resourcemanager.batchai.models.UserAccountSettings;
import com.azure.resourcemanager.batchai.models.VirtualMachineConfiguration;
import com.azure.resourcemanager.batchai.models.VmPriority;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Information about a Cluster. */
@JsonFlatten
@Fluent
public class ClusterInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterInner.class);

    /*
     * The size of the virtual machines in the cluster. All nodes in a cluster
     * have the same VM size.
     */
    @JsonProperty(value = "properties.vmSize")
    private String vmSize;

    /*
     * VM priority of cluster nodes.
     */
    @JsonProperty(value = "properties.vmPriority")
    private VmPriority vmPriority;

    /*
     * Scale settings of the cluster.
     */
    @JsonProperty(value = "properties.scaleSettings")
    private ScaleSettings scaleSettings;

    /*
     * Virtual machine configuration (OS image) of the compute nodes. All nodes
     * in a cluster have the same OS image configuration.
     */
    @JsonProperty(value = "properties.virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /*
     * Setup (mount file systems, performance counters settings and custom
     * setup task) to be performed on each compute node in the cluster.
     */
    @JsonProperty(value = "properties.nodeSetup")
    private NodeSetup nodeSetup;

    /*
     * Administrator user account settings which can be used to SSH to compute
     * nodes.
     */
    @JsonProperty(value = "properties.userAccountSettings")
    private UserAccountSettings userAccountSettings;

    /*
     * Virtual network subnet resource ID the cluster nodes belong to.
     */
    @JsonProperty(value = "properties.subnet")
    private ResourceId subnet;

    /*
     * The time when the cluster was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Provisioning state of the cluster. Possible value are: creating -
     * Specifies that the cluster is being created. succeeded - Specifies that
     * the cluster has been created successfully. failed - Specifies that the
     * cluster creation has failed. deleting - Specifies that the cluster is
     * being deleted.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Time when the provisioning state was changed.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningStateTransitionTime;

    /*
     * Allocation state of the cluster. Possible values are: steady - Indicates
     * that the cluster is not resizing. There are no changes to the number of
     * compute nodes in the cluster in progress. A cluster enters this state
     * when it is created and when no operations are being performed on the
     * cluster to change the number of compute nodes. resizing - Indicates that
     * the cluster is resizing; that is, compute nodes are being added to or
     * removed from the cluster.
     */
    @JsonProperty(value = "properties.allocationState", access = JsonProperty.Access.WRITE_ONLY)
    private AllocationState allocationState;

    /*
     * The time at which the cluster entered its current allocation state.
     */
    @JsonProperty(value = "properties.allocationStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime allocationStateTransitionTime;

    /*
     * Collection of errors encountered by various compute nodes during node
     * setup.
     */
    @JsonProperty(value = "properties.errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<BatchAIError> errors;

    /*
     * The number of compute nodes currently assigned to the cluster.
     */
    @JsonProperty(value = "properties.currentNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentNodeCount;

    /*
     * Counts of various node states on the cluster.
     */
    @JsonProperty(value = "properties.nodeStateCounts", access = JsonProperty.Access.WRITE_ONLY)
    private NodeStateCounts nodeStateCounts;

    /**
     * Get the vmSize property: The size of the virtual machines in the cluster. All nodes in a cluster have the same VM
     * size.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: The size of the virtual machines in the cluster. All nodes in a cluster have the same VM
     * size.
     *
     * @param vmSize the vmSize value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the vmPriority property: VM priority of cluster nodes.
     *
     * @return the vmPriority value.
     */
    public VmPriority vmPriority() {
        return this.vmPriority;
    }

    /**
     * Set the vmPriority property: VM priority of cluster nodes.
     *
     * @param vmPriority the vmPriority value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmPriority(VmPriority vmPriority) {
        this.vmPriority = vmPriority;
        return this;
    }

    /**
     * Get the scaleSettings property: Scale settings of the cluster.
     *
     * @return the scaleSettings value.
     */
    public ScaleSettings scaleSettings() {
        return this.scaleSettings;
    }

    /**
     * Set the scaleSettings property: Scale settings of the cluster.
     *
     * @param scaleSettings the scaleSettings value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withScaleSettings(ScaleSettings scaleSettings) {
        this.scaleSettings = scaleSettings;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration property: Virtual machine configuration (OS image) of the compute nodes. All
     * nodes in a cluster have the same OS image configuration.
     *
     * @return the virtualMachineConfiguration value.
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration property: Virtual machine configuration (OS image) of the compute nodes. All
     * nodes in a cluster have the same OS image configuration.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the nodeSetup property: Setup (mount file systems, performance counters settings and custom setup task) to be
     * performed on each compute node in the cluster.
     *
     * @return the nodeSetup value.
     */
    public NodeSetup nodeSetup() {
        return this.nodeSetup;
    }

    /**
     * Set the nodeSetup property: Setup (mount file systems, performance counters settings and custom setup task) to be
     * performed on each compute node in the cluster.
     *
     * @param nodeSetup the nodeSetup value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNodeSetup(NodeSetup nodeSetup) {
        this.nodeSetup = nodeSetup;
        return this;
    }

    /**
     * Get the userAccountSettings property: Administrator user account settings which can be used to SSH to compute
     * nodes.
     *
     * @return the userAccountSettings value.
     */
    public UserAccountSettings userAccountSettings() {
        return this.userAccountSettings;
    }

    /**
     * Set the userAccountSettings property: Administrator user account settings which can be used to SSH to compute
     * nodes.
     *
     * @param userAccountSettings the userAccountSettings value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUserAccountSettings(UserAccountSettings userAccountSettings) {
        this.userAccountSettings = userAccountSettings;
        return this;
    }

    /**
     * Get the subnet property: Virtual network subnet resource ID the cluster nodes belong to.
     *
     * @return the subnet value.
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Virtual network subnet resource ID the cluster nodes belong to.
     *
     * @param subnet the subnet value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the creationTime property: The time when the cluster was created.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState property: Provisioning state of the cluster. Possible value are: creating - Specifies
     * that the cluster is being created. succeeded - Specifies that the cluster has been created successfully. failed -
     * Specifies that the cluster creation has failed. deleting - Specifies that the cluster is being deleted.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningStateTransitionTime property: Time when the provisioning state was changed.
     *
     * @return the provisioningStateTransitionTime value.
     */
    public OffsetDateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the allocationState property: Allocation state of the cluster. Possible values are: steady - Indicates that
     * the cluster is not resizing. There are no changes to the number of compute nodes in the cluster in progress. A
     * cluster enters this state when it is created and when no operations are being performed on the cluster to change
     * the number of compute nodes. resizing - Indicates that the cluster is resizing; that is, compute nodes are being
     * added to or removed from the cluster.
     *
     * @return the allocationState value.
     */
    public AllocationState allocationState() {
        return this.allocationState;
    }

    /**
     * Get the allocationStateTransitionTime property: The time at which the cluster entered its current allocation
     * state.
     *
     * @return the allocationStateTransitionTime value.
     */
    public OffsetDateTime allocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    /**
     * Get the errors property: Collection of errors encountered by various compute nodes during node setup.
     *
     * @return the errors value.
     */
    public List<BatchAIError> errors() {
        return this.errors;
    }

    /**
     * Get the currentNodeCount property: The number of compute nodes currently assigned to the cluster.
     *
     * @return the currentNodeCount value.
     */
    public Integer currentNodeCount() {
        return this.currentNodeCount;
    }

    /**
     * Get the nodeStateCounts property: Counts of various node states on the cluster.
     *
     * @return the nodeStateCounts value.
     */
    public NodeStateCounts nodeStateCounts() {
        return this.nodeStateCounts;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scaleSettings() != null) {
            scaleSettings().validate();
        }
        if (virtualMachineConfiguration() != null) {
            virtualMachineConfiguration().validate();
        }
        if (nodeSetup() != null) {
            nodeSetup().validate();
        }
        if (userAccountSettings() != null) {
            userAccountSettings().validate();
        }
        if (subnet() != null) {
            subnet().validate();
        }
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
        if (nodeStateCounts() != null) {
            nodeStateCounts().validate();
        }
    }
}