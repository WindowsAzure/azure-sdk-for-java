/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerRegistration;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerRegistrationUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerRegistrationProvisioningState;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerRegistrationVisibilityState;
import rx.functions.Func1;

class PartnerRegistrationImpl extends GroupableResourceCoreImpl<PartnerRegistration, PartnerRegistrationInner, PartnerRegistrationImpl, EventGridManager> implements PartnerRegistration, PartnerRegistration.Definition, PartnerRegistration.Update {
    private PartnerRegistrationUpdateParameters updateParameter;
    PartnerRegistrationImpl(String name, PartnerRegistrationInner inner, EventGridManager manager) {
        super(name, inner, manager);
        this.updateParameter = new PartnerRegistrationUpdateParameters();
    }

    @Override
    public Observable<PartnerRegistration> createResourceAsync() {
        PartnerRegistrationsInner client = this.manager().inner().partnerRegistrations();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<PartnerRegistrationInner, PartnerRegistrationInner>() {
               @Override
               public PartnerRegistrationInner call(PartnerRegistrationInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PartnerRegistration> updateResourceAsync() {
        PartnerRegistrationsInner client = this.manager().inner().partnerRegistrations();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<PartnerRegistrationInner, PartnerRegistrationInner>() {
               @Override
               public PartnerRegistrationInner call(PartnerRegistrationInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PartnerRegistrationInner> getInnerAsync() {
        PartnerRegistrationsInner client = this.manager().inner().partnerRegistrations();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new PartnerRegistrationUpdateParameters();
    }

    @Override
    public List<String> authorizedAzureSubscriptionIds() {
        return this.inner().authorizedAzureSubscriptionIds();
    }

    @Override
    public String logoUri() {
        return this.inner().logoUri();
    }

    @Override
    public String partnerName() {
        return this.inner().partnerName();
    }

    @Override
    public String partnerResourceTypeDescription() {
        return this.inner().partnerResourceTypeDescription();
    }

    @Override
    public String partnerResourceTypeDisplayName() {
        return this.inner().partnerResourceTypeDisplayName();
    }

    @Override
    public String partnerResourceTypeName() {
        return this.inner().partnerResourceTypeName();
    }

    @Override
    public PartnerRegistrationProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String setupUri() {
        return this.inner().setupUri();
    }

    @Override
    public PartnerRegistrationVisibilityState visibilityState() {
        return this.inner().visibilityState();
    }

    @Override
    public PartnerRegistrationImpl withPartnerName(String partnerName) {
        this.inner().withPartnerName(partnerName);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withPartnerResourceTypeDescription(String partnerResourceTypeDescription) {
        this.inner().withPartnerResourceTypeDescription(partnerResourceTypeDescription);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withPartnerResourceTypeDisplayName(String partnerResourceTypeDisplayName) {
        this.inner().withPartnerResourceTypeDisplayName(partnerResourceTypeDisplayName);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withPartnerResourceTypeName(String partnerResourceTypeName) {
        this.inner().withPartnerResourceTypeName(partnerResourceTypeName);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withVisibilityState(PartnerRegistrationVisibilityState visibilityState) {
        this.inner().withVisibilityState(visibilityState);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withPartnerTopicTypeDescription(String partnerTopicTypeDescription) {
        this.updateParameter.withPartnerTopicTypeDescription(partnerTopicTypeDescription);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withPartnerTopicTypeDisplayName(String partnerTopicTypeDisplayName) {
        this.updateParameter.withPartnerTopicTypeDisplayName(partnerTopicTypeDisplayName);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withPartnerTopicTypeName(String partnerTopicTypeName) {
        this.updateParameter.withPartnerTopicTypeName(partnerTopicTypeName);
        return this;
    }

    @Override
    public PartnerRegistrationImpl withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds) {
        if (isInCreateMode()) {
            this.inner().withAuthorizedAzureSubscriptionIds(authorizedAzureSubscriptionIds);
        } else {
            this.updateParameter.withAuthorizedAzureSubscriptionIds(authorizedAzureSubscriptionIds);
        }
        return this;
    }

    @Override
    public PartnerRegistrationImpl withLogoUri(String logoUri) {
        if (isInCreateMode()) {
            this.inner().withLogoUri(logoUri);
        } else {
            this.updateParameter.withLogoUri(logoUri);
        }
        return this;
    }

    @Override
    public PartnerRegistrationImpl withSetupUri(String setupUri) {
        if (isInCreateMode()) {
            this.inner().withSetupUri(setupUri);
        } else {
            this.updateParameter.withSetupUri(setupUri);
        }
        return this;
    }

}
