// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.mysql.models.PerformanceTierProperties;
import com.azure.resourcemanager.mysql.models.PerformanceTierServiceLevelObjectives;
import java.util.Collections;
import java.util.List;

public final class PerformanceTierPropertiesImpl implements PerformanceTierProperties {
    private PerformanceTierPropertiesInner innerObject;

    private final MySqlManager serviceManager;

    PerformanceTierPropertiesImpl(PerformanceTierPropertiesInner innerObject, MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public Integer maxBackupRetentionDays() {
        return this.innerModel().maxBackupRetentionDays();
    }

    public Integer minBackupRetentionDays() {
        return this.innerModel().minBackupRetentionDays();
    }

    public Integer maxStorageMB() {
        return this.innerModel().maxStorageMB();
    }

    public Integer minLargeStorageMB() {
        return this.innerModel().minLargeStorageMB();
    }

    public Integer maxLargeStorageMB() {
        return this.innerModel().maxLargeStorageMB();
    }

    public Integer minStorageMB() {
        return this.innerModel().minStorageMB();
    }

    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        List<PerformanceTierServiceLevelObjectives> inner = this.innerModel().serviceLevelObjectives();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PerformanceTierPropertiesInner innerModel() {
        return this.innerObject;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
