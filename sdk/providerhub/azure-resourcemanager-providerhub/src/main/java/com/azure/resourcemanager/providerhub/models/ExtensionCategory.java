// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExtensionCategory. */
public final class ExtensionCategory extends ExpandableStringEnum<ExtensionCategory> {
    /** Static value NotSpecified for ExtensionCategory. */
    public static final ExtensionCategory NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value ResourceCreationValidate for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_CREATION_VALIDATE = fromString("ResourceCreationValidate");

    /** Static value ResourceCreationBegin for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_CREATION_BEGIN = fromString("ResourceCreationBegin");

    /** Static value ResourceCreationCompleted for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_CREATION_COMPLETED = fromString("ResourceCreationCompleted");

    /** Static value ResourceReadValidate for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_READ_VALIDATE = fromString("ResourceReadValidate");

    /** Static value ResourceReadBegin for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_READ_BEGIN = fromString("ResourceReadBegin");

    /** Static value ResourcePatchValidate for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_PATCH_VALIDATE = fromString("ResourcePatchValidate");

    /** Static value ResourcePatchCompleted for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_PATCH_COMPLETED = fromString("ResourcePatchCompleted");

    /** Static value ResourceDeletionValidate for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_DELETION_VALIDATE = fromString("ResourceDeletionValidate");

    /** Static value ResourceDeletionBegin for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_DELETION_BEGIN = fromString("ResourceDeletionBegin");

    /** Static value ResourceDeletionCompleted for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_DELETION_COMPLETED = fromString("ResourceDeletionCompleted");

    /** Static value ResourcePostAction for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_POST_ACTION = fromString("ResourcePostAction");

    /** Static value SubscriptionLifecycleNotification for ExtensionCategory. */
    public static final ExtensionCategory SUBSCRIPTION_LIFECYCLE_NOTIFICATION =
        fromString("SubscriptionLifecycleNotification");

    /** Static value ResourcePatchBegin for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_PATCH_BEGIN = fromString("ResourcePatchBegin");

    /** Static value ResourceMoveBegin for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_MOVE_BEGIN = fromString("ResourceMoveBegin");

    /** Static value ResourceMoveCompleted for ExtensionCategory. */
    public static final ExtensionCategory RESOURCE_MOVE_COMPLETED = fromString("ResourceMoveCompleted");

    /**
     * Creates or finds a ExtensionCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExtensionCategory.
     */
    @JsonCreator
    public static ExtensionCategory fromString(String name) {
        return fromString(name, ExtensionCategory.class);
    }

    /** @return known ExtensionCategory values. */
    public static Collection<ExtensionCategory> values() {
        return values(ExtensionCategory.class);
    }
}
