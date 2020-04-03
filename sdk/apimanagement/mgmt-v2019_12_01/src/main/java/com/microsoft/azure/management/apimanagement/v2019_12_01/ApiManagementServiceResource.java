/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementServiceResourceInner;
import java.util.List;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing ApiManagementServiceResource.
 */
public interface ApiManagementServiceResource extends HasInner<ApiManagementServiceResourceInner>, HasManager<ApiManagementManager> {
    /**
     * @return the additionalLocations value.
     */
    List<AdditionalLocation> additionalLocations();

    /**
     * @return the apiVersionConstraint value.
     */
    ApiVersionConstraint apiVersionConstraint();

    /**
     * @return the certificates value.
     */
    List<CertificateConfiguration> certificates();

    /**
     * @return the createdAtUtc value.
     */
    DateTime createdAtUtc();

    /**
     * @return the customProperties value.
     */
    Map<String, String> customProperties();

    /**
     * @return the developerPortalUrl value.
     */
    String developerPortalUrl();

    /**
     * @return the disableGateway value.
     */
    Boolean disableGateway();

    /**
     * @return the enableClientCertificate value.
     */
    Boolean enableClientCertificate();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the gatewayRegionalUrl value.
     */
    String gatewayRegionalUrl();

    /**
     * @return the gatewayUrl value.
     */
    String gatewayUrl();

    /**
     * @return the hostnameConfigurations value.
     */
    List<HostnameConfiguration> hostnameConfigurations();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    ApiManagementServiceIdentity identity();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the managementApiUrl value.
     */
    String managementApiUrl();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the notificationSenderEmail value.
     */
    String notificationSenderEmail();

    /**
     * @return the portalUrl value.
     */
    String portalUrl();

    /**
     * @return the privateIPAddresses value.
     */
    List<String> privateIPAddresses();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicIPAddresses value.
     */
    List<String> publicIPAddresses();

    /**
     * @return the publisherEmail value.
     */
    String publisherEmail();

    /**
     * @return the publisherName value.
     */
    String publisherName();

    /**
     * @return the scmUrl value.
     */
    String scmUrl();

    /**
     * @return the sku value.
     */
    ApiManagementServiceSkuProperties sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetProvisioningState value.
     */
    String targetProvisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualNetworkConfiguration value.
     */
    VirtualNetworkConfiguration virtualNetworkConfiguration();

    /**
     * @return the virtualNetworkType value.
     */
    VirtualNetworkType virtualNetworkType();

}
