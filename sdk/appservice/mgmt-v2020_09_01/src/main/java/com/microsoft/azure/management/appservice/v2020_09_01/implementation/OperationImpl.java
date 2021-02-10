/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.ErrorEntity;
import java.util.UUID;
import com.microsoft.azure.management.appservice.v2020_09_01.OperationStatus;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final AppServiceManager manager;

    OperationImpl(OperationInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public List<ErrorEntity> errors() {
        return this.inner().errors();
    }

    @Override
    public DateTime expirationTime() {
        return this.inner().expirationTime();
    }

    @Override
    public UUID geoMasterOperationId() {
        return this.inner().geoMasterOperationId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime modifiedTime() {
        return this.inner().modifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperationStatus status() {
        return this.inner().status();
    }

}
