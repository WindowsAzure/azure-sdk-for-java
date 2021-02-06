// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters that define the create packet capture operation. */
@Fluent
public class PacketCaptureParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PacketCaptureParameters.class);

    /*
     * The ID of the targeted resource, only VM is currently supported.
     */
    @JsonProperty(value = "target", required = true)
    private String target;

    /*
     * Number of bytes captured per packet, the remaining bytes are truncated.
     */
    @JsonProperty(value = "bytesToCapturePerPacket")
    private Long bytesToCapturePerPacket;

    /*
     * Maximum size of the capture output.
     */
    @JsonProperty(value = "totalBytesPerSession")
    private Long totalBytesPerSession;

    /*
     * Maximum duration of the capture session in seconds.
     */
    @JsonProperty(value = "timeLimitInSeconds")
    private Integer timeLimitInSeconds;

    /*
     * The storage location for a packet capture session.
     */
    @JsonProperty(value = "storageLocation", required = true)
    private PacketCaptureStorageLocation storageLocation;

    /*
     * A list of packet capture filters.
     */
    @JsonProperty(value = "filters")
    private List<PacketCaptureFilter> filters;

    /**
     * Get the target property: The ID of the targeted resource, only VM is currently supported.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The ID of the targeted resource, only VM is currently supported.
     *
     * @param target the target value to set.
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @return the bytesToCapturePerPacket value.
     */
    public Long bytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }

    /**
     * Set the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        return this;
    }

    /**
     * Get the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @return the totalBytesPerSession value.
     */
    public Long totalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     * Set the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withTotalBytesPerSession(Long totalBytesPerSession) {
        this.totalBytesPerSession = totalBytesPerSession;
        return this;
    }

    /**
     * Get the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    /**
     * Set the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.timeLimitInSeconds = timeLimitInSeconds;
        return this;
    }

    /**
     * Get the storageLocation property: The storage location for a packet capture session.
     *
     * @return the storageLocation value.
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.storageLocation;
    }

    /**
     * Set the storageLocation property: The storage location for a packet capture session.
     *
     * @param storageLocation the storageLocation value to set.
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Get the filters property: A list of packet capture filters.
     *
     * @return the filters value.
     */
    public List<PacketCaptureFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: A list of packet capture filters.
     *
     * @param filters the filters value to set.
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withFilters(List<PacketCaptureFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property target in model PacketCaptureParameters"));
        }
        if (storageLocation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageLocation in model PacketCaptureParameters"));
        } else {
            storageLocation().validate();
        }
        if (filters() != null) {
            filters().forEach(e -> e.validate());
        }
    }
}
