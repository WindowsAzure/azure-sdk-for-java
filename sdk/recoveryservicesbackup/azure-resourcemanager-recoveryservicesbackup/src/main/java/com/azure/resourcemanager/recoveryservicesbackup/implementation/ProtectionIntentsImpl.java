// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionIntentsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.PreValidateEnableBackupResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionIntentResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.PreValidateEnableBackupRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.PreValidateEnableBackupResponse;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntentResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntents;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProtectionIntentsImpl implements ProtectionIntents {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionIntentsImpl.class);

    private final ProtectionIntentsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ProtectionIntentsImpl(
        ProtectionIntentsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PreValidateEnableBackupResponse validate(String azureRegion, PreValidateEnableBackupRequest parameters) {
        PreValidateEnableBackupResponseInner inner = this.serviceClient().validate(azureRegion, parameters);
        if (inner != null) {
            return new PreValidateEnableBackupResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PreValidateEnableBackupResponse> validateWithResponse(
        String azureRegion, PreValidateEnableBackupRequest parameters, Context context) {
        Response<PreValidateEnableBackupResponseInner> inner =
            this.serviceClient().validateWithResponse(azureRegion, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PreValidateEnableBackupResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProtectionIntentResource get(
        String vaultName, String resourceGroupName, String fabricName, String intentObjectName) {
        ProtectionIntentResourceInner inner =
            this.serviceClient().get(vaultName, resourceGroupName, fabricName, intentObjectName);
        if (inner != null) {
            return new ProtectionIntentResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProtectionIntentResource> getWithResponse(
        String vaultName, String resourceGroupName, String fabricName, String intentObjectName, Context context) {
        Response<ProtectionIntentResourceInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProtectionIntentResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String vaultName, String resourceGroupName, String fabricName, String intentObjectName) {
        this.serviceClient().delete(vaultName, resourceGroupName, fabricName, intentObjectName);
    }

    public Response<Void> deleteWithResponse(
        String vaultName, String resourceGroupName, String fabricName, String intentObjectName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, context);
    }

    public ProtectionIntentResource getById(String id) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "backupFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupFabrics'.", id)));
        }
        String intentObjectName = Utils.getValueFromIdByName(id, "backupProtectionIntent");
        if (intentObjectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'backupProtectionIntent'.",
                                id)));
        }
        return this
            .getWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, Context.NONE)
            .getValue();
    }

    public Response<ProtectionIntentResource> getByIdWithResponse(String id, Context context) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "backupFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupFabrics'.", id)));
        }
        String intentObjectName = Utils.getValueFromIdByName(id, "backupProtectionIntent");
        if (intentObjectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'backupProtectionIntent'.",
                                id)));
        }
        return this.getWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, context);
    }

    public void deleteById(String id) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "backupFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupFabrics'.", id)));
        }
        String intentObjectName = Utils.getValueFromIdByName(id, "backupProtectionIntent");
        if (intentObjectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'backupProtectionIntent'.",
                                id)));
        }
        this.deleteWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "backupFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupFabrics'.", id)));
        }
        String intentObjectName = Utils.getValueFromIdByName(id, "backupProtectionIntent");
        if (intentObjectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'backupProtectionIntent'.",
                                id)));
        }
        return this.deleteWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, context);
    }

    private ProtectionIntentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    public ProtectionIntentResourceImpl define(String name) {
        return new ProtectionIntentResourceImpl(name, this.manager());
    }
}
