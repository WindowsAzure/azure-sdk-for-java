/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An app cloneability criterion.
 */
public class SiteCloneabilityCriterion {
    /**
     * Name of criterion.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of criterion.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get name of criterion.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of criterion.
     *
     * @param name the name value to set
     * @return the SiteCloneabilityCriterion object itself.
     */
    public SiteCloneabilityCriterion withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description of criterion.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of criterion.
     *
     * @param description the description value to set
     * @return the SiteCloneabilityCriterion object itself.
     */
    public SiteCloneabilityCriterion withDescription(String description) {
        this.description = description;
        return this;
    }

}
