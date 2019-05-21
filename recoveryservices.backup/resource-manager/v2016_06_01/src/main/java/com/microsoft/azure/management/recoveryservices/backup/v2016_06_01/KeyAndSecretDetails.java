/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BEK stands for Bitlocker Encryption Key.
 * KEK stands for Key Encryption Key. KEK is the encryption key used to protect
 * the Secret for the BEK
 * If the VM is encrypted, then the service stores the following details :
 * 1. Secret(BEK) - Url + Backup Data + vaultID.
 * 2. Key(KEK) - Url + Backup Data + vaultID.
 * It is possible for the BEK and KEK to have different vaultIDs.
 */
public class KeyAndSecretDetails {
    /**
     * The Key Encryption Key (KEK) is the encryption key for the Bitlocker
     * Encryption Key (BEK).
     */
    @JsonProperty(value = "kekDetails")
    private KEKDetails kekDetails;

    /**
     * BEK is Bitlocker Encryption Key.
     */
    @JsonProperty(value = "bekDetails")
    private BEKDetails bekDetails;

    /**
     * Get the Key Encryption Key (KEK) is the encryption key for the Bitlocker Encryption Key (BEK).
     *
     * @return the kekDetails value
     */
    public KEKDetails kekDetails() {
        return this.kekDetails;
    }

    /**
     * Set the Key Encryption Key (KEK) is the encryption key for the Bitlocker Encryption Key (BEK).
     *
     * @param kekDetails the kekDetails value to set
     * @return the KeyAndSecretDetails object itself.
     */
    public KeyAndSecretDetails withKekDetails(KEKDetails kekDetails) {
        this.kekDetails = kekDetails;
        return this;
    }

    /**
     * Get bEK is Bitlocker Encryption Key.
     *
     * @return the bekDetails value
     */
    public BEKDetails bekDetails() {
        return this.bekDetails;
    }

    /**
     * Set bEK is Bitlocker Encryption Key.
     *
     * @param bekDetails the bekDetails value to set
     * @return the KeyAndSecretDetails object itself.
     */
    public KeyAndSecretDetails withBekDetails(BEKDetails bekDetails) {
        this.bekDetails = bekDetails;
        return this;
    }

}
