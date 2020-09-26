/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.DiagnosticCategory;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class DiagnosticCategoryImpl extends IndexableRefreshableWrapperImpl<DiagnosticCategory, DiagnosticCategoryInner> implements DiagnosticCategory {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String siteName;
    private String diagnosticCategory;

    DiagnosticCategoryImpl(DiagnosticCategoryInner inner,  CertificateRegistrationManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.siteName = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.diagnosticCategory = IdParsingUtils.getValueFromIdByName(inner.id(), "diagnostics");
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DiagnosticCategoryInner> getInnerAsync() {
        DiagnosticsInner client = this.manager().inner().diagnostics();
        return client.getSiteDiagnosticCategoryAsync(this.resourceGroupName, this.siteName, this.diagnosticCategory);
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
    public String type() {
        return this.inner().type();
    }

}
