/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;


/**
 * The ListExamplesOptionalParameter model.
 */
public class ListExamplesOptionalParameter {
    /**
     * The number of entries to skip. Default value is 0.
     */
    private Integer skip;

    /**
     * The number of entries to return. Maximum page size is 500. Default is
     * 100.
     */
    private Integer take;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the skip value.
     *
     * @return the skip value
     */
    public Integer skip() {
        return this.skip;
    }

    /**
     * Set the skip value.
     *
     * @param skip the skip value to set
     * @return the ListExamplesOptionalParameter object itself.
     */
    public ListExamplesOptionalParameter withSkip(Integer skip) {
        this.skip = skip;
        return this;
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
     * Set the take value.
     *
     * @param take the take value to set
     * @return the ListExamplesOptionalParameter object itself.
     */
    public ListExamplesOptionalParameter withTake(Integer take) {
        this.take = take;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the ListExamplesOptionalParameter object itself.
     */
    public ListExamplesOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
