/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LegalHold property of a blob container.
 */
public class LegalHoldInner {
    /**
     * The hasLegalHold public property is set to true by SRP if there are at
     * least one existing tag. The hasLegalHold public property is set to false
     * by SRP if all existing legal hold tags are cleared out. There can be a
     * maximum of 1000 blob containers with hasLegalHold=true for a given
     * account.
     */
    @JsonProperty(value = "hasLegalHold", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasLegalHold;

    /**
     * Each tag should be 3 to 23 alphanumeric characters and is normalized to
     * lower case at SRP.
     */
    @JsonProperty(value = "tags", required = true)
    private List<String> tags;

    /**
     * Get the hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Get each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     *
     * @param tags the tags value to set
     * @return the LegalHoldInner object itself.
     */
    public LegalHoldInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
