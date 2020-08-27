/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ExpressRouteCircuitAuthorizationInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ExpressRouteCircuitPeeringInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ExpressRouteCircuitInner;

/**
 * Type representing ExpressRouteCircuit.
 */
public interface ExpressRouteCircuit extends HasInner<ExpressRouteCircuitInner>, Resource, GroupableResourceCore<NetworkManager, ExpressRouteCircuitInner>, HasResourceGroup, Refreshable<ExpressRouteCircuit>, Updatable<ExpressRouteCircuit.Update>, HasManager<NetworkManager> {
    /**
     * @return the allowClassicOperations value.
     */
    Boolean allowClassicOperations();

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
     * @return the globalReachEnabled value.
     */
    Boolean globalReachEnabled();

    /**
     * @return the peerings value.
     */
    List<ExpressRouteCircuitPeering> peerings();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
         * The stage of the expressroutecircuit definition allowing to specify AllowClassicOperations.
         */
        interface WithAllowClassicOperations {
            /**
             * Specifies allowClassicOperations.
             * @param allowClassicOperations Allow classic operations
             * @return the next definition stage
             */
            WithCreate withAllowClassicOperations(Boolean allowClassicOperations);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify Authorizations.
         */
        interface WithAuthorizations {
            /**
             * Specifies authorizations.
             * @param authorizations The list of authorizations
             * @return the next definition stage
             */
            WithCreate withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify BandwidthInGbps.
         */
        interface WithBandwidthInGbps {
            /**
             * Specifies bandwidthInGbps.
             * @param bandwidthInGbps The bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource
             * @return the next definition stage
             */
            WithCreate withBandwidthInGbps(Double bandwidthInGbps);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify CircuitProvisioningState.
         */
        interface WithCircuitProvisioningState {
            /**
             * Specifies circuitProvisioningState.
             * @param circuitProvisioningState The CircuitProvisioningState state of the resource
             * @return the next definition stage
             */
            WithCreate withCircuitProvisioningState(String circuitProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify ExpressRoutePort.
         */
        interface WithExpressRoutePort {
            /**
             * Specifies expressRoutePort.
             * @param expressRoutePort The reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource
             * @return the next definition stage
             */
            WithCreate withExpressRoutePort(SubResource expressRoutePort);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             * @param gatewayManagerEtag The GatewayManager Etag
             * @return the next definition stage
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify GlobalReachEnabled.
         */
        interface WithGlobalReachEnabled {
            /**
             * Specifies globalReachEnabled.
             * @param globalReachEnabled Flag denoting global reach status
             * @return the next definition stage
             */
            WithCreate withGlobalReachEnabled(Boolean globalReachEnabled);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             * @param peerings The list of peerings
             * @return the next definition stage
             */
            WithCreate withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify ServiceKey.
         */
        interface WithServiceKey {
            /**
             * Specifies serviceKey.
             * @param serviceKey The ServiceKey
             * @return the next definition stage
             */
            WithCreate withServiceKey(String serviceKey);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify ServiceProviderNotes.
         */
        interface WithServiceProviderNotes {
            /**
             * Specifies serviceProviderNotes.
             * @param serviceProviderNotes The ServiceProviderNotes
             * @return the next definition stage
             */
            WithCreate withServiceProviderNotes(String serviceProviderNotes);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify ServiceProviderProperties.
         */
        interface WithServiceProviderProperties {
            /**
             * Specifies serviceProviderProperties.
             * @param serviceProviderProperties The ServiceProviderProperties
             * @return the next definition stage
             */
            WithCreate withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify ServiceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies serviceProviderProvisioningState.
             * @param serviceProviderProvisioningState The ServiceProviderProvisioningState state of the resource. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'
             * @return the next definition stage
             */
            WithCreate withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU
             * @return the next definition stage
             */
            WithCreate withSku(ExpressRouteCircuitSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCircuit>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAllowClassicOperations, DefinitionStages.WithAuthorizations, DefinitionStages.WithBandwidthInGbps, DefinitionStages.WithCircuitProvisioningState, DefinitionStages.WithExpressRoutePort, DefinitionStages.WithGatewayManagerEtag, DefinitionStages.WithGlobalReachEnabled, DefinitionStages.WithPeerings, DefinitionStages.WithServiceKey, DefinitionStages.WithServiceProviderNotes, DefinitionStages.WithServiceProviderProperties, DefinitionStages.WithServiceProviderProvisioningState, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a ExpressRouteCircuit update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCircuit>, Resource.UpdateWithTags<Update>, UpdateStages.WithAllowClassicOperations, UpdateStages.WithAuthorizations, UpdateStages.WithBandwidthInGbps, UpdateStages.WithCircuitProvisioningState, UpdateStages.WithExpressRoutePort, UpdateStages.WithGatewayManagerEtag, UpdateStages.WithGlobalReachEnabled, UpdateStages.WithPeerings, UpdateStages.WithServiceKey, UpdateStages.WithServiceProviderNotes, UpdateStages.WithServiceProviderProperties, UpdateStages.WithServiceProviderProvisioningState, UpdateStages.WithSku {
    }

    /**
     * Grouping of ExpressRouteCircuit update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecircuit update allowing to specify AllowClassicOperations.
         */
        interface WithAllowClassicOperations {
            /**
             * Specifies allowClassicOperations.
             * @param allowClassicOperations Allow classic operations
             * @return the next update stage
             */
            Update withAllowClassicOperations(Boolean allowClassicOperations);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify Authorizations.
         */
        interface WithAuthorizations {
            /**
             * Specifies authorizations.
             * @param authorizations The list of authorizations
             * @return the next update stage
             */
            Update withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify BandwidthInGbps.
         */
        interface WithBandwidthInGbps {
            /**
             * Specifies bandwidthInGbps.
             * @param bandwidthInGbps The bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource
             * @return the next update stage
             */
            Update withBandwidthInGbps(Double bandwidthInGbps);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify CircuitProvisioningState.
         */
        interface WithCircuitProvisioningState {
            /**
             * Specifies circuitProvisioningState.
             * @param circuitProvisioningState The CircuitProvisioningState state of the resource
             * @return the next update stage
             */
            Update withCircuitProvisioningState(String circuitProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ExpressRoutePort.
         */
        interface WithExpressRoutePort {
            /**
             * Specifies expressRoutePort.
             * @param expressRoutePort The reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource
             * @return the next update stage
             */
            Update withExpressRoutePort(SubResource expressRoutePort);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             * @param gatewayManagerEtag The GatewayManager Etag
             * @return the next update stage
             */
            Update withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify GlobalReachEnabled.
         */
        interface WithGlobalReachEnabled {
            /**
             * Specifies globalReachEnabled.
             * @param globalReachEnabled Flag denoting global reach status
             * @return the next update stage
             */
            Update withGlobalReachEnabled(Boolean globalReachEnabled);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             * @param peerings The list of peerings
             * @return the next update stage
             */
            Update withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceKey.
         */
        interface WithServiceKey {
            /**
             * Specifies serviceKey.
             * @param serviceKey The ServiceKey
             * @return the next update stage
             */
            Update withServiceKey(String serviceKey);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceProviderNotes.
         */
        interface WithServiceProviderNotes {
            /**
             * Specifies serviceProviderNotes.
             * @param serviceProviderNotes The ServiceProviderNotes
             * @return the next update stage
             */
            Update withServiceProviderNotes(String serviceProviderNotes);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceProviderProperties.
         */
        interface WithServiceProviderProperties {
            /**
             * Specifies serviceProviderProperties.
             * @param serviceProviderProperties The ServiceProviderProperties
             * @return the next update stage
             */
            Update withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify ServiceProviderProvisioningState.
         */
        interface WithServiceProviderProvisioningState {
            /**
             * Specifies serviceProviderProvisioningState.
             * @param serviceProviderProvisioningState The ServiceProviderProvisioningState state of the resource. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'
             * @return the next update stage
             */
            Update withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState);
        }

        /**
         * The stage of the expressroutecircuit update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU
             * @return the next update stage
             */
            Update withSku(ExpressRouteCircuitSku sku);
        }

    }
}
