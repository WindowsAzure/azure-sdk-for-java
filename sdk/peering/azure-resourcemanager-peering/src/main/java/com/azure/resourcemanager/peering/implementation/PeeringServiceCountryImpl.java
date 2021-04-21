// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.resourcemanager.peering.fluent.models.PeeringServiceCountryInner;
import com.azure.resourcemanager.peering.models.PeeringServiceCountry;

public final class PeeringServiceCountryImpl implements PeeringServiceCountry {
    private PeeringServiceCountryInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    PeeringServiceCountryImpl(
        PeeringServiceCountryInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PeeringServiceCountryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }
}
