// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DomainsOrderby. */
public final class DomainsOrderby extends ExpandableStringEnum<DomainsOrderby> {
    /** Static value id for DomainsOrderby. */
    public static final DomainsOrderby ID = fromString("id");

    /** Static value id desc for DomainsOrderby. */
    public static final DomainsOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for DomainsOrderby. */
    public static final DomainsOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for DomainsOrderby. */
    public static final DomainsOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /**
     * Creates or finds a DomainsOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainsOrderby.
     */
    @JsonCreator
    public static DomainsOrderby fromString(String name) {
        return fromString(name, DomainsOrderby.class);
    }

    /** @return known DomainsOrderby values. */
    public static Collection<DomainsOrderby> values() {
        return values(DomainsOrderby.class);
    }
}
