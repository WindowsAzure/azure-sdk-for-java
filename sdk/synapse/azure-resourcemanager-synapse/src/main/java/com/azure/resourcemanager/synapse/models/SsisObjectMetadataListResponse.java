// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.SsisObjectMetadataListResponseInner;
import java.util.List;

/** An immutable client-side representation of SsisObjectMetadataListResponse. */
public interface SsisObjectMetadataListResponse {
    /**
     * Gets the value property: List of SSIS object metadata.
     *
     * @return the value value.
     */
    List<SsisObjectMetadata> value();

    /**
     * Gets the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.SsisObjectMetadataListResponseInner object.
     *
     * @return the inner object.
     */
    SsisObjectMetadataListResponseInner innerModel();
}
