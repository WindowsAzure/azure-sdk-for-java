// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountBasicInner;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccountBasic;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccountState;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccountStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class DataLakeAnalyticsAccountBasicImpl implements DataLakeAnalyticsAccountBasic {
    private DataLakeAnalyticsAccountBasicInner innerObject;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    DataLakeAnalyticsAccountBasicImpl(
        DataLakeAnalyticsAccountBasicInner innerObject,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
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

    public DataLakeAnalyticsAccountStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DataLakeAnalyticsAccountState state() {
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

    public DataLakeAnalyticsAccountBasicInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}
