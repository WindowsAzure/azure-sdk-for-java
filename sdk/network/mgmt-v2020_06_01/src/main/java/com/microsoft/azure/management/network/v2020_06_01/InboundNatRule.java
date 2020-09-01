/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.InboundNatRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing InboundNatRule.
 */
public interface InboundNatRule extends HasInner<InboundNatRuleInner>, Indexable, Refreshable<InboundNatRule>, Updatable<InboundNatRule.Update>, HasManager<NetworkManager> {
    /**
     * @return the backendIPConfiguration value.
     */
    VirtualMachineScaleSetNetworkInterfaceIPConfiguration backendIPConfiguration();

    /**
     * @return the backendPort value.
     */
    Integer backendPort();

    /**
     * @return the enableFloatingIP value.
     */
    Boolean enableFloatingIP();

    /**
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the frontendIPConfiguration value.
     */
    SubResource frontendIPConfiguration();

    /**
     * @return the frontendPort value.
     */
    Integer frontendPort();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protocol value.
     */
    TransportProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the InboundNatRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLoadBalancer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of InboundNatRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a InboundNatRule definition.
         */
        interface Blank extends WithLoadBalancer {
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify LoadBalancer.
         */
        interface WithLoadBalancer {
           /**
            * Specifies resourceGroupName, loadBalancerName.
            * @param resourceGroupName The name of the resource group
            * @param loadBalancerName The name of the load balancer
            * @return the next definition stage
            */
            WithCreate withExistingLoadBalancer(String resourceGroupName, String loadBalancerName);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify BackendPort.
         */
        interface WithBackendPort {
            /**
             * Specifies backendPort.
             * @param backendPort The port used for the internal endpoint. Acceptable values range from 1 to 65535
             * @return the next definition stage
             */
            WithCreate withBackendPort(Integer backendPort);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify EnableFloatingIP.
         */
        interface WithEnableFloatingIP {
            /**
             * Specifies enableFloatingIP.
             * @param enableFloatingIP Configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint
             * @return the next definition stage
             */
            WithCreate withEnableFloatingIP(Boolean enableFloatingIP);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify EnableTcpReset.
         */
        interface WithEnableTcpReset {
            /**
             * Specifies enableTcpReset.
             * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP
             * @return the next definition stage
             */
            WithCreate withEnableTcpReset(Boolean enableTcpReset);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify FrontendIPConfiguration.
         */
        interface WithFrontendIPConfiguration {
            /**
             * Specifies frontendIPConfiguration.
             * @param frontendIPConfiguration A reference to frontend IP addresses
             * @return the next definition stage
             */
            WithCreate withFrontendIPConfiguration(SubResource frontendIPConfiguration);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify FrontendPort.
         */
        interface WithFrontendPort {
            /**
             * Specifies frontendPort.
             * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534
             * @return the next definition stage
             */
            WithCreate withFrontendPort(Integer frontendPort);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Id.
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
         * The stage of the inboundnatrule definition allowing to specify IdleTimeoutInMinutes.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies idleTimeoutInMinutes.
             * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP
             * @return the next definition stage
             */
            WithCreate withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Protocol.
         */
        interface WithProtocol {
            /**
             * Specifies protocol.
             * @param protocol The reference to the transport protocol used by the load balancing rule. Possible values include: 'Udp', 'Tcp', 'All'
             * @return the next definition stage
             */
            WithCreate withProtocol(TransportProtocol protocol);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<InboundNatRule>, DefinitionStages.WithBackendPort, DefinitionStages.WithEnableFloatingIP, DefinitionStages.WithEnableTcpReset, DefinitionStages.WithFrontendIPConfiguration, DefinitionStages.WithFrontendPort, DefinitionStages.WithId, DefinitionStages.WithIdleTimeoutInMinutes, DefinitionStages.WithName, DefinitionStages.WithProtocol {
        }
    }
    /**
     * The template for a InboundNatRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<InboundNatRule>, UpdateStages.WithBackendPort, UpdateStages.WithEnableFloatingIP, UpdateStages.WithEnableTcpReset, UpdateStages.WithFrontendIPConfiguration, UpdateStages.WithFrontendPort, UpdateStages.WithId, UpdateStages.WithIdleTimeoutInMinutes, UpdateStages.WithName, UpdateStages.WithProtocol {
    }

    /**
     * Grouping of InboundNatRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the inboundnatrule update allowing to specify BackendPort.
         */
        interface WithBackendPort {
            /**
             * Specifies backendPort.
             * @param backendPort The port used for the internal endpoint. Acceptable values range from 1 to 65535
             * @return the next update stage
             */
            Update withBackendPort(Integer backendPort);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify EnableFloatingIP.
         */
        interface WithEnableFloatingIP {
            /**
             * Specifies enableFloatingIP.
             * @param enableFloatingIP Configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint
             * @return the next update stage
             */
            Update withEnableFloatingIP(Boolean enableFloatingIP);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify EnableTcpReset.
         */
        interface WithEnableTcpReset {
            /**
             * Specifies enableTcpReset.
             * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP
             * @return the next update stage
             */
            Update withEnableTcpReset(Boolean enableTcpReset);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify FrontendIPConfiguration.
         */
        interface WithFrontendIPConfiguration {
            /**
             * Specifies frontendIPConfiguration.
             * @param frontendIPConfiguration A reference to frontend IP addresses
             * @return the next update stage
             */
            Update withFrontendIPConfiguration(SubResource frontendIPConfiguration);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify FrontendPort.
         */
        interface WithFrontendPort {
            /**
             * Specifies frontendPort.
             * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534
             * @return the next update stage
             */
            Update withFrontendPort(Integer frontendPort);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Id.
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
         * The stage of the inboundnatrule update allowing to specify IdleTimeoutInMinutes.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies idleTimeoutInMinutes.
             * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP
             * @return the next update stage
             */
            Update withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Protocol.
         */
        interface WithProtocol {
            /**
             * Specifies protocol.
             * @param protocol The reference to the transport protocol used by the load balancing rule. Possible values include: 'Udp', 'Tcp', 'All'
             * @return the next update stage
             */
            Update withProtocol(TransportProtocol protocol);
        }

    }
}
