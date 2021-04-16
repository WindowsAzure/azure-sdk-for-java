// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ApplicableScheduleInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabVirtualMachineInner;
import com.azure.resourcemanager.devtestlabs.models.ApplicableSchedule;
import com.azure.resourcemanager.devtestlabs.models.ApplyArtifactsRequest;
import com.azure.resourcemanager.devtestlabs.models.ArtifactDeploymentStatusProperties;
import com.azure.resourcemanager.devtestlabs.models.ArtifactInstallProperties;
import com.azure.resourcemanager.devtestlabs.models.ComputeVmProperties;
import com.azure.resourcemanager.devtestlabs.models.DataDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.DetachDataDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.GalleryImageReference;
import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachine;
import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachineFragment;
import com.azure.resourcemanager.devtestlabs.models.NetworkInterfaceProperties;
import com.azure.resourcemanager.devtestlabs.models.RdpConnection;
import com.azure.resourcemanager.devtestlabs.models.ResizeLabVirtualMachineProperties;
import com.azure.resourcemanager.devtestlabs.models.ScheduleCreationParameter;
import com.azure.resourcemanager.devtestlabs.models.VirtualMachineCreationSource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class LabVirtualMachineImpl
    implements LabVirtualMachine, LabVirtualMachine.Definition, LabVirtualMachine.Update {
    private LabVirtualMachineInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String notes() {
        return this.innerModel().notes();
    }

    public String ownerObjectId() {
        return this.innerModel().ownerObjectId();
    }

    public String ownerUserPrincipalName() {
        return this.innerModel().ownerUserPrincipalName();
    }

    public String createdByUserId() {
        return this.innerModel().createdByUserId();
    }

    public String createdByUser() {
        return this.innerModel().createdByUser();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String computeId() {
        return this.innerModel().computeId();
    }

    public String customImageId() {
        return this.innerModel().customImageId();
    }

    public String osType() {
        return this.innerModel().osType();
    }

    public String size() {
        return this.innerModel().size();
    }

    public String username() {
        return this.innerModel().username();
    }

    public String password() {
        return this.innerModel().password();
    }

    public String sshKey() {
        return this.innerModel().sshKey();
    }

    public Boolean isAuthenticationWithSshKey() {
        return this.innerModel().isAuthenticationWithSshKey();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public String labSubnetName() {
        return this.innerModel().labSubnetName();
    }

    public String labVirtualNetworkId() {
        return this.innerModel().labVirtualNetworkId();
    }

    public Boolean disallowPublicIpAddress() {
        return this.innerModel().disallowPublicIpAddress();
    }

    public List<ArtifactInstallProperties> artifacts() {
        List<ArtifactInstallProperties> inner = this.innerModel().artifacts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ArtifactDeploymentStatusProperties artifactDeploymentStatus() {
        return this.innerModel().artifactDeploymentStatus();
    }

    public GalleryImageReference galleryImageReference() {
        return this.innerModel().galleryImageReference();
    }

    public String planId() {
        return this.innerModel().planId();
    }

    public ComputeVmProperties computeVm() {
        return this.innerModel().computeVm();
    }

    public NetworkInterfaceProperties networkInterface() {
        return this.innerModel().networkInterface();
    }

    public ApplicableSchedule applicableSchedule() {
        ApplicableScheduleInner inner = this.innerModel().applicableSchedule();
        if (inner != null) {
            return new ApplicableScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OffsetDateTime expirationDate() {
        return this.innerModel().expirationDate();
    }

    public Boolean allowClaim() {
        return this.innerModel().allowClaim();
    }

    public String storageType() {
        return this.innerModel().storageType();
    }

    public VirtualMachineCreationSource virtualMachineCreationSource() {
        return this.innerModel().virtualMachineCreationSource();
    }

    public String environmentId() {
        return this.innerModel().environmentId();
    }

    public List<DataDiskProperties> dataDiskParameters() {
        List<DataDiskProperties> inner = this.innerModel().dataDiskParameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ScheduleCreationParameter> scheduleParameters() {
        List<ScheduleCreationParameter> inner = this.innerModel().scheduleParameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String lastKnownPowerState() {
        return this.innerModel().lastKnownPowerState();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public LabVirtualMachineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String name;

    private LabVirtualMachineFragment updateLabVirtualMachine;

    public LabVirtualMachineImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public LabVirtualMachine create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .createOrUpdate(resourceGroupName, labName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public LabVirtualMachine create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .createOrUpdate(resourceGroupName, labName, name, this.innerModel(), context);
        return this;
    }

    LabVirtualMachineImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new LabVirtualMachineInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public LabVirtualMachineImpl update() {
        this.updateLabVirtualMachine = new LabVirtualMachineFragment();
        return this;
    }

    public LabVirtualMachine apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .updateWithResponse(resourceGroupName, labName, name, updateLabVirtualMachine, Context.NONE)
                .getValue();
        return this;
    }

    public LabVirtualMachine apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .updateWithResponse(resourceGroupName, labName, name, updateLabVirtualMachine, context)
                .getValue();
        return this;
    }

    LabVirtualMachineImpl(
        LabVirtualMachineInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "virtualmachines");
    }

    public LabVirtualMachine refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public LabVirtualMachine refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .getWithResponse(resourceGroupName, labName, name, localExpand, context)
                .getValue();
        return this;
    }

    public void addDataDisk(DataDiskProperties dataDiskProperties) {
        serviceManager.virtualMachines().addDataDisk(resourceGroupName, labName, name, dataDiskProperties);
    }

    public void addDataDisk(DataDiskProperties dataDiskProperties, Context context) {
        serviceManager.virtualMachines().addDataDisk(resourceGroupName, labName, name, dataDiskProperties, context);
    }

    public void applyArtifacts(ApplyArtifactsRequest applyArtifactsRequest) {
        serviceManager.virtualMachines().applyArtifacts(resourceGroupName, labName, name, applyArtifactsRequest);
    }

    public void applyArtifacts(ApplyArtifactsRequest applyArtifactsRequest, Context context) {
        serviceManager
            .virtualMachines()
            .applyArtifacts(resourceGroupName, labName, name, applyArtifactsRequest, context);
    }

    public void claim() {
        serviceManager.virtualMachines().claim(resourceGroupName, labName, name);
    }

    public void claim(Context context) {
        serviceManager.virtualMachines().claim(resourceGroupName, labName, name, context);
    }

    public void detachDataDisk(DetachDataDiskProperties detachDataDiskProperties) {
        serviceManager.virtualMachines().detachDataDisk(resourceGroupName, labName, name, detachDataDiskProperties);
    }

    public void detachDataDisk(DetachDataDiskProperties detachDataDiskProperties, Context context) {
        serviceManager
            .virtualMachines()
            .detachDataDisk(resourceGroupName, labName, name, detachDataDiskProperties, context);
    }

    public RdpConnection getRdpFileContents() {
        return serviceManager.virtualMachines().getRdpFileContents(resourceGroupName, labName, name);
    }

    public Response<RdpConnection> getRdpFileContentsWithResponse(Context context) {
        return serviceManager
            .virtualMachines()
            .getRdpFileContentsWithResponse(resourceGroupName, labName, name, context);
    }

    public ApplicableSchedule listApplicableSchedules() {
        return serviceManager.virtualMachines().listApplicableSchedules(resourceGroupName, labName, name);
    }

    public Response<ApplicableSchedule> listApplicableSchedulesWithResponse(Context context) {
        return serviceManager
            .virtualMachines()
            .listApplicableSchedulesWithResponse(resourceGroupName, labName, name, context);
    }

    public void redeploy() {
        serviceManager.virtualMachines().redeploy(resourceGroupName, labName, name);
    }

    public void redeploy(Context context) {
        serviceManager.virtualMachines().redeploy(resourceGroupName, labName, name, context);
    }

    public void resize(ResizeLabVirtualMachineProperties resizeLabVirtualMachineProperties) {
        serviceManager.virtualMachines().resize(resourceGroupName, labName, name, resizeLabVirtualMachineProperties);
    }

    public void resize(ResizeLabVirtualMachineProperties resizeLabVirtualMachineProperties, Context context) {
        serviceManager
            .virtualMachines()
            .resize(resourceGroupName, labName, name, resizeLabVirtualMachineProperties, context);
    }

    public void restart() {
        serviceManager.virtualMachines().restart(resourceGroupName, labName, name);
    }

    public void restart(Context context) {
        serviceManager.virtualMachines().restart(resourceGroupName, labName, name, context);
    }

    public void start() {
        serviceManager.virtualMachines().start(resourceGroupName, labName, name);
    }

    public void start(Context context) {
        serviceManager.virtualMachines().start(resourceGroupName, labName, name, context);
    }

    public void stop() {
        serviceManager.virtualMachines().stop(resourceGroupName, labName, name);
    }

    public void stop(Context context) {
        serviceManager.virtualMachines().stop(resourceGroupName, labName, name, context);
    }

    public void transferDisks() {
        serviceManager.virtualMachines().transferDisks(resourceGroupName, labName, name);
    }

    public void transferDisks(Context context) {
        serviceManager.virtualMachines().transferDisks(resourceGroupName, labName, name, context);
    }

    public void unClaim() {
        serviceManager.virtualMachines().unClaim(resourceGroupName, labName, name);
    }

    public void unClaim(Context context) {
        serviceManager.virtualMachines().unClaim(resourceGroupName, labName, name, context);
    }

    public LabVirtualMachineImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LabVirtualMachineImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public LabVirtualMachineImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateLabVirtualMachine.withTags(tags);
            return this;
        }
    }

    public LabVirtualMachineImpl withNotes(String notes) {
        this.innerModel().withNotes(notes);
        return this;
    }

    public LabVirtualMachineImpl withOwnerObjectId(String ownerObjectId) {
        this.innerModel().withOwnerObjectId(ownerObjectId);
        return this;
    }

    public LabVirtualMachineImpl withOwnerUserPrincipalName(String ownerUserPrincipalName) {
        this.innerModel().withOwnerUserPrincipalName(ownerUserPrincipalName);
        return this;
    }

    public LabVirtualMachineImpl withCreatedDate(OffsetDateTime createdDate) {
        this.innerModel().withCreatedDate(createdDate);
        return this;
    }

    public LabVirtualMachineImpl withCustomImageId(String customImageId) {
        this.innerModel().withCustomImageId(customImageId);
        return this;
    }

    public LabVirtualMachineImpl withSize(String size) {
        this.innerModel().withSize(size);
        return this;
    }

    public LabVirtualMachineImpl withUsername(String username) {
        this.innerModel().withUsername(username);
        return this;
    }

    public LabVirtualMachineImpl withPassword(String password) {
        this.innerModel().withPassword(password);
        return this;
    }

    public LabVirtualMachineImpl withSshKey(String sshKey) {
        this.innerModel().withSshKey(sshKey);
        return this;
    }

    public LabVirtualMachineImpl withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey) {
        this.innerModel().withIsAuthenticationWithSshKey(isAuthenticationWithSshKey);
        return this;
    }

    public LabVirtualMachineImpl withLabSubnetName(String labSubnetName) {
        this.innerModel().withLabSubnetName(labSubnetName);
        return this;
    }

    public LabVirtualMachineImpl withLabVirtualNetworkId(String labVirtualNetworkId) {
        this.innerModel().withLabVirtualNetworkId(labVirtualNetworkId);
        return this;
    }

    public LabVirtualMachineImpl withDisallowPublicIpAddress(Boolean disallowPublicIpAddress) {
        this.innerModel().withDisallowPublicIpAddress(disallowPublicIpAddress);
        return this;
    }

    public LabVirtualMachineImpl withArtifacts(List<ArtifactInstallProperties> artifacts) {
        this.innerModel().withArtifacts(artifacts);
        return this;
    }

    public LabVirtualMachineImpl withGalleryImageReference(GalleryImageReference galleryImageReference) {
        this.innerModel().withGalleryImageReference(galleryImageReference);
        return this;
    }

    public LabVirtualMachineImpl withPlanId(String planId) {
        this.innerModel().withPlanId(planId);
        return this;
    }

    public LabVirtualMachineImpl withNetworkInterface(NetworkInterfaceProperties networkInterface) {
        this.innerModel().withNetworkInterface(networkInterface);
        return this;
    }

    public LabVirtualMachineImpl withExpirationDate(OffsetDateTime expirationDate) {
        this.innerModel().withExpirationDate(expirationDate);
        return this;
    }

    public LabVirtualMachineImpl withAllowClaim(Boolean allowClaim) {
        this.innerModel().withAllowClaim(allowClaim);
        return this;
    }

    public LabVirtualMachineImpl withStorageType(String storageType) {
        this.innerModel().withStorageType(storageType);
        return this;
    }

    public LabVirtualMachineImpl withEnvironmentId(String environmentId) {
        this.innerModel().withEnvironmentId(environmentId);
        return this;
    }

    public LabVirtualMachineImpl withDataDiskParameters(List<DataDiskProperties> dataDiskParameters) {
        this.innerModel().withDataDiskParameters(dataDiskParameters);
        return this;
    }

    public LabVirtualMachineImpl withScheduleParameters(List<ScheduleCreationParameter> scheduleParameters) {
        this.innerModel().withScheduleParameters(scheduleParameters);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
