// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineRunCommandProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine run command. */
@Fluent
public final class VirtualMachineRunCommandUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineRunCommandUpdate.class);

    /*
     * Describes the properties of a Virtual Machine run command.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineRunCommandProperties properties;

    /**
     * Get the properties property: Describes the properties of a Virtual Machine run command.
     *
     * @return the properties value.
     */
    private VirtualMachineRunCommandProperties properties() {
        return this.properties;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineRunCommandUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the source property: The source of the run command script.
     *
     * @return the source value.
     */
    public VirtualMachineRunCommandScriptSource source() {
        return this.properties() == null ? null : this.properties().source();
    }

    /**
     * Set the source property: The source of the run command script.
     *
     * @param source the source value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withSource(VirtualMachineRunCommandScriptSource source) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withSource(source);
        return this;
    }

    /**
     * Get the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    public List<RunCommandInputParameter> parameters() {
        return this.properties() == null ? null : this.properties().parameters();
    }

    /**
     * Set the parameters property: The parameters used by the script.
     *
     * @param parameters the parameters value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withParameters(List<RunCommandInputParameter> parameters) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withParameters(parameters);
        return this;
    }

    /**
     * Get the protectedParameters property: The parameters used by the script.
     *
     * @return the protectedParameters value.
     */
    public List<RunCommandInputParameter> protectedParameters() {
        return this.properties() == null ? null : this.properties().protectedParameters();
    }

    /**
     * Set the protectedParameters property: The parameters used by the script.
     *
     * @param protectedParameters the protectedParameters value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withProtectedParameters(protectedParameters);
        return this;
    }

    /**
     * Get the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @return the asyncExecution value.
     */
    public Boolean asyncExecution() {
        return this.properties() == null ? null : this.properties().asyncExecution();
    }

    /**
     * Set the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @param asyncExecution the asyncExecution value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withAsyncExecution(Boolean asyncExecution) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withAsyncExecution(asyncExecution);
        return this;
    }

    /**
     * Get the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @return the runAsUser value.
     */
    public String runAsUser() {
        return this.properties() == null ? null : this.properties().runAsUser();
    }

    /**
     * Set the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @param runAsUser the runAsUser value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withRunAsUser(String runAsUser) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withRunAsUser(runAsUser);
        return this;
    }

    /**
     * Get the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @return the runAsPassword value.
     */
    public String runAsPassword() {
        return this.properties() == null ? null : this.properties().runAsPassword();
    }

    /**
     * Set the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @param runAsPassword the runAsPassword value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withRunAsPassword(String runAsPassword) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withRunAsPassword(runAsPassword);
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @return the timeoutInSeconds value.
     */
    public Integer timeoutInSeconds() {
        return this.properties() == null ? null : this.properties().timeoutInSeconds();
    }

    /**
     * Set the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withTimeoutInSeconds(Integer timeoutInSeconds) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * Get the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @return the outputBlobUri value.
     */
    public String outputBlobUri() {
        return this.properties() == null ? null : this.properties().outputBlobUri();
    }

    /**
     * Set the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @param outputBlobUri the outputBlobUri value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withOutputBlobUri(String outputBlobUri) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withOutputBlobUri(outputBlobUri);
        return this;
    }

    /**
     * Get the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @return the errorBlobUri value.
     */
    public String errorBlobUri() {
        return this.properties() == null ? null : this.properties().errorBlobUri();
    }

    /**
     * Set the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @param errorBlobUri the errorBlobUri value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withErrorBlobUri(String errorBlobUri) {
        if (this.properties() == null) {
            this.properties = new VirtualMachineRunCommandProperties();
        }
        this.properties().withErrorBlobUri(errorBlobUri);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.properties() == null ? null : this.properties().provisioningState();
    }

    /**
     * Get the instanceView property: The virtual machine run command instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.properties() == null ? null : this.properties().instanceView();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
