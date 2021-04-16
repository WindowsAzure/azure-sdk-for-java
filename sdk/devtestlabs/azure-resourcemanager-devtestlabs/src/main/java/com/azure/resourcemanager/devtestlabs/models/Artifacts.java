// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Artifacts. */
public interface Artifacts {
    /**
     * List artifacts in a given artifact source.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Artifact> list(String resourceGroupName, String labName, String artifactSourceName);

    /**
     * List artifacts in a given artifact source.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param expand Specify the $expand query. Example: 'properties($select=title)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Artifact> list(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get artifact.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return artifact.
     */
    Artifact get(String resourceGroupName, String labName, String artifactSourceName, String name);

    /**
     * Get artifact.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the artifact.
     * @param expand Specify the $expand query. Example: 'properties($select=title)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return artifact.
     */
    Response<Artifact> getWithResponse(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        String expand,
        Context context);

    /**
     * Generates an ARM template for the given artifact, uploads the required files to a storage account, and validates
     * the generated artifact.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the artifact.
     * @param generateArmTemplateRequest Parameters for generating an ARM template for deploying artifacts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a generated ARM template.
     */
    ArmTemplateInfo generateArmTemplate(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        GenerateArmTemplateRequest generateArmTemplateRequest);

    /**
     * Generates an ARM template for the given artifact, uploads the required files to a storage account, and validates
     * the generated artifact.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the artifact.
     * @param generateArmTemplateRequest Parameters for generating an ARM template for deploying artifacts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a generated ARM template.
     */
    Response<ArmTemplateInfo> generateArmTemplateWithResponse(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        GenerateArmTemplateRequest generateArmTemplateRequest,
        Context context);
}
