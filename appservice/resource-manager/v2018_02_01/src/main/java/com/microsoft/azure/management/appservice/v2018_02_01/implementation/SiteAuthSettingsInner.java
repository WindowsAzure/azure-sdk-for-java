/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.UnauthenticatedClientAction;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.BuiltInAuthenticationProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Configuration settings for the Azure App Service Authentication /
 * Authorization feature.
 */
@JsonFlatten
public class SiteAuthSettingsInner extends ProxyOnlyResource {
    /**
     * &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization
     * feature is enabled for the current app; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use
     * for the current app.
     * The setting in this value can control the behavior of certain features
     * in the Authentication / Authorization module.
     */
    @JsonProperty(value = "properties.runtimeVersion")
    private String runtimeVersion;

    /**
     * The action to take when an unauthenticated client attempts to access the
     * app. Possible values include: 'RedirectToLoginPage', 'AllowAnonymous'.
     */
    @JsonProperty(value = "properties.unauthenticatedClientAction")
    private UnauthenticatedClientAction unauthenticatedClientAction;

    /**
     * &lt;code&gt;true&lt;/code&gt; to durably store platform-specific
     * security tokens that are obtained during login flows; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * The default is &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.tokenStoreEnabled")
    private Boolean tokenStoreEnabled;

    /**
     * External URLs that can be redirected to as part of logging in or logging
     * out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store
     * application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     */
    @JsonProperty(value = "properties.allowedExternalRedirectUrls")
    private List<String> allowedExternalRedirectUrls;

    /**
     * The default authentication provider to use when multiple providers are
     * configured.
     * This setting is only needed if multiple providers are configured and the
     * unauthenticated client
     * action is set to "RedirectToLoginPage". Possible values include:
     * 'AzureActiveDirectory', 'Facebook', 'Google', 'MicrosoftAccount',
     * 'Twitter'.
     */
    @JsonProperty(value = "properties.defaultProvider")
    private BuiltInAuthenticationProvider defaultProvider;

    /**
     * The number of hours after session token expiration that a session token
     * can be used to
     * call the token refresh API. The default is 72 hours.
     */
    @JsonProperty(value = "properties.tokenRefreshExtensionHours")
    private Double tokenRefreshExtensionHours;

    /**
     * The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication
     * with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect:
     * http://openid.net/specs/openid-connect-core-1_0.html.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /**
     * The Client Secret of this relying party application (in Azure Active
     * Directory, this is also referred to as the Key).
     * This setting is optional. If no client secret is configured, the OpenID
     * Connect implicit auth flow is used to authenticate end users.
     * Otherwise, the OpenID Connect Authorization Code Flow is used to
     * authenticate end users.
     * More information on OpenID Connect:
     * http://openid.net/specs/openid-connect-core-1_0.html.
     */
    @JsonProperty(value = "properties.clientSecret")
    private String clientSecret;

    /**
     * An alternative to the client secret, that is the thumbprint of a
     * certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     */
    @JsonProperty(value = "properties.clientSecretCertificateThumbprint")
    private String clientSecretCertificateThumbprint;

    /**
     * The OpenID Connect Issuer URI that represents the entity which issues
     * access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the
     * directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery:
     * http://openid.net/specs/openid-connect-discovery-1_0.html.
     */
    @JsonProperty(value = "properties.issuer")
    private String issuer;

    /**
     * Gets a value indicating whether the issuer should be a valid HTTPS url
     * and be validated as such.
     */
    @JsonProperty(value = "properties.validateIssuer")
    private Boolean validateIssuer;

    /**
     * Allowed audience values to consider when validating JWTs issued by
     * Azure Active Directory. Note that the &lt;code&gt;ClientID&lt;/code&gt;
     * value is always considered an
     * allowed audience, regardless of this setting.
     */
    @JsonProperty(value = "properties.allowedAudiences")
    private List<String> allowedAudiences;

    /**
     * Login parameters to send to the OpenID Connect authorization endpoint
     * when
     * a user logs in. Each parameter must be in the form "key=value".
     */
    @JsonProperty(value = "properties.additionalLoginParams")
    private List<String> additionalLoginParams;

