// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FileSystemApplicationLogsConfig model.
 */
@Fluent
public final class FileSystemApplicationLogsConfig {
    /*
     * Log level.
     */
    @JsonProperty(value = "level")
    private LogLevel level;

    /**
     * Get the level property: Log level.
     * 
     * @return the level value.
     */
    public LogLevel level() {
        return this.level;
    }

    /**
     * Set the level property: Log level.
     * 
     * @param level the level value to set.
     * @return the FileSystemApplicationLogsConfig object itself.
     */
    public FileSystemApplicationLogsConfig withLevel(LogLevel level) {
        this.level = level;
        return this;
    }
}
