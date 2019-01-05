/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.UUID;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for list operation.
 */
public class JobListOptions {
    /**
     * An OData $filter clause. For more information on constructing this
     * filter, see
     * https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-jobs.
     */
    @JsonProperty(value = "")
    private String filter;

    /**
     * An OData $select clause.
     */
    @JsonProperty(value = "")
    private String select;

    /**
     * An OData $expand clause.
     */
    @JsonProperty(value = "")
    private String expand;

    /**
     * The maximum number of items to return in the response. A maximum of 1000
     * jobs can be returned.
     */
    @JsonProperty(value = "")
    private Integer maxResults;

    /**
     * The maximum time that the server can spend processing the request, in
     * seconds. The default is 30 seconds.
     */
    @JsonProperty(value = "")
    private Integer timeout;

    /**
     * The caller-generated request identity, in the form of a GUID with no
     * decoration such as curly braces, e.g.
     * 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     */
    @JsonProperty(value = "")
    private UUID clientRequestId;

    /**
     * Whether the server should return the client-request-id in the response.
     */
    @JsonProperty(value = "")
    private Boolean returnClientRequestId;

    /**
     * The time the request was issued. Client libraries typically set this to
     * the current system clock time; set it explicitly if you are calling the
     * REST API directly.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ocpDate;

    /**
     * Get an OData $filter clause. For more information on constructing this filter, see https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-jobs.
     *
     * @return the filter value
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set an OData $filter clause. For more information on constructing this filter, see https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-jobs.
     *
     * @param filter the filter value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get an OData $select clause.
     *
     * @return the select value
     */
    public String select() {
        return this.select;
    }

    /**
     * Set an OData $select clause.
     *
     * @param select the select value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get an OData $expand clause.
     *
     * @return the expand value
     */
    public String expand() {
        return this.expand;
    }

    /**
     * Set an OData $expand clause.
     *
     * @param expand the expand value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withExpand(String expand) {
        this.expand = expand;
        return this;
    }

    /**
     * Get the maximum number of items to return in the response. A maximum of 1000 jobs can be returned.
     *
     * @return the maxResults value
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maximum number of items to return in the response. A maximum of 1000 jobs can be returned.
     *
     * @param maxResults the maxResults value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.
     *
     * @param timeout the timeout value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the caller-generated request identity, in the form of a GUID with no decoration such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @return the clientRequestId value
     */
    public UUID clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the caller-generated request identity, in the form of a GUID with no decoration such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withClientRequestId(UUID clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get whether the server should return the client-request-id in the response.
     *
     * @return the returnClientRequestId value
     */
    public Boolean returnClientRequestId() {
        return this.returnClientRequestId;
    }

    /**
     * Set whether the server should return the client-request-id in the response.
     *
     * @param returnClientRequestId the returnClientRequestId value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withReturnClientRequestId(Boolean returnClientRequestId) {
        this.returnClientRequestId = returnClientRequestId;
        return this;
    }

    /**
     * Get the time the request was issued. Client libraries typically set this to the current system clock time; set it explicitly if you are calling the REST API directly.
     *
     * @return the ocpDate value
     */
    public DateTime ocpDate() {
        if (this.ocpDate == null) {
            return null;
        }
        return this.ocpDate.dateTime();
    }

    /**
     * Set the time the request was issued. Client libraries typically set this to the current system clock time; set it explicitly if you are calling the REST API directly.
     *
     * @param ocpDate the ocpDate value to set
     * @return the JobListOptions object itself.
     */
    public JobListOptions withOcpDate(DateTime ocpDate) {
        if (ocpDate == null) {
            this.ocpDate = null;
        } else {
            this.ocpDate = new DateTimeRfc1123(ocpDate);
        }
        return this;
    }

}
