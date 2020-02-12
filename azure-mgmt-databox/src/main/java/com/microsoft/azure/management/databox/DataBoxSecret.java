/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The secrets related to a DataBox.
 */
public class DataBoxSecret {
    /**
     * Serial number of the assigned device.
     */
    @JsonProperty(value = "deviceSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceSerialNumber;

    /**
     * Password for out of the box experience on device.
     */
    @JsonProperty(value = "devicePassword", access = JsonProperty.Access.WRITE_ONLY)
    private String devicePassword;

    /**
     * Network configuration of the appliance.
     */
    @JsonProperty(value = "networkConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplianceNetworkConfiguration> networkConfigurations;

    /**
     * The base 64 encoded public key to authenticate with the device.
     */
    @JsonProperty(value = "encodedValidationCertPubKey", access = JsonProperty.Access.WRITE_ONLY)
    private String encodedValidationCertPubKey;

    /**
     * Per account level access credentials.
     */
    @JsonProperty(value = "accountCredentialDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<AccountCredentialDetails> accountCredentialDetails;

    /**
     * Get serial number of the assigned device.
     *
     * @return the deviceSerialNumber value
     */
    public String deviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    /**
     * Get password for out of the box experience on device.
     *
     * @return the devicePassword value
     */
    public String devicePassword() {
        return this.devicePassword;
    }

    /**
     * Get network configuration of the appliance.
     *
     * @return the networkConfigurations value
     */
    public List<ApplianceNetworkConfiguration> networkConfigurations() {
        return this.networkConfigurations;
    }

    /**
     * Get the base 64 encoded public key to authenticate with the device.
     *
     * @return the encodedValidationCertPubKey value
     */
    public String encodedValidationCertPubKey() {
        return this.encodedValidationCertPubKey;
    }

    /**
     * Get per account level access credentials.
     *
     * @return the accountCredentialDetails value
     */
    public List<AccountCredentialDetails> accountCredentialDetails() {
        return this.accountCredentialDetails;
    }

}
