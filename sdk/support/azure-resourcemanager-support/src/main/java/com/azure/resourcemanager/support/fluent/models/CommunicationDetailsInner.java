// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.models.CommunicationDirection;
import com.azure.resourcemanager.support.models.CommunicationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Object that represents a Communication resource. */
@JsonFlatten
@Fluent
public class CommunicationDetailsInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommunicationDetailsInner.class);

    /*
     * Communication type.
     */
    @JsonProperty(value = "properties.communicationType", access = JsonProperty.Access.WRITE_ONLY)
    private CommunicationType communicationType;

    /*
     * Direction of communication.
     */
    @JsonProperty(value = "properties.communicationDirection", access = JsonProperty.Access.WRITE_ONLY)
    private CommunicationDirection communicationDirection;

    /*
     * Email address of the sender. This property is required if called by a
     * service principal.
     */
    @JsonProperty(value = "properties.sender")
    private String sender;

    /*
     * Subject of the communication.
     */
    @JsonProperty(value = "properties.subject")
    private String subject;

    /*
     * Body of the communication.
     */
    @JsonProperty(value = "properties.body")
    private String body;

    /*
     * Time in UTC (ISO 8601 format) when the communication was created.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /**
     * Get the communicationType property: Communication type.
     *
     * @return the communicationType value.
     */
    public CommunicationType communicationType() {
        return this.communicationType;
    }

    /**
     * Get the communicationDirection property: Direction of communication.
     *
     * @return the communicationDirection value.
     */
    public CommunicationDirection communicationDirection() {
        return this.communicationDirection;
    }

    /**
     * Get the sender property: Email address of the sender. This property is required if called by a service principal.
     *
     * @return the sender value.
     */
    public String sender() {
        return this.sender;
    }

    /**
     * Set the sender property: Email address of the sender. This property is required if called by a service principal.
     *
     * @param sender the sender value to set.
     * @return the CommunicationDetailsInner object itself.
     */
    public CommunicationDetailsInner withSender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get the subject property: Subject of the communication.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Subject of the communication.
     *
     * @param subject the subject value to set.
     * @return the CommunicationDetailsInner object itself.
     */
    public CommunicationDetailsInner withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the body property: Body of the communication.
     *
     * @return the body value.
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body property: Body of the communication.
     *
     * @param body the body value to set.
     * @return the CommunicationDetailsInner object itself.
     */
    public CommunicationDetailsInner withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get the createdDate property: Time in UTC (ISO 8601 format) when the communication was created.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
