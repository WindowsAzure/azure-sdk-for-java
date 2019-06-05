/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.RecommendationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Recommendations.
 */
public interface Recommendations extends SupportsListing<Recommendation>, HasInner<RecommendationsInner> {
    /**
     * Reset all recommendation opt-out settings for a subscription.
     * Reset all recommendation opt-out settings for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetAllFiltersAsync();

    /**
     * Disables the specified rule so it will not apply to a subscription in the future.
     * Disables the specified rule so it will not apply to a subscription in the future.
     *
     * @param name Rule name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableRecommendationForSubscriptionAsync(String name);

    /**
     * Get all recommendations for an app.
     * Get all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Recommendation> listRecommendedRulesForHostingEnvironmentAsync(final String resourceGroupName, final String hostingEnvironmentName);

    /**
     * Disable all recommendations for an app.
     * Disable all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName the String value
     * @param environmentName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableAllForHostingEnvironmentAsync(String resourceGroupName, String hostingEnvironmentName, String environmentName);

    /**
     * Reset all recommendation opt-out settings for an app.
     * Reset all recommendation opt-out settings for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName the String value
     * @param environmentName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetAllFiltersForHostingEnvironmentAsync(String resourceGroupName, String hostingEnvironmentName, String environmentName);

    /**
     * Get a recommendation rule for an app.
     * Get a recommendation rule for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the hosting environment.
     * @param name Name of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecommendationRule> getRuleDetailsByHostingEnvironmentAsync(String resourceGroupName, String hostingEnvironmentName, String name);

    /**
     * Disables the specific rule for a web site permanently.
     * Disables the specific rule for a web site permanently.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Rule name
     * @param hostingEnvironmentName the String value
     * @param environmentName Site name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableRecommendationForHostingEnvironmentAsync(String resourceGroupName, String name, String hostingEnvironmentName, String environmentName);

    /**
     * Get all recommendations for an app.
     * Get all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Recommendation> listRecommendedRulesForWebAppAsync(final String resourceGroupName, final String siteName);

    /**
     * Disable all recommendations for an app.
     * Disable all recommendations for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableAllForWebAppAsync(String resourceGroupName, String siteName);

    /**
     * Reset all recommendation opt-out settings for an app.
     * Reset all recommendation opt-out settings for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetAllFiltersForWebAppAsync(String resourceGroupName, String siteName);

    /**
     * Get a recommendation rule for an app.
     * Get a recommendation rule for an app.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @param name Name of the recommendation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecommendationRule> getRuleDetailsByWebAppAsync(String resourceGroupName, String siteName, String name);

    /**
     * Disables the specific rule for a web site permanently.
     * Disables the specific rule for a web site permanently.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Site name
     * @param name Rule name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableRecommendationForSiteAsync(String resourceGroupName, String siteName, String name);

    /**
     * Get past recommendations for an app, optionally specified by the time range.
     * Get past recommendations for an app, optionally specified by the time range.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param hostingEnvironmentName Name of the hosting environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Recommendation> listHistoryForHostingEnvironmentAsync(final String resourceGroupName, final String hostingEnvironmentName);

    /**
     * Get past recommendations for an app, optionally specified by the time range.
     * Get past recommendations for an app, optionally specified by the time range.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param siteName Name of the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Recommendation> listHistoryForWebAppAsync(final String resourceGroupName, final String siteName);

}
