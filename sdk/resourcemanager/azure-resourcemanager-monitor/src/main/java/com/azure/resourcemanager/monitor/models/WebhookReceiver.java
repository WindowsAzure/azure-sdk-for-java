// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A webhook receiver. */
@Fluent
public final class WebhookReceiver {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebhookReceiver.class);

    /*
     * The name of the webhook receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The URI where webhooks should be sent.
     */
    @JsonProperty(value = "serviceUri", required = true)
    private String serviceUri;

    /*
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema")
    private Boolean useCommonAlertSchema;

    /*
     * Indicates whether or not use AAD authentication.
     */
    @JsonProperty(value = "useAadAuth")
    private Boolean useAadAuth;

    /*
     * Indicates the webhook app object Id for aad auth.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /*
     * Indicates the identifier uri for aad auth.
     */
    @JsonProperty(value = "identifierUri")
    private String identifierUri;

    /*
     * Indicates the tenant id for aad auth.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get the name property: The name of the webhook receiver. Names must be unique across all receivers within an
     * action group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the webhook receiver. Names must be unique across all receivers within an
     * action group.
     *
     * @param name the name value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the serviceUri property: The URI where webhooks should be sent.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URI where webhooks should be sent.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value.
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withUseCommonAlertSchema(Boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Get the useAadAuth property: Indicates whether or not use AAD authentication.
     *
     * @return the useAadAuth value.
     */
    public Boolean useAadAuth() {
        return this.useAadAuth;
    }

    /**
     * Set the useAadAuth property: Indicates whether or not use AAD authentication.
     *
     * @param useAadAuth the useAadAuth value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withUseAadAuth(Boolean useAadAuth) {
        this.useAadAuth = useAadAuth;
        return this;
    }

    /**
     * Get the objectId property: Indicates the webhook app object Id for aad auth.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: Indicates the webhook app object Id for aad auth.
     *
     * @param objectId the objectId value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the identifierUri property: Indicates the identifier uri for aad auth.
     *
     * @return the identifierUri value.
     */
    public String identifierUri() {
        return this.identifierUri;
    }

    /**
     * Set the identifierUri property: Indicates the identifier uri for aad auth.
     *
     * @param identifierUri the identifierUri value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withIdentifierUri(String identifierUri) {
        this.identifierUri = identifierUri;
        return this;
    }

    /**
     * Get the tenantId property: Indicates the tenant id for aad auth.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Indicates the tenant id for aad auth.
     *
     * @param tenantId the tenantId value to set.
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model WebhookReceiver"));
        }
        if (serviceUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property serviceUri in model WebhookReceiver"));
        }
    }
}
