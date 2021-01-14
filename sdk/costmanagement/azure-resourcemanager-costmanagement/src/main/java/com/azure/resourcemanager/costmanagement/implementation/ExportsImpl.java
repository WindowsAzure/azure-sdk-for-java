// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.fluent.ExportsClient;
import com.azure.resourcemanager.costmanagement.fluent.models.ExportExecutionListResultInner;
import com.azure.resourcemanager.costmanagement.fluent.models.ExportInner;
import com.azure.resourcemanager.costmanagement.fluent.models.ExportListResultInner;
import com.azure.resourcemanager.costmanagement.models.Export;
import com.azure.resourcemanager.costmanagement.models.ExportExecutionListResult;
import com.azure.resourcemanager.costmanagement.models.ExportListResult;
import com.azure.resourcemanager.costmanagement.models.Exports;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExportsImpl implements Exports {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportsImpl.class);

    private final ExportsClient innerClient;

    private final CostManagementManager serviceManager;

    public ExportsImpl(ExportsClient innerClient, CostManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExportListResult list(String scope) {
        ExportListResultInner inner = this.serviceClient().list(scope);
        if (inner != null) {
            return new ExportListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExportListResult> listWithResponse(String scope, String expand, Context context) {
        Response<ExportListResultInner> inner = this.serviceClient().listWithResponse(scope, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExportListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Export get(String scope, String exportName) {
        ExportInner inner = this.serviceClient().get(scope, exportName);
        if (inner != null) {
            return new ExportImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Export> getWithResponse(String scope, String exportName, String expand, Context context) {
        Response<ExportInner> inner = this.serviceClient().getWithResponse(scope, exportName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExportImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String scope, String exportName) {
        this.serviceClient().delete(scope, exportName);
    }

    public Response<Void> deleteWithResponse(String scope, String exportName, Context context) {
        return this.serviceClient().deleteWithResponse(scope, exportName, context);
    }

    public void execute(String scope, String exportName) {
        this.serviceClient().execute(scope, exportName);
    }

    public Response<Void> executeWithResponse(String scope, String exportName, Context context) {
        return this.serviceClient().executeWithResponse(scope, exportName, context);
    }

    public ExportExecutionListResult getExecutionHistory(String scope, String exportName) {
        ExportExecutionListResultInner inner = this.serviceClient().getExecutionHistory(scope, exportName);
        if (inner != null) {
            return new ExportExecutionListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExportExecutionListResult> getExecutionHistoryWithResponse(
        String scope, String exportName, Context context) {
        Response<ExportExecutionListResultInner> inner =
            this.serviceClient().getExecutionHistoryWithResponse(scope, exportName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExportExecutionListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Export getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(scope, exportName, localExpand, Context.NONE).getValue();
    }

    public Response<Export> getByIdWithResponse(String id, String expand, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        return this.getWithResponse(scope, exportName, expand, context);
    }

    public void deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        this.deleteWithResponse(scope, exportName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String exportName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/exports/{exportName}", "exportName");
        if (exportName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'exports'.", id)));
        }
        return this.deleteWithResponse(scope, exportName, context);
    }

    private ExportsClient serviceClient() {
        return this.innerClient;
    }

    private CostManagementManager manager() {
        return this.serviceManager;
    }

    public ExportImpl define(String name) {
        return new ExportImpl(name, this.manager());
    }
}
