/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2018_08_20_preview.implementation;

import com.microsoft.azure.management.healthcareapis.v2018_08_20_preview.ServicesProperties;
import com.microsoft.azure.management.healthcareapis.v2018_08_20_preview.Kind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The description of the service.
 */
public class ServicesDescriptionInner extends Resource {
    /**
     * The common properties of a service.
     */
    @JsonProperty(value = "properties")
    private ServicesProperties properties;

    /**
     * The kind of the service. Valid values are: fhir, fhir-Stu3 and fhir-R4.
     * Possible values include: 'fhir', 'fhir-Stu3', 'fhir-R4'.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /**
     * An etag associated with the resource, used for optimistic concurrency
     * when editing it.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the common properties of a service.
     *
     * @return the properties value
     */
    public ServicesProperties properties() {
        return this.properties;
    }

    /**
     * Set the common properties of a service.
     *
     * @param properties the properties value to set
     * @return the ServicesDescriptionInner object itself.
     */
    public ServicesDescriptionInner withProperties(ServicesProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the kind of the service. Valid values are: fhir, fhir-Stu3 and fhir-R4. Possible values include: 'fhir', 'fhir-Stu3', 'fhir-R4'.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind of the service. Valid values are: fhir, fhir-Stu3 and fhir-R4. Possible values include: 'fhir', 'fhir-Stu3', 'fhir-R4'.
     *
     * @param kind the kind value to set
     * @return the ServicesDescriptionInner object itself.
     */
    public ServicesDescriptionInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get an etag associated with the resource, used for optimistic concurrency when editing it.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set an etag associated with the resource, used for optimistic concurrency when editing it.
     *
     * @param etag the etag value to set
     * @return the ServicesDescriptionInner object itself.
     */
    public ServicesDescriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
