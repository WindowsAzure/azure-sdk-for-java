// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PublishingProfileFormat. */
public final class PublishingProfileFormat extends ExpandableStringEnum<PublishingProfileFormat> {
    /** Static value FileZilla3 for PublishingProfileFormat. */
    public static final PublishingProfileFormat FILE_ZILLA3 = fromString("FileZilla3");

    /** Static value WebDeploy for PublishingProfileFormat. */
    public static final PublishingProfileFormat WEB_DEPLOY = fromString("WebDeploy");

    /** Static value Ftp for PublishingProfileFormat. */
    public static final PublishingProfileFormat FTP = fromString("Ftp");

    /**
     * Creates or finds a PublishingProfileFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublishingProfileFormat.
     */
    @JsonCreator
    public static PublishingProfileFormat fromString(String name) {
        return fromString(name, PublishingProfileFormat.class);
    }

    /** @return known PublishingProfileFormat values. */
    public static Collection<PublishingProfileFormat> values() {
        return values(PublishingProfileFormat.class);
    }
}
