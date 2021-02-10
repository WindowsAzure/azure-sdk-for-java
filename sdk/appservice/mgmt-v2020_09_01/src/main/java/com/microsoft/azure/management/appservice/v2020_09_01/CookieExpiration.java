/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The CookieExpiration model.
 */
@JsonFlatten
public class CookieExpiration extends ProxyOnlyResource {
    /**
     * Possible values include: 'FixedTime', 'IdentityProviderDerived'.
     */
    @JsonProperty(value = "properties.convention")
    private CookieExpirationConvention convention;

    /**
     * The timeToExpiration property.
     */
    @JsonProperty(value = "properties.timeToExpiration")
    private String timeToExpiration;

    /**
     * Get possible values include: 'FixedTime', 'IdentityProviderDerived'.
     *
     * @return the convention value
     */
    public CookieExpirationConvention convention() {
        return this.convention;
    }

    /**
     * Set possible values include: 'FixedTime', 'IdentityProviderDerived'.
     *
     * @param convention the convention value to set
     * @return the CookieExpiration object itself.
     */
    public CookieExpiration withConvention(CookieExpirationConvention convention) {
        this.convention = convention;
        return this;
    }

    /**
     * Get the timeToExpiration value.
     *
     * @return the timeToExpiration value
     */
    public String timeToExpiration() {
        return this.timeToExpiration;
    }

    /**
     * Set the timeToExpiration value.
     *
     * @param timeToExpiration the timeToExpiration value to set
     * @return the CookieExpiration object itself.
     */
    public CookieExpiration withTimeToExpiration(String timeToExpiration) {
        this.timeToExpiration = timeToExpiration;
        return this;
    }

}
