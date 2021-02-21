/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The publishing profile of a gallery image version.
 */
public class GalleryApplicationVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    /**
     * The source property.
     */
    @JsonProperty(value = "source", required = true)
    private UserArtifactSource source;

    /**
     * The manageActions property.
     */
    @JsonProperty(value = "manageActions")
    private UserArtifactManage manageActions;

    /**
     * Optional. Whether or not this application reports health.
     */
    @JsonProperty(value = "enableHealthCheck")
    private Boolean enableHealthCheck;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public UserArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSource(UserArtifactSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the manageActions value.
     *
     * @return the manageActions value
     */
    public UserArtifactManage manageActions() {
        return this.manageActions;
    }

    /**
     * Set the manageActions value.
     *
     * @param manageActions the manageActions value to set
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withManageActions(UserArtifactManage manageActions) {
        this.manageActions = manageActions;
        return this;
    }

    /**
     * Get optional. Whether or not this application reports health.
     *
     * @return the enableHealthCheck value
     */
    public Boolean enableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * Set optional. Whether or not this application reports health.
     *
     * @param enableHealthCheck the enableHealthCheck value to set
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

}
