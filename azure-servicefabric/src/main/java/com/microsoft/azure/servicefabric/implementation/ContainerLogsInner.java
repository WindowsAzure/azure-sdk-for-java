/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container logs.
 */
public class ContainerLogsInner {
    /**
     * Container logs.
     */
    @JsonProperty(value = "Content")
    private String content;

    /**
     * Get container logs.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set container logs.
     *
     * @param content the content value to set
     * @return the ContainerLogsInner object itself.
     */
    public ContainerLogsInner withContent(String content) {
        this.content = content;
        return this;
    }

}
