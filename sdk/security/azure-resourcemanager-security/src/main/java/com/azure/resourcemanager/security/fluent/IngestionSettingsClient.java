// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ConnectionStringsInner;
import com.azure.resourcemanager.security.fluent.models.IngestionSettingInner;
import com.azure.resourcemanager.security.fluent.models.IngestionSettingTokenInner;

/** An instance of this class provides access to all the operations defined in IngestionSettingsClient. */
public interface IngestionSettingsClient {
    /**
     * Settings for ingesting security data and logs to correlate with resources associated with the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ingestion settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IngestionSettingInner> list();

    /**
     * Settings for ingesting security data and logs to correlate with resources associated with the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ingestion settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IngestionSettingInner> list(Context context);

    /**
     * Settings for ingesting security data and logs to correlate with resources associated with the subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IngestionSettingInner get(String ingestionSettingName);

    /**
     * Settings for ingesting security data and logs to correlate with resources associated with the subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IngestionSettingInner> getWithResponse(String ingestionSettingName, Context context);

    /**
     * Create setting for ingesting security data and logs to correlate with resources associated with the subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @param ingestionSetting Ingestion setting object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IngestionSettingInner create(String ingestionSettingName, IngestionSettingInner ingestionSetting);

    /**
     * Create setting for ingesting security data and logs to correlate with resources associated with the subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @param ingestionSetting Ingestion setting object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IngestionSettingInner> createWithResponse(
        String ingestionSettingName, IngestionSettingInner ingestionSetting, Context context);

    /**
     * Deletes the ingestion settings for this subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String ingestionSettingName);

    /**
     * Deletes the ingestion settings for this subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String ingestionSettingName, Context context);

    /**
     * Returns the token that is used for correlating ingested telemetry with the resources in the subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IngestionSettingTokenInner listTokens(String ingestionSettingName);

    /**
     * Returns the token that is used for correlating ingested telemetry with the resources in the subscription.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IngestionSettingTokenInner> listTokensWithResponse(String ingestionSettingName, Context context);

    /**
     * Connection strings for ingesting security scan logs and data.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection string for ingesting security data and logs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectionStringsInner listConnectionStrings(String ingestionSettingName);

    /**
     * Connection strings for ingesting security scan logs and data.
     *
     * @param ingestionSettingName Name of the ingestion setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection string for ingesting security data and logs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectionStringsInner> listConnectionStringsWithResponse(String ingestionSettingName, Context context);
}
