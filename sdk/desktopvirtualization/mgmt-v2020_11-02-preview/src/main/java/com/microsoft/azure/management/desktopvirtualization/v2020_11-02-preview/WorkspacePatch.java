/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Workspace properties that can be patched.
 */
@JsonFlatten
public class WorkspacePatch {
    /**
     * tags to be updated.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Description of Workspace.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Friendly name of Workspace.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * List of applicationGroup links.
     */
    @JsonProperty(value = "properties.applicationGroupReferences")
    private List<String> applicationGroupReferences;

    /**
     * Get tags to be updated.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set tags to be updated.
     *
     * @param tags the tags value to set
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get description of Workspace.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of Workspace.
     *
     * @param description the description value to set
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get friendly name of Workspace.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of Workspace.
     *
     * @param friendlyName the friendlyName value to set
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get list of applicationGroup links.
     *
     * @return the applicationGroupReferences value
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }

    /**
     * Set list of applicationGroup links.
     *
     * @param applicationGroupReferences the applicationGroupReferences value to set
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withApplicationGroupReferences(List<String> applicationGroupReferences) {
        this.applicationGroupReferences = applicationGroupReferences;
        return this;
    }

}
