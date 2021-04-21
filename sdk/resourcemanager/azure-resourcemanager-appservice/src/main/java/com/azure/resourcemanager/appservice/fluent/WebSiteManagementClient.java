// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for WebSiteManagementClient class. */
public interface WebSiteManagementClient {
    /**
     * Gets Your Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the AppServiceCertificateOrdersClient object to access its operations.
     *
     * @return the AppServiceCertificateOrdersClient object.
     */
    AppServiceCertificateOrdersClient getAppServiceCertificateOrders();

    /**
     * Gets the CertificateOrdersDiagnosticsClient object to access its operations.
     *
     * @return the CertificateOrdersDiagnosticsClient object.
     */
    CertificateOrdersDiagnosticsClient getCertificateOrdersDiagnostics();

    /**
     * Gets the CertificateRegistrationProvidersClient object to access its operations.
     *
     * @return the CertificateRegistrationProvidersClient object.
     */
    CertificateRegistrationProvidersClient getCertificateRegistrationProviders();

    /**
     * Gets the DomainsClient object to access its operations.
     *
     * @return the DomainsClient object.
     */
    DomainsClient getDomains();

    /**
     * Gets the TopLevelDomainsClient object to access its operations.
     *
     * @return the TopLevelDomainsClient object.
     */
    TopLevelDomainsClient getTopLevelDomains();

    /**
     * Gets the DomainRegistrationProvidersClient object to access its operations.
     *
     * @return the DomainRegistrationProvidersClient object.
     */
    DomainRegistrationProvidersClient getDomainRegistrationProviders();

    /**
     * Gets the CertificatesClient object to access its operations.
     *
     * @return the CertificatesClient object.
     */
    CertificatesClient getCertificates();

    /**
     * Gets the DeletedWebAppsClient object to access its operations.
     *
     * @return the DeletedWebAppsClient object.
     */
    DeletedWebAppsClient getDeletedWebApps();

    /**
     * Gets the DiagnosticsClient object to access its operations.
     *
     * @return the DiagnosticsClient object.
     */
    DiagnosticsClient getDiagnostics();

    /**
     * Gets the GlobalsClient object to access its operations.
     *
     * @return the GlobalsClient object.
     */
    GlobalsClient getGlobals();

    /**
     * Gets the ProvidersClient object to access its operations.
     *
     * @return the ProvidersClient object.
     */
    ProvidersClient getProviders();

    /**
     * Gets the RecommendationsClient object to access its operations.
     *
     * @return the RecommendationsClient object.
     */
    RecommendationsClient getRecommendations();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the WebAppsClient object to access its operations.
     *
     * @return the WebAppsClient object.
     */
    WebAppsClient getWebApps();

    /**
     * Gets the StaticSitesClient object to access its operations.
     *
     * @return the StaticSitesClient object.
     */
    StaticSitesClient getStaticSites();

    /**
     * Gets the AppServiceEnvironmentsClient object to access its operations.
     *
     * @return the AppServiceEnvironmentsClient object.
     */
    AppServiceEnvironmentsClient getAppServiceEnvironments();

    /**
     * Gets the AppServicePlansClient object to access its operations.
     *
     * @return the AppServicePlansClient object.
     */
    AppServicePlansClient getAppServicePlans();

    /**
     * Gets the ResourceHealthMetadatasClient object to access its operations.
     *
     * @return the ResourceHealthMetadatasClient object.
     */
    ResourceHealthMetadatasClient getResourceHealthMetadatas();
}
