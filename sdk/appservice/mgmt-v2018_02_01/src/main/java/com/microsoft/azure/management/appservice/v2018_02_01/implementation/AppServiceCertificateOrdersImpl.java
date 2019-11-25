/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateOrders;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateOrder;
import com.microsoft.azure.Page;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.SiteSeal;
import com.microsoft.azure.management.appservice.v2018_02_01.CertificateOrderAction;
import com.microsoft.azure.management.appservice.v2018_02_01.CertificateEmail;
import com.microsoft.azure.management.appservice.v2018_02_01.ReissueCertificateOrderRequest;
import com.microsoft.azure.management.appservice.v2018_02_01.RenewCertificateOrderRequest;
import com.microsoft.azure.management.appservice.v2018_02_01.SiteSealRequest;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateResource;

class AppServiceCertificateOrdersImpl extends WrapperImpl<AppServiceCertificateOrdersInner> implements AppServiceCertificateOrders {
    private final AppServiceManager manager;

    AppServiceCertificateOrdersImpl(AppServiceManager manager) {
        super(manager.inner().appServiceCertificateOrders());
        this.manager = manager;
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public AppServiceCertificateOrderImpl defineCertificateOrder(String name) {
        return wrapCertificateOrderModel(name);
    }

    @Override
    public AppServiceCertificateResourceImpl defineCertificate(String name) {
        return wrapCertificateModel(name);
    }

    private AppServiceCertificateOrderImpl wrapCertificateOrderModel(String name) {
        return new AppServiceCertificateOrderImpl(name, new AppServiceCertificateOrderInner(), this.manager());
    }

    private AppServiceCertificateResourceImpl wrapCertificateModel(String name) {
        return new AppServiceCertificateResourceImpl(name, this.manager());
    }

    private AppServiceCertificateOrderImpl wrapAppServiceCertificateOrderModel(AppServiceCertificateOrderInner inner) {
        return  new AppServiceCertificateOrderImpl(inner.name(), inner, manager());
    }

    private AppServiceCertificateResourceImpl wrapAppServiceCertificateResourceModel(AppServiceCertificateResourceInner inner) {
        return  new AppServiceCertificateResourceImpl(inner, manager());
    }

    private Observable<AppServiceCertificateOrderInner> getAppServiceCertificateOrderInnerUsingAppServiceCertificateOrdersInnerAsync(String resourceGroupName, String name) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    private Observable<AppServiceCertificateResourceInner> getAppServiceCertificateResourceInnerUsingAppServiceCertificateOrdersInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String certificateOrderName = IdParsingUtils.getValueFromIdByName(id, "certificateOrders");
        String name = IdParsingUtils.getValueFromIdByName(id, "certificates");
        AppServiceCertificateOrdersInner client = this.inner();
        return client.getCertificateAsync(resourceGroupName, certificateOrderName, name);
    }

