/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Triggers for auto-heal.
 */
public class AutoHealTriggers {
    /**
     * A rule based on total requests.
     */
    @JsonProperty(value = "requests")
    private RequestsBasedTrigger requests;

    /**
     * A rule based on private bytes.
     */
    @JsonProperty(value = "privateBytesInKB")
    private Integer privateBytesInKB;

    /**
     * A rule based on status codes.
     */
    @JsonProperty(value = "statusCodes")
    private List<StatusCodesBasedTrigger> statusCodes;

    /**
     * A rule based on request execution time.
     */
    @JsonProperty(value = "slowRequests")
    private SlowRequestsBasedTrigger slowRequests;

    /**
     * Get a rule based on total requests.
     *
     * @return the requests value
     */
    public RequestsBasedTrigger requests() {
        return this.requests;
    }

    /**
     * Set a rule based on total requests.
     *
     * @param requests the requests value to set
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withRequests(RequestsBasedTrigger requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get a rule based on private bytes.
     *
     * @return the privateBytesInKB value
     */
    public Integer privateBytesInKB() {
        return this.privateBytesInKB;
    }

    /**
     * Set a rule based on private bytes.
     *
     * @param privateBytesInKB the privateBytesInKB value to set
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withPrivateBytesInKB(Integer privateBytesInKB) {
        this.privateBytesInKB = privateBytesInKB;
        return this;
    }

    /**
     * Get a rule based on status codes.
     *
     * @return the statusCodes value
     */
    public List<StatusCodesBasedTrigger> statusCodes() {
        return this.statusCodes;
    }

    /**
     * Set a rule based on status codes.
     *
     * @param statusCodes the statusCodes value to set
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withStatusCodes(List<StatusCodesBasedTrigger> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    /**
     * Get a rule based on request execution time.
     *
     * @return the slowRequests value
     */
    public SlowRequestsBasedTrigger slowRequests() {
        return this.slowRequests;
    }

    /**
     * Set a rule based on request execution time.
     *
     * @param slowRequests the slowRequests value to set
     * @return the AutoHealTriggers object itself.
     */
    public AutoHealTriggers withSlowRequests(SlowRequestsBasedTrigger slowRequests) {
        this.slowRequests = slowRequests;
        return this;
    }

}