    /**
     * The OpenID Connect Client ID for the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     */
    @JsonProperty(value = "properties.googleClientId")
    private String googleClientId;

    /**
     * The client secret associated with the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     */
    @JsonProperty(value = "properties.googleClientSecret")
    private String googleClientSecret;

    /**
     * The OAuth 2.0 scopes that will be requested as part of Google Sign-In
     * authentication.
     * This setting is optional. If not specified, "openid", "profile", and
     * "email" are used as default scopes.
     * Google Sign-In documentation:
     * https://developers.google.com/identity/sign-in/web/.
     */
    @JsonProperty(value = "properties.googleOAuthScopes")
    private List<String> googleOAuthScopes;

    /**
     * The App ID of the Facebook app used for login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     */
    @JsonProperty(value = "properties.facebookAppId")
    private String facebookAppId;

    /**
     * The App Secret of the Facebook app used for Facebook Login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     */
    @JsonProperty(value = "properties.facebookAppSecret")
    private String facebookAppSecret;

    /**
     * The OAuth 2.0 scopes that will be requested as part of Facebook Login
     * authentication.
     * This setting is optional.
     * Facebook Login documentation:
     * https://developers.facebook.com/docs/facebook-login.
     */
    @JsonProperty(value = "properties.facebookOAuthScopes")
    private List<String> facebookOAuthScopes;

    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in.
     */
    @JsonProperty(value = "properties.twitterConsumerKey")
    private String twitterConsumerKey;

    /**
     * The OAuth 1.0a consumer secret of the Twitter application used for
     * sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in.
     */
    @JsonProperty(value = "properties.twitterConsumerSecret")
    private String twitterConsumerSecret;

    /**
     * The OAuth 2.0 client ID that was created for the app used for
     * authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation:
     * https://dev.onedrive.com/auth/msa_oauth.htm.
     */
    @JsonProperty(value = "properties.microsoftAccountClientId")
    private String microsoftAccountClientId;

    /**
     * The OAuth 2.0 client secret that was created for the app used for
     * authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation:
     * https://dev.onedrive.com/auth/msa_oauth.htm.
     */
    @JsonProperty(value = "properties.microsoftAccountClientSecret")
    private String microsoftAccountClientSecret;

