/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicySnippetsCollection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicySnippetContract;

class PolicySnippetsCollectionImpl extends WrapperImpl<PolicySnippetsCollectionInner> implements PolicySnippetsCollection {
    private final ApiManagementManager manager;
    PolicySnippetsCollectionImpl(PolicySnippetsCollectionInner inner, ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public List<PolicySnippetContract> value() {
        return this.inner().value();
    }

}
