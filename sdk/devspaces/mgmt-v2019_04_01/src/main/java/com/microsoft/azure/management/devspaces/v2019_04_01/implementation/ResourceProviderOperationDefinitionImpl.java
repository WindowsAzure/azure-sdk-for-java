/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2019_04_01.implementation;

import com.microsoft.azure.management.devspaces.v2019_04_01.ResourceProviderOperationDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devspaces.v2019_04_01.ResourceProviderOperationDisplay;

class ResourceProviderOperationDefinitionImpl extends WrapperImpl<ResourceProviderOperationDefinitionInner> implements ResourceProviderOperationDefinition {
    private final DevSpacesManager manager;
    ResourceProviderOperationDefinitionImpl(ResourceProviderOperationDefinitionInner inner, DevSpacesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevSpacesManager manager() {
        return this.manager;
    }

    @Override
    public ResourceProviderOperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
