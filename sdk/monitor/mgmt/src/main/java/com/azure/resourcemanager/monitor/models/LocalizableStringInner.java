// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocalizableString model. */
@Fluent
public final class LocalizableStringInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocalizableStringInner.class);

    /*
     * the invariant value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * the locale specific value.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: the invariant value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: the invariant value.
     *
     * @param value the value value to set.
     * @return the LocalizableStringInner object itself.
     */
    public LocalizableStringInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: the locale specific value.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: the locale specific value.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the LocalizableStringInner object itself.
     */
    public LocalizableStringInner withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model LocalizableStringInner"));
        }
    }
}
