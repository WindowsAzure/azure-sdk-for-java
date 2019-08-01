/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Email Template Parameter contract.
 */
public class EmailTemplateParametersContractProperties {
    /**
     * Template parameter name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Template parameter title.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Template parameter description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get template parameter name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set template parameter name.
     *
     * @param name the name value to set
     * @return the EmailTemplateParametersContractProperties object itself.
     */
    public EmailTemplateParametersContractProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get template parameter title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set template parameter title.
     *
     * @param title the title value to set
     * @return the EmailTemplateParametersContractProperties object itself.
     */
    public EmailTemplateParametersContractProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get template parameter description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set template parameter description.
     *
     * @param description the description value to set
     * @return the EmailTemplateParametersContractProperties object itself.
     */
    public EmailTemplateParametersContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

}
