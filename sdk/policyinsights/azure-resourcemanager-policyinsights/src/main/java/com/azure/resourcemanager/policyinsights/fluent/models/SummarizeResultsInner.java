// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.models.Summary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Summarize action results. */
@Fluent
public final class SummarizeResultsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SummarizeResultsInner.class);

    /*
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata.context")
    private String odataContext;

    /*
     * OData entity count; represents the number of summaries returned; always
     * set to 1.
     */
    @JsonProperty(value = "@odata.count")
    private Integer odataCount;

    /*
     * Summarize action results.
     */
    @JsonProperty(value = "value")
    private List<Summary> value;

    /**
     * Get the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @return the odataContext value.
     */
    public String odataContext() {
        return this.odataContext;
    }

    /**
     * Set the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @param odataContext the odataContext value to set.
     * @return the SummarizeResultsInner object itself.
     */
    public SummarizeResultsInner withOdataContext(String odataContext) {
        this.odataContext = odataContext;
        return this;
    }

    /**
     * Get the odataCount property: OData entity count; represents the number of summaries returned; always set to 1.
     *
     * @return the odataCount value.
     */
    public Integer odataCount() {
        return this.odataCount;
    }

    /**
     * Set the odataCount property: OData entity count; represents the number of summaries returned; always set to 1.
     *
     * @param odataCount the odataCount value to set.
     * @return the SummarizeResultsInner object itself.
     */
    public SummarizeResultsInner withOdataCount(Integer odataCount) {
        this.odataCount = odataCount;
        return this;
    }

    /**
     * Get the value property: Summarize action results.
     *
     * @return the value value.
     */
    public List<Summary> value() {
        return this.value;
    }

    /**
     * Set the value property: Summarize action results.
     *
     * @param value the value value to set.
     * @return the SummarizeResultsInner object itself.
     */
    public SummarizeResultsInner withValue(List<Summary> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
