/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a contractual rule for link attribution.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("ContractualRules/LinkAttribution")
public class ContractualRulesLinkAttribution extends ContractualRulesAttribution {
    /**
     * The attribution text.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /**
     * The URL to the provider's website. Use text and URL to create the
     * hyperlink.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Indicates whether this provider's attribution is optional.
     */
    @JsonProperty(value = "optionalForListDisplay", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean optionalForListDisplay;

    /**
     * Get the attribution text.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the attribution text.
     *
     * @param text the text value to set
     * @return the ContractualRulesLinkAttribution object itself.
     */
    public ContractualRulesLinkAttribution withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the URL to the provider's website. Use text and URL to create the hyperlink.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the URL to the provider's website. Use text and URL to create the hyperlink.
     *
     * @param url the url value to set
     * @return the ContractualRulesLinkAttribution object itself.
     */
    public ContractualRulesLinkAttribution withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get indicates whether this provider's attribution is optional.
     *
     * @return the optionalForListDisplay value
     */
    public Boolean optionalForListDisplay() {
        return this.optionalForListDisplay;
    }

}
