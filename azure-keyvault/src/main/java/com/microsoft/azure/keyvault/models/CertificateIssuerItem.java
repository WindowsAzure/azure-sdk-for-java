/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;


/**
 * The certificate issuer item containing certificate issuer metadata.
 */
public class CertificateIssuerItem {
    /**
     * Certificate Identifier.
     */
    private String id;

    /**
     * The name of the issuer.
     */
    private String provider;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CertificateIssuerItem object itself.
     */
    public CertificateIssuerItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider value.
     *
     * @param provider the provider value to set
     * @return the CertificateIssuerItem object itself.
     */
    public CertificateIssuerItem withProvider(String provider) {
        this.provider = provider;
        return this;
    }

}
