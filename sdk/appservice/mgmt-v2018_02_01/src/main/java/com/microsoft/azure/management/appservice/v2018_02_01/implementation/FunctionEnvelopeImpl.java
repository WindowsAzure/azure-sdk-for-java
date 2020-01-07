/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.FunctionEnvelope;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;

class FunctionEnvelopeImpl extends CreatableUpdatableImpl<FunctionEnvelope, FunctionEnvelopeInner, FunctionEnvelopeImpl> implements FunctionEnvelope, FunctionEnvelope.Definition, FunctionEnvelope.Update {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String functionName;

    FunctionEnvelopeImpl(String name, CertificateRegistrationManager manager) {
        super(name, new FunctionEnvelopeInner());
        this.manager = manager;
        // Set resource name
        this.functionName = name;
        //
    }

    FunctionEnvelopeImpl(FunctionEnvelopeInner inner, CertificateRegistrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.functionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.functionName = IdParsingUtils.getValueFromIdByName(inner.id(), "functions");
        //
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FunctionEnvelope> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createFunctionAsync(this.resourceGroupName, this.name, this.functionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FunctionEnvelope> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createFunctionAsync(this.resourceGroupName, this.name, this.functionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FunctionEnvelopeInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getFunctionAsync(this.resourceGroupName, this.name, this.functionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Object config() {
        return this.inner().config();
    }

    @Override
    public String configHref() {
        return this.inner().configHref();
    }

    @Override
    public Map<String, String> files() {
        return this.inner().files();
    }

    @Override
    public String functionAppId() {
        return this.inner().functionAppId();
    }

    @Override
    public String href() {
        return this.inner().href();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invokeUrlTemplate() {
        return this.inner().invokeUrlTemplate();
    }

    @Override
    public Boolean isDisabled() {
        return this.inner().isDisabled();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String language() {
        return this.inner().language();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String scriptHref() {
        return this.inner().scriptHref();
    }

    @Override
    public String scriptRootPathHref() {
        return this.inner().scriptRootPathHref();
    }

    @Override
    public String secretsFileHref() {
        return this.inner().secretsFileHref();
    }

    @Override
    public String testData() {
        return this.inner().testData();
    }

    @Override
    public String testDataHref() {
        return this.inner().testDataHref();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FunctionEnvelopeImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withConfig(Object config) {
        this.inner().withConfig(config);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withConfigHref(String configHref) {
        this.inner().withConfigHref(configHref);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withFiles(Map<String, String> files) {
        this.inner().withFiles(files);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withFunctionAppId(String functionAppId) {
        this.inner().withFunctionAppId(functionAppId);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withHref(String href) {
        this.inner().withHref(href);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withInvokeUrlTemplate(String invokeUrlTemplate) {
        this.inner().withInvokeUrlTemplate(invokeUrlTemplate);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withIsDisabled(Boolean isDisabled) {
        this.inner().withIsDisabled(isDisabled);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withLanguage(String language) {
        this.inner().withLanguage(language);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withScriptHref(String scriptHref) {
        this.inner().withScriptHref(scriptHref);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withScriptRootPathHref(String scriptRootPathHref) {
        this.inner().withScriptRootPathHref(scriptRootPathHref);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withSecretsFileHref(String secretsFileHref) {
        this.inner().withSecretsFileHref(secretsFileHref);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withTestData(String testData) {
        this.inner().withTestData(testData);
        return this;
    }

    @Override
    public FunctionEnvelopeImpl withTestDataHref(String testDataHref) {
        this.inner().withTestDataHref(testDataHref);
        return this;
    }

}
