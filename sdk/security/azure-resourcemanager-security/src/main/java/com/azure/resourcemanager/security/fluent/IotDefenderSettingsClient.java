// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IotDefenderSettingsListInner;
import com.azure.resourcemanager.security.fluent.models.IotDefenderSettingsModelInner;
import com.azure.resourcemanager.security.fluent.models.PackageDownloadsInner;
import java.io.InputStream;

/** An instance of this class provides access to all the operations defined in IotDefenderSettingsClient. */
public interface IotDefenderSettingsClient {
    /**
     * List IoT Defender Settings.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Defender settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotDefenderSettingsListInner list();

    /**
     * List IoT Defender Settings.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Defender settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotDefenderSettingsListInner> listWithResponse(Context context);

    /**
     * Get IoT Defender Settings.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Defender Settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotDefenderSettingsModelInner get();

    /**
     * Get IoT Defender Settings.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Defender Settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotDefenderSettingsModelInner> getWithResponse(Context context);

    /**
     * Create or update IoT Defender settings.
     *
     * @param iotDefenderSettingsModel The IoT defender settings model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Defender settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotDefenderSettingsModelInner createOrUpdate(IotDefenderSettingsModelInner iotDefenderSettingsModel);

    /**
     * Create or update IoT Defender settings.
     *
     * @param iotDefenderSettingsModel The IoT defender settings model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Defender settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotDefenderSettingsModelInner> createOrUpdateWithResponse(
        IotDefenderSettingsModelInner iotDefenderSettingsModel, Context context);

    /**
     * Delete IoT Defender settings.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete();

    /**
     * Delete IoT Defender settings.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(Context context);

    /**
     * Information about downloadable packages.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about package downloads.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PackageDownloadsInner packageDownloads();

    /**
     * Information about downloadable packages.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about package downloads.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PackageDownloadsInner> packageDownloadsWithResponse(Context context);

    /**
     * Download manager activation data defined for this subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InputStream downloadManagerActivation();

    /**
     * Download manager activation data defined for this subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamResponse downloadManagerActivationWithResponse(Context context);
}
