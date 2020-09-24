// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.fluent.inner.LocalizableStringInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The EventCategoryCollection model. */
@Fluent
public final class EventCategoryCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventCategoryCollection.class);

    /*
     * the list that includes the Azure event categories.
     */
    @JsonProperty(value = "value", required = true)
    private List<LocalizableStringInner> value;

    /**
     * Get the value property: the list that includes the Azure event categories.
     *
     * @return the value value.
     */
    public List<LocalizableStringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list that includes the Azure event categories.
     *
     * @param value the value value to set.
     * @return the EventCategoryCollection object itself.
     */
    public EventCategoryCollection withValue(List<LocalizableStringInner> value) {
        this.value = value;
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
                    new IllegalArgumentException("Missing required property value in model EventCategoryCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
