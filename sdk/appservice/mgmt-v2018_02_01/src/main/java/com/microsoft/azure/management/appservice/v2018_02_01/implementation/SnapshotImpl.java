/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.Snapshot;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class SnapshotImpl extends WrapperImpl<SnapshotInner> implements Snapshot {
    private final CertificateRegistrationManager manager;

    SnapshotImpl(SnapshotInner inner,  CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public String time() {
        return this.inner().time();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
