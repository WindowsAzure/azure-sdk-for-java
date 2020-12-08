// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.RestorableDroppedManagedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.RestorableDroppedManagedDatabase;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class RestorableDroppedManagedDatabaseImpl implements RestorableDroppedManagedDatabase {
    private RestorableDroppedManagedDatabaseInner innerObject;

    private final SqlManager serviceManager;

    public RestorableDroppedManagedDatabaseImpl(
        RestorableDroppedManagedDatabaseInner innerObject, SqlManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public OffsetDateTime deletionDate() {
        return this.innerModel().deletionDate();
    }

    public OffsetDateTime earliestRestoreDate() {
        return this.innerModel().earliestRestoreDate();
    }

    public RestorableDroppedManagedDatabaseInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
