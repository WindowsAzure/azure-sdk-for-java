// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.SoftwareUpdateConfigurationsClient;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationInner;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationListResultInner;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfiguration;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationListResult;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SoftwareUpdateConfigurationsImpl implements SoftwareUpdateConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SoftwareUpdateConfigurationsImpl.class);

    private final SoftwareUpdateConfigurationsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public SoftwareUpdateConfigurationsImpl(
        SoftwareUpdateConfigurationsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SoftwareUpdateConfiguration getByName(
        String resourceGroupName, String automationAccountName, String softwareUpdateConfigurationName) {
        SoftwareUpdateConfigurationInner inner =
            this.serviceClient().getByName(resourceGroupName, automationAccountName, softwareUpdateConfigurationName);
        if (inner != null) {
            return new SoftwareUpdateConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SoftwareUpdateConfiguration> getByNameWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String softwareUpdateConfigurationName,
        String clientRequestId,
        Context context) {
        Response<SoftwareUpdateConfigurationInner> inner =
            this
                .serviceClient()
                .getByNameWithResponse(
                    resourceGroupName,
                    automationAccountName,
                    softwareUpdateConfigurationName,
                    clientRequestId,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SoftwareUpdateConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String automationAccountName, String softwareUpdateConfigurationName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, softwareUpdateConfigurationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String softwareUpdateConfigurationName,
        String clientRequestId,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, automationAccountName, softwareUpdateConfigurationName, clientRequestId, context);
    }

    public SoftwareUpdateConfigurationListResult list(String resourceGroupName, String automationAccountName) {
        SoftwareUpdateConfigurationListResultInner inner =
            this.serviceClient().list(resourceGroupName, automationAccountName);
        if (inner != null) {
            return new SoftwareUpdateConfigurationListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SoftwareUpdateConfigurationListResult> listWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String clientRequestId,
        String filter,
        Context context) {
        Response<SoftwareUpdateConfigurationListResultInner> inner =
            this
                .serviceClient()
                .listWithResponse(resourceGroupName, automationAccountName, clientRequestId, filter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SoftwareUpdateConfigurationListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SoftwareUpdateConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String softwareUpdateConfigurationName = Utils.getValueFromIdByName(id, "softwareUpdateConfigurations");
        if (softwareUpdateConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'softwareUpdateConfigurations'.",
                                id)));
        }
        String localClientRequestId = null;
        return this
            .getByNameWithResponse(
                resourceGroupName,
                automationAccountName,
                softwareUpdateConfigurationName,
                localClientRequestId,
                Context.NONE)
            .getValue();
    }

    public Response<SoftwareUpdateConfiguration> getByIdWithResponse(
        String id, String clientRequestId, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String softwareUpdateConfigurationName = Utils.getValueFromIdByName(id, "softwareUpdateConfigurations");
        if (softwareUpdateConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'softwareUpdateConfigurations'.",
                                id)));
        }
        return this
            .getByNameWithResponse(
                resourceGroupName, automationAccountName, softwareUpdateConfigurationName, clientRequestId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String softwareUpdateConfigurationName = Utils.getValueFromIdByName(id, "softwareUpdateConfigurations");
        if (softwareUpdateConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'softwareUpdateConfigurations'.",
                                id)));
        }
        String localClientRequestId = null;
        this
            .deleteWithResponse(
                resourceGroupName,
                automationAccountName,
                softwareUpdateConfigurationName,
                localClientRequestId,
                Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String clientRequestId, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String softwareUpdateConfigurationName = Utils.getValueFromIdByName(id, "softwareUpdateConfigurations");
        if (softwareUpdateConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'softwareUpdateConfigurations'.",
                                id)));
        }
        return this
            .deleteWithResponse(
                resourceGroupName, automationAccountName, softwareUpdateConfigurationName, clientRequestId, context);
    }

    private SoftwareUpdateConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public SoftwareUpdateConfigurationImpl define(String name) {
        return new SoftwareUpdateConfigurationImpl(name, this.manager());
    }
}
