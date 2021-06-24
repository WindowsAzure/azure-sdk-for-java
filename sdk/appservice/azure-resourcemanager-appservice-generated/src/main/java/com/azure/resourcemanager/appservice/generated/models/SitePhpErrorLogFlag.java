// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SitePhpErrorLogFlagInner;

/** An immutable client-side representation of SitePhpErrorLogFlag. */
public interface SitePhpErrorLogFlag {
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
     * Gets the localLogErrors property: Local log_errors setting.
     *
     * @return the localLogErrors value.
     */
    String localLogErrors();

    /**
     * Gets the masterLogErrors property: Master log_errors setting.
     *
     * @return the masterLogErrors value.
     */
    String masterLogErrors();

    /**
     * Gets the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     *
     * @return the localLogErrorsMaxLength value.
     */
    String localLogErrorsMaxLength();

    /**
     * Gets the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     *
     * @return the masterLogErrorsMaxLength value.
     */
    String masterLogErrorsMaxLength();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SitePhpErrorLogFlagInner object.
     *
     * @return the inner object.
     */
    SitePhpErrorLogFlagInner innerModel();
}
