/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.containerservice.v2020_01_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.containerservice.v2020_01_01.ManagedClusters;
import com.microsoft.azure.management.containerservice.v2020_01_01.ManagedCluster;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerservice.v2020_01_01.CredentialResults;
import com.microsoft.azure.management.containerservice.v2020_01_01.ManagedClusterServicePrincipalProfile;
import com.microsoft.azure.management.containerservice.v2020_01_01.ManagedClusterAADProfile;
import com.microsoft.azure.management.containerservice.v2020_01_01.ManagedClusterUpgradeProfile;
import com.microsoft.azure.management.containerservice.v2020_01_01.ManagedClusterAccessProfile;

class ManagedClustersImpl extends GroupableResourcesCoreImpl<ManagedCluster, ManagedClusterImpl, ManagedClusterInner, ManagedClustersInner, ContainerServiceManager>  implements ManagedClusters {
    protected ManagedClustersImpl(ContainerServiceManager manager) {
        super(manager.inner().managedClusters(), manager);
    }

    @Override
    protected Observable<ManagedClusterInner> getInnerAsync(String resourceGroupName, String name) {
        ManagedClustersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ManagedClustersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ManagedCluster> listByResourceGroup(String resourceGroupName) {
        ManagedClustersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ManagedCluster> listByResourceGroupAsync(String resourceGroupName) {
        ManagedClustersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ManagedClusterInner>, Iterable<ManagedClusterInner>>() {
            @Override
            public Iterable<ManagedClusterInner> call(Page<ManagedClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedClusterInner, ManagedCluster>() {
            @Override
            public ManagedCluster call(ManagedClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ManagedCluster> list() {
        ManagedClustersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ManagedCluster> listAsync() {
        ManagedClustersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ManagedClusterInner>, Iterable<ManagedClusterInner>>() {
            @Override
            public Iterable<ManagedClusterInner> call(Page<ManagedClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedClusterInner, ManagedCluster>() {
            @Override
            public ManagedCluster call(ManagedClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ManagedClusterImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CredentialResults> listClusterAdminCredentialsAsync(String resourceGroupName, String resourceName) {
        ManagedClustersInner client = this.inner();
        return client.listClusterAdminCredentialsAsync(resourceGroupName, resourceName)
        .map(new Func1<CredentialResultsInner, CredentialResults>() {
            @Override
            public CredentialResults call(CredentialResultsInner inner) {
                return new CredentialResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CredentialResults> listClusterUserCredentialsAsync(String resourceGroupName, String resourceName) {
        ManagedClustersInner client = this.inner();
        return client.listClusterUserCredentialsAsync(resourceGroupName, resourceName)
        .map(new Func1<CredentialResultsInner, CredentialResults>() {
            @Override
            public CredentialResults call(CredentialResultsInner inner) {
                return new CredentialResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable resetServicePrincipalProfileAsync(String resourceGroupName, String resourceName, ManagedClusterServicePrincipalProfile parameters) {
        ManagedClustersInner client = this.inner();
        return client.resetServicePrincipalProfileAsync(resourceGroupName, resourceName, parameters).toCompletable();
    }

    @Override
    public Completable resetAADProfileAsync(String resourceGroupName, String resourceName, ManagedClusterAADProfile parameters) {
        ManagedClustersInner client = this.inner();
        return client.resetAADProfileAsync(resourceGroupName, resourceName, parameters).toCompletable();
    }

    @Override
    public Completable rotateClusterCertificatesAsync(String resourceGroupName, String resourceName) {
        ManagedClustersInner client = this.inner();
        return client.rotateClusterCertificatesAsync(resourceGroupName, resourceName).toCompletable();
    }

    @Override
    protected ManagedClusterImpl wrapModel(ManagedClusterInner inner) {
        return  new ManagedClusterImpl(inner.name(), inner, manager());
    }

    @Override
    protected ManagedClusterImpl wrapModel(String name) {
        return new ManagedClusterImpl(name, new ManagedClusterInner(), this.manager());
    }

    @Override
    public Observable<ManagedClusterUpgradeProfile> getUpgradeProfileAsync(String resourceGroupName, String resourceName) {
        ManagedClustersInner client = this.inner();
        return client.getUpgradeProfileAsync(resourceGroupName, resourceName)
        .map(new Func1<ManagedClusterUpgradeProfileInner, ManagedClusterUpgradeProfile>() {
            @Override
            public ManagedClusterUpgradeProfile call(ManagedClusterUpgradeProfileInner inner) {
                return new ManagedClusterUpgradeProfileImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ManagedClusterAccessProfile> getAccessProfileAsync(String resourceGroupName, String resourceName, String roleName) {
        ManagedClustersInner client = this.inner();
        return client.getAccessProfileAsync(resourceGroupName, resourceName, roleName)
        .map(new Func1<ManagedClusterAccessProfileInner, ManagedClusterAccessProfile>() {
            @Override
            public ManagedClusterAccessProfile call(ManagedClusterAccessProfileInner inner) {
                return new ManagedClusterAccessProfileImpl(inner, manager());
            }
        });
    }

}
