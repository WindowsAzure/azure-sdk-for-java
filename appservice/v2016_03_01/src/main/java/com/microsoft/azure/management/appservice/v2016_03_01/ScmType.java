/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScmType.
 */
public final class ScmType extends ExpandableStringEnum<ScmType> {
    /** Static value None for ScmType. */
    public static final ScmType NONE = fromString("None");

    /** Static value Dropbox for ScmType. */
    public static final ScmType DROPBOX = fromString("Dropbox");

    /** Static value Tfs for ScmType. */
    public static final ScmType TFS = fromString("Tfs");

    /** Static value LocalGit for ScmType. */
    public static final ScmType LOCAL_GIT = fromString("LocalGit");

    /** Static value GitHub for ScmType. */
    public static final ScmType GIT_HUB = fromString("GitHub");

    /** Static value CodePlexGit for ScmType. */
    public static final ScmType CODE_PLEX_GIT = fromString("CodePlexGit");

    /** Static value CodePlexHg for ScmType. */
    public static final ScmType CODE_PLEX_HG = fromString("CodePlexHg");

    /** Static value BitbucketGit for ScmType. */
    public static final ScmType BITBUCKET_GIT = fromString("BitbucketGit");

    /** Static value BitbucketHg for ScmType. */
    public static final ScmType BITBUCKET_HG = fromString("BitbucketHg");

    /** Static value ExternalGit for ScmType. */
    public static final ScmType EXTERNAL_GIT = fromString("ExternalGit");

    /** Static value ExternalHg for ScmType. */
    public static final ScmType EXTERNAL_HG = fromString("ExternalHg");

    /** Static value OneDrive for ScmType. */
    public static final ScmType ONE_DRIVE = fromString("OneDrive");

    /** Static value VSO for ScmType. */
    public static final ScmType VSO = fromString("VSO");

    /**
     * Creates or finds a ScmType from its string representation.
     * @param name a name to look for
     * @return the corresponding ScmType
     */
    @JsonCreator
    public static ScmType fromString(String name) {
        return fromString(name, ScmType.class);
    }

    /**
     * @return known ScmType values
     */
    public static Collection<ScmType> values() {
        return values(ScmType.class);
    }
}
