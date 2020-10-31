/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The security settings of a device.
 */
@JsonFlatten
public class SecuritySettings extends ARMBaseModel {
    /**
     * Device administrator password as an encrypted string (encrypted using
     * RSA PKCS #1) is used to sign into the  local web UI of the device. The
     * Actual password should have at least 8 characters that are a combination
     * of  uppercase, lowercase, numeric, and special characters.
     */
    @JsonProperty(value = "properties.deviceAdminPassword", required = true)
    private AsymmetricEncryptedSecret deviceAdminPassword;

    /**
     * Get device administrator password as an encrypted string (encrypted using RSA PKCS #1) is used to sign into the  local web UI of the device. The Actual password should have at least 8 characters that are a combination of  uppercase, lowercase, numeric, and special characters.
     *
     * @return the deviceAdminPassword value
     */
    public AsymmetricEncryptedSecret deviceAdminPassword() {
        return this.deviceAdminPassword;
    }

    /**
     * Set device administrator password as an encrypted string (encrypted using RSA PKCS #1) is used to sign into the  local web UI of the device. The Actual password should have at least 8 characters that are a combination of  uppercase, lowercase, numeric, and special characters.
     *
     * @param deviceAdminPassword the deviceAdminPassword value to set
     * @return the SecuritySettings object itself.
     */
    public SecuritySettings withDeviceAdminPassword(AsymmetricEncryptedSecret deviceAdminPassword) {
        this.deviceAdminPassword = deviceAdminPassword;
        return this;
    }

}
