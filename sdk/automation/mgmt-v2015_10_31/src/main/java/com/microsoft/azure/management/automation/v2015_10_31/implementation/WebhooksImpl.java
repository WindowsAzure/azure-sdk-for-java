/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.Webhooks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.automation.v2015_10_31.Webhook;

class WebhooksImpl extends WrapperImpl<WebhooksInner> implements Webhooks {
    private final AutomationManager manager;

    WebhooksImpl(AutomationManager manager) {
        super(manager.inner().webhooks());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public WebhookImpl define(String name) {
        return wrapModel(name);
    }

    private WebhookImpl wrapModel(WebhookInner inner) {
        return  new WebhookImpl(inner, manager());
    }

    private WebhookImpl wrapModel(String name) {
        return new WebhookImpl(name, this.manager());
    }

    @Override
    public Completable generateUriAsync(String resourceGroupName, String automationAccountName) {
        WebhooksInner client = this.inner();
        return client.generateUriAsync(resourceGroupName, automationAccountName).toCompletable();
    }

    @Override
    public Observable<Webhook> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName) {
        WebhooksInner client = this.inner();
        return client.listByAutomationAccountAsync(resourceGroupName, automationAccountName)
        .flatMapIterable(new Func1<Page<WebhookInner>, Iterable<WebhookInner>>() {
            @Override
            public Iterable<WebhookInner> call(Page<WebhookInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WebhookInner, Webhook>() {
            @Override
            public Webhook call(WebhookInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Webhook> getAsync(String resourceGroupName, String automationAccountName, String webhookName) {
        WebhooksInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, webhookName)
        .map(new Func1<WebhookInner, Webhook>() {
            @Override
            public Webhook call(WebhookInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String automationAccountName, String webhookName) {
        WebhooksInner client = this.inner();
        return client.deleteAsync(resourceGroupName, automationAccountName, webhookName).toCompletable();
    }

}
