/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A disk access SAS uri.
 */
@JsonFlatten
public class AccessUriInner {
    /**
     * A SAS uri for accessing a disk.
     */
    @JsonProperty(value = "properties.output.accessSAS", access = JsonProperty.Access.WRITE_ONLY)
    private String accessSAS;

    /**
     * Get a SAS uri for accessing a disk.
     *
     * @return the accessSAS value
     */
    public String accessSAS() {
        return this.accessSAS;
    }

}
