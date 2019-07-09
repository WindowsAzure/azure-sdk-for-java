/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disk Details.
 */
public class OSDetails {
    /**
     * VM Disk details.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * Product type.
     */
    @JsonProperty(value = "productType")
    private String productType;

    /**
     * The OSEdition.
     */
    @JsonProperty(value = "osEdition")
    private String osEdition;

    /**
     * The OS Version.
     */
    @JsonProperty(value = "oSVersion")
    private String oSVersion;

    /**
     * The OS Major Version.
     */
    @JsonProperty(value = "oSMajorVersion")
    private String oSMajorVersion;

    /**
     * The OS Minor Version.
     */
    @JsonProperty(value = "oSMinorVersion")
    private String oSMinorVersion;

    /**
     * Get vM Disk details.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set vM Disk details.
     *
     * @param osType the osType value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get product type.
     *
     * @return the productType value
     */
    public String productType() {
        return this.productType;
    }

    /**
     * Set product type.
     *
     * @param productType the productType value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get the OSEdition.
     *
     * @return the osEdition value
     */
    public String osEdition() {
        return this.osEdition;
    }

    /**
     * Set the OSEdition.
     *
     * @param osEdition the osEdition value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOsEdition(String osEdition) {
        this.osEdition = osEdition;
        return this;
    }

    /**
     * Get the OS Version.
     *
     * @return the oSVersion value
     */
    public String oSVersion() {
        return this.oSVersion;
    }

    /**
     * Set the OS Version.
     *
     * @param oSVersion the oSVersion value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOSVersion(String oSVersion) {
        this.oSVersion = oSVersion;
        return this;
    }

    /**
     * Get the OS Major Version.
     *
     * @return the oSMajorVersion value
     */
    public String oSMajorVersion() {
        return this.oSMajorVersion;
    }

    /**
     * Set the OS Major Version.
     *
     * @param oSMajorVersion the oSMajorVersion value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOSMajorVersion(String oSMajorVersion) {
        this.oSMajorVersion = oSMajorVersion;
        return this;
    }

    /**
     * Get the OS Minor Version.
     *
     * @return the oSMinorVersion value
     */
    public String oSMinorVersion() {
        return this.oSMinorVersion;
    }

    /**
     * Set the OS Minor Version.
     *
     * @param oSMinorVersion the oSMinorVersion value to set
     * @return the OSDetails object itself.
     */
    public OSDetails withOSMinorVersion(String oSMinorVersion) {
        this.oSMinorVersion = oSMinorVersion;
        return this;
    }

}
