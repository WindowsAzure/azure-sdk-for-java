// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The IdentityProviders model. */
@JsonFlatten
@Fluent
public class IdentityProviders extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IdentityProviders.class);

    /*
     * The azureActiveDirectory property.
     */
    @JsonProperty(value = "properties.azureActiveDirectory")
    private AzureActiveDirectory azureActiveDirectory;

    /*
     * The facebook property.
     */
    @JsonProperty(value = "properties.facebook")
    private Facebook facebook;

    /*
     * The gitHub property.
     */
    @JsonProperty(value = "properties.gitHub")
    private GitHub gitHub;

    /*
     * The google property.
     */
    @JsonProperty(value = "properties.google")
    private Google google;

    /*
     * The legacyMicrosoftAccount property.
     */
    @JsonProperty(value = "properties.legacyMicrosoftAccount")
    private LegacyMicrosoftAccount legacyMicrosoftAccount;

    /*
     * The twitter property.
     */
    @JsonProperty(value = "properties.twitter")
    private Twitter twitter;

    /*
     * The apple property.
     */
    @JsonProperty(value = "properties.apple")
    private Apple apple;

    /*
     * The azureStaticWebApps property.
     */
    @JsonProperty(value = "properties.azureStaticWebApps")
    private AzureStaticWebApps azureStaticWebApps;

    /*
     * Dictionary of <CustomOpenIdConnectProvider>
     */
    @JsonProperty(value = "properties.customOpenIdConnectProviders")
    private Map<String, CustomOpenIdConnectProvider> customOpenIdConnectProviders;

    /**
     * Get the azureActiveDirectory property: The azureActiveDirectory property.
     *
     * @return the azureActiveDirectory value.
     */
    public AzureActiveDirectory azureActiveDirectory() {
        return this.azureActiveDirectory;
    }

    /**
     * Set the azureActiveDirectory property: The azureActiveDirectory property.
     *
     * @param azureActiveDirectory the azureActiveDirectory value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        this.azureActiveDirectory = azureActiveDirectory;
        return this;
    }

    /**
     * Get the facebook property: The facebook property.
     *
     * @return the facebook value.
     */
    public Facebook facebook() {
        return this.facebook;
    }

    /**
     * Set the facebook property: The facebook property.
     *
     * @param facebook the facebook value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withFacebook(Facebook facebook) {
        this.facebook = facebook;
        return this;
    }

    /**
     * Get the gitHub property: The gitHub property.
     *
     * @return the gitHub value.
     */
    public GitHub gitHub() {
        return this.gitHub;
    }

    /**
     * Set the gitHub property: The gitHub property.
     *
     * @param gitHub the gitHub value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withGitHub(GitHub gitHub) {
        this.gitHub = gitHub;
        return this;
    }

    /**
     * Get the google property: The google property.
     *
     * @return the google value.
     */
    public Google google() {
        return this.google;
    }

    /**
     * Set the google property: The google property.
     *
     * @param google the google value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withGoogle(Google google) {
        this.google = google;
        return this;
    }

    /**
     * Get the legacyMicrosoftAccount property: The legacyMicrosoftAccount property.
     *
     * @return the legacyMicrosoftAccount value.
     */
    public LegacyMicrosoftAccount legacyMicrosoftAccount() {
        return this.legacyMicrosoftAccount;
    }

    /**
     * Set the legacyMicrosoftAccount property: The legacyMicrosoftAccount property.
     *
     * @param legacyMicrosoftAccount the legacyMicrosoftAccount value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withLegacyMicrosoftAccount(LegacyMicrosoftAccount legacyMicrosoftAccount) {
        this.legacyMicrosoftAccount = legacyMicrosoftAccount;
        return this;
    }

    /**
     * Get the twitter property: The twitter property.
     *
     * @return the twitter value.
     */
    public Twitter twitter() {
        return this.twitter;
    }

    /**
     * Set the twitter property: The twitter property.
     *
     * @param twitter the twitter value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withTwitter(Twitter twitter) {
        this.twitter = twitter;
        return this;
    }

    /**
     * Get the apple property: The apple property.
     *
     * @return the apple value.
     */
    public Apple apple() {
        return this.apple;
    }

    /**
     * Set the apple property: The apple property.
     *
     * @param apple the apple value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withApple(Apple apple) {
        this.apple = apple;
        return this;
    }

    /**
     * Get the azureStaticWebApps property: The azureStaticWebApps property.
     *
     * @return the azureStaticWebApps value.
     */
    public AzureStaticWebApps azureStaticWebApps() {
        return this.azureStaticWebApps;
    }

    /**
     * Set the azureStaticWebApps property: The azureStaticWebApps property.
     *
     * @param azureStaticWebApps the azureStaticWebApps value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withAzureStaticWebApps(AzureStaticWebApps azureStaticWebApps) {
        this.azureStaticWebApps = azureStaticWebApps;
        return this;
    }

    /**
     * Get the customOpenIdConnectProviders property: Dictionary of &lt;CustomOpenIdConnectProvider&gt;.
     *
     * @return the customOpenIdConnectProviders value.
     */
    public Map<String, CustomOpenIdConnectProvider> customOpenIdConnectProviders() {
        return this.customOpenIdConnectProviders;
    }

    /**
     * Set the customOpenIdConnectProviders property: Dictionary of &lt;CustomOpenIdConnectProvider&gt;.
     *
     * @param customOpenIdConnectProviders the customOpenIdConnectProviders value to set.
     * @return the IdentityProviders object itself.
     */
    public IdentityProviders withCustomOpenIdConnectProviders(
        Map<String, CustomOpenIdConnectProvider> customOpenIdConnectProviders) {
        this.customOpenIdConnectProviders = customOpenIdConnectProviders;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviders withKind(String kind) {
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
        if (azureActiveDirectory() != null) {
            azureActiveDirectory().validate();
        }
        if (facebook() != null) {
            facebook().validate();
        }
        if (gitHub() != null) {
            gitHub().validate();
        }
        if (google() != null) {
            google().validate();
        }
        if (legacyMicrosoftAccount() != null) {
            legacyMicrosoftAccount().validate();
        }
        if (twitter() != null) {
            twitter().validate();
        }
        if (apple() != null) {
            apple().validate();
        }
        if (azureStaticWebApps() != null) {
            azureStaticWebApps().validate();
        }
        if (customOpenIdConnectProviders() != null) {
            customOpenIdConnectProviders()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
