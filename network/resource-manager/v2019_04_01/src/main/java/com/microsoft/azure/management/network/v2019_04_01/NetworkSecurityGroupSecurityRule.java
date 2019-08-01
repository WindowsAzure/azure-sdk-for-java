/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_04_01.implementation.SecurityRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2019_04_01.implementation.ApplicationSecurityGroupInner;

/**
 * Type representing NetworkSecurityGroupSecurityRule.
 */
public interface NetworkSecurityGroupSecurityRule extends HasInner<SecurityRuleInner>, Indexable, Refreshable<NetworkSecurityGroupSecurityRule>, Updatable<NetworkSecurityGroupSecurityRule.Update>, HasManager<NetworkManager> {
    /**
     * @return the access value.
     */
    SecurityRuleAccess access();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the destinationAddressPrefix value.
     */
    String destinationAddressPrefix();

    /**
     * @return the destinationAddressPrefixes value.
     */
    List<String> destinationAddressPrefixes();

    /**
     * @return the destinationApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> destinationApplicationSecurityGroups();

    /**
     * @return the destinationPortRange value.
     */
    String destinationPortRange();

    /**
     * @return the destinationPortRanges value.
     */
    List<String> destinationPortRanges();

    /**
     * @return the direction value.
     */
    SecurityRuleDirection direction();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the protocol value.
     */
    SecurityRuleProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sourceAddressPrefix value.
     */
    String sourceAddressPrefix();

    /**
     * @return the sourceAddressPrefixes value.
     */
    List<String> sourceAddressPrefixes();

    /**
     * @return the sourceApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> sourceApplicationSecurityGroups();

    /**
     * @return the sourcePortRange value.
     */
    String sourcePortRange();

    /**
     * @return the sourcePortRanges value.
     */
    List<String> sourcePortRanges();

