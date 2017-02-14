/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.IndependentChildResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import com.microsoft.azure.management.appservice.DeploymentSlot;
import com.microsoft.azure.management.appservice.DeploymentSlots;
import com.microsoft.azure.management.appservice.WebApp;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

import java.util.List;

/**
 * The implementation DeploymentSlots.
 */
@LangDefinition(ContainerName = "/Microsoft.Azure.Management.AppService.Fluent")
class DeploymentSlotsImpl
        extends IndependentChildResourcesImpl<
                        DeploymentSlot,
                        DeploymentSlotImpl,
                        SiteInner,
                        WebAppsInner,
                        AppServiceManager,
                        WebApp>
        implements DeploymentSlots {

    private final PagedListConverter<SiteInner, DeploymentSlot> converter;
    private final WebAppImpl parent;

    DeploymentSlotsImpl(final WebAppImpl parent) {
        super(parent.manager().inner().webApps(), parent.manager());

        this.parent = parent;
        final WebAppsInner innerCollection = this.inner();
        converter = new PagedListConverter<SiteInner, DeploymentSlot>() {
            @Override
            public DeploymentSlot typeConvert(SiteInner siteInner) {
                siteInner.withSiteConfig(innerCollection.getConfigurationSlot(siteInner.resourceGroup(), parent.name(), siteInner.name().replaceAll(".*/", "")));
                return wrapModel(siteInner).cacheAppSettingsAndConnectionStrings().toBlocking().single();
            }
        };
    }

    @Override
    protected DeploymentSlotImpl wrapModel(String name) {
        return new DeploymentSlotImpl(name, new SiteInner(), null, parent)
                .withRegion(parent.regionName())
                .withExistingResourceGroup(parent.resourceGroupName());
    }

    @Override
    protected DeploymentSlotImpl wrapModel(SiteInner inner) {
        if (inner == null) {
            return null;
        }
        return new DeploymentSlotImpl(inner.name(), inner, inner.siteConfig(), parent);
    }

    protected PagedList<DeploymentSlot> wrapList(PagedList<SiteInner> pagedList) {
        return converter.convert(pagedList);
    }

    @Override
    public DeploymentSlotImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public DeploymentSlot getByParent(String resourceGroup, String parentName, String name) {
        SiteInner siteInner = innerCollection.getSlot(resourceGroup, parentName, name);
        if (siteInner == null) {
            return null;
        }
        siteInner.withSiteConfig(innerCollection.getConfigurationSlot(resourceGroup, parentName, name));
        return wrapModel(siteInner).cacheAppSettingsAndConnectionStrings().toBlocking().single();
    }

    @Override
    public PagedList<DeploymentSlot> listByParent(String resourceGroupName, String parentName) {
        return wrapList(innerCollection.listSlots(resourceGroupName, parentName));
    }

    @Override
    public Completable deleteByParentAsync(String groupName, String parentName, String name) {
        return innerCollection.deleteSlotAsync(groupName, parentName, name).toCompletable();
    }

    @Override
    public void deleteByName(String name) {
        deleteByParent(parent.resourceGroupName(), parent.name(), name);
    }

    @Override
    public ServiceCall<Void> deleteByNameAsync(String name, ServiceCallback<Void> callback) {
        return deleteByParentAsync(parent.resourceGroupName(), parent.name(), name, callback);
    }

    @Override
    public Completable deleteByNameAsync(String name) {
        return deleteByParentAsync(parent.resourceGroupName(), parent.name(), name);
    }

    @Override
    public PagedList<DeploymentSlot> list() {
        return listByParent(parent.resourceGroupName(), parent.name());
    }

    @Override
    public Observable<DeploymentSlot> listAsync() {
        return convertPageToListAsync(innerCollection.listSlotsAsync(parent.resourceGroupName(), parent.name()))
                .flatMap(new Func1<List<SiteInner>, Observable<DeploymentSlot>>() {
                    @Override
                    public Observable<DeploymentSlot> call(List<SiteInner> siteInners) {
                        return Observable.from(siteInners).flatMap(new Func1<SiteInner, Observable<DeploymentSlot>>() {
                            @Override
                            public Observable<DeploymentSlot> call(SiteInner siteInner) {
                                siteInner.withSiteConfig(innerCollection.getConfigurationSlot(siteInner.resourceGroup(),
                                        parent.name(), siteInner.name().replaceAll(".*/", "")));
                                return wrapModel(siteInner).cacheAppSettingsAndConnectionStrings();
                            }
                        });
                    }
        });
    }

    @Override
    public DeploymentSlot getByName(String name) {
        return getByParent(parent.resourceGroupName(), parent.name(), name);
    }

    @Override
    public WebApp parent() {
        return this.parent;
    }
}