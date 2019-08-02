/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for generating an ARM template for deploying artifacts.
 */
public class GenerateArmTemplateRequest {
    /**
     * The resource name of the virtual machine.
     */
    @JsonProperty(value = "virtualMachineName")
    private String virtualMachineName;

    /**
     * The parameters of the ARM template.
     */
    @JsonProperty(value = "parameters")
    private List<ParameterInfo> parameters;

    /**
     * The location of the virtual machine.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Options for uploading the files for the artifact.
     * UploadFilesAndGenerateSasTokens is the default value. Possible values
     * include: 'UploadFilesAndGenerateSasTokens', 'None'.
     */
    @JsonProperty(value = "fileUploadOptions")
    private FileUploadOptions fileUploadOptions;

    /**
     * Get the resource name of the virtual machine.
     *
     * @return the virtualMachineName value
     */
    public String virtualMachineName() {
        return this.virtualMachineName;
    }

    /**
     * Set the resource name of the virtual machine.
     *
     * @param virtualMachineName the virtualMachineName value to set
     * @return the GenerateArmTemplateRequest object itself.
     */
    public GenerateArmTemplateRequest withVirtualMachineName(String virtualMachineName) {
        this.virtualMachineName = virtualMachineName;
        return this;
    }

    /**
     * Get the parameters of the ARM template.
     *
     * @return the parameters value
     */
    public List<ParameterInfo> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters of the ARM template.
     *
     * @param parameters the parameters value to set
     * @return the GenerateArmTemplateRequest object itself.
     */
    public GenerateArmTemplateRequest withParameters(List<ParameterInfo> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the location of the virtual machine.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the virtual machine.
     *
     * @param location the location value to set
     * @return the GenerateArmTemplateRequest object itself.
     */
    public GenerateArmTemplateRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get options for uploading the files for the artifact. UploadFilesAndGenerateSasTokens is the default value. Possible values include: 'UploadFilesAndGenerateSasTokens', 'None'.
     *
     * @return the fileUploadOptions value
     */
    public FileUploadOptions fileUploadOptions() {
        return this.fileUploadOptions;
    }

    /**
     * Set options for uploading the files for the artifact. UploadFilesAndGenerateSasTokens is the default value. Possible values include: 'UploadFilesAndGenerateSasTokens', 'None'.
     *
     * @param fileUploadOptions the fileUploadOptions value to set
     * @return the GenerateArmTemplateRequest object itself.
     */
    public GenerateArmTemplateRequest withFileUploadOptions(FileUploadOptions fileUploadOptions) {
        this.fileUploadOptions = fileUploadOptions;
        return this;
    }

}
