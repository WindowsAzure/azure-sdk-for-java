// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response body returned for a request to Bot Service Management to check per subscription hostSettings. */
@Fluent
public final class HostSettingsResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostSettingsResponseInner.class);

    /*
     * For in-conversation bot user authentication
     */
    @JsonProperty(value = "OAuthUrl")
    private String oAuthUrl;

    /*
     * For verifying incoming tokens from the channels
     */
    @JsonProperty(value = "ToBotFromChannelOpenIdMetadataUrl")
    private String toBotFromChannelOpenIdMetadataUrl;

    /*
     * For verifying incoming tokens from the channels
     */
    @JsonProperty(value = "ToBotFromChannelTokenIssuer")
    private String toBotFromChannelTokenIssuer;

    /*
     * For verifying incoming tokens from bot emulator
     */
    @JsonProperty(value = "ToBotFromEmulatorOpenIdMetadataUrl")
    private String toBotFromEmulatorOpenIdMetadataUrl;

    /*
     * For getting access token to channels from bot host
     */
    @JsonProperty(value = "ToChannelFromBotLoginUrl")
    private String toChannelFromBotLoginUrl;

    /*
     * For getting access token to channels from bot host
     */
    @JsonProperty(value = "ToChannelFromBotOAuthScope")
    private String toChannelFromBotOAuthScope;

    /*
     * Per cloud OAuth setting on whether authority is validated
     */
    @JsonProperty(value = "ValidateAuthority")
    private Boolean validateAuthority;

    /*
     * Same as ToBotFromChannelOpenIdMetadataUrl, used by SDK < v4.12
     */
    @JsonProperty(value = "BotOpenIdMetadata")
    private String botOpenIdMetadata;

    /**
     * Get the oAuthUrl property: For in-conversation bot user authentication.
     *
     * @return the oAuthUrl value.
     */
    public String oAuthUrl() {
        return this.oAuthUrl;
    }

    /**
     * Set the oAuthUrl property: For in-conversation bot user authentication.
     *
     * @param oAuthUrl the oAuthUrl value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withOAuthUrl(String oAuthUrl) {
        this.oAuthUrl = oAuthUrl;
        return this;
    }

    /**
     * Get the toBotFromChannelOpenIdMetadataUrl property: For verifying incoming tokens from the channels.
     *
     * @return the toBotFromChannelOpenIdMetadataUrl value.
     */
    public String toBotFromChannelOpenIdMetadataUrl() {
        return this.toBotFromChannelOpenIdMetadataUrl;
    }

    /**
     * Set the toBotFromChannelOpenIdMetadataUrl property: For verifying incoming tokens from the channels.
     *
     * @param toBotFromChannelOpenIdMetadataUrl the toBotFromChannelOpenIdMetadataUrl value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withToBotFromChannelOpenIdMetadataUrl(String toBotFromChannelOpenIdMetadataUrl) {
        this.toBotFromChannelOpenIdMetadataUrl = toBotFromChannelOpenIdMetadataUrl;
        return this;
    }

    /**
     * Get the toBotFromChannelTokenIssuer property: For verifying incoming tokens from the channels.
     *
     * @return the toBotFromChannelTokenIssuer value.
     */
    public String toBotFromChannelTokenIssuer() {
        return this.toBotFromChannelTokenIssuer;
    }

    /**
     * Set the toBotFromChannelTokenIssuer property: For verifying incoming tokens from the channels.
     *
     * @param toBotFromChannelTokenIssuer the toBotFromChannelTokenIssuer value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withToBotFromChannelTokenIssuer(String toBotFromChannelTokenIssuer) {
        this.toBotFromChannelTokenIssuer = toBotFromChannelTokenIssuer;
        return this;
    }

    /**
     * Get the toBotFromEmulatorOpenIdMetadataUrl property: For verifying incoming tokens from bot emulator.
     *
     * @return the toBotFromEmulatorOpenIdMetadataUrl value.
     */
    public String toBotFromEmulatorOpenIdMetadataUrl() {
        return this.toBotFromEmulatorOpenIdMetadataUrl;
    }

    /**
     * Set the toBotFromEmulatorOpenIdMetadataUrl property: For verifying incoming tokens from bot emulator.
     *
     * @param toBotFromEmulatorOpenIdMetadataUrl the toBotFromEmulatorOpenIdMetadataUrl value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withToBotFromEmulatorOpenIdMetadataUrl(String toBotFromEmulatorOpenIdMetadataUrl) {
        this.toBotFromEmulatorOpenIdMetadataUrl = toBotFromEmulatorOpenIdMetadataUrl;
        return this;
    }

    /**
     * Get the toChannelFromBotLoginUrl property: For getting access token to channels from bot host.
     *
     * @return the toChannelFromBotLoginUrl value.
     */
    public String toChannelFromBotLoginUrl() {
        return this.toChannelFromBotLoginUrl;
    }

    /**
     * Set the toChannelFromBotLoginUrl property: For getting access token to channels from bot host.
     *
     * @param toChannelFromBotLoginUrl the toChannelFromBotLoginUrl value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withToChannelFromBotLoginUrl(String toChannelFromBotLoginUrl) {
        this.toChannelFromBotLoginUrl = toChannelFromBotLoginUrl;
        return this;
    }

    /**
     * Get the toChannelFromBotOAuthScope property: For getting access token to channels from bot host.
     *
     * @return the toChannelFromBotOAuthScope value.
     */
    public String toChannelFromBotOAuthScope() {
        return this.toChannelFromBotOAuthScope;
    }

    /**
     * Set the toChannelFromBotOAuthScope property: For getting access token to channels from bot host.
     *
     * @param toChannelFromBotOAuthScope the toChannelFromBotOAuthScope value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withToChannelFromBotOAuthScope(String toChannelFromBotOAuthScope) {
        this.toChannelFromBotOAuthScope = toChannelFromBotOAuthScope;
        return this;
    }

    /**
     * Get the validateAuthority property: Per cloud OAuth setting on whether authority is validated.
     *
     * @return the validateAuthority value.
     */
    public Boolean validateAuthority() {
        return this.validateAuthority;
    }

    /**
     * Set the validateAuthority property: Per cloud OAuth setting on whether authority is validated.
     *
     * @param validateAuthority the validateAuthority value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withValidateAuthority(Boolean validateAuthority) {
        this.validateAuthority = validateAuthority;
        return this;
    }

    /**
     * Get the botOpenIdMetadata property: Same as ToBotFromChannelOpenIdMetadataUrl, used by SDK &lt; v4.12.
     *
     * @return the botOpenIdMetadata value.
     */
    public String botOpenIdMetadata() {
        return this.botOpenIdMetadata;
    }

    /**
     * Set the botOpenIdMetadata property: Same as ToBotFromChannelOpenIdMetadataUrl, used by SDK &lt; v4.12.
     *
     * @param botOpenIdMetadata the botOpenIdMetadata value to set.
     * @return the HostSettingsResponseInner object itself.
     */
    public HostSettingsResponseInner withBotOpenIdMetadata(String botOpenIdMetadata) {
        this.botOpenIdMetadata = botOpenIdMetadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
