/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Schema for Desktop properties.
 */
@JsonFlatten
public class DesktopInner extends ProxyResource {
    /**
     * Description of Desktop.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Friendly name of Desktop.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Hash of the icon.
     */
    @JsonProperty(value = "properties.iconHash", access = JsonProperty.Access.WRITE_ONLY)
    private String iconHash;

    /**
     * The icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "properties.iconContent", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] iconContent;

    /**
     * Get description of Desktop.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of Desktop.
     *
     * @param description the description value to set
     * @return the DesktopInner object itself.
     */
    public DesktopInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get friendly name of Desktop.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of Desktop.
     *
     * @param friendlyName the friendlyName value to set
     * @return the DesktopInner object itself.
     */
    public DesktopInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get hash of the icon.
     *
     * @return the iconHash value
     */
    public String iconHash() {
        return this.iconHash;
    }

    /**
     * Get the icon a 64 bit string as a byte array.
     *
     * @return the iconContent value
     */
    public byte[] iconContent() {
        return this.iconContent;
    }

}
