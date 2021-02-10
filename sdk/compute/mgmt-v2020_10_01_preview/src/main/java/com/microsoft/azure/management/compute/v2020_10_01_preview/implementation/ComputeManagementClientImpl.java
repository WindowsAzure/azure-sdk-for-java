/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ComputeManagementClientImpl class.
 */
public class ComputeManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ComputeManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ComputeManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ComputeManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ComputeManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The AvailabilitySetsInner object to access its operations.
     */
    private AvailabilitySetsInner availabilitySets;

    /**
     * Gets the AvailabilitySetsInner object to access its operations.
     * @return the AvailabilitySetsInner object.
     */
    public AvailabilitySetsInner availabilitySets() {
        return this.availabilitySets;
    }

    /**
     * The ProximityPlacementGroupsInner object to access its operations.
     */
    private ProximityPlacementGroupsInner proximityPlacementGroups;

    /**
     * Gets the ProximityPlacementGroupsInner object to access its operations.
     * @return the ProximityPlacementGroupsInner object.
     */
    public ProximityPlacementGroupsInner proximityPlacementGroups() {
        return this.proximityPlacementGroups;
    }

    /**
     * The DedicatedHostGroupsInner object to access its operations.
     */
    private DedicatedHostGroupsInner dedicatedHostGroups;

    /**
     * Gets the DedicatedHostGroupsInner object to access its operations.
     * @return the DedicatedHostGroupsInner object.
     */
    public DedicatedHostGroupsInner dedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    /**
     * The DedicatedHostsInner object to access its operations.
     */
    private DedicatedHostsInner dedicatedHosts;

    /**
     * Gets the DedicatedHostsInner object to access its operations.
     * @return the DedicatedHostsInner object.
     */
    public DedicatedHostsInner dedicatedHosts() {
        return this.dedicatedHosts;
    }

    /**
     * The SshPublicKeysInner object to access its operations.
     */
    private SshPublicKeysInner sshPublicKeys;

    /**
     * Gets the SshPublicKeysInner object to access its operations.
     * @return the SshPublicKeysInner object.
     */
    public SshPublicKeysInner sshPublicKeys() {
        return this.sshPublicKeys;
    }

    /**
     * The VirtualMachineExtensionImagesInner object to access its operations.
     */
    private VirtualMachineExtensionImagesInner virtualMachineExtensionImages;

    /**
     * Gets the VirtualMachineExtensionImagesInner object to access its operations.
     * @return the VirtualMachineExtensionImagesInner object.
     */
    public VirtualMachineExtensionImagesInner virtualMachineExtensionImages() {
        return this.virtualMachineExtensionImages;
    }

    /**
     * The VirtualMachineExtensionsInner object to access its operations.
     */
    private VirtualMachineExtensionsInner virtualMachineExtensions;

    /**
     * Gets the VirtualMachineExtensionsInner object to access its operations.
     * @return the VirtualMachineExtensionsInner object.
     */
    public VirtualMachineExtensionsInner virtualMachineExtensions() {
        return this.virtualMachineExtensions;
    }

    /**
     * The VirtualMachineImagesInner object to access its operations.
     */
    private VirtualMachineImagesInner virtualMachineImages;

    /**
     * Gets the VirtualMachineImagesInner object to access its operations.
     * @return the VirtualMachineImagesInner object.
     */
    public VirtualMachineImagesInner virtualMachineImages() {
        return this.virtualMachineImages;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The VirtualMachinesInner object to access its operations.
     */
    private VirtualMachinesInner virtualMachines;

    /**
     * Gets the VirtualMachinesInner object to access its operations.
     * @return the VirtualMachinesInner object.
     */
    public VirtualMachinesInner virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * The VirtualMachineSizesInner object to access its operations.
     */
    private VirtualMachineSizesInner virtualMachineSizes;

    /**
     * Gets the VirtualMachineSizesInner object to access its operations.
     * @return the VirtualMachineSizesInner object.
     */
    public VirtualMachineSizesInner virtualMachineSizes() {
        return this.virtualMachineSizes;
    }

    /**
     * The ImagesInner object to access its operations.
     */
    private ImagesInner images;

    /**
     * Gets the ImagesInner object to access its operations.
     * @return the ImagesInner object.
     */
    public ImagesInner images() {
        return this.images;
    }

    /**
     * The VirtualMachineScaleSetsInner object to access its operations.
     */
    private VirtualMachineScaleSetsInner virtualMachineScaleSets;

    /**
     * Gets the VirtualMachineScaleSetsInner object to access its operations.
     * @return the VirtualMachineScaleSetsInner object.
     */
    public VirtualMachineScaleSetsInner virtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }

    /**
     * The VirtualMachineScaleSetExtensionsInner object to access its operations.
     */
    private VirtualMachineScaleSetExtensionsInner virtualMachineScaleSetExtensions;

    /**
     * Gets the VirtualMachineScaleSetExtensionsInner object to access its operations.
     * @return the VirtualMachineScaleSetExtensionsInner object.
     */
    public VirtualMachineScaleSetExtensionsInner virtualMachineScaleSetExtensions() {
        return this.virtualMachineScaleSetExtensions;
    }

    /**
     * The VirtualMachineScaleSetRollingUpgradesInner object to access its operations.
     */
    private VirtualMachineScaleSetRollingUpgradesInner virtualMachineScaleSetRollingUpgrades;

    /**
     * Gets the VirtualMachineScaleSetRollingUpgradesInner object to access its operations.
     * @return the VirtualMachineScaleSetRollingUpgradesInner object.
     */
    public VirtualMachineScaleSetRollingUpgradesInner virtualMachineScaleSetRollingUpgrades() {
        return this.virtualMachineScaleSetRollingUpgrades;
    }

    /**
     * The VirtualMachineScaleSetVMExtensionsInner object to access its operations.
     */
    private VirtualMachineScaleSetVMExtensionsInner virtualMachineScaleSetVMExtensions;

    /**
     * Gets the VirtualMachineScaleSetVMExtensionsInner object to access its operations.
     * @return the VirtualMachineScaleSetVMExtensionsInner object.
     */
    public VirtualMachineScaleSetVMExtensionsInner virtualMachineScaleSetVMExtensions() {
        return this.virtualMachineScaleSetVMExtensions;
    }

    /**
     * The VirtualMachineScaleSetVMsInner object to access its operations.
     */
    private VirtualMachineScaleSetVMsInner virtualMachineScaleSetVMs;

    /**
     * Gets the VirtualMachineScaleSetVMsInner object to access its operations.
     * @return the VirtualMachineScaleSetVMsInner object.
     */
    public VirtualMachineScaleSetVMsInner virtualMachineScaleSetVMs() {
        return this.virtualMachineScaleSetVMs;
    }

    /**
     * The LogAnalyticsInner object to access its operations.
     */
    private LogAnalyticsInner logAnalytics;

    /**
     * Gets the LogAnalyticsInner object to access its operations.
     * @return the LogAnalyticsInner object.
     */
    public LogAnalyticsInner logAnalytics() {
        return this.logAnalytics;
    }

    /**
     * The VirtualMachineRunCommandsInner object to access its operations.
     */
    private VirtualMachineRunCommandsInner virtualMachineRunCommands;

    /**
     * Gets the VirtualMachineRunCommandsInner object to access its operations.
     * @return the VirtualMachineRunCommandsInner object.
     */
    public VirtualMachineRunCommandsInner virtualMachineRunCommands() {
        return this.virtualMachineRunCommands;
    }

    /**
     * The VirtualMachineScaleSetVMRunCommandsInner object to access its operations.
     */
    private VirtualMachineScaleSetVMRunCommandsInner virtualMachineScaleSetVMRunCommands;

    /**
     * Gets the VirtualMachineScaleSetVMRunCommandsInner object to access its operations.
     * @return the VirtualMachineScaleSetVMRunCommandsInner object.
     */
    public VirtualMachineScaleSetVMRunCommandsInner virtualMachineScaleSetVMRunCommands() {
        return this.virtualMachineScaleSetVMRunCommands;
    }

    /**
     * The ResourceSkusInner object to access its operations.
     */
    private ResourceSkusInner resourceSkus;

    /**
     * Gets the ResourceSkusInner object to access its operations.
     * @return the ResourceSkusInner object.
     */
    public ResourceSkusInner resourceSkus() {
        return this.resourceSkus;
    }

    /**
     * The DisksInner object to access its operations.
     */
    private DisksInner disks;

    /**
     * Gets the DisksInner object to access its operations.
     * @return the DisksInner object.
     */
    public DisksInner disks() {
        return this.disks;
    }

    /**
     * The SnapshotsInner object to access its operations.
     */
    private SnapshotsInner snapshots;

    /**
     * Gets the SnapshotsInner object to access its operations.
     * @return the SnapshotsInner object.
     */
    public SnapshotsInner snapshots() {
        return this.snapshots;
    }

    /**
     * The DiskEncryptionSetsInner object to access its operations.
     */
    private DiskEncryptionSetsInner diskEncryptionSets;

    /**
     * Gets the DiskEncryptionSetsInner object to access its operations.
     * @return the DiskEncryptionSetsInner object.
     */
    public DiskEncryptionSetsInner diskEncryptionSets() {
        return this.diskEncryptionSets;
    }

    /**
     * The DiskAccessesInner object to access its operations.
     */
    private DiskAccessesInner diskAccesses;

    /**
     * Gets the DiskAccessesInner object to access its operations.
     * @return the DiskAccessesInner object.
     */
    public DiskAccessesInner diskAccesses() {
        return this.diskAccesses;
    }

    /**
     * The DiskRestorePointsInner object to access its operations.
     */
    private DiskRestorePointsInner diskRestorePoints;

    /**
     * Gets the DiskRestorePointsInner object to access its operations.
     * @return the DiskRestorePointsInner object.
     */
    public DiskRestorePointsInner diskRestorePoints() {
        return this.diskRestorePoints;
    }

    /**
     * The GalleriesInner object to access its operations.
     */
    private GalleriesInner galleries;

    /**
     * Gets the GalleriesInner object to access its operations.
     * @return the GalleriesInner object.
     */
    public GalleriesInner galleries() {
        return this.galleries;
    }

    /**
     * The GalleryImagesInner object to access its operations.
     */
    private GalleryImagesInner galleryImages;

    /**
     * Gets the GalleryImagesInner object to access its operations.
     * @return the GalleryImagesInner object.
     */
    public GalleryImagesInner galleryImages() {
        return this.galleryImages;
    }

    /**
     * The GalleryImageVersionsInner object to access its operations.
     */
    private GalleryImageVersionsInner galleryImageVersions;

    /**
     * Gets the GalleryImageVersionsInner object to access its operations.
     * @return the GalleryImageVersionsInner object.
     */
    public GalleryImageVersionsInner galleryImageVersions() {
        return this.galleryImageVersions;
    }

    /**
     * The GalleryApplicationsInner object to access its operations.
     */
    private GalleryApplicationsInner galleryApplications;

    /**
     * Gets the GalleryApplicationsInner object to access its operations.
     * @return the GalleryApplicationsInner object.
     */
    public GalleryApplicationsInner galleryApplications() {
        return this.galleryApplications;
    }

    /**
     * The GalleryApplicationVersionsInner object to access its operations.
     */
    private GalleryApplicationVersionsInner galleryApplicationVersions;

    /**
     * Gets the GalleryApplicationVersionsInner object to access its operations.
     * @return the GalleryApplicationVersionsInner object.
     */
    public GalleryApplicationVersionsInner galleryApplicationVersions() {
        return this.galleryApplicationVersions;
    }

    /**
     * The ContainerServicesInner object to access its operations.
     */
    private ContainerServicesInner containerServices;

    /**
     * Gets the ContainerServicesInner object to access its operations.
     * @return the ContainerServicesInner object.
     */
    public ContainerServicesInner containerServices() {
        return this.containerServices;
    }

    /**
     * The CloudServiceRoleInstancesInner object to access its operations.
     */
    private CloudServiceRoleInstancesInner cloudServiceRoleInstances;

    /**
     * Gets the CloudServiceRoleInstancesInner object to access its operations.
     * @return the CloudServiceRoleInstancesInner object.
     */
    public CloudServiceRoleInstancesInner cloudServiceRoleInstances() {
        return this.cloudServiceRoleInstances;
    }

    /**
     * The CloudServiceRolesInner object to access its operations.
     */
    private CloudServiceRolesInner cloudServiceRoles;

    /**
     * Gets the CloudServiceRolesInner object to access its operations.
     * @return the CloudServiceRolesInner object.
     */
    public CloudServiceRolesInner cloudServiceRoles() {
        return this.cloudServiceRoles;
    }

    /**
     * The CloudServicesInner object to access its operations.
     */
    private CloudServicesInner cloudServices;

    /**
     * Gets the CloudServicesInner object to access its operations.
     * @return the CloudServicesInner object.
     */
    public CloudServicesInner cloudServices() {
        return this.cloudServices;
    }

    /**
     * The CloudServicesUpdateDomainsInner object to access its operations.
     */
    private CloudServicesUpdateDomainsInner cloudServicesUpdateDomains;

    /**
     * Gets the CloudServicesUpdateDomainsInner object to access its operations.
     * @return the CloudServicesUpdateDomainsInner object.
     */
    public CloudServicesUpdateDomainsInner cloudServicesUpdateDomains() {
        return this.cloudServicesUpdateDomains;
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ComputeManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ComputeManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ComputeManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.availabilitySets = new AvailabilitySetsInner(restClient().retrofit(), this);
        this.proximityPlacementGroups = new ProximityPlacementGroupsInner(restClient().retrofit(), this);
        this.dedicatedHostGroups = new DedicatedHostGroupsInner(restClient().retrofit(), this);
        this.dedicatedHosts = new DedicatedHostsInner(restClient().retrofit(), this);
        this.sshPublicKeys = new SshPublicKeysInner(restClient().retrofit(), this);
        this.virtualMachineExtensionImages = new VirtualMachineExtensionImagesInner(restClient().retrofit(), this);
        this.virtualMachineExtensions = new VirtualMachineExtensionsInner(restClient().retrofit(), this);
        this.virtualMachineImages = new VirtualMachineImagesInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.virtualMachines = new VirtualMachinesInner(restClient().retrofit(), this);
        this.virtualMachineSizes = new VirtualMachineSizesInner(restClient().retrofit(), this);
        this.images = new ImagesInner(restClient().retrofit(), this);
        this.virtualMachineScaleSets = new VirtualMachineScaleSetsInner(restClient().retrofit(), this);
        this.virtualMachineScaleSetExtensions = new VirtualMachineScaleSetExtensionsInner(restClient().retrofit(), this);
        this.virtualMachineScaleSetRollingUpgrades = new VirtualMachineScaleSetRollingUpgradesInner(restClient().retrofit(), this);
        this.virtualMachineScaleSetVMExtensions = new VirtualMachineScaleSetVMExtensionsInner(restClient().retrofit(), this);
        this.virtualMachineScaleSetVMs = new VirtualMachineScaleSetVMsInner(restClient().retrofit(), this);
        this.logAnalytics = new LogAnalyticsInner(restClient().retrofit(), this);
        this.virtualMachineRunCommands = new VirtualMachineRunCommandsInner(restClient().retrofit(), this);
        this.virtualMachineScaleSetVMRunCommands = new VirtualMachineScaleSetVMRunCommandsInner(restClient().retrofit(), this);
        this.resourceSkus = new ResourceSkusInner(restClient().retrofit(), this);
        this.disks = new DisksInner(restClient().retrofit(), this);
        this.snapshots = new SnapshotsInner(restClient().retrofit(), this);
        this.diskEncryptionSets = new DiskEncryptionSetsInner(restClient().retrofit(), this);
        this.diskAccesses = new DiskAccessesInner(restClient().retrofit(), this);
        this.diskRestorePoints = new DiskRestorePointsInner(restClient().retrofit(), this);
        this.galleries = new GalleriesInner(restClient().retrofit(), this);
        this.galleryImages = new GalleryImagesInner(restClient().retrofit(), this);
        this.galleryImageVersions = new GalleryImageVersionsInner(restClient().retrofit(), this);
        this.galleryApplications = new GalleryApplicationsInner(restClient().retrofit(), this);
        this.galleryApplicationVersions = new GalleryApplicationVersionsInner(restClient().retrofit(), this);
        this.containerServices = new ContainerServicesInner(restClient().retrofit(), this);
        this.cloudServiceRoleInstances = new CloudServiceRoleInstancesInner(restClient().retrofit(), this);
        this.cloudServiceRoles = new CloudServiceRolesInner(restClient().retrofit(), this);
        this.cloudServices = new CloudServicesInner(restClient().retrofit(), this);
        this.cloudServicesUpdateDomains = new CloudServicesUpdateDomainsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ComputeManagementClient", "2020-10-01-preiew");
    }
}
