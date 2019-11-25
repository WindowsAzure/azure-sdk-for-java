/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobErrorCode.
 */
public enum JobErrorCode {
    /** Fatal service error, please contact support. */
    SERVICE_ERROR("ServiceError"),

    /** Transient error, please retry, if retry is unsuccessful, please contact support. */
    SERVICE_TRANSIENT_ERROR("ServiceTransientError"),

    /** While trying to download the input files, the files were not accessible, please check the availability of the source. */
    DOWNLOAD_NOT_ACCESSIBLE("DownloadNotAccessible"),

    /** While trying to download the input files, there was an issue during transfer (storage service, network errors), see details and check your source. */
    DOWNLOAD_TRANSIENT_ERROR("DownloadTransientError"),

    /** While trying to upload the output files, the destination was not reachable, please check the availability of the destination. */
    UPLOAD_NOT_ACCESSIBLE("UploadNotAccessible"),

    /** While trying to upload the output files, there was an issue during transfer (storage service, network errors), see details and check your destination. */
    UPLOAD_TRANSIENT_ERROR("UploadTransientError"),

    /** There was a problem with the combination of input files and the configuration settings applied, fix the configuration settings and retry with the same input, or change input to match the configuration. */
    CONFIGURATION_UNSUPPORTED("ConfigurationUnsupported"),

    /** There was a problem with the input content (for example: zero byte files, or corrupt/non-decodable files), check the input files. */
    CONTENT_MALFORMED("ContentMalformed"),

    /** There was a problem with the format of the input (not valid media file, or an unsupported file/codec), check the validity of the input files. */
    CONTENT_UNSUPPORTED("ContentUnsupported");

    /** The actual serialized value for a JobErrorCode instance. */
    private String value;

    JobErrorCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobErrorCode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobErrorCode object, or null if unable to parse.
     */
    @JsonCreator
    public static JobErrorCode fromString(String value) {
        JobErrorCode[] items = JobErrorCode.values();
        for (JobErrorCode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
