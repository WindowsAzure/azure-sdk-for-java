/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.implementation.BackendAddressPoolInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.FrontendIPConfigurationInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.InboundNatRuleInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.LoadBalancingRuleInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.OutboundRuleInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.ProbeInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.LoadBalancerInner;

/**
 * Type representing LoadBalancer.
 */
public interface LoadBalancer extends HasInner<LoadBalancerInner>, Resource, GroupableResourceCore<NetworkManager, LoadBalancerInner>, HasResourceGroup, Refreshable<LoadBalancer>, Updatable<LoadBalancer.Update>, HasManager<NetworkManager> {
    /**
     * @return the backendAddressPools value.
     */
    List<BackendAddressPool> backendAddressPools();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the frontendIPConfigurations value.
     */
    List<FrontendIPConfiguration> frontendIPConfigurations();

    /**
     * @return the inboundNatPools value.
     */
    List<InboundNatPool> inboundNatPools();

    /**
     * @return the inboundNatRules value.
     */
    List<InboundNatRule> inboundNatRules();

    /**
     * @return the loadBalancingRules value.
     */
    List<LoadBalancingRule> loadBalancingRules();

    /**
     * @return the outboundRules value.
     */
    List<OutboundRule> outboundRules();

    /**
     * @return the probes value.
     */
    List<Probe> probes();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the sku value.
     */
    LoadBalancerSku sku();

    /**
     * The entirety of the LoadBalancer definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LoadBalancer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LoadBalancer definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the LoadBalancer definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the loadbalancer definition allowing to specify BackendAddressPools.
         */
        interface WithBackendAddressPools {
            /**
             * Specifies backendAddressPools.
             * @param backendAddressPools Collection of backend address pools used by a load balancer
             * @return the next definition stage
             */
            WithCreate withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify FrontendIPConfigurations.
         */
        interface WithFrontendIPConfigurations {
            /**
             * Specifies frontendIPConfigurations.
             * @param frontendIPConfigurations Object representing the frontend IPs to be used for the load balancer
             * @return the next definition stage
             */
            WithCreate withFrontendIPConfigurations(List<FrontendIPConfigurationInner> frontendIPConfigurations);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify InboundNatPools.
         */
        interface WithInboundNatPools {
            /**
             * Specifies inboundNatPools.
             * @param inboundNatPools Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules
             * @return the next definition stage
             */
            WithCreate withInboundNatPools(List<InboundNatPool> inboundNatPools);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify InboundNatRules.
         */
        interface WithInboundNatRules {
            /**
             * Specifies inboundNatRules.
             * @param inboundNatRules Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules
             * @return the next definition stage
             */
            WithCreate withInboundNatRules(List<InboundNatRuleInner> inboundNatRules);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify LoadBalancingRules.
         */
        interface WithLoadBalancingRules {
            /**
             * Specifies loadBalancingRules.
             * @param loadBalancingRules Object collection representing the load balancing rules Gets the provisioning
             * @return the next definition stage
             */
            WithCreate withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify OutboundRules.
         */
        interface WithOutboundRules {
            /**
             * Specifies outboundRules.
             * @param outboundRules The outbound rules
             * @return the next definition stage
             */
            WithCreate withOutboundRules(List<OutboundRuleInner> outboundRules);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify Probes.
         */
        interface WithProbes {
            /**
             * Specifies probes.
             * @param probes Collection of probe objects used in the load balancer
             * @return the next definition stage
             */
            WithCreate withProbes(List<ProbeInner> probes);
        }

        /**
         * The stage of the loadbalancer definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The load balancer SKU
             * @return the next definition stage
             */
            WithCreate withSku(LoadBalancerSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LoadBalancer>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithBackendAddressPools, DefinitionStages.WithFrontendIPConfigurations, DefinitionStages.WithInboundNatPools, DefinitionStages.WithInboundNatRules, DefinitionStages.WithLoadBalancingRules, DefinitionStages.WithOutboundRules, DefinitionStages.WithProbes, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a LoadBalancer update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LoadBalancer>, Resource.UpdateWithTags<Update>, UpdateStages.WithBackendAddressPools, UpdateStages.WithFrontendIPConfigurations, UpdateStages.WithInboundNatPools, UpdateStages.WithInboundNatRules, UpdateStages.WithLoadBalancingRules, UpdateStages.WithOutboundRules, UpdateStages.WithProbes, UpdateStages.WithSku {
    }

    /**
     * Grouping of LoadBalancer update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the loadbalancer update allowing to specify BackendAddressPools.
         */
        interface WithBackendAddressPools {
            /**
             * Specifies backendAddressPools.
             * @param backendAddressPools Collection of backend address pools used by a load balancer
             * @return the next update stage
             */
            Update withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools);
        }

        /**
         * The stage of the loadbalancer update allowing to specify FrontendIPConfigurations.
         */
        interface WithFrontendIPConfigurations {
            /**
             * Specifies frontendIPConfigurations.
             * @param frontendIPConfigurations Object representing the frontend IPs to be used for the load balancer
             * @return the next update stage
             */
            Update withFrontendIPConfigurations(List<FrontendIPConfigurationInner> frontendIPConfigurations);
        }

        /**
         * The stage of the loadbalancer update allowing to specify InboundNatPools.
         */
        interface WithInboundNatPools {
            /**
             * Specifies inboundNatPools.
             * @param inboundNatPools Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules
             * @return the next update stage
             */
            Update withInboundNatPools(List<InboundNatPool> inboundNatPools);
        }

        /**
         * The stage of the loadbalancer update allowing to specify InboundNatRules.
         */
        interface WithInboundNatRules {
            /**
             * Specifies inboundNatRules.
             * @param inboundNatRules Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules
             * @return the next update stage
             */
            Update withInboundNatRules(List<InboundNatRuleInner> inboundNatRules);
        }

        /**
         * The stage of the loadbalancer update allowing to specify LoadBalancingRules.
         */
        interface WithLoadBalancingRules {
            /**
             * Specifies loadBalancingRules.
             * @param loadBalancingRules Object collection representing the load balancing rules Gets the provisioning
             * @return the next update stage
             */
            Update withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules);
        }

        /**
         * The stage of the loadbalancer update allowing to specify OutboundRules.
         */
        interface WithOutboundRules {
            /**
             * Specifies outboundRules.
             * @param outboundRules The outbound rules
             * @return the next update stage
             */
            Update withOutboundRules(List<OutboundRuleInner> outboundRules);
        }

        /**
         * The stage of the loadbalancer update allowing to specify Probes.
         */
        interface WithProbes {
            /**
             * Specifies probes.
             * @param probes Collection of probe objects used in the load balancer
             * @return the next update stage
             */
            Update withProbes(List<ProbeInner> probes);
        }

        /**
         * The stage of the loadbalancer update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The load balancer SKU
             * @return the next update stage
             */
            Update withSku(LoadBalancerSku sku);
        }

    }
}
