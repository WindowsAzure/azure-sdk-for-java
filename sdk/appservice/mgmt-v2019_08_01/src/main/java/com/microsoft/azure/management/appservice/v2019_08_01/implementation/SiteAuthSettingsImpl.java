/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SiteAuthSettings;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.BuiltInAuthenticationProvider;
import com.microsoft.azure.management.appservice.v2019_08_01.UnauthenticatedClientAction;

class SiteAuthSettingsImpl extends WrapperImpl<SiteAuthSettingsInner> implements SiteAuthSettings {
    private final AppServiceManager manager;
    SiteAuthSettingsImpl(SiteAuthSettingsInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public List<String> additionalLoginParams() {
        return this.inner().additionalLoginParams();
    }

    @Override
    public List<String> allowedAudiences() {
        return this.inner().allowedAudiences();
    }

    @Override
    public List<String> allowedExternalRedirectUrls() {
        return this.inner().allowedExternalRedirectUrls();
    }

    @Override
    public String clientId() {
        return this.inner().clientId();
    }

    @Override
    public String clientSecret() {
        return this.inner().clientSecret();
    }

    @Override
    public String clientSecretCertificateThumbprint() {
        return this.inner().clientSecretCertificateThumbprint();
    }

    @Override
    public BuiltInAuthenticationProvider defaultProvider() {
        return this.inner().defaultProvider();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String facebookAppId() {
        return this.inner().facebookAppId();
    }

    @Override
    public String facebookAppSecret() {
        return this.inner().facebookAppSecret();
    }

    @Override
    public List<String> facebookOAuthScopes() {
        return this.inner().facebookOAuthScopes();
    }

    @Override
    public String googleClientId() {
        return this.inner().googleClientId();
    }

    @Override
    public String googleClientSecret() {
        return this.inner().googleClientSecret();
    }

    @Override
    public List<String> googleOAuthScopes() {
        return this.inner().googleOAuthScopes();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String issuer() {
        return this.inner().issuer();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String microsoftAccountClientId() {
        return this.inner().microsoftAccountClientId();
    }

    @Override
    public String microsoftAccountClientSecret() {
        return this.inner().microsoftAccountClientSecret();
    }

    @Override
    public List<String> microsoftAccountOAuthScopes() {
        return this.inner().microsoftAccountOAuthScopes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String runtimeVersion() {
        return this.inner().runtimeVersion();
    }

    @Override
    public Double tokenRefreshExtensionHours() {
        return this.inner().tokenRefreshExtensionHours();
    }

    @Override
    public Boolean tokenStoreEnabled() {
        return this.inner().tokenStoreEnabled();
    }

    @Override
    public String twitterConsumerKey() {
        return this.inner().twitterConsumerKey();
    }

    @Override
    public String twitterConsumerSecret() {
        return this.inner().twitterConsumerSecret();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UnauthenticatedClientAction unauthenticatedClientAction() {
        return this.inner().unauthenticatedClientAction();
    }

    @Override
    public Boolean validateIssuer() {
        return this.inner().validateIssuer();
    }

}
