// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.confluent.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.confluent.models.OfferDetail;
import com.azure.resourcemanager.confluent.models.OrganizationResource;
import com.azure.resourcemanager.confluent.models.OrganizationResourceUpdate;
import com.azure.resourcemanager.confluent.models.ProvisionState;
import com.azure.resourcemanager.confluent.models.UserDetail;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class OrganizationResourceImpl
    implements OrganizationResource, OrganizationResource.Definition, OrganizationResource.Update {
    private OrganizationResourceInner innerObject;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public ProvisionState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String organizationId() {
        return this.innerModel().organizationId();
    }

    public String ssoUrl() {
        return this.innerModel().ssoUrl();
    }

    public OfferDetail offerDetail() {
        return this.innerModel().offerDetail();
    }

    public UserDetail userDetail() {
        return this.innerModel().userDetail();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public OrganizationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String organizationName;

    private OrganizationResourceUpdate updateBody;

    public OrganizationResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public OrganizationResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrganizations()
                .create(resourceGroupName, organizationName, this.innerModel(), Context.NONE);
        return this;
    }

    public OrganizationResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrganizations()
                .create(resourceGroupName, organizationName, this.innerModel(), context);
        return this;
    }

    OrganizationResourceImpl(String name, com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerObject = new OrganizationResourceInner();
        this.serviceManager = serviceManager;
        this.organizationName = name;
    }

    public OrganizationResourceImpl update() {
        this.updateBody = new OrganizationResourceUpdate();
        return this;
    }

    public OrganizationResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrganizations()
                .updateWithResponse(resourceGroupName, organizationName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public OrganizationResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrganizations()
                .updateWithResponse(resourceGroupName, organizationName, updateBody, context)
                .getValue();
        return this;
    }

    OrganizationResourceImpl(
        OrganizationResourceInner innerObject, com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.organizationName = Utils.getValueFromIdByName(innerObject.id(), "organizations");
    }

    public OrganizationResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrganizations()
                .getByResourceGroupWithResponse(resourceGroupName, organizationName, Context.NONE)
                .getValue();
        return this;
    }

    public OrganizationResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrganizations()
                .getByResourceGroupWithResponse(resourceGroupName, organizationName, context)
                .getValue();
        return this;
    }

    public OrganizationResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public OrganizationResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public OrganizationResourceImpl withOfferDetail(OfferDetail offerDetail) {
        this.innerModel().withOfferDetail(offerDetail);
        return this;
    }

    public OrganizationResourceImpl withUserDetail(UserDetail userDetail) {
        this.innerModel().withUserDetail(userDetail);
        return this;
    }

    public OrganizationResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
