/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.management.network.implementation.LoadBalancingRuleInner;
import com.microsoft.azure.management.network.model.HasBackendPort;
import com.microsoft.azure.management.network.model.HasFloatingIP;
import com.microsoft.azure.management.network.model.HasFrontend;
import com.microsoft.azure.management.network.model.HasFrontendPort;
import com.microsoft.azure.management.network.model.HasProtocol;
import com.microsoft.azure.management.resources.fluentcore.arm.models.ChildResource;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.Settable;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;

/**
 * An immutable client-side representation of an HTTP load balancing rule.
 */
@Fluent()
@Beta
public interface LoadBalancingRule extends
    HasInner<LoadBalancingRuleInner>,
    ChildResource<LoadBalancer>,
    HasBackendPort,
    HasFrontend,
    HasFloatingIP,
    HasProtocol<TransportProtocol>,
    HasFrontendPort {

    /**
     * @return the method of load distribution
     */
    LoadDistribution loadDistribution();

    /**
     * @return the number of minutes before an inactive connection is closed
     */
    int idleTimeoutInMinutes();

    /**
     * @return the backend associated with the load balancing rule
     */
    LoadBalancerBackend backend();

    /**
     * @return the probe associated with the load balancing rule
     */
    LoadBalancerProbe probe();

    /**
     * Grouping of load balancing rule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the load balancing rule definition.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ReturnT> extends WithProtocol<ReturnT> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the transport protocol to apply the rule to.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithProtocol<ReturnT> extends
            HasProtocol.DefinitionStages.WithProtocol<WithFrontend<ReturnT>, TransportProtocol> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the frontend port to load balance.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithFrontendPort<ReturnT> extends HasFrontendPort.DefinitionStages.WithFrontendPort<WithBackend<ReturnT>> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the frontend to associate with the rule.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithFrontend<ReturnT> extends
            HasFrontend.DefinitionStages.WithFrontend<WithFrontendPort<ReturnT>> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the probe to associate with the rule.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithProbe<ReturnT> {
            /**
             * Associates the specified existing HTTP or TCP probe of this load balancer with the load balancing rule.
             * @param name the name of an existing HTTP or TCP probe
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> withProbe(String name);
        }

        /** The stage of a load balancing rule definition allowing to specify the backend to associate the rule with.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithBackend<ReturnT> {
            /**
             * Specifies a backend on this load balancer to send network traffic to.
             * <p>
             * If a backend with the specified name does not yet exist on this load balancer, it will be created automatically.
             * @param backendName the name of a backend
             * @return the next stage of the definition
             */
            WithBackendPort<ReturnT> toBackend(String backendName);

            /**
             * Selects the load balancer's default backend as the backend to send network traffic to.
             * @return the next stage of the definition
             */
            @Beta(SinceVersion.V1_2_0)
            WithBackendPort<ReturnT> toDefaultBackend();
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the backend port to send the load-balanced traffic to.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithBackendPort<ReturnT> extends
            HasBackendPort.DefinitionStages.WithBackendPort<WithAttach<ReturnT>>,
            WithAttach<ReturnT> {
        }

        /**
         * The final stage of the load balancing rule definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the load balancing rule definition
         * can be attached to the parent load balancer definition using {@link WithAttach#attach()}.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithAttach<ReturnT> extends
            Attachable.InDefinition<ReturnT>,
            DefinitionStages.WithFloatingIP<ReturnT>,
            DefinitionStages.WithIdleTimeoutInMinutes<ReturnT>,
            DefinitionStages.WithLoadDistribution<ReturnT>,
            DefinitionStages.WithProbe<ReturnT> {
        }

        /**
         * The stage of a load balancing rule definition allowing to enable the floating IP functionality.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithFloatingIP<ReturnT> extends HasFloatingIP.DefinitionStages.WithFloatingIP<WithAttach<ReturnT>> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the connection timeout for idle connections.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithIdleTimeoutInMinutes<ReturnT> {
            /**
             * Specifies the number of minutes before an idle connection is closed.
             * @param minutes the desired number of minutes
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> withIdleTimeoutInMinutes(int minutes);
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the load distribution.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithLoadDistribution<ReturnT> {
            /**
             * Specifies the load distribution mode.
             * @param loadDistribution a supported load distribution mode
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> withLoadDistribution(LoadDistribution loadDistribution);
        }
    }

    /** The entirety of a load balancing rule definition.
     * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
     */
    interface Definition<ReturnT> extends
        DefinitionStages.Blank<ReturnT>,
        DefinitionStages.WithAttach<ReturnT>,
        DefinitionStages.WithProtocol<ReturnT>,
        DefinitionStages.WithFrontendPort<ReturnT>,
        DefinitionStages.WithFrontend<ReturnT>,
        DefinitionStages.WithBackend<ReturnT>,
        DefinitionStages.WithBackendPort<ReturnT> {
    }

    /**
     * Grouping of load balancing rule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of a load balancing rule update allowing to modify the transport protocol the rule applies to.
         */
        interface WithProtocol extends
            HasProtocol.UpdateStages.WithProtocol<Update, TransportProtocol> {
        }

        /**
         * The stage of a load balancing rule update allowing to modify the frontend port.
         */
        interface WithFrontendPort extends HasFrontendPort.UpdateStages.WithFrontendPort<Update> {
        }

        /**
         * The stage of a load balancing rule update allowing to modify the frontend reference.
         */
        interface WithFrontend extends
            HasFrontend.UpdateStages.WithFrontend<Update> {
        }

        /**
         * The stage of a load balancing rule update allowing to modify the backend port.
         */
        interface WithBackendPort extends
            HasBackendPort.UpdateStages.WithBackendPort<Update> {
        }

        /**
         * The stage of a load balancing rule update allowing to enable the floating IP functionality.
         */
        interface WithFloatingIP extends HasFloatingIP.UpdateStages.WithFloatingIP<Update> {
        }

        /**
         * The stage of a load balancing rule update allowing to modify the connection timeout for idle connections.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies the number of minutes before an idle connection is closed.
             * @param minutes the desired number of minutes
             * @return the next stage of the update
             */
            Update withIdleTimeoutInMinutes(int minutes);
        }

        /**
         * The stage of a load balancing rule update allowing to specify the probe to associate with the rule.
         */
        interface WithProbe {
            /**
             * Associates the specified existing HTTP or TCP probe of this load balancer with the load balancing rule.
             * @param name the name of an existing HTTP or TCP probe
             * @return the next stage of the update
             */
            Update withProbe(String name);

            /**
             * Removes any association with a probe and falls back to Azure's default probing mechanism.
             * @return the next stage of the update
             */
            Update withoutProbe();
        }

        /**
         * The stage of a load balancing rule update allowing to modify the load distribution.
         */
        interface WithLoadDistribution {
            /**
             * Specifies the load distribution mode.
             * @param loadDistribution a supported load distribution mode
             * @return the next stage of the definition
             */
            Update withLoadDistribution(LoadDistribution loadDistribution);
        }
    }

    /**
     * The entirety of a load balancing rule update as part of a load balancer update.
     */
    interface Update extends
        Settable<LoadBalancer.Update>,
        UpdateStages.WithFrontendPort,
        UpdateStages.WithFrontend,
        UpdateStages.WithProtocol,
        UpdateStages.WithBackendPort,
        UpdateStages.WithFloatingIP,
        UpdateStages.WithIdleTimeoutInMinutes,
        UpdateStages.WithLoadDistribution,
        UpdateStages.WithProbe {
    }

    /**
     * Grouping of load balancing rule definition stages applicable as part of a load balancer update.
     */
    interface UpdateDefinitionStages {
        /**
         * The first stage of the load balancing rule definition.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ReturnT> extends WithProtocol<ReturnT> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the transport protocol to apply the rule to.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithProtocol<ReturnT> extends
            HasProtocol.UpdateDefinitionStages.WithProtocol<WithFrontend<ReturnT>, TransportProtocol> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the frontend port to load balance.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithFrontendPort<ReturnT> extends HasFrontendPort.UpdateDefinitionStages.WithFrontendPort<WithBackend<ReturnT>> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the frontend to associate with the rule.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithFrontend<ReturnT> extends
            HasFrontend.UpdateDefinitionStages.WithFrontend<WithFrontendPort<ReturnT>> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the probe to associate with the rule.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithProbe<ReturnT> {
            /**
             * Associates the specified existing HTTP or TCP probe of this load balancer with the load balancing rule.
             * @param name the name of an existing HTTP or TCP probe
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> withProbe(String name);
        }

        /** The stage of a load balancing rule definition allowing to specify the backend to associate the rule with.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithBackend<ReturnT> {
            /**
             * Specifies a backend on this load balancer to send network traffic to.
             * <p>
             * If a backend with the specified name does not yet exist, it will be created automatically.
             * @param backendName the name of an existing backend
             * @return the next stage of the definition
             */
            WithBackendPort<ReturnT> toBackend(String backendName);

            /**
             * Selects the load balancer's default backend as the backend to send network traffic to.
             * @return the next stage of the definition
             */
            @Beta(SinceVersion.V1_2_0)
            WithBackendPort<ReturnT> toDefaultBackend();
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the backend port to send the load-balanced traffic to.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithBackendPort<ReturnT> extends
            HasBackendPort.UpdateDefinitionStages.WithBackendPort<WithAttach<ReturnT>>,
            WithAttach<ReturnT> {
        }

        /**
         * The stage of a load balancing rule definition allowing to enable the floating IP functionality.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithFloatingIP<ReturnT> extends HasFloatingIP.UpdateDefinitionStages.WithFloatingIP<WithAttach<ReturnT>> {
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the connection timeout for idle connections.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithIdleTimeoutInMinutes<ReturnT> {
            /**
             * Specifies the number of minutes before an idle connection is closed.
             * @param minutes the desired number of minutes
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> withIdleTimeoutInMinutes(int minutes);
        }

        /**
         * The stage of a load balancing rule definition allowing to specify the load distribution.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithLoadDistribution<ReturnT> {
            /**
             * Specifies the load distribution mode.
             * @param loadDistribution a supported load distribution mode
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> withLoadDistribution(LoadDistribution loadDistribution);
        }

        /**
         * The final stage of the load balancing rule definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the load balancing rule definition
         * can be attached to the parent load balancer definition using {@link WithAttach#attach()}.
         * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithAttach<ReturnT> extends
            Attachable.InUpdate<ReturnT>,
            UpdateDefinitionStages.WithFloatingIP<ReturnT>,
            UpdateDefinitionStages.WithIdleTimeoutInMinutes<ReturnT>,
            UpdateDefinitionStages.WithLoadDistribution<ReturnT>,
            UpdateDefinitionStages.WithProbe<ReturnT> {
        }
    }

    /** The entirety of a load balancing rule definition as part of a load balancer update.
     * @param <ReturnT> the stage of the parent definition to return to after attaching this definition
     */
    interface UpdateDefinition<ReturnT> extends
        UpdateDefinitionStages.Blank<ReturnT>,
        UpdateDefinitionStages.WithAttach<ReturnT>,
        UpdateDefinitionStages.WithProtocol<ReturnT>,
        UpdateDefinitionStages.WithFrontendPort<ReturnT>,
        UpdateDefinitionStages.WithFrontend<ReturnT>,
        UpdateDefinitionStages.WithBackend<ReturnT>,
        UpdateDefinitionStages.WithBackendPort<ReturnT> {
    }
}
