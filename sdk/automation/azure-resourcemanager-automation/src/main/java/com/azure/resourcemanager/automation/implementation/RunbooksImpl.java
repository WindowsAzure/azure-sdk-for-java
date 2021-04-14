// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.RunbooksClient;
import com.azure.resourcemanager.automation.fluent.models.RunbookInner;
import com.azure.resourcemanager.automation.models.Runbook;
import com.azure.resourcemanager.automation.models.Runbooks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RunbooksImpl implements Runbooks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunbooksImpl.class);

    private final RunbooksClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public RunbooksImpl(
        RunbooksClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void publish(String resourceGroupName, String automationAccountName, String runbookName) {
        this.serviceClient().publish(resourceGroupName, automationAccountName, runbookName);
    }

    public void publish(String resourceGroupName, String automationAccountName, String runbookName, Context context) {
        this.serviceClient().publish(resourceGroupName, automationAccountName, runbookName, context);
    }

    public String getContent(String resourceGroupName, String automationAccountName, String runbookName) {
        return this.serviceClient().getContent(resourceGroupName, automationAccountName, runbookName);
    }

    public Response<String> getContentWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context) {
        return this
            .serviceClient()
            .getContentWithResponse(resourceGroupName, automationAccountName, runbookName, context);
    }

    public Runbook get(String resourceGroupName, String automationAccountName, String runbookName) {
        RunbookInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, runbookName);
        if (inner != null) {
            return new RunbookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Runbook> getWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context) {
        Response<RunbookInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, runbookName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RunbookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String automationAccountName, String runbookName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, runbookName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationAccountName, runbookName, context);
    }

    public PagedIterable<Runbook> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<RunbookInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new RunbookImpl(inner1, this.manager()));
    }

    public PagedIterable<Runbook> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, Context context) {
        PagedIterable<RunbookInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, context);
        return Utils.mapPage(inner, inner1 -> new RunbookImpl(inner1, this.manager()));
    }

    public Runbook getById(String id) {
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
        String runbookName = Utils.getValueFromIdByName(id, "runbooks");
        if (runbookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'runbooks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, runbookName, Context.NONE).getValue();
    }

    public Response<Runbook> getByIdWithResponse(String id, Context context) {
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
        String runbookName = Utils.getValueFromIdByName(id, "runbooks");
        if (runbookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'runbooks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, runbookName, context);
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
        String runbookName = Utils.getValueFromIdByName(id, "runbooks");
        if (runbookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'runbooks'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, runbookName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
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
        String runbookName = Utils.getValueFromIdByName(id, "runbooks");
        if (runbookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'runbooks'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, runbookName, context);
    }

    private RunbooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public RunbookImpl define(String name) {
        return new RunbookImpl(name, this.manager());
    }
}
