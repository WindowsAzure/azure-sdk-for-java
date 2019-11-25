/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.ApplicationStack;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.StackMajorVersion;

class ApplicationStackImpl extends WrapperImpl<ApplicationStackInner> implements ApplicationStack {
    private final AppServiceManager manager;
    ApplicationStackImpl(ApplicationStackInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String dependency() {
        return this.inner().dependency();
    }

    @Override
    public String display() {
        return this.inner().display();
    }

    @Override
    public List<ApplicationStackInner> frameworks() {
        return this.inner().frameworks();
    }

    @Override
    public List<StackMajorVersion> majorVersions() {
        return this.inner().majorVersions();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
