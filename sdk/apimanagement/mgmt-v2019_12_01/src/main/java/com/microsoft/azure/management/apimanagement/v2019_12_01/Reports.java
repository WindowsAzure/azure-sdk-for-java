/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import rx.Observable;
import org.joda.time.Period;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ReportsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Reports.
 */
public interface Reports extends HasInner<ReportsInner> {
    /**
     * Lists report records by API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByApiAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by User.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter | ge, le |     | &lt;/br&gt;| displayName | select, orderBy |     |     | &lt;/br&gt;| userId | select, filter | eq |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| productId | filter | eq |     | &lt;/br&gt;| subscriptionId | filter | eq |     | &lt;/br&gt;| apiId | filter | eq |     | &lt;/br&gt;| operationId | filter | eq |     | &lt;/br&gt;| callCountSuccess | select, orderBy |     |     | &lt;/br&gt;| callCountBlocked | select, orderBy |     |     | &lt;/br&gt;| callCountFailed | select, orderBy |     |     | &lt;/br&gt;| callCountOther | select, orderBy |     |     | &lt;/br&gt;| callCountTotal | select, orderBy |     |     | &lt;/br&gt;| bandwidth | select, orderBy |     |     | &lt;/br&gt;| cacheHitsCount | select |     |     | &lt;/br&gt;| cacheMissCount | select |     |     | &lt;/br&gt;| apiTimeAvg | select, orderBy |     |     | &lt;/br&gt;| apiTimeMin | select |     |     | &lt;/br&gt;| apiTimeMax | select |     |     | &lt;/br&gt;| serviceTimeAvg | select |     |     | &lt;/br&gt;| serviceTimeMin | select |     |     | &lt;/br&gt;| serviceTimeMax | select |     |     | &lt;/br&gt;
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByUserAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by API Operations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter | ge, le |     | &lt;/br&gt;| displayName | select, orderBy |     |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| userId | filter | eq |     | &lt;/br&gt;| productId | filter | eq |     | &lt;/br&gt;| subscriptionId | filter | eq |     | &lt;/br&gt;| apiId | filter | eq |     | &lt;/br&gt;| operationId | select, filter | eq |     | &lt;/br&gt;| callCountSuccess | select, orderBy |     |     | &lt;/br&gt;| callCountBlocked | select, orderBy |     |     | &lt;/br&gt;| callCountFailed | select, orderBy |     |     | &lt;/br&gt;| callCountOther | select, orderBy |     |     | &lt;/br&gt;| callCountTotal | select, orderBy |     |     | &lt;/br&gt;| bandwidth | select, orderBy |     |     | &lt;/br&gt;| cacheHitsCount | select |     |     | &lt;/br&gt;| cacheMissCount | select |     |     | &lt;/br&gt;| apiTimeAvg | select, orderBy |     |     | &lt;/br&gt;| apiTimeMin | select |     |     | &lt;/br&gt;| apiTimeMax | select |     |     | &lt;/br&gt;| serviceTimeAvg | select |     |     | &lt;/br&gt;| serviceTimeMin | select |     |     | &lt;/br&gt;| serviceTimeMax | select |     |     | &lt;/br&gt;
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByOperationAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by Product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter | ge, le |     | &lt;/br&gt;| displayName | select, orderBy |     |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| userId | filter | eq |     | &lt;/br&gt;| productId | select, filter | eq |     | &lt;/br&gt;| subscriptionId | filter | eq |     | &lt;/br&gt;| callCountSuccess | select, orderBy |     |     | &lt;/br&gt;| callCountBlocked | select, orderBy |     |     | &lt;/br&gt;| callCountFailed | select, orderBy |     |     | &lt;/br&gt;| callCountOther | select, orderBy |     |     | &lt;/br&gt;| callCountTotal | select, orderBy |     |     | &lt;/br&gt;| bandwidth | select, orderBy |     |     | &lt;/br&gt;| cacheHitsCount | select |     |     | &lt;/br&gt;| cacheMissCount | select |     |     | &lt;/br&gt;| apiTimeAvg | select, orderBy |     |     | &lt;/br&gt;| apiTimeMin | select |     |     | &lt;/br&gt;| apiTimeMax | select |     |     | &lt;/br&gt;| serviceTimeAvg | select |     |     | &lt;/br&gt;| serviceTimeMin | select |     |     | &lt;/br&gt;| serviceTimeMax | select |     |     | &lt;/br&gt;
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByProductAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by geography.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter | ge, le |     | &lt;/br&gt;| country | select |     |     | &lt;/br&gt;| region | select |     |     | &lt;/br&gt;| zip | select |     |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| userId | filter | eq |     | &lt;/br&gt;| productId | filter | eq |     | &lt;/br&gt;| subscriptionId | filter | eq |     | &lt;/br&gt;| apiId | filter | eq |     | &lt;/br&gt;| operationId | filter | eq |     | &lt;/br&gt;| callCountSuccess | select |     |     | &lt;/br&gt;| callCountBlocked | select |     |     | &lt;/br&gt;| callCountFailed | select |     |     | &lt;/br&gt;| callCountOther | select |     |     | &lt;/br&gt;| bandwidth | select, orderBy |     |     | &lt;/br&gt;| cacheHitsCount | select |     |     | &lt;/br&gt;| cacheMissCount | select |     |     | &lt;/br&gt;| apiTimeAvg | select |     |     | &lt;/br&gt;| apiTimeMin | select |     |     | &lt;/br&gt;| apiTimeMax | select |     |     | &lt;/br&gt;| serviceTimeAvg | select |     |     | &lt;/br&gt;| serviceTimeMin | select |     |     | &lt;/br&gt;| serviceTimeMax | select |     |     | &lt;/br&gt;
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByGeoAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter | ge, le |     | &lt;/br&gt;| displayName | select, orderBy |     |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| userId | select, filter | eq |     | &lt;/br&gt;| productId | select, filter | eq |     | &lt;/br&gt;| subscriptionId | select, filter | eq |     | &lt;/br&gt;| callCountSuccess | select, orderBy |     |     | &lt;/br&gt;| callCountBlocked | select, orderBy |     |     | &lt;/br&gt;| callCountFailed | select, orderBy |     |     | &lt;/br&gt;| callCountOther | select, orderBy |     |     | &lt;/br&gt;| callCountTotal | select, orderBy |     |     | &lt;/br&gt;| bandwidth | select, orderBy |     |     | &lt;/br&gt;| cacheHitsCount | select |     |     | &lt;/br&gt;| cacheMissCount | select |     |     | &lt;/br&gt;| apiTimeAvg | select, orderBy |     |     | &lt;/br&gt;| apiTimeMin | select |     |     | &lt;/br&gt;| apiTimeMax | select |     |     | &lt;/br&gt;| serviceTimeAvg | select |     |     | &lt;/br&gt;| serviceTimeMin | select |     |     | &lt;/br&gt;| serviceTimeMax | select |     |     | &lt;/br&gt;
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listBySubscriptionAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by Time.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter, select | ge, le |     | &lt;/br&gt;| interval | select |     |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| userId | filter | eq |     | &lt;/br&gt;| productId | filter | eq |     | &lt;/br&gt;| subscriptionId | filter | eq |     | &lt;/br&gt;| apiId | filter | eq |     | &lt;/br&gt;| operationId | filter | eq |     | &lt;/br&gt;| callCountSuccess | select |     |     | &lt;/br&gt;| callCountBlocked | select |     |     | &lt;/br&gt;| callCountFailed | select |     |     | &lt;/br&gt;| callCountOther | select |     |     | &lt;/br&gt;| bandwidth | select, orderBy |     |     | &lt;/br&gt;| cacheHitsCount | select |     |     | &lt;/br&gt;| cacheMissCount | select |     |     | &lt;/br&gt;| apiTimeAvg | select |     |     | &lt;/br&gt;| apiTimeMin | select |     |     | &lt;/br&gt;| apiTimeMax | select |     |     | &lt;/br&gt;| serviceTimeAvg | select |     |     | &lt;/br&gt;| serviceTimeMin | select |     |     | &lt;/br&gt;| serviceTimeMax | select |     |     | &lt;/br&gt;
     * @param interval By time interval. Interval must be multiple of 15 minutes and may not be zero. The value should be in ISO  8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds)).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByTimeAsync(final String resourceGroupName, final String serviceName, final String filter, final Period interval);

    /**
     * Lists report records by Request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| timestamp | filter | ge, le |     | &lt;/br&gt;| apiId | filter | eq |     | &lt;/br&gt;| operationId | filter | eq |     | &lt;/br&gt;| productId | filter | eq |     | &lt;/br&gt;| userId | filter | eq |     | &lt;/br&gt;| apiRegion | filter | eq |     | &lt;/br&gt;| subscriptionId | filter | eq |     | &lt;/br&gt;
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RequestReportRecordContract> listByRequestAsync(String resourceGroupName, String serviceName, String filter);

}
