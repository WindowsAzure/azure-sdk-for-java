// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SAS definition update parameters.
 */
public class SasDefinitionUpdateParameters {
    /**
     * The SAS definition token template signed with an arbitrary key.  Tokens
     * created according to the SAS definition will have the same properties as
     * the template.
     */
    @JsonProperty(value = "templateUri")
    private String templateUri;

    /**
     * The type of SAS token the SAS definition will create. Possible values
     * include: 'account', 'service'.
     */
    @JsonProperty(value = "sasType")
    private SasTokenType sasType;

    /**
     * The validity period of SAS tokens created according to the SAS
     * definition.
     */
    @JsonProperty(value = "validityPeriod")
    private String validityPeriod;

    /**
     * The attributes of the SAS definition.
     */
    @JsonProperty(value = "attributes")
    private SasDefinitionAttributes sasDefinitionAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the templateUri value.
     *
     * @return the templateUri value
     */
    public String templateUri() {
        return this.templateUri;
    }

    /**
     * Set the templateUri value.
     *
     * @param templateUri the templateUri value to set
     * @return the SasDefinitionUpdateParameters object itself.
     */
    public SasDefinitionUpdateParameters withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    /**
     * Get the sasType value.
     *
     * @return the sasType value
     */
    public SasTokenType sasType() {
        return this.sasType;
    }

    /**
     * Set the sasType value.
     *
     * @param sasType the sasType value to set
     * @return the SasDefinitionUpdateParameters object itself.
     */
    public SasDefinitionUpdateParameters withSasType(SasTokenType sasType) {
        this.sasType = sasType;
        return this;
    }

    /**
     * Get the validityPeriod value.
     *
     * @return the validityPeriod value
     */
    public String validityPeriod() {
        return this.validityPeriod;
    }

    /**
     * Set the validityPeriod value.
     *
     * @param validityPeriod the validityPeriod value to set
     * @return the SasDefinitionUpdateParameters object itself.
     */
    public SasDefinitionUpdateParameters withValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Get the sasDefinitionAttributes value.
     *
     * @return the sasDefinitionAttributes value
     */
    public SasDefinitionAttributes sasDefinitionAttributes() {
        return this.sasDefinitionAttributes;
    }

    /**
     * Set the sasDefinitionAttributes value.
     *
     * @param sasDefinitionAttributes the sasDefinitionAttributes value to set
     * @return the SasDefinitionUpdateParameters object itself.
     */
    public SasDefinitionUpdateParameters withSasDefinitionAttributes(SasDefinitionAttributes sasDefinitionAttributes) {
        this.sasDefinitionAttributes = sasDefinitionAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the SasDefinitionUpdateParameters object itself.
     */
    public SasDefinitionUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
