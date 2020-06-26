// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonCreator;
=======
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The LengthTokenFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.LengthTokenFilter")
@JsonFlatten
@Fluent
public class LengthTokenFilter extends TokenFilter {
    /*
     * The minimum length in characters. Default is 0. Maximum is 300. Must be
     * less than the value of max.
     */
    @JsonProperty(value = "min")
    private Integer minLength;

    /*
     * The maximum length in characters. Default and maximum is 300.
     */
    @JsonProperty(value = "max")
    private Integer maxLength;

    /** Creates an instance of LengthTokenFilter class. */
    @JsonCreator
    public LengthTokenFilter(@JsonProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the minLength property: The minimum length in characters. Default is 0. Maximum is 300. Must be less than the
     * value of max.
     *
     * @return the minLength value.
     */
    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * Set the minLength property: The minimum length in characters. Default is 0. Maximum is 300. Must be less than the
     * value of max.
     *
     * @param minLength the minLength value to set.
     * @return the LengthTokenFilter object itself.
     */
    public LengthTokenFilter setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * Get the maxLength property: The maximum length in characters. Default and maximum is 300.
     *
     * @return the maxLength value.
     */
    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * Set the maxLength property: The maximum length in characters. Default and maximum is 300.
     *
     * @param maxLength the maxLength value to set.
     * @return the LengthTokenFilter object itself.
     */
    public LengthTokenFilter setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
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
    }
}
