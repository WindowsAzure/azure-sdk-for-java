/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of nodes in the cluster. The list is paged when all of the results
 * cannot fit in a single message. The next set of results can be obtained by
 * executing the same query with the continuation token provided in this list.
 */
public class PagedNodeInfoListInner {
    /**
     * The continuation token parameter is used to obtain next set of results.
     * The continuation token is included in the response of the API when the
     * results from the system do not fit in a single response. When this value
     * is passed to the next API call, the API returns next set of results. If
     * there are no further results, then the continuation token is not
     * included in the response.
     */
    @JsonProperty(value = "ContinuationToken")
    private String continuationToken;

    /**
     * List of node information.
     */
    @JsonProperty(value = "Items")
    private List<NodeInfoInner> items;

    /**
     * Get the continuation token parameter is used to obtain next set of results. The continuation token is included in the response of the API when the results from the system do not fit in a single response. When this value is passed to the next API call, the API returns next set of results. If there are no further results, then the continuation token is not included in the response.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuation token parameter is used to obtain next set of results. The continuation token is included in the response of the API when the results from the system do not fit in a single response. When this value is passed to the next API call, the API returns next set of results. If there are no further results, then the continuation token is not included in the response.
     *
     * @param continuationToken the continuationToken value to set
     * @return the PagedNodeInfoListInner object itself.
     */
    public PagedNodeInfoListInner withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get list of node information.
     *
     * @return the items value
     */
    public List<NodeInfoInner> items() {
        return this.items;
    }

    /**
     * Set list of node information.
     *
     * @param items the items value to set
     * @return the PagedNodeInfoListInner object itself.
     */
    public PagedNodeInfoListInner withItems(List<NodeInfoInner> items) {
        this.items = items;
        return this;
    }

}
