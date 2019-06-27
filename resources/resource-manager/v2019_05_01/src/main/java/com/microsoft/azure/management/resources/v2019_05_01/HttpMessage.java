/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTP message.
 */
public class HttpMessage {
    /**
     * HTTP message content.
     */
    @JsonProperty(value = "content")
    private Object content;

    /**
     * Get hTTP message content.
     *
     * @return the content value
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set hTTP message content.
     *
     * @param content the content value to set
     * @return the HttpMessage object itself.
     */
    public HttpMessage withContent(Object content) {
        this.content = content;
        return this;
    }

}
