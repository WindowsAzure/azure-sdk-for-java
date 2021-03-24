// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Product Entity Base Parameters. */
@Fluent
public class ProductEntityBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductEntityBaseParameters.class);

    /*
     * Product description. May include HTML formatting tags.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Product terms of use. Developers trying to subscribe to the product will
     * be presented and required to accept these terms before they can complete
     * the subscription process.
     */
    @JsonProperty(value = "terms")
    private String terms;

    /*
     * Whether a product subscription is required for accessing APIs included
     * in this product. If true, the product is referred to as "protected" and
     * a valid subscription key is required for a request to an API included in
     * the product to succeed. If false, the product is referred to as "open"
     * and requests to an API included in the product can be made without a
     * subscription key. If property is omitted when creating a new product
     * it's value is assumed to be true.
     */
    @JsonProperty(value = "subscriptionRequired")
    private Boolean subscriptionRequired;

    /*
     * whether subscription approval is required. If false, new subscriptions
     * will be approved automatically enabling developers to call the product’s
     * APIs immediately after subscribing. If true, administrators must
     * manually approve the subscription before the developer can any of the
     * product’s APIs. Can be present only if subscriptionRequired property is
     * present and has a value of false.
     */
    @JsonProperty(value = "approvalRequired")
    private Boolean approvalRequired;

    /*
     * Whether the number of subscriptions a user can have to this product at
     * the same time. Set to null or omit to allow unlimited per user
     * subscriptions. Can be present only if subscriptionRequired property is
     * present and has a value of false.
     */
    @JsonProperty(value = "subscriptionsLimit")
    private Integer subscriptionsLimit;

    /*
     * whether product is published or not. Published products are discoverable
     * by users of developer portal. Non published products are visible only to
     * administrators. Default state of Product is notPublished.
     */
    @JsonProperty(value = "state")
    private ProductState state;

    /**
     * Get the description property: Product description. May include HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Product description. May include HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the ProductEntityBaseParameters object itself.
     */
    public ProductEntityBaseParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the terms property: Product terms of use. Developers trying to subscribe to the product will be presented and
     * required to accept these terms before they can complete the subscription process.
     *
     * @return the terms value.
     */
    public String terms() {
        return this.terms;
    }

    /**
     * Set the terms property: Product terms of use. Developers trying to subscribe to the product will be presented and
     * required to accept these terms before they can complete the subscription process.
     *
     * @param terms the terms value to set.
     * @return the ProductEntityBaseParameters object itself.
     */
    public ProductEntityBaseParameters withTerms(String terms) {
        this.terms = terms;
        return this;
    }

    /**
     * Get the subscriptionRequired property: Whether a product subscription is required for accessing APIs included in
     * this product. If true, the product is referred to as "protected" and a valid subscription key is required for a
     * request to an API included in the product to succeed. If false, the product is referred to as "open" and requests
     * to an API included in the product can be made without a subscription key. If property is omitted when creating a
     * new product it's value is assumed to be true.
     *
     * @return the subscriptionRequired value.
     */
    public Boolean subscriptionRequired() {
        return this.subscriptionRequired;
    }

    /**
     * Set the subscriptionRequired property: Whether a product subscription is required for accessing APIs included in
     * this product. If true, the product is referred to as "protected" and a valid subscription key is required for a
     * request to an API included in the product to succeed. If false, the product is referred to as "open" and requests
     * to an API included in the product can be made without a subscription key. If property is omitted when creating a
     * new product it's value is assumed to be true.
     *
     * @param subscriptionRequired the subscriptionRequired value to set.
     * @return the ProductEntityBaseParameters object itself.
     */
    public ProductEntityBaseParameters withSubscriptionRequired(Boolean subscriptionRequired) {
        this.subscriptionRequired = subscriptionRequired;
        return this;
    }

    /**
     * Get the approvalRequired property: whether subscription approval is required. If false, new subscriptions will be
     * approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true,
     * administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be
     * present only if subscriptionRequired property is present and has a value of false.
     *
     * @return the approvalRequired value.
     */
    public Boolean approvalRequired() {
        return this.approvalRequired;
    }

    /**
     * Set the approvalRequired property: whether subscription approval is required. If false, new subscriptions will be
     * approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true,
     * administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be
     * present only if subscriptionRequired property is present and has a value of false.
     *
     * @param approvalRequired the approvalRequired value to set.
     * @return the ProductEntityBaseParameters object itself.
     */
    public ProductEntityBaseParameters withApprovalRequired(Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
        return this;
    }

    /**
     * Get the subscriptionsLimit property: Whether the number of subscriptions a user can have to this product at the
     * same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if
     * subscriptionRequired property is present and has a value of false.
     *
     * @return the subscriptionsLimit value.
     */
    public Integer subscriptionsLimit() {
        return this.subscriptionsLimit;
    }

    /**
     * Set the subscriptionsLimit property: Whether the number of subscriptions a user can have to this product at the
     * same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if
     * subscriptionRequired property is present and has a value of false.
     *
     * @param subscriptionsLimit the subscriptionsLimit value to set.
     * @return the ProductEntityBaseParameters object itself.
     */
    public ProductEntityBaseParameters withSubscriptionsLimit(Integer subscriptionsLimit) {
        this.subscriptionsLimit = subscriptionsLimit;
        return this;
    }

    /**
     * Get the state property: whether product is published or not. Published products are discoverable by users of
     * developer portal. Non published products are visible only to administrators. Default state of Product is
     * notPublished.
     *
     * @return the state value.
     */
    public ProductState state() {
        return this.state;
    }

    /**
     * Set the state property: whether product is published or not. Published products are discoverable by users of
     * developer portal. Non published products are visible only to administrators. Default state of Product is
     * notPublished.
     *
     * @param state the state value to set.
     * @return the ProductEntityBaseParameters object itself.
     */
    public ProductEntityBaseParameters withState(ProductState state) {
        this.state = state;
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
