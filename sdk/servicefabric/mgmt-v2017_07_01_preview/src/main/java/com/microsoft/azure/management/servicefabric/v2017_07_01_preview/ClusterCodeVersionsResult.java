/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The result of the ServiceFabric runtime versions.
 */
@JsonFlatten
public class ClusterCodeVersionsResult {
    /**
     * The identification of the result.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the result.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The result resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The Service Fabric runtime version of the cluster.
     */
    @JsonProperty(value = "properties.codeVersion")
    private String codeVersion;

    /**
     * The date of expiry of support of the version.
     */
    @JsonProperty(value = "properties.supportExpiryUtc")
    private String supportExpiryUtc;

    /**
     * Indicates if this version is for Windows or Linux operating system.
     * Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.environment")
    private String environment;

    /**
     * Get the identification of the result.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the identification of the result.
     *
     * @param id the id value to set
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the result.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the result.
     *
     * @param name the name value to set
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the result resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the result resource type.
     *
     * @param type the type value to set
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the Service Fabric runtime version of the cluster.
     *
     * @return the codeVersion value
     */
    public String codeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the Service Fabric runtime version of the cluster.
     *
     * @param codeVersion the codeVersion value to set
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the date of expiry of support of the version.
     *
     * @return the supportExpiryUtc value
     */
    public String supportExpiryUtc() {
        return this.supportExpiryUtc;
    }

    /**
     * Set the date of expiry of support of the version.
     *
     * @param supportExpiryUtc the supportExpiryUtc value to set
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withSupportExpiryUtc(String supportExpiryUtc) {
        this.supportExpiryUtc = supportExpiryUtc;
        return this;
    }

    /**
     * Get indicates if this version is for Windows or Linux operating system. Possible values include: 'Windows', 'Linux'.
     *
     * @return the environment value
     */
    public String environment() {
        return this.environment;
    }

    /**
     * Set indicates if this version is for Windows or Linux operating system. Possible values include: 'Windows', 'Linux'.
     *
     * @param environment the environment value to set
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

}
