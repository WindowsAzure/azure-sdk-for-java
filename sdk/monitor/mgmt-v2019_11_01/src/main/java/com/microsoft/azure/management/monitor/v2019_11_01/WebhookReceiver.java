/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A webhook receiver.
 */
public class WebhookReceiver {
    /**
     * The name of the webhook receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The URI where webhooks should be sent.
     */
    @JsonProperty(value = "serviceUri", required = true)
    private String serviceUri;

    /**
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /**
     * Indicates whether or not use AAD authentication.
     */
    @JsonProperty(value = "useAadAuth")
    private Boolean useAadAuth;

    /**
     * Indicates the webhook app object Id for aad auth.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * Indicates the identifier uri for aad auth.
     */
    @JsonProperty(value = "identifierUri")
    private String identifierUri;

    /**
     * Indicates the tenant id for aad auth.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get the name of the webhook receiver. Names must be unique across all receivers within an action group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the webhook receiver. Names must be unique across all receivers within an action group.
     *
     * @param name the name value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the URI where webhooks should be sent.
     *
     * @return the serviceUri value
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the URI where webhooks should be sent.
     *
     * @param serviceUri the serviceUri value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Get indicates whether or not use AAD authentication.
     *
     * @return the useAadAuth value
     */
    public Boolean useAadAuth() {
        return this.useAadAuth;
    }

    /**
     * Set indicates whether or not use AAD authentication.
     *
     * @param useAadAuth the useAadAuth value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withUseAadAuth(Boolean useAadAuth) {
        this.useAadAuth = useAadAuth;
        return this;
    }

    /**
     * Get indicates the webhook app object Id for aad auth.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set indicates the webhook app object Id for aad auth.
     *
     * @param objectId the objectId value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get indicates the identifier uri for aad auth.
     *
     * @return the identifierUri value
     */
    public String identifierUri() {
        return this.identifierUri;
    }

    /**
     * Set indicates the identifier uri for aad auth.
     *
     * @param identifierUri the identifierUri value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withIdentifierUri(String identifierUri) {
        this.identifierUri = identifierUri;
        return this;
    }

    /**
     * Get indicates the tenant id for aad auth.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set indicates the tenant id for aad auth.
     *
     * @param tenantId the tenantId value to set
     * @return the WebhookReceiver object itself.
     */
    public WebhookReceiver withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
