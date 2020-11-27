/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * (Deprecated. Please use LogSettings) Log storage settings.
 */
public class LogStorageSettings {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Log storage linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /**
     * The path to storage for storing detailed logs of activity execution.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /**
     * Gets or sets the log level, support: Info, Warning. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "logLevel")
    private Object logLevel;

    /**
     * Specifies whether to enable reliable logging. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "enableReliableLogging")
    private Object enableReliableLogging;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get log storage linked service reference.
     *
     * @return the linkedServiceName value
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set log storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Get gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     *
     * @return the logLevel value
     */
    public Object logLevel() {
        return this.logLevel;
    }

    /**
     * Set gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     *
     * @param logLevel the logLevel value to set
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withLogLevel(Object logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Get specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableReliableLogging value
     */
    public Object enableReliableLogging() {
        return this.enableReliableLogging;
    }

    /**
     * Set specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableReliableLogging the enableReliableLogging value to set
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withEnableReliableLogging(Object enableReliableLogging) {
        this.enableReliableLogging = enableReliableLogging;
        return this;
    }

}
