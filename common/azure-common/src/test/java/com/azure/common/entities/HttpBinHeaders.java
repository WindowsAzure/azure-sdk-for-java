/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.common.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.common.implementation.DateTimeRfc1123;

/**
 * Defines headers for httpbin.org operations.
 */
public class HttpBinHeaders {
    @JsonProperty(value = "Date")
    public DateTimeRfc1123 date;

    @JsonProperty(value = "Via")
    public String via;

    @JsonProperty(value = "Connection")
    public String connection;

    @JsonProperty(value = "X-Processed-Time")
    public double xProcessedTime;

    @JsonProperty(value = "Access-Control-Allow-Credentials")
    public boolean accessControlAllowCredentials;
}
