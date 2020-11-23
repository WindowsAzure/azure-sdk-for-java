// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SshPublicKeys. */
public interface SshPublicKeys {
    /**
     * Lists all of the SSH public keys in the subscription. Use the nextLink property in the response to get the next
     * page of SSH public keys.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    PagedIterable<SshPublicKeyResource> list();

    /**
     * Lists all of the SSH public keys in the subscription. Use the nextLink property in the response to get the next
     * page of SSH public keys.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    PagedIterable<SshPublicKeyResource> list(Context context);

    /**
     * Lists all of the SSH public keys in the specified resource group. Use the nextLink property in the response to
     * get the next page of SSH public keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    PagedIterable<SshPublicKeyResource> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the SSH public keys in the specified resource group. Use the nextLink property in the response to
     * get the next page of SSH public keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    PagedIterable<SshPublicKeyResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Delete an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sshPublicKeyName);

    /**
     * Delete an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String sshPublicKeyName, Context context);

    /**
     * Retrieves information about an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    SshPublicKeyResource getByResourceGroup(String resourceGroupName, String sshPublicKeyName);

    /**
     * Retrieves information about an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    Response<SshPublicKeyResource> getByResourceGroupWithResponse(
        String resourceGroupName, String sshPublicKeyName, Context context);

    /**
     * Generates and returns a public/private key pair and populates the SSH public key resource with the public key.
     * The length of the key will be 3072 bits. This operation can only be performed once per SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from generation of an SSH key pair.
     */
    SshPublicKeyGenerateKeyPairResult generateKeyPair(String resourceGroupName, String sshPublicKeyName);

    /**
     * Generates and returns a public/private key pair and populates the SSH public key resource with the public key.
     * The length of the key will be 3072 bits. This operation can only be performed once per SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from generation of an SSH key pair.
     */
    Response<SshPublicKeyGenerateKeyPairResult> generateKeyPairWithResponse(
        String resourceGroupName, String sshPublicKeyName, Context context);

    /**
     * Begins definition for a new SshPublicKeyResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new SshPublicKeyResource definition.
     */
    SshPublicKeyResource.DefinitionStages.Blank define(String name);
}
