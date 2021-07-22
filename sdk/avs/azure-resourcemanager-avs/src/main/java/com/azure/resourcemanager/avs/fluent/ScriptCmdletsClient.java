// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.ScriptCmdletInner;

/** An instance of this class provides access to all the operations defined in ScriptCmdletsClient. */
public interface ScriptCmdletsClient {
    /**
     * Return script cmdlet resources available for a private cloud to create a script execution resource on their
     * Private Cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScriptCmdletInner> list(String resourceGroupName, String privateCloudName, String scriptPackageName);

    /**
     * Return script cmdlet resources available for a private cloud to create a script execution resource on their
     * Private Cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScriptCmdletInner> list(
        String resourceGroupName, String privateCloudName, String scriptPackageName, Context context);

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptCmdletInner get(
        String resourceGroupName, String privateCloudName, String scriptPackageName, String scriptCmdletName);

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScriptCmdletInner> getWithResponse(
        String resourceGroupName,
        String privateCloudName,
        String scriptPackageName,
        String scriptCmdletName,
        Context context);
}
