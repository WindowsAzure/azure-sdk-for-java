/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_11_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.implementation.FrontendIPConfigurationInner;
import com.microsoft.azure.management.network.v2019_11_01.implementation.PrivateLinkServiceInner;

/**
 * Type representing PrivateLinkService.
 */
public interface PrivateLinkService extends HasInner<PrivateLinkServiceInner>, Resource, GroupableResourceCore<NetworkManager, PrivateLinkServiceInner>, HasResourceGroup, Refreshable<PrivateLinkService>, Updatable<PrivateLinkService.Update>, HasManager<NetworkManager> {
    /**
     * @return the alias value.
     */
    String alias();

    /**
     * @return the autoApproval value.
     */
    PrivateLinkServicePropertiesAutoApproval autoApproval();

    /**
     * @return the enableProxyProtocol value.
     */
    Boolean enableProxyProtocol();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the fqdns value.
     */
    List<String> fqdns();

    /**
     * @return the ipConfigurations value.
     */
    List<PrivateLinkServiceIpConfiguration> ipConfigurations();

    /**
     * @return the loadBalancerFrontendIpConfigurations value.
     */
    List<FrontendIPConfiguration> loadBalancerFrontendIpConfigurations();

    /**
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the visibility value.
     */
    PrivateLinkServicePropertiesVisibility visibility();

    /**
     * The entirety of the PrivateLinkService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateLinkService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateLinkService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PrivateLinkService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the privatelinkservice definition allowing to specify AutoApproval.
         */
        interface WithAutoApproval {
            /**
             * Specifies autoApproval.
             * @param autoApproval The auto-approval list of the private link service
             * @return the next definition stage
             */
            WithCreate withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval);
        }

        /**
         * The stage of the privatelinkservice definition allowing to specify EnableProxyProtocol.
         */
        interface WithEnableProxyProtocol {
            /**
             * Specifies enableProxyProtocol.
             * @param enableProxyProtocol Whether the private link service is enabled for proxy protocol or not
             * @return the next definition stage
             */
            WithCreate withEnableProxyProtocol(Boolean enableProxyProtocol);
        }

        /**
         * The stage of the privatelinkservice definition allowing to specify Fqdns.
         */
        interface WithFqdns {
            /**
             * Specifies fqdns.
             * @param fqdns The list of Fqdn
             * @return the next definition stage
             */
            WithCreate withFqdns(List<String> fqdns);
        }

        /**
         * The stage of the privatelinkservice definition allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations An array of private link service IP configurations
             * @return the next definition stage
             */
            WithCreate withIpConfigurations(List<PrivateLinkServiceIpConfiguration> ipConfigurations);
        }

        /**
         * The stage of the privatelinkservice definition allowing to specify LoadBalancerFrontendIpConfigurations.
         */
        interface WithLoadBalancerFrontendIpConfigurations {
            /**
             * Specifies loadBalancerFrontendIpConfigurations.
             * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP configurations
             * @return the next definition stage
             */
            WithCreate withLoadBalancerFrontendIpConfigurations(List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations);
        }

        /**
         * The stage of the privatelinkservice definition allowing to specify Visibility.
         */
        interface WithVisibility {
            /**
             * Specifies visibility.
             * @param visibility The visibility list of the private link service
             * @return the next definition stage
             */
            WithCreate withVisibility(PrivateLinkServicePropertiesVisibility visibility);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateLinkService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAutoApproval, DefinitionStages.WithEnableProxyProtocol, DefinitionStages.WithFqdns, DefinitionStages.WithIpConfigurations, DefinitionStages.WithLoadBalancerFrontendIpConfigurations, DefinitionStages.WithVisibility {
        }
    }
    /**
     * The template for a PrivateLinkService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateLinkService>, Resource.UpdateWithTags<Update>, UpdateStages.WithAutoApproval, UpdateStages.WithEnableProxyProtocol, UpdateStages.WithFqdns, UpdateStages.WithIpConfigurations, UpdateStages.WithLoadBalancerFrontendIpConfigurations, UpdateStages.WithVisibility {
    }

    /**
     * Grouping of PrivateLinkService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privatelinkservice update allowing to specify AutoApproval.
         */
        interface WithAutoApproval {
            /**
             * Specifies autoApproval.
             * @param autoApproval The auto-approval list of the private link service
             * @return the next update stage
             */
            Update withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval);
        }

        /**
         * The stage of the privatelinkservice update allowing to specify EnableProxyProtocol.
         */
        interface WithEnableProxyProtocol {
            /**
             * Specifies enableProxyProtocol.
             * @param enableProxyProtocol Whether the private link service is enabled for proxy protocol or not
             * @return the next update stage
             */
            Update withEnableProxyProtocol(Boolean enableProxyProtocol);
        }

        /**
         * The stage of the privatelinkservice update allowing to specify Fqdns.
         */
        interface WithFqdns {
            /**
             * Specifies fqdns.
             * @param fqdns The list of Fqdn
             * @return the next update stage
             */
            Update withFqdns(List<String> fqdns);
        }

        /**
         * The stage of the privatelinkservice update allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations An array of private link service IP configurations
             * @return the next update stage
             */
            Update withIpConfigurations(List<PrivateLinkServiceIpConfiguration> ipConfigurations);
        }

        /**
         * The stage of the privatelinkservice update allowing to specify LoadBalancerFrontendIpConfigurations.
         */
        interface WithLoadBalancerFrontendIpConfigurations {
            /**
             * Specifies loadBalancerFrontendIpConfigurations.
             * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP configurations
             * @return the next update stage
             */
            Update withLoadBalancerFrontendIpConfigurations(List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations);
        }

        /**
         * The stage of the privatelinkservice update allowing to specify Visibility.
         */
        interface WithVisibility {
            /**
             * Specifies visibility.
             * @param visibility The visibility list of the private link service
             * @return the next update stage
             */
            Update withVisibility(PrivateLinkServicePropertiesVisibility visibility);
        }

    }
}
