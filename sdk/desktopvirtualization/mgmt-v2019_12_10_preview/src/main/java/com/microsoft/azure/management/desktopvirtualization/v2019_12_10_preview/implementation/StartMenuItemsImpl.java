/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.StartMenuItems;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.StartMenuItem;

class StartMenuItemsImpl extends WrapperImpl<StartMenuItemsInner> implements StartMenuItems {
    private final DesktopVirtualizationManager manager;

    StartMenuItemsImpl(DesktopVirtualizationManager manager) {
        super(manager.inner().startMenuItems());
        this.manager = manager;
    }

    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    private StartMenuItemImpl wrapModel(StartMenuItemInner inner) {
        return  new StartMenuItemImpl(inner, manager());
    }

    @Override
    public Observable<StartMenuItem> listAsync(final String resourceGroupName, final String applicationGroupName) {
        StartMenuItemsInner client = this.inner();
        return client.listAsync(resourceGroupName, applicationGroupName)
        .flatMapIterable(new Func1<Page<StartMenuItemInner>, Iterable<StartMenuItemInner>>() {
            @Override
            public Iterable<StartMenuItemInner> call(Page<StartMenuItemInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StartMenuItemInner, StartMenuItem>() {
            @Override
            public StartMenuItem call(StartMenuItemInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
