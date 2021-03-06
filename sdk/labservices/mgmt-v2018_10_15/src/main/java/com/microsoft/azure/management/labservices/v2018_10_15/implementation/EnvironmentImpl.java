/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import com.microsoft.azure.management.labservices.v2018_10_15.Environment;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.labservices.v2018_10_15.EnvironmentFragment;
import java.util.Map;
import com.microsoft.azure.management.labservices.v2018_10_15.ResourceSet;
import com.microsoft.azure.management.labservices.v2018_10_15.NetworkInterface;
import org.joda.time.Period;
import org.joda.time.DateTime;
import com.microsoft.azure.management.labservices.v2018_10_15.LatestOperationResult;
import com.microsoft.azure.management.labservices.v2018_10_15.ResourceSetFragment;
import rx.functions.Func1;

class EnvironmentImpl extends CreatableUpdatableImpl<Environment, EnvironmentInner, EnvironmentImpl> implements Environment, Environment.Definition, Environment.Update {
    private final LabServicesManager manager;
    private String resourceGroupName;
    private String labAccountName;
    private String labName;
    private String environmentSettingName;
    private String environmentName;
    private EnvironmentFragment updateParameter;

    EnvironmentImpl(String name, LabServicesManager manager) {
        super(name, new EnvironmentInner());
        this.manager = manager;
        // Set resource name
        this.environmentName = name;
        //
        this.updateParameter = new EnvironmentFragment();
    }

    EnvironmentImpl(EnvironmentInner inner, LabServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.environmentName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "labaccounts");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.environmentSettingName = IdParsingUtils.getValueFromIdByName(inner.id(), "environmentsettings");
        this.environmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "environments");
        //
        this.updateParameter = new EnvironmentFragment();
    }

    @Override
    public LabServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Environment> createResourceAsync() {
        EnvironmentsInner client = this.manager().inner().environments();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labAccountName, this.labName, this.environmentSettingName, this.environmentName, this.inner())
            .map(new Func1<EnvironmentInner, EnvironmentInner>() {
               @Override
               public EnvironmentInner call(EnvironmentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Environment> updateResourceAsync() {
        EnvironmentsInner client = this.manager().inner().environments();
        return client.updateAsync(this.resourceGroupName, this.labAccountName, this.labName, this.environmentSettingName, this.environmentName, this.updateParameter)
            .map(new Func1<EnvironmentInner, EnvironmentInner>() {
               @Override
               public EnvironmentInner call(EnvironmentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EnvironmentInner> getInnerAsync() {
        EnvironmentsInner client = this.manager().inner().environments();
        return client.getAsync(this.resourceGroupName, this.labAccountName, this.labName, this.environmentSettingName, this.environmentName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new EnvironmentFragment();
    }

    @Override
    public String claimedByUserName() {
        return this.inner().claimedByUserName();
    }

    @Override
    public String claimedByUserObjectId() {
        return this.inner().claimedByUserObjectId();
    }

    @Override
    public String claimedByUserPrincipalId() {
        return this.inner().claimedByUserPrincipalId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isClaimed() {
        return this.inner().isClaimed();
    }

    @Override
    public String lastKnownPowerState() {
        return this.inner().lastKnownPowerState();
    }

    @Override
    public LatestOperationResult latestOperationResult() {
        return this.inner().latestOperationResult();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkInterface networkInterface() {
        return this.inner().networkInterface();
    }

    @Override
    public DateTime passwordLastReset() {
        return this.inner().passwordLastReset();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ResourceSet resourceSets() {
        return this.inner().resourceSets();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Period totalUsage() {
        return this.inner().totalUsage();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public EnvironmentImpl withExistingEnvironmentsetting(String resourceGroupName, String labAccountName, String labName, String environmentSettingName) {
        this.resourceGroupName = resourceGroupName;
        this.labAccountName = labAccountName;
        this.labName = labName;
        this.environmentSettingName = environmentSettingName;
        return this;
    }

    @Override
    public EnvironmentImpl withResourceSets(ResourceSet resourceSets) {
        this.inner().withResourceSets(resourceSets);
        return this;
    }

    @Override
    public EnvironmentImpl withResourceSets(ResourceSetFragment resourceSets) {
        this.updateParameter.withResourceSets(resourceSets);
        return this;
    }

    @Override
    public EnvironmentImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public EnvironmentImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public EnvironmentImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public EnvironmentImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

}
