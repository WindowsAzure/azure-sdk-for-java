// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.ContinentsResponseInner;
import com.azure.resourcemanager.cdn.fluent.models.MetricsResponseInner;
import com.azure.resourcemanager.cdn.fluent.models.RankingsResponseInner;
import com.azure.resourcemanager.cdn.fluent.models.ResourcesResponseInner;
import com.azure.resourcemanager.cdn.fluent.models.WafMetricsResponseInner;
import com.azure.resourcemanager.cdn.fluent.models.WafRankingsResponseInner;
import com.azure.resourcemanager.cdn.models.LogMetric;
import com.azure.resourcemanager.cdn.models.LogMetricsGranularity;
import com.azure.resourcemanager.cdn.models.LogMetricsGroupBy;
import com.azure.resourcemanager.cdn.models.LogRanking;
import com.azure.resourcemanager.cdn.models.LogRankingMetric;
import com.azure.resourcemanager.cdn.models.WafAction;
import com.azure.resourcemanager.cdn.models.WafGranularity;
import com.azure.resourcemanager.cdn.models.WafMetric;
import com.azure.resourcemanager.cdn.models.WafRankingGroupBy;
import com.azure.resourcemanager.cdn.models.WafRankingType;
import com.azure.resourcemanager.cdn.models.WafRuleType;
import java.time.OffsetDateTime;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LogAnalyticsClient. */
public interface LogAnalyticsClient {
    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @param groupBy Array of LogMetricsGroupBy.
     * @param continents Array of Get9ItemsItem.
     * @param countryOrRegions Array of Get10ItemsItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MetricsResponseInner>> getLogAnalyticsMetricsWithResponseAsync(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols,
        List<LogMetricsGroupBy> groupBy,
        List<String> continents,
        List<String> countryOrRegions);

    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @param groupBy Array of LogMetricsGroupBy.
     * @param continents Array of Get9ItemsItem.
     * @param countryOrRegions Array of Get10ItemsItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MetricsResponseInner> getLogAnalyticsMetricsAsync(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols,
        List<LogMetricsGroupBy> groupBy,
        List<String> continents,
        List<String> countryOrRegions);

    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MetricsResponseInner> getLogAnalyticsMetricsAsync(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols);

    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetricsResponseInner getLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols);

    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @param groupBy Array of LogMetricsGroupBy.
     * @param continents Array of Get9ItemsItem.
     * @param countryOrRegions Array of Get10ItemsItem.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetricsResponseInner> getLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols,
        List<LogMetricsGroupBy> groupBy,
        List<String> continents,
        List<String> countryOrRegions,
        Context context);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param customDomains Array of String.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RankingsResponseInner>> getLogAnalyticsRankingsWithResponseAsync(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        List<String> customDomains);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param customDomains Array of String.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RankingsResponseInner> getLogAnalyticsRankingsAsync(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        List<String> customDomains);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RankingsResponseInner> getLogAnalyticsRankingsAsync(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RankingsResponseInner getLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param customDomains Array of String.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RankingsResponseInner> getLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        List<String> customDomains,
        Context context);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ContinentsResponseInner>> getLogAnalyticsLocationsWithResponseAsync(
        String resourceGroupName, String profileName);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContinentsResponseInner> getLogAnalyticsLocationsAsync(String resourceGroupName, String profileName);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContinentsResponseInner getLogAnalyticsLocations(String resourceGroupName, String profileName);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContinentsResponseInner> getLogAnalyticsLocationsWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ResourcesResponseInner>> getLogAnalyticsResourcesWithResponseAsync(
        String resourceGroupName, String profileName);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ResourcesResponseInner> getLogAnalyticsResourcesAsync(String resourceGroupName, String profileName);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourcesResponseInner getLogAnalyticsResources(String resourceGroupName, String profileName);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourcesResponseInner> getLogAnalyticsResourcesWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param actions Array of WafAction.
     * @param groupBy Array of WafRankingGroupBy.
     * @param ruleTypes Array of WafRuleType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<WafMetricsResponseInner>> getWafLogAnalyticsMetricsWithResponseAsync(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity,
        List<WafAction> actions,
        List<WafRankingGroupBy> groupBy,
        List<WafRuleType> ruleTypes);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param actions Array of WafAction.
     * @param groupBy Array of WafRankingGroupBy.
     * @param ruleTypes Array of WafRuleType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WafMetricsResponseInner> getWafLogAnalyticsMetricsAsync(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity,
        List<WafAction> actions,
        List<WafRankingGroupBy> groupBy,
        List<WafRuleType> ruleTypes);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WafMetricsResponseInner> getWafLogAnalyticsMetricsAsync(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WafMetricsResponseInner getWafLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param actions Array of WafAction.
     * @param groupBy Array of WafRankingGroupBy.
     * @param ruleTypes Array of WafRuleType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WafMetricsResponseInner> getWafLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity,
        List<WafAction> actions,
        List<WafRankingGroupBy> groupBy,
        List<WafRuleType> ruleTypes,
        Context context);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @param actions Array of WafAction.
     * @param ruleTypes Array of WafRuleType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<WafRankingsResponseInner>> getWafLogAnalyticsRankingsWithResponseAsync(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings,
        List<WafAction> actions,
        List<WafRuleType> ruleTypes);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @param actions Array of WafAction.
     * @param ruleTypes Array of WafRuleType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WafRankingsResponseInner> getWafLogAnalyticsRankingsAsync(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings,
        List<WafAction> actions,
        List<WafRuleType> ruleTypes);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WafRankingsResponseInner> getWafLogAnalyticsRankingsAsync(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WafRankingsResponseInner getWafLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @param actions Array of WafAction.
     * @param ruleTypes Array of WafRuleType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WafRankingsResponseInner> getWafLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings,
        List<WafAction> actions,
        List<WafRuleType> ruleTypes,
        Context context);
}
