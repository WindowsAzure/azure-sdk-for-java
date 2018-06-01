/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateOrder;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateOrderPatchResource;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificate;
import com.microsoft.azure.management.appservice.v2018_02_01.CertificateProductType;
import com.microsoft.azure.management.appservice.v2018_02_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2018_02_01.CertificateOrderStatus;
import com.microsoft.azure.management.appservice.v2018_02_01.CertificateDetails;
import rx.functions.Func1;

class AppServiceCertificateOrderImpl extends GroupableResourceCoreImpl<AppServiceCertificateOrder, AppServiceCertificateOrderInner, AppServiceCertificateOrderImpl, AppServiceManager> implements AppServiceCertificateOrder, AppServiceCertificateOrder.Definition, AppServiceCertificateOrder.Update {
    private AppServiceCertificateOrderPatchResource updateParameter;
    AppServiceCertificateOrderImpl(String name, AppServiceCertificateOrderInner inner, AppServiceManager manager) {
        super(name, inner, manager);
        this.updateParameter = new AppServiceCertificateOrderPatchResource();
    }

    @Override
    public Observable<AppServiceCertificateOrder> createResourceAsync() {
        AppServiceCertificateOrdersInner client = this.manager().inner().appServiceCertificateOrders();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<AppServiceCertificateOrderInner, AppServiceCertificateOrderInner>() {
               @Override
               public AppServiceCertificateOrderInner call(AppServiceCertificateOrderInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AppServiceCertificateOrder> updateResourceAsync() {
        AppServiceCertificateOrdersInner client = this.manager().inner().appServiceCertificateOrders();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<AppServiceCertificateOrderInner, AppServiceCertificateOrderInner>() {
               @Override
               public AppServiceCertificateOrderInner call(AppServiceCertificateOrderInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AppServiceCertificateOrderInner> getInnerAsync() {
        AppServiceCertificateOrdersInner client = this.manager().inner().appServiceCertificateOrders();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AppServiceCertificateOrderPatchResource();
    }

    @Override
    public List<String> appServiceCertificateNotRenewableReasons() {
        return this.inner().appServiceCertificateNotRenewableReasons();
    }

    @Override
    public Boolean autoRenew() {
        return this.inner().autoRenew();
    }

    @Override
    public Map<String, AppServiceCertificate> certificates() {
        return this.inner().certificates();
    }

    @Override
    public String csr() {
        return this.inner().csr();
    }

    @Override
    public String distinguishedName() {
        return this.inner().distinguishedName();
    }

    @Override
    public String domainVerificationToken() {
        return this.inner().domainVerificationToken();
    }

    @Override
    public DateTime expirationTime() {
        return this.inner().expirationTime();
    }

    @Override
    public CertificateDetails intermediate() {
        return this.inner().intermediate();
    }

    @Override
    public Boolean isPrivateKeyExternal() {
        return this.inner().isPrivateKeyExternal();
    }

    @Override
    public Integer keySize() {
        return this.inner().keySize();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastCertificateIssuanceTime() {
        return this.inner().lastCertificateIssuanceTime();
    }

    @Override
    public DateTime nextAutoRenewalTimeStamp() {
        return this.inner().nextAutoRenewalTimeStamp();
    }

    @Override
    public CertificateProductType productType() {
        return this.inner().productType();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public CertificateDetails root() {
        return this.inner().root();
    }

    @Override
    public String serialNumber() {
        return this.inner().serialNumber();
    }

    @Override
    public CertificateDetails signedCertificate() {
        return this.inner().signedCertificate();
    }

    @Override
    public CertificateOrderStatus status() {
        return this.inner().status();
    }

    @Override
    public Integer validityInYears() {
        return this.inner().validityInYears();
    }

    @Override
    public AppServiceCertificateOrderImpl withProductType(CertificateProductType productType) {
        this.inner().withProductType(productType);
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withAutoRenew(Boolean autoRenew) {
        if (isInCreateMode()) {
            this.inner().withAutoRenew(autoRenew);
        } else {
            this.updateParameter.withAutoRenew(autoRenew);
        }
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withCertificates(Map<String, AppServiceCertificate> certificates) {
        if (isInCreateMode()) {
            this.inner().withCertificates(certificates);
        } else {
            this.updateParameter.withCertificates(certificates);
        }
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withCsr(String csr) {
        if (isInCreateMode()) {
            this.inner().withCsr(csr);
        } else {
            this.updateParameter.withCsr(csr);
        }
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withDistinguishedName(String distinguishedName) {
        if (isInCreateMode()) {
            this.inner().withDistinguishedName(distinguishedName);
        } else {
            this.updateParameter.withDistinguishedName(distinguishedName);
        }
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withKeySize(Integer keySize) {
        if (isInCreateMode()) {
            this.inner().withKeySize(keySize);
        } else {
            this.updateParameter.withKeySize(keySize);
        }
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withValidityInYears(Integer validityInYears) {
        if (isInCreateMode()) {
            this.inner().withValidityInYears(validityInYears);
        } else {
            this.updateParameter.withValidityInYears(validityInYears);
        }
        return this;
    }

}
