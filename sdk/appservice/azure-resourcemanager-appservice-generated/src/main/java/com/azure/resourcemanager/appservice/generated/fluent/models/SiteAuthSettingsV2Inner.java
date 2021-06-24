// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.AuthPlatform;
import com.azure.resourcemanager.appservice.generated.models.GlobalValidation;
import com.azure.resourcemanager.appservice.generated.models.HttpSettings;
import com.azure.resourcemanager.appservice.generated.models.IdentityProviders;
import com.azure.resourcemanager.appservice.generated.models.Login;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration settings for the Azure App Service Authentication / Authorization V2 feature. */
@JsonFlatten
@Fluent
public class SiteAuthSettingsV2Inner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SiteAuthSettingsV2Inner.class);

    /*
     * The configuration settings of the platform of App Service
     * Authentication/Authorization.
     */
    @JsonProperty(value = "properties.platform")
    private AuthPlatform platform;

    /*
     * The configuration settings that determines the validation flow of users
     * using App Service Authentication/Authorization.
     */
    @JsonProperty(value = "properties.globalValidation")
    private GlobalValidation globalValidation;

    /*
     * The configuration settings of each of the identity providers used to
     * configure App Service Authentication/Authorization.
     */
    @JsonProperty(value = "properties.identityProviders")
    private IdentityProviders identityProviders;

    /*
     * The configuration settings of the login flow of users using App Service
     * Authentication/Authorization.
     */
    @JsonProperty(value = "properties.login")
    private Login login;

    /*
     * The configuration settings of the HTTP requests for authentication and
     * authorization requests made against App Service
     * Authentication/Authorization.
     */
    @JsonProperty(value = "properties.httpSettings")
    private HttpSettings httpSettings;

    /**
     * Get the platform property: The configuration settings of the platform of App Service
     * Authentication/Authorization.
     *
     * @return the platform value.
     */
    public AuthPlatform platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The configuration settings of the platform of App Service
     * Authentication/Authorization.
     *
     * @param platform the platform value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withPlatform(AuthPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the globalValidation property: The configuration settings that determines the validation flow of users using
     * App Service Authentication/Authorization.
     *
     * @return the globalValidation value.
     */
    public GlobalValidation globalValidation() {
        return this.globalValidation;
    }

    /**
     * Set the globalValidation property: The configuration settings that determines the validation flow of users using
     * App Service Authentication/Authorization.
     *
     * @param globalValidation the globalValidation value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withGlobalValidation(GlobalValidation globalValidation) {
        this.globalValidation = globalValidation;
        return this;
    }

    /**
     * Get the identityProviders property: The configuration settings of each of the identity providers used to
     * configure App Service Authentication/Authorization.
     *
     * @return the identityProviders value.
     */
    public IdentityProviders identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set the identityProviders property: The configuration settings of each of the identity providers used to
     * configure App Service Authentication/Authorization.
     *
     * @param identityProviders the identityProviders value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withIdentityProviders(IdentityProviders identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the login flow of users using App Service
     * Authentication/Authorization.
     *
     * @return the login value.
     */
    public Login login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the login flow of users using App Service
     * Authentication/Authorization.
     *
     * @param login the login value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withLogin(Login login) {
        this.login = login;
        return this;
    }

    /**
     * Get the httpSettings property: The configuration settings of the HTTP requests for authentication and
     * authorization requests made against App Service Authentication/Authorization.
     *
     * @return the httpSettings value.
     */
    public HttpSettings httpSettings() {
        return this.httpSettings;
    }

    /**
     * Set the httpSettings property: The configuration settings of the HTTP requests for authentication and
     * authorization requests made against App Service Authentication/Authorization.
     *
     * @param httpSettings the httpSettings value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withHttpSettings(HttpSettings httpSettings) {
        this.httpSettings = httpSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SiteAuthSettingsV2Inner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (platform() != null) {
            platform().validate();
        }
        if (globalValidation() != null) {
            globalValidation().validate();
        }
        if (identityProviders() != null) {
            identityProviders().validate();
        }
        if (login() != null) {
            login().validate();
        }
        if (httpSettings() != null) {
            httpSettings().validate();
        }
    }
}
