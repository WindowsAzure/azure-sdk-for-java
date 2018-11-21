/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.textanalytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EntityRecordV2dot1 model.
 */
public class EntityRecordV2dot1 {
    /**
     * Entity formal name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * List of instances this entity appears in the text.
     */
    @JsonProperty(value = "matches")
    private List<MatchRecordV2dot1> matches;

    /**
     * Wikipedia language for which the WikipediaId and WikipediaUrl refers to.
     */
    @JsonProperty(value = "wikipediaLanguage")
    private String wikipediaLanguage;

    /**
     * Wikipedia unique identifier of the recognized entity.
     */
    @JsonProperty(value = "wikipediaId")
    private String wikipediaId;

    /**
     * URL for the entity's English Wikipedia page.
     */
    @JsonProperty(value = "wikipediaUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String wikipediaUrl;

    /**
     * Bing unique identifier of the recognized entity. Use in conjunction with
     * the Bing Entity Search API to fetch additional relevant information.
     */
    @JsonProperty(value = "bingId")
    private String bingId;

    /**
     * Entity type from Named Entity Recognition model.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Entity sub type from Named Entity Recognition model.
     */
    @JsonProperty(value = "subType")
    private String subType;

    /**
     * Get entity formal name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set entity formal name.
     *
     * @param name the name value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get list of instances this entity appears in the text.
     *
     * @return the matches value
     */
    public List<MatchRecordV2dot1> matches() {
        return this.matches;
    }

    /**
     * Set list of instances this entity appears in the text.
     *
     * @param matches the matches value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withMatches(List<MatchRecordV2dot1> matches) {
        this.matches = matches;
        return this;
    }

    /**
     * Get wikipedia language for which the WikipediaId and WikipediaUrl refers to.
     *
     * @return the wikipediaLanguage value
     */
    public String wikipediaLanguage() {
        return this.wikipediaLanguage;
    }

    /**
     * Set wikipedia language for which the WikipediaId and WikipediaUrl refers to.
     *
     * @param wikipediaLanguage the wikipediaLanguage value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withWikipediaLanguage(String wikipediaLanguage) {
        this.wikipediaLanguage = wikipediaLanguage;
        return this;
    }

    /**
     * Get wikipedia unique identifier of the recognized entity.
     *
     * @return the wikipediaId value
     */
    public String wikipediaId() {
        return this.wikipediaId;
    }

    /**
     * Set wikipedia unique identifier of the recognized entity.
     *
     * @param wikipediaId the wikipediaId value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withWikipediaId(String wikipediaId) {
        this.wikipediaId = wikipediaId;
        return this;
    }

    /**
     * Get uRL for the entity's English Wikipedia page.
     *
     * @return the wikipediaUrl value
     */
    public String wikipediaUrl() {
        return this.wikipediaUrl;
    }

    /**
     * Get bing unique identifier of the recognized entity. Use in conjunction with the Bing Entity Search API to fetch additional relevant information.
     *
     * @return the bingId value
     */
    public String bingId() {
        return this.bingId;
    }

    /**
     * Set bing unique identifier of the recognized entity. Use in conjunction with the Bing Entity Search API to fetch additional relevant information.
     *
     * @param bingId the bingId value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withBingId(String bingId) {
        this.bingId = bingId;
        return this;
    }

    /**
     * Get entity type from Named Entity Recognition model.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set entity type from Named Entity Recognition model.
     *
     * @param type the type value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get entity sub type from Named Entity Recognition model.
     *
     * @return the subType value
     */
    public String subType() {
        return this.subType;
    }

    /**
     * Set entity sub type from Named Entity Recognition model.
     *
     * @param subType the subType value to set
     * @return the EntityRecordV2dot1 object itself.
     */
    public EntityRecordV2dot1 withSubType(String subType) {
        this.subType = subType;
        return this;
    }

}
