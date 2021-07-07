/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Pool in the Azure Batch service to add.
 */
public class PoolAddParameter {
    /**
     * A string that uniquely identifies the Pool within the Account. The ID
     * can contain any combination of alphanumeric characters including hyphens
     * and underscores, and cannot contain more than 64 characters. The ID is
     * case-preserving and case-insensitive (that is, you may not have two Pool
     * IDs within an Account that differ only by case).
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The display name for the Pool. This name need not be unique and can
     * contain any Unicode characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The size of virtual machines in the Pool. All virtual machines in a Pool
     * are the same size. For information about available sizes of virtual
     * machines for Cloud Services Pools (pools created with
     * cloudServiceConfiguration), see Sizes for Cloud Services
     * (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/).
     * Batch supports all Cloud Services VM sizes except ExtraSmall, A1V2 and
     * A2V2. For information about available VM sizes for Pools using Images
     * from the Virtual Machines Marketplace (pools created with
     * virtualMachineConfiguration) see Sizes for Virtual Machines (Linux)
     * (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/)
     * or Sizes for Virtual Machines (Windows)
     * (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/).
     * Batch supports all Azure VM sizes except STANDARD_A0 and those with
     * premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     */
    @JsonProperty(value = "vmSize", required = true)
    private String vmSize;

    /**
     * The cloud service configuration for the Pool. This property and
     * virtualMachineConfiguration are mutually exclusive and one of the
     * properties must be specified. This property cannot be specified if the
     * Batch Account was created with its poolAllocationMode property set to
     * 'UserSubscription'.
     */
    @JsonProperty(value = "cloudServiceConfiguration")
    private CloudServiceConfiguration cloudServiceConfiguration;

