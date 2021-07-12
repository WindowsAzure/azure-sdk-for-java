// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WSDL service. */
@Fluent
public final class WsdlService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WsdlService.class);

    /*
     * The qualified name.
     */
    @JsonProperty(value = "qualifiedName")
    private String qualifiedName;

    /*
     * The list of endpoints' qualified names.
     */
    @JsonProperty(value = "EndpointQualifiedNames")
    private List<String> endpointQualifiedNames;

    /**
     * Get the qualifiedName property: The qualified name.
     *
     * @return the qualifiedName value.
     */
    public String qualifiedName() {
        return this.qualifiedName;
    }

    /**
     * Set the qualifiedName property: The qualified name.
     *
     * @param qualifiedName the qualifiedName value to set.
     * @return the WsdlService object itself.
     */
    public WsdlService withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * Get the endpointQualifiedNames property: The list of endpoints' qualified names.
     *
     * @return the endpointQualifiedNames value.
     */
    public List<String> endpointQualifiedNames() {
        return this.endpointQualifiedNames;
    }

    /**
     * Set the endpointQualifiedNames property: The list of endpoints' qualified names.
     *
     * @param endpointQualifiedNames the endpointQualifiedNames value to set.
     * @return the WsdlService object itself.
     */
    public WsdlService withEndpointQualifiedNames(List<String> endpointQualifiedNames) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
