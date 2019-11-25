/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Protocol and thumbprint of Windows Remote Management listener.
 */
public class WinRMListener {
    /**
     * Specifies the protocol of listener. &lt;br&gt;&lt;br&gt; Possible values
     * are: &lt;br&gt;**http** &lt;br&gt;&lt;br&gt; **https**. Possible values
     * include: 'Http', 'Https'.
     */
    @JsonProperty(value = "protocol")
    private ProtocolTypes protocol;

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as
     * a secret. For adding a secret to the Key Vault, see [Add a key or secret
     * to the key
     * vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add).
     * In this case, your certificate needs to be It is the Base64 encoding of
     * the following JSON Object which is encoded in UTF-8:
     * &lt;br&gt;&lt;br&gt; {&lt;br&gt;
     * "data":"&lt;Base64-encoded-certificate&gt;",&lt;br&gt;
     * "dataType":"pfx",&lt;br&gt;
     * "password":"&lt;pfx-file-password&gt;"&lt;br&gt;}.
     */
    @JsonProperty(value = "certificateUrl")
    private String certificateUrl;

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public ProtocolTypes protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the WinRMListener object itself.
     */
    public WinRMListener withProtocol(ProtocolTypes protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the certificateUrl value.
     *
     * @return the certificateUrl value
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl value.
     *
     * @param certificateUrl the certificateUrl value to set
     * @return the WinRMListener object itself.
     */
    public WinRMListener withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

}
