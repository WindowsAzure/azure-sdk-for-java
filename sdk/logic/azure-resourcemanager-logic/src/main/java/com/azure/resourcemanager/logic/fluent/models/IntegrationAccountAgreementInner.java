// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.models.AgreementContent;
import com.azure.resourcemanager.logic.models.AgreementType;
import com.azure.resourcemanager.logic.models.BusinessIdentity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The integration account agreement. */
@JsonFlatten
@Fluent
public class IntegrationAccountAgreementInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationAccountAgreementInner.class);

    /*
     * The created time.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * The changed time.
     */
    @JsonProperty(value = "properties.changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime changedTime;

    /*
     * The metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /*
     * The agreement type.
     */
    @JsonProperty(value = "properties.agreementType", required = true)
    private AgreementType agreementType;

    /*
     * The integration account partner that is set as host partner for this
     * agreement.
     */
    @JsonProperty(value = "properties.hostPartner", required = true)
    private String hostPartner;

    /*
     * The integration account partner that is set as guest partner for this
     * agreement.
     */
    @JsonProperty(value = "properties.guestPartner", required = true)
    private String guestPartner;

    /*
     * The business identity of the host partner.
     */
    @JsonProperty(value = "properties.hostIdentity", required = true)
    private BusinessIdentity hostIdentity;

    /*
     * The business identity of the guest partner.
     */
    @JsonProperty(value = "properties.guestIdentity", required = true)
    private BusinessIdentity guestIdentity;

    /*
     * The agreement content.
     */
    @JsonProperty(value = "properties.content", required = true)
    private AgreementContent content;

    /**
     * Get the createdTime property: The created time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: The changed time.
     *
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the metadata property: The metadata.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata.
     *
     * @param metadata the metadata value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the agreementType property: The agreement type.
     *
     * @return the agreementType value.
     */
    public AgreementType agreementType() {
        return this.agreementType;
    }

    /**
     * Set the agreementType property: The agreement type.
     *
     * @param agreementType the agreementType value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * Get the hostPartner property: The integration account partner that is set as host partner for this agreement.
     *
     * @return the hostPartner value.
     */
    public String hostPartner() {
        return this.hostPartner;
    }

    /**
     * Set the hostPartner property: The integration account partner that is set as host partner for this agreement.
     *
     * @param hostPartner the hostPartner value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withHostPartner(String hostPartner) {
        this.hostPartner = hostPartner;
        return this;
    }

    /**
     * Get the guestPartner property: The integration account partner that is set as guest partner for this agreement.
     *
     * @return the guestPartner value.
     */
    public String guestPartner() {
        return this.guestPartner;
    }

    /**
     * Set the guestPartner property: The integration account partner that is set as guest partner for this agreement.
     *
     * @param guestPartner the guestPartner value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withGuestPartner(String guestPartner) {
        this.guestPartner = guestPartner;
        return this;
    }

    /**
     * Get the hostIdentity property: The business identity of the host partner.
     *
     * @return the hostIdentity value.
     */
    public BusinessIdentity hostIdentity() {
        return this.hostIdentity;
    }

    /**
     * Set the hostIdentity property: The business identity of the host partner.
     *
     * @param hostIdentity the hostIdentity value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withHostIdentity(BusinessIdentity hostIdentity) {
        this.hostIdentity = hostIdentity;
        return this;
    }

    /**
     * Get the guestIdentity property: The business identity of the guest partner.
     *
     * @return the guestIdentity value.
     */
    public BusinessIdentity guestIdentity() {
        return this.guestIdentity;
    }

    /**
     * Set the guestIdentity property: The business identity of the guest partner.
     *
     * @param guestIdentity the guestIdentity value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withGuestIdentity(BusinessIdentity guestIdentity) {
        this.guestIdentity = guestIdentity;
        return this;
    }

    /**
     * Get the content property: The agreement content.
     *
     * @return the content value.
     */
    public AgreementContent content() {
        return this.content;
    }

    /**
     * Set the content property: The agreement content.
     *
     * @param content the content value to set.
     * @return the IntegrationAccountAgreementInner object itself.
     */
    public IntegrationAccountAgreementInner withContent(AgreementContent content) {
        this.content = content;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IntegrationAccountAgreementInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IntegrationAccountAgreementInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (agreementType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property agreementType in model IntegrationAccountAgreementInner"));
        }
        if (hostPartner() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostPartner in model IntegrationAccountAgreementInner"));
        }
        if (guestPartner() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property guestPartner in model IntegrationAccountAgreementInner"));
        }
        if (hostIdentity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostIdentity in model IntegrationAccountAgreementInner"));
        } else {
            hostIdentity().validate();
        }
        if (guestIdentity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property guestIdentity in model IntegrationAccountAgreementInner"));
        } else {
            guestIdentity().validate();
        }
        if (content() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property content in model IntegrationAccountAgreementInner"));
        } else {
            content().validate();
        }
    }
}
