// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.fluent.models.CapabilitiesResultInner;
import com.azure.resourcemanager.hdinsight.models.CapabilitiesResult;
import com.azure.resourcemanager.hdinsight.models.QuotaCapability;
import com.azure.resourcemanager.hdinsight.models.RegionsCapability;
import com.azure.resourcemanager.hdinsight.models.VersionsCapability;
import com.azure.resourcemanager.hdinsight.models.VmSizeCompatibilityFilter;
import com.azure.resourcemanager.hdinsight.models.VmSizesCapability;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CapabilitiesResultImpl implements CapabilitiesResult {
    private CapabilitiesResultInner innerObject;

    private final com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager;

    CapabilitiesResultImpl(
        CapabilitiesResultInner innerObject, com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Map<String, VersionsCapability> versions() {
        Map<String, VersionsCapability> inner = this.innerModel().versions();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, RegionsCapability> regions() {
        Map<String, RegionsCapability> inner = this.innerModel().regions();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, VmSizesCapability> vmsizes() {
        Map<String, VmSizesCapability> inner = this.innerModel().vmsizes();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<VmSizeCompatibilityFilter> vmsizeFilters() {
        List<VmSizeCompatibilityFilter> inner = this.innerModel().vmsizeFilters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> features() {
        List<String> inner = this.innerModel().features();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public QuotaCapability quota() {
        return this.innerModel().quota();
    }

    public CapabilitiesResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.HDInsightManager manager() {
        return this.serviceManager;
    }
}
