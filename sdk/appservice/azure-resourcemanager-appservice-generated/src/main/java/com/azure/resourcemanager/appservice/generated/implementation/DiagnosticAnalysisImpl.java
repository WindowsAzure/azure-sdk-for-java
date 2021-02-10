// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.AnalysisDataInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinitionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticAnalysisInner;
import com.azure.resourcemanager.appservice.generated.models.AbnormalTimePeriod;
import com.azure.resourcemanager.appservice.generated.models.AnalysisData;
import com.azure.resourcemanager.appservice.generated.models.DetectorDefinition;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticAnalysis;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DiagnosticAnalysisImpl implements DiagnosticAnalysis {
    private DiagnosticAnalysisInner innerObject;

    private final WebSiteManager serviceManager;

    DiagnosticAnalysisImpl(DiagnosticAnalysisInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public List<AbnormalTimePeriod> abnormalTimePeriods() {
        List<AbnormalTimePeriod> inner = this.innerModel().abnormalTimePeriods();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AnalysisData> payload() {
        List<AnalysisDataInner> inner = this.innerModel().payload();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new AnalysisDataImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<DetectorDefinition> nonCorrelatedDetectors() {
        List<DetectorDefinitionInner> inner = this.innerModel().nonCorrelatedDetectors();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new DetectorDefinitionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public DiagnosticAnalysisInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
