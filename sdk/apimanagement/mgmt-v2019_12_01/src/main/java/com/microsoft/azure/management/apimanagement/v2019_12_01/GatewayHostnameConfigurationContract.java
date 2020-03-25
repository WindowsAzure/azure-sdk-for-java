/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.GatewayHostnameConfigurationContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;

/**
 * Type representing GatewayHostnameConfigurationContract.
 */
public interface GatewayHostnameConfigurationContract extends HasInner<GatewayHostnameConfigurationContractInner>, Indexable, Refreshable<GatewayHostnameConfigurationContract>, Updatable<GatewayHostnameConfigurationContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the certificateId value.
     */
    String certificateId();

    /**
     * @return the hostname value.
     */
    String hostname();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the negotiateClientCertificate value.
     */
    Boolean negotiateClientCertificate();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the GatewayHostnameConfigurationContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGateway, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of GatewayHostnameConfigurationContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a GatewayHostnameConfigurationContract definition.
         */
        interface Blank extends WithGateway {
        }

        /**
         * The stage of the gatewayhostnameconfigurationcontract definition allowing to specify Gateway.
         */
        interface WithGateway {
           /**
            * Specifies resourceGroupName, serviceName, gatewayId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
            * @return the next definition stage
            */
            WithCreate withExistingGateway(String resourceGroupName, String serviceName, String gatewayId);
        }

        /**
         * The stage of the gatewayhostnameconfigurationcontract definition allowing to specify CertificateId.
         */
        interface WithCertificateId {
            /**
             * Specifies certificateId.
             * @param certificateId Identifier of Certificate entity that will be used for TLS connection establishment
             * @return the next definition stage
             */
            WithCreate withCertificateId(String certificateId);
        }

        /**
         * The stage of the gatewayhostnameconfigurationcontract definition allowing to specify Hostname.
         */
        interface WithHostname {
            /**
             * Specifies hostname.
             * @param hostname Hostname value. Supports valid domain name, partial or full wildcard
             * @return the next definition stage
             */
            WithCreate withHostname(String hostname);
        }

        /**
         * The stage of the gatewayhostnameconfigurationcontract definition allowing to specify NegotiateClientCertificate.
         */
        interface WithNegotiateClientCertificate {
            /**
             * Specifies negotiateClientCertificate.
             * @param negotiateClientCertificate Determines whether gateway requests client certificate
             * @return the next definition stage
             */
            WithCreate withNegotiateClientCertificate(Boolean negotiateClientCertificate);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<GatewayHostnameConfigurationContract>, DefinitionStages.WithCertificateId, DefinitionStages.WithHostname, DefinitionStages.WithNegotiateClientCertificate {
        }
    }
    /**
     * The template for a GatewayHostnameConfigurationContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<GatewayHostnameConfigurationContract>, UpdateStages.WithCertificateId, UpdateStages.WithHostname, UpdateStages.WithNegotiateClientCertificate {
    }

    /**
     * Grouping of GatewayHostnameConfigurationContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the gatewayhostnameconfigurationcontract update allowing to specify CertificateId.
         */
        interface WithCertificateId {
            /**
             * Specifies certificateId.
             * @param certificateId Identifier of Certificate entity that will be used for TLS connection establishment
             * @return the next update stage
             */
            Update withCertificateId(String certificateId);
        }

        /**
         * The stage of the gatewayhostnameconfigurationcontract update allowing to specify Hostname.
         */
        interface WithHostname {
            /**
             * Specifies hostname.
             * @param hostname Hostname value. Supports valid domain name, partial or full wildcard
             * @return the next update stage
             */
            Update withHostname(String hostname);
        }

        /**
         * The stage of the gatewayhostnameconfigurationcontract update allowing to specify NegotiateClientCertificate.
         */
        interface WithNegotiateClientCertificate {
            /**
             * Specifies negotiateClientCertificate.
             * @param negotiateClientCertificate Determines whether gateway requests client certificate
             * @return the next update stage
             */
            Update withNegotiateClientCertificate(Boolean negotiateClientCertificate);
        }

    }
}
