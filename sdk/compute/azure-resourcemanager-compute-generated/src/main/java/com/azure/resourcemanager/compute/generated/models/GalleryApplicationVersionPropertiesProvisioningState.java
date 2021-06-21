// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GalleryApplicationVersionPropertiesProvisioningState. */
public final class GalleryApplicationVersionPropertiesProvisioningState
    extends ExpandableStringEnum<GalleryApplicationVersionPropertiesProvisioningState> {
    /** Static value Creating for GalleryApplicationVersionPropertiesProvisioningState. */
    public static final GalleryApplicationVersionPropertiesProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for GalleryApplicationVersionPropertiesProvisioningState. */
    public static final GalleryApplicationVersionPropertiesProvisioningState UPDATING = fromString("Updating");

    /** Static value Failed for GalleryApplicationVersionPropertiesProvisioningState. */
    public static final GalleryApplicationVersionPropertiesProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for GalleryApplicationVersionPropertiesProvisioningState. */
    public static final GalleryApplicationVersionPropertiesProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for GalleryApplicationVersionPropertiesProvisioningState. */
    public static final GalleryApplicationVersionPropertiesProvisioningState DELETING = fromString("Deleting");

    /** Static value Migrating for GalleryApplicationVersionPropertiesProvisioningState. */
    public static final GalleryApplicationVersionPropertiesProvisioningState MIGRATING = fromString("Migrating");

    /**
     * Creates or finds a GalleryApplicationVersionPropertiesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GalleryApplicationVersionPropertiesProvisioningState.
     */
    @JsonCreator
    public static GalleryApplicationVersionPropertiesProvisioningState fromString(String name) {
        return fromString(name, GalleryApplicationVersionPropertiesProvisioningState.class);
    }

    /** @return known GalleryApplicationVersionPropertiesProvisioningState values. */
    public static Collection<GalleryApplicationVersionPropertiesProvisioningState> values() {
        return values(GalleryApplicationVersionPropertiesProvisioningState.class);
    }
}
