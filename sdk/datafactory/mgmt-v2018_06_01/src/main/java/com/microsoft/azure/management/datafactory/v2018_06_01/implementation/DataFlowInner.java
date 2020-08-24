/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowFolder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.datafactory.v2018_06_01.MappingDataFlow;

/**
 * Azure Data Factory nested object which contains a flow with data movements
 * and transformations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DataFlowInner.class)
@JsonTypeName("DataFlow")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MappingDataFlow", value = MappingDataFlow.class)
})
public class DataFlowInner {
    /**
     * The description of the data flow.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * List of tags that can be used for describing the data flow.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /**
     * The folder that this data flow is in. If not specified, Data flow will
     * appear at the root level.
     */
    @JsonProperty(value = "folder")
    private DataFlowFolder folder;

    /**
     * Get the description of the data flow.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the data flow.
     *
     * @param description the description value to set
     * @return the DataFlowInner object itself.
     */
    public DataFlowInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get list of tags that can be used for describing the data flow.
     *
     * @return the annotations value
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set list of tags that can be used for describing the data flow.
     *
     * @param annotations the annotations value to set
     * @return the DataFlowInner object itself.
     */
    public DataFlowInner withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the folder that this data flow is in. If not specified, Data flow will appear at the root level.
     *
     * @return the folder value
     */
    public DataFlowFolder folder() {
        return this.folder;
    }

    /**
     * Set the folder that this data flow is in. If not specified, Data flow will appear at the root level.
     *
     * @param folder the folder value to set
     * @return the DataFlowInner object itself.
     */
    public DataFlowInner withFolder(DataFlowFolder folder) {
        this.folder = folder;
        return this;
    }

}
