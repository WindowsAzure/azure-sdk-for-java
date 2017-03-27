/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import com.microsoft.azure.management.appservice.WebApp;
import com.microsoft.azure.management.appservice.WebApps;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

/**
 * The implementation for WebApps.
 */
@LangDefinition(ContainerName = "/Microsoft.Azure.Management.AppService.Fluent")
class WebAppsImpl
        extends GroupableResourcesImpl<
            WebApp,
            WebAppImpl,
            SiteInner,
            WebAppsInner,
            AppServiceManager>
        implements WebApps {

    private final PagedListConverter<SiteInner, WebApp> converter;

    WebAppsImpl(final AppServiceManager manager) {
        super(manager.inner().webApps(), manager);
        converter = new PagedListConverter<SiteInner, WebApp>() {
            @Override
            public WebApp typeConvert(SiteInner siteInner) {
                WebAppImpl impl = wrapModel(siteInner, manager.inner().webApps().getConfiguration(siteInner.resourceGroup(), siteInner.name()));
                return impl.cacheAppSettingsAndConnectionStrings().toBlocking().single();
            }
        };
    }

    @Override
    public PagedList<WebApp> listByGroup(String resourceGroupName) {
        return wrapList(this.inner().listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<WebApp> getByGroupAsync(final String groupName, final String name) {
        final WebAppsImpl self = this;
        return this.inner().getByResourceGroupAsync(groupName, name).flatMap(new Func1<SiteInner, Observable<WebApp>>() {
            @Override
            public Observable<WebApp> call(final SiteInner siteInner) {
                if (siteInner == null) {
                    return null;
                }
                return self.inner().getConfigurationAsync(groupName, name).flatMap(new Func1<SiteConfigResourceInner, Observable<WebApp>>() {
                    @Override
                    public Observable<WebApp> call(SiteConfigResourceInner siteConfigInner) {
                        return wrapModel(siteInner, siteConfigInner).cacheAppSettingsAndConnectionStrings();
                    }
                });
            }
        });

    }

    @Override
    protected Observable<SiteInner> getInnerAsync(String resourceGroupName, String name) {
        // Not implemented.
        return null;
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    protected WebAppImpl wrapModel(String name) {
        return new WebAppImpl(name, new SiteInner(), null, this.manager());
    }

    protected WebAppImpl wrapModel(SiteInner inner, SiteConfigResourceInner configResourceInner) {
        if (inner == null) {
            return null;
        }
        return new WebAppImpl(inner.name(), inner, configResourceInner, this.manager());
    }

    @Override
    protected WebAppImpl wrapModel(SiteInner inner) {
        return wrapModel(inner, null);
    }

    protected PagedList<WebApp> wrapList(PagedList<SiteInner> pagedList) {
        return converter.convert(pagedList);
    }


    @Override
    public WebAppImpl define(String name) {
        return wrapModel(name);
    }
}