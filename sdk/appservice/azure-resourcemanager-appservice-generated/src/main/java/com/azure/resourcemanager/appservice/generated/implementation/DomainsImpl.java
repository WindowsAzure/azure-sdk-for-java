// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.DomainsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainAvailabilityCheckResultInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainControlCenterSsoRequestInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainOwnershipIdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import com.azure.resourcemanager.appservice.generated.models.Domain;
import com.azure.resourcemanager.appservice.generated.models.DomainAvailabilityCheckResult;
import com.azure.resourcemanager.appservice.generated.models.DomainControlCenterSsoRequest;
import com.azure.resourcemanager.appservice.generated.models.DomainOwnershipIdentifier;
import com.azure.resourcemanager.appservice.generated.models.DomainRecommendationSearchParameters;
import com.azure.resourcemanager.appservice.generated.models.Domains;
import com.azure.resourcemanager.appservice.generated.models.NameIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DomainsImpl implements Domains {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainsImpl.class);

    private final DomainsClient innerClient;

    private final WebSiteManager serviceManager;

    public DomainsImpl(DomainsClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DomainAvailabilityCheckResult checkAvailability(NameIdentifierInner identifier) {
        DomainAvailabilityCheckResultInner inner = this.serviceClient().checkAvailability(identifier);
        if (inner != null) {
            return new DomainAvailabilityCheckResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainAvailabilityCheckResult> checkAvailabilityWithResponse(
        NameIdentifierInner identifier, Context context) {
        Response<DomainAvailabilityCheckResultInner> inner =
            this.serviceClient().checkAvailabilityWithResponse(identifier, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainAvailabilityCheckResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Domain> list() {
        PagedIterable<DomainInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> list(Context context) {
        PagedIterable<DomainInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public DomainControlCenterSsoRequest getControlCenterSsoRequest() {
        DomainControlCenterSsoRequestInner inner = this.serviceClient().getControlCenterSsoRequest();
        if (inner != null) {
            return new DomainControlCenterSsoRequestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainControlCenterSsoRequest> getControlCenterSsoRequestWithResponse(Context context) {
        Response<DomainControlCenterSsoRequestInner> inner =
            this.serviceClient().getControlCenterSsoRequestWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainControlCenterSsoRequestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NameIdentifier> listRecommendations(DomainRecommendationSearchParameters parameters) {
        PagedIterable<NameIdentifierInner> inner = this.serviceClient().listRecommendations(parameters);
        return Utils.mapPage(inner, inner1 -> new NameIdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<NameIdentifier> listRecommendations(
        DomainRecommendationSearchParameters parameters, Context context) {
        PagedIterable<NameIdentifierInner> inner = this.serviceClient().listRecommendations(parameters, context);
        return Utils.mapPage(inner, inner1 -> new NameIdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DomainInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DomainInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public Domain getByResourceGroup(String resourceGroupName, String domainName) {
        DomainInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, domainName);
        if (inner != null) {
            return new DomainImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Domain> getByResourceGroupWithResponse(
        String resourceGroupName, String domainName, Context context) {
        Response<DomainInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, domainName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String domainName) {
        this.serviceClient().delete(resourceGroupName, domainName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String domainName, Boolean forceHardDeleteDomain, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, domainName, forceHardDeleteDomain, context);
    }

    public PagedIterable<DomainOwnershipIdentifier> listOwnershipIdentifiers(
        String resourceGroupName, String domainName) {
        PagedIterable<DomainOwnershipIdentifierInner> inner =
            this.serviceClient().listOwnershipIdentifiers(resourceGroupName, domainName);
        return Utils.mapPage(inner, inner1 -> new DomainOwnershipIdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<DomainOwnershipIdentifier> listOwnershipIdentifiers(
        String resourceGroupName, String domainName, Context context) {
        PagedIterable<DomainOwnershipIdentifierInner> inner =
            this.serviceClient().listOwnershipIdentifiers(resourceGroupName, domainName, context);
        return Utils.mapPage(inner, inner1 -> new DomainOwnershipIdentifierImpl(inner1, this.manager()));
    }

    public DomainOwnershipIdentifier getOwnershipIdentifier(String resourceGroupName, String domainName, String name) {
        DomainOwnershipIdentifierInner inner =
            this.serviceClient().getOwnershipIdentifier(resourceGroupName, domainName, name);
        if (inner != null) {
            return new DomainOwnershipIdentifierImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainOwnershipIdentifier> getOwnershipIdentifierWithResponse(
        String resourceGroupName, String domainName, String name, Context context) {
        Response<DomainOwnershipIdentifierInner> inner =
            this.serviceClient().getOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainOwnershipIdentifierImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteOwnershipIdentifier(String resourceGroupName, String domainName, String name) {
        this.serviceClient().deleteOwnershipIdentifier(resourceGroupName, domainName, name);
    }

    public Response<Void> deleteOwnershipIdentifierWithResponse(
        String resourceGroupName, String domainName, String name, Context context) {
        return this.serviceClient().deleteOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context);
    }

    public void renew(String resourceGroupName, String domainName) {
        this.serviceClient().renew(resourceGroupName, domainName);
    }

    public Response<Void> renewWithResponse(String resourceGroupName, String domainName, Context context) {
        return this.serviceClient().renewWithResponse(resourceGroupName, domainName, context);
    }

    public Domain getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, domainName, Context.NONE).getValue();
    }

    public Response<Domain> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, domainName, context);
    }

    public DomainOwnershipIdentifier getOwnershipIdentifierById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "domainOwnershipIdentifiers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'domainOwnershipIdentifiers'.",
                                id)));
        }
        return this.getOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, Context.NONE).getValue();
    }

    public Response<DomainOwnershipIdentifier> getOwnershipIdentifierByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "domainOwnershipIdentifiers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'domainOwnershipIdentifiers'.",
                                id)));
        }
        return this.getOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context);
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
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        Boolean localForceHardDeleteDomain = null;
        this.deleteWithResponse(resourceGroupName, domainName, localForceHardDeleteDomain, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Boolean forceHardDeleteDomain, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, domainName, forceHardDeleteDomain, context);
    }

    public void deleteOwnershipIdentifierById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "domainOwnershipIdentifiers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'domainOwnershipIdentifiers'.",
                                id)));
        }
        this.deleteOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, Context.NONE).getValue();
    }

    public Response<Void> deleteOwnershipIdentifierByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "domainOwnershipIdentifiers");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'domainOwnershipIdentifiers'.",
                                id)));
        }
        return this.deleteOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context);
    }

    private DomainsClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public DomainImpl define(String name) {
        return new DomainImpl(name, this.manager());
    }

    public DomainOwnershipIdentifierImpl defineOwnershipIdentifier(String name) {
        return new DomainOwnershipIdentifierImpl(name, this.manager());
    }
}
