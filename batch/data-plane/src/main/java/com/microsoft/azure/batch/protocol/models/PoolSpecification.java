// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification for creating a new pool.
 */
public class PoolSpecification {
    /**
     * The display name for the pool.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The size of the virtual machines in the pool. All virtual machines in a
     * pool are the same size.
     * For information about available sizes of virtual machines in pools, see
     * Choose a VM size for compute nodes in an Azure Batch pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @JsonProperty(value = "vmSize", required = true)
    private String vmSize;

    /**
     * The cloud service configuration for the pool.
     * This property must be specified if the pool needs to be created with
     * Azure PaaS VMs. This property and virtualMachineConfiguration are
     * mutually exclusive and one of the properties must be specified. If
     * neither is specified then the Batch service returns an error; if you are
     * calling the REST API directly, the HTTP status code is 400 (Bad
     * Request). This property cannot be specified if the Batch account was
     * created with its poolAllocationMode property set to 'UserSubscription'.
     */
    @JsonProperty(value = "cloudServiceConfiguration")
    private CloudServiceConfiguration cloudServiceConfiguration;

    /**
     * The virtual machine configuration for the pool.
     * This property must be specified if the pool needs to be created with
     * Azure IaaS VMs. This property and cloudServiceConfiguration are mutually
     * exclusive and one of the properties must be specified. If neither is
     * specified then the Batch service returns an error; if you are calling
     * the REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @JsonProperty(value = "virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /**
     * The maximum number of tasks that can run concurrently on a single
     * compute node in the pool.
     * The default value is 1. The maximum value of this setting depends on the
     * size of the compute nodes in the pool (the vmSize setting).
     */
    @JsonProperty(value = "maxTasksPerNode")
    private Integer maxTasksPerNode;

    /**
     * How tasks are distributed across compute nodes in a pool.
     */
    @JsonProperty(value = "taskSchedulingPolicy")
    private TaskSchedulingPolicy taskSchedulingPolicy;

    /**
     * The timeout for allocation of compute nodes to the pool.
     * This timeout applies only to manual scaling; it has no effect when
     * enableAutoScale is set to true. The default value is 15 minutes. The
     * minimum value is 5 minutes. If you specify a value less than 5 minutes,
     * the Batch service rejects the request with an error; if you are calling
     * the REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * The desired number of dedicated compute nodes in the pool.
     * This property must not be specified if enableAutoScale is set to true.
     * If enableAutoScale is set to false, then you must set either
     * targetDedicatedNodes, targetLowPriorityNodes, or both.
     */
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /**
     * The desired number of low-priority compute nodes in the pool.
     * This property must not be specified if enableAutoScale is set to true.
     * If enableAutoScale is set to false, then you must set either
     * targetDedicatedNodes, targetLowPriorityNodes, or both.
     */
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /**
     * Whether the pool size should automatically adjust over time.
     * If false, at least one of targetDedicateNodes and targetLowPriorityNodes
     * must be specified. If true, the autoScaleFormula element is required.
     * The pool automatically resizes according to the formula. The default
     * value is false.
     */
    @JsonProperty(value = "enableAutoScale")
    private Boolean enableAutoScale;

    /**
     * The formula for the desired number of compute nodes in the pool.
     * This property must not be specified if enableAutoScale is set to false.
     * It is required if enableAutoScale is set to true. The formula is checked
     * for validity before the pool is created. If the formula is not valid,
     * the Batch service rejects the request with detailed error information.
     */
    @JsonProperty(value = "autoScaleFormula")
    private String autoScaleFormula;

    /**
     * The time interval at which to automatically adjust the pool size
     * according to the autoscale formula.
     * The default value is 15 minutes. The minimum and maximum value are 5
     * minutes and 168 hours respectively. If you specify a value less than 5
     * minutes or greater than 168 hours, the Batch service rejects the request
     * with an invalid property value error; if you are calling the REST API
     * directly, the HTTP status code is 400 (Bad Request).
     */
    @JsonProperty(value = "autoScaleEvaluationInterval")
    private Period autoScaleEvaluationInterval;

