// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.ClusterInner;
import com.azure.resourcemanager.loganalytics.models.AssociatedWorkspace;
import com.azure.resourcemanager.loganalytics.models.BillingType;
import com.azure.resourcemanager.loganalytics.models.CapacityReservationProperties;
import com.azure.resourcemanager.loganalytics.models.Cluster;
import com.azure.resourcemanager.loganalytics.models.ClusterEntityStatus;
import com.azure.resourcemanager.loganalytics.models.ClusterPatch;
import com.azure.resourcemanager.loganalytics.models.ClusterSku;
import com.azure.resourcemanager.loganalytics.models.Identity;
import com.azure.resourcemanager.loganalytics.models.KeyVaultProperties;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ClusterImpl implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterInner innerObject;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public ClusterSku sku() {
        return this.innerModel().sku();
    }

    public String clusterId() {
        return this.innerModel().clusterId();
    }

    public ClusterEntityStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean isDoubleEncryptionEnabled() {
        return this.innerModel().isDoubleEncryptionEnabled();
    }

    public Boolean isAvailabilityZonesEnabled() {
        return this.innerModel().isAvailabilityZonesEnabled();
    }

    public BillingType billingType() {
        return this.innerModel().billingType();
    }

    public KeyVaultProperties keyVaultProperties() {
        return this.innerModel().keyVaultProperties();
    }

    public String lastModifiedDate() {
        return this.innerModel().lastModifiedDate();
    }

    public String createdDate() {
        return this.innerModel().createdDate();
    }

    public List<AssociatedWorkspace> associatedWorkspaces() {
        List<AssociatedWorkspace> inner = this.innerModel().associatedWorkspaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CapacityReservationProperties capacityReservationProperties() {
        return this.innerModel().capacityReservationProperties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private ClusterPatch updateParameters;

    public ClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Cluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(resourceGroupName, clusterName, this.innerModel(), Context.NONE);
        return this;
    }

    public Cluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(resourceGroupName, clusterName, this.innerModel(), context);
        return this;
    }

    ClusterImpl(String name, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = new ClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
    }

    public ClusterImpl update() {
        this.updateParameters = new ClusterPatch();
        return this;
    }

    public Cluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .updateWithResponse(resourceGroupName, clusterName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Cluster apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .updateWithResponse(resourceGroupName, clusterName, updateParameters, context)
                .getValue();
        return this;
    }

    ClusterImpl(ClusterInner innerObject, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
    }

    public Cluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE)
                .getValue();
        return this;
    }

    public Cluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, context)
                .getValue();
        return this;
    }

    public ClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ClusterImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ClusterImpl withSku(ClusterSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ClusterImpl withIsDoubleEncryptionEnabled(Boolean isDoubleEncryptionEnabled) {
        this.innerModel().withIsDoubleEncryptionEnabled(isDoubleEncryptionEnabled);
        return this;
    }

    public ClusterImpl withIsAvailabilityZonesEnabled(Boolean isAvailabilityZonesEnabled) {
        this.innerModel().withIsAvailabilityZonesEnabled(isAvailabilityZonesEnabled);
        return this;
    }

    public ClusterImpl withBillingType(BillingType billingType) {
        if (isInCreateMode()) {
            this.innerModel().withBillingType(billingType);
            return this;
        } else {
            this.updateParameters.withBillingType(billingType);
            return this;
        }
    }

    public ClusterImpl withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        if (isInCreateMode()) {
            this.innerModel().withKeyVaultProperties(keyVaultProperties);
            return this;
        } else {
            this.updateParameters.withKeyVaultProperties(keyVaultProperties);
            return this;
        }
    }

    public ClusterImpl withAssociatedWorkspaces(List<AssociatedWorkspace> associatedWorkspaces) {
        this.innerModel().withAssociatedWorkspaces(associatedWorkspaces);
        return this;
    }

    public ClusterImpl withCapacityReservationProperties(CapacityReservationProperties capacityReservationProperties) {
        this.innerModel().withCapacityReservationProperties(capacityReservationProperties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
