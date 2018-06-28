/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WebTest;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WebTestKind;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WebTestGeolocation;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WebTestPropertiesConfiguration;

class WebTestImpl extends GroupableResourceCoreImpl<WebTest, WebTestInner, WebTestImpl, InsightsManager> implements WebTest, WebTest.Definition, WebTest.Update {
    WebTestImpl(String name, WebTestInner inner, InsightsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<WebTest> createResourceAsync() {
        WebTestsInner client = this.manager().inner().webTests();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WebTest> updateResourceAsync() {
        WebTestsInner client = this.manager().inner().webTests();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WebTestInner> getInnerAsync() {
        WebTestsInner client = this.manager().inner().webTests();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public WebTestPropertiesConfiguration configuration() {
        return this.inner().configuration();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public Integer frequency() {
        return this.inner().frequency();
    }

    @Override
    public WebTestKind kind() {
        return this.inner().kind();
    }

    @Override
    public List<WebTestGeolocation> locations() {
        return this.inner().locations();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Boolean retryEnabled() {
        return this.inner().retryEnabled();
    }

    @Override
    public String syntheticMonitorId() {
        return this.inner().syntheticMonitorId();
    }

    @Override
    public Integer timeout() {
        return this.inner().timeout();
    }

    @Override
    public WebTestKind webTestKind() {
        return this.inner().webTestKind();
    }

    @Override
    public String webTestName() {
        return this.inner().webTestName();
    }

    @Override
    public WebTestImpl withLocations(List<WebTestGeolocation> locations) {
        this.inner().withLocations(locations);
        return this;
    }

    @Override
    public WebTestImpl withSyntheticMonitorId(String syntheticMonitorId) {
        this.inner().withSyntheticMonitorId(syntheticMonitorId);
        return this;
    }

    @Override
    public WebTestImpl withWebTestKind(WebTestKind webTestKind) {
        this.inner().withWebTestKind(webTestKind);
        return this;
    }

    @Override
    public WebTestImpl withWebTestName(String webTestName) {
        this.inner().withWebTestName(webTestName);
        return this;
    }

    @Override
    public WebTestImpl withConfiguration(WebTestPropertiesConfiguration configuration) {
        this.inner().withConfiguration(configuration);
        return this;
    }

    @Override
    public WebTestImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public WebTestImpl withEnabled(Boolean enabled) {
        this.inner().withEnabled(enabled);
        return this;
    }

    @Override
    public WebTestImpl withFrequency(Integer frequency) {
        this.inner().withFrequency(frequency);
        return this;
    }

    @Override
    public WebTestImpl withKind(WebTestKind kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public WebTestImpl withRetryEnabled(Boolean retryEnabled) {
        this.inner().withRetryEnabled(retryEnabled);
        return this;
    }

    @Override
    public WebTestImpl withTimeout(Integer timeout) {
        this.inner().withTimeout(timeout);
        return this;
    }

}
