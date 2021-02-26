// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Adhoc backup tagging criteria. */
@Fluent
public final class AdhocBasedTaggingCriteria {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdhocBasedTaggingCriteria.class);

    /*
     * Retention tag information
     */
    @JsonProperty(value = "tagInfo")
    private RetentionTag tagInfo;

    /**
     * Get the tagInfo property: Retention tag information.
     *
     * @return the tagInfo value.
     */
    public RetentionTag tagInfo() {
        return this.tagInfo;
    }

    /**
     * Set the tagInfo property: Retention tag information.
     *
     * @param tagInfo the tagInfo value to set.
     * @return the AdhocBasedTaggingCriteria object itself.
     */
    public AdhocBasedTaggingCriteria withTagInfo(RetentionTag tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tagInfo() != null) {
            tagInfo().validate();
        }
    }
}
