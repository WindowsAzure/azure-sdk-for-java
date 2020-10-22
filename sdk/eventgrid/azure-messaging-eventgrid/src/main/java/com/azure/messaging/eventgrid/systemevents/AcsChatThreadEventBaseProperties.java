// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The AcsChatThreadEventBaseProperties model. */
@Fluent
public class AcsChatThreadEventBaseProperties extends AcsChatEventBaseProperties {
    /*
     * The original creation time of the thread
     */
    @JsonProperty(value = "createTime")
    private OffsetDateTime createTime;

    /*
     * The version of the thread
     */
    @JsonProperty(value = "version")
    private Long version;

    /**
     * Get the createTime property: The original creation time of the thread.
     *
     * @return the createTime value.
     */
    public OffsetDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Set the createTime property: The original creation time of the thread.
     *
     * @param createTime the createTime value to set.
     * @return the AcsChatThreadEventBaseProperties object itself.
     */
    public AcsChatThreadEventBaseProperties setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the version property: The version of the thread.
     *
     * @return the version value.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the thread.
     *
     * @param version the version value to set.
     * @return the AcsChatThreadEventBaseProperties object itself.
     */
    public AcsChatThreadEventBaseProperties setVersion(Long version) {
        this.version = version;
        return this;
    }
}
