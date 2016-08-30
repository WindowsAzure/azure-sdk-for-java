package com.microsoft.azure.management.compute.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.AvailabilitySet;
import com.microsoft.azure.management.compute.DataDisk;
import com.microsoft.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.microsoft.azure.management.compute.KnownWindowsVirtualMachineImage;
import com.microsoft.azure.management.compute.PowerState;
import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineDataDisk;
import com.microsoft.azure.management.compute.VirtualMachineExtension;
import com.microsoft.azure.management.compute.VirtualMachineSize;
import com.microsoft.azure.management.compute.InstanceViewStatus;
import com.microsoft.azure.management.compute.InstanceViewTypes;
import com.microsoft.azure.management.compute.Plan;
import com.microsoft.azure.management.compute.HardwareProfile;
import com.microsoft.azure.management.compute.StorageProfile;
import com.microsoft.azure.management.compute.OSProfile;
import com.microsoft.azure.management.compute.DiagnosticsProfile;
import com.microsoft.azure.management.compute.VirtualMachineInstanceView;
import com.microsoft.azure.management.compute.OperatingSystemTypes;
import com.microsoft.azure.management.compute.ImageReference;
import com.microsoft.azure.management.compute.WinRMListener;
import com.microsoft.azure.management.compute.CachingTypes;
import com.microsoft.azure.management.compute.DiskEncryptionSettings;
import com.microsoft.azure.management.compute.VirtualMachineSizeTypes;
import com.microsoft.azure.management.compute.VirtualHardDisk;
import com.microsoft.azure.management.compute.OSDisk;
import com.microsoft.azure.management.compute.DiskCreateOptionTypes;
import com.microsoft.azure.management.compute.LinuxConfiguration;
import com.microsoft.azure.management.compute.WindowsConfiguration;
import com.microsoft.azure.management.compute.WinRMConfiguration;
import com.microsoft.azure.management.compute.SshConfiguration;
import com.microsoft.azure.management.compute.SshPublicKey;
import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.NetworkInterface;
import com.microsoft.azure.management.network.PublicIpAddress;
import com.microsoft.azure.management.network.implementation.NetworkManager;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.ResourceServiceCall;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import com.microsoft.azure.management.resources.fluentcore.utils.ResourceNamer;
import com.microsoft.azure.management.resources.implementation.PageImpl;
import com.microsoft.azure.management.storage.StorageAccount;
import com.microsoft.azure.management.storage.implementation.StorageManager;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The implementation for {@link VirtualMachine} and its create and update interfaces.
 */
