// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ElasticPoolEdition. */
public final class ElasticPoolEdition extends ExpandableStringEnum<ElasticPoolEdition> {
    /** Static value Basic for ElasticPoolEdition. */
    public static final ElasticPoolEdition BASIC = fromString("Basic");

    /** Static value Standard for ElasticPoolEdition. */
    public static final ElasticPoolEdition STANDARD = fromString("Standard");

    /** Static value Premium for ElasticPoolEdition. */
    public static final ElasticPoolEdition PREMIUM = fromString("Premium");

    /** Static value GeneralPurpose for ElasticPoolEdition. */
    public static final ElasticPoolEdition GENERAL_PURPOSE = fromString("GeneralPurpose");

    /** Static value BusinessCritical for ElasticPoolEdition. */
    public static final ElasticPoolEdition BUSINESS_CRITICAL = fromString("BusinessCritical");

    /**
     * Creates or finds a ElasticPoolEdition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ElasticPoolEdition.
     */
    @JsonCreator
    public static ElasticPoolEdition fromString(String name) {
        return fromString(name, ElasticPoolEdition.class);
    }

    /** @return known ElasticPoolEdition values. */
    public static Collection<ElasticPoolEdition> values() {
        return values(ElasticPoolEdition.class);
    }
}
