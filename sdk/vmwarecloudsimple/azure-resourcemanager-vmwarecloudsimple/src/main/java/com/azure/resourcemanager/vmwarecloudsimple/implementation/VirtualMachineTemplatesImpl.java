// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.VirtualMachineTemplatesClient;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualMachineTemplateInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualMachineTemplate;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualMachineTemplates;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualMachineTemplatesImpl implements VirtualMachineTemplates {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineTemplatesImpl.class);

    private final VirtualMachineTemplatesClient innerClient;

    private final com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager;

    public VirtualMachineTemplatesImpl(
        VirtualMachineTemplatesClient innerClient,
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VirtualMachineTemplate> list(String pcName, String regionId, String resourcePoolName) {
        PagedIterable<VirtualMachineTemplateInner> inner =
            this.serviceClient().list(pcName, regionId, resourcePoolName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineTemplate> list(
        String pcName, String regionId, String resourcePoolName, Context context) {
        PagedIterable<VirtualMachineTemplateInner> inner =
            this.serviceClient().list(pcName, regionId, resourcePoolName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineTemplateImpl(inner1, this.manager()));
    }

    public VirtualMachineTemplate get(String regionId, String pcName, String virtualMachineTemplateName) {
        VirtualMachineTemplateInner inner = this.serviceClient().get(regionId, pcName, virtualMachineTemplateName);
        if (inner != null) {
            return new VirtualMachineTemplateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineTemplate> getWithResponse(
        String regionId, String pcName, String virtualMachineTemplateName, Context context) {
        Response<VirtualMachineTemplateInner> inner =
            this.serviceClient().getWithResponse(regionId, pcName, virtualMachineTemplateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineTemplateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VirtualMachineTemplatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager() {
        return this.serviceManager;
    }
}
