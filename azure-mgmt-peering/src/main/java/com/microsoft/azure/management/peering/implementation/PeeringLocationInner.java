/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.implementation;

import com.microsoft.azure.management.peering.Kind;
import com.microsoft.azure.management.peering.PeeringLocationPropertiesDirect;
import com.microsoft.azure.management.peering.PeeringLocationPropertiesExchange;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Peering location is where connectivity could be established to the Microsoft
 * Cloud Edge.
 */
@JsonFlatten
public class PeeringLocationInner {
    /**
     * The kind of peering that the peering location supports. Possible values
     * include: 'Direct', 'Exchange'.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /**
     * The properties that define a direct peering location.
     */
    @JsonProperty(value = "properties.direct")
    private PeeringLocationPropertiesDirect direct;

    /**
     * The properties that define an exchange peering location.
     */
    @JsonProperty(value = "properties.exchange")
    private PeeringLocationPropertiesExchange exchange;

    /**
     * The name of the peering location.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /**
     * The country in which the peering location exists.
     */
    @JsonProperty(value = "properties.country")
    private String country;

    /**
     * The Azure region associated with the peering location.
     */
    @JsonProperty(value = "properties.azureRegion")
    private String azureRegion;

    /**
     * The name of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The ID of the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the kind of peering that the peering location supports. Possible values include: 'Direct', 'Exchange'.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind of peering that the peering location supports. Possible values include: 'Direct', 'Exchange'.
     *
     * @param kind the kind value to set
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the properties that define a direct peering location.
     *
     * @return the direct value
     */
    public PeeringLocationPropertiesDirect direct() {
        return this.direct;
    }

    /**
     * Set the properties that define a direct peering location.
     *
     * @param direct the direct value to set
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withDirect(PeeringLocationPropertiesDirect direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Get the properties that define an exchange peering location.
     *
     * @return the exchange value
     */
    public PeeringLocationPropertiesExchange exchange() {
        return this.exchange;
    }

    /**
     * Set the properties that define an exchange peering location.
     *
     * @param exchange the exchange value to set
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withExchange(PeeringLocationPropertiesExchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get the name of the peering location.
     *
     * @return the peeringLocation value
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the name of the peering location.
     *
     * @param peeringLocation the peeringLocation value to set
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the country in which the peering location exists.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country in which the peering location exists.
     *
     * @param country the country value to set
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the Azure region associated with the peering location.
     *
     * @return the azureRegion value
     */
    public String azureRegion() {
        return this.azureRegion;
    }

    /**
     * Set the Azure region associated with the peering location.
     *
     * @param azureRegion the azureRegion value to set
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withAzureRegion(String azureRegion) {
        this.azureRegion = azureRegion;
        return this;
    }

    /**
     * Get the name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the ID of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
