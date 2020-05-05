// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PlatformProperties model. */
@Fluent
public final class PlatformProperties {
    /*
     * The operating system type required for the run.
     */
    @JsonProperty(value = "os", required = true)
    private OS os;

    /*
     * The OS architecture.
     */
    @JsonProperty(value = "architecture")
    private Architecture architecture;

    /*
     * Variant of the CPU.
     */
    @JsonProperty(value = "variant")
    private Variant variant;

    /**
     * Get the os property: The operating system type required for the run.
     *
     * @return the os value.
     */
    public OS os() {
        return this.os;
    }

    /**
     * Set the os property: The operating system type required for the run.
     *
     * @param os the os value to set.
     * @return the PlatformProperties object itself.
     */
    public PlatformProperties withOs(OS os) {
        this.os = os;
        return this;
    }

    /**
     * Get the architecture property: The OS architecture.
     *
     * @return the architecture value.
     */
    public Architecture architecture() {
        return this.architecture;
    }

    /**
     * Set the architecture property: The OS architecture.
     *
     * @param architecture the architecture value to set.
     * @return the PlatformProperties object itself.
     */
    public PlatformProperties withArchitecture(Architecture architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get the variant property: Variant of the CPU.
     *
     * @return the variant value.
     */
    public Variant variant() {
        return this.variant;
    }

    /**
     * Set the variant property: Variant of the CPU.
     *
     * @param variant the variant value to set.
     * @return the PlatformProperties object itself.
     */
    public PlatformProperties withVariant(Variant variant) {
        this.variant = variant;
        return this;
    }
}
