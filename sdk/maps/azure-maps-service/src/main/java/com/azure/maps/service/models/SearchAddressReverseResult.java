// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result object for a Search Address Reverse response. */
@Immutable
public final class SearchAddressReverseResult {
    /*
     * The address of the result
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private SearchResultAddress address;

    /*
     * Position property in the form of "{latitude},{longitude}"
     */
    @JsonProperty(value = "position", access = JsonProperty.Access.WRITE_ONLY)
    private String position;

    /*
     * Information on the type of match.
     *
     * One of:
     * * AddressPoint
     * * HouseNumberRange
     * * Street
     */
    @JsonProperty(value = "matchType", access = JsonProperty.Access.WRITE_ONLY)
    private String matchType;

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public SearchResultAddress getAddress() {
        return this.address;
    }

    /**
     * Get the position property: Position property in the form of "{latitude},{longitude}".
     *
     * @return the position value.
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Get the matchType property: Information on the type of match.
     *
     * <p>One of: * AddressPoint * HouseNumberRange * Street.
     *
     * @return the matchType value.
     */
    public String getMatchType() {
        return this.matchType;
    }
}
