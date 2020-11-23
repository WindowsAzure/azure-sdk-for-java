// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommand;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandUpdate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualMachineRunCommandImpl
    implements VirtualMachineRunCommand, VirtualMachineRunCommand.Definition, VirtualMachineRunCommand.Update {
    private VirtualMachineRunCommandInner innerObject;

    private final ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public VirtualMachineRunCommandScriptSource source() {
        return this.innerModel().source();
    }

    public List<RunCommandInputParameter> parameters() {
        List<RunCommandInputParameter> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<RunCommandInputParameter> protectedParameters() {
        List<RunCommandInputParameter> inner = this.innerModel().protectedParameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public Boolean asyncExecution() {
        return this.innerModel().asyncExecution();
    }

    public String runAsUser() {
        return this.innerModel().runAsUser();
    }

    public String runAsPassword() {
        return this.innerModel().runAsPassword();
    }

    public Integer timeoutInSeconds() {
        return this.innerModel().timeoutInSeconds();
    }

    public String outputBlobUri() {
        return this.innerModel().outputBlobUri();
    }

    public String errorBlobUri() {
        return this.innerModel().errorBlobUri();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.innerModel().instanceView();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualMachineRunCommandInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmName;

    private String runCommandName;

    private VirtualMachineRunCommandUpdate updateRunCommand;

    public VirtualMachineRunCommandImpl withExistingVirtualMachine(String resourceGroupName, String vmName) {
        this.resourceGroupName = resourceGroupName;
        this.vmName = vmName;
        return this;
    }

    public VirtualMachineRunCommand create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineRunCommands()
                .createOrUpdate(resourceGroupName, vmName, runCommandName, innerObject, Context.NONE);
        return this;
    }

    public VirtualMachineRunCommand create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineRunCommands()
                .createOrUpdate(resourceGroupName, vmName, runCommandName, innerObject, context);
        return this;
    }

    public VirtualMachineRunCommandImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineRunCommandInner();
        this.serviceManager = serviceManager;
        this.runCommandName = name;
    }

    public VirtualMachineRunCommandImpl update() {
        this.updateRunCommand = new VirtualMachineRunCommandUpdate();
        return this;
    }

    public VirtualMachineRunCommand apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineRunCommands()
                .update(resourceGroupName, vmName, runCommandName, updateRunCommand, Context.NONE);
        return this;
    }

    public VirtualMachineRunCommand apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineRunCommands()
                .update(resourceGroupName, vmName, runCommandName, updateRunCommand, context);
        return this;
    }

    public VirtualMachineRunCommandImpl(VirtualMachineRunCommandInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachines");
        this.runCommandName = Utils.getValueFromIdByName(innerObject.id(), "runCommands");
    }

    public VirtualMachineRunCommand refresh() {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineRunCommands()
                .getByVirtualMachineWithResponse(resourceGroupName, vmName, runCommandName, refreshExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachineRunCommand refresh(Context context) {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineRunCommands()
                .getByVirtualMachineWithResponse(resourceGroupName, vmName, runCommandName, refreshExpand, context)
                .getValue();
        return this;
    }

    public VirtualMachineRunCommandImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineRunCommandImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineRunCommandImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateRunCommand.withTags(tags);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withSource(VirtualMachineRunCommandScriptSource source) {
        if (isInCreateMode()) {
            this.innerModel().withSource(source);
            return this;
        } else {
            this.updateRunCommand.withSource(source);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withParameters(List<RunCommandInputParameter> parameters) {
        if (isInCreateMode()) {
            this.innerModel().withParameters(parameters);
            return this;
        } else {
            this.updateRunCommand.withParameters(parameters);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        if (isInCreateMode()) {
            this.innerModel().withProtectedParameters(protectedParameters);
            return this;
        } else {
            this.updateRunCommand.withProtectedParameters(protectedParameters);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withAsyncExecution(Boolean asyncExecution) {
        if (isInCreateMode()) {
            this.innerModel().withAsyncExecution(asyncExecution);
            return this;
        } else {
            this.updateRunCommand.withAsyncExecution(asyncExecution);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withRunAsUser(String runAsUser) {
        if (isInCreateMode()) {
            this.innerModel().withRunAsUser(runAsUser);
            return this;
        } else {
            this.updateRunCommand.withRunAsUser(runAsUser);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withRunAsPassword(String runAsPassword) {
        if (isInCreateMode()) {
            this.innerModel().withRunAsPassword(runAsPassword);
            return this;
        } else {
            this.updateRunCommand.withRunAsPassword(runAsPassword);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withTimeoutInSeconds(Integer timeoutInSeconds) {
        if (isInCreateMode()) {
            this.innerModel().withTimeoutInSeconds(timeoutInSeconds);
            return this;
        } else {
            this.updateRunCommand.withTimeoutInSeconds(timeoutInSeconds);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withOutputBlobUri(String outputBlobUri) {
        if (isInCreateMode()) {
            this.innerModel().withOutputBlobUri(outputBlobUri);
            return this;
        } else {
            this.updateRunCommand.withOutputBlobUri(outputBlobUri);
            return this;
        }
    }

    public VirtualMachineRunCommandImpl withErrorBlobUri(String errorBlobUri) {
        if (isInCreateMode()) {
            this.innerModel().withErrorBlobUri(errorBlobUri);
            return this;
        } else {
            this.updateRunCommand.withErrorBlobUri(errorBlobUri);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
