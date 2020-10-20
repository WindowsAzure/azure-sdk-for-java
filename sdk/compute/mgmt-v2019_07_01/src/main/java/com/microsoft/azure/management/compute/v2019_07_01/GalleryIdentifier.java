/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the gallery unique name.
 */
public class GalleryIdentifier {
    /**
     * The unique name of the Shared Image Gallery. This name is generated
     * automatically by Azure.
     */
    @JsonProperty(value = "uniqueName", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueName;

    /**
     * Get the unique name of the Shared Image Gallery. This name is generated automatically by Azure.
     *
     * @return the uniqueName value
     */
    public String uniqueName() {
        return this.uniqueName;
    }

}
