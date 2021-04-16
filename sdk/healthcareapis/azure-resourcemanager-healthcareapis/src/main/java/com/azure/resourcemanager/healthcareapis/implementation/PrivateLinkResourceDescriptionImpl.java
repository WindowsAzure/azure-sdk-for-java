// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.healthcareapis.fluent.models.PrivateLinkResourceDescriptionInner;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkResourceDescription;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkResourceDescriptionImpl implements PrivateLinkResourceDescription {
    private PrivateLinkResourceDescriptionInner innerObject;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    PrivateLinkResourceDescriptionImpl(
        PrivateLinkResourceDescriptionInner innerObject,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String groupId() {
        return this.innerModel().groupId();
    }

    public List<String> requiredMembers() {
        List<String> inner = this.innerModel().requiredMembers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> requiredZoneNames() {
        List<String> inner = this.innerModel().requiredZoneNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PrivateLinkResourceDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }
}
