/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement security settings.
 */
public class AS2SecuritySettings {
    /**
     * The value indicating whether to send or request a MDN.
     */
    @JsonProperty(value = "overrideGroupSigningCertificate", required = true)
    private boolean overrideGroupSigningCertificate;

    /**
     * The name of the signing certificate.
     */
    @JsonProperty(value = "signingCertificateName")
    private String signingCertificateName;

    /**
     * The name of the encryption certificate.
     */
    @JsonProperty(value = "encryptionCertificateName")
    private String encryptionCertificateName;

    /**
     * The value indicating whether to enable NRR for inbound encoded messages.
     */
    @JsonProperty(value = "enableNRRForInboundEncodedMessages", required = true)
    private boolean enableNRRForInboundEncodedMessages;

    /**
     * The value indicating whether to enable NRR for inbound decoded messages.
     */
    @JsonProperty(value = "enableNRRForInboundDecodedMessages", required = true)
    private boolean enableNRRForInboundDecodedMessages;

    /**
     * The value indicating whether to enable NRR for outbound MDN.
     */
    @JsonProperty(value = "enableNRRForOutboundMDN", required = true)
    private boolean enableNRRForOutboundMDN;

    /**
     * The value indicating whether to enable NRR for outbound encoded
     * messages.
     */
    @JsonProperty(value = "enableNRRForOutboundEncodedMessages", required = true)
    private boolean enableNRRForOutboundEncodedMessages;

    /**
     * The value indicating whether to enable NRR for outbound decoded
     * messages.
     */
    @JsonProperty(value = "enableNRRForOutboundDecodedMessages", required = true)
    private boolean enableNRRForOutboundDecodedMessages;

    /**
     * The value indicating whether to enable NRR for inbound MDN.
     */
    @JsonProperty(value = "enableNRRForInboundMDN", required = true)
    private boolean enableNRRForInboundMDN;

    /**
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize,
     * ShaHyphenHashSize, Sha2UnderscoreHashSize.
     */
    @JsonProperty(value = "sha2AlgorithmFormat")
    private String sha2AlgorithmFormat;

    /**
     * Get the value indicating whether to send or request a MDN.
     *
     * @return the overrideGroupSigningCertificate value
     */
    public boolean overrideGroupSigningCertificate() {
        return this.overrideGroupSigningCertificate;
    }

    /**
     * Set the value indicating whether to send or request a MDN.
     *
     * @param overrideGroupSigningCertificate the overrideGroupSigningCertificate value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withOverrideGroupSigningCertificate(boolean overrideGroupSigningCertificate) {
        this.overrideGroupSigningCertificate = overrideGroupSigningCertificate;
        return this;
    }

    /**
     * Get the name of the signing certificate.
     *
     * @return the signingCertificateName value
     */
    public String signingCertificateName() {
        return this.signingCertificateName;
    }

    /**
     * Set the name of the signing certificate.
     *
     * @param signingCertificateName the signingCertificateName value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withSigningCertificateName(String signingCertificateName) {
        this.signingCertificateName = signingCertificateName;
        return this;
    }

    /**
     * Get the name of the encryption certificate.
     *
     * @return the encryptionCertificateName value
     */
    public String encryptionCertificateName() {
        return this.encryptionCertificateName;
    }

    /**
     * Set the name of the encryption certificate.
     *
     * @param encryptionCertificateName the encryptionCertificateName value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEncryptionCertificateName(String encryptionCertificateName) {
        this.encryptionCertificateName = encryptionCertificateName;
        return this;
    }

    /**
     * Get the value indicating whether to enable NRR for inbound encoded messages.
     *
     * @return the enableNRRForInboundEncodedMessages value
     */
    public boolean enableNRRForInboundEncodedMessages() {
        return this.enableNRRForInboundEncodedMessages;
    }

