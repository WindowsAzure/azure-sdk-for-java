// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.fluent.ExperimentsClient;
import com.azure.resourcemanager.frontdoor.fluent.models.ExperimentInner;
import com.azure.resourcemanager.frontdoor.models.Experiment;
import com.azure.resourcemanager.frontdoor.models.Experiments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExperimentsImpl implements Experiments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExperimentsImpl.class);

    private final ExperimentsClient innerClient;

    private final com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager;

    public ExperimentsImpl(
        ExperimentsClient innerClient, com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Experiment> listByProfile(String resourceGroupName, String profileName) {
        PagedIterable<ExperimentInner> inner = this.serviceClient().listByProfile(resourceGroupName, profileName);
        return Utils.mapPage(inner, inner1 -> new ExperimentImpl(inner1, this.manager()));
    }

    public PagedIterable<Experiment> listByProfile(String resourceGroupName, String profileName, Context context) {
        PagedIterable<ExperimentInner> inner =
            this.serviceClient().listByProfile(resourceGroupName, profileName, context);
        return Utils.mapPage(inner, inner1 -> new ExperimentImpl(inner1, this.manager()));
    }

    public Experiment get(String resourceGroupName, String profileName, String experimentName) {
        ExperimentInner inner = this.serviceClient().get(resourceGroupName, profileName, experimentName);
        if (inner != null) {
            return new ExperimentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Experiment> getWithResponse(
        String resourceGroupName, String profileName, String experimentName, Context context) {
        Response<ExperimentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, experimentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExperimentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String experimentName) {
        this.serviceClient().delete(resourceGroupName, profileName, experimentName);
    }

    public void delete(String resourceGroupName, String profileName, String experimentName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, experimentName, context);
    }

    public Experiment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.",
                                id)));
        }
        String experimentName = Utils.getValueFromIdByName(id, "Experiments");
        if (experimentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Experiments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, experimentName, Context.NONE).getValue();
    }

    public Response<Experiment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.",
                                id)));
        }
        String experimentName = Utils.getValueFromIdByName(id, "Experiments");
        if (experimentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Experiments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, experimentName, context);
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
        String profileName = Utils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.",
                                id)));
        }
        String experimentName = Utils.getValueFromIdByName(id, "Experiments");
        if (experimentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Experiments'.", id)));
        }
        this.delete(resourceGroupName, profileName, experimentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "NetworkExperimentProfiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'NetworkExperimentProfiles'.",
                                id)));
        }
        String experimentName = Utils.getValueFromIdByName(id, "Experiments");
        if (experimentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'Experiments'.", id)));
        }
        this.delete(resourceGroupName, profileName, experimentName, context);
    }

    private ExperimentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.FrontDoorManager manager() {
        return this.serviceManager;
    }

    public ExperimentImpl define(String name) {
        return new ExperimentImpl(name, this.manager());
    }
}
