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
 * The CustomOpenIdConnectProvider model.
 */
@JsonFlatten
public class CustomOpenIdConnectProvider extends ProxyOnlyResource {
    /**
     * The enabled property.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The registration property.
     */
    @JsonProperty(value = "properties.registration")
    private OpenIdConnectRegistration registration;

    /**
     * The login property.
     */
    @JsonProperty(value = "properties.login")
    private OpenIdConnectLogin login;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the CustomOpenIdConnectProvider object itself.
     */
    public CustomOpenIdConnectProvider withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration value.
     *
     * @return the registration value
     */
    public OpenIdConnectRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration value.
     *
     * @param registration the registration value to set
     * @return the CustomOpenIdConnectProvider object itself.
     */
    public CustomOpenIdConnectProvider withRegistration(OpenIdConnectRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login value.
     *
     * @return the login value
     */
    public OpenIdConnectLogin login() {
        return this.login;
    }

    /**
     * Set the login value.
     *
     * @param login the login value to set
     * @return the CustomOpenIdConnectProvider object itself.
     */
    public CustomOpenIdConnectProvider withLogin(OpenIdConnectLogin login) {
        this.login = login;
        return this;
    }

}
