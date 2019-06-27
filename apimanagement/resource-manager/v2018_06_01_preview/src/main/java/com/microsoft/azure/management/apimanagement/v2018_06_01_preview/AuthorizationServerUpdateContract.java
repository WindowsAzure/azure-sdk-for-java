/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * External OAuth authorization server settings.
 */
@JsonFlatten
public class AuthorizationServerUpdateContract extends ProxyResource {
    /**
     * Description of the authorization server. Can contain HTML formatting
     * tags.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * HTTP verbs supported by the authorization endpoint. GET must be always
     * present. POST is optional.
     */
    @JsonProperty(value = "properties.authorizationMethods")
    private List<AuthorizationMethod> authorizationMethods;

    /**
     * Method of authentication supported by the token endpoint of this
     * authorization server. Possible values are Basic and/or Body. When Body
     * is specified, client credentials and other parameters are passed within
     * the request body in the application/x-www-form-urlencoded format.
     */
    @JsonProperty(value = "properties.clientAuthenticationMethod")
    private List<ClientAuthenticationMethod> clientAuthenticationMethod;

    /**
     * Additional parameters required by the token endpoint of this
     * authorization server represented as an array of JSON objects with name
     * and value string properties, i.e. {"name" : "name value", "value": "a
     * value"}.
     */
    @JsonProperty(value = "properties.tokenBodyParameters")
    private List<TokenBodyParameterContract> tokenBodyParameters;

    /**
     * OAuth token endpoint. Contains absolute URI to entity being referenced.
     */
    @JsonProperty(value = "properties.tokenEndpoint")
    private String tokenEndpoint;

    /**
     * If true, authorization server will include state parameter from the
     * authorization request to its response. Client may use state parameter to
     * raise protocol security.
     */
    @JsonProperty(value = "properties.supportState")
    private Boolean supportState;

    /**
     * Access token scope that is going to be requested by default. Can be
     * overridden at the API level. Should be provided in the form of a string
     * containing space-delimited values.
     */
    @JsonProperty(value = "properties.defaultScope")
    private String defaultScope;

    /**
     * Specifies the mechanism by which access token is passed to the API.
     */
    @JsonProperty(value = "properties.bearerTokenSendingMethods")
    private List<BearerTokenSendingMethod> bearerTokenSendingMethods;

    /**
     * Client or app secret registered with this authorization server.
     */
    @JsonProperty(value = "properties.clientSecret")
    private String clientSecret;

    /**
     * Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     */
    @JsonProperty(value = "properties.resourceOwnerUsername")
    private String resourceOwnerUsername;

    /**
     * Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     */
    @JsonProperty(value = "properties.resourceOwnerPassword")
    private String resourceOwnerPassword;

    /**
     * User-friendly authorization server name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Optional reference to a page where client or app registration for this
     * authorization server is performed. Contains absolute URL to entity being
     * referenced.
     */
    @JsonProperty(value = "properties.clientRegistrationEndpoint")
    private String clientRegistrationEndpoint;

    /**
     * OAuth authorization endpoint. See
     * http://tools.ietf.org/html/rfc6749#section-3.2.
     */
    @JsonProperty(value = "properties.authorizationEndpoint")
    private String authorizationEndpoint;

    /**
     * Form of an authorization grant, which the client uses to request the
     * access token.
     */
    @JsonProperty(value = "properties.grantTypes")
    private List<GrantType> grantTypes;

    /**
     * Client or app id registered with this authorization server.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /**
     * Get description of the authorization server. Can contain HTML formatting tags.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the authorization server. Can contain HTML formatting tags.
     *
     * @param description the description value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get hTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     *
     * @return the authorizationMethods value
     */
    public List<AuthorizationMethod> authorizationMethods() {
        return this.authorizationMethods;
    }

    /**
     * Set hTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     *
     * @param authorizationMethods the authorizationMethods value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withAuthorizationMethods(List<AuthorizationMethod> authorizationMethods) {
        this.authorizationMethods = authorizationMethods;
        return this;
    }

    /**
     * Get method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     *
     * @return the clientAuthenticationMethod value
     */
    public List<ClientAuthenticationMethod> clientAuthenticationMethod() {
        return this.clientAuthenticationMethod;
    }

