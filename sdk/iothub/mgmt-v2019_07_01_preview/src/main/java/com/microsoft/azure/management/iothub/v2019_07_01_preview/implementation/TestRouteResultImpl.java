/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation;

import com.microsoft.azure.management.iothub.v2019_07_01_preview.TestRouteResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.TestRouteResultDetails;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.TestResultStatus;

class TestRouteResultImpl extends WrapperImpl<TestRouteResultInner> implements TestRouteResult {
    private final IoTHubManager manager;
    TestRouteResultImpl(TestRouteResultInner inner, IoTHubManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public TestRouteResultDetails details() {
        return this.inner().details();
    }

    @Override
    public TestResultStatus result() {
        return this.inner().result();
    }

}
