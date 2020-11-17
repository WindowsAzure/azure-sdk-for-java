/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema for MSIX Package Application properties.
 */
public class MsixPackageApplications {
    /**
     * Package Application Id, found in appxmanifest.xml.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /**
     * Description of Package Application.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Used to activate Package Application. Consists of Package Name and
     * ApplicationID. Found in appxmanifest.xml.
     */
    @JsonProperty(value = "appUserModelID")
    private String appUserModelID;

    /**
     * User friendly name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * User friendly name.
     */
    @JsonProperty(value = "iconImageName")
    private String iconImageName;

    /**
     * the icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "rawIcon")
    private byte[] rawIcon;

    /**
     * the icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "rawPng")
    private byte[] rawPng;

    /**
     * Get package Application Id, found in appxmanifest.xml.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set package Application Id, found in appxmanifest.xml.
     *
     * @param appId the appId value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get description of Package Application.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of Package Application.
     *
     * @param description the description value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     *
     * @return the appUserModelID value
     */
    public String appUserModelID() {
        return this.appUserModelID;
    }

    /**
     * Set used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     *
     * @param appUserModelID the appUserModelID value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withAppUserModelID(String appUserModelID) {
        this.appUserModelID = appUserModelID;
        return this;
    }

    /**
     * Get user friendly name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set user friendly name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get user friendly name.
     *
     * @return the iconImageName value
     */
    public String iconImageName() {
        return this.iconImageName;
    }

    /**
     * Set user friendly name.
     *
     * @param iconImageName the iconImageName value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withIconImageName(String iconImageName) {
        this.iconImageName = iconImageName;
        return this;
    }

    /**
     * Get the icon a 64 bit string as a byte array.
     *
     * @return the rawIcon value
     */
    public byte[] rawIcon() {
        return this.rawIcon;
    }

    /**
     * Set the icon a 64 bit string as a byte array.
     *
     * @param rawIcon the rawIcon value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withRawIcon(byte[] rawIcon) {
        this.rawIcon = rawIcon;
        return this;
    }

    /**
     * Get the icon a 64 bit string as a byte array.
     *
     * @return the rawPng value
     */
    public byte[] rawPng() {
        return this.rawPng;
    }

    /**
     * Set the icon a 64 bit string as a byte array.
     *
     * @param rawPng the rawPng value to set
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withRawPng(byte[] rawPng) {
        this.rawPng = rawPng;
        return this;
    }

}
