/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation request/response representation details.
 */
public class RepresentationContract {
    /**
     * Specifies a registered or custom content type for this representation,
     * e.g. application/xml.
     */
    @JsonProperty(value = "contentType", required = true)
    private String contentType;

    /**
     * An example of the representation.
     */
    @JsonProperty(value = "sample")
    private String sample;

    /**
     * Schema identifier. Applicable only if 'contentType' value is neither
     * 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     */
    @JsonProperty(value = "schemaId")
    private String schemaId;

    /**
     * Type name defined by the schema. Applicable only if 'contentType' value
     * is neither 'application/x-www-form-urlencoded' nor
     * 'multipart/form-data'.
     */
    @JsonProperty(value = "typeName")
    private String typeName;

    /**
     * Collection of form parameters. Required if 'contentType' value is either
     * 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     */
    @JsonProperty(value = "formParameters")
    private List<ParameterContract> formParameters;

    /**
     * Get specifies a registered or custom content type for this representation, e.g. application/xml.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set specifies a registered or custom content type for this representation, e.g. application/xml.
     *
     * @param contentType the contentType value to set
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get an example of the representation.
     *
     * @return the sample value
     */
    public String sample() {
        return this.sample;
    }

    /**
     * Set an example of the representation.
     *
     * @param sample the sample value to set
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withSample(String sample) {
        this.sample = sample;
        return this;
    }

    /**
     * Get schema identifier. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @return the schemaId value
     */
    public String schemaId() {
        return this.schemaId;
    }

    /**
     * Set schema identifier. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @param schemaId the schemaId value to set
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * Get type name defined by the schema. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @return the typeName value
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set type name defined by the schema. Applicable only if 'contentType' value is neither 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @param typeName the typeName value to set
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get collection of form parameters. Required if 'contentType' value is either 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     *
     * @return the formParameters value
     */
    public List<ParameterContract> formParameters() {
        return this.formParameters;
    }

    /**
     * Set collection of form parameters. Required if 'contentType' value is either 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     *
     * @param formParameters the formParameters value to set
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withFormParameters(List<ParameterContract> formParameters) {
        this.formParameters = formParameters;
        return this;
    }

}
