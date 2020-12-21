// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.RelayManager;
import com.azure.resourcemanager.relay.fluent.WcfRelaysClient;
import com.azure.resourcemanager.relay.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.relay.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.fluent.models.WcfRelayInner;
import com.azure.resourcemanager.relay.models.AccessKeys;
import com.azure.resourcemanager.relay.models.AuthorizationRule;
import com.azure.resourcemanager.relay.models.RegenerateAccessKeyParameters;
import com.azure.resourcemanager.relay.models.WcfRelay;
import com.azure.resourcemanager.relay.models.WcfRelays;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WcfRelaysImpl implements WcfRelays {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WcfRelaysImpl.class);

    private final WcfRelaysClient innerClient;

    private final RelayManager serviceManager;

    public WcfRelaysImpl(WcfRelaysClient innerClient, RelayManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WcfRelay> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<WcfRelayInner> inner = this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return inner.mapPage(inner1 -> new WcfRelayImpl(inner1, this.manager()));
    }

    public PagedIterable<WcfRelay> listByNamespace(String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<WcfRelayInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName, context);
        return inner.mapPage(inner1 -> new WcfRelayImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String namespaceName, String relayName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, relayName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String relayName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, relayName, context);
    }

    public WcfRelay get(String resourceGroupName, String namespaceName, String relayName) {
        WcfRelayInner inner = this.serviceClient().get(resourceGroupName, namespaceName, relayName);
        if (inner != null) {
            return new WcfRelayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WcfRelay> getWithResponse(
        String resourceGroupName, String namespaceName, String relayName, Context context) {
        Response<WcfRelayInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, relayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WcfRelayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String relayName) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, relayName);
        return inner.mapPage(inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String relayName, Context context) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, relayName, context);
        return inner.mapPage(inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public AuthorizationRule createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters) {
        AuthorizationRuleInner inner =
            this
                .serviceClient()
                .createOrUpdateAuthorizationRule(
                    resourceGroupName, namespaceName, relayName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        AuthorizationRuleInner parameters,
        Context context) {
        Response<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, relayName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName) {
        this
            .serviceClient()
            .deleteAuthorizationRule(resourceGroupName, namespaceName, relayName, authorizationRuleName);
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        Context context) {
        return this
            .serviceClient()
            .deleteAuthorizationRuleWithResponse(
                resourceGroupName, namespaceName, relayName, authorizationRuleName, context);
    }

    public AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName) {
        AuthorizationRuleInner inner =
            this
                .serviceClient()
                .getAuthorizationRule(resourceGroupName, namespaceName, relayName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        Context context) {
        Response<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .getAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, relayName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(
        String resourceGroupName, String namespaceName, String relayName, String authorizationRuleName) {
        AccessKeysInner inner =
            this.serviceClient().listKeys(resourceGroupName, namespaceName, relayName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .listKeysWithResponse(resourceGroupName, namespaceName, relayName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner =
            this
                .serviceClient()
                .regenerateKeys(resourceGroupName, namespaceName, relayName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String relayName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .regenerateKeysWithResponse(
                    resourceGroupName, namespaceName, relayName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WcfRelay getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, relayName, Context.NONE).getValue();
    }

    public Response<WcfRelay> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, relayName, context);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, relayName, Context.NONE).getValue();
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String relayName = Utils.getValueFromIdByName(id, "wcfRelays");
        if (relayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'wcfRelays'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, relayName, context);
    }

    private WcfRelaysClient serviceClient() {
        return this.innerClient;
    }

    private RelayManager manager() {
        return this.serviceManager;
    }

    public WcfRelayImpl define(String name) {
        return new WcfRelayImpl(name, this.manager());
    }
}
