/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import com.microsoft.azure.management.iothub.v2019_03_22_preview.CertificateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * The X509 Certificate.
 */
public class CertificateDescriptionInner extends ProxyResource {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private CertificateProperties properties;

    /**
     * The entity tag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public CertificateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the CertificateDescriptionInner object itself.
     */
    public CertificateDescriptionInner withProperties(CertificateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the entity tag.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
