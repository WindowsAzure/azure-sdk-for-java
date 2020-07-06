/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.ResourceNavigationLinkInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.ServiceAssociationLinkInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.SubnetInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkSecurityGroupInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.RouteTableInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.ServiceEndpointPolicyInner;

/**
 * Type representing Subnet.
 */
public interface Subnet extends HasInner<SubnetInner>, Indexable, Refreshable<Subnet>, Updatable<Subnet.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the addressPrefixes value.
     */
    List<String> addressPrefixes();

    /**
     * @return the delegations value.
     */
    List<Delegation> delegations();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipAllocations value.
     */
    List<SubResource> ipAllocations();

    /**
     * @return the ipConfigurationProfiles value.
     */
    List<IPConfigurationProfile> ipConfigurationProfiles();

    /**
     * @return the ipConfigurations value.
     */
    List<IPConfiguration> ipConfigurations();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the natGateway value.
     */
    SubResource natGateway();

    /**
     * @return the networkSecurityGroup value.
     */
    NetworkSecurityGroup networkSecurityGroup();

    /**
     * @return the privateEndpointNetworkPolicies value.
     */
    String privateEndpointNetworkPolicies();

    /**
     * @return the privateEndpoints value.
     */
    List<PrivateEndpoint> privateEndpoints();

    /**
     * @return the privateLinkServiceNetworkPolicies value.
     */
    String privateLinkServiceNetworkPolicies();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the purpose value.
     */
    String purpose();

    /**
     * @return the resourceNavigationLinks value.
     */
    List<ResourceNavigationLinkInner> resourceNavigationLinks();

    /**
     * @return the routeTable value.
     */
    RouteTable routeTable();

    /**
     * @return the serviceAssociationLinks value.
     */
    List<ServiceAssociationLinkInner> serviceAssociationLinks();

    /**
     * @return the serviceEndpointPolicies value.
     */
    List<ServiceEndpointPolicy> serviceEndpointPolicies();

    /**
     * @return the serviceEndpoints value.
     */
    List<ServiceEndpointPropertiesFormat> serviceEndpoints();

    /**
     * The entirety of the Subnet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualNetwork, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Subnet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Subnet definition.
         */
        interface Blank extends WithVirtualNetwork {
        }

        /**
         * The stage of the subnet definition allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
           /**
            * Specifies resourceGroupName, virtualNetworkName.
            * @param resourceGroupName The name of the resource group
            * @param virtualNetworkName The name of the virtual network
            * @return the next definition stage
            */
            WithCreate withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName);
        }

        /**
         * The stage of the subnet definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix The address prefix for the subnet
             * @return the next definition stage
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the subnet definition allowing to specify AddressPrefixes.
         */
        interface WithAddressPrefixes {
            /**
             * Specifies addressPrefixes.
             * @param addressPrefixes List of address prefixes for the subnet
             * @return the next definition stage
             */
            WithCreate withAddressPrefixes(List<String> addressPrefixes);
        }

        /**
         * The stage of the subnet definition allowing to specify Delegations.
         */
        interface WithDelegations {
            /**
             * Specifies delegations.
             * @param delegations An array of references to the delegations on the subnet
             * @return the next definition stage
             */
            WithCreate withDelegations(List<Delegation> delegations);
        }

        /**
         * The stage of the subnet definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the subnet definition allowing to specify IpAllocations.
         */
        interface WithIpAllocations {
            /**
             * Specifies ipAllocations.
             * @param ipAllocations Array of IpAllocation which reference this subnet
             * @return the next definition stage
             */
            WithCreate withIpAllocations(List<SubResource> ipAllocations);
        }

        /**
         * The stage of the subnet definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the subnet definition allowing to specify NatGateway.
         */
        interface WithNatGateway {
            /**
             * Specifies natGateway.
             * @param natGateway Nat gateway associated with this subnet
             * @return the next definition stage
             */
            WithCreate withNatGateway(SubResource natGateway);
        }

        /**
         * The stage of the subnet definition allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies networkSecurityGroup.
             * @param networkSecurityGroup The reference to the NetworkSecurityGroup resource
             * @return the next definition stage
             */
            WithCreate withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }

        /**
         * The stage of the subnet definition allowing to specify PrivateEndpointNetworkPolicies.
         */
        interface WithPrivateEndpointNetworkPolicies {
            /**
             * Specifies privateEndpointNetworkPolicies.
             * @param privateEndpointNetworkPolicies Enable or Disable apply network policies on private end point in the subnet
             * @return the next definition stage
             */
            WithCreate withPrivateEndpointNetworkPolicies(String privateEndpointNetworkPolicies);
        }

        /**
         * The stage of the subnet definition allowing to specify PrivateLinkServiceNetworkPolicies.
         */
        interface WithPrivateLinkServiceNetworkPolicies {
            /**
             * Specifies privateLinkServiceNetworkPolicies.
             * @param privateLinkServiceNetworkPolicies Enable or Disable apply network policies on private link service in the subnet
             * @return the next definition stage
             */
            WithCreate withPrivateLinkServiceNetworkPolicies(String privateLinkServiceNetworkPolicies);
        }

        /**
         * The stage of the subnet definition allowing to specify RouteTable.
         */
        interface WithRouteTable {
            /**
             * Specifies routeTable.
             * @param routeTable The reference to the RouteTable resource
             * @return the next definition stage
             */
            WithCreate withRouteTable(RouteTableInner routeTable);
        }

        /**
         * The stage of the subnet definition allowing to specify ServiceEndpointPolicies.
         */
        interface WithServiceEndpointPolicies {
            /**
             * Specifies serviceEndpointPolicies.
             * @param serviceEndpointPolicies An array of service endpoint policies
             * @return the next definition stage
             */
            WithCreate withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies);
        }

        /**
         * The stage of the subnet definition allowing to specify ServiceEndpoints.
         */
        interface WithServiceEndpoints {
            /**
             * Specifies serviceEndpoints.
             * @param serviceEndpoints An array of service endpoints
             * @return the next definition stage
             */
            WithCreate withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Subnet>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithAddressPrefixes, DefinitionStages.WithDelegations, DefinitionStages.WithId, DefinitionStages.WithIpAllocations, DefinitionStages.WithName, DefinitionStages.WithNatGateway, DefinitionStages.WithNetworkSecurityGroup, DefinitionStages.WithPrivateEndpointNetworkPolicies, DefinitionStages.WithPrivateLinkServiceNetworkPolicies, DefinitionStages.WithRouteTable, DefinitionStages.WithServiceEndpointPolicies, DefinitionStages.WithServiceEndpoints {
        }
    }
    /**
     * The template for a Subnet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Subnet>, UpdateStages.WithAddressPrefix, UpdateStages.WithAddressPrefixes, UpdateStages.WithDelegations, UpdateStages.WithId, UpdateStages.WithIpAllocations, UpdateStages.WithName, UpdateStages.WithNatGateway, UpdateStages.WithNetworkSecurityGroup, UpdateStages.WithPrivateEndpointNetworkPolicies, UpdateStages.WithPrivateLinkServiceNetworkPolicies, UpdateStages.WithRouteTable, UpdateStages.WithServiceEndpointPolicies, UpdateStages.WithServiceEndpoints {
    }

    /**
     * Grouping of Subnet update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the subnet update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix The address prefix for the subnet
             * @return the next update stage
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the subnet update allowing to specify AddressPrefixes.
         */
        interface WithAddressPrefixes {
            /**
             * Specifies addressPrefixes.
             * @param addressPrefixes List of address prefixes for the subnet
             * @return the next update stage
             */
            Update withAddressPrefixes(List<String> addressPrefixes);
        }

        /**
         * The stage of the subnet update allowing to specify Delegations.
         */
        interface WithDelegations {
            /**
             * Specifies delegations.
             * @param delegations An array of references to the delegations on the subnet
             * @return the next update stage
             */
            Update withDelegations(List<Delegation> delegations);
        }

        /**
         * The stage of the subnet update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the subnet update allowing to specify IpAllocations.
         */
        interface WithIpAllocations {
            /**
             * Specifies ipAllocations.
             * @param ipAllocations Array of IpAllocation which reference this subnet
             * @return the next update stage
             */
            Update withIpAllocations(List<SubResource> ipAllocations);
        }

        /**
         * The stage of the subnet update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the subnet update allowing to specify NatGateway.
         */
        interface WithNatGateway {
            /**
             * Specifies natGateway.
             * @param natGateway Nat gateway associated with this subnet
             * @return the next update stage
             */
            Update withNatGateway(SubResource natGateway);
        }

        /**
         * The stage of the subnet update allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies networkSecurityGroup.
             * @param networkSecurityGroup The reference to the NetworkSecurityGroup resource
             * @return the next update stage
             */
            Update withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }

        /**
         * The stage of the subnet update allowing to specify PrivateEndpointNetworkPolicies.
         */
        interface WithPrivateEndpointNetworkPolicies {
            /**
             * Specifies privateEndpointNetworkPolicies.
             * @param privateEndpointNetworkPolicies Enable or Disable apply network policies on private end point in the subnet
             * @return the next update stage
             */
            Update withPrivateEndpointNetworkPolicies(String privateEndpointNetworkPolicies);
        }

        /**
         * The stage of the subnet update allowing to specify PrivateLinkServiceNetworkPolicies.
         */
        interface WithPrivateLinkServiceNetworkPolicies {
            /**
             * Specifies privateLinkServiceNetworkPolicies.
             * @param privateLinkServiceNetworkPolicies Enable or Disable apply network policies on private link service in the subnet
             * @return the next update stage
             */
            Update withPrivateLinkServiceNetworkPolicies(String privateLinkServiceNetworkPolicies);
        }

        /**
         * The stage of the subnet update allowing to specify RouteTable.
         */
        interface WithRouteTable {
            /**
             * Specifies routeTable.
             * @param routeTable The reference to the RouteTable resource
             * @return the next update stage
             */
            Update withRouteTable(RouteTableInner routeTable);
        }

        /**
         * The stage of the subnet update allowing to specify ServiceEndpointPolicies.
         */
        interface WithServiceEndpointPolicies {
            /**
             * Specifies serviceEndpointPolicies.
             * @param serviceEndpointPolicies An array of service endpoint policies
             * @return the next update stage
             */
            Update withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies);
        }

        /**
         * The stage of the subnet update allowing to specify ServiceEndpoints.
         */
        interface WithServiceEndpoints {
            /**
             * Specifies serviceEndpoints.
             * @param serviceEndpoints An array of service endpoints
             * @return the next update stage
             */
            Update withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints);
        }

    }
}
