// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the parameters for the Url Signing action. */
@Fluent
public final class UrlSigningActionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UrlSigningActionParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * Algorithm to use for URL signing
     */
    @JsonProperty(value = "algorithm")
    private Algorithm algorithm;

    /*
     * Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     */
    @JsonProperty(value = "parameterNameOverride")
    private List<UrlSigningParamIdentifier> parameterNameOverride;

    /** Creates an instance of UrlSigningActionParameters class. */
    public UrlSigningActionParameters() {
        odataType = "#Microsoft.Azure.Cdn.Models.DeliveryRuleUrlSigningActionParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the algorithm property: Algorithm to use for URL signing.
     *
     * @return the algorithm value.
     */
    public Algorithm algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Algorithm to use for URL signing.
     *
     * @param algorithm the algorithm value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the parameterNameOverride property: Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     *
     * @return the parameterNameOverride value.
     */
    public List<UrlSigningParamIdentifier> parameterNameOverride() {
        return this.parameterNameOverride;
    }

    /**
     * Set the parameterNameOverride property: Defines which query string parameters in the url to be considered for
     * expires, key id etc.
     *
     * @param parameterNameOverride the parameterNameOverride value to set.
     * @return the UrlSigningActionParameters object itself.
     */
    public UrlSigningActionParameters withParameterNameOverride(List<UrlSigningParamIdentifier> parameterNameOverride) {
        this.parameterNameOverride = parameterNameOverride;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameterNameOverride() != null) {
            parameterNameOverride().forEach(e -> e.validate());
        }
    }
}
