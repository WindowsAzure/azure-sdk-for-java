/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.ApplicationStackResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.ApplicationStack;
import com.microsoft.azure.management.appservice.v2019_08_01.StackMajorVersion;

class ApplicationStackResourceImpl extends WrapperImpl<ApplicationStackResourceInner> implements ApplicationStackResource {
    private final CertificateRegistrationManager manager;
    ApplicationStackResourceImpl(ApplicationStackResourceInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String applicationStackResourceName() {
        return this.inner().applicationStackResourceName();
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
    public List<ApplicationStack> frameworks() {
        return this.inner().frameworks();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public List<StackMajorVersion> majorVersions() {
        return this.inner().majorVersions();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
