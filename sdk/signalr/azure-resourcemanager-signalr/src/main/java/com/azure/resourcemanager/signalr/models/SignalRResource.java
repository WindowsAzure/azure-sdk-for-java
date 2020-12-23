// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of SignalRResource. */
public interface SignalRResource {
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
     * Gets the sku property: The billing information of the resource.(e.g. Free, Standard).
     *
     * @return the sku value.
     */
    ResourceSku sku();

    /**
     * Gets the kind property: The kind of the service - e.g. "SignalR", or "RawWebSockets" for
     * "Microsoft.SignalRService/SignalR".
     *
     * @return the kind value.
     */
    ServiceKind kind();

    /**
     * Gets the identity property: The managed identity response.
     *
     * @return the identity value.
     */
    ManagedIdentity identity();

    /**
     * Gets the features property: List of SignalR featureFlags. e.g. ServiceMode.
     *
     * <p>FeatureFlags that are not included in the parameters for the update operation will not be modified. And the
     * response will only include featureFlags that are explicitly set. When a featureFlag is not explicitly set,
     * SignalR service will use its globally default value. But keep in mind, the default value doesn't mean "false". It
     * varies in terms of different FeatureFlags.
     *
     * @return the features value.
     */
    List<SignalRFeature> features();

    /**
     * Gets the cors property: Cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value.
     */
    SignalRCorsSettings cors();

    /**
     * Gets the upstream property: Upstream settings when the Azure SignalR is in server-less mode.
     *
     * @return the upstream value.
     */
    ServerlessUpstreamSettings upstream();

    /**
     * Gets the networkACLs property: Network ACLs.
     *
     * @return the networkACLs value.
     */
    SignalRNetworkACLs networkACLs();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the externalIp property: The publicly accessible IP of the SignalR service.
     *
     * @return the externalIp value.
     */
    String externalIp();

    /**
     * Gets the hostname property: FQDN of the SignalR service instance. Format: xxx.service.signalr.net.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the publicPort property: The publicly accessible port of the SignalR service which is designed for
     * browser/client side usage.
     *
     * @return the publicPort value.
     */
    Integer publicPort();

    /**
     * Gets the serverPort property: The publicly accessible port of the SignalR service which is designed for customer
     * server side usage.
     *
     * @return the serverPort value.
     */
    Integer serverPort();

    /**
     * Gets the version property: Version of the SignalR resource. Probably you need the same or higher version of
     * client SDKs.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the privateEndpointConnections property: Private endpoint connections to the SignalR resource.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the tls property: TLS settings.
     *
     * @return the tls value.
     */
    SignalRTlsSettings tls();

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
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner object.
     *
     * @return the inner object.
     */
    SignalRResourceInner innerModel();

