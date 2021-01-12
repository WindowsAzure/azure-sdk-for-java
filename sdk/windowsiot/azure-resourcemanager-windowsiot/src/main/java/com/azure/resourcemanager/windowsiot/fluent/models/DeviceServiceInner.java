// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.windowsiot.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The description of the Windows IoT Device Service. */
@JsonFlatten
@Fluent
public class DeviceServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceServiceInner.class);

    /*
     * The Etag field is *not* required. If it is provided in the response
     * body, it must also be provided as a header per the normal ETag
     * convention.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Windows IoT Device Service notes.
     */
    @JsonProperty(value = "properties.notes")
    private String notes;

    /*
     * Windows IoT Device Service start date,
     */
    @JsonProperty(value = "properties.startDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startDate;

    /*
     * Windows IoT Device Service device allocation,
     */
    @JsonProperty(value = "properties.quantity")
    private Long quantity;

    /*
     * Windows IoT Device Service ODM AAD domain
     */
    @JsonProperty(value = "properties.billingDomainName")
    private String billingDomainName;

    /*
     * Windows IoT Device Service OEM AAD domain
     */
    @JsonProperty(value = "properties.adminDomainName")
    private String adminDomainName;

    /**
     * Get the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @param etag the etag value to set.
     * @return the DeviceServiceInner object itself.
     */
    public DeviceServiceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the notes property: Windows IoT Device Service notes.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: Windows IoT Device Service notes.
     *
     * @param notes the notes value to set.
     * @return the DeviceServiceInner object itself.
     */
    public DeviceServiceInner withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the startDate property: Windows IoT Device Service start date,.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Get the quantity property: Windows IoT Device Service device allocation,.
     *
     * @return the quantity value.
     */
    public Long quantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: Windows IoT Device Service device allocation,.
     *
     * @param quantity the quantity value to set.
     * @return the DeviceServiceInner object itself.
     */
    public DeviceServiceInner withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the billingDomainName property: Windows IoT Device Service ODM AAD domain.
     *
     * @return the billingDomainName value.
     */
    public String billingDomainName() {
        return this.billingDomainName;
    }

    /**
     * Set the billingDomainName property: Windows IoT Device Service ODM AAD domain.
     *
     * @param billingDomainName the billingDomainName value to set.
     * @return the DeviceServiceInner object itself.
     */
    public DeviceServiceInner withBillingDomainName(String billingDomainName) {
        this.billingDomainName = billingDomainName;
        return this;
    }

    /**
     * Get the adminDomainName property: Windows IoT Device Service OEM AAD domain.
     *
     * @return the adminDomainName value.
     */
    public String adminDomainName() {
        return this.adminDomainName;
    }

    /**
     * Set the adminDomainName property: Windows IoT Device Service OEM AAD domain.
     *
     * @param adminDomainName the adminDomainName value to set.
     * @return the DeviceServiceInner object itself.
     */
    public DeviceServiceInner withAdminDomainName(String adminDomainName) {
        this.adminDomainName = adminDomainName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DeviceServiceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DeviceServiceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
