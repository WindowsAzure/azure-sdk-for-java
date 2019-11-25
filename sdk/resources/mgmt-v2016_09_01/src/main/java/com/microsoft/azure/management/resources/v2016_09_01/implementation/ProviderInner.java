/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.resources.v2016_09_01.ProviderResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource provider information.
 */
public class ProviderInner {
    /**
     * The provider ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The namespace of the resource provider.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * The registration state of the provider.
     */
    @JsonProperty(value = "registrationState", access = JsonProperty.Access.WRITE_ONLY)
    private String registrationState;

    /**
     * The collection of provider resource types.
     */
    @JsonProperty(value = "resourceTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ProviderResourceType> resourceTypes;

    /**
     * Get the provider ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the namespace of the resource provider.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace of the resource provider.
     *
     * @param namespace the namespace value to set
     * @return the ProviderInner object itself.
     */
    public ProviderInner withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the registration state of the provider.
     *
     * @return the registrationState value
     */
    public String registrationState() {
        return this.registrationState;
    }

    /**
     * Get the collection of provider resource types.
     *
     * @return the resourceTypes value
     */
    public List<ProviderResourceType> resourceTypes() {
        return this.resourceTypes;
    }

}
