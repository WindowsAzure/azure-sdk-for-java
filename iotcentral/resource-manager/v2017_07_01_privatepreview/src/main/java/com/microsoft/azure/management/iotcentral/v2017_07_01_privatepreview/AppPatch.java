/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The description of the IoT Central application.
 */
@JsonFlatten
public class AppPatch {
    /**
     * Instance tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The ID of the application.
     */
    @JsonProperty(value = "properties.applicationId", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationId;

    /**
     * The display name of the application.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The subdomain of the application.
     */
    @JsonProperty(value = "properties.subdomain")
    private String subdomain;

    /**
     * The ID of the application template, which is a blueprint that defines
     * the characteristics and behaviors of an application. Optional; if not
     * specified, defaults to a blank blueprint and allows the application to
     * be defined from scratch.
     */
    @JsonProperty(value = "properties.template")
    private String template;

    /**
     * Get instance tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set instance tags.
     *
     * @param tags the tags value to set
     * @return the AppPatch object itself.
     */
    public AppPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the ID of the application.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Get the display name of the application.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the application.
     *
     * @param displayName the displayName value to set
     * @return the AppPatch object itself.
     */
    public AppPatch withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the subdomain of the application.
     *
     * @return the subdomain value
     */
    public String subdomain() {
        return this.subdomain;
    }

    /**
     * Set the subdomain of the application.
     *
     * @param subdomain the subdomain value to set
     * @return the AppPatch object itself.
     */
    public AppPatch withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * Get the ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch.
     *
     * @return the template value
     */
    public String template() {
        return this.template;
    }

    /**
     * Set the ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch.
     *
     * @param template the template value to set
     * @return the AppPatch object itself.
     */
    public AppPatch withTemplate(String template) {
        this.template = template;
        return this;
    }

}
