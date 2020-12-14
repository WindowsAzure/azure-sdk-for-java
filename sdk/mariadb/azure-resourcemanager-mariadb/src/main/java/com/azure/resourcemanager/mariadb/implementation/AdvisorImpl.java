// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.fluent.models.AdvisorInner;
import com.azure.resourcemanager.mariadb.models.Advisor;

public final class AdvisorImpl implements Advisor {
    private AdvisorInner innerObject;

    private final MariaDBManager serviceManager;

    public AdvisorImpl(AdvisorInner innerObject, MariaDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public AdvisorInner innerModel() {
        return this.innerObject;
    }

    private MariaDBManager manager() {
        return this.serviceManager;
    }
}
