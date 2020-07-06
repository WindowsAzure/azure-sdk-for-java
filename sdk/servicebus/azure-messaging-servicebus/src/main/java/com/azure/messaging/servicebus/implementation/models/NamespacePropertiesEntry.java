// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;

/** The NamespacePropertiesEntry model. */
@JacksonXmlRootElement(localName = "entry", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class NamespacePropertiesEntry {
    /*
     * The URL of the GET request
     */
    @JacksonXmlProperty(localName = "id", namespace = "http://www.w3.org/2005/Atom")
    private String id;

    /*
     * The name of the namespace.
     */
    @JsonProperty(value = "title")
    private Object title;

    /*
     * The timestamp for when this namespace was last updated
     */
    @JacksonXmlProperty(localName = "updated", namespace = "http://www.w3.org/2005/Atom")
    private OffsetDateTime updated;

    /*
     * The author that created this resource
     */
    @JacksonXmlProperty(localName = "author", namespace = "http://www.w3.org/2005/Atom")
    private ResponseAuthor author;

    /*
     * The URL for the HTTP request
     */
    @JacksonXmlProperty(localName = "link", namespace = "http://www.w3.org/2005/Atom")
    private ResponseLink link;

    /*
     * Information about the namespace.
     */
    @JacksonXmlProperty(localName = "content", namespace = "http://www.w3.org/2005/Atom")
    private NamespacePropertiesEntryContent content;

    /**
     * Get the id property: The URL of the GET request.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The URL of the GET request.
     *
     * @param id the id value to set.
     * @return the NamespacePropertiesEntry object itself.
     */
    public NamespacePropertiesEntry setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the title property: The name of the namespace.
     *
     * @return the title value.
     */
    public Object getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The name of the namespace.
     *
     * @param title the title value to set.
     * @return the NamespacePropertiesEntry object itself.
     */
    public NamespacePropertiesEntry setTitle(Object title) {
        this.title = title;
        return this;
    }

    /**
     * Get the updated property: The timestamp for when this namespace was last updated.
     *
     * @return the updated value.
     */
    public OffsetDateTime getUpdated() {
        return this.updated;
    }

    /**
     * Set the updated property: The timestamp for when this namespace was last updated.
     *
     * @param updated the updated value to set.
     * @return the NamespacePropertiesEntry object itself.
     */
    public NamespacePropertiesEntry setUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the author property: The author that created this resource.
     *
     * @return the author value.
     */
    public ResponseAuthor getAuthor() {
        return this.author;
    }

    /**
     * Set the author property: The author that created this resource.
     *
     * @param author the author value to set.
     * @return the NamespacePropertiesEntry object itself.
     */
    public NamespacePropertiesEntry setAuthor(ResponseAuthor author) {
        this.author = author;
        return this;
    }

    /**
     * Get the link property: The URL for the HTTP request.
     *
     * @return the link value.
     */
    public ResponseLink getLink() {
        return this.link;
    }

    /**
     * Set the link property: The URL for the HTTP request.
     *
     * @param link the link value to set.
     * @return the NamespacePropertiesEntry object itself.
     */
    public NamespacePropertiesEntry setLink(ResponseLink link) {
        this.link = link;
        return this;
    }

    /**
     * Get the content property: Information about the namespace.
     *
     * @return the content value.
     */
    public NamespacePropertiesEntryContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: Information about the namespace.
     *
     * @param content the content value to set.
     * @return the NamespacePropertiesEntry object itself.
     */
    public NamespacePropertiesEntry setContent(NamespacePropertiesEntryContent content) {
        this.content = content;
        return this;
    }
}