    /**
     * Set method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     *
     * @param clientAuthenticationMethod the clientAuthenticationMethod value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withClientAuthenticationMethod(List<ClientAuthenticationMethod> clientAuthenticationMethod) {
        this.clientAuthenticationMethod = clientAuthenticationMethod;
        return this;
    }

    /**
     * Get additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     *
     * @return the tokenBodyParameters value
     */
    public List<TokenBodyParameterContract> tokenBodyParameters() {
        return this.tokenBodyParameters;
    }

    /**
     * Set additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     *
     * @param tokenBodyParameters the tokenBodyParameters value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withTokenBodyParameters(List<TokenBodyParameterContract> tokenBodyParameters) {
        this.tokenBodyParameters = tokenBodyParameters;
        return this;
    }

    /**
     * Get oAuth token endpoint. Contains absolute URI to entity being referenced.
     *
     * @return the tokenEndpoint value
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set oAuth token endpoint. Contains absolute URI to entity being referenced.
     *
     * @param tokenEndpoint the tokenEndpoint value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get if true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     *
     * @return the supportState value
     */
    public Boolean supportState() {
        return this.supportState;
    }

    /**
     * Set if true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     *
     * @param supportState the supportState value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withSupportState(Boolean supportState) {
        this.supportState = supportState;
        return this;
    }

    /**
     * Get access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     *
     * @return the defaultScope value
     */
    public String defaultScope() {
        return this.defaultScope;
    }

    /**
     * Set access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     *
     * @param defaultScope the defaultScope value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withDefaultScope(String defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    /**
     * Get specifies the mechanism by which access token is passed to the API.
     *
     * @return the bearerTokenSendingMethods value
     */
    public List<BearerTokenSendingMethod> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods;
    }

    /**
     * Set specifies the mechanism by which access token is passed to the API.
     *
     * @param bearerTokenSendingMethods the bearerTokenSendingMethods value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withBearerTokenSendingMethods(List<BearerTokenSendingMethod> bearerTokenSendingMethods) {
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        return this;
    }

    /**
     * Get client or app secret registered with this authorization server.
     *
     * @return the clientSecret value
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set client or app secret registered with this authorization server.
     *
     * @param clientSecret the clientSecret value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     *
     * @return the resourceOwnerUsername value
     */
    public String resourceOwnerUsername() {
        return this.resourceOwnerUsername;
    }

    /**
     * Set can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     *
     * @param resourceOwnerUsername the resourceOwnerUsername value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withResourceOwnerUsername(String resourceOwnerUsername) {
        this.resourceOwnerUsername = resourceOwnerUsername;
        return this;
    }

    /**
     * Get can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     *
     * @return the resourceOwnerPassword value
     */
    public String resourceOwnerPassword() {
        return this.resourceOwnerPassword;
    }

    /**
     * Set can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     *
     * @param resourceOwnerPassword the resourceOwnerPassword value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withResourceOwnerPassword(String resourceOwnerPassword) {
        this.resourceOwnerPassword = resourceOwnerPassword;
        return this;
    }

    /**
     * Get user-friendly authorization server name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set user-friendly authorization server name.
     *
     * @param displayName the displayName value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     *
     * @return the clientRegistrationEndpoint value
     */
    public String clientRegistrationEndpoint() {
        return this.clientRegistrationEndpoint;
    }

    /**
     * Set optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     *
     * @param clientRegistrationEndpoint the clientRegistrationEndpoint value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withClientRegistrationEndpoint(String clientRegistrationEndpoint) {
        this.clientRegistrationEndpoint = clientRegistrationEndpoint;
        return this;
    }

    /**
     * Get oAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     *
     * @return the authorizationEndpoint value
     */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * Set oAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     *
     * @param authorizationEndpoint the authorizationEndpoint value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * Get form of an authorization grant, which the client uses to request the access token.
     *
     * @return the grantTypes value
     */
    public List<GrantType> grantTypes() {
        return this.grantTypes;
    }

    /**
     * Set form of an authorization grant, which the client uses to request the access token.
     *
     * @param grantTypes the grantTypes value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withGrantTypes(List<GrantType> grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    /**
     * Get client or app id registered with this authorization server.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set client or app id registered with this authorization server.
     *
     * @param clientId the clientId value to set
     * @return the AuthorizationServerUpdateContract object itself.
     */
    public AuthorizationServerUpdateContract withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

}
