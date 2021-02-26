// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the validateForBackup operation. */
public final class BackupInstancesValidateForBackupResponse
    extends ResponseBase<BackupInstancesValidateForBackupHeaders, Void> {
    /**
     * Creates an instance of BackupInstancesValidateForBackupResponse.
     *
     * @param request the request which resulted in this BackupInstancesValidateForBackupResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BackupInstancesValidateForBackupResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        Void value,
        BackupInstancesValidateForBackupHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
