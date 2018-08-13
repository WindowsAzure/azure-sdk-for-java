/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;


/**
 * The UpdateExplicitListItemOptionalParameter model.
 */
public class UpdateExplicitListItemOptionalParameter {
    /**
     * The explicit list item.
     */
    private String explicitListItem;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the explicitListItem value.
     *
     * @return the explicitListItem value
     */
    public String explicitListItem() {
        return this.explicitListItem;
    }

    /**
     * Set the explicitListItem value.
     *
     * @param explicitListItem the explicitListItem value to set
     * @return the UpdateExplicitListItemOptionalParameter object itself.
     */
    public UpdateExplicitListItemOptionalParameter withExplicitListItem(String explicitListItem) {
        this.explicitListItem = explicitListItem;
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
     * @return the UpdateExplicitListItemOptionalParameter object itself.
     */
    public UpdateExplicitListItemOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
