/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies the clip time as an absolute time position in the media file.  The
 * absolute time can point to a different position depending on whether the
 * media file starts from a timestamp of zero or not.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = AbsoluteClipTime.class)
@JsonTypeName("#Microsoft.Media.AbsoluteClipTime")
public class AbsoluteClipTime extends ClipTime {
    /**
     * The time position on the timeline of the input media. It is usually
     * specified as an ISO8601 period. e.g PT30S for 30 seconds.
     */
    @JsonProperty(value = "time", required = true)
    private Period time;

    /**
     * Get the time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     *
     * @return the time value
     */
    public Period time() {
        return this.time;
    }

    /**
     * Set the time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     *
     * @param time the time value to set
     * @return the AbsoluteClipTime object itself.
     */
    public AbsoluteClipTime withTime(Period time) {
        this.time = time;
        return this;
    }

}
