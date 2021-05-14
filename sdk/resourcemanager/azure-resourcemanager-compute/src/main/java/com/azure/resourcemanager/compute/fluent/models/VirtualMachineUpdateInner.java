// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.models.BillingProfile;
import com.azure.resourcemanager.compute.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.models.HardwareProfile;
import com.azure.resourcemanager.compute.models.NetworkProfile;
import com.azure.resourcemanager.compute.models.OSProfile;
import com.azure.resourcemanager.compute.models.Plan;
import com.azure.resourcemanager.compute.models.ScheduledEventsProfile;
import com.azure.resourcemanager.compute.models.SecurityProfile;
import com.azure.resourcemanager.compute.models.StorageProfile;
import com.azure.resourcemanager.compute.models.UpdateResource;
import com.azure.resourcemanager.compute.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.compute.models.VirtualMachineIdentity;
import com.azure.resourcemanager.compute.models.VirtualMachinePriorityTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine Update. */
@JsonFlatten
@Fluent
public class VirtualMachineUpdateInner extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineUpdateInner.class);

    /*
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started ->**. Enter any required information and
     * then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * The identity of the virtual machine, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineIdentity identity;

    /*
     * The virtual machine zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Specifies the hardware settings for the virtual machine.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /*
     * Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     */
    @JsonProperty(value = "properties.additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the operating system settings used while creating the virtual
     * machine. Some of the settings cannot be changed once VM is provisioned.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /*
     * Specifies the network interfaces of the virtual machine.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Specifies the Security related profile settings for the virtual machine.
     */
    @JsonProperty(value = "properties.securityProfile")
    private SecurityProfile securityProfile;

    /*
     * Specifies the boot diagnostic settings state. <br><br>Minimum
     * api-version: 2015-06-15.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Specifies information about the availability set that the virtual
     * machine should be assigned to. Virtual machines specified in the same
     * availability set are allocated to different nodes to maximize
     * availability. For more information about availability sets, see
     * [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview).
     * <br><br> For more information on Azure planned maintenance, see
     * [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates)
     * <br><br> Currently, a VM can only be added to availability set at
     * creation time. The availability set to which the VM is being added
     * should be under the same resource group as the availability set
     * resource. An existing VM cannot be added to an availability set.
     * <br><br>This property cannot exist along with a non-null
     * properties.virtualMachineScaleSet reference.
     */
    @JsonProperty(value = "properties.availabilitySet")
    private SubResource availabilitySet;

    /*
     * Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the
     * same virtual machine scale set are allocated to different nodes to
     * maximize availability. Currently, a VM can only be added to virtual
     * machine scale set at creation time. An existing VM cannot be added to a
     * virtual machine scale set. <br><br>This property cannot exist along with
     * a non-null properties.availabilitySet reference. <br><br>Minimum
     * api‐version: 2019‐03‐01
     */
    @JsonProperty(value = "properties.virtualMachineScaleSet")
    private SubResource virtualMachineScaleSet;

    /*
     * Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. <br><br>Minimum api-version:
     * 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /*
     * Specifies the priority for the virtual machine. <br><br>Minimum
     * api-version: 2019-03-01
     */
    @JsonProperty(value = "properties.priority")
    private VirtualMachinePriorityTypes priority;

    /*
     * Specifies the eviction policy for the Azure Spot virtual machine and
     * Azure Spot scale set. <br><br>For Azure Spot virtual machines, both
     * 'Deallocate' and 'Delete' are supported and the minimum api-version is
     * 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is
     * 2017-10-30-preview.
     */
    @JsonProperty(value = "properties.evictionPolicy")
    private VirtualMachineEvictionPolicyTypes evictionPolicy;

    /*
     * Specifies the billing related details of a Azure Spot virtual machine.
     * <br><br>Minimum api-version: 2019-03-01.
     */
    @JsonProperty(value = "properties.billingProfile")
    private BillingProfile billingProfile;

    /*
     * Specifies information about the dedicated host that the virtual machine
     * resides in. <br><br>Minimum api-version: 2018-10-01.
     */
    @JsonProperty(value = "properties.host")
    private SubResource host;

    /*
     * Specifies information about the dedicated host group that the virtual
     * machine resides in. <br><br>Minimum api-version: 2020-06-01.
     * <br><br>NOTE: User cannot specify both host and hostGroup properties.
     */
    @JsonProperty(value = "properties.hostGroup")
    private SubResource hostGroup;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The virtual machine instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineInstanceViewInner instanceView;

    /*
     * Specifies that the image or disk that is being used was licensed
     * on-premises. <br><br> Possible values for Windows Server operating
     * system are: <br><br> Windows_Client <br><br> Windows_Server <br><br>
     * Possible values for Linux Server operating system are: <br><br>
     * RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * <br><br> [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux)
     * <br><br> Minimum api-version: 2015-06-15
     */
    @JsonProperty(value = "properties.licenseType")
    private String licenseType;

    /*
     * Specifies the VM unique ID which is a 128-bits identifier that is
     * encoded and stored in all Azure IaaS VMs SMBIOS and can be read using
     * platform BIOS commands.
     */
    @JsonProperty(value = "properties.vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /*
     * Specifies the time alloted for all extensions to start. The time
     * duration should be between 15 minutes and 120 minutes (inclusive) and
     * should be specified in ISO 8601 format. The default value is 90 minutes
     * (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     */
    @JsonProperty(value = "properties.extensionsTimeBudget")
    private String extensionsTimeBudget;

    /*
     * Specifies the scale set logical fault domain into which the Virtual
     * Machine will be created. By default, the Virtual Machine will by
     * automatically assigned to a fault domain that best maintains balance
     * across available fault domains.<br><li>This is applicable only if the
     * 'virtualMachineScaleSet' property of this Virtual Machine is set.<li>The
     * Virtual Machine Scale Set that is referenced, must have
     * 'platformFaultDomainCount' &gt; 1.<li>This property cannot be updated
     * once the Virtual Machine is created.<li>Fault domain assignment can be
     * viewed in the Virtual Machine Instance View.<br><br>Minimum api‐version:
     * 2020‐12‐01
     */
    @JsonProperty(value = "properties.platformFaultDomain")
    private Integer platformFaultDomain;

    /*
     * Specifies Scheduled Event related configurations.
     */
    @JsonProperty(value = "properties.scheduledEventsProfile")
    private ScheduledEventsProfile scheduledEventsProfile;

    /*
     * UserData for the VM, which must be base-64 encoded. Customer should not
     * pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     */
    @JsonProperty(value = "properties.userData")
    private String userData;

    /**
     * Get the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the identity property: The identity of the virtual machine, if configured.
     *
     * @return the identity value.
     */
    public VirtualMachineIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the virtual machine, if configured.
     *
     * @param identity the identity value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withIdentity(VirtualMachineIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the zones property: The virtual machine zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The virtual machine zones.
     *
     * @param zones the zones value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings used while creating the virtual machine. Some
     * of the settings cannot be changed once VM is provisioned.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings used while creating the virtual machine. Some
     * of the settings cannot be changed once VM is provisioned.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For
     * more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently,
     * a VM can only be added to availability set at creation time. The availability set to which the VM is being added
     * should be under the same resource group as the availability set resource. An existing VM cannot be added to an
     * availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
     * properties.virtualMachineScaleSet reference.
     *
     * @return the availabilitySet value.
     */
    public SubResource availabilitySet() {
        return this.availabilitySet;
    }

    /**
     * Set the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For
     * more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently,
     * a VM can only be added to availability set at creation time. The availability set to which the VM is being added
     * should be under the same resource group as the availability set resource. An existing VM cannot be added to an
     * availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
     * properties.virtualMachineScaleSet reference.
     *
     * @param availabilitySet the availabilitySet value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withAvailabilitySet(SubResource availabilitySet) {
        this.availabilitySet = availabilitySet;
        return this;
    }

    /**
     * Get the virtualMachineScaleSet property: Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are
     * allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale
     * set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This
     * property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum
     * api‐version: 2019‐03‐01.
     *
     * @return the virtualMachineScaleSet value.
     */
    public SubResource virtualMachineScaleSet() {
        return this.virtualMachineScaleSet;
    }

    /**
     * Set the virtualMachineScaleSet property: Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are
     * allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale
     * set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This
     * property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum
     * api‐version: 2019‐03‐01.
     *
     * @param virtualMachineScaleSet the virtualMachineScaleSet value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withVirtualMachineScaleSet(SubResource virtualMachineScaleSet) {
        this.virtualMachineScaleSet = virtualMachineScaleSet;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the priority property: Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01.
     *
     * @return the priority value.
     */
    public VirtualMachinePriorityTypes priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01.
     *
     * @param priority the priority value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withPriority(VirtualMachinePriorityTypes priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @return the evictionPolicy value.
     */
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @param evictionPolicy the evictionPolicy value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        return this;
    }

    /**
     * Get the billingProfile property: Specifies the billing related details of a Azure Spot virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the billingProfile value.
     */
    public BillingProfile billingProfile() {
        return this.billingProfile;
    }

    /**
     * Set the billingProfile property: Specifies the billing related details of a Azure Spot virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @param billingProfile the billingProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
        return this;
    }

    /**
     * Get the host property: Specifies information about the dedicated host that the virtual machine resides in.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @return the host value.
     */
    public SubResource host() {
        return this.host;
    }

    /**
     * Set the host property: Specifies information about the dedicated host that the virtual machine resides in.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @param host the host value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withHost(SubResource host) {
        this.host = host;
        return this;
    }

    /**
     * Get the hostGroup property: Specifies information about the dedicated host group that the virtual machine resides
     * in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify both host
     * and hostGroup properties.
     *
     * @return the hostGroup value.
     */
    public SubResource hostGroup() {
        return this.hostGroup;
    }

    /**
     * Set the hostGroup property: Specifies information about the dedicated host group that the virtual machine resides
     * in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify both host
     * and hostGroup properties.
     *
     * @param hostGroup the hostGroup value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withHostGroup(SubResource hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The virtual machine instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineInstanceViewInner instanceView() {
        return this.instanceView;
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the vmId property: Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in
     * all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @return the extensionsTimeBudget value.
     */
    public String extensionsTimeBudget() {
        return this.extensionsTimeBudget;
    }

    /**
     * Set the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @param extensionsTimeBudget the extensionsTimeBudget value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withExtensionsTimeBudget(String extensionsTimeBudget) {
        this.extensionsTimeBudget = extensionsTimeBudget;
        return this;
    }

    /**
     * Get the platformFaultDomain property: Specifies the scale set logical fault domain into which the Virtual Machine
     * will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best
     * maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the
     * 'virtualMachineScaleSet' property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is
     * referenced, must have 'platformFaultDomainCount' &amp;gt; 1.&lt;li&gt;This property cannot be updated once the
     * Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance
     * View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain property: Specifies the scale set logical fault domain into which the Virtual Machine
     * will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best
     * maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the
     * 'virtualMachineScaleSet' property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is
     * referenced, must have 'platformFaultDomainCount' &amp;gt; 1.&lt;li&gt;This property cannot be updated once the
     * Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance
     * View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @return the scheduledEventsProfile value.
     */
    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.scheduledEventsProfile;
    }

    /**
     * Set the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @param scheduledEventsProfile the scheduledEventsProfile value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withScheduledEventsProfile(ScheduledEventsProfile scheduledEventsProfile) {
        this.scheduledEventsProfile = scheduledEventsProfile;
        return this;
    }

    /**
     * Get the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     *
     * @return the userData value.
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     *
     * @param userData the userData value to set.
     * @return the VirtualMachineUpdateInner object itself.
     */
    public VirtualMachineUpdateInner withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineUpdateInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (plan() != null) {
            plan().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (additionalCapabilities() != null) {
            additionalCapabilities().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (billingProfile() != null) {
            billingProfile().validate();
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
        if (scheduledEventsProfile() != null) {
            scheduledEventsProfile().validate();
        }
    }
}
