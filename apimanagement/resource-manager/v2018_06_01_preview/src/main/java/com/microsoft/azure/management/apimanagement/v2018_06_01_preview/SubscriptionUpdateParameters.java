/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Subscription update details.
 */
@JsonFlatten
public class SubscriptionUpdateParameters {
    /**
     * User identifier path: /users/{userId}.
     */
    @JsonProperty(value = "properties.ownerId")
    private String ownerId;

    /**
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /**
     * Subscription expiration date. The setting is for audit purposes only and
     * the subscription is not automatically expired. The subscription
     * lifecycle can be managed by using the `state` property. The date
     * conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by
     * the ISO 8601 standard.
     */
    @JsonProperty(value = "properties.expirationDate")
    private DateTime expirationDate;

    /**
     * Subscription name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Primary subscription key.
     */
    @JsonProperty(value = "properties.primaryKey")
    private String primaryKey;

    /**
     * Secondary subscription key.
     */
    @JsonProperty(value = "properties.secondaryKey")
    private String secondaryKey;

    /**
     * Subscription state. Possible states are * active – the subscription is
     * active, * suspended – the subscription is blocked, and the subscriber
     * cannot call any APIs of the product, * submitted – the subscription
     * request has been made by the developer, but has not yet been approved or
     * rejected, * rejected – the subscription request has been denied by an
     * administrator, * cancelled – the subscription has been cancelled by the
     * developer or administrator, * expired – the subscription reached its
     * expiration date and was deactivated. Possible values include:
     * 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'.
     */
    @JsonProperty(value = "properties.state")
    private SubscriptionState state;

    /**
     * Comments describing subscription state change by the administrator.
     */
    @JsonProperty(value = "properties.stateComment")
    private String stateComment;

    /**
     * Determines whether tracing can be enabled.
     */
    @JsonProperty(value = "properties.allowTracing")
    private Boolean allowTracing;

    /**
     * Get user identifier path: /users/{userId}.
     *
     * @return the ownerId value
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Set user identifier path: /users/{userId}.
     *
     * @param ownerId the ownerId value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Get scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @param scope the scope value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get subscription expiration date. The setting is for audit purposes only and the subscription is not automatically expired. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set subscription expiration date. The setting is for audit purposes only and the subscription is not automatically expired. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param expirationDate the expirationDate value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get subscription name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set subscription name.
     *
     * @param displayName the displayName value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get primary subscription key.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set primary subscription key.
     *
     * @param primaryKey the primaryKey value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get secondary subscription key.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set secondary subscription key.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get subscription state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated. Possible values include: 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'.
     *
     * @return the state value
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Set subscription state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated. Possible values include: 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'.
     *
     * @param state the state value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withState(SubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get comments describing subscription state change by the administrator.
     *
     * @return the stateComment value
     */
    public String stateComment() {
        return this.stateComment;
    }

    /**
     * Set comments describing subscription state change by the administrator.
     *
     * @param stateComment the stateComment value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withStateComment(String stateComment) {
        this.stateComment = stateComment;
        return this;
    }

    /**
     * Get determines whether tracing can be enabled.
     *
     * @return the allowTracing value
     */
    public Boolean allowTracing() {
        return this.allowTracing;
    }

    /**
     * Set determines whether tracing can be enabled.
     *
     * @param allowTracing the allowTracing value to set
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withAllowTracing(Boolean allowTracing) {
        this.allowTracing = allowTracing;
        return this;
    }

}
