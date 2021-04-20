// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentWebTestLocationInner;

/** An immutable client-side representation of ApplicationInsightsComponentWebTestLocation. */
public interface ApplicationInsightsComponentWebTestLocation {
    /**
     * Gets the displayName property: The display name of the web test location.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the tag property: Internally defined geographic location tag.
     *
     * @return the tag value.
     */
    String tag();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentWebTestLocationInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentWebTestLocationInner innerModel();
}
