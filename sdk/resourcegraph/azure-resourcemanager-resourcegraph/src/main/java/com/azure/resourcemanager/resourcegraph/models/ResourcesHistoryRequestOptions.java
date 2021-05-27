// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourcesHistoryRequestOptions model. */
@Fluent
public final class ResourcesHistoryRequestOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourcesHistoryRequestOptions.class);

    /*
     * An interval in time specifying the date and time for the inclusive start
     * and exclusive end, i.e. `[start, end)`.
     */
    @JsonProperty(value = "interval")
    private DateTimeInterval interval;

    /*
     * The $top property.
     */
    @JsonProperty(value = "$top")
    private Integer top;

    /*
     * The $skip property.
     */
    @JsonProperty(value = "$skip")
    private Integer skip;

    /*
     * The $skipToken property.
     */
    @JsonProperty(value = "$skipToken")
    private String skipToken;

    /*
     * The resultFormat property.
     */
    @JsonProperty(value = "resultFormat")
    private ResourcesHistoryRequestOptionsResultFormat resultFormat;

    /**
     * Get the interval property: An interval in time specifying the date and time for the inclusive start and exclusive
     * end, i.e. `[start, end)`.
     *
     * @return the interval value.
     */
    public DateTimeInterval interval() {
        return this.interval;
    }

    /**
     * Set the interval property: An interval in time specifying the date and time for the inclusive start and exclusive
     * end, i.e. `[start, end)`.
     *
     * @param interval the interval value to set.
     * @return the ResourcesHistoryRequestOptions object itself.
     */
    public ResourcesHistoryRequestOptions withInterval(DateTimeInterval interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the top property: The $top property.
     *
     * @return the top value.
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set the top property: The $top property.
     *
     * @param top the top value to set.
     * @return the ResourcesHistoryRequestOptions object itself.
     */
    public ResourcesHistoryRequestOptions withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the skip property: The $skip property.
     *
     * @return the skip value.
     */
    public Integer skip() {
        return this.skip;
    }

    /**
     * Set the skip property: The $skip property.
     *
     * @param skip the skip value to set.
     * @return the ResourcesHistoryRequestOptions object itself.
     */
    public ResourcesHistoryRequestOptions withSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Get the skipToken property: The $skipToken property.
     *
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: The $skipToken property.
     *
     * @param skipToken the skipToken value to set.
     * @return the ResourcesHistoryRequestOptions object itself.
     */
    public ResourcesHistoryRequestOptions withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

    /**
     * Get the resultFormat property: The resultFormat property.
     *
     * @return the resultFormat value.
     */
    public ResourcesHistoryRequestOptionsResultFormat resultFormat() {
        return this.resultFormat;
    }

    /**
     * Set the resultFormat property: The resultFormat property.
     *
     * @param resultFormat the resultFormat value to set.
     * @return the ResourcesHistoryRequestOptions object itself.
     */
    public ResourcesHistoryRequestOptions withResultFormat(ResourcesHistoryRequestOptionsResultFormat resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (interval() != null) {
            interval().validate();
        }
    }
}