class VirtualMachineImpl
        extends GroupableResourceImpl<
            VirtualMachine,
            VirtualMachineInner,
            VirtualMachineImpl,
            ComputeManager>
        implements
        VirtualMachine,
        VirtualMachine.Definition,
        VirtualMachine.Update {
    // Clients
    private final VirtualMachinesInner client;
    private final VirtualMachineExtensionsInner extensionsClient;
    private final StorageManager storageManager;
    private final NetworkManager networkManager;
    // the name of the virtual machine
    private final String vmName;
    // used to generate unique name for any dependency resources
    private final ResourceNamer namer;
    // unique key of a creatable storage account to be used for virtual machine child resources that
    // requires storage [OS disk, data disk etc..]
    private String creatableStorageAccountKey;
    // unique key of a creatable availability set that this virtual machine to put
    private String creatableAvailabilitySetKey;
    // unique key of a creatable network interface that needs to be used as virtual machine's primary network interface
    private String creatablePrimaryNetworkInterfaceKey;
    // unique key of a creatable network interfaces that needs to be used as virtual machine's secondary network interface
    private List<String> creatableSecondaryNetworkInterfaceKeys;
    // reference to an existing storage account to be used for virtual machine child resources that
    // requires storage [OS disk, data disk etc..]
    private StorageAccount existingStorageAccountToAssociate;
    // reference to an existing availability set that this virtual machine to put
    private AvailabilitySet existingAvailabilitySetToAssociate;
    // reference to an existing network interface that needs to be used as virtual machine's primary network interface
    private NetworkInterface existingPrimaryNetworkInterfaceToAssociate;
    // reference to a list of existing network interfaces that needs to be used as virtual machine's secondary network interface
    private List<NetworkInterface> existingSecondaryNetworkInterfacesToAssociate;
    // Cached related resources
    private NetworkInterface primaryNetworkInterface;
    private PublicIpAddress primaryPublicIpAddress;
    private VirtualMachineInstanceView virtualMachineInstanceView;
    private boolean isMarketplaceLinuxImage;
    // The data disks associated with the virtual machine
    private List<VirtualMachineDataDisk> dataDisks;
    // The extensions associated to the virtual machine
    private ConcurrentMap<String, VirtualMachineExtensionImpl> extensions;
    // Intermediate state of network interface definition to which private IP can be associated
    private NetworkInterface.DefinitionStages.WithPrimaryPrivateIp nicDefinitionWithPrivateIp;
    // Intermediate state of network interface definition to which subnet can be associated
    private NetworkInterface.DefinitionStages.WithPrimaryNetworkSubnet nicDefinitionWithSubnet;
    // Intermediate state of network interface definition to which public IP can be associated
    private NetworkInterface.DefinitionStages.WithCreate nicDefinitionWithCreate;
    // Virtual machine size converter
    private final PagedListConverter<VirtualMachineSizeInner, VirtualMachineSize> virtualMachineSizeConverter;

    VirtualMachineImpl(String name,
                       VirtualMachineInner innerModel,
                       VirtualMachinesInner client,
                       VirtualMachineExtensionsInner extensionsClient,
                       final ComputeManager computeManager,
                       final StorageManager storageManager,
                       final NetworkManager networkManager) {
        super(name, innerModel, computeManager);
        this.client = client;
        this.extensionsClient = extensionsClient;
        this.storageManager = storageManager;
        this.networkManager = networkManager;
        this.vmName = name;
        this.isMarketplaceLinuxImage = false;
        this.namer = new ResourceNamer(this.vmName);
        this.creatableSecondaryNetworkInterfaceKeys = new ArrayList<>();
        this.existingSecondaryNetworkInterfacesToAssociate = new ArrayList<>();
        this.virtualMachineSizeConverter = new PagedListConverter<VirtualMachineSizeInner, VirtualMachineSize>() {
            @Override
            public VirtualMachineSize typeConvert(VirtualMachineSizeInner inner) {
                return new VirtualMachineSizeImpl(inner);
            }
        };
        initializeDataDisks();
        initializeExtensions();
    }

    // Verbs

    @Override
    public VirtualMachine refresh() throws Exception {
        ServiceResponse<VirtualMachineInner> response =
                this.client.get(this.resourceGroupName(), this.name());
        this.setInner(response.getBody());
        clearCachedRelatedResources();
        initializeDataDisks();
        initializeExtensions();
        return this;
    }

    @Override
    public VirtualMachine apply() throws Exception {
        return this.create();
    }

    @Override
    public ServiceCall<VirtualMachine> applyAsync(ServiceCallback<VirtualMachine> callback) {
        return this.createAsync(callback);
    }

    @Override
    public void deallocate() throws CloudException, IOException, InterruptedException {
        this.client.deallocate(this.resourceGroupName(), this.name());
    }

    @Override
    public void generalize() throws CloudException, IOException {
        this.client.generalize(this.resourceGroupName(), this.name());
    }

    @Override
    public void powerOff() throws CloudException, IOException, InterruptedException {
        this.client.powerOff(this.resourceGroupName(), this.name());
    }

    @Override
    public void restart() throws CloudException, IOException, InterruptedException {
        this.client.restart(this.resourceGroupName(), this.name());
    }

    @Override
    public void start() throws CloudException, IOException, InterruptedException {
        this.client.start(this.resourceGroupName(), this.name());
    }

    @Override
    public void redeploy() throws CloudException, IOException, InterruptedException {
        this.client.redeploy(this.resourceGroupName(), this.name());
    }

    @Override
    public PagedList<VirtualMachineSize> availableSizes() throws CloudException, IOException {
        PageImpl<VirtualMachineSizeInner> page = new PageImpl<>();
        page.setItems(this.client.listAvailableSizes(this.resourceGroupName(), this.name()).getBody());
        page.setNextPageLink(null);
        return this.virtualMachineSizeConverter.convert(new PagedList<VirtualMachineSizeInner>(page) {
            @Override
            public Page<VirtualMachineSizeInner> nextPage(String nextPageLink) throws RestException, IOException {
                return null;
            }
        });
    }

    @Override
    public String capture(String containerName, boolean overwriteVhd) throws CloudException, IOException, InterruptedException {
        VirtualMachineCaptureParametersInner parameters = new VirtualMachineCaptureParametersInner();
        parameters.withDestinationContainerName(containerName);
        parameters.withOverwriteVhds(overwriteVhd);
        ServiceResponse<VirtualMachineCaptureResultInner> captureResult = this.client.capture(this.resourceGroupName(), this.name(), parameters);
        ObjectMapper mapper = new ObjectMapper();
        //Object to JSON string
        return mapper.writeValueAsString(captureResult.getBody().output());
    }

    @Override
    public VirtualMachineInstanceView refreshInstanceView() throws CloudException, IOException {
        this.virtualMachineInstanceView = this.client.get(this.resourceGroupName(),
                this.name(),
                InstanceViewTypes.INSTANCE_VIEW).getBody().instanceView();
        return this.virtualMachineInstanceView;
    }

    /**************************************************
     * .
     * Setters
     **************************************************/

    // Fluent methods for defining virtual network association for the new primary network interface
    @Override
    public VirtualMachineImpl withNewPrimaryNetwork(Creatable<Network> creatable) {
        this.nicDefinitionWithPrivateIp = this.preparePrimaryNetworkInterface(this.namer.randomName("nic", 20))
                .withNewPrimaryNetwork(creatable);
        return this;
    }

    @Override
    public VirtualMachineImpl withNewPrimaryNetwork(String addressSpace) {
        this.nicDefinitionWithPrivateIp = this.preparePrimaryNetworkInterface(this.namer.randomName("nic", 20))
                .withNewPrimaryNetwork(addressSpace);
        return this;
    }

    @Override
    public VirtualMachineImpl withExistingPrimaryNetwork(Network network) {
        this.nicDefinitionWithSubnet = this.preparePrimaryNetworkInterface(this.namer.randomName("nic", 20))
                .withExistingPrimaryNetwork(network);
        return this;
    }

    @Override
    public VirtualMachineImpl withSubnet(String name) {
        this.nicDefinitionWithPrivateIp = this.nicDefinitionWithSubnet
                .withSubnet(name);
        return this;
    }

    // Fluent methods for defining private IP association for the new primary network interface

    @Override
    public VirtualMachineImpl withPrimaryPrivateIpAddressDynamic() {
        this.nicDefinitionWithCreate = this.nicDefinitionWithPrivateIp
                .withPrimaryPrivateIpAddressDynamic();
        return this;
    }

    @Override
    public VirtualMachineImpl withPrimaryPrivateIpAddressStatic(String staticPrivateIpAddress) {
        this.nicDefinitionWithCreate = this.nicDefinitionWithPrivateIp
                .withPrimaryPrivateIpAddressStatic(staticPrivateIpAddress);
        return this;
    }

    // Fluent methods for defining public IP association for the new primary network interface

    @Override
    public VirtualMachineImpl withNewPrimaryPublicIpAddress(Creatable<PublicIpAddress> creatable) {
        Creatable<NetworkInterface> nicCreatable = this.nicDefinitionWithCreate
                .withNewPrimaryPublicIpAddress(creatable);
        this.addCreatableDependency(nicCreatable);
        return this;
    }

    @Override
    public VirtualMachineImpl withNewPrimaryPublicIpAddress(String leafDnsLabel) {
        Creatable<NetworkInterface> nicCreatable = this.nicDefinitionWithCreate
                .withNewPrimaryPublicIpAddress(leafDnsLabel);
        this.creatablePrimaryNetworkInterfaceKey = nicCreatable.key();
        this.addCreatableDependency(nicCreatable);
        return this;
    }

    @Override
    public VirtualMachineImpl withExistingPrimaryPublicIpAddress(PublicIpAddress publicIpAddress) {
        Creatable<NetworkInterface> nicCreatable = this.nicDefinitionWithCreate
                .withExistingPrimaryPublicIpAddress(publicIpAddress);
        this.creatablePrimaryNetworkInterfaceKey = nicCreatable.key();
        this.addCreatableDependency(nicCreatable);
        return this;
    }

    @Override
    public VirtualMachineImpl withoutPrimaryPublicIpAddress() {
        Creatable<NetworkInterface> nicCreatable = this.nicDefinitionWithCreate;
        this.creatablePrimaryNetworkInterfaceKey = nicCreatable.key();
        this.addCreatableDependency(nicCreatable);
        return this;
    }

    // Virtual machine primary network interface specific fluent methods
    //
    @Override
    public VirtualMachineImpl withNewPrimaryNetworkInterface(Creatable<NetworkInterface> creatable) {
        this.creatablePrimaryNetworkInterfaceKey = creatable.key();
        this.addCreatableDependency(creatable);
        return this;
    }

    public VirtualMachineImpl withNewPrimaryNetworkInterface(String name, String publicDnsNameLabel) {
        Creatable<NetworkInterface> definitionCreatable = prepareNetworkInterface(name)
                .withNewPrimaryPublicIpAddress(publicDnsNameLabel);
        return withNewPrimaryNetworkInterface(definitionCreatable);
    }

    @Override
    public VirtualMachineImpl withExistingPrimaryNetworkInterface(NetworkInterface networkInterface) {
        this.existingPrimaryNetworkInterfaceToAssociate = networkInterface;
        return this;
    }

    // Virtual machine image specific fluent methods
    //

    @Override
    public VirtualMachineImpl withStoredWindowsImage(String imageUrl) {
        VirtualHardDisk userImageVhd = new VirtualHardDisk();
        userImageVhd.withUri(imageUrl);
        this.inner().storageProfile().osDisk().withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.inner().storageProfile().osDisk().withImage(userImageVhd);
        // For platform image osType will be null, azure will pick it from the image metadata.
        this.inner().storageProfile().osDisk().withOsType(OperatingSystemTypes.WINDOWS);
        this.inner().osProfile().withWindowsConfiguration(new WindowsConfiguration());
        // sets defaults for "Stored(User)Image" or "VM(Platform)Image"
        this.inner().osProfile().windowsConfiguration().withProvisionVMAgent(true);
        this.inner().osProfile().windowsConfiguration().withEnableAutomaticUpdates(true);
        return this;
    }

    @Override
    public VirtualMachineImpl withStoredLinuxImage(String imageUrl) {
        VirtualHardDisk userImageVhd = new VirtualHardDisk();
        userImageVhd.withUri(imageUrl);
        this.inner().storageProfile().osDisk().withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.inner().storageProfile().osDisk().withImage(userImageVhd);
        // For platform image osType will be null, azure will pick it from the image metadata.
        this.inner().storageProfile().osDisk().withOsType(OperatingSystemTypes.LINUX);
        this.inner().osProfile().withLinuxConfiguration(new LinuxConfiguration());
        return this;
    }

    @Override
    public VirtualMachineImpl withPopularWindowsImage(KnownWindowsVirtualMachineImage knownImage) {
        return withSpecificWindowsImageVersion(knownImage.imageReference());
    }

    @Override
    public VirtualMachineImpl withPopularLinuxImage(KnownLinuxVirtualMachineImage knownImage) {
        return withSpecificLinuxImageVersion(knownImage.imageReference());
    }

    @Override
    public VirtualMachineImpl withSpecificWindowsImageVersion(ImageReference imageReference) {
        this.inner().storageProfile().osDisk().withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.inner().storageProfile().withImageReference(imageReference);
        this.inner().osProfile().withWindowsConfiguration(new WindowsConfiguration());
        // sets defaults for "Stored(User)Image" or "VM(Platform)Image"
        this.inner().osProfile().windowsConfiguration().withProvisionVMAgent(true);
        this.inner().osProfile().windowsConfiguration().withEnableAutomaticUpdates(true);
        return this;
    }

    @Override
    public VirtualMachineImpl withSpecificLinuxImageVersion(ImageReference imageReference) {
        this.inner().storageProfile().osDisk().withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.inner().storageProfile().withImageReference(imageReference);
        this.inner().osProfile().withLinuxConfiguration(new LinuxConfiguration());
        this.isMarketplaceLinuxImage = true;
        return this;
    }

    @Override
    public VirtualMachineImpl withLatestWindowsImage(String publisher, String offer, String sku) {
        ImageReference imageReference = new ImageReference();
        imageReference.withPublisher(publisher);
        imageReference.withOffer(offer);
        imageReference.withSku(sku);
        imageReference.withVersion("latest");
        return withSpecificWindowsImageVersion(imageReference);
    }

    @Override
    public VirtualMachineImpl withLatestLinuxImage(String publisher, String offer, String sku) {
        ImageReference imageReference = new ImageReference();
        imageReference.withPublisher(publisher);
        imageReference.withOffer(offer);
        imageReference.withSku(sku);
        imageReference.withVersion("latest");
        return withSpecificLinuxImageVersion(imageReference);
    }

    @Override
    public VirtualMachineImpl withOsDisk(String osDiskUrl, OperatingSystemTypes osType) {
        VirtualHardDisk osDisk = new VirtualHardDisk();
        osDisk.withUri(osDiskUrl);
        this.inner().storageProfile().osDisk().withCreateOption(DiskCreateOptionTypes.ATTACH);
        this.inner().storageProfile().osDisk().withVhd(osDisk);
        this.inner().storageProfile().osDisk().withOsType(osType);
        return this;
    }

    // Virtual machine user name fluent methods
    //

    @Override
    public VirtualMachineImpl withRootUserName(String rootUserName) {
        this.inner().osProfile().withAdminUsername(rootUserName);
        return this;
    }

    @Override
    public VirtualMachineImpl withAdminUserName(String adminUserName) {
        this.inner().osProfile().withAdminUsername(adminUserName);
        return this;
    }

    // Virtual machine optional fluent methods
    //

    @Override
    public VirtualMachineImpl withSsh(String publicKeyData) {
        OSProfile osProfile = this.inner().osProfile();
        if (osProfile.linuxConfiguration().ssh() == null) {
            SshConfiguration sshConfiguration = new SshConfiguration();
            sshConfiguration.withPublicKeys(new ArrayList<SshPublicKey>());
            osProfile.linuxConfiguration().withSsh(sshConfiguration);
        }
        SshPublicKey sshPublicKey = new SshPublicKey();
        sshPublicKey.withKeyData(publicKeyData);
        sshPublicKey.withPath("/home/" + osProfile.adminUsername() + "/.ssh/authorized_keys");
        osProfile.linuxConfiguration().ssh().publicKeys().add(sshPublicKey);
        return this;
    }

    @Override
    public VirtualMachineImpl disableVmAgent() {
        this.inner().osProfile().windowsConfiguration().withProvisionVMAgent(false);
        return this;
    }

    @Override
    public VirtualMachineImpl disableAutoUpdate() {
        this.inner().osProfile().windowsConfiguration().withEnableAutomaticUpdates(false);
        return this;
    }

    @Override
    public VirtualMachineImpl withTimeZone(String timeZone) {
        this.inner().osProfile().windowsConfiguration().withTimeZone(timeZone);
        return this;
    }

    @Override
    public VirtualMachineImpl withWinRm(WinRMListener listener) {
        if (this.inner().osProfile().windowsConfiguration().winRM() == null) {
            WinRMConfiguration winRMConfiguration = new WinRMConfiguration();
            this.inner().osProfile().windowsConfiguration().withWinRM(winRMConfiguration);
        }

        this.inner().osProfile()
                .windowsConfiguration()
                .winRM()
                .listeners()
                .add(listener);
        return this;
    }

    @Override
    public VirtualMachineImpl withPassword(String password) {
        this.inner().osProfile().withAdminPassword(password);
        return this;
    }

    @Override
    public VirtualMachineImpl withSize(String sizeName) {
        this.inner().hardwareProfile().withVmSize(new VirtualMachineSizeTypes(sizeName));
        return this;
    }

    @Override
    public VirtualMachineImpl withSize(VirtualMachineSizeTypes size) {
        this.inner().hardwareProfile().withVmSize(size);
        return this;
    }

    @Override
    public VirtualMachineImpl withOsDiskCaching(CachingTypes cachingType) {
        this.inner().storageProfile().osDisk().withCaching(cachingType);
        return this;
    }

    @Override
    public VirtualMachineImpl withOsDiskVhdLocation(String containerName, String vhdName) {
        VirtualHardDisk osVhd = new VirtualHardDisk();
        osVhd.withUri(temporaryBlobUrl(containerName, vhdName));
        this.inner().storageProfile().osDisk().withVhd(osVhd);
        return this;
    }

    @Override
    public VirtualMachineImpl withOsDiskEncryptionSettings(DiskEncryptionSettings settings) {
        this.inner().storageProfile().osDisk().withEncryptionSettings(settings);
        return this;
    }

    @Override
    public VirtualMachineImpl withOsDiskSizeInGb(Integer size) {
        this.inner().storageProfile().osDisk().withDiskSizeGB(size);
        return this;
    }

    @Override
    public VirtualMachineImpl withOsDiskName(String name) {
        this.inner().storageProfile().osDisk().withName(name);
        return this;
    }

    // Virtual machine optional data disk fluent methods
    //

    @Override
    public DataDiskImpl defineNewDataDisk(String name) {
        return DataDiskImpl.prepareDataDisk(name, DiskCreateOptionTypes.EMPTY, this);
    }

    @Override
    public DataDiskImpl defineExistingDataDisk(String name) {
        return DataDiskImpl.prepareDataDisk(name, DiskCreateOptionTypes.ATTACH, this);
    }

    @Override
    public VirtualMachineImpl withNewDataDisk(Integer sizeInGB) {
        return withDataDisk(DataDiskImpl.createNewDataDisk(sizeInGB, this));
    }

    @Override
    public VirtualMachineImpl withExistingDataDisk(String storageAccountName, String containerName, String vhdName) {
        return withDataDisk(DataDiskImpl.createFromExistingDisk(storageAccountName, containerName, vhdName, this));
    }

    // Virtual machine optional storage account fluent methods
    //

    @Override
    public VirtualMachineImpl withNewStorageAccount(Creatable<StorageAccount> creatable) {
        // This method's effect is NOT additive.
        if (this.creatableStorageAccountKey == null) {
            this.creatableStorageAccountKey = creatable.key();
            this.addCreatableDependency(creatable);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withNewStorageAccount(String name) {
        StorageAccount.DefinitionStages.WithGroup definitionWithGroup = this.storageManager
                .storageAccounts()
                .define(name)
                .withRegion(this.regionName());
        Creatable<StorageAccount> definitionAfterGroup;
        if (this.creatableGroup != null) {
            definitionAfterGroup = definitionWithGroup.withNewResourceGroup(this.creatableGroup);
        } else {
            definitionAfterGroup = definitionWithGroup.withExistingResourceGroup(this.resourceGroupName());
        }
        return withNewStorageAccount(definitionAfterGroup);
    }

    @Override
    public VirtualMachineImpl withExistingStorageAccount(StorageAccount storageAccount) {
        this.existingStorageAccountToAssociate = storageAccount;
        return this;
    }

    // Virtual machine optional availability set fluent methods
    //

    @Override
    public VirtualMachineImpl withNewAvailabilitySet(Creatable<AvailabilitySet> creatable) {
        // This method's effect is NOT additive.
        if (this.creatableAvailabilitySetKey == null) {
            this.creatableAvailabilitySetKey = creatable.key();
            this.addCreatableDependency(creatable);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withNewAvailabilitySet(String name) {
        return withNewAvailabilitySet(super.myManager.availabilitySets().define(name)
                .withRegion(this.regionName())
                .withExistingResourceGroup(this.resourceGroupName())
        );
    }

    @Override
    public VirtualMachineImpl withExistingAvailabilitySet(AvailabilitySet availabilitySet) {
        this.existingAvailabilitySetToAssociate = availabilitySet;
        return this;
    }

    @Override
    public VirtualMachineImpl withNewSecondaryNetworkInterface(Creatable<NetworkInterface> creatable) {
        this.creatableSecondaryNetworkInterfaceKeys.add(creatable.key());
        this.addCreatableDependency(creatable);
        return this;
    }

    @Override
    public VirtualMachineImpl withExistingSecondaryNetworkInterface(NetworkInterface networkInterface) {
        this.existingSecondaryNetworkInterfacesToAssociate.add(networkInterface);
        return this;
    }

    // Virtual machine optional extension settings

    @Override
    public VirtualMachineExtensionImpl defineNewExtension(String name) {
        if (findExtension(name) != null) {
            throw new RuntimeException("An extension with name  '" + name + "' already exists");
        }
        VirtualMachineExtensionImpl extension = VirtualMachineExtensionImpl.newVirtualMachineExtension(name,
                this, this.extensionsClient);
        extension.setState(VirtualMachineExtensionImpl.State.ToBeCreated);
        return extension;
    }

    // Virtual machine update only settings

    @Override
    public VirtualMachineImpl withoutDataDisk(String name) {
        int idx = -1;
        for (VirtualMachineDataDisk dataDisk : this.dataDisks) {
            idx++;
            if (dataDisk.name().equalsIgnoreCase(name)) {
                this.dataDisks.remove(idx);
                this.inner().storageProfile().dataDisks().remove(idx);
                break;
            }
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withoutDataDisk(int lun) {
        int idx = -1;
        for (VirtualMachineDataDisk dataDisk : this.dataDisks) {
            idx++;
            if (dataDisk.lun() == lun) {
                this.dataDisks.remove(idx);
                this.inner().storageProfile().dataDisks().remove(idx);
                break;
            }
        }
        return this;
    }

    @Override
    public DataDiskImpl updateDataDisk(String name) {
        for (VirtualMachineDataDisk dataDisk : this.dataDisks) {
            if (dataDisk.name().equalsIgnoreCase(name)) {
                return (DataDiskImpl) dataDisk;
            }
        }
        throw new RuntimeException("A data disk with name  '" + name + "' not found");
    }

    @Override
    public VirtualMachineImpl withoutSecondaryNetworkInterface(String name) {
        if (this.inner().networkProfile() != null
                && this.inner().networkProfile().networkInterfaces() != null) {
            int idx = -1;
            for (NetworkInterfaceReferenceInner nicReference : this.inner().networkProfile().networkInterfaces()) {
                idx++;
                if (!nicReference.primary()
                        && name.equalsIgnoreCase(ResourceUtils.nameFromResourceId(nicReference.id()))) {
                    this.inner().networkProfile().networkInterfaces().remove(idx);
                    break;
                }
            }
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl updateExtension(String name) {
        VirtualMachineExtensionImpl extension = findExtension(name);
        if (extension == null
            || extension.state() == VirtualMachineExtensionImpl.State.ToBeCreated) {
            throw new RuntimeException("An extension with name  '" + name + "' not found");
        }
        if (extension.state() == VirtualMachineExtensionImpl.State.ToBeRemoved) {
            throw new RuntimeException("An extension with name  '" + name + "' is marked for deletion");
        }
        extension.setState(VirtualMachineExtensionImpl.State.ToBeUpdated);
        return extension;
    }

    @Override
    public VirtualMachineImpl withoutExtension(String name) {
        VirtualMachineExtensionImpl extension = findExtension(name);
        if (extension == null
            || extension.state() == VirtualMachineExtensionImpl.State.ToBeCreated) {
            throw new RuntimeException("An extension with name  '" + name + "' not found");
        }
        extension.setState(VirtualMachineExtensionImpl.State.ToBeRemoved);
        return this;
    }

    /**************************************************
     * .
     * Getters
     **************************************************/

    @Override
    public String computerName() {
        return inner().osProfile().computerName();
    }

    @Override
    public VirtualMachineSizeTypes size() {
        return inner().hardwareProfile().vmSize();
    }

    @Override
    public OperatingSystemTypes osType() {
        return inner().storageProfile().osDisk().osType();
    }

    @Override
    public String osDiskVhdUri() {
        return inner().storageProfile().osDisk().vhd().uri();
    }

    @Override
    public CachingTypes osDiskCachingType() {
        return inner().storageProfile().osDisk().caching();
    }

    @Override
    public int osDiskSize() {
        if (inner().storageProfile().osDisk().diskSizeGB() == null) {
            // Server returns OS disk size as 0 for auto-created disks for which
            // size was not explicitly set by the user.
            return 0;
        }
        return inner().storageProfile().osDisk().diskSizeGB();
    }

    @Override
    public List<VirtualMachineDataDisk> dataDisks() {
        return this.dataDisks;
    }

    @Override
    public NetworkInterface primaryNetworkInterface() throws CloudException, IOException {
        if (this.primaryNetworkInterface == null) {
            String primaryNicId = primaryNetworkInterfaceId();
            this.primaryNetworkInterface = this.networkManager.networkInterfaces().getById(primaryNicId);
        }
        return this.primaryNetworkInterface;
    }

    @Override
    public PublicIpAddress primaryPublicIpAddress() throws CloudException, IOException {
        if (this.primaryPublicIpAddress == null) {
            this.primaryPublicIpAddress = this.primaryNetworkInterface().primaryPublicIpAddress();
        }
        return this.primaryPublicIpAddress;
    }

    @Override
    public List<String> networkInterfaceIds() {
        List<String> nicIds = new ArrayList<>();
        for (NetworkInterfaceReferenceInner nicRef : inner().networkProfile().networkInterfaces()) {
            nicIds.add(nicRef.id());
        }
        return nicIds;
    }

    @Override
    public String primaryNetworkInterfaceId() {
        final List<NetworkInterfaceReferenceInner> nicRefs = this.inner().networkProfile().networkInterfaces();
        String primaryNicRefId = null;

        if (nicRefs.size() == 1) {
            // One NIC so assume it to be primary
            primaryNicRefId = nicRefs.get(0).id();
        } else if (nicRefs.size() == 0) {
            // No NICs so null
            primaryNicRefId = null;
        } else {
            // Find primary interface as flagged by Azure
            for (NetworkInterfaceReferenceInner nicRef : inner().networkProfile().networkInterfaces()) {
                if (nicRef.primary() != null && nicRef.primary()) {
                    primaryNicRefId = nicRef.id();
                    break;
                }
            }

            // If Azure didn't flag any NIC as primary then assume the first one
            if (primaryNicRefId == null) {
                primaryNicRefId = nicRefs.get(0).id();
            }
        }

        return primaryNicRefId;
    }

    @Override
    public String availabilitySetId() {
        if (inner().availabilitySet() != null) {
            return inner().availabilitySet().id();
        }
        return null;
    }

    @Override
    public String provisioningState() {
        return inner().provisioningState();
    }

    @Override
    public String licenseType() {
        return inner().licenseType();
    }

    @Override
    public Map<String, VirtualMachineExtension> extensions() throws Exception {
        if (this.extensions.size() == 0) {
            this.refresh();
        }

        Map<String, VirtualMachineExtension> result = new HashMap<>();
        for (Map.Entry<String, VirtualMachineExtensionImpl> extensionEntry : this.extensions.entrySet()) {
            result.put(extensionEntry.getKey(), extensionEntry.getValue());
        }
        return Collections.unmodifiableMap(result);
    }

    @Override
    public Plan plan() {
        return inner().plan();
    }

    @Override
    public StorageProfile storageProfile() {
        return inner().storageProfile();
    }

    @Override
    public OSProfile osProfile() {
        return inner().osProfile();
    }

    @Override
    public DiagnosticsProfile diagnosticsProfile() {
        return inner().diagnosticsProfile();
    }

    @Override
    public String vmId() {
        return inner().vmId();
    }

    @Override
    public VirtualMachineInstanceView instanceView() throws CloudException, IOException {
        if (this.virtualMachineInstanceView == null) {
            this.refreshInstanceView();
        }
        return this.virtualMachineInstanceView;
    }

    @Override
    public PowerState powerState() {
        String powerStateCode = this.getStatusCodeFromInstanceView("PowerState");
        if (powerStateCode != null) {
            return PowerState.fromValue(powerStateCode);
        }
        return null;
    }


    // CreatorTaskGroup.ResourceCreator implementation

    @Override
    public Resource createResource() throws Exception {
        if (isInCreateMode()) {
            setOSDiskAndOSProfileDefaults();
            setHardwareProfileDefaults();
        }
        DataDiskImpl.setDataDisksDefaults(this.dataDisks, this.vmName);

        handleStorageSettings();
        handleNetworkSettings();
        handleAvailabilitySettings();

        ServiceResponse<VirtualMachineInner> serviceResponse = this.client.createOrUpdate(this.resourceGroupName(), this.vmName, this.inner());
        this.setInner(serviceResponse.getBody());
        clearCachedRelatedResources();
        initializeDataDisks();
        return this;
    }

    @Override
    public ServiceCall<Resource> createResourceAsync(final ServiceCallback<Resource> callback) {
        // Work to do: Use Rx Observable to make this code better
        //
        final ResourceServiceCall<VirtualMachine,
                VirtualMachineInner,
                VirtualMachineImpl> setVMServiceCall = new ResourceServiceCall<>(this);
        final ServiceCallback<VirtualMachineInner> setVMCallBackWrapped = setVMServiceCall.wrapCallBack(callback, false, false);

        final ResourceServiceCall<VirtualMachine,
                VirtualMachineInner,
                VirtualMachineImpl> afterVMSetServiceCall = new ResourceServiceCall<>(this);
        final ServiceCallback<VirtualMachineInner> afterSetVMCallBackWrapped = afterVMSetServiceCall.wrapCallBack(callback);

        if (isInCreateMode()) {
            setOSDiskAndOSProfileDefaults();
            setHardwareProfileDefaults();
        }
        DataDiskImpl.setDataDisksDefaults(this.dataDisks, this.vmName);
        // Register success handler for create so that after VM creation extensions can be created/deleted
        //
        setVMServiceCall.withSuccessHandler(new ResourceServiceCall.SuccessHandler<VirtualMachineInner>() {
            @Override
            public void success(final ServiceResponse<VirtualMachineInner> response) {
                clearCachedRelatedResources();
                initializeDataDisks();
                deleteAndSetExtensionsAsync(response, afterSetVMCallBackWrapped);
            }
        }).withFailureHandler(new ResourceServiceCall.FailureHandler() {
            @Override
            public void failure(Throwable t) {
                afterVMSetServiceCall.failure(t);
            }
        });

        // Prepare storage account and on success create the virtual machine
        //
        handleStorageSettingsAsync(new ServiceCallback<Void>() {
            @Override
            public void failure(Throwable t) {
                setVMServiceCall.failure(t);
            }

            @Override
            public void success(ServiceResponse<Void> result) {
                handleNetworkSettings();
                handleAvailabilitySettings();
                client.createOrUpdateAsync(resourceGroupName(), vmName, inner(), setVMCallBackWrapped);
            }
        });
        return afterVMSetServiceCall;
    }

    /**
     * Commit delete, update and create operations on extensions of this virtual machine.
     *
     * @param response
     * @param callback the callback
     */
    private void deleteAndSetExtensionsAsync(final ServiceResponse<VirtualMachineInner> response,
                                             final ServiceCallback<VirtualMachineInner> callback) {
        final VirtualMachineImpl self = this;
        int count = 0;
        for (VirtualMachineExtensionImpl extension : this.extensions.values()) {
            if (extension.state() != VirtualMachineExtensionImpl.State.None) {
                count++;
            }
        }
        if (count == 0) {
            callback.success(response);
            return;
        }

        final AtomicInteger operationCount = new AtomicInteger(count);
        for (final VirtualMachineExtensionImpl extension : this.extensions.values()) {
            if (extension.state() == VirtualMachineExtensionImpl.State.None) {
                continue;
            }

            if (extension.state() == VirtualMachineExtensionImpl.State.ToBeRemoved) {
                this.extensionsClient.deleteAsync(self.resourceGroupName(), self.name(), extension.name(), new ServiceCallback<Void>() {
                    @Override
                    public void failure(Throwable t) {
                        self.extensions.clear();
                        callback.failure(t);
                    }

                    @Override
                    public void success(ServiceResponse<Void> result) {
                        self.extensions.remove(extension.name());
                        if (operationCount.decrementAndGet() == 0) {
                            callback.success(response);
                        }
                    }
                });
            } else {
                extension.createResourceAsync(new ServiceCallback<Resource>() {
                    @Override
                    public void failure(Throwable t) {
                        self.extensions.clear();
                        callback.failure(t);
                    }

                    @Override
                    public void success(ServiceResponse<Resource> result) {
                        extension.setState(VirtualMachineExtensionImpl.State.None);
                        if (operationCount.decrementAndGet() == 0) {
                            callback.success(response);
                        }
                    }
                });
            }
        }
        return;
    }

    // Helpers

    VirtualMachineImpl withDataDisk(DataDiskImpl dataDisk) {
        this.inner()
                .storageProfile()
                .dataDisks()
                .add(dataDisk.inner());
        this.dataDisks
                .add(dataDisk);
        return this;
    }

    VirtualMachineImpl withExtension(VirtualMachineExtensionImpl extension) {
        this.extensions.put(extension.name(), extension);
        return this;
    }

    private VirtualMachineExtensionImpl findExtension(String name) {
        for (Map.Entry<String, VirtualMachineExtensionImpl> extensionEntry : this.extensions.entrySet()) {
            if (extensionEntry.getKey().equalsIgnoreCase(name)) {
                return extensionEntry.getValue();
            }
        }
        return null;
    }

    private void setOSDiskAndOSProfileDefaults() {
        if (!isInCreateMode()) {
            return;
        }

        OSDisk osDisk = this.inner().storageProfile().osDisk();
        if (isOSDiskFromImage(osDisk)) {
            if (osDisk.vhd() == null) {
                // Sets the OS disk VHD for "UserImage" and "VM(Platform)Image"
                withOsDiskVhdLocation("vhds", this.vmName + "-os-disk-" + UUID.randomUUID().toString() + ".vhd");
            }
            OSProfile osProfile = this.inner().osProfile();
            if (osDisk.osType() == OperatingSystemTypes.LINUX || this.isMarketplaceLinuxImage) {
                // linux image: User or marketplace linux image
                if (osProfile.linuxConfiguration() == null) {
                    osProfile.withLinuxConfiguration(new LinuxConfiguration());
                }
                this.inner().osProfile().linuxConfiguration().withDisablePasswordAuthentication(osProfile.adminPassword() == null);
            }
        }

        if (osDisk.caching() == null) {
            withOsDiskCaching(CachingTypes.READ_WRITE);
        }

        if (osDisk.name() == null) {
            withOsDiskName(this.vmName + "-os-disk");
        }

        if (this.inner().osProfile().computerName() == null) {
            // VM name cannot contain only numeric values and cannot exceed 15 chars
            if (vmName.matches("[0-9]+")) {
                this.inner().osProfile().withComputerName(ResourceNamer.randomResourceName("vm", 15));
            } else if (vmName.length() <= 15) {
                this.inner().osProfile().withComputerName(vmName);
            } else {
                this.inner().osProfile().withComputerName(ResourceNamer.randomResourceName("vm", 15));
            }
        }
    }

    private void setHardwareProfileDefaults() {
        if (!isInCreateMode()) {
            return;
        }

        HardwareProfile hardwareProfile = this.inner().hardwareProfile();
        if (hardwareProfile.vmSize() == null) {
            hardwareProfile.withVmSize(VirtualMachineSizeTypes.BASIC_A0);
        }
    }

    private void handleStorageSettings() throws Exception {
        StorageAccount storageAccount = null;
        if (this.creatableStorageAccountKey != null) {
            storageAccount = (StorageAccount) this.createdResource(this.creatableStorageAccountKey);
        } else if (this.existingStorageAccountToAssociate != null) {
            storageAccount = this.existingStorageAccountToAssociate;
        } else if (osDiskRequiresImplicitStorageAccountCreation()
                || dataDisksRequiresImplicitStorageAccountCreation()) {
            storageAccount = this.storageManager.storageAccounts()
                    .define(this.namer.randomName("stg", 24))
                    .withRegion(this.regionName())
                    .withExistingResourceGroup(this.resourceGroupName())
                    .create();
        }

        if (isInCreateMode()) {
            if (isOSDiskFromImage(this.inner().storageProfile().osDisk())) {
                String uri = this.inner()
                        .storageProfile()
                        .osDisk().vhd().uri()
                        .replaceFirst("\\{storage-base-url}", storageAccount.endPoints().primary().blob());
                this.inner().storageProfile().osDisk().vhd().withUri(uri);
            }
            DataDiskImpl.ensureDisksVhdUri(this.dataDisks, storageAccount, this.vmName);
        } else {
            if (storageAccount != null) {
                DataDiskImpl.ensureDisksVhdUri(this.dataDisks, storageAccount, this.vmName);
            } else {
                DataDiskImpl.ensureDisksVhdUri(this.dataDisks, this.vmName);
            }
        }
    }

    private void handleStorageSettingsAsync(final ServiceCallback<Void> callback) {
        final ServiceCallback<StorageAccount> storageAccountServiceCallback = new ServiceCallback<StorageAccount>() {
            @Override
            public void failure(Throwable t) {
                callback.failure(t);
            }

            @Override
            public void success(ServiceResponse<StorageAccount> result) {
                if (isInCreateMode()) {
                    if (isOSDiskFromImage(inner().storageProfile().osDisk())) {
                        String uri = inner()
                                .storageProfile()
                                .osDisk().vhd().uri()
                                .replaceFirst("\\{storage-base-url}", result.getBody().endPoints().primary().blob());
                        inner().storageProfile().osDisk().vhd().withUri(uri);
                    }
                    DataDiskImpl.ensureDisksVhdUri(dataDisks, result.getBody(), vmName);
                } else {
                    if (result.getBody() != null) {
                        DataDiskImpl.ensureDisksVhdUri(dataDisks, result.getBody(), vmName);
                    } else {
                        DataDiskImpl.ensureDisksVhdUri(dataDisks, vmName);
                    }
                }
                callback.success(new ServiceResponse<Void>(result.getHeadResponse()));
            }
        };
        if (this.creatableStorageAccountKey != null) {
            storageAccountServiceCallback.success(new ServiceResponse<>(
                    (StorageAccount) this.createdResource(this.creatableStorageAccountKey), null));
        } else if (this.existingStorageAccountToAssociate != null) {
            storageAccountServiceCallback.success(new ServiceResponse<>(
                    this.existingStorageAccountToAssociate, null));
        } else if (osDiskRequiresImplicitStorageAccountCreation()
                || dataDisksRequiresImplicitStorageAccountCreation()) {
            this.storageManager.storageAccounts()
                    .define(this.namer.randomName("stg", 24))
                    .withRegion(this.regionName())
                    .withExistingResourceGroup(this.resourceGroupName())
                    .createAsync(new ServiceCallback<StorageAccount>() {
                        @Override
                        public void failure(Throwable t) {
                            callback.failure(t);
                        }

                        @Override
                        public void success(ServiceResponse<StorageAccount> result) {
                            storageAccountServiceCallback.success(result);
                        }
                    });
        }

    }

    private void handleNetworkSettings() {
        if (isInCreateMode()) {
            NetworkInterface primaryNetworkInterface = null;
            if (this.creatablePrimaryNetworkInterfaceKey != null) {
                primaryNetworkInterface = (NetworkInterface) this.createdResource(this.creatablePrimaryNetworkInterfaceKey);
            } else if (this.existingPrimaryNetworkInterfaceToAssociate != null) {
                primaryNetworkInterface = this.existingPrimaryNetworkInterfaceToAssociate;
            }

            if (primaryNetworkInterface != null) {
                NetworkInterfaceReferenceInner nicReference = new NetworkInterfaceReferenceInner();
                nicReference.withPrimary(true);
                nicReference.withId(primaryNetworkInterface.id());
                this.inner().networkProfile().networkInterfaces().add(nicReference);
            }
        }

        // sets the virtual machine secondary network interfaces
        //
        for (String creatableSecondaryNetworkInterfaceKey : this.creatableSecondaryNetworkInterfaceKeys) {
            NetworkInterface secondaryNetworkInterface = (NetworkInterface) this.createdResource(creatableSecondaryNetworkInterfaceKey);
            NetworkInterfaceReferenceInner nicReference = new NetworkInterfaceReferenceInner();
            nicReference.withPrimary(false);
            nicReference.withId(secondaryNetworkInterface.id());
            this.inner().networkProfile().networkInterfaces().add(nicReference);
        }

        for (NetworkInterface secondaryNetworkInterface : this.existingSecondaryNetworkInterfacesToAssociate) {
            NetworkInterfaceReferenceInner nicReference = new NetworkInterfaceReferenceInner();
            nicReference.withPrimary(false);
            nicReference.withId(secondaryNetworkInterface.id());
            this.inner().networkProfile().networkInterfaces().add(nicReference);
        }
    }

    private void handleAvailabilitySettings() {
        if (!isInCreateMode()) {
            return;
        }

        AvailabilitySet availabilitySet = null;
        if (this.creatableAvailabilitySetKey != null) {
            availabilitySet = (AvailabilitySet) this.createdResource(this.creatableAvailabilitySetKey);
        } else if (this.existingAvailabilitySetToAssociate != null) {
            availabilitySet = this.existingAvailabilitySetToAssociate;
        }

        if (availabilitySet != null) {
            if (this.inner().availabilitySet() == null) {
                this.inner().withAvailabilitySet(new SubResource());
            }

            this.inner().availabilitySet().withId(availabilitySet.id());
        }
    }

    private boolean osDiskRequiresImplicitStorageAccountCreation() {
        if (this.creatableStorageAccountKey != null
                || this.existingStorageAccountToAssociate != null
                || !isInCreateMode()) {
            return false;
        }

        return isOSDiskFromImage(this.inner().storageProfile().osDisk());
    }

    private boolean dataDisksRequiresImplicitStorageAccountCreation() {
        if (this.creatableStorageAccountKey != null
                || this.existingStorageAccountToAssociate != null
                || this.dataDisks.size() == 0) {
            return false;
        }

        boolean hasEmptyVhd = false;
        for (VirtualMachineDataDisk dataDisk : this.dataDisks) {
            if (dataDisk.createOption() == DiskCreateOptionTypes.EMPTY) {
                if (dataDisk.inner().vhd() == null) {
                    hasEmptyVhd = true;
                    break;
                }
            }
        }

        if (isInCreateMode()) {
            return hasEmptyVhd;
        }

        if (hasEmptyVhd) {
            // In update mode, if any of the data disk has vhd uri set then use same container
            // to store this disk, no need to create a storage account implicitly.
            for (VirtualMachineDataDisk dataDisk : this.dataDisks) {
                if (dataDisk.createOption() == DiskCreateOptionTypes.ATTACH && dataDisk.inner().vhd() != null) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private boolean isOSDiskAttached(OSDisk osDisk) {
        return osDisk.createOption() == DiskCreateOptionTypes.ATTACH;
    }

    private boolean isOSDiskFromImage(OSDisk osDisk) {
        return !isOSDiskAttached(osDisk);
    }

    private String temporaryBlobUrl(String containerName, String blobName) {
        return "{storage-base-url}" + containerName + "/" + blobName;
    }

    private NetworkInterface.DefinitionStages.WithPrimaryPublicIpAddress prepareNetworkInterface(String name) {
        NetworkInterface.DefinitionStages.WithGroup definitionWithGroup = this.networkManager
                .networkInterfaces()
                .define(name)
                .withRegion(this.regionName());
        NetworkInterface.DefinitionStages.WithPrimaryNetwork definitionWithNetwork;
        if (this.creatableGroup != null) {
            definitionWithNetwork = definitionWithGroup.withNewResourceGroup(this.creatableGroup);
        } else {
            definitionWithNetwork = definitionWithGroup.withExistingResourceGroup(this.resourceGroupName());
        }
        return definitionWithNetwork
                .withNewPrimaryNetwork("vnet" + name)
                .withPrimaryPrivateIpAddressDynamic();
    }

    private void initializeDataDisks() {
        if (this.inner().storageProfile().dataDisks() == null) {
            this.inner()
                    .storageProfile()
                    .withDataDisks(new ArrayList<DataDisk>());
        }
        this.dataDisks = new ArrayList<>();
        for (DataDisk dataDiskInner : this.storageProfile().dataDisks()) {
            this.dataDisks().add(new DataDiskImpl(dataDiskInner, this));
        }
    }

    private void initializeExtensions() {
        this.extensions = new ConcurrentHashMap<>();
        if (this.inner().resources() != null) {
            for (VirtualMachineExtensionInner innerExtension : this.inner().resources()) {
                this.extensions.put(innerExtension.name(),
                        new VirtualMachineExtensionImpl(innerExtension.name(), this, innerExtension, this.extensionsClient));
            }
        }
    }

    private NetworkInterface.DefinitionStages.WithPrimaryNetwork preparePrimaryNetworkInterface(String name) {
        NetworkInterface.DefinitionStages.WithGroup definitionWithGroup = this.networkManager.networkInterfaces()
                .define(name)
                .withRegion(this.regionName());
        NetworkInterface.DefinitionStages.WithPrimaryNetwork definitionAfterGroup;
        if (this.creatableGroup != null) {
            definitionAfterGroup = definitionWithGroup.withNewResourceGroup(this.creatableGroup);
        } else {
            definitionAfterGroup = definitionWithGroup.withExistingResourceGroup(this.resourceGroupName());
        }
        return definitionAfterGroup;
    }

    private String getStatusCodeFromInstanceView(String codePrefix) {
        try {
            for (InstanceViewStatus status : this.instanceView().statuses()) {
                if (status.code() != null && status.code().startsWith(codePrefix)) {
                    return status.code();
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    private void clearCachedRelatedResources() {
        this.primaryNetworkInterface = null;
        this.primaryPublicIpAddress = null;
        this.virtualMachineInstanceView = null;
    }
}
