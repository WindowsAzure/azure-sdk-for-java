// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionsListResultInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionUpdate;

/** An instance of this class provides access to all the operations defined in VirtualMachineExtensionsClient. */
public interface VirtualMachineExtensionsClient {
    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be created or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineExtensionInner>, VirtualMachineExtensionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionInner extensionParameters);

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be created or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineExtensionInner>, VirtualMachineExtensionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionInner extensionParameters,
        Context context);

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be created or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionInner createOrUpdate(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionInner extensionParameters);

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be created or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionInner createOrUpdate(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionInner extensionParameters,
        Context context);

    /**
     * The operation to update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineExtensionInner>, VirtualMachineExtensionInner> beginUpdate(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionUpdate extensionParameters);

    /**
     * The operation to update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineExtensionInner>, VirtualMachineExtensionInner> beginUpdate(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionUpdate extensionParameters,
        Context context);

    /**
     * The operation to update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionInner update(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionUpdate extensionParameters);

    /**
     * The operation to update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionInner update(
        String resourceGroupName,
        String vmName,
        String vmExtensionName,
        VirtualMachineExtensionUpdate extensionParameters,
        Context context);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vmName, String vmExtensionName);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vmName, String vmExtensionName, Context context);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmName, String vmExtensionName);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmName, String vmExtensionName, Context context);

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionInner get(String resourceGroupName, String vmName, String vmExtensionName);

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineExtensionInner> getWithResponse(
        String resourceGroupName, String vmName, String vmExtensionName, String expand, Context context);

    /**
     * The operation to get all extensions of a Virtual Machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Extension operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionsListResultInner list(String resourceGroupName, String vmName);

    /**
     * The operation to get all extensions of a Virtual Machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Extension operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineExtensionsListResultInner> listWithResponse(
        String resourceGroupName, String vmName, String expand, Context context);
}