    /**
     * The virtual machine configuration for the Pool. This property and
     * cloudServiceConfiguration are mutually exclusive and one of the
     * properties must be specified.
     */
    @JsonProperty(value = "virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /**
     * The timeout for allocation of Compute Nodes to the Pool. This timeout
     * applies only to manual scaling; it has no effect when enableAutoScale is
     * set to true. The default value is 15 minutes. The minimum value is 5
     * minutes. If you specify a value less than 5 minutes, the Batch service
     * returns an error; if you are calling the REST API directly, the HTTP
     * status code is 400 (Bad Request).
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * The desired number of dedicated Compute Nodes in the Pool. This property
     * must not be specified if enableAutoScale is set to true. If
     * enableAutoScale is set to false, then you must set either
     * targetDedicatedNodes, targetLowPriorityNodes, or both.
     */
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /**
     * The desired number of low-priority Compute Nodes in the Pool. This
     * property must not be specified if enableAutoScale is set to true. If
     * enableAutoScale is set to false, then you must set either
     * targetDedicatedNodes, targetLowPriorityNodes, or both.
     */
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /**
     * Whether the Pool size should automatically adjust over time. If false,
     * at least one of targetDedicatedNodes and targetLowPriorityNodes must be
     * specified. If true, the autoScaleFormula property is required and the
     * Pool automatically resizes according to the formula. The default value
     * is false.
     */
    @JsonProperty(value = "enableAutoScale")
    private Boolean enableAutoScale;

    /**
     * A formula for the desired number of Compute Nodes in the Pool. This
     * property must not be specified if enableAutoScale is set to false. It is
     * required if enableAutoScale is set to true. The formula is checked for
     * validity before the Pool is created. If the formula is not valid, the
     * Batch service rejects the request with detailed error information. For
     * more information about specifying this formula, see 'Automatically scale
     * Compute Nodes in an Azure Batch Pool'
     * (https://azure.microsoft.com/documentation/articles/batch-automatic-scaling/).
     */
    @JsonProperty(value = "autoScaleFormula")
    private String autoScaleFormula;

    /**
     * The time interval at which to automatically adjust the Pool size
     * according to the autoscale formula. The default value is 15 minutes. The
     * minimum and maximum value are 5 minutes and 168 hours respectively. If
     * you specify a value less than 5 minutes or greater than 168 hours, the
     * Batch service returns an error; if you are calling the REST API
     * directly, the HTTP status code is 400 (Bad Request).
     */
    @JsonProperty(value = "autoScaleEvaluationInterval")
    private Period autoScaleEvaluationInterval;

    /**
     * Whether the Pool permits direct communication between Compute Nodes.
     * Enabling inter-node communication limits the maximum size of the Pool
     * due to deployment restrictions on the Compute Nodes of the Pool. This
     * may result in the Pool not reaching its desired size. The default value
     * is false.
     */
    @JsonProperty(value = "enableInterNodeCommunication")
    private Boolean enableInterNodeCommunication;

    /**
     * The network configuration for the Pool.
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /**
     * A Task specified to run on each Compute Node as it joins the Pool. The
     * Task runs when the Compute Node is added to the Pool or when the Compute
     * Node is restarted.
     */
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /**
     * The list of Certificates to be installed on each Compute Node in the
     * Pool. For Windows Nodes, the Batch service installs the Certificates to
     * the specified Certificate store and location. For Linux Compute Nodes,
     * the Certificates are stored in a directory inside the Task working
     * directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is
     * supplied to the Task to query for this location. For Certificates with
     * visibility of 'remoteUser', a 'certs' directory is created in the user's
     * home directory (e.g., /home/{user-name}/certs) and Certificates are
     * placed in that directory.
     */
    @JsonProperty(value = "certificateReferences")
    private List<CertificateReference> certificateReferences;

    /**
     * The list of Packages to be installed on each Compute Node in the Pool.
     * Changes to Package references affect all new Nodes joining the Pool, but
     * do not affect Compute Nodes that are already in the Pool until they are
     * rebooted or reimaged. There is a maximum of 10 Package references on any
     * given Pool.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The list of application licenses the Batch service will make available
     * on each Compute Node in the Pool. This list must be a subset of
     * available Batch service application licenses. If a license is requested
     * which is not supported, Pool creation will fail.
     */
    @JsonProperty(value = "applicationLicenses")
    private List<String> applicationLicenses;

    /**
     * The number of task slots that can be used to run concurrent tasks on a
     * single compute node in the pool. The default value is 1. The maximum
     * value is the smaller of 4 times the number of cores of the vmSize of the
     * pool or 256.
     */
    @JsonProperty(value = "taskSlotsPerNode")
    private Integer taskSlotsPerNode;

    /**
     * How Tasks are distributed across Compute Nodes in a Pool. If not
     * specified, the default is spread.
     */
    @JsonProperty(value = "taskSchedulingPolicy")
    private TaskSchedulingPolicy taskSchedulingPolicy;

    /**
     * The list of user Accounts to be created on each Compute Node in the
     * Pool.
     */
    @JsonProperty(value = "userAccounts")
    private List<UserAccount> userAccounts;

    /**
     * A list of name-value pairs associated with the Pool as metadata. The
     * Batch service does not assign any meaning to metadata; it is solely for
     * the use of user code.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Mount storage using specified file system for the entire lifetime of the
     * pool. Mount the storage using Azure fileshare, NFS, CIFS or Blobfuse
     * based file system.
     */
    @JsonProperty(value = "mountConfiguration")
    private List<MountConfiguration> mountConfiguration;

    /**
     * Get a string that uniquely identifies the Pool within the Account. The ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two Pool IDs within an Account that differ only by case).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set a string that uniquely identifies the Pool within the Account. The ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two Pool IDs within an Account that differ only by case).
     *
     * @param id the id value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the display name for the Pool. This name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name for the Pool. This name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the size of virtual machines in the Pool. All virtual machines in a Pool are the same size. For information about available sizes of virtual machines for Cloud Services Pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall, A1V2 and A2V2. For information about available VM sizes for Pools using Images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the size of virtual machines in the Pool. All virtual machines in a Pool are the same size. For information about available sizes of virtual machines for Cloud Services Pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall, A1V2 and A2V2. For information about available VM sizes for Pools using Images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     *
     * @param vmSize the vmSize value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the cloud service configuration for the Pool. This property and virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. This property cannot be specified if the Batch Account was created with its poolAllocationMode property set to 'UserSubscription'.
     *
     * @return the cloudServiceConfiguration value
     */
    public CloudServiceConfiguration cloudServiceConfiguration() {
        return this.cloudServiceConfiguration;
    }

    /**
     * Set the cloud service configuration for the Pool. This property and virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. This property cannot be specified if the Batch Account was created with its poolAllocationMode property set to 'UserSubscription'.
     *
     * @param cloudServiceConfiguration the cloudServiceConfiguration value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withCloudServiceConfiguration(CloudServiceConfiguration cloudServiceConfiguration) {
        this.cloudServiceConfiguration = cloudServiceConfiguration;
        return this;
    }

    /**
     * Get the virtual machine configuration for the Pool. This property and cloudServiceConfiguration are mutually exclusive and one of the properties must be specified.
     *
     * @return the virtualMachineConfiguration value
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtual machine configuration for the Pool. This property and cloudServiceConfiguration are mutually exclusive and one of the properties must be specified.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the timeout for allocation of Compute Nodes to the Pool. This timeout applies only to manual scaling; it has no effect when enableAutoScale is set to true. The default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the timeout for allocation of Compute Nodes to the Pool. This timeout applies only to manual scaling; it has no effect when enableAutoScale is set to true. The default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the desired number of dedicated Compute Nodes in the Pool. This property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @return the targetDedicatedNodes value
     */
    public Integer targetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set the desired number of dedicated Compute Nodes in the Pool. This property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get the desired number of low-priority Compute Nodes in the Pool. This property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @return the targetLowPriorityNodes value
     */
    public Integer targetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set the desired number of low-priority Compute Nodes in the Pool. This property must not be specified if enableAutoScale is set to true. If enableAutoScale is set to false, then you must set either targetDedicatedNodes, targetLowPriorityNodes, or both.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get whether the Pool size should automatically adjust over time. If false, at least one of targetDedicatedNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula property is required and the Pool automatically resizes according to the formula. The default value is false.
     *
     * @return the enableAutoScale value
     */
    public Boolean enableAutoScale() {
        return this.enableAutoScale;
    }

    /**
     * Set whether the Pool size should automatically adjust over time. If false, at least one of targetDedicatedNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula property is required and the Pool automatically resizes according to the formula. The default value is false.
     *
     * @param enableAutoScale the enableAutoScale value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withEnableAutoScale(Boolean enableAutoScale) {
        this.enableAutoScale = enableAutoScale;
        return this;
    }

    /**
     * Get a formula for the desired number of Compute Nodes in the Pool. This property must not be specified if enableAutoScale is set to false. It is required if enableAutoScale is set to true. The formula is checked for validity before the Pool is created. If the formula is not valid, the Batch service rejects the request with detailed error information. For more information about specifying this formula, see 'Automatically scale Compute Nodes in an Azure Batch Pool' (https://azure.microsoft.com/documentation/articles/batch-automatic-scaling/).
     *
     * @return the autoScaleFormula value
     */
    public String autoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set a formula for the desired number of Compute Nodes in the Pool. This property must not be specified if enableAutoScale is set to false. It is required if enableAutoScale is set to true. The formula is checked for validity before the Pool is created. If the formula is not valid, the Batch service rejects the request with detailed error information. For more information about specifying this formula, see 'Automatically scale Compute Nodes in an Azure Batch Pool' (https://azure.microsoft.com/documentation/articles/batch-automatic-scaling/).
     *
     * @param autoScaleFormula the autoScaleFormula value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

    /**
     * Get the time interval at which to automatically adjust the Pool size according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the autoScaleEvaluationInterval value
     */
    public Period autoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Set the time interval at which to automatically adjust the Pool size according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param autoScaleEvaluationInterval the autoScaleEvaluationInterval value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withAutoScaleEvaluationInterval(Period autoScaleEvaluationInterval) {
        this.autoScaleEvaluationInterval = autoScaleEvaluationInterval;
        return this;
    }

    /**
     * Get whether the Pool permits direct communication between Compute Nodes. Enabling inter-node communication limits the maximum size of the Pool due to deployment restrictions on the Compute Nodes of the Pool. This may result in the Pool not reaching its desired size. The default value is false.
     *
     * @return the enableInterNodeCommunication value
     */
    public Boolean enableInterNodeCommunication() {
        return this.enableInterNodeCommunication;
    }

    /**
     * Set whether the Pool permits direct communication between Compute Nodes. Enabling inter-node communication limits the maximum size of the Pool due to deployment restrictions on the Compute Nodes of the Pool. This may result in the Pool not reaching its desired size. The default value is false.
     *
     * @param enableInterNodeCommunication the enableInterNodeCommunication value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withEnableInterNodeCommunication(Boolean enableInterNodeCommunication) {
        this.enableInterNodeCommunication = enableInterNodeCommunication;
        return this;
    }

    /**
     * Get the network configuration for the Pool.
     *
     * @return the networkConfiguration value
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the network configuration for the Pool.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get a Task specified to run on each Compute Node as it joins the Pool. The Task runs when the Compute Node is added to the Pool or when the Compute Node is restarted.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set a Task specified to run on each Compute Node as it joins the Pool. The Task runs when the Compute Node is added to the Pool or when the Compute Node is restarted.
     *
     * @param startTask the startTask value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the list of Certificates to be installed on each Compute Node in the Pool. For Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set the list of Certificates to be installed on each Compute Node in the Pool. For Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the list of Packages to be installed on each Compute Node in the Pool. Changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any given Pool.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set the list of Packages to be installed on each Compute Node in the Pool. Changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any given Pool.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the list of application licenses the Batch service will make available on each Compute Node in the Pool. This list must be a subset of available Batch service application licenses. If a license is requested which is not supported, Pool creation will fail.
     *
     * @return the applicationLicenses value
     */
    public List<String> applicationLicenses() {
        return this.applicationLicenses;
    }

    /**
     * Set the list of application licenses the Batch service will make available on each Compute Node in the Pool. This list must be a subset of available Batch service application licenses. If a license is requested which is not supported, Pool creation will fail.
     *
     * @param applicationLicenses the applicationLicenses value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withApplicationLicenses(List<String> applicationLicenses) {
        this.applicationLicenses = applicationLicenses;
        return this;
    }

    /**
     * Get the number of task slots that can be used to run concurrent tasks on a single compute node in the pool. The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     *
     * @return the taskSlotsPerNode value
     */
    public Integer taskSlotsPerNode() {
        return this.taskSlotsPerNode;
    }

    /**
     * Set the number of task slots that can be used to run concurrent tasks on a single compute node in the pool. The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     *
     * @param taskSlotsPerNode the taskSlotsPerNode value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withTaskSlotsPerNode(Integer taskSlotsPerNode) {
        this.taskSlotsPerNode = taskSlotsPerNode;
        return this;
    }

    /**
     * Get how Tasks are distributed across Compute Nodes in a Pool. If not specified, the default is spread.
     *
     * @return the taskSchedulingPolicy value
     */
    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }

    /**
     * Set how Tasks are distributed across Compute Nodes in a Pool. If not specified, the default is spread.
     *
     * @param taskSchedulingPolicy the taskSchedulingPolicy value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        return this;
    }

    /**
     * Get the list of user Accounts to be created on each Compute Node in the Pool.
     *
     * @return the userAccounts value
     */
    public List<UserAccount> userAccounts() {
        return this.userAccounts;
    }

    /**
     * Set the list of user Accounts to be created on each Compute Node in the Pool.
     *
     * @param userAccounts the userAccounts value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withUserAccounts(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
        return this;
    }

    /**
     * Get a list of name-value pairs associated with the Pool as metadata. The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set a list of name-value pairs associated with the Pool as metadata. The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get mount storage using specified file system for the entire lifetime of the pool. Mount the storage using Azure fileshare, NFS, CIFS or Blobfuse based file system.
     *
     * @return the mountConfiguration value
     */
    public List<MountConfiguration> mountConfiguration() {
        return this.mountConfiguration;
    }

    /**
     * Set mount storage using specified file system for the entire lifetime of the pool. Mount the storage using Azure fileshare, NFS, CIFS or Blobfuse based file system.
     *
     * @param mountConfiguration the mountConfiguration value to set
     * @return the PoolAddParameter object itself.
     */
    public PoolAddParameter withMountConfiguration(List<MountConfiguration> mountConfiguration) {
        this.mountConfiguration = mountConfiguration;
        return this;
    }

}
