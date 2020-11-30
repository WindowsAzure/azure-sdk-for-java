// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GalleryImagePropertiesProvisioningState. */
public final class GalleryImagePropertiesProvisioningState
    extends ExpandableStringEnum<GalleryImagePropertiesProvisioningState> {
    /** Static value Creating for GalleryImagePropertiesProvisioningState. */
    public static final GalleryImagePropertiesProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for GalleryImagePropertiesProvisioningState. */
    public static final GalleryImagePropertiesProvisioningState UPDATING = fromString("Updating");

    /** Static value Failed for GalleryImagePropertiesProvisioningState. */
    public static final GalleryImagePropertiesProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for GalleryImagePropertiesProvisioningState. */
    public static final GalleryImagePropertiesProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for GalleryImagePropertiesProvisioningState. */
    public static final GalleryImagePropertiesProvisioningState DELETING = fromString("Deleting");

    /** Static value Migrating for GalleryImagePropertiesProvisioningState. */
    public static final GalleryImagePropertiesProvisioningState MIGRATING = fromString("Migrating");

    /**
     * Creates or finds a GalleryImagePropertiesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GalleryImagePropertiesProvisioningState.
     */
    @JsonCreator
    public static GalleryImagePropertiesProvisioningState fromString(String name) {
        return fromString(name, GalleryImagePropertiesProvisioningState.class);
    }

    /** @return known GalleryImagePropertiesProvisioningState values. */
    public static Collection<GalleryImagePropertiesProvisioningState> values() {
        return values(GalleryImagePropertiesProvisioningState.class);
    }
}
