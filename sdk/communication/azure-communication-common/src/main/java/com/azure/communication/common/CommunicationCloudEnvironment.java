// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.common;

import java.util.Objects;
import com.azure.core.util.ExpandableStringEnum;

/**
 * The cloud that the identifier belongs to.
 */
public final class CommunicationCloudEnvironment extends ExpandableStringEnum<CommunicationCloudEnvironment> {
    private static final String PUBLIC_VALUE = "public";
    private static final String DOD_VALUE = "dod";
    private static final String GCCH_VALUE = "gcch";

    private String environmentValue;

    /**
     * Creates a default CommunicationCloudEnvironment
     */
    public CommunicationCloudEnvironment() {
        this.environmentValue = PUBLIC_VALUE;
    }

    /**
     * Sets an environment value from a String
     * @param environmentValue string representation of the environment value
     * @return CommunicationCloudEnvironment object itself
     */
    public CommunicationCloudEnvironment fromString(String environmentValue) {
        Objects.requireNonNull(environmentValue);
        this.environmentValue = environmentValue;
        return this;
    }

    /**
     * Represent Azure public cloud
     */
    public static final CommunicationCloudEnvironment PUBLIC = new CommunicationCloudEnvironment().fromString(PUBLIC_VALUE);

    /**
     * Represent Azure Dod cloud
     */
    public static final CommunicationCloudEnvironment DOD = new CommunicationCloudEnvironment().fromString(DOD_VALUE);

    /**
     * Represent Azure Gcch cloud
     */
    public static final CommunicationCloudEnvironment GCCH = new CommunicationCloudEnvironment().fromString(GCCH_VALUE);

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        return that != null && this.environmentValue.equals(that.toString());
    }

    @Override
    public String toString() {
        return environmentValue;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

}
