/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;


/**
 * The optional parameters class for "listFeatures" method.
 */
public class ListFeaturesOptionalParameter {
    /**
    * The number of entries to skip. Default value is 0.
    */
    private Integer skip;

    /**
    * The number of entries to return. Maximum page size is 500. Default is 100.
    */
    private Integer take;

    /**
    * Get the skip value.
    *
    * @return the skip value
    */
    public Integer skip() {
        return this.skip;
    }

    /**
    * Get the take value.
    *
    * @return the take value
    */
    public Integer take() {
        return this.take;
    }

    /**
    * Set the skip value.
    * <p>
    * The number of entries to skip. Default value is 0.
    *
    * @param skip the skip value to set
    * @return the listFeaturesOptionalParameter object itself.
    */
    public ListFeaturesOptionalParameter withSkip(int skip) {
        this.skip = skip;
        return this;
    }

    /**
    * Set the take value.
    * <p>
    * The number of entries to return. Maximum page size is 500. Default is 100.
    *
    * @param take the take value to set
    * @return the listFeaturesOptionalParameter object itself.
    */
    public ListFeaturesOptionalParameter withTake(int take) {
        this.take = take;
        return this;
    }

    }
