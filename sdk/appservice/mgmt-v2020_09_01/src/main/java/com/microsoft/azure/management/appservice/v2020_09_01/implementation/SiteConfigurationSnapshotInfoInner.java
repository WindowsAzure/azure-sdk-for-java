/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * A snapshot of a web app configuration.
 */
@JsonFlatten
public class SiteConfigurationSnapshotInfoInner extends ProxyOnlyResource {
    /**
     * The time the snapshot was taken.
     */
    @JsonProperty(value = "properties.time", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime time;

    /**
     * The id of the snapshot.
     */
    @JsonProperty(value = "properties.snapshotId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer snapshotId;

    /**
     * Get the time the snapshot was taken.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Get the id of the snapshot.
     *
     * @return the snapshotId value
     */
    public Integer snapshotId() {
        return this.snapshotId;
    }

}
