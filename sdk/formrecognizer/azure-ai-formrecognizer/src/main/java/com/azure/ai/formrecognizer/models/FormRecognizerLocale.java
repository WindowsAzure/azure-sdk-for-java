// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.models;

import com.azure.core.util.ExpandableStringEnum;

/** Defines values for FormRecognizerLocale. */
public final class FormRecognizerLocale extends ExpandableStringEnum<FormRecognizerLocale> {
    /** Static value en-AU for FormRecognizerLocale. */
    public static final FormRecognizerLocale EN_AU = fromString("en-AU");

    /** Static value en-CA for FormRecognizerLocale. */
    public static final FormRecognizerLocale EN_CA = fromString("en-CA");

    /** Static value en-GB for FormRecognizerLocale. */
    public static final FormRecognizerLocale EN_GB = fromString("en-GB");

    /** Static value en-IN for FormRecognizerLocale. */
    public static final FormRecognizerLocale EN_IN = fromString("en-IN");

    /** Static value en-US for FormRecognizerLocale. */
    public static final FormRecognizerLocale EN_US = fromString("en-US");

    /**
     * Creates or finds a FormRecognizerLocale from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FormRecognizerLocale.
     */
    public static FormRecognizerLocale fromString(String name) {
        return fromString(name, FormRecognizerLocale.class);
    }
}
