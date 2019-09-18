// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.cryptography;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the encryption agent stored on the service. It consists of the encryption protocol version and encryption
 * algorithm used.
 */
final class EncryptionAgent {

    /**
     * The protocol version used for encryption.
     */
    @JsonProperty(value = "Protocol", required = true)
    private String protocol;

    /**
     * The algorithm used for encryption.
     */
    @JsonProperty(value = "EncryptionAlgorithm", required = true)
    private EncryptionAlgorithm algorithm;

    /**
     * Initializes a new instance of the {@link EncryptionAgent} class.
     */
    public EncryptionAgent() {
    }

    /**
     * Initializes a new instance of the {@link EncryptionAgent} class using the specified protocol version and the
     * algorithm.
     *
     * @param protocol
     *         The encryption protocol version.
     * @param algorithm
     *         The encryption algorithm.
     */
    public EncryptionAgent(String protocol, EncryptionAlgorithm algorithm) {
        this.protocol = protocol;
        this.algorithm = algorithm;
    }

    /**
     * Gets the protocol version used for encryption.
     *
     * @return The protocol version used for encryption.
     */
    public String protocol() {
        return protocol;
    }

    /**
     * Gets the algorithm used for encryption.
     *
     * @return The algorithm used for encryption.
     */
    public EncryptionAlgorithm algorithm() {
        return algorithm;
    }

    /**
     * Sets the protocol version used for encryption.
     *
     * @param protocol
     *         The protocol version used for encryption.
     *
     * @return this
     */
    public EncryptionAgent withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Sets the algorithm used for encryption.
     *
     * @param algorithm
     *         The algorithm used for encryption.
     *
     * @return this
     */
    public EncryptionAgent withAlgorithm(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }
}
