/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_08_01.implementation.ExpressRouteCircuitAuthorizationInner;
import com.microsoft.azure.management.network.v2018_08_01.implementation.ExpressRouteCircuitPeeringInner;
import com.microsoft.azure.management.network.v2018_08_01.implementation.ExpressRouteCircuitInner;

/**
 * Type representing ExpressRouteCircuit.
 */
public interface ExpressRouteCircuit extends HasInner<ExpressRouteCircuitInner>, Resource, GroupableResourceCore<NetworkManager, ExpressRouteCircuitInner>, HasResourceGroup, Refreshable<ExpressRouteCircuit>, Updatable<ExpressRouteCircuit.Update>, HasManager<NetworkManager> {
    /**
     * @return the allowClassicOperations value.
     */
    Boolean allowClassicOperations();

    /**
     * @return the allowGlobalReach value.
     */
    Boolean allowGlobalReach();

    /**
     * @return the authorizations value.
     */
    List<ExpressRouteCircuitAuthorization> authorizations();

    /**
     * @return the bandwidthInGbps value.
     */
    Double bandwidthInGbps();

    /**
     * @return the circuitProvisioningState value.
     */
    String circuitProvisioningState();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRoutePort value.
     */
    SubResource expressRoutePort();

    /**
     * @return the gatewayManagerEtag value.
     */
    String gatewayManagerEtag();

    /**
     * @return the peerings value.
     */
    List<ExpressRouteCircuitPeering> peerings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serviceKey value.
     */
    String serviceKey();

    /**
     * @return the serviceProviderNotes value.
     */
    String serviceProviderNotes();

    /**
     * @return the serviceProviderProperties value.
     */
    ExpressRouteCircuitServiceProviderProperties serviceProviderProperties();

    /**
     * @return the serviceProviderProvisioningState value.
     */
    ServiceProviderProvisioningState serviceProviderProvisioningState();

    /**
     * @return the sku value.
     */
    ExpressRouteCircuitSku sku();

    /**
     * @return the stag value.
     */
    Integer stag();

    /**
     * The entirety of the ExpressRouteCircuit definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteCircuit definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteCircuit definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ExpressRouteCircuit definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify AllowClassicOperations.
         */
        interface WithAllowClassicOperations {
            /**
             * Specifies allowClassicOperations.
             */
            WithCreate withAllowClassicOperations(Boolean allowClassicOperations);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify AllowGlobalReach.
         */
        interface WithAllowGlobalReach {
            /**
             * Specifies allowGlobalReach.
             */
            WithCreate withAllowGlobalReach(Boolean allowGlobalReach);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify Authorizations.
         */
        interface WithAuthorizations {
            /**
             * Specifies authorizations.
             */
            WithCreate withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify BandwidthInGbps.
         */
        interface WithBandwidthInGbps {
            /**
             * Specifies bandwidthInGbps.
             */
            WithCreate withBandwidthInGbps(Double bandwidthInGbps);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify CircuitProvisioningState.
         */
        interface WithCircuitProvisioningState {
            /**
             * Specifies circuitProvisioningState.
             */
            WithCreate withCircuitProvisioningState(String circuitProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ExpressRoutePort.
         */
        interface WithExpressRoutePort {
            /**
             * Specifies expressRoutePort.
             */
            WithCreate withExpressRoutePort(SubResource expressRoutePort);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             */
            WithCreate withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceKey.
         */
        interface WithServiceKey {
            /**
             * Specifies serviceKey.
             */
            WithCreate withServiceKey(String serviceKey);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceProviderNotes.
         */
        interface WithServiceProviderNotes {
            /**
             * Specifies serviceProviderNotes.
             */
            WithCreate withServiceProviderNotes(String serviceProviderNotes);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceProviderProperties.
         */
        interface WithServiceProviderProperties {
            /**
             * Specifies serviceProviderProperties.
             */
            WithCreate withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies serviceProviderProvisioningState.
             */
            WithCreate withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(ExpressRouteCircuitSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCircuit>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAllowClassicOperations, DefinitionStages.WithAllowGlobalReach, DefinitionStages.WithAuthorizations, DefinitionStages.WithBandwidthInGbps, DefinitionStages.WithCircuitProvisioningState, DefinitionStages.WithExpressRoutePort, DefinitionStages.WithGatewayManagerEtag, DefinitionStages.WithPeerings, DefinitionStages.WithProvisioningState, DefinitionStages.WithServiceKey, DefinitionStages.WithServiceProviderNotes, DefinitionStages.WithServiceProviderProperties, DefinitionStages.WithServiceProviderProvisioningState, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a ExpressRouteCircuit update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCircuit>, Resource.UpdateWithTags<Update>, UpdateStages.WithAllowClassicOperations, UpdateStages.WithAllowGlobalReach, UpdateStages.WithAuthorizations, UpdateStages.WithBandwidthInGbps, UpdateStages.WithCircuitProvisioningState, UpdateStages.WithExpressRoutePort, UpdateStages.WithGatewayManagerEtag, UpdateStages.WithPeerings, UpdateStages.WithProvisioningState, UpdateStages.WithServiceKey, UpdateStages.WithServiceProviderNotes, UpdateStages.WithServiceProviderProperties, UpdateStages.WithServiceProviderProvisioningState, UpdateStages.WithSku {
    }

    /**
     * Grouping of ExpressRouteCircuit update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecircuit {0} allowing to specify AllowClassicOperations.
         */
        interface WithAllowClassicOperations {
            /**
             * Specifies allowClassicOperations.
             */
            Update withAllowClassicOperations(Boolean allowClassicOperations);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify AllowGlobalReach.
         */
        interface WithAllowGlobalReach {
            /**
             * Specifies allowGlobalReach.
             */
            Update withAllowGlobalReach(Boolean allowGlobalReach);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify Authorizations.
         */
        interface WithAuthorizations {
            /**
             * Specifies authorizations.
             */
            Update withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify BandwidthInGbps.
         */
        interface WithBandwidthInGbps {
            /**
             * Specifies bandwidthInGbps.
             */
            Update withBandwidthInGbps(Double bandwidthInGbps);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify CircuitProvisioningState.
         */
        interface WithCircuitProvisioningState {
            /**
             * Specifies circuitProvisioningState.
             */
            Update withCircuitProvisioningState(String circuitProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify ExpressRoutePort.
         */
        interface WithExpressRoutePort {
            /**
             * Specifies expressRoutePort.
             */
            Update withExpressRoutePort(SubResource expressRoutePort);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             */
            Update withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             */
            Update withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify ServiceKey.
         */
        interface WithServiceKey {
            /**
             * Specifies serviceKey.
             */
            Update withServiceKey(String serviceKey);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify ServiceProviderNotes.
         */
        interface WithServiceProviderNotes {
            /**
             * Specifies serviceProviderNotes.
             */
            Update withServiceProviderNotes(String serviceProviderNotes);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify ServiceProviderProperties.
         */
        interface WithServiceProviderProperties {
            /**
             * Specifies serviceProviderProperties.
             */
            Update withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify ServiceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies serviceProviderProvisioningState.
             */
            Update withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(ExpressRouteCircuitSku sku);
        }

    }
}
