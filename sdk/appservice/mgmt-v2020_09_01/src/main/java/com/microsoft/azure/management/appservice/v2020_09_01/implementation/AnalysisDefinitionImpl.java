/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.AnalysisDefinition;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;

class AnalysisDefinitionImpl extends IndexableRefreshableWrapperImpl<AnalysisDefinition, AnalysisDefinitionInner> implements AnalysisDefinition {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String siteName;
    private String diagnosticCategory;
    private String analysisName;

    AnalysisDefinitionImpl(AnalysisDefinitionInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.siteName = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.diagnosticCategory = IdParsingUtils.getValueFromIdByName(inner.id(), "diagnostics");
        this.analysisName = IdParsingUtils.getValueFromIdByName(inner.id(), "analyses");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<AnalysisDefinitionInner> getInnerAsync() {
        DiagnosticsInner client = this.manager().inner().diagnostics();
        return client.getSiteAnalysisAsync(this.resourceGroupName, this.siteName, this.diagnosticCategory, this.analysisName);
    }



    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
