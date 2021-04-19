// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.AmlUserFeatureInner;

/** An immutable client-side representation of AmlUserFeature. */
public interface AmlUserFeature {
    /**
     * Gets the id property: Specifies the feature ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the displayName property: Specifies the feature name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: Describes the feature for user experience.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.AmlUserFeatureInner object.
     *
     * @return the inner object.
     */
    AmlUserFeatureInner innerModel();
}
