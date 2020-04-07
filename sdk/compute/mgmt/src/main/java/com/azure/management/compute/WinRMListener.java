// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WinRMListener model.
 */
@Fluent
public final class WinRMListener {
    /*
     * Specifies the protocol of listener. <br><br> Possible values are:
     * <br>**http** <br><br> **https**
     */
    @JsonProperty(value = "protocol")
    private ProtocolTypes protocol;

    /*
     * This is the URL of a certificate that has been uploaded to Key Vault as
     * a secret. For adding a secret to the Key Vault, see [Add a key or secret
     * to the key
     * vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br>  "data":"<Base64-encoded-certificate>",<br>  "dataType":"pfx",<br>  "password":"<pfx-file-password>"<br>}
     */
    @JsonProperty(value = "certificateUrl")
    private String certificateUrl;

    /**
     * Get the protocol property: Specifies the protocol of listener.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;**http**
     * &lt;br&gt;&lt;br&gt; **https**.
     * 
     * @return the protocol value.
     */
    public ProtocolTypes protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Specifies the protocol of listener.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;**http**
     * &lt;br&gt;&lt;br&gt; **https**.
     * 
     * @param protocol the protocol value to set.
     * @return the WinRMListener object itself.
     */
    public WinRMListener withProtocol(ProtocolTypes protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the certificateUrl property: This is the URL of a certificate that
     * has been uploaded to Key Vault as a secret. For adding a secret to the
     * Key Vault, see [Add a key or secret to the key
     * vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: &lt;br&gt;&lt;br&gt; {&lt;br&gt;  "data":"&lt;Base64-encoded-certificate&gt;",&lt;br&gt;  "dataType":"pfx",&lt;br&gt;  "password":"&lt;pfx-file-password&gt;"&lt;br&gt;}.
     * 
     * @return the certificateUrl value.
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl property: This is the URL of a certificate that
     * has been uploaded to Key Vault as a secret. For adding a secret to the
     * Key Vault, see [Add a key or secret to the key
     * vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: &lt;br&gt;&lt;br&gt; {&lt;br&gt;  "data":"&lt;Base64-encoded-certificate&gt;",&lt;br&gt;  "dataType":"pfx",&lt;br&gt;  "password":"&lt;pfx-file-password&gt;"&lt;br&gt;}.
     * 
     * @param certificateUrl the certificateUrl value to set.
     * @return the WinRMListener object itself.
     */
    public WinRMListener withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
}
