/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input definition for test failover cleanup input properties.
 */
public class TestFailoverCleanupInputProperties {
    /**
     * Test failover cleanup comments.
     */
    @JsonProperty(value = "comments")
    private String comments;

    /**
     * Get test failover cleanup comments.
     *
     * @return the comments value
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set test failover cleanup comments.
     *
     * @param comments the comments value to set
     * @return the TestFailoverCleanupInputProperties object itself.
     */
    public TestFailoverCleanupInputProperties withComments(String comments) {
        this.comments = comments;
        return this;
    }

}
