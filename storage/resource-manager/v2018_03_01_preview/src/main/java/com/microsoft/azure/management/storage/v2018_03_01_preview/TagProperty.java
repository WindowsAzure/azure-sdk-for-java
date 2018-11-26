/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A tag of the LegalHold of a blob container.
 */
public class TagProperty {
    /**
     * The tag value.
     */
    @JsonProperty(value = "tag", access = JsonProperty.Access.WRITE_ONLY)
    private String tag;

    /**
     * Returns the date and time the tag was added.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Returns the Object ID of the user who added the tag.
     */
    @JsonProperty(value = "objectIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String objectIdentifier;

    /**
     * Returns the Tenant ID that issued the token for the user who added the
     * tag.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Returns the User Principal Name of the user who added the tag.
     */
    @JsonProperty(value = "upn", access = JsonProperty.Access.WRITE_ONLY)
    private String upn;

    /**
     * Get the tag value.
     *
     * @return the tag value
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Get returns the date and time the tag was added.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get returns the Object ID of the user who added the tag.
     *
     * @return the objectIdentifier value
     */
    public String objectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Get returns the Tenant ID that issued the token for the user who added the tag.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get returns the User Principal Name of the user who added the tag.
     *
     * @return the upn value
     */
    public String upn() {
        return this.upn;
    }

}
