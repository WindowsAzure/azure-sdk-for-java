/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGateways;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGateway;
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
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayBackendHealth;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayBackendHealthOnDemand;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayAvailableWafRuleSetsResult;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayOnDemandProbe;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayAvailableSslOptions;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewaySslPredefinedPolicy;

class ApplicationGatewaysImpl extends GroupableResourcesCoreImpl<ApplicationGateway, ApplicationGatewayImpl, ApplicationGatewayInner, ApplicationGatewaysInner, NetworkManager>  implements ApplicationGateways {
    protected ApplicationGatewaysImpl(NetworkManager manager) {
        super(manager.inner().applicationGateways(), manager);
    }

    @Override
    protected Observable<ApplicationGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        ApplicationGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ApplicationGatewaysInner client = this.inner();
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
    public PagedList<ApplicationGateway> listByResourceGroup(String resourceGroupName) {
        ApplicationGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ApplicationGateway> listByResourceGroupAsync(String resourceGroupName) {
        ApplicationGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ApplicationGatewayInner>, Iterable<ApplicationGatewayInner>>() {
            @Override
            public Iterable<ApplicationGatewayInner> call(Page<ApplicationGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationGatewayInner, ApplicationGateway>() {
            @Override
            public ApplicationGateway call(ApplicationGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ApplicationGateway> list() {
        ApplicationGatewaysInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ApplicationGateway> listAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ApplicationGatewayInner>, Iterable<ApplicationGatewayInner>>() {
            @Override
            public Iterable<ApplicationGatewayInner> call(Page<ApplicationGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationGatewayInner, ApplicationGateway>() {
            @Override
            public ApplicationGateway call(ApplicationGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ApplicationGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable startAsync(String resourceGroupName, String applicationGatewayName) {
        ApplicationGatewaysInner client = this.inner();
        return client.startAsync(resourceGroupName, applicationGatewayName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String applicationGatewayName) {
        ApplicationGatewaysInner client = this.inner();
        return client.stopAsync(resourceGroupName, applicationGatewayName).toCompletable();
    }

    @Override
    public Observable<ApplicationGatewayBackendHealth> backendHealthAsync(String resourceGroupName, String applicationGatewayName) {
        ApplicationGatewaysInner client = this.inner();
        return client.backendHealthAsync(resourceGroupName, applicationGatewayName)
        .map(new Func1<ApplicationGatewayBackendHealthInner, ApplicationGatewayBackendHealth>() {
            @Override
            public ApplicationGatewayBackendHealth call(ApplicationGatewayBackendHealthInner inner) {
                return new ApplicationGatewayBackendHealthImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationGatewayBackendHealthOnDemand> backendHealthOnDemandAsync(String resourceGroupName, String applicationGatewayName, ApplicationGatewayOnDemandProbe probeRequest) {
        ApplicationGatewaysInner client = this.inner();
        return client.backendHealthOnDemandAsync(resourceGroupName, applicationGatewayName, probeRequest)
        .map(new Func1<ApplicationGatewayBackendHealthOnDemandInner, ApplicationGatewayBackendHealthOnDemand>() {
            @Override
            public ApplicationGatewayBackendHealthOnDemand call(ApplicationGatewayBackendHealthOnDemandInner inner) {
                return new ApplicationGatewayBackendHealthOnDemandImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<String> listAvailableServerVariablesAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAvailableServerVariablesAsync()
        .flatMap(new Func1<List<String>, Observable<String>>() {
            @Override
            public Observable<String> call(List<String> innerList) {
                return Observable.from(innerList);
            }
        });}

    @Override
    public Observable<String> listAvailableRequestHeadersAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAvailableRequestHeadersAsync()
        .flatMap(new Func1<List<String>, Observable<String>>() {
            @Override
            public Observable<String> call(List<String> innerList) {
                return Observable.from(innerList);
            }
        });}

    @Override
    public Observable<String> listAvailableResponseHeadersAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAvailableResponseHeadersAsync()
        .flatMap(new Func1<List<String>, Observable<String>>() {
            @Override
            public Observable<String> call(List<String> innerList) {
                return Observable.from(innerList);
            }
        });}

    @Override
    public Observable<ApplicationGatewayAvailableWafRuleSetsResult> listAvailableWafRuleSetsAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAvailableWafRuleSetsAsync()
        .map(new Func1<ApplicationGatewayAvailableWafRuleSetsResultInner, ApplicationGatewayAvailableWafRuleSetsResult>() {
            @Override
            public ApplicationGatewayAvailableWafRuleSetsResult call(ApplicationGatewayAvailableWafRuleSetsResultInner inner) {
                return new ApplicationGatewayAvailableWafRuleSetsResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected ApplicationGatewayImpl wrapModel(ApplicationGatewayInner inner) {
        return  new ApplicationGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected ApplicationGatewayImpl wrapModel(String name) {
        return new ApplicationGatewayImpl(name, new ApplicationGatewayInner(), this.manager());
    }

    @Override
    public Observable<ApplicationGatewayAvailableSslOptions> listAvailableSslOptionsAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAvailableSslOptionsAsync()
        .map(new Func1<ApplicationGatewayAvailableSslOptionsInner, ApplicationGatewayAvailableSslOptions>() {
            @Override
            public ApplicationGatewayAvailableSslOptions call(ApplicationGatewayAvailableSslOptionsInner inner) {
                return new ApplicationGatewayAvailableSslOptionsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationGatewaySslPredefinedPolicy> listAvailableSslPredefinedPoliciesAsync() {
        ApplicationGatewaysInner client = this.inner();
        return client.listAvailableSslPredefinedPoliciesAsync()
        .flatMapIterable(new Func1<Page<ApplicationGatewaySslPredefinedPolicyInner>, Iterable<ApplicationGatewaySslPredefinedPolicyInner>>() {
            @Override
            public Iterable<ApplicationGatewaySslPredefinedPolicyInner> call(Page<ApplicationGatewaySslPredefinedPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationGatewaySslPredefinedPolicyInner, ApplicationGatewaySslPredefinedPolicy>() {
            @Override
            public ApplicationGatewaySslPredefinedPolicy call(ApplicationGatewaySslPredefinedPolicyInner inner) {
                return new ApplicationGatewaySslPredefinedPolicyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationGatewaySslPredefinedPolicy> getSslPredefinedPolicyAsync(String predefinedPolicyName) {
        ApplicationGatewaysInner client = this.inner();
        return client.getSslPredefinedPolicyAsync(predefinedPolicyName)
        .map(new Func1<ApplicationGatewaySslPredefinedPolicyInner, ApplicationGatewaySslPredefinedPolicy>() {
            @Override
            public ApplicationGatewaySslPredefinedPolicy call(ApplicationGatewaySslPredefinedPolicyInner inner) {
                return new ApplicationGatewaySslPredefinedPolicyImpl(inner, manager());
            }
        });
    }

}
