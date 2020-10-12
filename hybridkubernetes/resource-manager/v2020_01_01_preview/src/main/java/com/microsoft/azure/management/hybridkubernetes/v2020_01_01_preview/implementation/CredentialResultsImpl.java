/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview.implementation;

import com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview.CredentialResults;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview.CredentialResult;

class CredentialResultsImpl extends WrapperImpl<CredentialResultsInner> implements CredentialResults {
    private final KubernetesManager manager;
    CredentialResultsImpl(CredentialResultsInner inner, KubernetesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KubernetesManager manager() {
        return this.manager;
    }

    @Override
    public List<CredentialResult> kubeconfigs() {
        return this.inner().kubeconfigs();
    }

}
