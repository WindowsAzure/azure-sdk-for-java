// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationDetailsModelInner;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetailsModel;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetailsResourceProperties;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetailsSavingsProperties;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetailsUsageProperties;
import java.util.Collections;
import java.util.Map;

public final class ReservationRecommendationDetailsModelImpl implements ReservationRecommendationDetailsModel {
    private ReservationRecommendationDetailsModelInner innerObject;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    ReservationRecommendationDetailsModelImpl(
        ReservationRecommendationDetailsModelInner innerObject,
        com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String currency() {
        return this.innerModel().currency();
    }

    public ReservationRecommendationDetailsResourceProperties resource() {
        return this.innerModel().resource();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public ReservationRecommendationDetailsSavingsProperties savings() {
        return this.innerModel().savings();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public ReservationRecommendationDetailsUsageProperties usage() {
        return this.innerModel().usage();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ReservationRecommendationDetailsModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
