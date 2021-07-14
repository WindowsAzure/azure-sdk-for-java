// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The ResourceProviderManifestPropertiesManagement model. */
@Fluent
public final class ResourceProviderManifestPropertiesManagement extends ResourceProviderManagement {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ResourceProviderManifestPropertiesManagement.class);

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withSchemaOwners(List<String> schemaOwners) {
        super.withSchemaOwners(schemaOwners);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withManifestOwners(List<String> manifestOwners) {
        super.withManifestOwners(manifestOwners);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withIncidentRoutingService(String incidentRoutingService) {
        super.withIncidentRoutingService(incidentRoutingService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withIncidentRoutingTeam(String incidentRoutingTeam) {
        super.withIncidentRoutingTeam(incidentRoutingTeam);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withIncidentContactEmail(String incidentContactEmail) {
        super.withIncidentContactEmail(incidentContactEmail);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withServiceTreeInfos(List<ServiceTreeInfo> serviceTreeInfos) {
        super.withServiceTreeInfos(serviceTreeInfos);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withResourceAccessPolicy(
        ResourceProviderManagementResourceAccessPolicy resourceAccessPolicy) {
        super.withResourceAccessPolicy(resourceAccessPolicy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesManagement withResourceAccessRoles(List<Object> resourceAccessRoles) {
        super.withResourceAccessRoles(resourceAccessRoles);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
