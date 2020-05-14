// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GalleryImageVersionPropertiesProvisioningState. */
public final class GalleryImageVersionPropertiesProvisioningState
    extends ExpandableStringEnum<GalleryImageVersionPropertiesProvisioningState> {
    /** Static value Creating for GalleryImageVersionPropertiesProvisioningState. */
    public static final GalleryImageVersionPropertiesProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for GalleryImageVersionPropertiesProvisioningState. */
    public static final GalleryImageVersionPropertiesProvisioningState UPDATING = fromString("Updating");

    /** Static value Failed for GalleryImageVersionPropertiesProvisioningState. */
    public static final GalleryImageVersionPropertiesProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for GalleryImageVersionPropertiesProvisioningState. */
    public static final GalleryImageVersionPropertiesProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for GalleryImageVersionPropertiesProvisioningState. */
    public static final GalleryImageVersionPropertiesProvisioningState DELETING = fromString("Deleting");

    /** Static value Migrating for GalleryImageVersionPropertiesProvisioningState. */
    public static final GalleryImageVersionPropertiesProvisioningState MIGRATING = fromString("Migrating");

    /**
     * Creates or finds a GalleryImageVersionPropertiesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GalleryImageVersionPropertiesProvisioningState.
     */
    @JsonCreator
    public static GalleryImageVersionPropertiesProvisioningState fromString(String name) {
        return fromString(name, GalleryImageVersionPropertiesProvisioningState.class);
    }

    /** @return known GalleryImageVersionPropertiesProvisioningState values. */
    public static Collection<GalleryImageVersionPropertiesProvisioningState> values() {
        return values(GalleryImageVersionPropertiesProvisioningState.class);
    }
}
