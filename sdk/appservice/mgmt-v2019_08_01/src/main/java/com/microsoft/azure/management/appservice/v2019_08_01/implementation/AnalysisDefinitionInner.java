/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Definition of Analysis.
 */
@JsonFlatten
public class AnalysisDefinitionInner extends ProxyOnlyResource {
    /**
     * Description of the Analysis.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get description of the Analysis.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
