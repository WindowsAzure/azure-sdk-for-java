/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the runbook property type.
 */
public class ContentHash {
    /**
     * Gets or sets the content hash algorithm used to hash the content.
     */
    @JsonProperty(value = "algorithm", required = true)
    private String algorithm;

    /**
     * Gets or sets expected hash value of the content.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get gets or sets the content hash algorithm used to hash the content.
     *
     * @return the algorithm value
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set gets or sets the content hash algorithm used to hash the content.
     *
     * @param algorithm the algorithm value to set
     * @return the ContentHash object itself.
     */
    public ContentHash withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get gets or sets expected hash value of the content.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set gets or sets expected hash value of the content.
     *
     * @param value the value value to set
     * @return the ContentHash object itself.
     */
    public ContentHash withValue(String value) {
        this.value = value;
        return this;
    }

}