    /**
     * The entirety of the NetworkSecurityGroupSecurityRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkSecurityGroup, DefinitionStages.WithAccess, DefinitionStages.WithDirection, DefinitionStages.WithProtocol, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkSecurityGroupSecurityRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkSecurityGroupSecurityRule definition.
         */
        interface Blank extends WithNetworkSecurityGroup {
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
           /**
            * Specifies resourceGroupName, networkSecurityGroupName.
            * @param resourceGroupName The name of the resource group
            * @param networkSecurityGroupName The name of the network security group
            * @return the next definition stage
            */
            WithAccess withExistingNetworkSecurityGroup(String resourceGroupName, String networkSecurityGroupName);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Access.
         */
        interface WithAccess {
           /**
            * Specifies access.
            * @param access The network traffic is allowed or denied. Possible values include: 'Allow', 'Deny'
            * @return the next definition stage
            */
            WithDirection withAccess(SecurityRuleAccess access);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Direction.
         */
        interface WithDirection {
           /**
            * Specifies direction.
            * @param direction The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic. Possible values include: 'Inbound', 'Outbound'
            * @return the next definition stage
            */
            WithProtocol withDirection(SecurityRuleDirection direction);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Protocol.
         */
        interface WithProtocol {
           /**
            * Specifies protocol.
            * @param protocol Network protocol this rule applies to. Possible values include: 'Tcp', 'Udp', 'Icmp', 'Esp', '*'
            * @return the next definition stage
            */
            WithCreate withProtocol(SecurityRuleProtocol protocol);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description A description for this rule. Restricted to 140 chars
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationAddressPrefix.
         */
        interface WithDestinationAddressPrefix {
            /**
             * Specifies destinationAddressPrefix.
             * @param destinationAddressPrefix The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used
             * @return the next definition stage
             */
            WithCreate withDestinationAddressPrefix(String destinationAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationAddressPrefixes.
         */
        interface WithDestinationAddressPrefixes {
            /**
             * Specifies destinationAddressPrefixes.
             * @param destinationAddressPrefixes The destination address prefixes. CIDR or destination IP ranges
             * @return the next definition stage
             */
            WithCreate withDestinationAddressPrefixes(List<String> destinationAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationApplicationSecurityGroups.
         */
        interface WithDestinationApplicationSecurityGroups {
            /**
             * Specifies destinationApplicationSecurityGroups.
             * @param destinationApplicationSecurityGroups The application security group specified as destination
             * @return the next definition stage
             */
            WithCreate withDestinationApplicationSecurityGroups(List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationPortRange.
         */
        interface WithDestinationPortRange {
            /**
             * Specifies destinationPortRange.
             * @param destinationPortRange The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports
             * @return the next definition stage
             */
            WithCreate withDestinationPortRange(String destinationPortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify DestinationPortRanges.
         */
        interface WithDestinationPortRanges {
            /**
             * Specifies destinationPortRanges.
             * @param destinationPortRanges The destination port ranges
             * @return the next definition stage
             */
            WithCreate withDestinationPortRanges(List<String> destinationPortRanges);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Id.
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
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Name.
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
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule
             * @return the next definition stage
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourceAddressPrefix.
         */
        interface WithSourceAddressPrefix {
            /**
             * Specifies sourceAddressPrefix.
             * @param sourceAddressPrefix The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from
             * @return the next definition stage
             */
            WithCreate withSourceAddressPrefix(String sourceAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourceAddressPrefixes.
         */
        interface WithSourceAddressPrefixes {
            /**
             * Specifies sourceAddressPrefixes.
             * @param sourceAddressPrefixes The CIDR or source IP ranges
             * @return the next definition stage
             */
            WithCreate withSourceAddressPrefixes(List<String> sourceAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourceApplicationSecurityGroups.
         */
        interface WithSourceApplicationSecurityGroups {
            /**
             * Specifies sourceApplicationSecurityGroups.
             * @param sourceApplicationSecurityGroups The application security group specified as source
             * @return the next definition stage
             */
            WithCreate withSourceApplicationSecurityGroups(List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourcePortRange.
         */
        interface WithSourcePortRange {
            /**
             * Specifies sourcePortRange.
             * @param sourcePortRange The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports
             * @return the next definition stage
             */
            WithCreate withSourcePortRange(String sourcePortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule definition allowing to specify SourcePortRanges.
         */
        interface WithSourcePortRanges {
            /**
             * Specifies sourcePortRanges.
             * @param sourcePortRanges The source port ranges
             * @return the next definition stage
             */
            WithCreate withSourcePortRanges(List<String> sourcePortRanges);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkSecurityGroupSecurityRule>, DefinitionStages.WithDescription, DefinitionStages.WithDestinationAddressPrefix, DefinitionStages.WithDestinationAddressPrefixes, DefinitionStages.WithDestinationApplicationSecurityGroups, DefinitionStages.WithDestinationPortRange, DefinitionStages.WithDestinationPortRanges, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPriority, DefinitionStages.WithProvisioningState, DefinitionStages.WithSourceAddressPrefix, DefinitionStages.WithSourceAddressPrefixes, DefinitionStages.WithSourceApplicationSecurityGroups, DefinitionStages.WithSourcePortRange, DefinitionStages.WithSourcePortRanges {
        }
    }
    /**
     * The template for a NetworkSecurityGroupSecurityRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkSecurityGroupSecurityRule>, UpdateStages.WithDescription, UpdateStages.WithDestinationAddressPrefix, UpdateStages.WithDestinationAddressPrefixes, UpdateStages.WithDestinationApplicationSecurityGroups, UpdateStages.WithDestinationPortRange, UpdateStages.WithDestinationPortRanges, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPriority, UpdateStages.WithProvisioningState, UpdateStages.WithSourceAddressPrefix, UpdateStages.WithSourceAddressPrefixes, UpdateStages.WithSourceApplicationSecurityGroups, UpdateStages.WithSourcePortRange, UpdateStages.WithSourcePortRanges {
    }

    /**
     * Grouping of NetworkSecurityGroupSecurityRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description A description for this rule. Restricted to 140 chars
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationAddressPrefix.
         */
        interface WithDestinationAddressPrefix {
            /**
             * Specifies destinationAddressPrefix.
             * @param destinationAddressPrefix The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used
             * @return the next update stage
             */
            Update withDestinationAddressPrefix(String destinationAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationAddressPrefixes.
         */
        interface WithDestinationAddressPrefixes {
            /**
             * Specifies destinationAddressPrefixes.
             * @param destinationAddressPrefixes The destination address prefixes. CIDR or destination IP ranges
             * @return the next update stage
             */
            Update withDestinationAddressPrefixes(List<String> destinationAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationApplicationSecurityGroups.
         */
        interface WithDestinationApplicationSecurityGroups {
            /**
             * Specifies destinationApplicationSecurityGroups.
             * @param destinationApplicationSecurityGroups The application security group specified as destination
             * @return the next update stage
             */
            Update withDestinationApplicationSecurityGroups(List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationPortRange.
         */
        interface WithDestinationPortRange {
            /**
             * Specifies destinationPortRange.
             * @param destinationPortRange The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports
             * @return the next update stage
             */
            Update withDestinationPortRange(String destinationPortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify DestinationPortRanges.
         */
        interface WithDestinationPortRanges {
            /**
             * Specifies destinationPortRanges.
             * @param destinationPortRanges The destination port ranges
             * @return the next update stage
             */
            Update withDestinationPortRanges(List<String> destinationPortRanges);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Id.
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
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Name.
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
         * The stage of the networksecuritygroupsecurityrule update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule
             * @return the next update stage
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourceAddressPrefix.
         */
        interface WithSourceAddressPrefix {
            /**
             * Specifies sourceAddressPrefix.
             * @param sourceAddressPrefix The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from
             * @return the next update stage
             */
            Update withSourceAddressPrefix(String sourceAddressPrefix);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourceAddressPrefixes.
         */
        interface WithSourceAddressPrefixes {
            /**
             * Specifies sourceAddressPrefixes.
             * @param sourceAddressPrefixes The CIDR or source IP ranges
             * @return the next update stage
             */
            Update withSourceAddressPrefixes(List<String> sourceAddressPrefixes);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourceApplicationSecurityGroups.
         */
        interface WithSourceApplicationSecurityGroups {
            /**
             * Specifies sourceApplicationSecurityGroups.
             * @param sourceApplicationSecurityGroups The application security group specified as source
             * @return the next update stage
             */
            Update withSourceApplicationSecurityGroups(List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourcePortRange.
         */
        interface WithSourcePortRange {
            /**
             * Specifies sourcePortRange.
             * @param sourcePortRange The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports
             * @return the next update stage
             */
            Update withSourcePortRange(String sourcePortRange);
        }

        /**
         * The stage of the networksecuritygroupsecurityrule update allowing to specify SourcePortRanges.
         */
        interface WithSourcePortRanges {
            /**
             * Specifies sourcePortRanges.
             * @param sourcePortRanges The source port ranges
             * @return the next update stage
             */
            Update withSourcePortRanges(List<String> sourcePortRanges);
        }

    }
}
