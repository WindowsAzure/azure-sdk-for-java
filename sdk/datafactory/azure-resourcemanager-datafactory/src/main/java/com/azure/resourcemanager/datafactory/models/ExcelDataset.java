// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Excel dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Excel")
@JsonFlatten
@Fluent
public class ExcelDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExcelDataset.class);

    /*
     * The location of the excel storage.
     */
    @JsonProperty(value = "typeProperties.location")
    private DatasetLocation location;

    /*
     * The sheet name of excel file. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.sheetName")
    private Object sheetName;

    /*
     * The sheet index of excel file and default value is 0. Type: integer (or
     * Expression with resultType integer)
     */
    @JsonProperty(value = "typeProperties.sheetIndex")
    private Object sheetIndex;

    /*
     * The partial data of one sheet. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.range")
    private Object range;

    /*
     * When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.firstRowAsHeader")
    private Object firstRowAsHeader;

    /*
     * The data compression method used for the json dataset.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /*
     * The null value string. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.nullValue")
    private Object nullValue;

    /**
     * Get the location property: The location of the excel storage.
     *
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the excel storage.
     *
     * @param location the location value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sheetName property: The sheet name of excel file. Type: string (or Expression with resultType string).
     *
     * @return the sheetName value.
     */
    public Object sheetName() {
        return this.sheetName;
    }

    /**
     * Set the sheetName property: The sheet name of excel file. Type: string (or Expression with resultType string).
     *
     * @param sheetName the sheetName value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withSheetName(Object sheetName) {
        this.sheetName = sheetName;
        return this;
    }

    /**
     * Get the sheetIndex property: The sheet index of excel file and default value is 0. Type: integer (or Expression
     * with resultType integer).
     *
     * @return the sheetIndex value.
     */
    public Object sheetIndex() {
        return this.sheetIndex;
    }

    /**
     * Set the sheetIndex property: The sheet index of excel file and default value is 0. Type: integer (or Expression
     * with resultType integer).
     *
     * @param sheetIndex the sheetIndex value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withSheetIndex(Object sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }

    /**
     * Get the range property: The partial data of one sheet. Type: string (or Expression with resultType string).
     *
     * @return the range value.
     */
    public Object range() {
        return this.range;
    }

    /**
     * Set the range property: The partial data of one sheet. Type: string (or Expression with resultType string).
     *
     * @param range the range value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withRange(Object range) {
        this.range = range;
        return this;
    }

    /**
     * Get the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the firstRowAsHeader value.
     */
    public Object firstRowAsHeader() {
        return this.firstRowAsHeader;
    }

    /**
     * Set the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param firstRowAsHeader the firstRowAsHeader value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withFirstRowAsHeader(Object firstRowAsHeader) {
        this.firstRowAsHeader = firstRowAsHeader;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the json dataset.
     *
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the json dataset.
     *
     * @param compression the compression value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @return the nullValue value.
     */
    public Object nullValue() {
        return this.nullValue;
    }

    /**
     * Set the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @param nullValue the nullValue value to set.
     * @return the ExcelDataset object itself.
     */
    public ExcelDataset withNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExcelDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (location() != null) {
            location().validate();
        }
        if (compression() != null) {
            compression().validate();
        }
    }
}
