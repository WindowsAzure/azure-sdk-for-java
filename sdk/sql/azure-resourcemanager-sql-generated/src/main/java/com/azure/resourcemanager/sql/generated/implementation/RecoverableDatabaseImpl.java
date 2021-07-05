// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.RecoverableDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.RecoverableDatabase;
import java.time.OffsetDateTime;

public final class RecoverableDatabaseImpl implements RecoverableDatabase {
    private RecoverableDatabaseInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    RecoverableDatabaseImpl(
        RecoverableDatabaseInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public String edition() {
        return this.innerModel().edition();
    }

    public String serviceLevelObjective() {
        return this.innerModel().serviceLevelObjective();
    }

    public String elasticPoolName() {
        return this.innerModel().elasticPoolName();
    }

    public OffsetDateTime lastAvailableBackupDate() {
        return this.innerModel().lastAvailableBackupDate();
    }

    public RecoverableDatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
