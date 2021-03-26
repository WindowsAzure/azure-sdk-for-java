// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.models.PrivateLinkScopedResource;
import com.azure.resourcemanager.loganalytics.models.PublicNetworkAccessType;
import com.azure.resourcemanager.loganalytics.models.WorkspaceCapping;
import com.azure.resourcemanager.loganalytics.models.WorkspaceEntityStatus;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The top level Workspace resource container. */
@JsonFlatten
@Fluent
public class WorkspaceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceInner.class);

    /*
     * The ETag of the workspace.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /*
     * The provisioning state of the workspace.
     */
    @JsonProperty(value = "properties.provisioningState")
    private WorkspaceEntityStatus provisioningState;

    /*
     * This is a read-only property. Represents the ID associated with the
     * workspace.
     */
    @JsonProperty(value = "properties.customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /*
     * The SKU of the workspace.
     */
    @JsonProperty(value = "properties.sku")
    private WorkspaceSku sku;

    /*
     * The workspace data retention in days. Allowed values are per pricing
     * plan. See pricing tiers documentation for details.
     */
    @JsonProperty(value = "properties.retentionInDays")
    private Integer retentionInDays;

    /*
     * The daily volume cap for ingestion.
     */
    @JsonProperty(value = "properties.workspaceCapping")
    private WorkspaceCapping workspaceCapping;

    /*
     * Workspace creation date.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private String createdDate;

    /*
     * Workspace modification date.
     */
    @JsonProperty(value = "properties.modifiedDate", access = JsonProperty.Access.WRITE_ONLY)
    private String modifiedDate;

    /*
     * The network access type for accessing Log Analytics ingestion.
     */
    @JsonProperty(value = "properties.publicNetworkAccessForIngestion")
    private PublicNetworkAccessType publicNetworkAccessForIngestion;

    /*
     * The network access type for accessing Log Analytics query.
     */
    @JsonProperty(value = "properties.publicNetworkAccessForQuery")
    private PublicNetworkAccessType publicNetworkAccessForQuery;

    /*
     * Indicates whether customer managed storage is mandatory for query
     * management.
     */
    @JsonProperty(value = "properties.forceCmkForQuery")
    private Boolean forceCmkForQuery;

    /*
     * List of linked private link scope resources.
     */
    @JsonProperty(value = "properties.privateLinkScopedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateLinkScopedResource> privateLinkScopedResources;

    /*
     * Workspace features.
     */
    @JsonProperty(value = "properties.features")
    private Map<String, Object> features;

    /**
     * Get the etag property: The ETag of the workspace.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the workspace.
     *
     * @param etag the etag value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the workspace.
     *
     * @return the provisioningState value.
     */
    public WorkspaceEntityStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the workspace.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withProvisioningState(WorkspaceEntityStatus provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the customerId property: This is a read-only property. Represents the ID associated with the workspace.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the sku property: The SKU of the workspace.
     *
     * @return the sku value.
     */
    public WorkspaceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the workspace.
     *
     * @param sku the sku value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSku(WorkspaceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the retentionInDays property: The workspace data retention in days. Allowed values are per pricing plan. See
     * pricing tiers documentation for details.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays property: The workspace data retention in days. Allowed values are per pricing plan. See
     * pricing tiers documentation for details.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Get the workspaceCapping property: The daily volume cap for ingestion.
     *
     * @return the workspaceCapping value.
     */
    public WorkspaceCapping workspaceCapping() {
        return this.workspaceCapping;
    }

    /**
     * Set the workspaceCapping property: The daily volume cap for ingestion.
     *
     * @param workspaceCapping the workspaceCapping value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withWorkspaceCapping(WorkspaceCapping workspaceCapping) {
        this.workspaceCapping = workspaceCapping;
        return this;
    }

    /**
     * Get the createdDate property: Workspace creation date.
     *
     * @return the createdDate value.
     */
    public String createdDate() {
        return this.createdDate;
    }

    /**
     * Get the modifiedDate property: Workspace modification date.
     *
     * @return the modifiedDate value.
     */
    public String modifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Get the publicNetworkAccessForIngestion property: The network access type for accessing Log Analytics ingestion.
     *
     * @return the publicNetworkAccessForIngestion value.
     */
    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.publicNetworkAccessForIngestion;
    }

    /**
     * Set the publicNetworkAccessForIngestion property: The network access type for accessing Log Analytics ingestion.
     *
     * @param publicNetworkAccessForIngestion the publicNetworkAccessForIngestion value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
        this.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
        return this;
    }

    /**
     * Get the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics query.
     *
     * @return the publicNetworkAccessForQuery value.
     */
    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.publicNetworkAccessForQuery;
    }

    /**
     * Set the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics query.
     *
     * @param publicNetworkAccessForQuery the publicNetworkAccessForQuery value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
        this.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
        return this;
    }

    /**
     * Get the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for query management.
     *
     * @return the forceCmkForQuery value.
     */
    public Boolean forceCmkForQuery() {
        return this.forceCmkForQuery;
    }

    /**
     * Set the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for query management.
     *
     * @param forceCmkForQuery the forceCmkForQuery value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withForceCmkForQuery(Boolean forceCmkForQuery) {
        this.forceCmkForQuery = forceCmkForQuery;
        return this;
    }

    /**
     * Get the privateLinkScopedResources property: List of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value.
     */
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }

    /**
     * Get the features property: Workspace features.
     *
     * @return the features value.
     */
    public Map<String, Object> features() {
        return this.features;
    }

    /**
     * Set the features property: Workspace features.
     *
     * @param features the features value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withFeatures(Map<String, Object> features) {
        this.features = features;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkspaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkspaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (workspaceCapping() != null) {
            workspaceCapping().validate();
        }
        if (privateLinkScopedResources() != null) {
            privateLinkScopedResources().forEach(e -> e.validate());
        }
    }
}
