// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Immutable;

/**
 * The FormField model.
 */
@Immutable
public final class FormField {

    /*
     * The confidence value of the field.
     */
    private final float confidence;

    /*
     * The label text of the field.
     */
    private final FieldData labelData;

    /*
     * The name value of the field.
     */
    private final String name;

    /*
     * The value of the field.
     */
    private final FieldValue fieldValue;

    /*
     * The text value field..
     */
    private final FieldData valueData;

    /**
     * Constructs a FormField object.
     *
     * @param confidence The confidence of the recognized field.
     * @param labelData The label text value for the field.
     * @param name The name the field.
     * @param fieldValue The value of the field.
     * @param valueData The label value text for the field.
     */
    public FormField(final float confidence, final FieldData labelData, final String name, final FieldValue fieldValue,
        final FieldData valueData) {
        this.confidence = confidence;
        this.labelData = labelData;
        this.name = name;
        this.fieldValue = fieldValue;
        this.valueData = valueData;
    }

    /**
     * Get the estimated confidence value of the recognized field.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Get the label text of the field.
     *
     * @return the text-label value.
     */
    public FieldData getLabelData() {
        return this.labelData;
    }

    /**
     * Get the name of the field in the provided document.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the value of the field.
     *
     * @return Value of the field.
     */
    public FieldValue getFieldValue() {
        return this.fieldValue;
    }

    /**
     * Get the value text of the field.
     *
     * @return the value text of the field.
     */
    public FieldData getValueData() {
        return this.valueData;
    }
}
