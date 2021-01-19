// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphOnenoteSourceService. */
public final class MicrosoftGraphOnenoteSourceService extends ExpandableStringEnum<MicrosoftGraphOnenoteSourceService> {
    /** Static value Unknown for MicrosoftGraphOnenoteSourceService. */
    public static final MicrosoftGraphOnenoteSourceService UNKNOWN = fromString("Unknown");

    /** Static value OneDrive for MicrosoftGraphOnenoteSourceService. */
    public static final MicrosoftGraphOnenoteSourceService ONE_DRIVE = fromString("OneDrive");

    /** Static value OneDriveForBusiness for MicrosoftGraphOnenoteSourceService. */
    public static final MicrosoftGraphOnenoteSourceService ONE_DRIVE_FOR_BUSINESS = fromString("OneDriveForBusiness");

    /** Static value OnPremOneDriveForBusiness for MicrosoftGraphOnenoteSourceService. */
    public static final MicrosoftGraphOnenoteSourceService ON_PREM_ONE_DRIVE_FOR_BUSINESS =
        fromString("OnPremOneDriveForBusiness");

    /**
     * Creates or finds a MicrosoftGraphOnenoteSourceService from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphOnenoteSourceService.
     */
    @JsonCreator
    public static MicrosoftGraphOnenoteSourceService fromString(String name) {
        return fromString(name, MicrosoftGraphOnenoteSourceService.class);
    }

    /** @return known MicrosoftGraphOnenoteSourceService values. */
    public static Collection<MicrosoftGraphOnenoteSourceService> values() {
        return values(MicrosoftGraphOnenoteSourceService.class);
    }
}
