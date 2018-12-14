/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesAccount;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Sku;
import java.util.Map;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesAccountCreateParameters;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.ProvisioningState;
import rx.functions.Func1;

class CognitiveServicesAccountImpl extends GroupableResourceCoreImpl<CognitiveServicesAccount, CognitiveServicesAccountInner, CognitiveServicesAccountImpl, CognitiveServicesManager> implements CognitiveServicesAccount, CognitiveServicesAccount.Definition, CognitiveServicesAccount.Update {
    private Sku usku;
    private Map<String, String> utags;
    private CognitiveServicesAccountCreateParameters createParameter;
    CognitiveServicesAccountImpl(String name, CognitiveServicesAccountInner inner, CognitiveServicesManager manager) {
        super(name, inner, manager);
        this.usku = new Sku();
        this.createParameter = new CognitiveServicesAccountCreateParameters();
    }

    @Override
    public Observable<CognitiveServicesAccount> createResourceAsync() {
        AccountsInner client = this.manager().inner().accounts();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccountInner>() {
               @Override
               public CognitiveServicesAccountInner call(CognitiveServicesAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CognitiveServicesAccount> updateResourceAsync() {
        AccountsInner client = this.manager().inner().accounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.usku, this.utags)
            .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccountInner>() {
               @Override
               public CognitiveServicesAccountInner call(CognitiveServicesAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CognitiveServicesAccountInner> getInnerAsync() {
        AccountsInner client = this.manager().inner().accounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.usku = new Sku();
        this.createParameter = new CognitiveServicesAccountCreateParameters();
    }

    @Override
    public String endpoint() {
        return this.inner().endpoint();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String internalId() {
        return this.inner().internalId();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public CognitiveServicesAccountImpl withKind(String kind) {
        this.createParameter.withKind(kind);
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withProperties(Object properties) {
        this.createParameter.withProperties(properties);
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withTags(Map<String, String> tags) {
        this.utags = tags;
        return this;
    }

    @Override
    public CognitiveServicesAccountImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.usku = sku;
        }
        return this;
    }

}
