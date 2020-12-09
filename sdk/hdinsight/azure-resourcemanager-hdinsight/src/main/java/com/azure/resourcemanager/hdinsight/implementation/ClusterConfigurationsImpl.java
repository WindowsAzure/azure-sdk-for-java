// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterConfigurationsInner;
import com.azure.resourcemanager.hdinsight.models.ClusterConfigurations;
import java.util.Collections;
import java.util.Map;

public final class ClusterConfigurationsImpl implements ClusterConfigurations {
    private ClusterConfigurationsInner innerObject;

    private final HDInsightManager serviceManager;

    public ClusterConfigurationsImpl(ClusterConfigurationsInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Map<String, Object> configurations() {
        Map<String, Object> inner = this.innerModel().configurations();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ClusterConfigurationsInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
