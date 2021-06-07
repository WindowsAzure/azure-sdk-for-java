// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters to provide for the DirectLine Speech channel. */
@Fluent
public final class DirectLineSpeechChannelProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DirectLineSpeechChannelProperties.class);

    /*
     * The cognitive service region with this channel registration.
     */
    @JsonProperty(value = "cognitiveServiceRegion", required = true)
    private String cognitiveServiceRegion;

    /*
     * The cognitive service subscription key to use with this channel
     * registration.
     */
    @JsonProperty(value = "cognitiveServiceSubscriptionKey", required = true)
    private String cognitiveServiceSubscriptionKey;

    /*
     * Whether this channel is enabled or not.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Custom speech model id (optional).
     */
    @JsonProperty(value = "customVoiceDeploymentId")
    private String customVoiceDeploymentId;

    /*
     * Custom voice deployment id (optional).
     */
    @JsonProperty(value = "customSpeechModelId")
    private String customSpeechModelId;

    /*
     * Make this a default bot for chosen cognitive service account.
     */
    @JsonProperty(value = "isDefaultBotForCogSvcAccount")
    private Boolean isDefaultBotForCogSvcAccount;

    /**
     * Get the cognitiveServiceRegion property: The cognitive service region with this channel registration.
     *
     * @return the cognitiveServiceRegion value.
     */
    public String cognitiveServiceRegion() {
        return this.cognitiveServiceRegion;
    }

    /**
     * Set the cognitiveServiceRegion property: The cognitive service region with this channel registration.
     *
     * @param cognitiveServiceRegion the cognitiveServiceRegion value to set.
     * @return the DirectLineSpeechChannelProperties object itself.
     */
    public DirectLineSpeechChannelProperties withCognitiveServiceRegion(String cognitiveServiceRegion) {
        this.cognitiveServiceRegion = cognitiveServiceRegion;
        return this;
    }

    /**
     * Get the cognitiveServiceSubscriptionKey property: The cognitive service subscription key to use with this channel
     * registration.
     *
     * @return the cognitiveServiceSubscriptionKey value.
     */
    public String cognitiveServiceSubscriptionKey() {
        return this.cognitiveServiceSubscriptionKey;
    }

    /**
     * Set the cognitiveServiceSubscriptionKey property: The cognitive service subscription key to use with this channel
     * registration.
     *
     * @param cognitiveServiceSubscriptionKey the cognitiveServiceSubscriptionKey value to set.
     * @return the DirectLineSpeechChannelProperties object itself.
     */
    public DirectLineSpeechChannelProperties withCognitiveServiceSubscriptionKey(
        String cognitiveServiceSubscriptionKey) {
        this.cognitiveServiceSubscriptionKey = cognitiveServiceSubscriptionKey;
        return this;
    }

    /**
     * Get the isEnabled property: Whether this channel is enabled or not.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this channel is enabled or not.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the DirectLineSpeechChannelProperties object itself.
     */
    public DirectLineSpeechChannelProperties withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the customVoiceDeploymentId property: Custom speech model id (optional).
     *
     * @return the customVoiceDeploymentId value.
     */
    public String customVoiceDeploymentId() {
        return this.customVoiceDeploymentId;
    }

    /**
     * Set the customVoiceDeploymentId property: Custom speech model id (optional).
     *
     * @param customVoiceDeploymentId the customVoiceDeploymentId value to set.
     * @return the DirectLineSpeechChannelProperties object itself.
     */
    public DirectLineSpeechChannelProperties withCustomVoiceDeploymentId(String customVoiceDeploymentId) {
        this.customVoiceDeploymentId = customVoiceDeploymentId;
        return this;
    }

    /**
     * Get the customSpeechModelId property: Custom voice deployment id (optional).
     *
     * @return the customSpeechModelId value.
     */
    public String customSpeechModelId() {
        return this.customSpeechModelId;
    }

    /**
     * Set the customSpeechModelId property: Custom voice deployment id (optional).
     *
     * @param customSpeechModelId the customSpeechModelId value to set.
     * @return the DirectLineSpeechChannelProperties object itself.
     */
    public DirectLineSpeechChannelProperties withCustomSpeechModelId(String customSpeechModelId) {
        this.customSpeechModelId = customSpeechModelId;
        return this;
    }

    /**
     * Get the isDefaultBotForCogSvcAccount property: Make this a default bot for chosen cognitive service account.
     *
     * @return the isDefaultBotForCogSvcAccount value.
     */
    public Boolean isDefaultBotForCogSvcAccount() {
        return this.isDefaultBotForCogSvcAccount;
    }

    /**
     * Set the isDefaultBotForCogSvcAccount property: Make this a default bot for chosen cognitive service account.
     *
     * @param isDefaultBotForCogSvcAccount the isDefaultBotForCogSvcAccount value to set.
     * @return the DirectLineSpeechChannelProperties object itself.
     */
    public DirectLineSpeechChannelProperties withIsDefaultBotForCogSvcAccount(Boolean isDefaultBotForCogSvcAccount) {
        this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cognitiveServiceRegion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property cognitiveServiceRegion in model DirectLineSpeechChannelProperties"));
        }
        if (cognitiveServiceSubscriptionKey() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property cognitiveServiceSubscriptionKey in model"
                            + " DirectLineSpeechChannelProperties"));
        }
    }
}
