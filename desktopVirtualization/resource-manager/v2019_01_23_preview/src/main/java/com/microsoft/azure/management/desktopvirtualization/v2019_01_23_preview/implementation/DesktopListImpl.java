/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.DesktopList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class DesktopListImpl extends WrapperImpl<DesktopListInner> implements DesktopList {
    private final DesktopVirtualizationManager manager;
    DesktopListImpl(DesktopListInner inner, DesktopVirtualizationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<DesktopInner> value() {
        return this.inner().value();
    }

}
