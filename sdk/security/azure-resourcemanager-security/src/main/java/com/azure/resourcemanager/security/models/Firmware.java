// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Firmware information. */
@Immutable
public final class Firmware {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Firmware.class);

    /*
     * Address of the specific module a firmware is related to
     */
    @JsonProperty(value = "moduleAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String moduleAddress;

    /*
     * Rack number of the module a firmware is related to.
     */
    @JsonProperty(value = "rack", access = JsonProperty.Access.WRITE_ONLY)
    private String rack;

    /*
     * Slot number in the rack of the module a firmware is related to
     */
    @JsonProperty(value = "slot", access = JsonProperty.Access.WRITE_ONLY)
    private String slot;

    /*
     * Serial of the firmware
     */
    @JsonProperty(value = "serial", access = JsonProperty.Access.WRITE_ONLY)
    private String serial;

    /*
     * Firmware model
     */
    @JsonProperty(value = "model", access = JsonProperty.Access.WRITE_ONLY)
    private String model;

    /*
     * Firmware version
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * A bag of fields which extends the firmware information.
     */
    @JsonProperty(value = "additionalData", access = JsonProperty.Access.WRITE_ONLY)
    private Object additionalData;

    /**
     * Get the moduleAddress property: Address of the specific module a firmware is related to.
     *
     * @return the moduleAddress value.
     */
    public String moduleAddress() {
        return this.moduleAddress;
    }

    /**
     * Get the rack property: Rack number of the module a firmware is related to.
     *
     * @return the rack value.
     */
    public String rack() {
        return this.rack;
    }

    /**
     * Get the slot property: Slot number in the rack of the module a firmware is related to.
     *
     * @return the slot value.
     */
    public String slot() {
        return this.slot;
    }

    /**
     * Get the serial property: Serial of the firmware.
     *
     * @return the serial value.
     */
    public String serial() {
        return this.serial;
    }

    /**
     * Get the model property: Firmware model.
     *
     * @return the model value.
     */
    public String model() {
        return this.model;
    }

    /**
     * Get the version property: Firmware version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the additionalData property: A bag of fields which extends the firmware information.
     *
     * @return the additionalData value.
     */
    public Object additionalData() {
        return this.additionalData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