    /**
     * Set the value indicating whether to enable NRR for inbound encoded messages.
     *
     * @param enableNRRForInboundEncodedMessages the enableNRRForInboundEncodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNRRForInboundEncodedMessages(boolean enableNRRForInboundEncodedMessages) {
        this.enableNRRForInboundEncodedMessages = enableNRRForInboundEncodedMessages;
        return this;
    }

    /**
     * Get the value indicating whether to enable NRR for inbound decoded messages.
     *
     * @return the enableNRRForInboundDecodedMessages value
     */
    public boolean enableNRRForInboundDecodedMessages() {
        return this.enableNRRForInboundDecodedMessages;
    }

    /**
     * Set the value indicating whether to enable NRR for inbound decoded messages.
     *
     * @param enableNRRForInboundDecodedMessages the enableNRRForInboundDecodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNRRForInboundDecodedMessages(boolean enableNRRForInboundDecodedMessages) {
        this.enableNRRForInboundDecodedMessages = enableNRRForInboundDecodedMessages;
        return this;
    }

    /**
     * Get the value indicating whether to enable NRR for outbound MDN.
     *
     * @return the enableNRRForOutboundMDN value
     */
    public boolean enableNRRForOutboundMDN() {
        return this.enableNRRForOutboundMDN;
    }

    /**
     * Set the value indicating whether to enable NRR for outbound MDN.
     *
     * @param enableNRRForOutboundMDN the enableNRRForOutboundMDN value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNRRForOutboundMDN(boolean enableNRRForOutboundMDN) {
        this.enableNRRForOutboundMDN = enableNRRForOutboundMDN;
        return this;
    }

    /**
     * Get the value indicating whether to enable NRR for outbound encoded messages.
     *
     * @return the enableNRRForOutboundEncodedMessages value
     */
    public boolean enableNRRForOutboundEncodedMessages() {
        return this.enableNRRForOutboundEncodedMessages;
    }

    /**
     * Set the value indicating whether to enable NRR for outbound encoded messages.
     *
     * @param enableNRRForOutboundEncodedMessages the enableNRRForOutboundEncodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNRRForOutboundEncodedMessages(boolean enableNRRForOutboundEncodedMessages) {
        this.enableNRRForOutboundEncodedMessages = enableNRRForOutboundEncodedMessages;
        return this;
    }

    /**
     * Get the value indicating whether to enable NRR for outbound decoded messages.
     *
     * @return the enableNRRForOutboundDecodedMessages value
     */
    public boolean enableNRRForOutboundDecodedMessages() {
        return this.enableNRRForOutboundDecodedMessages;
    }

    /**
     * Set the value indicating whether to enable NRR for outbound decoded messages.
     *
     * @param enableNRRForOutboundDecodedMessages the enableNRRForOutboundDecodedMessages value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNRRForOutboundDecodedMessages(boolean enableNRRForOutboundDecodedMessages) {
        this.enableNRRForOutboundDecodedMessages = enableNRRForOutboundDecodedMessages;
        return this;
    }

    /**
     * Get the value indicating whether to enable NRR for inbound MDN.
     *
     * @return the enableNRRForInboundMDN value
     */
    public boolean enableNRRForInboundMDN() {
        return this.enableNRRForInboundMDN;
    }

    /**
     * Set the value indicating whether to enable NRR for inbound MDN.
     *
     * @param enableNRRForInboundMDN the enableNRRForInboundMDN value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withEnableNRRForInboundMDN(boolean enableNRRForInboundMDN) {
        this.enableNRRForInboundMDN = enableNRRForInboundMDN;
        return this;
    }

    /**
     * Get the Sha2 algorithm format. Valid values are Sha2, ShaHashSize, ShaHyphenHashSize, Sha2UnderscoreHashSize.
     *
     * @return the sha2AlgorithmFormat value
     */
    public String sha2AlgorithmFormat() {
        return this.sha2AlgorithmFormat;
    }

    /**
     * Set the Sha2 algorithm format. Valid values are Sha2, ShaHashSize, ShaHyphenHashSize, Sha2UnderscoreHashSize.
     *
     * @param sha2AlgorithmFormat the sha2AlgorithmFormat value to set
     * @return the AS2SecuritySettings object itself.
     */
    public AS2SecuritySettings withSha2AlgorithmFormat(String sha2AlgorithmFormat) {
        this.sha2AlgorithmFormat = sha2AlgorithmFormat;
        return this;
    }

}
