// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractInner;

/** An immutable client-side representation of GatewayHostnameConfigurationContract. */
public interface GatewayHostnameConfigurationContract {
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
     * Gets the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the certificateId property: Identifier of Certificate entity that will be used for TLS connection
     * establishment.
     *
     * @return the certificateId value.
     */
    String certificateId();

    /**
     * Gets the negotiateClientCertificate property: Determines whether gateway requests client certificate.
     *
     * @return the negotiateClientCertificate value.
     */
    Boolean negotiateClientCertificate();

    /**
     * Gets the tls10Enabled property: Specifies if TLS 1.0 is supported.
     *
     * @return the tls10Enabled value.
     */
    Boolean tls10Enabled();

    /**
     * Gets the tls11Enabled property: Specifies if TLS 1.1 is supported.
     *
     * @return the tls11Enabled value.
     */
    Boolean tls11Enabled();

    /**
     * Gets the http2Enabled property: Specifies if HTTP/2.0 is supported.
     *
     * @return the http2Enabled value.
     */
    Boolean http2Enabled();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractInner
     * object.
     *
     * @return the inner object.
     */
    GatewayHostnameConfigurationContractInner innerModel();

    /** The entirety of the GatewayHostnameConfigurationContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The GatewayHostnameConfigurationContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the GatewayHostnameConfigurationContract definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName, gatewayId.
             *
             * @param resourceGroupName The name of the resource group.
             * @param serviceName The name of the API Management service.
             * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service
             *     instance. Must not have value 'managed'.
             * @return the next definition stage.
             */
            WithCreate withExistingGateway(String resourceGroupName, String serviceName, String gatewayId);
        }
        /**
         * The stage of the GatewayHostnameConfigurationContract definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithHostname,
                DefinitionStages.WithCertificateId,
                DefinitionStages.WithNegotiateClientCertificate,
                DefinitionStages.WithTls10Enabled,
                DefinitionStages.WithTls11Enabled,
                DefinitionStages.WithHttp2Enabled,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GatewayHostnameConfigurationContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GatewayHostnameConfigurationContract create(Context context);
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify hostname. */
        interface WithHostname {
            /**
             * Specifies the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
             *
             * @param hostname Hostname value. Supports valid domain name, partial or full wildcard.
             * @return the next definition stage.
             */
            WithCreate withHostname(String hostname);
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify certificateId. */
        interface WithCertificateId {
            /**
             * Specifies the certificateId property: Identifier of Certificate entity that will be used for TLS
             * connection establishment.
             *
             * @param certificateId Identifier of Certificate entity that will be used for TLS connection establishment.
             * @return the next definition stage.
             */
            WithCreate withCertificateId(String certificateId);
        }
        /**
         * The stage of the GatewayHostnameConfigurationContract definition allowing to specify
         * negotiateClientCertificate.
         */
        interface WithNegotiateClientCertificate {
            /**
             * Specifies the negotiateClientCertificate property: Determines whether gateway requests client
             * certificate.
             *
             * @param negotiateClientCertificate Determines whether gateway requests client certificate.
             * @return the next definition stage.
             */
            WithCreate withNegotiateClientCertificate(Boolean negotiateClientCertificate);
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify tls10Enabled. */
        interface WithTls10Enabled {
            /**
             * Specifies the tls10Enabled property: Specifies if TLS 1.0 is supported.
             *
             * @param tls10Enabled Specifies if TLS 1.0 is supported.
             * @return the next definition stage.
             */
            WithCreate withTls10Enabled(Boolean tls10Enabled);
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify tls11Enabled. */
        interface WithTls11Enabled {
            /**
             * Specifies the tls11Enabled property: Specifies if TLS 1.1 is supported.
             *
             * @param tls11Enabled Specifies if TLS 1.1 is supported.
             * @return the next definition stage.
             */
            WithCreate withTls11Enabled(Boolean tls11Enabled);
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify http2Enabled. */
        interface WithHttp2Enabled {
            /**
             * Specifies the http2Enabled property: Specifies if HTTP/2.0 is supported.
             *
             * @param http2Enabled Specifies if HTTP/2.0 is supported.
             * @return the next definition stage.
             */
            WithCreate withHttp2Enabled(Boolean http2Enabled);
        }
        /** The stage of the GatewayHostnameConfigurationContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the GatewayHostnameConfigurationContract resource.
     *
     * @return the stage of resource update.
     */
    GatewayHostnameConfigurationContract.Update update();

    /** The template for GatewayHostnameConfigurationContract update. */
    interface Update
        extends UpdateStages.WithHostname,
            UpdateStages.WithCertificateId,
            UpdateStages.WithNegotiateClientCertificate,
            UpdateStages.WithTls10Enabled,
            UpdateStages.WithTls11Enabled,
            UpdateStages.WithHttp2Enabled,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GatewayHostnameConfigurationContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GatewayHostnameConfigurationContract apply(Context context);
    }
    /** The GatewayHostnameConfigurationContract update stages. */
    interface UpdateStages {
        /** The stage of the GatewayHostnameConfigurationContract update allowing to specify hostname. */
        interface WithHostname {
            /**
             * Specifies the hostname property: Hostname value. Supports valid domain name, partial or full wildcard.
             *
             * @param hostname Hostname value. Supports valid domain name, partial or full wildcard.
             * @return the next definition stage.
             */
            Update withHostname(String hostname);
        }
        /** The stage of the GatewayHostnameConfigurationContract update allowing to specify certificateId. */
        interface WithCertificateId {
            /**
             * Specifies the certificateId property: Identifier of Certificate entity that will be used for TLS
             * connection establishment.
             *
             * @param certificateId Identifier of Certificate entity that will be used for TLS connection establishment.
             * @return the next definition stage.
             */
            Update withCertificateId(String certificateId);
        }
        /**
         * The stage of the GatewayHostnameConfigurationContract update allowing to specify negotiateClientCertificate.
         */
        interface WithNegotiateClientCertificate {
            /**
             * Specifies the negotiateClientCertificate property: Determines whether gateway requests client
             * certificate.
             *
             * @param negotiateClientCertificate Determines whether gateway requests client certificate.
             * @return the next definition stage.
             */
            Update withNegotiateClientCertificate(Boolean negotiateClientCertificate);
        }
        /** The stage of the GatewayHostnameConfigurationContract update allowing to specify tls10Enabled. */
        interface WithTls10Enabled {
            /**
             * Specifies the tls10Enabled property: Specifies if TLS 1.0 is supported.
             *
             * @param tls10Enabled Specifies if TLS 1.0 is supported.
             * @return the next definition stage.
             */
            Update withTls10Enabled(Boolean tls10Enabled);
        }
        /** The stage of the GatewayHostnameConfigurationContract update allowing to specify tls11Enabled. */
        interface WithTls11Enabled {
            /**
             * Specifies the tls11Enabled property: Specifies if TLS 1.1 is supported.
             *
             * @param tls11Enabled Specifies if TLS 1.1 is supported.
             * @return the next definition stage.
             */
            Update withTls11Enabled(Boolean tls11Enabled);
        }
        /** The stage of the GatewayHostnameConfigurationContract update allowing to specify http2Enabled. */
        interface WithHttp2Enabled {
            /**
             * Specifies the http2Enabled property: Specifies if HTTP/2.0 is supported.
             *
             * @param http2Enabled Specifies if HTTP/2.0 is supported.
             * @return the next definition stage.
             */
            Update withHttp2Enabled(Boolean http2Enabled);
        }
        /** The stage of the GatewayHostnameConfigurationContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GatewayHostnameConfigurationContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GatewayHostnameConfigurationContract refresh(Context context);
}
