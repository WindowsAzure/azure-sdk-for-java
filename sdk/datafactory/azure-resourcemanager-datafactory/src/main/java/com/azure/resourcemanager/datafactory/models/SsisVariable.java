// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Ssis variable. */
@Fluent
public final class SsisVariable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SsisVariable.class);

    /*
     * Variable id.
     */
    @JsonProperty(value = "id")
    private Long id;

    /*
     * Variable name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Variable description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Variable type.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /*
     * Whether variable is sensitive.
     */
    @JsonProperty(value = "sensitive")
    private Boolean sensitive;

    /*
     * Variable value.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Variable sensitive value.
     */
    @JsonProperty(value = "sensitiveValue")
    private String sensitiveValue;

    /**
     * Get the id property: Variable id.
     *
     * @return the id value.
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set the id property: Variable id.
     *
     * @param id the id value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Variable name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Variable name.
     *
     * @param name the name value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Variable description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Variable description.
     *
     * @param description the description value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dataType property: Variable type.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Variable type.
     *
     * @param dataType the dataType value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the sensitive property: Whether variable is sensitive.
     *
     * @return the sensitive value.
     */
    public Boolean sensitive() {
        return this.sensitive;
    }

    /**
     * Set the sensitive property: Whether variable is sensitive.
     *
     * @param sensitive the sensitive value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * Get the value property: Variable value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Variable value.
     *
     * @param value the value value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the sensitiveValue property: Variable sensitive value.
     *
     * @return the sensitiveValue value.
     */
    public String sensitiveValue() {
        return this.sensitiveValue;
    }

    /**
     * Set the sensitiveValue property: Variable sensitive value.
     *
     * @param sensitiveValue the sensitiveValue value to set.
     * @return the SsisVariable object itself.
     */
    public SsisVariable withSensitiveValue(String sensitiveValue) {
        this.sensitiveValue = sensitiveValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
