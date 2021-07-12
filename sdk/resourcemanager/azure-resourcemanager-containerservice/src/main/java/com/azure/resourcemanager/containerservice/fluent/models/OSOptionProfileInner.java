// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.OSOptionProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OS option profile. */
@JsonFlatten
@Fluent
public class OSOptionProfileInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSOptionProfileInner.class);

    /*
     * Id of the OS option profile.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the OS option profile.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Type of the OS option profile.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The list of OS option properties.
     */
    @JsonProperty(value = "properties.osOptionPropertyList", required = true)
    private List<OSOptionProperty> osOptionPropertyList;

    /**
     * Get the id property: Id of the OS option profile.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the OS option profile.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Type of the OS option profile.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the osOptionPropertyList property: The list of OS option properties.
     *
     * @return the osOptionPropertyList value.
     */
    public List<OSOptionProperty> osOptionPropertyList() {
        return this.osOptionPropertyList;
    }

    /**
     * Set the osOptionPropertyList property: The list of OS option properties.
     *
     * @param osOptionPropertyList the osOptionPropertyList value to set.
     * @return the OSOptionProfileInner object itself.
     */
    public OSOptionProfileInner withOsOptionPropertyList(List<OSOptionProperty> osOptionPropertyList) {
        this.osOptionPropertyList = osOptionPropertyList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osOptionPropertyList() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property osOptionPropertyList in model OSOptionProfileInner"));
        } else {
            osOptionPropertyList().forEach(e -> e.validate());
        }
    }
}
