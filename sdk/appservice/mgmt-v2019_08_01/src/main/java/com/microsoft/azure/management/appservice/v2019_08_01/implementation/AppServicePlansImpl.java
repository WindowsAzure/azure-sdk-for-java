/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.AppServicePlans;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.appservice.v2019_08_01.AppServicePlan;
import com.microsoft.azure.Page;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.Capability;
import com.microsoft.azure.management.appservice.v2019_08_01.ServerfarmHybridConnection;
import com.microsoft.azure.management.appservice.v2019_08_01.HybridConnectionKey;
import com.microsoft.azure.management.appservice.v2019_08_01.HybridConnectionLimits;
import com.microsoft.azure.management.appservice.v2019_08_01.HybridConnection;
import com.microsoft.azure.management.appservice.v2019_08_01.ServerfarmSite;
import com.microsoft.azure.management.appservice.v2019_08_01.ServerfarmCsmUsageQuota;
import com.microsoft.azure.management.appservice.v2019_08_01.ServerfarmVnetInfo;
import com.microsoft.azure.management.appservice.v2019_08_01.ServerfarmVnetGateway;
import com.microsoft.azure.management.appservice.v2019_08_01.VnetRoute;

class AppServicePlansImpl extends WrapperImpl<AppServicePlansInner> implements AppServicePlans {
    private final AppServiceManager manager;

    AppServicePlansImpl(AppServiceManager manager) {
        super(manager.inner().appServicePlans());
        this.manager = manager;
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public AppServicePlanImpl defineServerfarm(String name) {
        return wrapServerfarmModel(name);
    }

    @Override
    public VnetRouteImpl defineRoute(String name) {
        return wrapRouteModel(name);
    }

    private AppServicePlanImpl wrapServerfarmModel(String name) {
        return new AppServicePlanImpl(name, new AppServicePlanInner(), this.manager());
    }

    private VnetRouteImpl wrapRouteModel(String name) {
        return new VnetRouteImpl(name, this.manager());
    }

    private AppServicePlanImpl wrapAppServicePlanModel(AppServicePlanInner inner) {
        return  new AppServicePlanImpl(inner.name(), inner, manager());
    }

    private CapabilityImpl wrapCapabilityModel(CapabilityInner inner) {
        return  new CapabilityImpl(inner, manager());
    }

    private ServerfarmHybridConnectionImpl wrapServerfarmHybridConnectionModel(HybridConnectionInner inner) {
        return  new ServerfarmHybridConnectionImpl(inner, manager());
    }

    private HybridConnectionImpl wrapHybridConnectionModel(HybridConnectionInner inner) {
        return  new HybridConnectionImpl(inner, manager());
    }

    private ServerfarmSiteImpl wrapServerfarmSiteModel(SiteInner inner) {
        return  new ServerfarmSiteImpl(inner, manager());
    }

    private ServerfarmCsmUsageQuotaImpl wrapServerfarmCsmUsageQuotaModel(CsmUsageQuotaInner inner) {
        return  new ServerfarmCsmUsageQuotaImpl(inner, manager());
    }

    private ServerfarmVnetInfoImpl wrapServerfarmVnetInfoModel(VnetInfoInner inner) {
        return  new ServerfarmVnetInfoImpl(inner, manager());
    }

    private ServerfarmVnetGatewayImpl wrapServerfarmVnetGatewayModel(VnetGatewayInner inner) {
        return  new ServerfarmVnetGatewayImpl(inner, manager());
    }

    private VnetRouteImpl wrapVnetRouteModel(VnetRouteInner inner) {
        return  new VnetRouteImpl(inner, manager());
    }

    private Observable<AppServicePlanInner> getAppServicePlanInnerUsingAppServicePlansInnerAsync(String resourceGroupName, String name) {
        AppServicePlansInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    private Observable<HybridConnectionInner> getHybridConnectionInnerUsingAppServicePlansInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String name = IdParsingUtils.getValueFromIdByName(id, "serverfarms");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "hybridConnectionNamespaces");
        String relayName = IdParsingUtils.getValueFromIdByName(id, "relays");
        AppServicePlansInner client = this.inner();
        return client.getHybridConnectionAsync(resourceGroupName, name, namespaceName, relayName);
    }

