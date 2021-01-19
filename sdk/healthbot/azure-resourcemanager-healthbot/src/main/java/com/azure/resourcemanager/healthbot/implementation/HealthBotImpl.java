// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.healthbot.HealthbotManager;
import com.azure.resourcemanager.healthbot.fluent.models.HealthBotInner;
import com.azure.resourcemanager.healthbot.models.HealthBot;
import com.azure.resourcemanager.healthbot.models.HealthBotProperties;
import com.azure.resourcemanager.healthbot.models.HealthBotUpdateParameters;
import com.azure.resourcemanager.healthbot.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class HealthBotImpl implements HealthBot, HealthBot.Definition, HealthBot.Update {
    private HealthBotInner innerObject;

    private final HealthbotManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public HealthBotProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public HealthBotInner innerModel() {
        return this.innerObject;
    }

    private HealthbotManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String botName;

    private HealthBotUpdateParameters updateParameters;

    public HealthBotImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public HealthBot create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBots()
                .create(resourceGroupName, botName, this.innerModel(), Context.NONE);
        return this;
    }

    public HealthBot create(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getBots().create(resourceGroupName, botName, this.innerModel(), context);
        return this;
    }

    HealthBotImpl(String name, HealthbotManager serviceManager) {
        this.innerObject = new HealthBotInner();
        this.serviceManager = serviceManager;
        this.botName = name;
    }

    public HealthBotImpl update() {
        this.updateParameters = new HealthBotUpdateParameters();
        return this;
    }

    public HealthBot apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBots()
                .updateWithResponse(resourceGroupName, botName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public HealthBot apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBots()
                .updateWithResponse(resourceGroupName, botName, updateParameters, context)
                .getValue();
        return this;
    }

    HealthBotImpl(HealthBotInner innerObject, HealthbotManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.botName = Utils.getValueFromIdByName(innerObject.id(), "healthBots");
    }

    public HealthBot refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBots()
                .getByResourceGroupWithResponse(resourceGroupName, botName, Context.NONE)
                .getValue();
        return this;
    }

    public HealthBot refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBots()
                .getByResourceGroupWithResponse(resourceGroupName, botName, context)
                .getValue();
        return this;
    }

    public HealthBotImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public HealthBotImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public HealthBotImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public HealthBotImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public HealthBotImpl withProperties(HealthBotProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
