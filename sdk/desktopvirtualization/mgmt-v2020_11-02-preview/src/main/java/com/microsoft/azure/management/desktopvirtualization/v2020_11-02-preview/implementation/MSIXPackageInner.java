/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation;

import java.util.List;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.MsixPackageDependencies;
import org.joda.time.DateTime;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.MsixPackageApplications;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Schema for MSIX Package properties.
 */
@JsonFlatten
public class MSIXPackageInner extends ProxyResource {
    /**
     * VHD/CIM image path on Network Share.
     */
    @JsonProperty(value = "properties.imagePath")
    private String imagePath;

    /**
     * Package Name from appxmanifest.xml.
     */
    @JsonProperty(value = "properties.packageName")
    private String packageName;

    /**
     * Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     */
    @JsonProperty(value = "properties.packageFamilyName")
    private String packageFamilyName;

    /**
     * User friendly Name to be displayed in the portal.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Relative Path to the package inside the image.
     */
    @JsonProperty(value = "properties.packageRelativePath")
    private String packageRelativePath;

    /**
     * Specifies how to register Package in feed.
     */
    @JsonProperty(value = "properties.isRegularRegistration")
    private boolean isRegularRegistration;

    /**
     * Make this version of the package the active one across the hostpool.
     */
    @JsonProperty(value = "properties.isActive")
    private boolean isActive;

    /**
     * List of package dependencies.
     */
    @JsonProperty(value = "properties.packageDependencies")
    private List<MsixPackageDependencies> packageDependencies;

    /**
     * Package Version found in the appxmanifest.xml.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /**
     * Date Package was last updated, found in the appxmanifest.xml.
     */
    @JsonProperty(value = "properties.lastUpdated")
    private DateTime lastUpdated;

    /**
     * List of package applications.
     */
    @JsonProperty(value = "properties.packageApplications")
    private List<MsixPackageApplications> packageApplications;

    /**
     * Get vHD/CIM image path on Network Share.
     *
     * @return the imagePath value
     */
    public String imagePath() {
        return this.imagePath;
    }

    /**
     * Set vHD/CIM image path on Network Share.
     *
     * @param imagePath the imagePath value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    /**
     * Get package Name from appxmanifest.xml.
     *
     * @return the packageName value
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * Set package Name from appxmanifest.xml.
     *
     * @param packageName the packageName value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Get package Family Name from appxmanifest.xml. Contains Package Name and Publisher name.
     *
     * @return the packageFamilyName value
     */
    public String packageFamilyName() {
        return this.packageFamilyName;
    }

    /**
     * Set package Family Name from appxmanifest.xml. Contains Package Name and Publisher name.
     *
     * @param packageFamilyName the packageFamilyName value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withPackageFamilyName(String packageFamilyName) {
        this.packageFamilyName = packageFamilyName;
        return this;
    }

    /**
     * Get user friendly Name to be displayed in the portal.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set user friendly Name to be displayed in the portal.
     *
     * @param displayName the displayName value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get relative Path to the package inside the image.
     *
     * @return the packageRelativePath value
     */
    public String packageRelativePath() {
        return this.packageRelativePath;
    }

    /**
     * Set relative Path to the package inside the image.
     *
     * @param packageRelativePath the packageRelativePath value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withPackageRelativePath(String packageRelativePath) {
        this.packageRelativePath = packageRelativePath;
        return this;
    }

    /**
     * Get specifies how to register Package in feed.
     *
     * @return the isRegularRegistration value
     */
    public boolean isRegularRegistration() {
        return this.isRegularRegistration;
    }

    /**
     * Set specifies how to register Package in feed.
     *
     * @param isRegularRegistration the isRegularRegistration value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withIsRegularRegistration(boolean isRegularRegistration) {
        this.isRegularRegistration = isRegularRegistration;
        return this;
    }

    /**
     * Get make this version of the package the active one across the hostpool.
     *
     * @return the isActive value
     */
    public boolean isActive() {
        return this.isActive;
    }

    /**
     * Set make this version of the package the active one across the hostpool.
     *
     * @param isActive the isActive value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withIsActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get list of package dependencies.
     *
     * @return the packageDependencies value
     */
    public List<MsixPackageDependencies> packageDependencies() {
        return this.packageDependencies;
    }

    /**
     * Set list of package dependencies.
     *
     * @param packageDependencies the packageDependencies value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withPackageDependencies(List<MsixPackageDependencies> packageDependencies) {
        this.packageDependencies = packageDependencies;
        return this;
    }

    /**
     * Get package Version found in the appxmanifest.xml.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set package Version found in the appxmanifest.xml.
     *
     * @param version the version value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get date Package was last updated, found in the appxmanifest.xml.
     *
     * @return the lastUpdated value
     */
    public DateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set date Package was last updated, found in the appxmanifest.xml.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get list of package applications.
     *
     * @return the packageApplications value
     */
    public List<MsixPackageApplications> packageApplications() {
        return this.packageApplications;
    }

    /**
     * Set list of package applications.
     *
     * @param packageApplications the packageApplications value to set
     * @return the MSIXPackageInner object itself.
     */
    public MSIXPackageInner withPackageApplications(List<MsixPackageApplications> packageApplications) {
        this.packageApplications = packageApplications;
        return this;
    }

}
