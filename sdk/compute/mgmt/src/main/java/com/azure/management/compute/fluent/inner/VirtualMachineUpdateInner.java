// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.compute.models.AdditionalCapabilities;
import com.azure.management.compute.models.BillingProfile;
import com.azure.management.compute.models.DiagnosticsProfile;
import com.azure.management.compute.models.HardwareProfile;
import com.azure.management.compute.models.NetworkProfile;
import com.azure.management.compute.models.OSProfile;
import com.azure.management.compute.models.Plan;
import com.azure.management.compute.models.StorageProfile;
import com.azure.management.compute.models.UpdateResource;
import com.azure.management.compute.models.VirtualMachineEvictionPolicyTypes;
import com.azure.management.compute.models.VirtualMachineIdentity;
import com.azure.management.compute.models.VirtualMachinePriorityTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineUpdate model. */
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
     * Specifies the operating system settings for the virtual machine.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /*
     * Specifies the network interfaces of the virtual machine.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

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
     * availability. For more information about availability sets, see [Manage
     * the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * <br><br> For more information on Azure planned maintenance, see [Planned
     * maintenance for virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * <br><br> Currently, a VM can only be added to availability set at
     * creation time. An existing VM cannot be added to an availability set.
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
     * Specifies the eviction policy for the Azure Spot virtual machine. Only
     * supported value is 'Deallocate'. <br><br>Minimum api-version: 2019-03-01
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
     * on-premises. This element is only used for images that contain the
     * Windows Server operating system. <br><br> Possible values are: <br><br>
     * Windows_Client <br><br> Windows_Server <br><br> If this element is
     * included in a request for an update, the value must match the initial
     * value. This value cannot be updated. <br><br> For more information, see
     * [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
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
     * Get the osProfile property: Specifies the operating system settings for the virtual machine.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the virtual machine.
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
     * to maximize availability. For more information about availability sets, see [Manage the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     * cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
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
     * to maximize availability. For more information about availability sets, see [Manage the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     * cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
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
     * Get the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine. Only supported
     * value is 'Deallocate'. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the evictionPolicy value.
     */
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine. Only supported
     * value is 'Deallocate'. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
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
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises. This
     * element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible
     * values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this
     * element is included in a request for an update, the value must match the initial value. This value cannot be
     * updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises. This
     * element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible
     * values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this
     * element is included in a request for an update, the value must match the initial value. This value cannot be
     * updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
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
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (billingProfile() != null) {
            billingProfile().validate();
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
