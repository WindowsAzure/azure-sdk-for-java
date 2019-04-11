/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybriddata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The pair of customer secret.
 */
public class CustomerSecret {
    /**
     * The identifier to the data service input object which this secret
     * corresponds to.
     */
    @JsonProperty(value = "keyIdentifier", required = true)
    private String keyIdentifier;

    /**
     * It contains the encrypted customer secret.
     */
    @JsonProperty(value = "keyValue", required = true)
    private String keyValue;

    /**
     * The encryption algorithm used to encrypt data. Possible values include:
     * 'None', 'RSA1_5', 'RSA_OAEP', 'PlainText'.
     */
    @JsonProperty(value = "algorithm", required = true)
    private SupportedAlgorithm algorithm;

    /**
     * Get the identifier to the data service input object which this secret corresponds to.
     *
     * @return the keyIdentifier value
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the identifier to the data service input object which this secret corresponds to.
     *
     * @param keyIdentifier the keyIdentifier value to set
     * @return the CustomerSecret object itself.
     */
    public CustomerSecret withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get it contains the encrypted customer secret.
     *
     * @return the keyValue value
     */
    public String keyValue() {
        return this.keyValue;
    }

    /**
     * Set it contains the encrypted customer secret.
     *
     * @param keyValue the keyValue value to set
     * @return the CustomerSecret object itself.
     */
    public CustomerSecret withKeyValue(String keyValue) {
        this.keyValue = keyValue;
        return this;
    }

    /**
     * Get the encryption algorithm used to encrypt data. Possible values include: 'None', 'RSA1_5', 'RSA_OAEP', 'PlainText'.
     *
     * @return the algorithm value
     */
    public SupportedAlgorithm algorithm() {
        return this.algorithm;
    }

    /**
     * Set the encryption algorithm used to encrypt data. Possible values include: 'None', 'RSA1_5', 'RSA_OAEP', 'PlainText'.
     *
     * @param algorithm the algorithm value to set
     * @return the CustomerSecret object itself.
     */
    public CustomerSecret withAlgorithm(SupportedAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

}
