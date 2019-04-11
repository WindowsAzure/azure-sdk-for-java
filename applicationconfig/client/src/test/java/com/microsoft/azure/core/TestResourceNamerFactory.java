// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.core;


import com.microsoft.azure.utils.ResourceNamer;
import com.microsoft.azure.utils.ResourceNamerFactory;

public class TestResourceNamerFactory extends ResourceNamerFactory {

    private final InterceptorManager interceptorManager;

    TestResourceNamerFactory(InterceptorManager mockIntegrationTestBase) {
        this.interceptorManager = mockIntegrationTestBase;
    }
    @Override
    public ResourceNamer createResourceNamer(String name) {
        return new TestResourceNamer(name, interceptorManager);
    }
}
