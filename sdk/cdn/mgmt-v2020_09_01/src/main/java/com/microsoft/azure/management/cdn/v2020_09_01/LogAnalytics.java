/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import rx.Observable;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing LogAnalytics.
 */
public interface LogAnalytics {
    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics the List&lt;String&gt; value
     * @param dateTimeBegin the DateTime value
     * @param dateTimeEnd the DateTime value
     * @param granularity Possible values include: 'PT5M', 'PT1H', 'P1D'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MetricsResponse> getLogAnalyticsMetricsAsync(String resourceGroupName, String profileName, List<String> metrics, DateTime dateTimeBegin, DateTime dateTimeEnd, String granularity);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings the List&lt;String&gt; value
     * @param metrics the List&lt;String&gt; value
     * @param maxRanking the double value
     * @param dateTimeBegin the DateTime value
     * @param dateTimeEnd the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RankingsResponse> getLogAnalyticsRankingsAsync(String resourceGroupName, String profileName, List<String> rankings, List<String> metrics, double maxRanking, DateTime dateTimeBegin, DateTime dateTimeEnd);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContinentsResponse> getLogAnalyticsLocationsAsync(String resourceGroupName, String profileName);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourcesResponse> getLogAnalyticsResourcesAsync(String resourceGroupName, String profileName);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics the List&lt;String&gt; value
     * @param dateTimeBegin the DateTime value
     * @param dateTimeEnd the DateTime value
     * @param granularity Possible values include: 'PT5M', 'PT1H', 'P1D'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WafMetricsResponse> getWafLogAnalyticsMetricsAsync(String resourceGroupName, String profileName, List<String> metrics, DateTime dateTimeBegin, DateTime dateTimeEnd, String granularity);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics the List&lt;String&gt; value
     * @param dateTimeBegin the DateTime value
     * @param dateTimeEnd the DateTime value
     * @param maxRanking the double value
     * @param rankings the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WafRankingsResponse> getWafLogAnalyticsRankingsAsync(String resourceGroupName, String profileName, List<String> metrics, DateTime dateTimeBegin, DateTime dateTimeEnd, double maxRanking, List<String> rankings);

}
