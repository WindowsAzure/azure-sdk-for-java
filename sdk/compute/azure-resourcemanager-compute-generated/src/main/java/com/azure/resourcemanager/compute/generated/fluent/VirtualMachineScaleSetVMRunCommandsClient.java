// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandUpdate;

/**
 * An instance of this class provides access to all the operations defined in VirtualMachineScaleSetVMRunCommandsClient.
 */
public interface VirtualMachineScaleSetVMRunCommandsClient {
    /**
     * The operation to create or update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandInner runCommand);

    /**
     * The operation to create or update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandInner runCommand,
        Context context);

    /**
     * The operation to create or update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner createOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandInner runCommand);

    /**
     * The operation to create or update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner createOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandInner runCommand,
        Context context);

    /**
     * The operation to update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandUpdate runCommand);

    /**
     * The operation to update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandUpdate runCommand,
        Context context);

    /**
     * The operation to update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner update(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandUpdate runCommand);

    /**
     * The operation to update the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Describes a Virtual Machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner update(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        VirtualMachineRunCommandUpdate runCommand,
        Context context);

    /**
     * The operation to delete the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName);

    /**
     * The operation to delete the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName, Context context);

    /**
     * The operation to delete the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName);

    /**
     * The operation to delete the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName, Context context);

    /**
     * The operation to get the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner get(
        String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName);

    /**
     * The operation to get the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineRunCommandInner> getWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String runCommandName,
        String expand,
        Context context);

    /**
     * The operation to get all run commands of an instance in Virtual Machine Scaleset.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List run command operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineRunCommandInner> list(
        String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * The operation to get all run commands of an instance in Virtual Machine Scaleset.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List run command operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineRunCommandInner> list(
        String resourceGroupName, String vmScaleSetName, String instanceId, String expand, Context context);
}
