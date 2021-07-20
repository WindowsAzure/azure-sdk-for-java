// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.implementation.ConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Configuration. */
@Fluent
public final class ConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationInner.class);

    /*
     * The properties of a configuration.
     */
    @JsonProperty(value = "properties")
    private ConfigurationProperties properties;

    /**
     * Get the properties property: The properties of a configuration.
     *
     * @return the properties value.
     */
    private ConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of a configuration.
     *
     * @param properties the properties value to set.
     * @return the ConfigurationInner object itself.
     */
    private ConfigurationInner withProperties(ConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the value property: Value of the configuration.
     *
     * @return the value value.
     */
    public String value() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().value();
        }
    }

    /**
     * Set the value property: Value of the configuration.
     *
     * @param value the value value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withValue(String value) {
        if (this.properties() == null) {
            this.withProperties(new ConfigurationProperties());
        }
        this.properties().withValue(value);
        return this;
    }

    /**
     * Get the description property: Description of the configuration.
     *
     * @return the description value.
     */
    public String description() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().description();
        }
    }

    /**
     * Get the defaultValue property: Default value of the configuration.
     *
     * @return the defaultValue value.
     */
    public String defaultValue() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().defaultValue();
        }
    }

    /**
     * Get the dataType property: Data type of the configuration.
     *
     * @return the dataType value.
     */
    public String dataType() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().dataType();
        }
    }

    /**
     * Get the allowedValues property: Allowed values of the configuration.
     *
     * @return the allowedValues value.
     */
    public String allowedValues() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().allowedValues();
        }
    }

    /**
     * Get the source property: Source of the configuration.
     *
     * @return the source value.
     */
    public String source() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().source();
        }
    }

    /**
     * Set the source property: Source of the configuration.
     *
     * @param source the source value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withSource(String source) {
        if (this.properties() == null) {
            this.withProperties(new ConfigurationProperties());
        }
        this.properties().withSource(source);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
