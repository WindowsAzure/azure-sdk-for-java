// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.compute.fluent.AvailabilitySetsClient;
import com.azure.resourcemanager.compute.fluent.ComputeManagementClient;
import com.azure.resourcemanager.compute.fluent.ContainerServicesClient;
import com.azure.resourcemanager.compute.fluent.DedicatedHostGroupsClient;
import com.azure.resourcemanager.compute.fluent.DedicatedHostsClient;
import com.azure.resourcemanager.compute.fluent.DiskAccessesClient;
import com.azure.resourcemanager.compute.fluent.DiskEncryptionSetsClient;
import com.azure.resourcemanager.compute.fluent.DisksClient;
import com.azure.resourcemanager.compute.fluent.GalleriesClient;
import com.azure.resourcemanager.compute.fluent.GalleryApplicationVersionsClient;
import com.azure.resourcemanager.compute.fluent.GalleryApplicationsClient;
import com.azure.resourcemanager.compute.fluent.GalleryImageVersionsClient;
import com.azure.resourcemanager.compute.fluent.GalleryImagesClient;
import com.azure.resourcemanager.compute.fluent.GallerySharingProfilesClient;
import com.azure.resourcemanager.compute.fluent.ImagesClient;
import com.azure.resourcemanager.compute.fluent.LogAnalyticsClient;
import com.azure.resourcemanager.compute.fluent.OperationsClient;
import com.azure.resourcemanager.compute.fluent.ProximityPlacementGroupsClient;
import com.azure.resourcemanager.compute.fluent.ResourceSkusClient;
import com.azure.resourcemanager.compute.fluent.SharedGalleriesClient;
import com.azure.resourcemanager.compute.fluent.SharedGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.fluent.SharedGalleryImagesClient;
import com.azure.resourcemanager.compute.fluent.SnapshotsClient;
import com.azure.resourcemanager.compute.fluent.SshPublicKeysClient;
import com.azure.resourcemanager.compute.fluent.UsagesClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineExtensionImagesClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineExtensionsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineImagesClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineRunCommandsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineScaleSetExtensionsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineScaleSetRollingUpgradesClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineScaleSetVMExtensionsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineScaleSetVMRunCommandsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineScaleSetVMsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineScaleSetsClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachineSizesClient;
import com.azure.resourcemanager.compute.fluent.VirtualMachinesClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the ComputeManagementClientImpl type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class ComputeManagementClientImpl extends AzureServiceClient implements ComputeManagementClient {
    private final ClientLogger logger = new ClientLogger(ComputeManagementClientImpl.class);

    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The AvailabilitySetsClient object to access its operations. */
    private final AvailabilitySetsClient availabilitySets;

    /**
     * Gets the AvailabilitySetsClient object to access its operations.
     *
     * @return the AvailabilitySetsClient object.
     */
    public AvailabilitySetsClient getAvailabilitySets() {
        return this.availabilitySets;
    }

    /** The ProximityPlacementGroupsClient object to access its operations. */
    private final ProximityPlacementGroupsClient proximityPlacementGroups;

    /**
     * Gets the ProximityPlacementGroupsClient object to access its operations.
     *
     * @return the ProximityPlacementGroupsClient object.
     */
    public ProximityPlacementGroupsClient getProximityPlacementGroups() {
        return this.proximityPlacementGroups;
    }

    /** The DedicatedHostGroupsClient object to access its operations. */
    private final DedicatedHostGroupsClient dedicatedHostGroups;

    /**
     * Gets the DedicatedHostGroupsClient object to access its operations.
     *
     * @return the DedicatedHostGroupsClient object.
     */
    public DedicatedHostGroupsClient getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    /** The DedicatedHostsClient object to access its operations. */
    private final DedicatedHostsClient dedicatedHosts;

    /**
     * Gets the DedicatedHostsClient object to access its operations.
     *
     * @return the DedicatedHostsClient object.
     */
    public DedicatedHostsClient getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    /** The SshPublicKeysClient object to access its operations. */
    private final SshPublicKeysClient sshPublicKeys;

    /**
     * Gets the SshPublicKeysClient object to access its operations.
     *
     * @return the SshPublicKeysClient object.
     */
    public SshPublicKeysClient getSshPublicKeys() {
        return this.sshPublicKeys;
    }

    /** The VirtualMachineExtensionImagesClient object to access its operations. */
    private final VirtualMachineExtensionImagesClient virtualMachineExtensionImages;

    /**
     * Gets the VirtualMachineExtensionImagesClient object to access its operations.
     *
     * @return the VirtualMachineExtensionImagesClient object.
     */
    public VirtualMachineExtensionImagesClient getVirtualMachineExtensionImages() {
        return this.virtualMachineExtensionImages;
    }

    /** The VirtualMachineExtensionsClient object to access its operations. */
    private final VirtualMachineExtensionsClient virtualMachineExtensions;

    /**
     * Gets the VirtualMachineExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineExtensionsClient object.
     */
    public VirtualMachineExtensionsClient getVirtualMachineExtensions() {
        return this.virtualMachineExtensions;
    }

    /** The VirtualMachineImagesClient object to access its operations. */
    private final VirtualMachineImagesClient virtualMachineImages;

    /**
     * Gets the VirtualMachineImagesClient object to access its operations.
     *
     * @return the VirtualMachineImagesClient object.
     */
    public VirtualMachineImagesClient getVirtualMachineImages() {
        return this.virtualMachineImages;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The VirtualMachinesClient object to access its operations. */
    private final VirtualMachinesClient virtualMachines;

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     *
     * @return the VirtualMachinesClient object.
     */
    public VirtualMachinesClient getVirtualMachines() {
        return this.virtualMachines;
    }

    /** The VirtualMachineSizesClient object to access its operations. */
    private final VirtualMachineSizesClient virtualMachineSizes;

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     *
     * @return the VirtualMachineSizesClient object.
     */
    public VirtualMachineSizesClient getVirtualMachineSizes() {
        return this.virtualMachineSizes;
    }

    /** The ImagesClient object to access its operations. */
    private final ImagesClient images;

    /**
     * Gets the ImagesClient object to access its operations.
     *
     * @return the ImagesClient object.
     */
    public ImagesClient getImages() {
        return this.images;
    }

    /** The VirtualMachineScaleSetsClient object to access its operations. */
    private final VirtualMachineScaleSetsClient virtualMachineScaleSets;

    /**
     * Gets the VirtualMachineScaleSetsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetsClient object.
     */
    public VirtualMachineScaleSetsClient getVirtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }

    /** The VirtualMachineScaleSetExtensionsClient object to access its operations. */
    private final VirtualMachineScaleSetExtensionsClient virtualMachineScaleSetExtensions;

    /**
     * Gets the VirtualMachineScaleSetExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetExtensionsClient object.
     */
    public VirtualMachineScaleSetExtensionsClient getVirtualMachineScaleSetExtensions() {
        return this.virtualMachineScaleSetExtensions;
    }

    /** The VirtualMachineScaleSetRollingUpgradesClient object to access its operations. */
    private final VirtualMachineScaleSetRollingUpgradesClient virtualMachineScaleSetRollingUpgrades;

    /**
     * Gets the VirtualMachineScaleSetRollingUpgradesClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetRollingUpgradesClient object.
     */
    public VirtualMachineScaleSetRollingUpgradesClient getVirtualMachineScaleSetRollingUpgrades() {
        return this.virtualMachineScaleSetRollingUpgrades;
    }

    /** The VirtualMachineScaleSetVMExtensionsClient object to access its operations. */
    private final VirtualMachineScaleSetVMExtensionsClient virtualMachineScaleSetVMExtensions;

    /**
     * Gets the VirtualMachineScaleSetVMExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMExtensionsClient object.
     */
    public VirtualMachineScaleSetVMExtensionsClient getVirtualMachineScaleSetVMExtensions() {
        return this.virtualMachineScaleSetVMExtensions;
    }

    /** The VirtualMachineScaleSetVMsClient object to access its operations. */
    private final VirtualMachineScaleSetVMsClient virtualMachineScaleSetVMs;

    /**
     * Gets the VirtualMachineScaleSetVMsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMsClient object.
     */
    public VirtualMachineScaleSetVMsClient getVirtualMachineScaleSetVMs() {
        return this.virtualMachineScaleSetVMs;
    }

    /** The LogAnalyticsClient object to access its operations. */
    private final LogAnalyticsClient logAnalytics;

    /**
     * Gets the LogAnalyticsClient object to access its operations.
     *
     * @return the LogAnalyticsClient object.
     */
    public LogAnalyticsClient getLogAnalytics() {
        return this.logAnalytics;
    }

    /** The VirtualMachineRunCommandsClient object to access its operations. */
    private final VirtualMachineRunCommandsClient virtualMachineRunCommands;

    /**
     * Gets the VirtualMachineRunCommandsClient object to access its operations.
     *
     * @return the VirtualMachineRunCommandsClient object.
     */
    public VirtualMachineRunCommandsClient getVirtualMachineRunCommands() {
        return this.virtualMachineRunCommands;
    }

    /** The VirtualMachineScaleSetVMRunCommandsClient object to access its operations. */
    private final VirtualMachineScaleSetVMRunCommandsClient virtualMachineScaleSetVMRunCommands;

    /**
     * Gets the VirtualMachineScaleSetVMRunCommandsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMRunCommandsClient object.
     */
    public VirtualMachineScaleSetVMRunCommandsClient getVirtualMachineScaleSetVMRunCommands() {
        return this.virtualMachineScaleSetVMRunCommands;
    }

    /** The ResourceSkusClient object to access its operations. */
    private final ResourceSkusClient resourceSkus;

    /**
     * Gets the ResourceSkusClient object to access its operations.
     *
     * @return the ResourceSkusClient object.
     */
    public ResourceSkusClient getResourceSkus() {
        return this.resourceSkus;
    }

    /** The DisksClient object to access its operations. */
    private final DisksClient disks;

    /**
     * Gets the DisksClient object to access its operations.
     *
     * @return the DisksClient object.
     */
    public DisksClient getDisks() {
        return this.disks;
    }

    /** The SnapshotsClient object to access its operations. */
    private final SnapshotsClient snapshots;

    /**
     * Gets the SnapshotsClient object to access its operations.
     *
     * @return the SnapshotsClient object.
     */
    public SnapshotsClient getSnapshots() {
        return this.snapshots;
    }

    /** The DiskEncryptionSetsClient object to access its operations. */
    private final DiskEncryptionSetsClient diskEncryptionSets;

    /**
     * Gets the DiskEncryptionSetsClient object to access its operations.
     *
     * @return the DiskEncryptionSetsClient object.
     */
    public DiskEncryptionSetsClient getDiskEncryptionSets() {
        return this.diskEncryptionSets;
    }

    /** The DiskAccessesClient object to access its operations. */
    private final DiskAccessesClient diskAccesses;

    /**
     * Gets the DiskAccessesClient object to access its operations.
     *
     * @return the DiskAccessesClient object.
     */
    public DiskAccessesClient getDiskAccesses() {
        return this.diskAccesses;
    }

    /** The GalleriesClient object to access its operations. */
    private final GalleriesClient galleries;

    /**
     * Gets the GalleriesClient object to access its operations.
     *
     * @return the GalleriesClient object.
     */
    public GalleriesClient getGalleries() {
        return this.galleries;
    }

    /** The GalleryImagesClient object to access its operations. */
    private final GalleryImagesClient galleryImages;

    /**
     * Gets the GalleryImagesClient object to access its operations.
     *
     * @return the GalleryImagesClient object.
     */
    public GalleryImagesClient getGalleryImages() {
        return this.galleryImages;
    }

    /** The GalleryImageVersionsClient object to access its operations. */
    private final GalleryImageVersionsClient galleryImageVersions;

    /**
     * Gets the GalleryImageVersionsClient object to access its operations.
     *
     * @return the GalleryImageVersionsClient object.
     */
    public GalleryImageVersionsClient getGalleryImageVersions() {
        return this.galleryImageVersions;
    }

    /** The GalleryApplicationsClient object to access its operations. */
    private final GalleryApplicationsClient galleryApplications;

    /**
     * Gets the GalleryApplicationsClient object to access its operations.
     *
     * @return the GalleryApplicationsClient object.
     */
    public GalleryApplicationsClient getGalleryApplications() {
        return this.galleryApplications;
    }

    /** The GalleryApplicationVersionsClient object to access its operations. */
    private final GalleryApplicationVersionsClient galleryApplicationVersions;

    /**
     * Gets the GalleryApplicationVersionsClient object to access its operations.
     *
     * @return the GalleryApplicationVersionsClient object.
     */
    public GalleryApplicationVersionsClient getGalleryApplicationVersions() {
        return this.galleryApplicationVersions;
    }

    /** The GallerySharingProfilesClient object to access its operations. */
    private final GallerySharingProfilesClient gallerySharingProfiles;

    /**
     * Gets the GallerySharingProfilesClient object to access its operations.
     *
     * @return the GallerySharingProfilesClient object.
     */
    public GallerySharingProfilesClient getGallerySharingProfiles() {
        return this.gallerySharingProfiles;
    }

    /** The SharedGalleriesClient object to access its operations. */
    private final SharedGalleriesClient sharedGalleries;

    /**
     * Gets the SharedGalleriesClient object to access its operations.
     *
     * @return the SharedGalleriesClient object.
     */
    public SharedGalleriesClient getSharedGalleries() {
        return this.sharedGalleries;
    }

    /** The SharedGalleryImagesClient object to access its operations. */
    private final SharedGalleryImagesClient sharedGalleryImages;

    /**
     * Gets the SharedGalleryImagesClient object to access its operations.
     *
     * @return the SharedGalleryImagesClient object.
     */
    public SharedGalleryImagesClient getSharedGalleryImages() {
        return this.sharedGalleryImages;
    }

    /** The SharedGalleryImageVersionsClient object to access its operations. */
    private final SharedGalleryImageVersionsClient sharedGalleryImageVersions;

    /**
     * Gets the SharedGalleryImageVersionsClient object to access its operations.
     *
     * @return the SharedGalleryImageVersionsClient object.
     */
    public SharedGalleryImageVersionsClient getSharedGalleryImageVersions() {
        return this.sharedGalleryImageVersions;
    }

    /** The ContainerServicesClient object to access its operations. */
    private final ContainerServicesClient containerServices;

    /**
     * Gets the ContainerServicesClient object to access its operations.
     *
     * @return the ContainerServicesClient object.
     */
    public ContainerServicesClient getContainerServices() {
        return this.containerServices;
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    ComputeManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.operations = new OperationsClientImpl(this);
        this.availabilitySets = new AvailabilitySetsClientImpl(this);
        this.proximityPlacementGroups = new ProximityPlacementGroupsClientImpl(this);
        this.dedicatedHostGroups = new DedicatedHostGroupsClientImpl(this);
        this.dedicatedHosts = new DedicatedHostsClientImpl(this);
        this.sshPublicKeys = new SshPublicKeysClientImpl(this);
        this.virtualMachineExtensionImages = new VirtualMachineExtensionImagesClientImpl(this);
        this.virtualMachineExtensions = new VirtualMachineExtensionsClientImpl(this);
        this.virtualMachineImages = new VirtualMachineImagesClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.virtualMachines = new VirtualMachinesClientImpl(this);
        this.virtualMachineSizes = new VirtualMachineSizesClientImpl(this);
        this.images = new ImagesClientImpl(this);
        this.virtualMachineScaleSets = new VirtualMachineScaleSetsClientImpl(this);
        this.virtualMachineScaleSetExtensions = new VirtualMachineScaleSetExtensionsClientImpl(this);
        this.virtualMachineScaleSetRollingUpgrades = new VirtualMachineScaleSetRollingUpgradesClientImpl(this);
        this.virtualMachineScaleSetVMExtensions = new VirtualMachineScaleSetVMExtensionsClientImpl(this);
        this.virtualMachineScaleSetVMs = new VirtualMachineScaleSetVMsClientImpl(this);
        this.logAnalytics = new LogAnalyticsClientImpl(this);
        this.virtualMachineRunCommands = new VirtualMachineRunCommandsClientImpl(this);
        this.virtualMachineScaleSetVMRunCommands = new VirtualMachineScaleSetVMRunCommandsClientImpl(this);
        this.resourceSkus = new ResourceSkusClientImpl(this);
        this.disks = new DisksClientImpl(this);
        this.snapshots = new SnapshotsClientImpl(this);
        this.diskEncryptionSets = new DiskEncryptionSetsClientImpl(this);
        this.diskAccesses = new DiskAccessesClientImpl(this);
        this.galleries = new GalleriesClientImpl(this);
        this.galleryImages = new GalleryImagesClientImpl(this);
        this.galleryImageVersions = new GalleryImageVersionsClientImpl(this);
        this.galleryApplications = new GalleryApplicationsClientImpl(this);
        this.galleryApplicationVersions = new GalleryApplicationVersionsClientImpl(this);
        this.gallerySharingProfiles = new GallerySharingProfilesClientImpl(this);
        this.sharedGalleries = new SharedGalleriesClientImpl(this);
        this.sharedGalleryImages = new SharedGalleryImagesClientImpl(this);
        this.sharedGalleryImageVersions = new SharedGalleryImageVersionsClientImpl(this);
        this.containerServices = new ContainerServicesClientImpl(this);
    }
}
