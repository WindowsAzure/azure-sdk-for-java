/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.autosuggest.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The most generic kind of creative work, including books, movies,
 * photographs, software programs, etc.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = CreativeWork.class)
@JsonTypeName("CreativeWork")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Action", value = Action.class)
})
public class CreativeWork extends Thing {
    /**
     * The URL to a thumbnail of the item.
     */
    @JsonProperty(value = "thumbnailUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUrl;

    /**
     * For internal use only.
     */
    @JsonProperty(value = "about", access = JsonProperty.Access.WRITE_ONLY)
    private List<Thing> about;

    /**
     * For internal use only.
     */
    @JsonProperty(value = "mentions", access = JsonProperty.Access.WRITE_ONLY)
    private List<Thing> mentions;

    /**
     * The source of the creative work.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private List<Thing> provider;

    /**
     * The creator property.
     */
    @JsonProperty(value = "creator", access = JsonProperty.Access.WRITE_ONLY)
    private Thing creator;

    /**
     * Text content of this creative work.
     */
    @JsonProperty(value = "text", access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /**
     * The discussionUrl property.
     */
    @JsonProperty(value = "discussionUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String discussionUrl;

    /**
     * The commentCount property.
     */
    @JsonProperty(value = "commentCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer commentCount;

    /**
     * The mainEntity property.
     */
    @JsonProperty(value = "mainEntity", access = JsonProperty.Access.WRITE_ONLY)
    private Thing mainEntity;

    /**
     * The headLine property.
     */
    @JsonProperty(value = "headLine", access = JsonProperty.Access.WRITE_ONLY)
    private String headLine;

    /**
     * The copyrightHolder property.
     */
    @JsonProperty(value = "copyrightHolder", access = JsonProperty.Access.WRITE_ONLY)
    private Thing copyrightHolder;

    /**
     * The copyrightYear property.
     */
    @JsonProperty(value = "copyrightYear", access = JsonProperty.Access.WRITE_ONLY)
    private Integer copyrightYear;

    /**
     * The disclaimer property.
     */
    @JsonProperty(value = "disclaimer", access = JsonProperty.Access.WRITE_ONLY)
    private String disclaimer;

    /**
     * The isAccessibleForFree property.
     */
    @JsonProperty(value = "isAccessibleForFree", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAccessibleForFree;

    /**
     * The genre property.
     */
    @JsonProperty(value = "genre", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> genre;

    /**
     * The isFamilyFriendly property.
     */
    @JsonProperty(value = "isFamilyFriendly", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFamilyFriendly;

    /**
     * Get the thumbnailUrl value.
     *
     * @return the thumbnailUrl value
     */
    public String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * Get the about value.
     *
     * @return the about value
     */
    public List<Thing> about() {
        return this.about;
    }

    /**
     * Get the mentions value.
     *
     * @return the mentions value
     */
    public List<Thing> mentions() {
        return this.mentions;
    }

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public List<Thing> provider() {
        return this.provider;
    }

    /**
     * Get the creator value.
     *
     * @return the creator value
     */
    public Thing creator() {
        return this.creator;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Get the discussionUrl value.
     *
     * @return the discussionUrl value
     */
    public String discussionUrl() {
        return this.discussionUrl;
    }

    /**
     * Get the commentCount value.
     *
     * @return the commentCount value
     */
    public Integer commentCount() {
        return this.commentCount;
    }

    /**
     * Get the mainEntity value.
     *
     * @return the mainEntity value
     */
    public Thing mainEntity() {
        return this.mainEntity;
    }

    /**
     * Get the headLine value.
     *
     * @return the headLine value
     */
    public String headLine() {
        return this.headLine;
    }

    /**
     * Get the copyrightHolder value.
     *
     * @return the copyrightHolder value
     */
    public Thing copyrightHolder() {
        return this.copyrightHolder;
    }

    /**
     * Get the copyrightYear value.
     *
     * @return the copyrightYear value
     */
    public Integer copyrightYear() {
        return this.copyrightYear;
    }

    /**
     * Get the disclaimer value.
     *
     * @return the disclaimer value
     */
    public String disclaimer() {
        return this.disclaimer;
    }

    /**
     * Get the isAccessibleForFree value.
     *
     * @return the isAccessibleForFree value
     */
    public Boolean isAccessibleForFree() {
        return this.isAccessibleForFree;
    }

    /**
     * Get the genre value.
     *
     * @return the genre value
     */
    public List<String> genre() {
        return this.genre;
    }

    /**
     * Get the isFamilyFriendly value.
     *
     * @return the isFamilyFriendly value
     */
    public Boolean isFamilyFriendly() {
        return this.isFamilyFriendly;
    }

}
