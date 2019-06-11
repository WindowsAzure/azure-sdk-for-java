/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties for updating encoded task step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("EncodedTask")
public class EncodedTaskStepUpdateParameters extends TaskStepUpdateParameters {
    /**
     * Base64 encoded value of the template/definition file content.
     */
    @JsonProperty(value = "encodedTaskContent")
    private String encodedTaskContent;

    /**
     * Base64 encoded value of the parameters/values file content.
     */
    @JsonProperty(value = "encodedValuesContent")
    private String encodedValuesContent;

    /**
     * The collection of overridable values that can be passed when running a
     * task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /**
     * Get base64 encoded value of the template/definition file content.
     *
     * @return the encodedTaskContent value
     */
    public String encodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Set base64 encoded value of the template/definition file content.
     *
     * @param encodedTaskContent the encodedTaskContent value to set
     * @return the EncodedTaskStepUpdateParameters object itself.
     */
    public EncodedTaskStepUpdateParameters withEncodedTaskContent(String encodedTaskContent) {
        this.encodedTaskContent = encodedTaskContent;
        return this;
    }

    /**
     * Get base64 encoded value of the parameters/values file content.
     *
     * @return the encodedValuesContent value
     */
    public String encodedValuesContent() {
        return this.encodedValuesContent;
    }

    /**
     * Set base64 encoded value of the parameters/values file content.
     *
     * @param encodedValuesContent the encodedValuesContent value to set
     * @return the EncodedTaskStepUpdateParameters object itself.
     */
    public EncodedTaskStepUpdateParameters withEncodedValuesContent(String encodedValuesContent) {
        this.encodedValuesContent = encodedValuesContent;
        return this;
    }

    /**
     * Get the collection of overridable values that can be passed when running a task.
     *
     * @return the values value
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the collection of overridable values that can be passed when running a task.
     *
     * @param values the values value to set
     * @return the EncodedTaskStepUpdateParameters object itself.
     */
    public EncodedTaskStepUpdateParameters withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

}
