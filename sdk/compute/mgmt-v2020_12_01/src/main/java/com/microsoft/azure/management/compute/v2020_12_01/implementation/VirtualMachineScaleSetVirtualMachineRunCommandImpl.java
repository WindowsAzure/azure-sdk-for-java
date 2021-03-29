/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineScaleSetVirtualMachineRunCommand;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineRunCommandUpdate;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineRunCommandScriptSource;
import com.microsoft.azure.management.compute.v2020_12_01.RunCommandInputParameter;
import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineRunCommandInstanceView;
import rx.functions.Func1;

class VirtualMachineScaleSetVirtualMachineRunCommandImpl extends CreatableUpdatableImpl<VirtualMachineScaleSetVirtualMachineRunCommand, VirtualMachineRunCommandInner, VirtualMachineScaleSetVirtualMachineRunCommandImpl> implements VirtualMachineScaleSetVirtualMachineRunCommand, VirtualMachineScaleSetVirtualMachineRunCommand.Definition, VirtualMachineScaleSetVirtualMachineRunCommand.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmScaleSetName;
    private String instanceId;
    private String runCommandName;
    private VirtualMachineRunCommandUpdate updateParameter;

    VirtualMachineScaleSetVirtualMachineRunCommandImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineRunCommandInner());
        this.manager = manager;
        // Set resource name
        this.runCommandName = name;
        //
        this.updateParameter = new VirtualMachineRunCommandUpdate();
    }

    VirtualMachineScaleSetVirtualMachineRunCommandImpl(VirtualMachineRunCommandInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.runCommandName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmScaleSetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineScaleSets");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachines");
        this.runCommandName = IdParsingUtils.getValueFromIdByName(inner.id(), "runCommands");
        //
        this.updateParameter = new VirtualMachineRunCommandUpdate();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachineScaleSetVirtualMachineRunCommand> createResourceAsync() {
        VirtualMachineScaleSetVMRunCommandsInner client = this.manager().inner().virtualMachineScaleSetVMRunCommands();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.runCommandName, this.inner())
            .map(new Func1<VirtualMachineRunCommandInner, VirtualMachineRunCommandInner>() {
               @Override
               public VirtualMachineRunCommandInner call(VirtualMachineRunCommandInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualMachineScaleSetVirtualMachineRunCommand> updateResourceAsync() {
        VirtualMachineScaleSetVMRunCommandsInner client = this.manager().inner().virtualMachineScaleSetVMRunCommands();
        return client.updateAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.runCommandName, this.updateParameter)
            .map(new Func1<VirtualMachineRunCommandInner, VirtualMachineRunCommandInner>() {
               @Override
               public VirtualMachineRunCommandInner call(VirtualMachineRunCommandInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineRunCommandInner> getInnerAsync() {
        VirtualMachineScaleSetVMRunCommandsInner client = this.manager().inner().virtualMachineScaleSetVMRunCommands();
        return client.getAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.runCommandName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new VirtualMachineRunCommandUpdate();
    }

    @Override
    public Boolean asyncExecution() {
        return this.inner().asyncExecution();
    }

    @Override
    public String errorBlobUri() {
        return this.inner().errorBlobUri();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.inner().instanceView();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String outputBlobUri() {
        return this.inner().outputBlobUri();
    }

    @Override
    public List<RunCommandInputParameter> parameters() {
        return this.inner().parameters();
    }

    @Override
    public List<RunCommandInputParameter> protectedParameters() {
        return this.inner().protectedParameters();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String runAsPassword() {
        return this.inner().runAsPassword();
    }

    @Override
    public String runAsUser() {
        return this.inner().runAsUser();
    }

    @Override
    public VirtualMachineRunCommandScriptSource source() {
        return this.inner().source();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Integer timeoutInSeconds() {
        return this.inner().timeoutInSeconds();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withExistingVirtualmachine(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.resourceGroupName = resourceGroupName;
        this.vmScaleSetName = vmScaleSetName;
        this.instanceId = instanceId;
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withAsyncExecution(Boolean asyncExecution) {
        if (isInCreateMode()) {
            this.inner().withAsyncExecution(asyncExecution);
        } else {
            this.updateParameter.withAsyncExecution(asyncExecution);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withErrorBlobUri(String errorBlobUri) {
        if (isInCreateMode()) {
            this.inner().withErrorBlobUri(errorBlobUri);
        } else {
            this.updateParameter.withErrorBlobUri(errorBlobUri);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withOutputBlobUri(String outputBlobUri) {
        if (isInCreateMode()) {
            this.inner().withOutputBlobUri(outputBlobUri);
        } else {
            this.updateParameter.withOutputBlobUri(outputBlobUri);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withParameters(List<RunCommandInputParameter> parameters) {
        if (isInCreateMode()) {
            this.inner().withParameters(parameters);
        } else {
            this.updateParameter.withParameters(parameters);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        if (isInCreateMode()) {
            this.inner().withProtectedParameters(protectedParameters);
        } else {
            this.updateParameter.withProtectedParameters(protectedParameters);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withRunAsPassword(String runAsPassword) {
        if (isInCreateMode()) {
            this.inner().withRunAsPassword(runAsPassword);
        } else {
            this.updateParameter.withRunAsPassword(runAsPassword);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withRunAsUser(String runAsUser) {
        if (isInCreateMode()) {
            this.inner().withRunAsUser(runAsUser);
        } else {
            this.updateParameter.withRunAsUser(runAsUser);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withSource(VirtualMachineRunCommandScriptSource source) {
        if (isInCreateMode()) {
            this.inner().withSource(source);
        } else {
            this.updateParameter.withSource(source);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl withTimeoutInSeconds(Integer timeoutInSeconds) {
        if (isInCreateMode()) {
            this.inner().withTimeoutInSeconds(timeoutInSeconds);
        } else {
            this.updateParameter.withTimeoutInSeconds(timeoutInSeconds);
        }
        return this;
    }

}
