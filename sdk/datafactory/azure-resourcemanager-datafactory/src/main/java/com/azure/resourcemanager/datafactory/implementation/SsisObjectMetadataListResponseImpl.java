// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.SsisObjectMetadataListResponseInner;
import com.azure.resourcemanager.datafactory.models.SsisObjectMetadata;
import com.azure.resourcemanager.datafactory.models.SsisObjectMetadataListResponse;
import java.util.Collections;
import java.util.List;

public final class SsisObjectMetadataListResponseImpl implements SsisObjectMetadataListResponse {
    private SsisObjectMetadataListResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    SsisObjectMetadataListResponseImpl(
        SsisObjectMetadataListResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SsisObjectMetadata> value() {
        List<SsisObjectMetadata> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public SsisObjectMetadataListResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
