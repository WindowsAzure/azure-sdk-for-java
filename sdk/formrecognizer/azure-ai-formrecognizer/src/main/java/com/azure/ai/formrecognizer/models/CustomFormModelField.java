// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Immutable;

/**
 * The CustomFormModelField model.
 */
@Immutable
public class CustomFormModelField {

    /*
     * Training field label.
     */
    private final String label;

    /*
     * Training field name.
     */
    private final String name;

    /*
     * Estimated extraction accuracy for this field.
     */
    private final Float accuracy;

    /**
     * Constructs a CustomFormModelField object.
     *
     * @param label Training field label.
     * @param name Training field name.
     * @param accuracy Estimated extraction accuracy for this field.
     */
    public CustomFormModelField(final String label, final String name, final Float accuracy) {
        this.label = label;
        this.name = name;
        this.accuracy = accuracy;
    }

    /**
     * Get the label property: Training field label.
     *
     * @return the fieldName value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Get the name property: Training field name.
     *
     * @return the fieldName value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the accuracy property: Estimated extraction accuracy for this field.
     *
     * @return the accuracy value.
     */
    public Float getAccuracy() {
        return this.accuracy;
    }
}