    private Observable<VnetInfoInner> getVnetInfoInnerUsingAppServicePlansInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String name = IdParsingUtils.getValueFromIdByName(id, "serverfarms");
        String vnetName = IdParsingUtils.getValueFromIdByName(id, "virtualNetworkConnections");
        AppServicePlansInner client = this.inner();
        return client.getVnetFromServerFarmAsync(resourceGroupName, name, vnetName);
    }

    private Observable<VnetGatewayInner> getVnetGatewayInnerUsingAppServicePlansInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String name = IdParsingUtils.getValueFromIdByName(id, "serverfarms");
        String vnetName = IdParsingUtils.getValueFromIdByName(id, "virtualNetworkConnections");
        String gatewayName = IdParsingUtils.getValueFromIdByName(id, "gateways");
        AppServicePlansInner client = this.inner();
        return client.getVnetGatewayAsync(resourceGroupName, name, vnetName, gatewayName);
    }

    @Override
    public Observable<AppServicePlan> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getAppServicePlanInnerUsingAppServicePlansInnerAsync(resourceGroupName, name).flatMap(new Func1<AppServicePlanInner, Observable<AppServicePlan>> () {
            @Override
            public Observable<AppServicePlan> call(AppServicePlanInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return  Observable.just((AppServicePlan)wrapAppServicePlanModel(inner));
                }
            }
        });
    }

    @Override
    public Observable<AppServicePlan> listByResourceGroupAsync(String resourceGroupName) {
        AppServicePlansInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AppServicePlanInner>, Iterable<AppServicePlanInner>>() {
            @Override
            public Iterable<AppServicePlanInner> call(Page<AppServicePlanInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServicePlanInner, AppServicePlan>() {
            @Override
            public AppServicePlan call(AppServicePlanInner inner) {
                return wrapAppServicePlanModel(inner);
            }
        });
    }

    @Override
    public Observable<AppServicePlan> listAsync() {
        AppServicePlansInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AppServicePlanInner>, Iterable<AppServicePlanInner>>() {
            @Override
            public Iterable<AppServicePlanInner> call(Page<AppServicePlanInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServicePlanInner, AppServicePlan>() {
            @Override
            public AppServicePlan call(AppServicePlanInner inner) {
                return wrapAppServicePlanModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Completable restartWebAppsAsync(String resourceGroupName, String name) {
        AppServicePlansInner client = this.inner();
        return client.restartWebAppsAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<Object> getServerFarmSkusAsync(String resourceGroupName, String name) {
        AppServicePlansInner client = this.inner();
        return client.getServerFarmSkusAsync(resourceGroupName, name)
    ;}

    @Override
    public Observable<Capability> listCapabilitiesAsync(String resourceGroupName, String name) {
        AppServicePlansInner client = this.inner();
        return client.listCapabilitiesAsync(resourceGroupName, name)
        .flatMap(new Func1<List<CapabilityInner>, Observable<CapabilityInner>>() {
            @Override
            public Observable<CapabilityInner> call(List<CapabilityInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CapabilityInner, Capability>() {
            @Override
            public Capability call(CapabilityInner inner) {
                return wrapCapabilityModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerfarmHybridConnection> getHybridConnectionAsync(String resourceGroupName, String name, String namespaceName, String relayName) {
        AppServicePlansInner client = this.inner();
        return client.getHybridConnectionAsync(resourceGroupName, name, namespaceName, relayName)
        .flatMap(new Func1<HybridConnectionInner, Observable<ServerfarmHybridConnection>>() {
            @Override
            public Observable<ServerfarmHybridConnection> call(HybridConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerfarmHybridConnection)wrapServerfarmHybridConnectionModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteHybridConnectionAsync(String resourceGroupName, String name, String namespaceName, String relayName) {
        AppServicePlansInner client = this.inner();
        return client.deleteHybridConnectionAsync(resourceGroupName, name, namespaceName, relayName).toCompletable();
    }

    @Override
    public Observable<HybridConnectionKey> listHybridConnectionKeysAsync(String resourceGroupName, String name, String namespaceName, String relayName) {
        AppServicePlansInner client = this.inner();
        return client.listHybridConnectionKeysAsync(resourceGroupName, name, namespaceName, relayName)
        .map(new Func1<HybridConnectionKeyInner, HybridConnectionKey>() {
            @Override
            public HybridConnectionKey call(HybridConnectionKeyInner inner) {
                return new HybridConnectionKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<String> listWebAppsByHybridConnectionAsync(final String resourceGroupName, final String name, final String namespaceName, final String relayName) {
        AppServicePlansInner client = this.inner();
        return client.listWebAppsByHybridConnectionAsync(resourceGroupName, name, namespaceName, relayName)
        .flatMapIterable(new Func1<Page<String>, Iterable<String>>() {
            @Override
            public Iterable<String> call(Page<String> page) {
                return page.items();
            }
        });
    }

    @Override
    public Observable<HybridConnectionLimits> getHybridConnectionPlanLimitAsync(String resourceGroupName, String name) {
        AppServicePlansInner client = this.inner();
        return client.getHybridConnectionPlanLimitAsync(resourceGroupName, name)
        .map(new Func1<HybridConnectionLimitsInner, HybridConnectionLimits>() {
            @Override
            public HybridConnectionLimits call(HybridConnectionLimitsInner inner) {
                return new HybridConnectionLimitsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<HybridConnection> listHybridConnectionsAsync(final String resourceGroupName, final String name) {
        AppServicePlansInner client = this.inner();
        return client.listHybridConnectionsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<HybridConnectionInner>, Iterable<HybridConnectionInner>>() {
            @Override
            public Iterable<HybridConnectionInner> call(Page<HybridConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<HybridConnectionInner, HybridConnection>() {
            @Override
            public HybridConnection call(HybridConnectionInner inner) {
                return wrapHybridConnectionModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerfarmSite> listWebAppsAsync(final String resourceGroupName, final String name) {
        AppServicePlansInner client = this.inner();
        return client.listWebAppsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<SiteInner>, Iterable<SiteInner>>() {
            @Override
            public Iterable<SiteInner> call(Page<SiteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SiteInner, ServerfarmSite>() {
            @Override
            public ServerfarmSite call(SiteInner inner) {
                return wrapServerfarmSiteModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerfarmCsmUsageQuota> listUsagesAsync(final String resourceGroupName, final String name) {
        AppServicePlansInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<CsmUsageQuotaInner>, Iterable<CsmUsageQuotaInner>>() {
            @Override
            public Iterable<CsmUsageQuotaInner> call(Page<CsmUsageQuotaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CsmUsageQuotaInner, ServerfarmCsmUsageQuota>() {
            @Override
            public ServerfarmCsmUsageQuota call(CsmUsageQuotaInner inner) {
                return wrapServerfarmCsmUsageQuotaModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerfarmVnetInfo> getVnetFromServerFarmAsync(String resourceGroupName, String name, String vnetName) {
        AppServicePlansInner client = this.inner();
        return client.getVnetFromServerFarmAsync(resourceGroupName, name, vnetName)
        .flatMap(new Func1<VnetInfoInner, Observable<ServerfarmVnetInfo>>() {
            @Override
            public Observable<ServerfarmVnetInfo> call(VnetInfoInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerfarmVnetInfo)wrapServerfarmVnetInfoModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<ServerfarmVnetInfo> listVnetsAsync(String resourceGroupName, String name) {
        AppServicePlansInner client = this.inner();
        return client.listVnetsAsync(resourceGroupName, name)
        .flatMap(new Func1<List<VnetInfoInner>, Observable<VnetInfoInner>>() {
            @Override
            public Observable<VnetInfoInner> call(List<VnetInfoInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VnetInfoInner, ServerfarmVnetInfo>() {
            @Override
            public ServerfarmVnetInfo call(VnetInfoInner inner) {
                return wrapServerfarmVnetInfoModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerfarmVnetGateway> getVnetGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName) {
        AppServicePlansInner client = this.inner();
        return client.getVnetGatewayAsync(resourceGroupName, name, vnetName, gatewayName)
        .flatMap(new Func1<VnetGatewayInner, Observable<ServerfarmVnetGateway>>() {
            @Override
            public Observable<ServerfarmVnetGateway> call(VnetGatewayInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerfarmVnetGateway)wrapServerfarmVnetGatewayModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<VnetRoute> listRoutesForVnetAsync(String resourceGroupName, String name, String vnetName) {
        AppServicePlansInner client = this.inner();
        return client.listRoutesForVnetAsync(resourceGroupName, name, vnetName)
        .flatMap(new Func1<List<VnetRouteInner>, Observable<VnetRouteInner>>() {
            @Override
            public Observable<VnetRouteInner> call(List<VnetRouteInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VnetRouteInner, VnetRoute>() {
            @Override
            public VnetRoute call(VnetRouteInner inner) {
                return wrapVnetRouteModel(inner);
            }
        });
    }

    @Override
    public Completable deleteVnetRouteAsync(String resourceGroupName, String name, String vnetName, String routeName) {
        AppServicePlansInner client = this.inner();
        return client.deleteVnetRouteAsync(resourceGroupName, name, vnetName, routeName).toCompletable();
    }

    @Override
    public Observable<VnetRoute> getRouteForVnetAsync(String resourceGroupName, String name, String vnetName, String routeName) {
        AppServicePlansInner client = this.inner();
        return client.getRouteForVnetAsync(resourceGroupName, name, vnetName, routeName)
        .flatMap(new Func1<List<VnetRouteInner>, Observable<VnetRouteInner>>() {
            @Override
            public Observable<VnetRouteInner> call(List<VnetRouteInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VnetRouteInner, VnetRoute>() {
            @Override
            public VnetRoute call(VnetRouteInner inner) {
                return new VnetRouteImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable rebootWorkerAsync(String resourceGroupName, String name, String workerName) {
        AppServicePlansInner client = this.inner();
        return client.rebootWorkerAsync(resourceGroupName, name, workerName).toCompletable();
    }

}
