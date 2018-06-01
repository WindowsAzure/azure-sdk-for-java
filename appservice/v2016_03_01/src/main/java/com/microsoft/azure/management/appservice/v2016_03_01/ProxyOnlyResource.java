/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Azure proxy only resource. This resource is not tracked by Azure Resource
 * Manager.
 */
public class ProxyOnlyResource extends ProxyResource {
    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the ProxyOnlyResource object itself.
     */
    public ProxyOnlyResource withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
