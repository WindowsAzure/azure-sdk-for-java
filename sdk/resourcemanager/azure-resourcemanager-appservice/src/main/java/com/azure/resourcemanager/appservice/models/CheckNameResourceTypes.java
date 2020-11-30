// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CheckNameResourceTypes. */
public final class CheckNameResourceTypes extends ExpandableStringEnum<CheckNameResourceTypes> {
    /** Static value Site for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes SITE = fromString("Site");

    /** Static value Slot for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes SLOT = fromString("Slot");

    /** Static value HostingEnvironment for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes HOSTING_ENVIRONMENT = fromString("HostingEnvironment");

    /** Static value PublishingUser for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes PUBLISHING_USER = fromString("PublishingUser");

    /** Static value Microsoft.Web/sites for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEB_SITES = fromString("Microsoft.Web/sites");

    /** Static value Microsoft.Web/sites/slots for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEB_SITES_SLOTS = fromString("Microsoft.Web/sites/slots");

    /** Static value Microsoft.Web/hostingEnvironments for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEB_HOSTING_ENVIRONMENTS =
        fromString("Microsoft.Web/hostingEnvironments");

    /** Static value Microsoft.Web/publishingUsers for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEB_PUBLISHING_USERS =
        fromString("Microsoft.Web/publishingUsers");

    /**
     * Creates or finds a CheckNameResourceTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CheckNameResourceTypes.
     */
    @JsonCreator
    public static CheckNameResourceTypes fromString(String name) {
        return fromString(name, CheckNameResourceTypes.class);
    }

    /** @return known CheckNameResourceTypes values. */
    public static Collection<CheckNameResourceTypes> values() {
        return values(CheckNameResourceTypes.class);
    }
}