    @Override
    public Observable<AppServiceCertificateOrder> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getAppServiceCertificateOrderInnerUsingAppServiceCertificateOrdersInnerAsync(resourceGroupName, name).map(new Func1<AppServiceCertificateOrderInner, AppServiceCertificateOrder> () {
            @Override
            public AppServiceCertificateOrder call(AppServiceCertificateOrderInner inner) {
                return wrapAppServiceCertificateOrderModel(inner);
            }
        });
    }

    @Override
    public Observable<AppServiceCertificateOrder> listByResourceGroupAsync(String resourceGroupName) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AppServiceCertificateOrderInner>, Iterable<AppServiceCertificateOrderInner>>() {
            @Override
            public Iterable<AppServiceCertificateOrderInner> call(Page<AppServiceCertificateOrderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServiceCertificateOrderInner, AppServiceCertificateOrder>() {
            @Override
            public AppServiceCertificateOrder call(AppServiceCertificateOrderInner inner) {
                return wrapAppServiceCertificateOrderModel(inner);
            }
        });
    }

    @Override
    public Observable<AppServiceCertificateOrder> listAsync() {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AppServiceCertificateOrderInner>, Iterable<AppServiceCertificateOrderInner>>() {
            @Override
            public Iterable<AppServiceCertificateOrderInner> call(Page<AppServiceCertificateOrderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServiceCertificateOrderInner, AppServiceCertificateOrder>() {
            @Override
            public AppServiceCertificateOrder call(AppServiceCertificateOrderInner inner) {
                return wrapAppServiceCertificateOrderModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Completable reissueAsync(String resourceGroupName, String certificateOrderName, ReissueCertificateOrderRequest reissueCertificateOrderRequest) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.reissueAsync(resourceGroupName, certificateOrderName, reissueCertificateOrderRequest).toCompletable();
    }

    @Override
    public Completable renewAsync(String resourceGroupName, String certificateOrderName, RenewCertificateOrderRequest renewCertificateOrderRequest) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.renewAsync(resourceGroupName, certificateOrderName, renewCertificateOrderRequest).toCompletable();
    }

    @Override
    public Completable resendEmailAsync(String resourceGroupName, String certificateOrderName) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.resendEmailAsync(resourceGroupName, certificateOrderName).toCompletable();
    }

    @Override
    public Completable resendRequestEmailsAsync(String resourceGroupName, String certificateOrderName) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.resendRequestEmailsAsync(resourceGroupName, certificateOrderName).toCompletable();
    }

    @Override
    public Observable<SiteSeal> retrieveSiteSealAsync(String resourceGroupName, String certificateOrderName, SiteSealRequest siteSealRequest) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.retrieveSiteSealAsync(resourceGroupName, certificateOrderName, siteSealRequest)
        .map(new Func1<SiteSealInner, SiteSeal>() {
            @Override
            public SiteSeal call(SiteSealInner inner) {
                return new SiteSealImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable verifyDomainOwnershipAsync(String resourceGroupName, String certificateOrderName) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.verifyDomainOwnershipAsync(resourceGroupName, certificateOrderName).toCompletable();
    }

    @Override
    public Observable<CertificateOrderAction> retrieveCertificateActionsAsync(String resourceGroupName, String name) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.retrieveCertificateActionsAsync(resourceGroupName, name)
        .flatMap(new Func1<List<CertificateOrderActionInner>, Observable<CertificateOrderActionInner>>() {
            @Override
            public Observable<CertificateOrderActionInner> call(List<CertificateOrderActionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CertificateOrderActionInner, CertificateOrderAction>() {
            @Override
            public CertificateOrderAction call(CertificateOrderActionInner inner) {
                return new CertificateOrderActionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CertificateEmail> retrieveCertificateEmailHistoryAsync(String resourceGroupName, String name) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.retrieveCertificateEmailHistoryAsync(resourceGroupName, name)
        .flatMap(new Func1<List<CertificateEmailInner>, Observable<CertificateEmailInner>>() {
            @Override
            public Observable<CertificateEmailInner> call(List<CertificateEmailInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CertificateEmailInner, CertificateEmail>() {
            @Override
            public CertificateEmail call(CertificateEmailInner inner) {
                return new CertificateEmailImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable validatePurchaseInformationAsync(AppServiceCertificateOrderInner appServiceCertificateOrder) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.validatePurchaseInformationAsync(appServiceCertificateOrder).toCompletable();
    }

    @Override
    public Observable<AppServiceCertificateResource> getCertificateAsync(String resourceGroupName, String certificateOrderName, String name) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.getCertificateAsync(resourceGroupName, certificateOrderName, name)
        .map(new Func1<AppServiceCertificateResourceInner, AppServiceCertificateResource>() {
            @Override
            public AppServiceCertificateResource call(AppServiceCertificateResourceInner inner) {
                return wrapAppServiceCertificateResourceModel(inner);
            }
       });
    }

    @Override
    public Observable<AppServiceCertificateResource> listCertificatesAsync(final String resourceGroupName, final String certificateOrderName) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.listCertificatesAsync(resourceGroupName, certificateOrderName)
        .flatMapIterable(new Func1<Page<AppServiceCertificateResourceInner>, Iterable<AppServiceCertificateResourceInner>>() {
            @Override
            public Iterable<AppServiceCertificateResourceInner> call(Page<AppServiceCertificateResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServiceCertificateResourceInner, AppServiceCertificateResource>() {
            @Override
            public AppServiceCertificateResource call(AppServiceCertificateResourceInner inner) {
                return wrapAppServiceCertificateResourceModel(inner);
            }
        });
    }

    @Override
    public Completable deleteCertificateAsync(String resourceGroupName, String certificateOrderName, String name) {
        AppServiceCertificateOrdersInner client = this.inner();
        return client.deleteCertificateAsync(resourceGroupName, certificateOrderName, name).toCompletable();
    }

}
