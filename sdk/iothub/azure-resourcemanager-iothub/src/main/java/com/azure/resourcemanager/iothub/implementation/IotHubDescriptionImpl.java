// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.fluent.models.IotHubDescriptionInner;
import com.azure.resourcemanager.iothub.models.ExportDevicesRequest;
import com.azure.resourcemanager.iothub.models.ImportDevicesRequest;
import com.azure.resourcemanager.iothub.models.IotHubDescription;
import com.azure.resourcemanager.iothub.models.IotHubProperties;
import com.azure.resourcemanager.iothub.models.IotHubSkuInfo;
import com.azure.resourcemanager.iothub.models.JobResponse;
import com.azure.resourcemanager.iothub.models.SharedAccessSignatureAuthorizationRule;
import com.azure.resourcemanager.iothub.models.TagsResource;
import java.util.Collections;
import java.util.Map;

public final class IotHubDescriptionImpl
    implements IotHubDescription, IotHubDescription.Definition, IotHubDescription.Update {
    private IotHubDescriptionInner innerObject;

    private final com.azure.resourcemanager.iothub.IotHubManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public IotHubProperties properties() {
        return this.innerModel().properties();
    }

    public IotHubSkuInfo sku() {
        return this.innerModel().sku();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public IotHubDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iothub.IotHubManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String createIfMatch;

    private TagsResource updateIotHubTags;

    public IotHubDescriptionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public IotHubDescription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotHubResources()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), createIfMatch, Context.NONE);
        return this;
    }

    public IotHubDescription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotHubResources()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), createIfMatch, context);
        return this;
    }

    IotHubDescriptionImpl(String name, com.azure.resourcemanager.iothub.IotHubManager serviceManager) {
        this.innerObject = new IotHubDescriptionInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
        this.createIfMatch = null;
    }

    public IotHubDescriptionImpl update() {
        this.updateIotHubTags = new TagsResource();
        return this;
    }

    public IotHubDescription apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotHubResources()
                .update(resourceGroupName, resourceName, updateIotHubTags, Context.NONE);
        return this;
    }

    public IotHubDescription apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotHubResources()
                .update(resourceGroupName, resourceName, updateIotHubTags, context);
        return this;
    }

    IotHubDescriptionImpl(
        IotHubDescriptionInner innerObject, com.azure.resourcemanager.iothub.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "IotHubs");
    }

    public IotHubDescription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotHubResources()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public IotHubDescription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotHubResources()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys() {
        return serviceManager.iotHubResources().listKeys(resourceGroupName, resourceName);
    }

    public PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(Context context) {
        return serviceManager.iotHubResources().listKeys(resourceGroupName, resourceName, context);
    }

    public JobResponse exportDevices(ExportDevicesRequest exportDevicesParameters) {
        return serviceManager.iotHubResources().exportDevices(resourceGroupName, resourceName, exportDevicesParameters);
    }

    public Response<JobResponse> exportDevicesWithResponse(
        ExportDevicesRequest exportDevicesParameters, Context context) {
        return serviceManager
            .iotHubResources()
            .exportDevicesWithResponse(resourceGroupName, resourceName, exportDevicesParameters, context);
    }

    public JobResponse importDevices(ImportDevicesRequest importDevicesParameters) {
        return serviceManager.iotHubResources().importDevices(resourceGroupName, resourceName, importDevicesParameters);
    }

    public Response<JobResponse> importDevicesWithResponse(
        ImportDevicesRequest importDevicesParameters, Context context) {
        return serviceManager
            .iotHubResources()
            .importDevicesWithResponse(resourceGroupName, resourceName, importDevicesParameters, context);
    }

    public IotHubDescriptionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IotHubDescriptionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IotHubDescriptionImpl withSku(IotHubSkuInfo sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public IotHubDescriptionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateIotHubTags.withTags(tags);
            return this;
        }
    }

    public IotHubDescriptionImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public IotHubDescriptionImpl withProperties(IotHubProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public IotHubDescriptionImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
