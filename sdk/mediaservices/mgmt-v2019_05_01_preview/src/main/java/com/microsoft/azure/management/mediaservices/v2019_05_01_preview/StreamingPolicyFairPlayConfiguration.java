/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to specify configurations of FairPlay in Streaming Policy.
 */
public class StreamingPolicyFairPlayConfiguration {
    /**
     * Template for the URL of the custom service delivering licenses to end
     * user players.  Not required when using Azure Media Services for issuing
     * licenses.  The template supports replaceable tokens that the service
     * will update at runtime with the value specific to the request.  The
     * currently supported token values are {AlternativeMediaId}, which is
     * replaced with the value of StreamingLocatorId.AlternativeMediaId, and
     * {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     */
    @JsonProperty(value = "customLicenseAcquisitionUrlTemplate")
    private String customLicenseAcquisitionUrlTemplate;

    /**
     * All license to be persistent or not.
     */
    @JsonProperty(value = "allowPersistentLicense", required = true)
    private boolean allowPersistentLicense;

    /**
     * Get template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     *
     * @return the customLicenseAcquisitionUrlTemplate value
     */
    public String customLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate;
    }

    /**
     * Set template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     *
     * @param customLicenseAcquisitionUrlTemplate the customLicenseAcquisitionUrlTemplate value to set
     * @return the StreamingPolicyFairPlayConfiguration object itself.
     */
    public StreamingPolicyFairPlayConfiguration withCustomLicenseAcquisitionUrlTemplate(String customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        return this;
    }

    /**
     * Get all license to be persistent or not.
     *
     * @return the allowPersistentLicense value
     */
    public boolean allowPersistentLicense() {
        return this.allowPersistentLicense;
    }

    /**
     * Set all license to be persistent or not.
     *
     * @param allowPersistentLicense the allowPersistentLicense value to set
     * @return the StreamingPolicyFairPlayConfiguration object itself.
     */
    public StreamingPolicyFairPlayConfiguration withAllowPersistentLicense(boolean allowPersistentLicense) {
        this.allowPersistentLicense = allowPersistentLicense;
        return this;
    }

}
