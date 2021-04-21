// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.implementation;

import com.azure.resourcemanager.frontdoor.fluent.models.LatencyScorecardInner;
import com.azure.resourcemanager.frontdoor.models.LatencyMetric;
import com.azure.resourcemanager.frontdoor.models.LatencyScorecard;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class LatencyScorecardImpl implements LatencyScorecard {
    private LatencyScorecardInner innerObject;

    private final com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager;

    LatencyScorecardImpl(
        LatencyScorecardInner innerObject, com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager) {
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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String endpointA() {
        return this.innerModel().endpointA();
    }

    public String endpointB() {
        return this.innerModel().endpointB();
    }

    public OffsetDateTime startDateTimeUtc() {
        return this.innerModel().startDateTimeUtc();
    }

    public OffsetDateTime endDateTimeUtc() {
        return this.innerModel().endDateTimeUtc();
    }

    public String country() {
        return this.innerModel().country();
    }

    public List<LatencyMetric> latencyMetrics() {
        List<LatencyMetric> inner = this.innerModel().latencyMetrics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LatencyScorecardInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.frontdoor.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
