/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MachineKey of an app.
 */
public class SiteMachineKey {
    /**
     * MachineKey validation.
     */
    @JsonProperty(value = "validation")
    private String validation;

    /**
     * Validation key.
     */
    @JsonProperty(value = "validationKey")
    private String validationKey;

    /**
     * Algorithm used for decryption.
     */
    @JsonProperty(value = "decryption")
    private String decryption;

    /**
     * Decryption key.
     */
    @JsonProperty(value = "decryptionKey")
    private String decryptionKey;

    /**
     * Get machineKey validation.
     *
     * @return the validation value
     */
    public String validation() {
        return this.validation;
    }

    /**
     * Set machineKey validation.
     *
     * @param validation the validation value to set
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withValidation(String validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Get validation key.
     *
     * @return the validationKey value
     */
    public String validationKey() {
        return this.validationKey;
    }

    /**
     * Set validation key.
     *
     * @param validationKey the validationKey value to set
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withValidationKey(String validationKey) {
        this.validationKey = validationKey;
        return this;
    }

    /**
     * Get algorithm used for decryption.
     *
     * @return the decryption value
     */
    public String decryption() {
        return this.decryption;
    }

    /**
     * Set algorithm used for decryption.
     *
     * @param decryption the decryption value to set
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withDecryption(String decryption) {
        this.decryption = decryption;
        return this;
    }

    /**
     * Get decryption key.
     *
     * @return the decryptionKey value
     */
    public String decryptionKey() {
        return this.decryptionKey;
    }

    /**
     * Set decryption key.
     *
     * @param decryptionKey the decryptionKey value to set
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withDecryptionKey(String decryptionKey) {
        this.decryptionKey = decryptionKey;
        return this;
    }

}
