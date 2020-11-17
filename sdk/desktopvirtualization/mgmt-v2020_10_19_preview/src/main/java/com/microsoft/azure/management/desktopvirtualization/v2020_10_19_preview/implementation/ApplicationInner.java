/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.RemoteApplicationType;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.CommandLineSetting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Schema for Application properties.
 */
@JsonFlatten
public class ApplicationInner extends ProxyResource {
    /**
     * Description of Application.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Friendly name of Application.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Specifies a path for the executable file for the application.
     */
    @JsonProperty(value = "properties.filePath")
    private String filePath;

    /**
     * Specifies the package family name for MSIX applications.
     */
    @JsonProperty(value = "properties.msixPackageFamilyName")
    private String msixPackageFamilyName;

    /**
     * Specifies the package application Id for MSIX applications.
     */
    @JsonProperty(value = "properties.msixPackageApplicationId")
    private String msixPackageApplicationId;

    /**
     * Resource Type of Application. Possible values include: 'InBuilt',
     * 'MsixApplication'.
     */
    @JsonProperty(value = "properties.applicationType")
    private RemoteApplicationType applicationType;

    /**
     * Specifies whether this published application can be launched with
     * command line arguments provided by the client, command line arguments
     * specified at publish time, or no command line arguments at all. Possible
     * values include: 'DoNotAllow', 'Allow', 'Require'.
     */
    @JsonProperty(value = "properties.commandLineSetting", required = true)
    private CommandLineSetting commandLineSetting;

    /**
     * Command Line Arguments for Application.
     */
    @JsonProperty(value = "properties.commandLineArguments")
    private String commandLineArguments;

    /**
     * Specifies whether to show the RemoteApp program in the RD Web Access
     * server.
     */
    @JsonProperty(value = "properties.showInPortal")
    private Boolean showInPortal;

    /**
     * Path to icon.
     */
    @JsonProperty(value = "properties.iconPath")
    private String iconPath;

    /**
     * Index of the icon.
     */
    @JsonProperty(value = "properties.iconIndex")
    private Integer iconIndex;

    /**
     * Hash of the icon.
     */
    @JsonProperty(value = "properties.iconHash", access = JsonProperty.Access.WRITE_ONLY)
    private String iconHash;

    /**
     * the icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "properties.iconContent", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] iconContent;

    /**
     * Get description of Application.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of Application.
     *
     * @param description the description value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get friendly name of Application.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of Application.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get specifies a path for the executable file for the application.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set specifies a path for the executable file for the application.
     *
     * @param filePath the filePath value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get specifies the package family name for MSIX applications.
     *
     * @return the msixPackageFamilyName value
     */
    public String msixPackageFamilyName() {
        return this.msixPackageFamilyName;
    }

    /**
     * Set specifies the package family name for MSIX applications.
     *
     * @param msixPackageFamilyName the msixPackageFamilyName value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withMsixPackageFamilyName(String msixPackageFamilyName) {
        this.msixPackageFamilyName = msixPackageFamilyName;
        return this;
    }

    /**
     * Get specifies the package application Id for MSIX applications.
     *
     * @return the msixPackageApplicationId value
     */
    public String msixPackageApplicationId() {
        return this.msixPackageApplicationId;
    }

    /**
     * Set specifies the package application Id for MSIX applications.
     *
     * @param msixPackageApplicationId the msixPackageApplicationId value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withMsixPackageApplicationId(String msixPackageApplicationId) {
        this.msixPackageApplicationId = msixPackageApplicationId;
        return this;
    }

    /**
     * Get resource Type of Application. Possible values include: 'InBuilt', 'MsixApplication'.
     *
     * @return the applicationType value
     */
    public RemoteApplicationType applicationType() {
        return this.applicationType;
    }

    /**
     * Set resource Type of Application. Possible values include: 'InBuilt', 'MsixApplication'.
     *
     * @param applicationType the applicationType value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withApplicationType(RemoteApplicationType applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: 'DoNotAllow', 'Allow', 'Require'.
     *
     * @return the commandLineSetting value
     */
    public CommandLineSetting commandLineSetting() {
        return this.commandLineSetting;
    }

    /**
     * Set specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: 'DoNotAllow', 'Allow', 'Require'.
     *
     * @param commandLineSetting the commandLineSetting value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withCommandLineSetting(CommandLineSetting commandLineSetting) {
        this.commandLineSetting = commandLineSetting;
        return this;
    }

    /**
     * Get command Line Arguments for Application.
     *
     * @return the commandLineArguments value
     */
    public String commandLineArguments() {
        return this.commandLineArguments;
    }

    /**
     * Set command Line Arguments for Application.
     *
     * @param commandLineArguments the commandLineArguments value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withCommandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
        return this;
    }

    /**
     * Get specifies whether to show the RemoteApp program in the RD Web Access server.
     *
     * @return the showInPortal value
     */
    public Boolean showInPortal() {
        return this.showInPortal;
    }

    /**
     * Set specifies whether to show the RemoteApp program in the RD Web Access server.
     *
     * @param showInPortal the showInPortal value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withShowInPortal(Boolean showInPortal) {
        this.showInPortal = showInPortal;
        return this;
    }

    /**
     * Get path to icon.
     *
     * @return the iconPath value
     */
    public String iconPath() {
        return this.iconPath;
    }

    /**
     * Set path to icon.
     *
     * @param iconPath the iconPath value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    /**
     * Get index of the icon.
     *
     * @return the iconIndex value
     */
    public Integer iconIndex() {
        return this.iconIndex;
    }

    /**
     * Set index of the icon.
     *
     * @param iconIndex the iconIndex value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
        return this;
    }

    /**
     * Get hash of the icon.
     *
     * @return the iconHash value
     */
    public String iconHash() {
        return this.iconHash;
    }

    /**
     * Get the icon a 64 bit string as a byte array.
     *
     * @return the iconContent value
     */
    public byte[] iconContent() {
        return this.iconContent;
    }

}
