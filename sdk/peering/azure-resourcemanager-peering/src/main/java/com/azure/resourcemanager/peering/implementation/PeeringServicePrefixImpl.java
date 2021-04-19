// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeeringServicePrefixInner;
import com.azure.resourcemanager.peering.models.LearnedType;
import com.azure.resourcemanager.peering.models.PeeringServicePrefix;
import com.azure.resourcemanager.peering.models.PeeringServicePrefixEvent;
import com.azure.resourcemanager.peering.models.PrefixValidationState;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PeeringServicePrefixImpl
    implements PeeringServicePrefix, PeeringServicePrefix.Definition, PeeringServicePrefix.Update {
    private PeeringServicePrefixInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String prefix() {
        return this.innerModel().prefix();
    }

    public PrefixValidationState prefixValidationState() {
        return this.innerModel().prefixValidationState();
    }

    public LearnedType learnedType() {
        return this.innerModel().learnedType();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public List<PeeringServicePrefixEvent> events() {
        List<PeeringServicePrefixEvent> inner = this.innerModel().events();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String peeringServicePrefixKey() {
        return this.innerModel().peeringServicePrefixKey();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PeeringServicePrefixInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String peeringServiceName;

    private String prefixName;

    public PeeringServicePrefixImpl withExistingPeeringService(String resourceGroupName, String peeringServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.peeringServiceName = peeringServiceName;
        return this;
    }

    public PeeringServicePrefix create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrefixes()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringServiceName, prefixName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PeeringServicePrefix create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrefixes()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringServiceName, prefixName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PeeringServicePrefixImpl(String name, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = new PeeringServicePrefixInner();
        this.serviceManager = serviceManager;
        this.prefixName = name;
    }

    public PeeringServicePrefixImpl update() {
        return this;
    }

    public PeeringServicePrefix apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrefixes()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringServiceName, prefixName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PeeringServicePrefix apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrefixes()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringServiceName, prefixName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PeeringServicePrefixImpl(
        PeeringServicePrefixInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.peeringServiceName = Utils.getValueFromIdByName(innerObject.id(), "peeringServices");
        this.prefixName = Utils.getValueFromIdByName(innerObject.id(), "prefixes");
    }

    public PeeringServicePrefix refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrefixes()
                .getWithResponse(resourceGroupName, peeringServiceName, prefixName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public PeeringServicePrefix refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrefixes()
                .getWithResponse(resourceGroupName, peeringServiceName, prefixName, localExpand, context)
                .getValue();
        return this;
    }

    public PeeringServicePrefixImpl withPrefix(String prefix) {
        this.innerModel().withPrefix(prefix);
        return this;
    }

    public PeeringServicePrefixImpl withPeeringServicePrefixKey(String peeringServicePrefixKey) {
        this.innerModel().withPeeringServicePrefixKey(peeringServicePrefixKey);
        return this;
    }
}
