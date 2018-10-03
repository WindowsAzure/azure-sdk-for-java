/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.Webhook;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.WebhookUpdateParameters;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.WebhookCreateParameters;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.WebhookAction;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.WebhookStatus;
import rx.functions.Func1;

class WebhookImpl extends CreatableUpdatableImpl<Webhook, WebhookInner, WebhookImpl> implements Webhook, Webhook.Definition, Webhook.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String webhookName;
    private WebhookCreateParameters createParameter;
    private WebhookUpdateParameters updateParameter;

    WebhookImpl(String name, ContainerRegistryManager manager) {
        super(name, new WebhookInner());
        this.manager = manager;
        // Set resource name
        this.webhookName = name;
        //
        this.createParameter = new WebhookCreateParameters();
        this.updateParameter = new WebhookUpdateParameters();
    }

    WebhookImpl(WebhookInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.webhookName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.webhookName = IdParsingUtils.getValueFromIdByName(inner.id(), "webhooks");
        //
        this.createParameter = new WebhookCreateParameters();
        this.updateParameter = new WebhookUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Webhook> createResourceAsync() {
        WebhooksInner client = this.manager().inner().webhooks();
        return client.createAsync(this.resourceGroupName, this.registryName, this.webhookName, this.createParameter)
            .map(new Func1<WebhookInner, WebhookInner>() {
               @Override
               public WebhookInner call(WebhookInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Webhook> updateResourceAsync() {
        WebhooksInner client = this.manager().inner().webhooks();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.webhookName, this.updateParameter)
            .map(new Func1<WebhookInner, WebhookInner>() {
               @Override
               public WebhookInner call(WebhookInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WebhookInner> getInnerAsync() {
        WebhooksInner client = this.manager().inner().webhooks();
        return client.getAsync(this.resourceGroupName, this.registryName, this.webhookName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new WebhookCreateParameters();
        this.updateParameter = new WebhookUpdateParameters();
    }

    @Override
    public List<WebhookAction> actions() {
        return this.inner().actions();
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public WebhookStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public WebhookImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public WebhookImpl withLocation(String location) {
        this.createParameter.withLocation(location);
        return this;
    }

    @Override
    public WebhookImpl withActions(List<WebhookAction> actions) {
        if (isInCreateMode()) {
            this.createParameter.withActions(actions);
        } else {
            this.updateParameter.withActions(actions);
        }
        return this;
    }

    @Override
    public WebhookImpl withServiceUri(String serviceUri) {
        if (isInCreateMode()) {
            this.createParameter.withServiceUri(serviceUri);
        } else {
            this.updateParameter.withServiceUri(serviceUri);
        }
        return this;
    }

    @Override
    public WebhookImpl withCustomHeaders(Map<String, String> customHeaders) {
        if (isInCreateMode()) {
            this.createParameter.withCustomHeaders(customHeaders);
        } else {
            this.updateParameter.withCustomHeaders(customHeaders);
        }
        return this;
    }

    @Override
    public WebhookImpl withScope(String scope) {
        if (isInCreateMode()) {
            this.createParameter.withScope(scope);
        } else {
            this.updateParameter.withScope(scope);
        }
        return this;
    }

    @Override
    public WebhookImpl withStatus(WebhookStatus status) {
        if (isInCreateMode()) {
            this.createParameter.withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public WebhookImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameter.withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