    /**
     * The OAuth 2.0 scopes that will be requested as part of Microsoft Account
     * authentication.
     * This setting is optional. If not specified, "wl.basic" is used as the
     * default scope.
     * Microsoft Account Scopes and permissions documentation:
     * https://msdn.microsoft.com/en-us/library/dn631845.aspx.
     */
    @JsonProperty(value = "properties.microsoftAccountOAuthScopes")
    private List<String> microsoftAccountOAuthScopes;

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param enabled the enabled value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     *
     * @return the runtimeVersion value
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     *
     * @param runtimeVersion the runtimeVersion value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the action to take when an unauthenticated client attempts to access the app. Possible values include: 'RedirectToLoginPage', 'AllowAnonymous'.
     *
     * @return the unauthenticatedClientAction value
     */
    public UnauthenticatedClientAction unauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }

    /**
     * Set the action to take when an unauthenticated client attempts to access the app. Possible values include: 'RedirectToLoginPage', 'AllowAnonymous'.
     *
     * @param unauthenticatedClientAction the unauthenticatedClientAction value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withUnauthenticatedClientAction(UnauthenticatedClientAction unauthenticatedClientAction) {
        this.unauthenticatedClientAction = unauthenticatedClientAction;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security tokens that are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;.
      The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the tokenStoreEnabled value
     */
    public Boolean tokenStoreEnabled() {
        return this.tokenStoreEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security tokens that are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;.
      The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @param tokenStoreEnabled the tokenStoreEnabled value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withTokenStoreEnabled(Boolean tokenStoreEnabled) {
        this.tokenStoreEnabled = tokenStoreEnabled;
        return this;
    }

    /**
     * Get external URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     This is an advanced setting typically only needed by Windows Store application backends.
     Note that URLs within the current domain are always implicitly allowed.
     *
     * @return the allowedExternalRedirectUrls value
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }

    /**
     * Set external URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     This is an advanced setting typically only needed by Windows Store application backends.
     Note that URLs within the current domain are always implicitly allowed.
     *
     * @param allowedExternalRedirectUrls the allowedExternalRedirectUrls value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withAllowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        return this;
    }

    /**
     * Get the default authentication provider to use when multiple providers are configured.
     This setting is only needed if multiple providers are configured and the unauthenticated client
     action is set to "RedirectToLoginPage". Possible values include: 'AzureActiveDirectory', 'Facebook', 'Google', 'MicrosoftAccount', 'Twitter'.
     *
     * @return the defaultProvider value
     */
    public BuiltInAuthenticationProvider defaultProvider() {
        return this.defaultProvider;
    }

    /**
     * Set the default authentication provider to use when multiple providers are configured.
     This setting is only needed if multiple providers are configured and the unauthenticated client
     action is set to "RedirectToLoginPage". Possible values include: 'AzureActiveDirectory', 'Facebook', 'Google', 'MicrosoftAccount', 'Twitter'.
     *
     * @param defaultProvider the defaultProvider value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withDefaultProvider(BuiltInAuthenticationProvider defaultProvider) {
        this.defaultProvider = defaultProvider;
        return this;
    }

    /**
     * Get the number of hours after session token expiration that a session token can be used to
     call the token refresh API. The default is 72 hours.
     *
     * @return the tokenRefreshExtensionHours value
     */
    public Double tokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours;
    }

    /**
     * Set the number of hours after session token expiration that a session token can be used to
     call the token refresh API. The default is 72 hours.
     *
     * @param tokenRefreshExtensionHours the tokenRefreshExtensionHours value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withTokenRefreshExtensionHours(Double tokenRefreshExtensionHours) {
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
        return this;
    }

    /**
     * Get the Client ID of this relying party application, known as the client_id.
     This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     other 3rd party OpenID Connect providers.
     More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the Client ID of this relying party application, known as the client_id.
     This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     other 3rd party OpenID Connect providers.
     More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @param clientId the clientId value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the Client Secret of this relying party application (in Azure Active Directory, this is also referred to as the Key).
     This setting is optional. If no client secret is configured, the OpenID Connect implicit auth flow is used to authenticate end users.
     Otherwise, the OpenID Connect Authorization Code Flow is used to authenticate end users.
     More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @return the clientSecret value
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the Client Secret of this relying party application (in Azure Active Directory, this is also referred to as the Key).
     This setting is optional. If no client secret is configured, the OpenID Connect implicit auth flow is used to authenticate end users.
     Otherwise, the OpenID Connect Authorization Code Flow is used to authenticate end users.
     More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @param clientSecret the clientSecret value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get an alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     a replacement for the Client Secret. It is also optional.
     *
     * @return the clientSecretCertificateThumbprint value
     */
    public String clientSecretCertificateThumbprint() {
        return this.clientSecretCertificateThumbprint;
    }

    /**
     * Set an alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     a replacement for the Client Secret. It is also optional.
     *
     * @param clientSecretCertificateThumbprint the clientSecretCertificateThumbprint value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withClientSecretCertificateThumbprint(String clientSecretCertificateThumbprint) {
        this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
        return this;
    }

    /**
     * Get the OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     This URI is a case-sensitive identifier for the token issuer.
     More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html.
     *
     * @return the issuer value
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     This URI is a case-sensitive identifier for the token issuer.
     More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html.
     *
     * @param issuer the issuer value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get gets a value indicating whether the issuer should be a valid HTTPS url and be validated as such.
     *
     * @return the validateIssuer value
     */
    public Boolean validateIssuer() {
        return this.validateIssuer;
    }

    /**
     * Set gets a value indicating whether the issuer should be a valid HTTPS url and be validated as such.
     *
     * @param validateIssuer the validateIssuer value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withValidateIssuer(Boolean validateIssuer) {
        this.validateIssuer = validateIssuer;
        return this;
    }

    /**
     * Get allowed audience values to consider when validating JWTs issued by
     Azure Active Directory. Note that the &lt;code&gt;ClientID&lt;/code&gt; value is always considered an
     allowed audience, regardless of this setting.
     *
     * @return the allowedAudiences value
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set allowed audience values to consider when validating JWTs issued by
     Azure Active Directory. Note that the &lt;code&gt;ClientID&lt;/code&gt; value is always considered an
     allowed audience, regardless of this setting.
     *
     * @param allowedAudiences the allowedAudiences value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
        return this;
    }

    /**
     * Get login parameters to send to the OpenID Connect authorization endpoint when
     a user logs in. Each parameter must be in the form "key=value".
     *
     * @return the additionalLoginParams value
     */
    public List<String> additionalLoginParams() {
        return this.additionalLoginParams;
    }

    /**
     * Set login parameters to send to the OpenID Connect authorization endpoint when
     a user logs in. Each parameter must be in the form "key=value".
     *
     * @param additionalLoginParams the additionalLoginParams value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withAdditionalLoginParams(List<String> additionalLoginParams) {
        this.additionalLoginParams = additionalLoginParams;
        return this;
    }

    /**
     * Get the OpenID Connect Client ID for the Google web application.
     This setting is required for enabling Google Sign-In.
     Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @return the googleClientId value
     */
    public String googleClientId() {
        return this.googleClientId;
    }

    /**
     * Set the OpenID Connect Client ID for the Google web application.
     This setting is required for enabling Google Sign-In.
     Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @param googleClientId the googleClientId value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withGoogleClientId(String googleClientId) {
        this.googleClientId = googleClientId;
        return this;
    }

    /**
     * Get the client secret associated with the Google web application.
     This setting is required for enabling Google Sign-In.
     Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @return the googleClientSecret value
     */
    public String googleClientSecret() {
        return this.googleClientSecret;
    }

    /**
     * Set the client secret associated with the Google web application.
     This setting is required for enabling Google Sign-In.
     Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @param googleClientSecret the googleClientSecret value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withGoogleClientSecret(String googleClientSecret) {
        this.googleClientSecret = googleClientSecret;
        return this;
    }

    /**
     * Get the OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication.
     This setting is optional. If not specified, "openid", "profile", and "email" are used as default scopes.
     Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @return the googleOAuthScopes value
     */
    public List<String> googleOAuthScopes() {
        return this.googleOAuthScopes;
    }

    /**
     * Set the OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication.
     This setting is optional. If not specified, "openid", "profile", and "email" are used as default scopes.
     Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/.
     *
     * @param googleOAuthScopes the googleOAuthScopes value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withGoogleOAuthScopes(List<String> googleOAuthScopes) {
        this.googleOAuthScopes = googleOAuthScopes;
        return this;
    }

    /**
     * Get the App ID of the Facebook app used for login.
     This setting is required for enabling Facebook Login.
     Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @return the facebookAppId value
     */
    public String facebookAppId() {
        return this.facebookAppId;
    }

    /**
     * Set the App ID of the Facebook app used for login.
     This setting is required for enabling Facebook Login.
     Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @param facebookAppId the facebookAppId value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withFacebookAppId(String facebookAppId) {
        this.facebookAppId = facebookAppId;
        return this;
    }

    /**
     * Get the App Secret of the Facebook app used for Facebook Login.
     This setting is required for enabling Facebook Login.
     Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @return the facebookAppSecret value
     */
    public String facebookAppSecret() {
        return this.facebookAppSecret;
    }

    /**
     * Set the App Secret of the Facebook app used for Facebook Login.
     This setting is required for enabling Facebook Login.
     Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @param facebookAppSecret the facebookAppSecret value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withFacebookAppSecret(String facebookAppSecret) {
        this.facebookAppSecret = facebookAppSecret;
        return this;
    }

    /**
     * Get the OAuth 2.0 scopes that will be requested as part of Facebook Login authentication.
     This setting is optional.
     Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @return the facebookOAuthScopes value
     */
    public List<String> facebookOAuthScopes() {
        return this.facebookOAuthScopes;
    }

    /**
     * Set the OAuth 2.0 scopes that will be requested as part of Facebook Login authentication.
     This setting is optional.
     Facebook Login documentation: https://developers.facebook.com/docs/facebook-login.
     *
     * @param facebookOAuthScopes the facebookOAuthScopes value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withFacebookOAuthScopes(List<String> facebookOAuthScopes) {
        this.facebookOAuthScopes = facebookOAuthScopes;
        return this;
    }

    /**
     * Get the OAuth 1.0a consumer key of the Twitter application used for sign-in.
     This setting is required for enabling Twitter Sign-In.
     Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in.
     *
     * @return the twitterConsumerKey value
     */
    public String twitterConsumerKey() {
        return this.twitterConsumerKey;
    }

    /**
     * Set the OAuth 1.0a consumer key of the Twitter application used for sign-in.
     This setting is required for enabling Twitter Sign-In.
     Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in.
     *
     * @param twitterConsumerKey the twitterConsumerKey value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withTwitterConsumerKey(String twitterConsumerKey) {
        this.twitterConsumerKey = twitterConsumerKey;
        return this;
    }

    /**
     * Get the OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     This setting is required for enabling Twitter Sign-In.
     Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in.
     *
     * @return the twitterConsumerSecret value
     */
    public String twitterConsumerSecret() {
        return this.twitterConsumerSecret;
    }

    /**
     * Set the OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     This setting is required for enabling Twitter Sign-In.
     Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in.
     *
     * @param twitterConsumerSecret the twitterConsumerSecret value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withTwitterConsumerSecret(String twitterConsumerSecret) {
        this.twitterConsumerSecret = twitterConsumerSecret;
        return this;
    }

    /**
     * Get the OAuth 2.0 client ID that was created for the app used for authentication.
     This setting is required for enabling Microsoft Account authentication.
     Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm.
     *
     * @return the microsoftAccountClientId value
     */
    public String microsoftAccountClientId() {
        return this.microsoftAccountClientId;
    }

    /**
     * Set the OAuth 2.0 client ID that was created for the app used for authentication.
     This setting is required for enabling Microsoft Account authentication.
     Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm.
     *
     * @param microsoftAccountClientId the microsoftAccountClientId value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withMicrosoftAccountClientId(String microsoftAccountClientId) {
        this.microsoftAccountClientId = microsoftAccountClientId;
        return this;
    }

    /**
     * Get the OAuth 2.0 client secret that was created for the app used for authentication.
     This setting is required for enabling Microsoft Account authentication.
     Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm.
     *
     * @return the microsoftAccountClientSecret value
     */
    public String microsoftAccountClientSecret() {
        return this.microsoftAccountClientSecret;
    }

    /**
     * Set the OAuth 2.0 client secret that was created for the app used for authentication.
     This setting is required for enabling Microsoft Account authentication.
     Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm.
     *
     * @param microsoftAccountClientSecret the microsoftAccountClientSecret value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withMicrosoftAccountClientSecret(String microsoftAccountClientSecret) {
        this.microsoftAccountClientSecret = microsoftAccountClientSecret;
        return this;
    }

    /**
     * Get the OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     This setting is optional. If not specified, "wl.basic" is used as the default scope.
     Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx.
     *
     * @return the microsoftAccountOAuthScopes value
     */
    public List<String> microsoftAccountOAuthScopes() {
        return this.microsoftAccountOAuthScopes;
    }

    /**
     * Set the OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     This setting is optional. If not specified, "wl.basic" is used as the default scope.
     Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx.
     *
     * @param microsoftAccountOAuthScopes the microsoftAccountOAuthScopes value to set
     * @return the SiteAuthSettingsInner object itself.
     */
    public SiteAuthSettingsInner withMicrosoftAccountOAuthScopes(List<String> microsoftAccountOAuthScopes) {
        this.microsoftAccountOAuthScopes = microsoftAccountOAuthScopes;
        return this;
    }

}
