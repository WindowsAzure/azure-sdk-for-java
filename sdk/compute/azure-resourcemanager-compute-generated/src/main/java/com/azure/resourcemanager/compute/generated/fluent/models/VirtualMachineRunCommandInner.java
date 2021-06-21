// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine run command. */
@JsonFlatten
@Fluent
public class VirtualMachineRunCommandInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineRunCommandInner.class);

    /*
     * The source of the run command script.
     */
    @JsonProperty(value = "properties.source")
    private VirtualMachineRunCommandScriptSource source;

    /*
     * The parameters used by the script.
     */
    @JsonProperty(value = "properties.parameters")
    private List<RunCommandInputParameter> parameters;

    /*
     * The parameters used by the script.
     */
    @JsonProperty(value = "properties.protectedParameters")
    private List<RunCommandInputParameter> protectedParameters;

    /*
     * Optional. If set to true, provisioning will complete as soon as the
     * script starts and will not wait for script to complete.
     */
    @JsonProperty(value = "properties.asyncExecution")
    private Boolean asyncExecution;

    /*
     * Specifies the user account on the VM when executing the run command.
     */
    @JsonProperty(value = "properties.runAsUser")
    private String runAsUser;

    /*
     * Specifies the user account password on the VM when executing the run
     * command.
     */
    @JsonProperty(value = "properties.runAsPassword")
    private String runAsPassword;

    /*
     * The timeout in seconds to execute the run command.
     */
    @JsonProperty(value = "properties.timeoutInSeconds")
    private Integer timeoutInSeconds;

    /*
     * Specifies the Azure storage blob where script output stream will be
     * uploaded.
     */
    @JsonProperty(value = "properties.outputBlobUri")
    private String outputBlobUri;

    /*
     * Specifies the Azure storage blob where script error stream will be
     * uploaded.
     */
    @JsonProperty(value = "properties.errorBlobUri")
    private String errorBlobUri;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The virtual machine run command instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineRunCommandInstanceView instanceView;

    /**
     * Get the source property: The source of the run command script.
     *
     * @return the source value.
     */
    public VirtualMachineRunCommandScriptSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source of the run command script.
     *
     * @param source the source value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withSource(VirtualMachineRunCommandScriptSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    public List<RunCommandInputParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters used by the script.
     *
     * @param parameters the parameters value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withParameters(List<RunCommandInputParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the protectedParameters property: The parameters used by the script.
     *
     * @return the protectedParameters value.
     */
    public List<RunCommandInputParameter> protectedParameters() {
        return this.protectedParameters;
    }

    /**
     * Set the protectedParameters property: The parameters used by the script.
     *
     * @param protectedParameters the protectedParameters value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        this.protectedParameters = protectedParameters;
        return this;
    }

    /**
     * Get the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @return the asyncExecution value.
     */
    public Boolean asyncExecution() {
        return this.asyncExecution;
    }

    /**
     * Set the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @param asyncExecution the asyncExecution value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withAsyncExecution(Boolean asyncExecution) {
        this.asyncExecution = asyncExecution;
        return this;
    }

    /**
     * Get the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @return the runAsUser value.
     */
    public String runAsUser() {
        return this.runAsUser;
    }

    /**
     * Set the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @param runAsUser the runAsUser value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withRunAsUser(String runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * Get the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @return the runAsPassword value.
     */
    public String runAsPassword() {
        return this.runAsPassword;
    }

    /**
     * Set the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @param runAsPassword the runAsPassword value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withRunAsPassword(String runAsPassword) {
        this.runAsPassword = runAsPassword;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @return the timeoutInSeconds value.
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @return the outputBlobUri value.
     */
    public String outputBlobUri() {
        return this.outputBlobUri;
    }

    /**
     * Set the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @param outputBlobUri the outputBlobUri value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withOutputBlobUri(String outputBlobUri) {
        this.outputBlobUri = outputBlobUri;
        return this;
    }

    /**
     * Get the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @return the errorBlobUri value.
     */
    public String errorBlobUri() {
        return this.errorBlobUri;
    }

    /**
     * Set the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @param errorBlobUri the errorBlobUri value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withErrorBlobUri(String errorBlobUri) {
        this.errorBlobUri = errorBlobUri;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The virtual machine run command instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.instanceView;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineRunCommandInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineRunCommandInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
        if (protectedParameters() != null) {
            protectedParameters().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
