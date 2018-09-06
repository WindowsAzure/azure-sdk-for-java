/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04.implementation;

import java.util.List;
import com.microsoft.azure.management.policyinsights.v2018_04_04.Summary;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summarize action results.
 */
public class SummarizeResultsInner {
    /**
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata\\.context")
    private String odatacontext;

    /**
     * OData entity count; represents the number of summaries returned; always
     * set to 1.
     */
    @JsonProperty(value = "@odata\\.count")
    private Integer odatacount;

    /**
     * Summarize action results.
     */
    @JsonProperty(value = "value")
    private List<Summary> value;

    /**
     * Get oData context string; used by OData clients to resolve type information based on metadata.
     *
     * @return the odatacontext value
     */
    public String odatacontext() {
        return this.odatacontext;
    }

    /**
     * Set oData context string; used by OData clients to resolve type information based on metadata.
     *
     * @param odatacontext the odatacontext value to set
     * @return the SummarizeResultsInner object itself.
     */
    public SummarizeResultsInner withOdatacontext(String odatacontext) {
        this.odatacontext = odatacontext;
        return this;
    }

    /**
     * Get oData entity count; represents the number of summaries returned; always set to 1.
     *
     * @return the odatacount value
     */
    public Integer odatacount() {
        return this.odatacount;
    }

    /**
     * Set oData entity count; represents the number of summaries returned; always set to 1.
     *
     * @param odatacount the odatacount value to set
     * @return the SummarizeResultsInner object itself.
     */
    public SummarizeResultsInner withOdatacount(Integer odatacount) {
        this.odatacount = odatacount;
        return this;
    }

    /**
     * Get summarize action results.
     *
     * @return the value value
     */
    public List<Summary> value() {
        return this.value;
    }

    /**
     * Set summarize action results.
     *
     * @param value the value value to set
     * @return the SummarizeResultsInner object itself.
     */
    public SummarizeResultsInner withValue(List<Summary> value) {
        this.value = value;
        return this;
    }

}
