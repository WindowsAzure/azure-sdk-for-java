/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.ResourceNavigationLinksListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class ResourceNavigationLinksListResultImpl extends WrapperImpl<ResourceNavigationLinksListResultInner> implements ResourceNavigationLinksListResult {
    private final NetworkManager manager;
    ResourceNavigationLinksListResultImpl(ResourceNavigationLinksListResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<ResourceNavigationLinkInner> value() {
        return this.inner().value();
    }

}
