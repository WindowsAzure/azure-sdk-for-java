// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KnownDataCollectionRuleResourceKind. */
public final class KnownDataCollectionRuleResourceKind
    extends ExpandableStringEnum<KnownDataCollectionRuleResourceKind> {
    /** Static value Linux for KnownDataCollectionRuleResourceKind. */
    public static final KnownDataCollectionRuleResourceKind LINUX = fromString("Linux");

    /** Static value Windows for KnownDataCollectionRuleResourceKind. */
    public static final KnownDataCollectionRuleResourceKind WINDOWS = fromString("Windows");

    /**
     * Creates or finds a KnownDataCollectionRuleResourceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownDataCollectionRuleResourceKind.
     */
    @JsonCreator
    public static KnownDataCollectionRuleResourceKind fromString(String name) {
        return fromString(name, KnownDataCollectionRuleResourceKind.class);
    }

    /** @return known KnownDataCollectionRuleResourceKind values. */
    public static Collection<KnownDataCollectionRuleResourceKind> values() {
        return values(KnownDataCollectionRuleResourceKind.class);
    }
}
