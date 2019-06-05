/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API Authentication Settings.
 */
public class AuthenticationSettingsContract {
    /**
     * OAuth2 Authentication settings.
     */
    @JsonProperty(value = "oAuth2")
    private OAuth2AuthenticationSettingsContract oAuth2;

    /**
     * OpenID Connect Authentication Settings.
     */
    @JsonProperty(value = "openid")
    private OpenIdAuthenticationSettingsContract openid;

    /**
     * Specifies whether subscription key is required during call to this API,
     * true - API is included into closed products only, false - API is
     * included into open products alone, null - there is a mix of products.
     */
    @JsonProperty(value = "subscriptionKeyRequired")
    private Boolean subscriptionKeyRequired;

    /**
     * Get oAuth2 Authentication settings.
     *
     * @return the oAuth2 value
     */
    public OAuth2AuthenticationSettingsContract oAuth2() {
        return this.oAuth2;
    }

    /**
     * Set oAuth2 Authentication settings.
     *
     * @param oAuth2 the oAuth2 value to set
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract withOAuth2(OAuth2AuthenticationSettingsContract oAuth2) {
        this.oAuth2 = oAuth2;
        return this;
    }

    /**
     * Get openID Connect Authentication Settings.
     *
     * @return the openid value
     */
    public OpenIdAuthenticationSettingsContract openid() {
        return this.openid;
    }

    /**
     * Set openID Connect Authentication Settings.
     *
     * @param openid the openid value to set
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract withOpenid(OpenIdAuthenticationSettingsContract openid) {
        this.openid = openid;
        return this;
    }

    /**
     * Get specifies whether subscription key is required during call to this API, true - API is included into closed products only, false - API is included into open products alone, null - there is a mix of products.
     *
     * @return the subscriptionKeyRequired value
     */
    public Boolean subscriptionKeyRequired() {
        return this.subscriptionKeyRequired;
    }

    /**
     * Set specifies whether subscription key is required during call to this API, true - API is included into closed products only, false - API is included into open products alone, null - there is a mix of products.
     *
     * @param subscriptionKeyRequired the subscriptionKeyRequired value to set
     * @return the AuthenticationSettingsContract object itself.
     */
    public AuthenticationSettingsContract withSubscriptionKeyRequired(Boolean subscriptionKeyRequired) {
        this.subscriptionKeyRequired = subscriptionKeyRequired;
        return this;
    }

}
