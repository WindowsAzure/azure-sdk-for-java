// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.UsagesListResultInner;
import com.azure.resourcemanager.hdinsight.models.Usage;
import com.azure.resourcemanager.hdinsight.models.UsagesListResult;
import java.util.Collections;
import java.util.List;

public final class UsagesListResultImpl implements UsagesListResult {
    private UsagesListResultInner innerObject;

    private final HDInsightManager serviceManager;

    UsagesListResultImpl(UsagesListResultInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Usage> value() {
        List<Usage> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UsagesListResultInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
