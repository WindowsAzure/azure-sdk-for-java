// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.fluent.ViewsClient;
import com.azure.resourcemanager.costmanagement.fluent.models.ViewInner;
import com.azure.resourcemanager.costmanagement.models.View;
import com.azure.resourcemanager.costmanagement.models.Views;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ViewsImpl implements Views {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ViewsImpl.class);

    private final ViewsClient innerClient;

    private final CostManagementManager serviceManager;

    public ViewsImpl(ViewsClient innerClient, CostManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<View> list() {
        PagedIterable<ViewInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ViewImpl(inner1, this.manager()));
    }

    public PagedIterable<View> list(Context context) {
        PagedIterable<ViewInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ViewImpl(inner1, this.manager()));
    }

    public PagedIterable<View> listByScope(String scope) {
        PagedIterable<ViewInner> inner = this.serviceClient().listByScope(scope);
        return inner.mapPage(inner1 -> new ViewImpl(inner1, this.manager()));
    }

    public PagedIterable<View> listByScope(String scope, Context context) {
        PagedIterable<ViewInner> inner = this.serviceClient().listByScope(scope, context);
        return inner.mapPage(inner1 -> new ViewImpl(inner1, this.manager()));
    }

    public View get(String viewName) {
        ViewInner inner = this.serviceClient().get(viewName);
        if (inner != null) {
            return new ViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<View> getWithResponse(String viewName, Context context) {
        Response<ViewInner> inner = this.serviceClient().getWithResponse(viewName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public View createOrUpdate(String viewName, ViewInner parameters) {
        ViewInner inner = this.serviceClient().createOrUpdate(viewName, parameters);
        if (inner != null) {
            return new ViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<View> createOrUpdateWithResponse(String viewName, ViewInner parameters, Context context) {
        Response<ViewInner> inner = this.serviceClient().createOrUpdateWithResponse(viewName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String viewName) {
        this.serviceClient().delete(viewName);
    }

    public Response<Void> deleteWithResponse(String viewName, Context context) {
        return this.serviceClient().deleteWithResponse(viewName, context);
    }

    public View getByScope(String scope, String viewName) {
        ViewInner inner = this.serviceClient().getByScope(scope, viewName);
        if (inner != null) {
            return new ViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<View> getByScopeWithResponse(String scope, String viewName, Context context) {
        Response<ViewInner> inner = this.serviceClient().getByScopeWithResponse(scope, viewName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByScope(String scope, String viewName) {
        this.serviceClient().deleteByScope(scope, viewName);
    }

    public Response<Void> deleteByScopeWithResponse(String scope, String viewName, Context context) {
        return this.serviceClient().deleteByScopeWithResponse(scope, viewName, context);
    }

    public View getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String viewName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "viewName");
        if (viewName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'views'.", id)));
        }
        return this.getByScopeWithResponse(scope, viewName, Context.NONE).getValue();
    }

    public Response<View> getByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String viewName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "viewName");
        if (viewName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'views'.", id)));
        }
        return this.getByScopeWithResponse(scope, viewName, context);
    }

    public void deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String viewName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "viewName");
        if (viewName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'views'.", id)));
        }
        this.deleteByScopeWithResponse(scope, viewName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String viewName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "viewName");
        if (viewName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'views'.", id)));
        }
        return this.deleteByScopeWithResponse(scope, viewName, context);
    }

    private ViewsClient serviceClient() {
        return this.innerClient;
    }

    private CostManagementManager manager() {
        return this.serviceManager;
    }

    public ViewImpl define(String name) {
        return new ViewImpl(name, this.manager());
    }
}
