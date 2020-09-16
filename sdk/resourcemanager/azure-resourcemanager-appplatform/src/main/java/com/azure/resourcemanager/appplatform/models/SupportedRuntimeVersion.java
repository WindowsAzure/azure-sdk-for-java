// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SupportedRuntimeVersion. */
public final class SupportedRuntimeVersion extends ExpandableStringEnum<SupportedRuntimeVersion> {
    /** Static value Java_8 for SupportedRuntimeVersion. */
    public static final SupportedRuntimeVersion JAVA_8 = fromString("Java_8");

    /** Static value Java_11 for SupportedRuntimeVersion. */
    public static final SupportedRuntimeVersion JAVA_11 = fromString("Java_11");

    /** Static value NetCore_31 for SupportedRuntimeVersion. */
    public static final SupportedRuntimeVersion NET_CORE_31 = fromString("NetCore_31");

    /**
     * Creates or finds a SupportedRuntimeVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SupportedRuntimeVersion.
     */
    @JsonCreator
    public static SupportedRuntimeVersion fromString(String name) {
        return fromString(name, SupportedRuntimeVersion.class);
    }

    /** @return known SupportedRuntimeVersion values. */
    public static Collection<SupportedRuntimeVersion> values() {
        return values(SupportedRuntimeVersion.class);
    }
}
value the value value to set.
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withValue(SupportedRuntimeVersion value) {
        this.value = value;
        return this;
    }

    /**
     * Get the platform property: The platform of this runtime version (possible values: "Java" or ".NET").
     *
     * @return the platform value.
     */
    public SupportedRuntimePlatform platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform of this runtime version (possible values: "Java" or ".NET").
     *
     * @param platform the platform value to set.
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withPlatform(SupportedRuntimePlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the version property: The detailed version (major.minor) of the platform.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The detailed version (major.minor) of the platform.
     *
     * @param version the version value to set.
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withVersion(String version) {
        this.version = version;
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
