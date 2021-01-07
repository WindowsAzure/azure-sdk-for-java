// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** saas properties. */
@Fluent
public final class SaasResourceProperties extends SaasProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SaasResourceProperties.class);

    /*
     * The offer id.
     */
    @JsonProperty(value = "offerId")
    private String offerId;

    /*
     * The publisher id.
     */
    @JsonProperty(value = "publisherId")
    private String publisherId;

    /*
     * The seat count.
     */
    @JsonProperty(value = "quantity")
    private Float quantity;

    /*
     * The plan id.
     */
    @JsonProperty(value = "skuId")
    private String skuId;

    /*
     * The Payment channel for the SaasSubscription.
     */
    @JsonProperty(value = "paymentChannelType")
    private PaymentChannelType paymentChannelType;

    /*
     * The metadata about the SaaS subscription such as the AzureSubscriptionId
     * and ResourceUri.
     */
    @JsonProperty(value = "paymentChannelMetadata")
    private Map<String, String> paymentChannelMetadata;

    /*
     * The SaaS resource name.
     */
    @JsonProperty(value = "saasResourceName")
    private String saasResourceName;

    /*
     * The current Term id.
     */
    @JsonProperty(value = "termId")
    private String termId;

    /*
     * Whether the SaaS subscription will auto renew upon term end.
     */
    @JsonProperty(value = "autoRenew")
    private Boolean autoRenew;

    /*
     * The environment in the publisher side for this resource.
     */
    @JsonProperty(value = "publisherTestEnvironment")
    private String publisherTestEnvironment;

    /*
     * The saas subscription id used for tenant to subscription level migration
     * request.
     */
    @JsonProperty(value = "saasSubscriptionId")
    private String saasSubscriptionId;

    /*
     * The saas session id used for dev service migration request.
     */
    @JsonProperty(value = "saasSessionId")
    private String saasSessionId;

    /**
     * Get the offerId property: The offer id.
     *
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: The offer id.
     *
     * @param offerId the offerId value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Get the publisherId property: The publisher id.
     *
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Set the publisherId property: The publisher id.
     *
     * @param publisherId the publisherId value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * Get the quantity property: The seat count.
     *
     * @return the quantity value.
     */
    public Float quantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The seat count.
     *
     * @param quantity the quantity value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withQuantity(Float quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the skuId property: The plan id.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId property: The plan id.
     *
     * @param skuId the skuId value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the paymentChannelType property: The Payment channel for the SaasSubscription.
     *
     * @return the paymentChannelType value.
     */
    public PaymentChannelType paymentChannelType() {
        return this.paymentChannelType;
    }

    /**
     * Set the paymentChannelType property: The Payment channel for the SaasSubscription.
     *
     * @param paymentChannelType the paymentChannelType value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withPaymentChannelType(PaymentChannelType paymentChannelType) {
        this.paymentChannelType = paymentChannelType;
        return this;
    }

    /**
     * Get the paymentChannelMetadata property: The metadata about the SaaS subscription such as the AzureSubscriptionId
     * and ResourceUri.
     *
     * @return the paymentChannelMetadata value.
     */
    public Map<String, String> paymentChannelMetadata() {
        return this.paymentChannelMetadata;
    }

    /**
     * Set the paymentChannelMetadata property: The metadata about the SaaS subscription such as the AzureSubscriptionId
     * and ResourceUri.
     *
     * @param paymentChannelMetadata the paymentChannelMetadata value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withPaymentChannelMetadata(Map<String, String> paymentChannelMetadata) {
        this.paymentChannelMetadata = paymentChannelMetadata;
        return this;
    }

    /**
     * Get the saasResourceName property: The SaaS resource name.
     *
     * @return the saasResourceName value.
     */
    public String saasResourceName() {
        return this.saasResourceName;
    }

    /**
     * Set the saasResourceName property: The SaaS resource name.
     *
     * @param saasResourceName the saasResourceName value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withSaasResourceName(String saasResourceName) {
        this.saasResourceName = saasResourceName;
        return this;
    }

    /**
     * Get the termId property: The current Term id.
     *
     * @return the termId value.
     */
    public String termId() {
        return this.termId;
    }

    /**
     * Set the termId property: The current Term id.
     *
     * @param termId the termId value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withTermId(String termId) {
        this.termId = termId;
        return this;
    }

    /**
     * Get the autoRenew property: Whether the SaaS subscription will auto renew upon term end.
     *
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: Whether the SaaS subscription will auto renew upon term end.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the publisherTestEnvironment property: The environment in the publisher side for this resource.
     *
     * @return the publisherTestEnvironment value.
     */
    public String publisherTestEnvironment() {
        return this.publisherTestEnvironment;
    }

    /**
     * Set the publisherTestEnvironment property: The environment in the publisher side for this resource.
     *
     * @param publisherTestEnvironment the publisherTestEnvironment value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withPublisherTestEnvironment(String publisherTestEnvironment) {
        this.publisherTestEnvironment = publisherTestEnvironment;
        return this;
    }

    /**
     * Get the saasSubscriptionId property: The saas subscription id used for tenant to subscription level migration
     * request.
     *
     * @return the saasSubscriptionId value.
     */
    public String saasSubscriptionId() {
        return this.saasSubscriptionId;
    }

    /**
     * Set the saasSubscriptionId property: The saas subscription id used for tenant to subscription level migration
     * request.
     *
     * @param saasSubscriptionId the saasSubscriptionId value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withSaasSubscriptionId(String saasSubscriptionId) {
        this.saasSubscriptionId = saasSubscriptionId;
        return this;
    }

    /**
     * Get the saasSessionId property: The saas session id used for dev service migration request.
     *
     * @return the saasSessionId value.
     */
    public String saasSessionId() {
        return this.saasSessionId;
    }

    /**
     * Set the saasSessionId property: The saas session id used for dev service migration request.
     *
     * @param saasSessionId the saasSessionId value to set.
     * @return the SaasResourceProperties object itself.
     */
    public SaasResourceProperties withSaasSessionId(String saasSessionId) {
        this.saasSessionId = saasSessionId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SaasResourceProperties withStatus(SaasResourceStatus status) {
        super.withStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SaasResourceProperties withTerm(SaasPropertiesTerm term) {
        super.withTerm(term);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SaasResourceProperties withIsFreeTrial(Boolean isFreeTrial) {
        super.withIsFreeTrial(isFreeTrial);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SaasResourceProperties withLastModified(String lastModified) {
        super.withLastModified(lastModified);
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
