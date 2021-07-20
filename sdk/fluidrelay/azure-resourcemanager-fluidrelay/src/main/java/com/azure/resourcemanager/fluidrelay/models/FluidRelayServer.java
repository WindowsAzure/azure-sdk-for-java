// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerInner;
import java.util.Map;

/** An immutable client-side representation of FluidRelayServer. */
public interface FluidRelayServer {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: System meta data for this resource, including creation and modification
     * information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the frsTenantId property: The Fluid tenantId for this server.
     *
     * @return the frsTenantId value.
     */
    String frsTenantId();

    /**
     * Gets the fluidRelayEndpoints property: The Fluid Relay Service endpoints for this server.
     *
     * @return the fluidRelayEndpoints value.
     */
    FluidRelayEndpoints fluidRelayEndpoints();

    /**
     * Gets the provisioningState property: Provision states for FluidRelay RP.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerInner object.
     *
     * @return the inner object.
     */
    FluidRelayServerInner innerModel();

    /** The entirety of the FluidRelayServer definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The FluidRelayServer definition stages. */
    interface DefinitionStages {
        /** The first stage of the FluidRelayServer definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the FluidRelayServer definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the FluidRelayServer definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroup.
             *
             * @param resourceGroup The resource group containing the resource.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroup);
        }
        /**
         * The stage of the FluidRelayServer definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            FluidRelayServer create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FluidRelayServer create(Context context);
        }
        /** The stage of the FluidRelayServer definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the FluidRelayServer definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provision states for FluidRelay RP.
             *
             * @param provisioningState Provision states for FluidRelay RP.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }
    }
    /**
     * Begins update for the FluidRelayServer resource.
     *
     * @return the stage of resource update.
     */
    FluidRelayServer.Update update();

    /** The template for FluidRelayServer update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        FluidRelayServer apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FluidRelayServer apply(Context context);
    }
    /** The FluidRelayServer update stages. */
    interface UpdateStages {
        /** The stage of the FluidRelayServer update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    FluidRelayServer refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FluidRelayServer refresh(Context context);

    /**
     * Regenerate the primary or secondary key for this server.
     *
     * @param parameters The details of which keys to generate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of available keys for this server.
     */
    FluidRelayServerKeys regenerateKey(RegenerateKeyRequest parameters);

    /**
     * Regenerate the primary or secondary key for this server.
     *
     * @param parameters The details of which keys to generate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of available keys for this server.
     */
    Response<FluidRelayServerKeys> regenerateKeyWithResponse(RegenerateKeyRequest parameters, Context context);

    /**
     * Regenerate the primary or secondary key for this server.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of available keys for this server.
     */
    FluidRelayServerKeys getKeys();

    /**
     * Regenerate the primary or secondary key for this server.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of available keys for this server.
     */
    Response<FluidRelayServerKeys> getKeysWithResponse(Context context);
}
