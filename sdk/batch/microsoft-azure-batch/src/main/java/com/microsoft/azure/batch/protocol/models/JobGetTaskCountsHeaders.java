/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for GetTaskCounts operation.
 */
public class JobGetTaskCountsHeaders {
    /**
     * The client-request-id provided by the client during the request. This
     * will be returned only if the return-client-request-id parameter was set
     * to true.
     */
    @JsonProperty(value = "client-request-id")
    private UUID clientRequestId;

    /**
     * A unique identifier for the request that was made to the Batch service.
     * If a request is consistently failing and you have verified that the
     * request is properly formulated, you may use this value to report the
     * error to Microsoft. In your report, include the value of this request
     * ID, the approximate time that the request was made, the Batch Account
     * against which the request was made, and the region that Account resides
     * in.
     */
    @JsonProperty(value = "request-id")
    private UUID requestId;

    /**
     * Get the client-request-id provided by the client during the request. This will be returned only if the return-client-request-id parameter was set to true.
     *
     * @return the clientRequestId value
     */
    public UUID clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the client-request-id provided by the client during the request. This will be returned only if the return-client-request-id parameter was set to true.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the JobGetTaskCountsHeaders object itself.
     */
    public JobGetTaskCountsHeaders withClientRequestId(UUID clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get a unique identifier for the request that was made to the Batch service. If a request is consistently failing and you have verified that the request is properly formulated, you may use this value to report the error to Microsoft. In your report, include the value of this request ID, the approximate time that the request was made, the Batch Account against which the request was made, and the region that Account resides in.
     *
     * @return the requestId value
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Set a unique identifier for the request that was made to the Batch service. If a request is consistently failing and you have verified that the request is properly formulated, you may use this value to report the error to Microsoft. In your report, include the value of this request ID, the approximate time that the request was made, the Batch Account against which the request was made, and the region that Account resides in.
     *
     * @param requestId the requestId value to set
     * @return the JobGetTaskCountsHeaders object itself.
     */
    public JobGetTaskCountsHeaders withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

}
