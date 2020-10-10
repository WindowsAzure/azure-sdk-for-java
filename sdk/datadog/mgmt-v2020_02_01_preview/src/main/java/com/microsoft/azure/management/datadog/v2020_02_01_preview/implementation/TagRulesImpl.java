/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.TagRules;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.MonitoringTagRules;

class TagRulesImpl extends WrapperImpl<TagRulesInner> implements TagRules {
    private final DatadogManager manager;

    TagRulesImpl(DatadogManager manager) {
        super(manager.inner().tagRules());
        this.manager = manager;
    }

    public DatadogManager manager() {
        return this.manager;
    }

    @Override
    public MonitoringTagRulesImpl define(String name) {
        return wrapModel(name);
    }

    private MonitoringTagRulesImpl wrapModel(MonitoringTagRulesInner inner) {
        return  new MonitoringTagRulesImpl(inner, manager());
    }

    private MonitoringTagRulesImpl wrapModel(String name) {
        return new MonitoringTagRulesImpl(name, this.manager());
    }

    @Override
    public Observable<MonitoringTagRules> listAsync(final String resourceGroupName, final String monitorName) {
        TagRulesInner client = this.inner();
        return client.listAsync(resourceGroupName, monitorName)
        .flatMapIterable(new Func1<Page<MonitoringTagRulesInner>, Iterable<MonitoringTagRulesInner>>() {
            @Override
            public Iterable<MonitoringTagRulesInner> call(Page<MonitoringTagRulesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MonitoringTagRulesInner, MonitoringTagRules>() {
            @Override
            public MonitoringTagRules call(MonitoringTagRulesInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<MonitoringTagRules> getAsync(String resourceGroupName, String monitorName, String ruleSetName) {
        TagRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, monitorName, ruleSetName)
        .flatMap(new Func1<MonitoringTagRulesInner, Observable<MonitoringTagRules>>() {
            @Override
            public Observable<MonitoringTagRules> call(MonitoringTagRulesInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((MonitoringTagRules)wrapModel(inner));
                }
            }
       });
    }

}
