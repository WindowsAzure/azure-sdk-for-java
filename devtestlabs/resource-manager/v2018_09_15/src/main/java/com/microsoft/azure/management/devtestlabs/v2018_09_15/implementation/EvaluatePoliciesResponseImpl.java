/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2018_09_15.EvaluatePoliciesResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.PolicySetResult;

class EvaluatePoliciesResponseImpl extends WrapperImpl<EvaluatePoliciesResponseInner> implements EvaluatePoliciesResponse {
    private final DevTestLabsManager manager;
    EvaluatePoliciesResponseImpl(EvaluatePoliciesResponseInner inner, DevTestLabsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public List<PolicySetResult> results() {
        return this.inner().results();
    }

}
