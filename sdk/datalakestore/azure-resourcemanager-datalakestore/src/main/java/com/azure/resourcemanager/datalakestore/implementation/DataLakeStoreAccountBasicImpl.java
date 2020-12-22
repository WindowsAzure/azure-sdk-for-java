// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.resourcemanager.datalakestore.DataLakeStoreManager;
import com.azure.resourcemanager.datalakestore.fluent.models.DataLakeStoreAccountBasicInner;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountBasic;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountState;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class DataLakeStoreAccountBasicImpl implements DataLakeStoreAccountBasic {
    private DataLakeStoreAccountBasicInner innerObject;

    private final DataLakeStoreManager serviceManager;

    DataLakeStoreAccountBasicImpl(DataLakeStoreAccountBasicInner innerObject, DataLakeStoreManager serviceManager) {
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

    public UUID accountId() {
        return this.innerModel().accountId();
    }

    public DataLakeStoreAccountStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DataLakeStoreAccountState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public DataLakeStoreAccountBasicInner innerModel() {
        return this.innerObject;
    }

    private DataLakeStoreManager manager() {
        return this.serviceManager;
    }
}
