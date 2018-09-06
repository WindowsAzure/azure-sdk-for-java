/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.monitor.MetricNamespaceName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric namespace class specifies the metadata for a metric namespace.
 */
public class MetricNamespaceInner {
    /**
     * the id of the metricNamespace.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * the type of the namespace.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * the name of the namespace.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Properties which include the fully qualified namespace name.
     */
    @JsonProperty(value = "properties")
    private MetricNamespaceName properties;

    /**
     * Get the id of the metricNamespace.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id of the metricNamespace.
     *
     * @param id the id value to set
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type of the namespace.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the namespace.
     *
     * @param type the type value to set
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name of the namespace.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the namespace.
     *
     * @param name the name value to set
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get properties which include the fully qualified namespace name.
     *
     * @return the properties value
     */
    public MetricNamespaceName properties() {
        return this.properties;
    }

    /**
     * Set properties which include the fully qualified namespace name.
     *
     * @param properties the properties value to set
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withProperties(MetricNamespaceName properties) {
        this.properties = properties;
        return this;
    }

}
