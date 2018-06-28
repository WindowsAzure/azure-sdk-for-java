/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters supplied to the update certificate operation.
 */
@JsonFlatten
public class CertificateUpdateParameters {
    /**
     * Gets or sets the name of the certificate.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets the description of the certificate.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get gets or sets the name of the certificate.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the certificate.
     *
     * @param name the name value to set
     * @return the CertificateUpdateParameters object itself.
     */
    public CertificateUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the description of the certificate.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description of the certificate.
     *
     * @param description the description value to set
     * @return the CertificateUpdateParameters object itself.
     */
    public CertificateUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

}
