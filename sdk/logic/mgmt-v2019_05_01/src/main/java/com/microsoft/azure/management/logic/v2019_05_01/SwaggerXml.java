/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Swagger XML.
 */
public class SwaggerXml {
    /**
     * The xml element or attribute name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The xml namespace.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * The name prefix.
     */
    @JsonProperty(value = "prefix")
    private String prefix;

    /**
     * Indicates whether the property should be an attribute instead of an
     * element.
     */
    @JsonProperty(value = "attribute")
    private Boolean attribute;

    /**
     * Indicates whether the array elements are wrapped in a container element.
     */
    @JsonProperty(value = "wrapped")
    private Boolean wrapped;

    /**
     * The vendor extensions.
     */
    @JsonProperty(value = "extensions")
    private Map<String, Object> extensions;

    /**
     * Get the xml element or attribute name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the xml element or attribute name.
     *
     * @param name the name value to set
     * @return the SwaggerXml object itself.
     */
    public SwaggerXml withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the xml namespace.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the xml namespace.
     *
     * @param namespace the namespace value to set
     * @return the SwaggerXml object itself.
     */
    public SwaggerXml withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the name prefix.
     *
     * @return the prefix value
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the name prefix.
     *
     * @param prefix the prefix value to set
     * @return the SwaggerXml object itself.
     */
    public SwaggerXml withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get indicates whether the property should be an attribute instead of an element.
     *
     * @return the attribute value
     */
    public Boolean attribute() {
        return this.attribute;
    }

    /**
     * Set indicates whether the property should be an attribute instead of an element.
     *
     * @param attribute the attribute value to set
     * @return the SwaggerXml object itself.
     */
    public SwaggerXml withAttribute(Boolean attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * Get indicates whether the array elements are wrapped in a container element.
     *
     * @return the wrapped value
     */
    public Boolean wrapped() {
        return this.wrapped;
    }

    /**
     * Set indicates whether the array elements are wrapped in a container element.
     *
     * @param wrapped the wrapped value to set
     * @return the SwaggerXml object itself.
     */
    public SwaggerXml withWrapped(Boolean wrapped) {
        this.wrapped = wrapped;
        return this;
    }

    /**
     * Get the vendor extensions.
     *
     * @return the extensions value
     */
    public Map<String, Object> extensions() {
        return this.extensions;
    }

    /**
     * Set the vendor extensions.
     *
     * @param extensions the extensions value to set
     * @return the SwaggerXml object itself.
     */
    public SwaggerXml withExtensions(Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

}