    /**
     * Whether the pool permits direct communication between nodes.
     * Enabling inter-node communication limits the maximum size of the pool
     * due to deployment restrictions on the nodes of the pool. This may result
     * in the pool not reaching its desired size. The default value is false.
     */
    @JsonProperty(value = "enableInterNodeCommunication")
    private Boolean enableInterNodeCommunication;

    /**
     * The network configuration for the pool.
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /**
     * A task to run on each compute node as it joins the pool. The task runs
     * when the node is added to the pool or when the node is restarted.
     */
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /**
     * A list of certificates to be installed on each compute node in the pool.
     * For Windows compute nodes, the Batch service installs the certificates
     * to the specified certificate store and location. For Linux compute
     * nodes, the certificates are stored in a directory inside the task
     * working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR
     * is supplied to the task to query for this location. For certificates
     * with visibility of 'remoteUser', a 'certs' directory is created in the
     * user's home directory (e.g., /home/{user-name}/certs) and certificates
     * are placed in that directory.
     */
    @JsonProperty(value = "certificateReferences")
    private List<CertificateReference> certificateReferences;

    /**
     * The list of application packages to be installed on each compute node in
     * the pool.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The list of application licenses the Batch service will make available
     * on each compute node in the pool.
     * The list of application licenses must be a subset of available Batch
     * service application licenses. If a license is requested which is not
     * supported, pool creation will fail. The permitted licenses available on
     * the pool are 'maya', 'vray', '3dsmax', 'arnold'. An additional charge
     * applies for each application license added to the pool.
     */
    @JsonProperty(value = "applicationLicenses")
    private List<String> applicationLicenses;

    /**
     * The list of user accounts to be created on each node in the pool.
     */
    @JsonProperty(value = "userAccounts")
    private List<UserAccount> userAccounts;

    /**
     * A list of name-value pairs associated with the pool as metadata.
     * The Batch service does not assign any meaning to metadata; it is solely
     * for the use of user code.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get the display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get for information about available sizes of virtual machines in pools, see Choose a VM size for compute nodes in an Azure Batch pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set for information about available sizes of virtual machines in pools, see Choose a VM size for compute nodes in an Azure Batch pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @param vmSize the vmSize value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get this property must be specified if the pool needs to be created with Azure PaaS VMs. This property and virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. If neither is specified then the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). This property cannot be specified if the Batch account was created with its poolAllocationMode property set to 'UserSubscription'.
     *
     * @return the cloudServiceConfiguration value
     */
    public CloudServiceConfiguration cloudServiceConfiguration() {
        return this.cloudServiceConfiguration;
    }

    /**
     * Set this property must be specified if the pool needs to be created with Azure PaaS VMs. This property and virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. If neither is specified then the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). This property cannot be specified if the Batch account was created with its poolAllocationMode property set to 'UserSubscription'.
     *
     * @param cloudServiceConfiguration the cloudServiceConfiguration value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withCloudServiceConfiguration(CloudServiceConfiguration cloudServiceConfiguration) {
        this.cloudServiceConfiguration = cloudServiceConfiguration;
        return this;
    }

    /**
     * Get this property must be specified if the pool needs to be created with Azure IaaS VMs. This property and cloudServiceConfiguration are mutually exclusive and one of the properties must be specified. If neither is specified then the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the virtualMachineConfiguration value
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set this property must be specified if the pool needs to be created with Azure IaaS VMs. This property and cloudServiceConfiguration are mutually exclusive and one of the properties must be specified. If neither is specified then the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the default value is 1. The maximum value of this setting depends on the size of the compute nodes in the pool (the vmSize setting).
     *
     * @return the maxTasksPerNode value
     */
    public Integer maxTasksPerNode() {
        return this.maxTasksPerNode;
    }

