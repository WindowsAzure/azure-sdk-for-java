/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation;

import com.microsoft.azure.management.advisor.v2016_07_12_preview.SuppressionContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;

class SuppressionContractImpl extends CreatableUpdatableImpl<SuppressionContract, SuppressionContractInner, SuppressionContractImpl> implements SuppressionContract, SuppressionContract.Definition, SuppressionContract.Update {
    private final AdvisorManager manager;
    private String resourceUri;
    private String recommendationId;
    private String name;

    SuppressionContractImpl(String name, AdvisorManager manager) {
        super(name, new SuppressionContractInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    SuppressionContractImpl(SuppressionContractInner inner, AdvisorManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // resource ancestor names
        this.recommendationId = IdParsingUtils.getValueFromIdByName(inner.id(), "recommendations");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "suppressions");
        this.resourceUri = IdParsingUtils.getValueFromIdByPosition(inner.id(), 0);
        //
    }

    @Override
    public AdvisorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SuppressionContract> createResourceAsync() {
        SuppressionsInner client = this.manager().inner().suppressions();
        return client.createAsync(this.resourceUri, this.recommendationId, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SuppressionContract> updateResourceAsync() {
        SuppressionsInner client = this.manager().inner().suppressions();
        return client.createAsync(this.resourceUri, this.recommendationId, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SuppressionContractInner> getInnerAsync() {
        SuppressionsInner client = this.manager().inner().suppressions();
        return client.getAsync(this.resourceUri, this.recommendationId, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String suppressionId() {
        return this.inner().suppressionId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String ttl() {
        return this.inner().ttl();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SuppressionContractImpl withExistingRecommendation(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    @Override
    public SuppressionContractImpl withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    @Override
    public SuppressionContractImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public SuppressionContractImpl withSuppressionId(String suppressionId) {
        this.inner().withSuppressionId(suppressionId);
        return this;
    }

    @Override
    public SuppressionContractImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public SuppressionContractImpl withTtl(String ttl) {
        this.inner().withTtl(ttl);
        return this;
    }

}