    /** The entirety of the SignalRResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The SignalRResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the SignalRResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SignalRResource definition allowing to specify location. */
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
        /** The stage of the SignalRResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the SignalRResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithKind,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithFeatures,
                DefinitionStages.WithCors,
                DefinitionStages.WithUpstream,
                DefinitionStages.WithNetworkACLs,
                DefinitionStages.WithTls {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SignalRResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SignalRResource create(Context context);
        }
        /** The stage of the SignalRResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SignalRResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The billing information of the resource.(e.g. Free, Standard).
             *
             * @param sku The billing information of the resource.(e.g. Free, Standard).
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceSku sku);
        }
        /** The stage of the SignalRResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the service - e.g. "SignalR", or "RawWebSockets" for
             * "Microsoft.SignalRService/SignalR".
             *
             * @param kind The kind of the service - e.g. "SignalR", or "RawWebSockets" for
             *     "Microsoft.SignalRService/SignalR".
             * @return the next definition stage.
             */
            WithCreate withKind(ServiceKind kind);
        }
        /** The stage of the SignalRResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed identity response.
             *
             * @param identity The managed identity response.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedIdentity identity);
        }
        /** The stage of the SignalRResource definition allowing to specify features. */
        interface WithFeatures {
            /**
             * Specifies the features property: List of SignalR featureFlags. e.g. ServiceMode.
             *
             * <p>FeatureFlags that are not included in the parameters for the update operation will not be modified.
             * And the response will only include featureFlags that are explicitly set. When a featureFlag is not
             * explicitly set, SignalR service will use its globally default value. But keep in mind, the default value
             * doesn't mean "false". It varies in terms of different FeatureFlags..
             *
             * @param features List of SignalR featureFlags. e.g. ServiceMode.
             *     <p>FeatureFlags that are not included in the parameters for the update operation will not be
             *     modified. And the response will only include featureFlags that are explicitly set. When a featureFlag
             *     is not explicitly set, SignalR service will use its globally default value. But keep in mind, the
             *     default value doesn't mean "false". It varies in terms of different FeatureFlags.
             * @return the next definition stage.
             */
            WithCreate withFeatures(List<SignalRFeature> features);
        }
        /** The stage of the SignalRResource definition allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: Cross-Origin Resource Sharing (CORS) settings..
             *
             * @param cors Cross-Origin Resource Sharing (CORS) settings.
             * @return the next definition stage.
             */
            WithCreate withCors(SignalRCorsSettings cors);
        }
        /** The stage of the SignalRResource definition allowing to specify upstream. */
        interface WithUpstream {
            /**
             * Specifies the upstream property: Upstream settings when the Azure SignalR is in server-less mode..
             *
             * @param upstream Upstream settings when the Azure SignalR is in server-less mode.
             * @return the next definition stage.
             */
            WithCreate withUpstream(ServerlessUpstreamSettings upstream);
        }
        /** The stage of the SignalRResource definition allowing to specify networkACLs. */
        interface WithNetworkACLs {
            /**
             * Specifies the networkACLs property: Network ACLs.
             *
             * @param networkACLs Network ACLs.
             * @return the next definition stage.
             */
            WithCreate withNetworkACLs(SignalRNetworkACLs networkACLs);
        }
        /** The stage of the SignalRResource definition allowing to specify tls. */
        interface WithTls {
            /**
             * Specifies the tls property: TLS settings..
             *
             * @param tls TLS settings.
             * @return the next definition stage.
             */
            WithCreate withTls(SignalRTlsSettings tls);
        }
    }
    /**
     * Begins update for the SignalRResource resource.
     *
     * @return the stage of resource update.
     */
    SignalRResource.Update update();

    /** The template for SignalRResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithFeatures,
            UpdateStages.WithCors,
            UpdateStages.WithUpstream,
            UpdateStages.WithNetworkACLs,
            UpdateStages.WithTls {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SignalRResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SignalRResource apply(Context context);
    }
    /** The SignalRResource update stages. */
    interface UpdateStages {
        /** The stage of the SignalRResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the SignalRResource update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The billing information of the resource.(e.g. Free, Standard).
             *
             * @param sku The billing information of the resource.(e.g. Free, Standard).
             * @return the next definition stage.
             */
            Update withSku(ResourceSku sku);
        }
        /** The stage of the SignalRResource update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed identity response.
             *
             * @param identity The managed identity response.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedIdentity identity);
        }
        /** The stage of the SignalRResource update allowing to specify features. */
        interface WithFeatures {
            /**
             * Specifies the features property: List of SignalR featureFlags. e.g. ServiceMode.
             *
             * <p>FeatureFlags that are not included in the parameters for the update operation will not be modified.
             * And the response will only include featureFlags that are explicitly set. When a featureFlag is not
             * explicitly set, SignalR service will use its globally default value. But keep in mind, the default value
             * doesn't mean "false". It varies in terms of different FeatureFlags..
             *
             * @param features List of SignalR featureFlags. e.g. ServiceMode.
             *     <p>FeatureFlags that are not included in the parameters for the update operation will not be
             *     modified. And the response will only include featureFlags that are explicitly set. When a featureFlag
             *     is not explicitly set, SignalR service will use its globally default value. But keep in mind, the
             *     default value doesn't mean "false". It varies in terms of different FeatureFlags.
             * @return the next definition stage.
             */
            Update withFeatures(List<SignalRFeature> features);
        }
        /** The stage of the SignalRResource update allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: Cross-Origin Resource Sharing (CORS) settings..
             *
             * @param cors Cross-Origin Resource Sharing (CORS) settings.
             * @return the next definition stage.
             */
            Update withCors(SignalRCorsSettings cors);
        }
        /** The stage of the SignalRResource update allowing to specify upstream. */
        interface WithUpstream {
            /**
             * Specifies the upstream property: Upstream settings when the Azure SignalR is in server-less mode..
             *
             * @param upstream Upstream settings when the Azure SignalR is in server-less mode.
             * @return the next definition stage.
             */
            Update withUpstream(ServerlessUpstreamSettings upstream);
        }
        /** The stage of the SignalRResource update allowing to specify networkACLs. */
        interface WithNetworkACLs {
            /**
             * Specifies the networkACLs property: Network ACLs.
             *
             * @param networkACLs Network ACLs.
             * @return the next definition stage.
             */
            Update withNetworkACLs(SignalRNetworkACLs networkACLs);
        }
        /** The stage of the SignalRResource update allowing to specify tls. */
        interface WithTls {
            /**
             * Specifies the tls property: TLS settings..
             *
             * @param tls TLS settings.
             * @return the next definition stage.
             */
            Update withTls(SignalRTlsSettings tls);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SignalRResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SignalRResource refresh(Context context);
}