    /**
     * Set the default value is 1. The maximum value of this setting depends on the size of the compute nodes in the pool (the vmSize setting).
     *
     * @param maxTasksPerNode the maxTasksPerNode value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withMaxTasksPerNode(Integer maxTasksPerNode) {
        this.maxTasksPerNode = maxTasksPerNode;
        return this;
    }

    /**
     * Get the taskSchedulingPolicy value.
     *
     * @return the taskSchedulingPolicy value
     */
    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }

    /**
     * Set the taskSchedulingPolicy value.
     *
     * @param taskSchedulingPolicy the taskSchedulingPolicy value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        return this;
    }

    /**
     * Get this timeout applies only to manual scaling; it has no effect when enableAutoScale is set to true. The default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service rejects the request with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set this timeout applies only to manual scaling; it has no effect when enableAutoScale is set to true. The default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service rejects the request with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get this property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @return the targetDedicatedNodes value
     */
    public Integer targetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set this property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get this property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @return the targetLowPriorityNodes value
     */
    public Integer targetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set this property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get if false, at least one of targetDedicateNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula element is required. The pool automatically resizes according to the formula. The default value is false.
     *
     * @return the enableAutoScale value
     */
    public Boolean enableAutoScale() {
        return this.enableAutoScale;
    }

    /**
     * Set if false, at least one of targetDedicateNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula element is required. The pool automatically resizes according to the formula. The default value is false.
     *
     * @param enableAutoScale the enableAutoScale value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withEnableAutoScale(Boolean enableAutoScale) {
        this.enableAutoScale = enableAutoScale;
        return this;
    }

    /**
     * Get this property must not be specified if enableAutoScale is set to false. It is required if enableAutoScale is set to true. The formula is checked for validity before the pool is created. If the formula is not valid, the Batch service rejects the request with detailed error information.
     *
     * @return the autoScaleFormula value
     */
    public String autoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set this property must not be specified if enableAutoScale is set to false. It is required if enableAutoScale is set to true. The formula is checked for validity before the pool is created. If the formula is not valid, the Batch service rejects the request with detailed error information.
     *
     * @param autoScaleFormula the autoScaleFormula value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

    /**
     * Get the default value is 15 minutes. The minimum and maximum value are 5 minutes and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch service rejects the request with an invalid property value error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the autoScaleEvaluationInterval value
     */
    public Period autoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Set the default value is 15 minutes. The minimum and maximum value are 5 minutes and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch service rejects the request with an invalid property value error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param autoScaleEvaluationInterval the autoScaleEvaluationInterval value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withAutoScaleEvaluationInterval(Period autoScaleEvaluationInterval) {
        this.autoScaleEvaluationInterval = autoScaleEvaluationInterval;
        return this;
    }

    /**
     * Get enabling inter-node communication limits the maximum size of the pool due to deployment restrictions on the nodes of the pool. This may result in the pool not reaching its desired size. The default value is false.
     *
     * @return the enableInterNodeCommunication value
     */
    public Boolean enableInterNodeCommunication() {
        return this.enableInterNodeCommunication;
    }

    /**
     * Set enabling inter-node communication limits the maximum size of the pool due to deployment restrictions on the nodes of the pool. This may result in the pool not reaching its desired size. The default value is false.
     *
     * @param enableInterNodeCommunication the enableInterNodeCommunication value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withEnableInterNodeCommunication(Boolean enableInterNodeCommunication) {
        this.enableInterNodeCommunication = enableInterNodeCommunication;
        return this;
    }

    /**
     * Get the networkConfiguration value.
     *
     * @return the networkConfiguration value
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration value.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the startTask value.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set the startTask value.
     *
     * @param startTask the startTask value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get for Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set for Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the applicationPackageReferences value.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set the applicationPackageReferences value.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail. The permitted licenses available on the pool are 'maya', 'vray', '3dsmax', 'arnold'. An additional charge applies for each application license added to the pool.
     *
     * @return the applicationLicenses value
     */
    public List<String> applicationLicenses() {
        return this.applicationLicenses;
    }

    /**
     * Set the list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail. The permitted licenses available on the pool are 'maya', 'vray', '3dsmax', 'arnold'. An additional charge applies for each application license added to the pool.
     *
     * @param applicationLicenses the applicationLicenses value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withApplicationLicenses(List<String> applicationLicenses) {
        this.applicationLicenses = applicationLicenses;
        return this;
    }

    /**
     * Get the userAccounts value.
     *
     * @return the userAccounts value
     */
    public List<UserAccount> userAccounts() {
        return this.userAccounts;
    }

    /**
     * Set the userAccounts value.
     *
     * @param userAccounts the userAccounts value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withUserAccounts(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
        return this;
    }

    /**
     * Get the Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set
     * @return the PoolSpecification object itself.
     */
    public PoolSpecification withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
