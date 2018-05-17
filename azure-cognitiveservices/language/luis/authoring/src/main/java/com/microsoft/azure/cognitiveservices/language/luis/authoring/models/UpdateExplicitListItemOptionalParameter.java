/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;


/**
 * The optional parameters class for "updateExplicitListItem" method.
 */
public class UpdateExplicitListItemOptionalParameter {
    /**
    * The explicit list item.
    */
    private String explicitListItem;

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
    * <p>
    * The explicit list item.
    *
    * @param explicitListItem the explicitListItem value to set
    * @return the UpdateExplicitListItemOptionalParameter object itself.
    */
    public UpdateExplicitListItemOptionalParameter withExplicitListItem(String explicitListItem) {
        this.explicitListItem = explicitListItem;
        return this;
    }

}
