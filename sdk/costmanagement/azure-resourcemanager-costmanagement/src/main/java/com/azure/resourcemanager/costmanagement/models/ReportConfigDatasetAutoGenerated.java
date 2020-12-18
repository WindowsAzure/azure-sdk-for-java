// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The definition of data present in the report. */
@Fluent
public final class ReportConfigDatasetAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReportConfigDatasetAutoGenerated.class);

    /*
     * The granularity of rows in the report.
     */
    @JsonProperty(value = "granularity")
    private ReportGranularityType granularity;

    /*
     * Has configuration information for the data in the report. The
     * configuration will be ignored if aggregation and grouping are provided.
     */
    @JsonProperty(value = "configuration")
    private ReportConfigDatasetConfiguration configuration;

    /*
     * Dictionary of aggregation expression to use in the report. The key of
     * each item in the dictionary is the alias for the aggregated column.
     * Report can have up to 2 aggregation clauses.
     */
    @JsonProperty(value = "aggregation")
    private Map<String, ReportConfigAggregation> aggregation;

    /*
     * Array of group by expression to use in the report. Report can have up to
     * 2 group by clauses.
     */
    @JsonProperty(value = "grouping")
    private List<ReportConfigGrouping> grouping;

    /*
     * Array of order by expression to use in the report.
     */
    @JsonProperty(value = "sorting")
    private List<ReportConfigSorting> sorting;

    /*
     * Has filter expression to use in the report.
     */
    @JsonProperty(value = "filter")
    private ReportConfigFilterAutoGenerated filter;

    /**
     * Get the granularity property: The granularity of rows in the report.
     *
     * @return the granularity value.
     */
    public ReportGranularityType granularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: The granularity of rows in the report.
     *
     * @param granularity the granularity value to set.
     * @return the ReportConfigDatasetAutoGenerated object itself.
     */
    public ReportConfigDatasetAutoGenerated withGranularity(ReportGranularityType granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the configuration property: Has configuration information for the data in the report. The configuration will
     * be ignored if aggregation and grouping are provided.
     *
     * @return the configuration value.
     */
    public ReportConfigDatasetConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Has configuration information for the data in the report. The configuration will
     * be ignored if aggregation and grouping are provided.
     *
     * @param configuration the configuration value to set.
     * @return the ReportConfigDatasetAutoGenerated object itself.
     */
    public ReportConfigDatasetAutoGenerated withConfiguration(ReportConfigDatasetConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the aggregation property: Dictionary of aggregation expression to use in the report. The key of each item in
     * the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     *
     * @return the aggregation value.
     */
    public Map<String, ReportConfigAggregation> aggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: Dictionary of aggregation expression to use in the report. The key of each item in
     * the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     *
     * @param aggregation the aggregation value to set.
     * @return the ReportConfigDatasetAutoGenerated object itself.
     */
    public ReportConfigDatasetAutoGenerated withAggregation(Map<String, ReportConfigAggregation> aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get the grouping property: Array of group by expression to use in the report. Report can have up to 2 group by
     * clauses.
     *
     * @return the grouping value.
     */
    public List<ReportConfigGrouping> grouping() {
        return this.grouping;
    }

    /**
     * Set the grouping property: Array of group by expression to use in the report. Report can have up to 2 group by
     * clauses.
     *
     * @param grouping the grouping value to set.
     * @return the ReportConfigDatasetAutoGenerated object itself.
     */
    public ReportConfigDatasetAutoGenerated withGrouping(List<ReportConfigGrouping> grouping) {
        this.grouping = grouping;
        return this;
    }

    /**
     * Get the sorting property: Array of order by expression to use in the report.
     *
     * @return the sorting value.
     */
    public List<ReportConfigSorting> sorting() {
        return this.sorting;
    }

    /**
     * Set the sorting property: Array of order by expression to use in the report.
     *
     * @param sorting the sorting value to set.
     * @return the ReportConfigDatasetAutoGenerated object itself.
     */
    public ReportConfigDatasetAutoGenerated withSorting(List<ReportConfigSorting> sorting) {
        this.sorting = sorting;
        return this;
    }

    /**
     * Get the filter property: Has filter expression to use in the report.
     *
     * @return the filter value.
     */
    public ReportConfigFilterAutoGenerated filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Has filter expression to use in the report.
     *
     * @param filter the filter value to set.
     * @return the ReportConfigDatasetAutoGenerated object itself.
     */
    public ReportConfigDatasetAutoGenerated withFilter(ReportConfigFilterAutoGenerated filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
        if (aggregation() != null) {
            aggregation()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (grouping() != null) {
            grouping().forEach(e -> e.validate());
        }
        if (sorting() != null) {
            sorting().forEach(e -> e.validate());
        }
        if (filter() != null) {
            filter().validate();
        }
    }
}
