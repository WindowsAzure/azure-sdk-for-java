// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.PrivateCloudInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** An immutable client-side representation of PrivateCloud. */
public interface PrivateCloud {
    /**
     * Gets the id property: Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds"
         + "/cloud123".
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the location property: Location where private cloud created, e.g "westus".
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the name property: Private cloud name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Azure Resource type.
     *
     * @return the type value.
     */
    PrivateCloudResourceType type();

    /**
     * Gets the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @return the availabilityZoneId value.
     */
    String availabilityZoneId();

    /**
     * Gets the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @return the availabilityZoneName value.
     */
    String availabilityZoneName();

    /**
     * Gets the clustersNumber property: Number of clusters.
     *
     * @return the clustersNumber value.
     */
    Integer clustersNumber();

    /**
     * Gets the createdBy property: User's emails who created cloud.
     *
     * @return the createdBy value.
     */
    String createdBy();

    /**
     * Gets the createdOn property: When private cloud was created.
     *
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the dnsServers property: Array of DNS servers.
     *
     * @return the dnsServers value.
     */
    List<String> dnsServers();

    /**
     * Gets the expires property: Expiration date of PC.
     *
     * @return the expires value.
     */
    String expires();

    /**
     * Gets the nsxType property: Nsx Type, e.g. "Advanced".
     *
     * @return the nsxType value.
     */
    String nsxType();

    /**
     * Gets the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @return the placementGroupId value.
     */
    String placementGroupId();

    /**
     * Gets the placementGroupName property: Placement Group name.
     *
     * @return the placementGroupName value.
     */
    String placementGroupName();

    /**
     * Gets the privateCloudId property: Id of a private cloud.
     *
     * @return the privateCloudId value.
     */
    UUID privateCloudId();

    /**
     * Gets the resourcePools property: The list of Resource Pools.
     *
     * @return the resourcePools value.
     */
    List<ResourcePool> resourcePools();

    /**
     * Gets the state property: Private Cloud state, e.g. "operational".
     *
     * @return the state value.
     */
    String state();

    /**
     * Gets the totalCpuCores property: Number of cores.
     *
     * @return the totalCpuCores value.
     */
    Integer totalCpuCores();

    /**
     * Gets the totalNodes property: Number of nodes.
     *
     * @return the totalNodes value.
     */
    Integer totalNodes();

    /**
     * Gets the totalRam property: Memory size.
     *
     * @return the totalRam value.
     */
    Integer totalRam();

    /**
     * Gets the totalStorage property: Disk space in TB.
     *
     * @return the totalStorage value.
     */
    Float totalStorage();

    /**
     * Gets the typePropertiesType property: Virtualization type e.g. "vSphere".
     *
     * @return the typePropertiesType value.
     */
    String typePropertiesType();

    /**
     * Gets the vSphereVersion property: e.g. "6.5u2".
     *
     * @return the vSphereVersion value.
     */
    String vSphereVersion();

    /**
     * Gets the vcenterFqdn property: FQDN for vcenter access.
     *
     * @return the vcenterFqdn value.
     */
    String vcenterFqdn();

    /**
     * Gets the vcenterRefid property: Vcenter ip address.
     *
     * @return the vcenterRefid value.
     */
    String vcenterRefid();

    /**
     * Gets the virtualMachineTemplates property: The list of Virtual Machine Templates.
     *
     * @return the virtualMachineTemplates value.
     */
    List<VirtualMachineTemplate> virtualMachineTemplates();

    /**
     * Gets the virtualNetworks property: The list of Virtual Networks.
     *
     * @return the virtualNetworks value.
     */
    List<VirtualNetwork> virtualNetworks();

    /**
     * Gets the vrOpsEnabled property: Is Vrops enabled/disabled.
     *
     * @return the vrOpsEnabled value.
     */
    Boolean vrOpsEnabled();

    /**
     * Gets the inner com.azure.resourcemanager.vmwarecloudsimple.fluent.models.PrivateCloudInner object.
     *
     * @return the inner object.
     */
    PrivateCloudInner innerModel();
}
