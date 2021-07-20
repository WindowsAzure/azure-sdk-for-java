// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AdvancedThreatProtectionSettingInner;

/** An instance of this class provides access to all the operations defined in AdvancedThreatProtectionsClient. */
public interface AdvancedThreatProtectionsClient {
    /**
     * Gets the Advanced Threat Protection settings for the specified resource.
     *
     * @param resourceId The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvancedThreatProtectionSettingInner get(String resourceId);

    /**
     * Gets the Advanced Threat Protection settings for the specified resource.
     *
     * @param resourceId The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvancedThreatProtectionSettingInner> getWithResponse(String resourceId, Context context);

    /**
     * Creates or updates the Advanced Threat Protection settings on a specified resource.
     *
     * @param resourceId The identifier of the resource.
     * @param advancedThreatProtectionSetting Advanced Threat Protection Settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvancedThreatProtectionSettingInner create(
        String resourceId, AdvancedThreatProtectionSettingInner advancedThreatProtectionSetting);

    /**
     * Creates or updates the Advanced Threat Protection settings on a specified resource.
     *
     * @param resourceId The identifier of the resource.
     * @param advancedThreatProtectionSetting Advanced Threat Protection Settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advanced Threat Protection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvancedThreatProtectionSettingInner> createWithResponse(
        String resourceId, AdvancedThreatProtectionSettingInner advancedThreatProtectionSetting, Context context);
}
