// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.resourcemanager.devtestlabs.fluent.models.EvaluatePoliciesResponseInner;
import com.azure.resourcemanager.devtestlabs.models.EvaluatePoliciesResponse;
import com.azure.resourcemanager.devtestlabs.models.PolicySetResult;
import java.util.Collections;
import java.util.List;

public final class EvaluatePoliciesResponseImpl implements EvaluatePoliciesResponse {
    private EvaluatePoliciesResponseInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    EvaluatePoliciesResponseImpl(
        EvaluatePoliciesResponseInner innerObject,
        com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PolicySetResult> results() {
        List<PolicySetResult> inner = this.innerModel().results();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public EvaluatePoliciesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}
