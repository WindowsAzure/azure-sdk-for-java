// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.WebJobType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Web Job Information. */
@JsonFlatten
@Fluent
public class WebJobInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebJobInner.class);

    /*
     * Run command.
     */
    @JsonProperty(value = "properties.run_command")
    private String runCommand;

    /*
     * Job URL.
     */
    @JsonProperty(value = "properties.url")
    private String url;

    /*
     * Extra Info URL.
     */
    @JsonProperty(value = "properties.extra_info_url")
    private String extraInfoUrl;

    /*
     * Job type.
     */
    @JsonProperty(value = "properties.web_job_type")
    private WebJobType webJobType;

    /*
     * Error information.
     */
    @JsonProperty(value = "properties.error")
    private String error;

    /*
     * Using SDK?
     */
    @JsonProperty(value = "properties.using_sdk")
    private Boolean usingSdk;

    /*
     * Job settings.
     */
    @JsonProperty(value = "properties.settings")
    private Map<String, Object> settings;

    /**
     * Get the runCommand property: Run command.
     *
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.runCommand;
    }

    /**
     * Set the runCommand property: Run command.
     *
     * @param runCommand the runCommand value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withRunCommand(String runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * Get the url property: Job URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Job URL.
     *
     * @param url the url value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     *
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.extraInfoUrl;
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     *
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withExtraInfoUrl(String extraInfoUrl) {
        this.extraInfoUrl = extraInfoUrl;
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     *
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.webJobType;
    }

    /**
     * Set the webJobType property: Job type.
     *
     * @param webJobType the webJobType value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withWebJobType(WebJobType webJobType) {
        this.webJobType = webJobType;
        return this;
    }

    /**
     * Get the error property: Error information.
     *
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Error information.
     *
     * @param error the error value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     *
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.usingSdk;
    }

    /**
     * Set the usingSdk property: Using SDK?.
     *
     * @param usingSdk the usingSdk value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withUsingSdk(Boolean usingSdk) {
        this.usingSdk = usingSdk;
        return this;
    }

    /**
     * Get the settings property: Job settings.
     *
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Job settings.
     *
     * @param settings the settings value to set.
     * @return the WebJobInner object itself.
     */
    public WebJobInner withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebJobInner withKind(String kind) {
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
    }
}
