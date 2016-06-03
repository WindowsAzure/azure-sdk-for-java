/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for the Job_Get operation.
 */
public class JobGetOptions {
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
    private String clientRequestId;

    /**
     * Whether the server should return the client-request-id identifier in
     * the response.
     */
    @JsonProperty(value = "")
    private Boolean returnClientRequestId;

    /**
     * The time the request was issued. If not specified, this header will be
     * automatically populated with the current system clock time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ocpDate;

    /**
     * Get the select value.
     *
     * @return the select value
     */
    public String select() {
        return this.select;
    }

    /**
     * Set the select value.
     *
     * @param select the select value to set
     * @return the JobGetOptions object itself.
     */
    public JobGetOptions withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get the expand value.
     *
     * @return the expand value
     */
    public String expand() {
        return this.expand;
    }

    /**
     * Set the expand value.
     *
     * @param expand the expand value to set
     * @return the JobGetOptions object itself.
     */
    public JobGetOptions withExpand(String expand) {
        this.expand = expand;
        return this;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     * @return the JobGetOptions object itself.
     */
    public JobGetOptions withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the clientRequestId value.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId value.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the JobGetOptions object itself.
     */
    public JobGetOptions withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the returnClientRequestId value.
     *
     * @return the returnClientRequestId value
     */
    public Boolean returnClientRequestId() {
        return this.returnClientRequestId;
    }

    /**
     * Set the returnClientRequestId value.
     *
     * @param returnClientRequestId the returnClientRequestId value to set
     * @return the JobGetOptions object itself.
     */
    public JobGetOptions withReturnClientRequestId(Boolean returnClientRequestId) {
        this.returnClientRequestId = returnClientRequestId;
        return this;
    }

    /**
     * Get the ocpDate value.
     *
     * @return the ocpDate value
     */
    public DateTime ocpDate() {
        if (this.ocpDate == null) {
            return null;
        }
        return this.ocpDate.getDateTime();
    }

    /**
     * Set the ocpDate value.
     *
     * @param ocpDate the ocpDate value to set
     * @return the JobGetOptions object itself.
     */
    public JobGetOptions withOcpDate(DateTime ocpDate) {
        this.ocpDate = new DateTimeRfc1123(ocpDate);
        return this;
    }

}
