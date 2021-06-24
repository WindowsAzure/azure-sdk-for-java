// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.AnalysisDataInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinitionInner;
import com.azure.resourcemanager.appservice.generated.models.AnalysisData;
import com.azure.resourcemanager.appservice.generated.models.DetectorDefinition;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticMetricSet;
import com.azure.resourcemanager.appservice.generated.models.NameValuePair;
import com.azure.resourcemanager.appservice.generated.models.ResponseMetadata;
import java.util.Collections;
import java.util.List;

public final class AnalysisDataImpl implements AnalysisData {
    private AnalysisDataInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    AnalysisDataImpl(
        AnalysisDataInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String source() {
        return this.innerModel().source();
    }

    public DetectorDefinition detectorDefinition() {
        DetectorDefinitionInner inner = this.innerModel().detectorDefinition();
        if (inner != null) {
            return new DetectorDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<DiagnosticMetricSet> metrics() {
        List<DiagnosticMetricSet> inner = this.innerModel().metrics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<List<NameValuePair>> data() {
        List<List<NameValuePair>> inner = this.innerModel().data();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResponseMetadata detectorMetadata() {
        return this.innerModel().detectorMetadata();
    }

    public AnalysisDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
