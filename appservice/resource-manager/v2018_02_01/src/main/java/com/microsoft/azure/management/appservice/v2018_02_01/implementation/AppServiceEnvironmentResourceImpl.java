/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceEnvironmentResource;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceEnvironmentPatchResource;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentStatus;
import com.microsoft.azure.management.appservice.v2018_02_01.VirtualNetworkProfile;
import com.microsoft.azure.management.appservice.v2018_02_01.InternalLoadBalancingMode;
import com.microsoft.azure.management.appservice.v2018_02_01.WorkerPool;
import com.microsoft.azure.management.appservice.v2018_02_01.VirtualIPMapping;
import com.microsoft.azure.management.appservice.v2018_02_01.NetworkAccessControlEntry;
import com.microsoft.azure.management.appservice.v2018_02_01.NameValuePair;
import java.util.ArrayList;
import com.microsoft.azure.management.appservice.v2018_02_01.StampCapacity;
import rx.functions.Func1;

class AppServiceEnvironmentResourceImpl extends GroupableResourceCoreImpl<AppServiceEnvironmentResource, AppServiceEnvironmentResourceInner, AppServiceEnvironmentResourceImpl, AppServiceManager> implements AppServiceEnvironmentResource, AppServiceEnvironmentResource.Definition, AppServiceEnvironmentResource.Update {
    private AppServiceEnvironmentPatchResource updateParameter;
    AppServiceEnvironmentResourceImpl(String name, AppServiceEnvironmentResourceInner inner, AppServiceManager manager) {
        super(name, inner, manager);
        this.updateParameter = new AppServiceEnvironmentPatchResource();
    }

