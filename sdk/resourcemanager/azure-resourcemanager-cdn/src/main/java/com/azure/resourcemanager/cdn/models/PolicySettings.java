// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines contents of a web application firewall global configuration. */
@Fluent
public final class PolicySettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicySettings.class);

    /*
     * describes if the policy is in enabled state or disabled state
     */
    @JsonProperty(value = "enabledState")
    private PolicyEnabledState enabledState;

    /*
     * Describes if it is in detection mode or prevention mode at policy level.
     */
    @JsonProperty(value = "mode")
    private PolicyMode mode;

    /*
     * If action type is redirect, this field represents the default redirect
     * URL for the client.
     */
    @JsonProperty(value = "defaultRedirectUrl")
    private String defaultRedirectUrl;

    /*
     * If the action type is block, this field defines the default customer
     * overridable http response status code.
     */
    @JsonProperty(value = "defaultCustomBlockResponseStatusCode")
    private PolicySettingsDefaultCustomBlockResponseStatusCode defaultCustomBlockResponseStatusCode;

    /*
     * If the action type is block, customer can override the response body.
     * The body must be specified in base64 encoding.
     */
    @JsonProperty(value = "defaultCustomBlockResponseBody")
    private String defaultCustomBlockResponseBody;

    /**
     * Get the enabledState property: describes if the policy is in enabled state or disabled state.
     *
     * @return the enabledState value.
     */
    public PolicyEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: describes if the policy is in enabled state or disabled state.
     *
     * @param enabledState the enabledState value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withEnabledState(PolicyEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the mode property: Describes if it is in detection mode or prevention mode at policy level.
     *
     * @return the mode value.
     */
    public PolicyMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Describes if it is in detection mode or prevention mode at policy level.
     *
     * @param mode the mode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(PolicyMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the defaultRedirectUrl property: If action type is redirect, this field represents the default redirect URL
     * for the client.
     *
     * @return the defaultRedirectUrl value.
     */
    public String defaultRedirectUrl() {
        return this.defaultRedirectUrl;
    }

    /**
     * Set the defaultRedirectUrl property: If action type is redirect, this field represents the default redirect URL
     * for the client.
     *
     * @param defaultRedirectUrl the defaultRedirectUrl value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withDefaultRedirectUrl(String defaultRedirectUrl) {
        this.defaultRedirectUrl = defaultRedirectUrl;
        return this;
    }

    /**
     * Get the defaultCustomBlockResponseStatusCode property: If the action type is block, this field defines the
     * default customer overridable http response status code.
     *
     * @return the defaultCustomBlockResponseStatusCode value.
     */
    public PolicySettingsDefaultCustomBlockResponseStatusCode defaultCustomBlockResponseStatusCode() {
        return this.defaultCustomBlockResponseStatusCode;
    }

    /**
     * Set the defaultCustomBlockResponseStatusCode property: If the action type is block, this field defines the
     * default customer overridable http response status code.
     *
     * @param defaultCustomBlockResponseStatusCode the defaultCustomBlockResponseStatusCode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withDefaultCustomBlockResponseStatusCode(
        PolicySettingsDefaultCustomBlockResponseStatusCode defaultCustomBlockResponseStatusCode) {
        this.defaultCustomBlockResponseStatusCode = defaultCustomBlockResponseStatusCode;
        return this;
    }

    /**
     * Get the defaultCustomBlockResponseBody property: If the action type is block, customer can override the response
     * body. The body must be specified in base64 encoding.
     *
     * @return the defaultCustomBlockResponseBody value.
     */
    public String defaultCustomBlockResponseBody() {
        return this.defaultCustomBlockResponseBody;
    }

    /**
     * Set the defaultCustomBlockResponseBody property: If the action type is block, customer can override the response
     * body. The body must be specified in base64 encoding.
     *
     * @param defaultCustomBlockResponseBody the defaultCustomBlockResponseBody value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withDefaultCustomBlockResponseBody(String defaultCustomBlockResponseBody) {
        this.defaultCustomBlockResponseBody = defaultCustomBlockResponseBody;
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
