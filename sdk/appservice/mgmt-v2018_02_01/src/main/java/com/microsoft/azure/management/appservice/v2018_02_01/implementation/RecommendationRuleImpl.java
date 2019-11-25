/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.RecommendationRule;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.Channels;
import com.microsoft.azure.management.appservice.v2018_02_01.NotificationLevel;
import java.util.UUID;

class RecommendationRuleImpl extends WrapperImpl<RecommendationRuleInner> implements RecommendationRule {
    private final AppServiceManager manager;
    RecommendationRuleImpl(RecommendationRuleInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String actionName() {
        return this.inner().actionName();
    }

    @Override
    public String bladeName() {
        return this.inner().bladeName();
    }

    @Override
    public List<String> categoryTags() {
        return this.inner().categoryTags();
    }

    @Override
    public Channels channels() {
        return this.inner().channels();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String extensionName() {
        return this.inner().extensionName();
    }

    @Override
    public String forwardLink() {
        return this.inner().forwardLink();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isDynamic() {
        return this.inner().isDynamic();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public NotificationLevel level() {
        return this.inner().level();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public UUID recommendationId() {
        return this.inner().recommendationId();
    }

    @Override
    public String recommendationName() {
        return this.inner().recommendationName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
