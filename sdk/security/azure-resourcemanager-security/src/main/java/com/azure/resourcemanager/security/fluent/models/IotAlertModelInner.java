// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IoT alert. */
@JsonFlatten
@Fluent
public class IotAlertModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotAlertModelInner.class);

    /*
     * Holds the product canonical identifier of the alert within the scope of
     * a product
     */
    @JsonProperty(value = "properties.systemAlertId", access = JsonProperty.Access.WRITE_ONLY)
    private String systemAlertId;

    /*
     * Display name of the main entity being reported on
     */
    @JsonProperty(value = "properties.compromisedEntity", access = JsonProperty.Access.WRITE_ONLY)
    private String compromisedEntity;

    /*
     * The type name of the alert
     */
    @JsonProperty(value = "properties.alertType", access = JsonProperty.Access.WRITE_ONLY)
    private String alertType;

    /*
     * The impact start time of the alert (the time of the first event or
     * activity included in the alert)
     */
    @JsonProperty(value = "properties.startTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private String startTimeUtc;

    /*
     * The impact end time of the alert (the time of the last event or activity
     * included in the alert)
     */
    @JsonProperty(value = "properties.endTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private String endTimeUtc;

    /*
     * A list of entities related to the alert
     */
    @JsonProperty(value = "properties.entities")
    private List<Object> entities;

    /*
     * A bag of fields which extends the alert information
     */
    @JsonProperty(value = "properties.extendedProperties")
    private Object extendedProperties;

    /**
     * Get the systemAlertId property: Holds the product canonical identifier of the alert within the scope of a
     * product.
     *
     * @return the systemAlertId value.
     */
    public String systemAlertId() {
        return this.systemAlertId;
    }

    /**
     * Get the compromisedEntity property: Display name of the main entity being reported on.
     *
     * @return the compromisedEntity value.
     */
    public String compromisedEntity() {
        return this.compromisedEntity;
    }

    /**
     * Get the alertType property: The type name of the alert.
     *
     * @return the alertType value.
     */
    public String alertType() {
        return this.alertType;
    }

    /**
     * Get the startTimeUtc property: The impact start time of the alert (the time of the first event or activity
     * included in the alert).
     *
     * @return the startTimeUtc value.
     */
    public String startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Get the endTimeUtc property: The impact end time of the alert (the time of the last event or activity included in
     * the alert).
     *
     * @return the endTimeUtc value.
     */
    public String endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * Get the entities property: A list of entities related to the alert.
     *
     * @return the entities value.
     */
    public List<Object> entities() {
        return this.entities;
    }

    /**
     * Set the entities property: A list of entities related to the alert.
     *
     * @param entities the entities value to set.
     * @return the IotAlertModelInner object itself.
     */
    public IotAlertModelInner withEntities(List<Object> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Get the extendedProperties property: A bag of fields which extends the alert information.
     *
     * @return the extendedProperties value.
     */
    public Object extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: A bag of fields which extends the alert information.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the IotAlertModelInner object itself.
     */
    public IotAlertModelInner withExtendedProperties(Object extendedProperties) {
        this.extendedProperties = extendedProperties;
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
