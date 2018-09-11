/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.dataplane.monitor.implementation;

import java.util.List;
import com.microsoft.azure.dataplane.monitor.SystemType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MicrosoftAspNetCoreMvcObjectResultInner model.
 */
public class MicrosoftAspNetCoreMvcObjectResultInner {
    /**
     * The value property.
     */
    @JsonProperty(value = "Value")
    private Object value;

    /**
     * The formatters property.
     */
    @JsonProperty(value = "Formatters")
    private List<Object> formatters;

    /**
     * The contentTypes property.
     */
    @JsonProperty(value = "ContentTypes")
    private List<Object> contentTypes;

    /**
     * The declaredType property.
     */
    @JsonProperty(value = "DeclaredType")
    private SystemType declaredType;

    /**
     * The statusCode property.
     */
    @JsonProperty(value = "StatusCode")
    private Integer statusCode;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the MicrosoftAspNetCoreMvcObjectResultInner object itself.
     */
    public MicrosoftAspNetCoreMvcObjectResultInner withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the formatters value.
     *
     * @return the formatters value
     */
    public List<Object> formatters() {
        return this.formatters;
    }

    /**
     * Set the formatters value.
     *
     * @param formatters the formatters value to set
     * @return the MicrosoftAspNetCoreMvcObjectResultInner object itself.
     */
    public MicrosoftAspNetCoreMvcObjectResultInner withFormatters(List<Object> formatters) {
        this.formatters = formatters;
        return this;
    }

    /**
     * Get the contentTypes value.
     *
     * @return the contentTypes value
     */
    public List<Object> contentTypes() {
        return this.contentTypes;
    }

    /**
     * Set the contentTypes value.
     *
     * @param contentTypes the contentTypes value to set
     * @return the MicrosoftAspNetCoreMvcObjectResultInner object itself.
     */
    public MicrosoftAspNetCoreMvcObjectResultInner withContentTypes(List<Object> contentTypes) {
        this.contentTypes = contentTypes;
        return this;
    }

    /**
     * Get the declaredType value.
     *
     * @return the declaredType value
     */
    public SystemType declaredType() {
        return this.declaredType;
    }

    /**
     * Set the declaredType value.
     *
     * @param declaredType the declaredType value to set
     * @return the MicrosoftAspNetCoreMvcObjectResultInner object itself.
     */
    public MicrosoftAspNetCoreMvcObjectResultInner withDeclaredType(SystemType declaredType) {
        this.declaredType = declaredType;
        return this;
    }

    /**
     * Get the statusCode value.
     *
     * @return the statusCode value
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode value.
     *
     * @param statusCode the statusCode value to set
     * @return the MicrosoftAspNetCoreMvcObjectResultInner object itself.
     */
    public MicrosoftAspNetCoreMvcObjectResultInner withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

}
