// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.ai.metricsadvisor.implementation.util.MetricEnrichedSeriesDataHelper;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

/**
 * Enriched time series data which includes additional service computed
 * values for the time series data points.
 */
public final class MetricEnrichedSeriesData {
    private DimensionKey seriesKey;
    private List<OffsetDateTime> timestamps;
    private List<Double> metricValues;
    private List<Boolean> isAnomaly;
    private List<Integer> periods;
    private List<Double> expectedMetricValues;
    private List<Double> lowerBoundaryValues;
    private List<Double> upperBoundaryValues;

    static {
        MetricEnrichedSeriesDataHelper
            .setAccessor(new MetricEnrichedSeriesDataHelper.MetricEnrichedSeriesDataAccessor() {
                @Override
                public void setSeriesKey(MetricEnrichedSeriesData seriesData, DimensionKey seriesKey) {
                    seriesData.setSeriesKey(seriesKey);
                }

                @Override
                public void setTimestampList(MetricEnrichedSeriesData seriesData, List<OffsetDateTime> timestampList) {
                    seriesData.setTimestampList(timestampList);
                }

                @Override
                public void setValueList(MetricEnrichedSeriesData seriesData, List<Double> valueList) {
                    seriesData.setValueList(valueList);
                }

                @Override
                public void setIsAnomalyList(MetricEnrichedSeriesData seriesData, List<Boolean> isAnomalyList) {
                    seriesData.setIsAnomalyList(isAnomalyList);
                }

                @Override
                public void setPeriodList(MetricEnrichedSeriesData seriesData, List<Integer> periodList) {
                    seriesData.setPeriodList(periodList);
                }

                @Override
                public void setExpectedValueList(MetricEnrichedSeriesData seriesData, List<Double> expectedValueList) {
                    seriesData.setExpectedValueList(expectedValueList);
                }

                @Override
                public void setLowerBoundaryList(MetricEnrichedSeriesData seriesData, List<Double> lowerBoundaryList) {
                    seriesData.setLowerBoundaryList(lowerBoundaryList);
                }

                @Override
                public void setUpperBoundaryList(MetricEnrichedSeriesData seriesData, List<Double> upperBoundaryList) {
                    seriesData.setUpperBoundaryList(upperBoundaryList);
                }
            });
    }

    /**
     * Gets the key of the time series.
     *
     * @return The time series key.
     */
    public DimensionKey getSeriesKey() {
        return seriesKey;
    }

    /**
     * Gets the timestamps of the data points in the time series.
     *
     * @return The timestamps.
     */
    public List<OffsetDateTime> getTimestamps() {
        return Collections.unmodifiableList(this.timestamps);
    }

    /**
     * Gets the values of the data points in the time series.
     *
     * @return The values.
     */
    public List<Double> getMetricValues() {
        return Collections.unmodifiableList(this.metricValues);
    }

    /**
     * Gets the anomaly status of the data points in the time series.
     *
     * @return The anomaly statuses.
     */
    public List<Boolean> isAnomalyList() {
        return Collections.unmodifiableList(this.isAnomaly);
    }

    /**
     * Gets the periods calculated for the data points in the time series.
     *
     * @return The periods.
     */
    public List<Integer> getPeriods() {
        return Collections.unmodifiableList(this.periods);
    }

    /**
     * Gets the expected values of the data points calculated by the smart detector.
     *
     * @return The expected values.
     */
    public List<Double> getExpectedMetricValues() {
        return Collections.unmodifiableList(this.expectedMetricValues);
    }

    /**
     * Gets the lower boundary values of the data points calculated by smart detector.
     *
     * @return The lower bound values.
     */
    public List<Double> getLowerBoundaryValues() {
        return Collections.unmodifiableList(this.lowerBoundaryValues);
    }

    /**
     * Gets the upper boundary values of the data points calculated by smart detector.
     *
     * @return The upper bound values.
     */
    public List<Double> getUpperBoundaryValues() {
        return Collections.unmodifiableList(this.upperBoundaryValues);
    }

    void setSeriesKey(DimensionKey seriesKey) {
        this.seriesKey = seriesKey;
    }

    void setTimestampList(List<OffsetDateTime> timestampList) {
        this.timestampList = timestampList;
    }

    void setValueList(List<Double> valueList) {
        this.valueList = valueList;
    }

    void setIsAnomalyList(List<Boolean> isAnomalyList) {
        this.isAnomalyList = isAnomalyList;
    }

    void setPeriodList(List<Integer> periodList) {
        this.periodList = periodList;
    }

    void setExpectedValueList(List<Double> expectedValueList) {
        this.expectedValueList = expectedValueList;
    }

    void setLowerBoundaryList(List<Double> lowerBoundaryList) {
        this.lowerBoundaryList = lowerBoundaryList;
    }

    void setUpperBoundaryList(List<Double> upperBoundaryList) {
        this.upperBoundaryList = upperBoundaryList;
    }
}
