// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Notebook cell. */
@Fluent
public final class NotebookCell {
    /*
     * String identifying the type of cell.
     */
    @JsonProperty(value = "cell_type", required = true)
    private String cellType;

    /*
     * Cell-level metadata.
     */
    @JsonProperty(value = "metadata", required = true)
    private Object metadata;

    /*
     * Contents of the cell, represented as an array of lines.
     */
    @JsonProperty(value = "source", required = true)
    private List<String> source;

    /*
     * Attachments associated with the cell.
     */
    @JsonProperty(value = "attachments")
    private Object attachments;

    /*
     * Cell-level output items.
     */
    @JsonProperty(value = "outputs")
    private List<NotebookCellOutputItem> outputs;

    /*
     * Notebook cell.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the cellType property: String identifying the type of cell.
     *
     * @return the cellType value.
     */
    public String getCellType() {
        return this.cellType;
    }

    /**
     * Set the cellType property: String identifying the type of cell.
     *
     * @param cellType the cellType value to set.
     * @return the NotebookCell object itself.
     */
    public NotebookCell setCellType(String cellType) {
        this.cellType = cellType;
        return this;
    }

    /**
     * Get the metadata property: Cell-level metadata.
     *
     * @return the metadata value.
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Cell-level metadata.
     *
     * @param metadata the metadata value to set.
     * @return the NotebookCell object itself.
     */
    public NotebookCell setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the source property: Contents of the cell, represented as an array of lines.
     *
     * @return the source value.
     */
    public List<String> getSource() {
        return this.source;
    }

    /**
     * Set the source property: Contents of the cell, represented as an array of lines.
     *
     * @param source the source value to set.
     * @return the NotebookCell object itself.
     */
    public NotebookCell setSource(List<String> source) {
        this.source = source;
        return this;
    }

    /**
     * Get the attachments property: Attachments associated with the cell.
     *
     * @return the attachments value.
     */
    public Object getAttachments() {
        return this.attachments;
    }

    /**
     * Set the attachments property: Attachments associated with the cell.
     *
     * @param attachments the attachments value to set.
     * @return the NotebookCell object itself.
     */
    public NotebookCell setAttachments(Object attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Get the outputs property: Cell-level output items.
     *
     * @return the outputs value.
     */
    public List<NotebookCellOutputItem> getOutputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: Cell-level output items.
     *
     * @param outputs the outputs value to set.
     * @return the NotebookCell object itself.
     */
    public NotebookCell setOutputs(List<NotebookCellOutputItem> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the additionalProperties property: Notebook cell.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Notebook cell.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the NotebookCell object itself.
     */
    public NotebookCell setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
