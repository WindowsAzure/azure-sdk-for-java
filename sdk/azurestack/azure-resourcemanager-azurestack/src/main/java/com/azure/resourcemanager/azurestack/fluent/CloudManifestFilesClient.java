// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.CloudManifestFileResponseInner;

/** An instance of this class provides access to all the operations defined in CloudManifestFilesClient. */
public interface CloudManifestFilesClient {
    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudManifestFileResponseInner list();

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudManifestFileResponseInner> listWithResponse(Context context);

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudManifestFileResponseInner get(String verificationVersion);

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @param versionCreationDate Signing verification key version creation date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudManifestFileResponseInner> getWithResponse(
        String verificationVersion, String versionCreationDate, Context context);
}
