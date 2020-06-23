/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response containing the Application Info.
 */
public class ApplicationInfoResponse {
    /**
     * The ID (GUID) of the application.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /**
     * The name of the application.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The description of the application.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The culture of the application. For example, "en-us".
     */
    @JsonProperty(value = "culture")
    private String culture;

    /**
     * Defines the scenario for the new application. Optional. For example,
     * IoT.
     */
    @JsonProperty(value = "usageScenario")
    private String usageScenario;

    /**
     * The domain for the new application. Optional. For example, Comics.
     */
    @JsonProperty(value = "domain")
    private String domain;

    /**
     * Amount of model versions within the application.
     */
    @JsonProperty(value = "versionsCount")
    private Integer versionsCount;

    /**
     * The version's creation timestamp.
     */
    @JsonProperty(value = "createdDateTime")
    private String createdDateTime;

    /**
     * The Runtime endpoint URL for this model version.
     */
    @JsonProperty(value = "endpoints")
    private Object endpoints;

    /**
     * Number of calls made to this endpoint.
     */
    @JsonProperty(value = "endpointHitsCount")
    private Integer endpointHitsCount;

    /**
     * The version ID currently marked as active.
     */
    @JsonProperty(value = "activeVersion")
    private String activeVersion;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the culture value.
     *
     * @return the culture value
     */
    public String culture() {
        return this.culture;
    }

    /**
     * Set the culture value.
     *
     * @param culture the culture value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withCulture(String culture) {
        this.culture = culture;
        return this;
    }

    /**
     * Get the usageScenario value.
     *
     * @return the usageScenario value
     */
    public String usageScenario() {
        return this.usageScenario;
    }

    /**
     * Set the usageScenario value.
     *
     * @param usageScenario the usageScenario value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }

    /**
     * Get the domain value.
     *
     * @return the domain value
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain value.
     *
     * @param domain the domain value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the versionsCount value.
     *
     * @return the versionsCount value
     */
    public Integer versionsCount() {
        return this.versionsCount;
    }

    /**
     * Set the versionsCount value.
     *
     * @param versionsCount the versionsCount value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withVersionsCount(Integer versionsCount) {
        this.versionsCount = versionsCount;
        return this;
    }

    /**
     * Get the createdDateTime value.
     *
     * @return the createdDateTime value
     */
    public String createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime value.
     *
     * @param createdDateTime the createdDateTime value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the endpoints value.
     *
     * @return the endpoints value
     */
    public Object endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints value.
     *
     * @param endpoints the endpoints value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withEndpoints(Object endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the endpointHitsCount value.
     *
     * @return the endpointHitsCount value
     */
    public Integer endpointHitsCount() {
        return this.endpointHitsCount;
    }

    /**
     * Set the endpointHitsCount value.
     *
     * @param endpointHitsCount the endpointHitsCount value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withEndpointHitsCount(Integer endpointHitsCount) {
        this.endpointHitsCount = endpointHitsCount;
        return this;
    }

    /**
     * Get the activeVersion value.
     *
     * @return the activeVersion value
     */
    public String activeVersion() {
        return this.activeVersion;
    }

    /**
     * Set the activeVersion value.
     *
     * @param activeVersion the activeVersion value to set
     * @return the ApplicationInfoResponse object itself.
     */
    public ApplicationInfoResponse withActiveVersion(String activeVersion) {
        this.activeVersion = activeVersion;
        return this;
    }

}
