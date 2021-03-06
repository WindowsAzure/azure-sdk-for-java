/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.PublicCertificateLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Public certificate object.
 */
@JsonFlatten
public class PublicCertificateInner extends ProxyOnlyResource {
    /**
     * Public Certificate byte array.
     */
    @JsonProperty(value = "properties.blob")
    private byte[] blob;

    /**
     * Public Certificate Location. Possible values include: 'CurrentUserMy',
     * 'LocalMachineMy', 'Unknown'.
     */
    @JsonProperty(value = "properties.publicCertificateLocation")
    private PublicCertificateLocation publicCertificateLocation;

    /**
     * Certificate Thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Get public Certificate byte array.
     *
     * @return the blob value
     */
    public byte[] blob() {
        return this.blob;
    }

    /**
     * Set public Certificate byte array.
     *
     * @param blob the blob value to set
     * @return the PublicCertificateInner object itself.
     */
    public PublicCertificateInner withBlob(byte[] blob) {
        this.blob = blob;
        return this;
    }

    /**
     * Get public Certificate Location. Possible values include: 'CurrentUserMy', 'LocalMachineMy', 'Unknown'.
     *
     * @return the publicCertificateLocation value
     */
    public PublicCertificateLocation publicCertificateLocation() {
        return this.publicCertificateLocation;
    }

    /**
     * Set public Certificate Location. Possible values include: 'CurrentUserMy', 'LocalMachineMy', 'Unknown'.
     *
     * @param publicCertificateLocation the publicCertificateLocation value to set
     * @return the PublicCertificateInner object itself.
     */
    public PublicCertificateInner withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
        this.publicCertificateLocation = publicCertificateLocation;
        return this;
    }

    /**
     * Get certificate Thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

}
