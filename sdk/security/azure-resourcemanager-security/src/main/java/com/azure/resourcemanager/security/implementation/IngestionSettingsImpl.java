// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IngestionSettingsClient;
import com.azure.resourcemanager.security.fluent.models.ConnectionStringsInner;
import com.azure.resourcemanager.security.fluent.models.IngestionSettingInner;
import com.azure.resourcemanager.security.fluent.models.IngestionSettingTokenInner;
import com.azure.resourcemanager.security.models.ConnectionStrings;
import com.azure.resourcemanager.security.models.IngestionSetting;
import com.azure.resourcemanager.security.models.IngestionSettingToken;
import com.azure.resourcemanager.security.models.IngestionSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IngestionSettingsImpl implements IngestionSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IngestionSettingsImpl.class);

    private final IngestionSettingsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IngestionSettingsImpl(
        IngestionSettingsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IngestionSetting> list() {
        PagedIterable<IngestionSettingInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new IngestionSettingImpl(inner1, this.manager()));
    }

    public PagedIterable<IngestionSetting> list(Context context) {
        PagedIterable<IngestionSettingInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new IngestionSettingImpl(inner1, this.manager()));
    }

    public IngestionSetting get(String ingestionSettingName) {
        IngestionSettingInner inner = this.serviceClient().get(ingestionSettingName);
        if (inner != null) {
            return new IngestionSettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IngestionSetting> getWithResponse(String ingestionSettingName, Context context) {
        Response<IngestionSettingInner> inner = this.serviceClient().getWithResponse(ingestionSettingName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IngestionSettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String ingestionSettingName) {
        this.serviceClient().delete(ingestionSettingName);
    }

    public Response<Void> deleteWithResponse(String ingestionSettingName, Context context) {
        return this.serviceClient().deleteWithResponse(ingestionSettingName, context);
    }

    public IngestionSettingToken listTokens(String ingestionSettingName) {
        IngestionSettingTokenInner inner = this.serviceClient().listTokens(ingestionSettingName);
        if (inner != null) {
            return new IngestionSettingTokenImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IngestionSettingToken> listTokensWithResponse(String ingestionSettingName, Context context) {
        Response<IngestionSettingTokenInner> inner =
            this.serviceClient().listTokensWithResponse(ingestionSettingName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IngestionSettingTokenImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectionStrings listConnectionStrings(String ingestionSettingName) {
        ConnectionStringsInner inner = this.serviceClient().listConnectionStrings(ingestionSettingName);
        if (inner != null) {
            return new ConnectionStringsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectionStrings> listConnectionStringsWithResponse(String ingestionSettingName, Context context) {
        Response<ConnectionStringsInner> inner =
            this.serviceClient().listConnectionStringsWithResponse(ingestionSettingName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConnectionStringsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IngestionSetting getById(String id) {
        String ingestionSettingName = Utils.getValueFromIdByName(id, "ingestionSettings");
        if (ingestionSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ingestionSettings'.", id)));
        }
        return this.getWithResponse(ingestionSettingName, Context.NONE).getValue();
    }

    public Response<IngestionSetting> getByIdWithResponse(String id, Context context) {
        String ingestionSettingName = Utils.getValueFromIdByName(id, "ingestionSettings");
        if (ingestionSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ingestionSettings'.", id)));
        }
        return this.getWithResponse(ingestionSettingName, context);
    }

    public void deleteById(String id) {
        String ingestionSettingName = Utils.getValueFromIdByName(id, "ingestionSettings");
        if (ingestionSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ingestionSettings'.", id)));
        }
        this.deleteWithResponse(ingestionSettingName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String ingestionSettingName = Utils.getValueFromIdByName(id, "ingestionSettings");
        if (ingestionSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ingestionSettings'.", id)));
        }
        return this.deleteWithResponse(ingestionSettingName, context);
    }

    private IngestionSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public IngestionSettingImpl define(String name) {
        return new IngestionSettingImpl(name, this.manager());
    }
}
