/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.customsearch.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The CreativeWork model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("CreativeWork")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "WebPage", value = WebPage.class)
})
public class CreativeWork extends Thing {
    /**
     * The URL to a thumbnail of the item.
     */
    @JsonProperty(value = "thumbnailUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUrl;

    /**
     * The source of the creative work.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private List<Thing> provider;

    /**
     * The text property.
     */
    @JsonProperty(value = "text", access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /**
     * Get the URL to a thumbnail of the item.
     *
     * @return the thumbnailUrl value
     */
    public String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * Get the source of the creative work.
     *
     * @return the provider value
     */
    public List<Thing> provider() {
        return this.provider;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

}
