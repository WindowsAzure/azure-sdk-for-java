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
 * The list of secret resources. The list is paged when all of the results
 * cannot fit in a single message. The next set of results can be obtained by
 * executing the same query with the continuation token provided in this list.
 */
public class PagedSecretResourceDescriptionListInner {
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
     * One page of the list.
     */
    @JsonProperty(value = "Items")
    private List<SecretResourceDescriptionInner> items;

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
     * @return the PagedSecretResourceDescriptionListInner object itself.
     */
    public PagedSecretResourceDescriptionListInner withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get one page of the list.
     *
     * @return the items value
     */
    public List<SecretResourceDescriptionInner> items() {
        return this.items;
    }

    /**
     * Set one page of the list.
     *
     * @param items the items value to set
     * @return the PagedSecretResourceDescriptionListInner object itself.
     */
    public PagedSecretResourceDescriptionListInner withItems(List<SecretResourceDescriptionInner> items) {
        this.items = items;
        return this;
    }

}
