// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.implementation;

import com.azure.resourcemanager.commerce.fluent.models.UsageAggregationInner;
import com.azure.resourcemanager.commerce.models.InfoField;
import com.azure.resourcemanager.commerce.models.UsageAggregation;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class UsageAggregationImpl implements UsageAggregation {
    private UsageAggregationInner innerObject;

    private final com.azure.resourcemanager.commerce.UsageManager serviceManager;

    UsageAggregationImpl(
        UsageAggregationInner innerObject, com.azure.resourcemanager.commerce.UsageManager serviceManager) {
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

    public UUID subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public String meterId() {
        return this.innerModel().meterId();
    }

    public OffsetDateTime usageStartTime() {
        return this.innerModel().usageStartTime();
    }

    public OffsetDateTime usageEndTime() {
        return this.innerModel().usageEndTime();
    }

    public Float quantity() {
        return this.innerModel().quantity();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public String meterName() {
        return this.innerModel().meterName();
    }

    public String meterCategory() {
        return this.innerModel().meterCategory();
    }

    public String meterSubCategory() {
        return this.innerModel().meterSubCategory();
    }

    public String meterRegion() {
        return this.innerModel().meterRegion();
    }

    public InfoField infoFields() {
        return this.innerModel().infoFields();
    }

    public String instanceData() {
        return this.innerModel().instanceData();
    }

    public UsageAggregationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.commerce.UsageManager manager() {
        return this.serviceManager;
    }
}
