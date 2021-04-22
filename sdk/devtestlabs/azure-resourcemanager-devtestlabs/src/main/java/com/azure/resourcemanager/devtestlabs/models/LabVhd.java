// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.resourcemanager.devtestlabs.fluent.models.LabVhdInner;

/** An immutable client-side representation of LabVhd. */
public interface LabVhd {
    /**
     * Gets the id property: The URI to the VHD.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.LabVhdInner object.
     *
     * @return the inner object.
     */
    LabVhdInner innerModel();
}