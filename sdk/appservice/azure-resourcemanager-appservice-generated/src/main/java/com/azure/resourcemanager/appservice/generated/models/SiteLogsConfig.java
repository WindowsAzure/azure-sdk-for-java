// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteLogsConfigInner;

/** An immutable client-side representation of SiteLogsConfig. */
public interface SiteLogsConfig {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the applicationLogs property: Application logs configuration.
     *
     * @return the applicationLogs value.
     */
    ApplicationLogsConfig applicationLogs();

    /**
     * Gets the httpLogs property: HTTP logs configuration.
     *
     * @return the httpLogs value.
     */
    HttpLogsConfig httpLogs();

    /**
     * Gets the failedRequestsTracing property: Failed requests tracing configuration.
     *
     * @return the failedRequestsTracing value.
     */
    EnabledConfig failedRequestsTracing();

    /**
     * Gets the detailedErrorMessages property: Detailed error messages configuration.
     *
     * @return the detailedErrorMessages value.
     */
    EnabledConfig detailedErrorMessages();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SiteLogsConfigInner object.
     *
     * @return the inner object.
     */
    SiteLogsConfigInner innerModel();
}
