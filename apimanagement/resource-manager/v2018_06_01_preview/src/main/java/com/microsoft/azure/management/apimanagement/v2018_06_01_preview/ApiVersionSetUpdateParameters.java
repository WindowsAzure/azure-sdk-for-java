/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters to update or create an Api Version Set Contract.
 */
@JsonFlatten
public class ApiVersionSetUpdateParameters {
    /**
     * Description of API Version Set.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Name of query parameter that indicates the API Version if
     * versioningScheme is set to `query`.
     */
    @JsonProperty(value = "properties.versionQueryName")
    private String versionQueryName;

    /**
     * Name of HTTP header parameter that indicates the API Version if
     * versioningScheme is set to `header`.
     */
    @JsonProperty(value = "properties.versionHeaderName")
    private String versionHeaderName;

    /**
     * Name of API Version Set.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * An value that determines where the API Version identifer will be located
     * in a HTTP request. Possible values include: 'Segment', 'Query',
     * 'Header'.
     */
    @JsonProperty(value = "properties.versioningScheme")
    private VersioningScheme versioningScheme;

    /**
     * Get description of API Version Set.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of API Version Set.
     *
     * @param description the description value to set
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     *
     * @return the versionQueryName value
     */
    public String versionQueryName() {
        return this.versionQueryName;
    }

    /**
     * Set name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     *
     * @param versionQueryName the versionQueryName value to set
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withVersionQueryName(String versionQueryName) {
        this.versionQueryName = versionQueryName;
        return this;
    }

    /**
     * Get name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     *
     * @return the versionHeaderName value
     */
    public String versionHeaderName() {
        return this.versionHeaderName;
    }

    /**
     * Set name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     *
     * @param versionHeaderName the versionHeaderName value to set
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withVersionHeaderName(String versionHeaderName) {
        this.versionHeaderName = versionHeaderName;
        return this;
    }

    /**
     * Get name of API Version Set.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set name of API Version Set.
     *
     * @param displayName the displayName value to set
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get an value that determines where the API Version identifer will be located in a HTTP request. Possible values include: 'Segment', 'Query', 'Header'.
     *
     * @return the versioningScheme value
     */
    public VersioningScheme versioningScheme() {
        return this.versioningScheme;
    }

    /**
     * Set an value that determines where the API Version identifer will be located in a HTTP request. Possible values include: 'Segment', 'Query', 'Header'.
     *
     * @param versioningScheme the versioningScheme value to set
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withVersioningScheme(VersioningScheme versioningScheme) {
        this.versioningScheme = versioningScheme;
        return this;
    }

}