    @Override
    public Observable<AppServiceEnvironmentResource> createResourceAsync() {
        AppServiceEnvironmentsInner client = this.manager().inner().appServiceEnvironments();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<AppServiceEnvironmentResourceInner, AppServiceEnvironmentResourceInner>() {
               @Override
               public AppServiceEnvironmentResourceInner call(AppServiceEnvironmentResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AppServiceEnvironmentResource> updateResourceAsync() {
        AppServiceEnvironmentsInner client = this.manager().inner().appServiceEnvironments();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<AppServiceEnvironmentResourceInner, AppServiceEnvironmentResourceInner>() {
               @Override
               public AppServiceEnvironmentResourceInner call(AppServiceEnvironmentResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AppServiceEnvironmentResourceInner> getInnerAsync() {
        AppServiceEnvironmentsInner client = this.manager().inner().appServiceEnvironments();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AppServiceEnvironmentPatchResource();
    }

    @Override
    public String allowedMultiSizes() {
        return this.inner().allowedMultiSizes();
    }

    @Override
    public String allowedWorkerSizes() {
        return this.inner().allowedWorkerSizes();
    }

    @Override
    public String apiManagementAccountId() {
        return this.inner().apiManagementAccountId();
    }

    @Override
    public String appServiceEnvironmentResourceLocation() {
        return this.inner().appServiceEnvironmentResourceLocation();
    }

    @Override
    public String appServiceEnvironmentResourceName() {
        return this.inner().appServiceEnvironmentResourceName();
    }

    @Override
    public List<NameValuePair> clusterSettings() {
        return this.inner().clusterSettings();
    }

    @Override
    public String databaseEdition() {
        return this.inner().databaseEdition();
    }

    @Override
    public String databaseServiceObjective() {
        return this.inner().databaseServiceObjective();
    }

    @Override
    public Integer defaultFrontEndScaleFactor() {
        return this.inner().defaultFrontEndScaleFactor();
    }

    @Override
    public String dnsSuffix() {
        return this.inner().dnsSuffix();
    }

    @Override
    public Boolean dynamicCacheEnabled() {
        return this.inner().dynamicCacheEnabled();
    }

    @Override
    public List<StampCapacity> environmentCapacities() {
        List<StampCapacity> lst = new ArrayList<StampCapacity>();
        if (this.inner().environmentCapacities() != null) {
            for (StampCapacityInner inner : this.inner().environmentCapacities()) {
                lst.add( new StampCapacityImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public Boolean environmentIsHealthy() {
        return this.inner().environmentIsHealthy();
    }

    @Override
    public String environmentStatus() {
        return this.inner().environmentStatus();
    }

    @Override
    public Integer frontEndScaleFactor() {
        return this.inner().frontEndScaleFactor();
    }

    @Override
    public Boolean hasLinuxWorkers() {
        return this.inner().hasLinuxWorkers();
    }

    @Override
    public InternalLoadBalancingMode internalLoadBalancingMode() {
        return this.inner().internalLoadBalancingMode();
    }

    @Override
    public Integer ipsslAddressCount() {
        return this.inner().ipsslAddressCount();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String lastAction() {
        return this.inner().lastAction();
    }

    @Override
    public String lastActionResult() {
        return this.inner().lastActionResult();
    }

    @Override
    public Integer maximumNumberOfMachines() {
        return this.inner().maximumNumberOfMachines();
    }

    @Override
    public Integer multiRoleCount() {
        return this.inner().multiRoleCount();
    }

    @Override
    public String multiSize() {
        return this.inner().multiSize();
    }

    @Override
    public List<NetworkAccessControlEntry> networkAccessControlList() {
        return this.inner().networkAccessControlList();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public String sslCertKeyVaultId() {
        return this.inner().sslCertKeyVaultId();
    }

    @Override
    public String sslCertKeyVaultSecretName() {
        return this.inner().sslCertKeyVaultSecretName();
    }

    @Override
    public HostingEnvironmentStatus status() {
        return this.inner().status();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public Boolean suspended() {
        return this.inner().suspended();
    }

    @Override
    public Integer upgradeDomains() {
        return this.inner().upgradeDomains();
    }

    @Override
    public List<String> userWhitelistedIpRanges() {
        return this.inner().userWhitelistedIpRanges();
    }

    @Override
    public List<VirtualIPMapping> vipMappings() {
        return this.inner().vipMappings();
    }

    @Override
    public VirtualNetworkProfile virtualNetwork() {
        return this.inner().virtualNetwork();
    }

    @Override
    public String vnetName() {
        return this.inner().vnetName();
    }

    @Override
    public String vnetResourceGroupName() {
        return this.inner().vnetResourceGroupName();
    }

    @Override
    public String vnetSubnetName() {
        return this.inner().vnetSubnetName();
    }

    @Override
    public List<WorkerPool> workerPools() {
        return this.inner().workerPools();
    }

    @Override
    public AppServiceEnvironmentResourceImpl withAppServiceEnvironmentResourceLocation(String appServiceEnvironmentResourceLocation) {
        this.inner().withAppServiceEnvironmentResourceLocation(appServiceEnvironmentResourceLocation);
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withAppServiceEnvironmentResourceName(String appServiceEnvironmentResourceName) {
        this.inner().withAppServiceEnvironmentResourceName(appServiceEnvironmentResourceName);
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.inner().withVirtualNetwork(virtualNetwork);
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withWorkerPools(List<WorkerPool> workerPools) {
        this.inner().withWorkerPools(workerPools);
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withApiManagementAccountId(String apiManagementAccountId) {
        if (isInCreateMode()) {
            this.inner().withApiManagementAccountId(apiManagementAccountId);
        } else {
            this.updateParameter.withApiManagementAccountId(apiManagementAccountId);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withClusterSettings(List<NameValuePair> clusterSettings) {
        if (isInCreateMode()) {
            this.inner().withClusterSettings(clusterSettings);
        } else {
            this.updateParameter.withClusterSettings(clusterSettings);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withDnsSuffix(String dnsSuffix) {
        if (isInCreateMode()) {
            this.inner().withDnsSuffix(dnsSuffix);
        } else {
            this.updateParameter.withDnsSuffix(dnsSuffix);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withDynamicCacheEnabled(Boolean dynamicCacheEnabled) {
        if (isInCreateMode()) {
            this.inner().withDynamicCacheEnabled(dynamicCacheEnabled);
        } else {
            this.updateParameter.withDynamicCacheEnabled(dynamicCacheEnabled);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        if (isInCreateMode()) {
            this.inner().withFrontEndScaleFactor(frontEndScaleFactor);
        } else {
            this.updateParameter.withFrontEndScaleFactor(frontEndScaleFactor);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withHasLinuxWorkers(Boolean hasLinuxWorkers) {
        if (isInCreateMode()) {
            this.inner().withHasLinuxWorkers(hasLinuxWorkers);
        } else {
            this.updateParameter.withHasLinuxWorkers(hasLinuxWorkers);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withInternalLoadBalancingMode(InternalLoadBalancingMode internalLoadBalancingMode) {
        if (isInCreateMode()) {
            this.inner().withInternalLoadBalancingMode(internalLoadBalancingMode);
        } else {
            this.updateParameter.withInternalLoadBalancingMode(internalLoadBalancingMode);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withIpsslAddressCount(Integer ipsslAddressCount) {
        if (isInCreateMode()) {
            this.inner().withIpsslAddressCount(ipsslAddressCount);
        } else {
            this.updateParameter.withIpsslAddressCount(ipsslAddressCount);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withMultiRoleCount(Integer multiRoleCount) {
        if (isInCreateMode()) {
            this.inner().withMultiRoleCount(multiRoleCount);
        } else {
            this.updateParameter.withMultiRoleCount(multiRoleCount);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withMultiSize(String multiSize) {
        if (isInCreateMode()) {
            this.inner().withMultiSize(multiSize);
        } else {
            this.updateParameter.withMultiSize(multiSize);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withNetworkAccessControlList(List<NetworkAccessControlEntry> networkAccessControlList) {
        if (isInCreateMode()) {
            this.inner().withNetworkAccessControlList(networkAccessControlList);
        } else {
            this.updateParameter.withNetworkAccessControlList(networkAccessControlList);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withSslCertKeyVaultId(String sslCertKeyVaultId) {
        if (isInCreateMode()) {
            this.inner().withSslCertKeyVaultId(sslCertKeyVaultId);
        } else {
            this.updateParameter.withSslCertKeyVaultId(sslCertKeyVaultId);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withSslCertKeyVaultSecretName(String sslCertKeyVaultSecretName) {
        if (isInCreateMode()) {
            this.inner().withSslCertKeyVaultSecretName(sslCertKeyVaultSecretName);
        } else {
            this.updateParameter.withSslCertKeyVaultSecretName(sslCertKeyVaultSecretName);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withSuspended(Boolean suspended) {
        if (isInCreateMode()) {
            this.inner().withSuspended(suspended);
        } else {
            this.updateParameter.withSuspended(suspended);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
        if (isInCreateMode()) {
            this.inner().withUserWhitelistedIpRanges(userWhitelistedIpRanges);
        } else {
            this.updateParameter.withUserWhitelistedIpRanges(userWhitelistedIpRanges);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withVnetName(String vnetName) {
        if (isInCreateMode()) {
            this.inner().withVnetName(vnetName);
        } else {
            this.updateParameter.withVnetName(vnetName);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withVnetResourceGroupName(String vnetResourceGroupName) {
        if (isInCreateMode()) {
            this.inner().withVnetResourceGroupName(vnetResourceGroupName);
        } else {
            this.updateParameter.withVnetResourceGroupName(vnetResourceGroupName);
        }
        return this;
    }

    @Override
    public AppServiceEnvironmentResourceImpl withVnetSubnetName(String vnetSubnetName) {
        if (isInCreateMode()) {
            this.inner().withVnetSubnetName(vnetSubnetName);
        } else {
            this.updateParameter.withVnetSubnetName(vnetSubnetName);
        }
        return this;
    }

}
