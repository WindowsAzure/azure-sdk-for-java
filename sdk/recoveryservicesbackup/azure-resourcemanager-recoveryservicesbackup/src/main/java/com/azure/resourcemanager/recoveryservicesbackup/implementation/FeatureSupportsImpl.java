// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.FeatureSupportsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AzureVMResourceFeatureSupportResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVMResourceFeatureSupportResponse;
import com.azure.resourcemanager.recoveryservicesbackup.models.FeatureSupportRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.FeatureSupports;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FeatureSupportsImpl implements FeatureSupports {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FeatureSupportsImpl.class);

    private final FeatureSupportsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public FeatureSupportsImpl(FeatureSupportsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AzureVMResourceFeatureSupportResponse validate(String azureRegion, FeatureSupportRequest parameters) {
        AzureVMResourceFeatureSupportResponseInner inner = this.serviceClient().validate(azureRegion, parameters);
        if (inner != null) {
            return new AzureVMResourceFeatureSupportResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureVMResourceFeatureSupportResponse> validateWithResponse(
        String azureRegion, FeatureSupportRequest parameters, Context context) {
        Response<AzureVMResourceFeatureSupportResponseInner> inner =
            this.serviceClient().validateWithResponse(azureRegion, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureVMResourceFeatureSupportResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private FeatureSupportsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
