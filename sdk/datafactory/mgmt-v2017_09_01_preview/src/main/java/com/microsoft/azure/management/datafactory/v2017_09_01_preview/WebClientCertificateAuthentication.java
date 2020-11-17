/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A WebLinkedService that uses client certificate based authentication to
 * communicate with an HTTP endpoint. This scheme follows mutual
 * authentication; the server must also provide valid credentials to the
 * client.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authenticationType", defaultImpl = WebClientCertificateAuthentication.class)
@JsonTypeName("ClientCertificate")
public class WebClientCertificateAuthentication extends WebLinkedServiceTypeProperties {
    /**
     * Base64-encoded contents of a PFX file.
     */
    @JsonProperty(value = "pfx", required = true)
    private SecretBase pfx;

    /**
     * Password for the PFX file.
     */
    @JsonProperty(value = "password", required = true)
    private SecretBase password;

    /**
     * Get base64-encoded contents of a PFX file.
     *
     * @return the pfx value
     */
    public SecretBase pfx() {
        return this.pfx;
    }

    /**
     * Set base64-encoded contents of a PFX file.
     *
     * @param pfx the pfx value to set
     * @return the WebClientCertificateAuthentication object itself.
     */
    public WebClientCertificateAuthentication withPfx(SecretBase pfx) {
        this.pfx = pfx;
        return this;
    }

    /**
     * Get password for the PFX file.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for the PFX file.
     *
     * @param password the password value to set
     * @return the WebClientCertificateAuthentication object itself.
     */
    public WebClientCertificateAuthentication withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

}
