// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/** Recognized field value. */
@Fluent
public final class FieldValue {
    /*
     * Type of field value.
     */
    @JsonProperty(value = "type", required = true)
    private FieldValueType type;

    /*
     * String value.
     */
    @JsonProperty(value = "valueString")
    private String valueString;

    /*
     * Date value.
     */
    @JsonProperty(value = "valueDate")
    private LocalDate valueDate;

    /*
     * Time value.
     */
    @JsonProperty(value = "valueTime")
    private String valueTime;

    /*
     * Phone number value.
     */
    @JsonProperty(value = "valuePhoneNumber")
    private String valuePhoneNumber;

    /*
     * Floating point value.
     */
    @JsonProperty(value = "valueNumber")
    private Float valueNumber;

    /*
     * Integer value.
     */
    @JsonProperty(value = "valueInteger")
    private Integer valueInteger;

    /*
     * Array of field values.
     */
    @JsonProperty(value = "valueArray")
    private List<FieldValue> valueArray;

    /*
     * Dictionary of named field values.
     */
    @JsonProperty(value = "valueObject")
    private Map<String, FieldValue> valueObject;

    /*
     * Selection mark value.
     */
    @JsonProperty(value = "valueSelectionMark")
    private FieldValueSelectionMark valueSelectionMark;

    /*
     * 3-letter country code (ISO 3166-1 alpha-3).
     */
    @JsonProperty(value = "valueCountryRegion")
    private String valueCountryRegion;

    /*
     * Text content of the extracted field.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * Bounding box of the field value, if appropriate.
     */
    @JsonProperty(value = "boundingBox")
    private List<Float> boundingBox;

    /*
     * Confidence score.
     */
    @JsonProperty(value = "confidence")
    private Float confidence;

    /*
     * When includeTextDetails is set to true, a list of references to the text
     * elements constituting this field.
     */
    @JsonProperty(value = "elements")
    private List<String> elements;

    /*
     * The 1-based page number in the input document.
     */
    @JsonProperty(value = "page")
    private Integer page;

    /**
     * Get the type property: Type of field value.
     *
     * @return the type value.
     */
    public FieldValueType getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of field value.
     *
     * @param type the type value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setType(FieldValueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the valueString property: String value.
     *
     * @return the valueString value.
     */
    public String getValueString() {
        return this.valueString;
    }

    /**
     * Set the valueString property: String value.
     *
     * @param valueString the valueString value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueString(String valueString) {
        this.valueString = valueString;
        return this;
    }

    /**
     * Get the valueDate property: Date value.
     *
     * @return the valueDate value.
     */
    public LocalDate getValueDate() {
        return this.valueDate;
    }

    /**
     * Set the valueDate property: Date value.
     *
     * @param valueDate the valueDate value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueDate(LocalDate valueDate) {
        this.valueDate = valueDate;
        return this;
    }

    /**
     * Get the valueTime property: Time value.
     *
     * @return the valueTime value.
     */
    public String getValueTime() {
        return this.valueTime;
    }

    /**
     * Set the valueTime property: Time value.
     *
     * @param valueTime the valueTime value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueTime(String valueTime) {
        this.valueTime = valueTime;
        return this;
    }

    /**
     * Get the valuePhoneNumber property: Phone number value.
     *
     * @return the valuePhoneNumber value.
     */
    public String getValuePhoneNumber() {
        return this.valuePhoneNumber;
    }

    /**
     * Set the valuePhoneNumber property: Phone number value.
     *
     * @param valuePhoneNumber the valuePhoneNumber value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValuePhoneNumber(String valuePhoneNumber) {
        this.valuePhoneNumber = valuePhoneNumber;
        return this;
    }

    /**
     * Get the valueNumber property: Floating point value.
     *
     * @return the valueNumber value.
     */
    public Float getValueNumber() {
        return this.valueNumber;
    }

    /**
     * Set the valueNumber property: Floating point value.
     *
     * @param valueNumber the valueNumber value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueNumber(Float valueNumber) {
        this.valueNumber = valueNumber;
        return this;
    }

    /**
     * Get the valueInteger property: Integer value.
     *
     * @return the valueInteger value.
     */
    public Integer getValueInteger() {
        return this.valueInteger;
    }

    /**
     * Set the valueInteger property: Integer value.
     *
     * @param valueInteger the valueInteger value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueInteger(Integer valueInteger) {
        this.valueInteger = valueInteger;
        return this;
    }

    /**
     * Get the valueArray property: Array of field values.
     *
     * @return the valueArray value.
     */
    public List<FieldValue> getValueArray() {
        return this.valueArray;
    }

    /**
     * Set the valueArray property: Array of field values.
     *
     * @param valueArray the valueArray value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueArray(List<FieldValue> valueArray) {
        this.valueArray = valueArray;
        return this;
    }

    /**
     * Get the valueObject property: Dictionary of named field values.
     *
     * @return the valueObject value.
     */
    public Map<String, FieldValue> getValueObject() {
        return this.valueObject;
    }

    /**
     * Set the valueObject property: Dictionary of named field values.
     *
     * @param valueObject the valueObject value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueObject(Map<String, FieldValue> valueObject) {
        this.valueObject = valueObject;
        return this;
    }

    /**
     * Get the valueSelectionMark property: Selection mark value.
     *
     * @return the valueSelectionMark value.
     */
    public FieldValueSelectionMark getValueSelectionMark() {
        return this.valueSelectionMark;
    }

    /**
     * Set the valueSelectionMark property: Selection mark value.
     *
     * @param valueSelectionMark the valueSelectionMark value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueSelectionMark(FieldValueSelectionMark valueSelectionMark) {
        this.valueSelectionMark = valueSelectionMark;
        return this;
    }

    /**
     * Get the valueCountryRegion property: 3-letter country code (ISO 3166-1 alpha-3).
     *
     * @return the valueCountryRegion value.
     */
    public String getValueCountryRegion() {
        return this.valueCountryRegion;
    }

    /**
     * Set the valueCountryRegion property: 3-letter country code (ISO 3166-1 alpha-3).
     *
     * @param valueCountryRegion the valueCountryRegion value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueCountryRegion(String valueCountryRegion) {
        this.valueCountryRegion = valueCountryRegion;
        return this;
    }

    /**
     * Get the text property: Text content of the extracted field.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Text content of the extracted field.
     *
     * @param text the text value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the field value, if appropriate.
     *
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the field value, if appropriate.
     *
     * @param boundingBox the boundingBox value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the confidence property: Confidence score.
     *
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence score.
     *
     * @param confidence the confidence value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this field.
     *
     * @return the elements value.
     */
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * Set the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this field.
     *
     * @param elements the elements value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setElements(List<String> elements) {
        this.elements = elements;
        return this;
    }

    /**
     * Get the page property: The 1-based page number in the input document.
     *
     * @return the page value.
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * Set the page property: The 1-based page number in the input document.
     *
     * @param page the page value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setPage(Integer page) {
        this.page = page;
        return this;
    }
}
