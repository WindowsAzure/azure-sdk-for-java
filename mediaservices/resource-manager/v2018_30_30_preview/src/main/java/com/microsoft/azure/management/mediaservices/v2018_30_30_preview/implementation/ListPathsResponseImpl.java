/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.ListPathsResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.StreamingPath;

class ListPathsResponseImpl extends WrapperImpl<ListPathsResponseInner> implements ListPathsResponse {
    private final MediaManager manager;
    ListPathsResponseImpl(ListPathsResponseInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public List<String> downloadPaths() {
        return this.inner().downloadPaths();
    }

    @Override
    public List<StreamingPath> streamingPaths() {
        return this.inner().streamingPaths();
    }

}
