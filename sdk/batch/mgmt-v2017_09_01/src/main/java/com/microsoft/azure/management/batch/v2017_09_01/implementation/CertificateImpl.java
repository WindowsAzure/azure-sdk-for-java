/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01.implementation;

import com.microsoft.azure.management.batch.v2017_09_01.Certificate;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.batch.v2017_09_01.CertificateCreateOrUpdateParameters;
import com.microsoft.azure.management.batch.v2017_09_01.DeleteCertificateError;
import com.microsoft.azure.management.batch.v2017_09_01.CertificateFormat;
import com.microsoft.azure.management.batch.v2017_09_01.CertificateProvisioningState;
import org.joda.time.DateTime;
import rx.functions.Func1;

class CertificateImpl extends CreatableUpdatableImpl<Certificate, CertificateInner, CertificateImpl> implements Certificate, Certificate.Definition, Certificate.Update {
    private final BatchManager manager;
    private String resourceGroupName;
    private String accountName;
    private String certificateName;
    private String cifMatch;
    private String cifNoneMatch;
    private String uifMatch;
    private CertificateCreateOrUpdateParameters createOrUpdateParameter;

    CertificateImpl(String name, BatchManager manager) {
        super(name, new CertificateInner());
        this.manager = manager;
        // Set resource name
        this.certificateName = name;
        //
        this.createOrUpdateParameter = new CertificateCreateOrUpdateParameters();
    }

    CertificateImpl(CertificateInner inner, BatchManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.certificateName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "batchAccounts");
        this.certificateName = IdParsingUtils.getValueFromIdByName(inner.id(), "certificates");
        //
        this.createOrUpdateParameter = new CertificateCreateOrUpdateParameters();
    }

    @Override
    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Certificate> createResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createAsync(this.resourceGroupName, this.accountName, this.certificateName, this.createOrUpdateParameter, this.cifMatch, this.cifNoneMatch)
            .map(new Func1<CertificateInner, CertificateInner>() {
               @Override
               public CertificateInner call(CertificateInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Certificate> updateResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.certificateName, this.createOrUpdateParameter, this.uifMatch)
            .map(new Func1<CertificateInner, CertificateInner>() {
               @Override
               public CertificateInner call(CertificateInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CertificateInner> getInnerAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.getAsync(this.resourceGroupName, this.accountName, this.certificateName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new CertificateCreateOrUpdateParameters();
    }

    @Override
    public DeleteCertificateError deleteCertificateError() {
        return this.inner().deleteCertificateError();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public CertificateFormat format() {
        return this.inner().format();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CertificateProvisioningState previousProvisioningState() {
        return this.inner().previousProvisioningState();
    }

    @Override
    public DateTime previousProvisioningStateTransitionTime() {
        return this.inner().previousProvisioningStateTransitionTime();
    }

    @Override
    public CertificateProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime provisioningStateTransitionTime() {
        return this.inner().provisioningStateTransitionTime();
    }

    @Override
    public String publicData() {
        return this.inner().publicData();
    }

    @Override
    public String thumbprint() {
        return this.inner().thumbprint();
    }

    @Override
    public String thumbprintAlgorithm() {
        return this.inner().thumbprintAlgorithm();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CertificateImpl withExistingBatchAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public CertificateImpl withIfNoneMatch(String ifNoneMatch) {
        this.cifNoneMatch = ifNoneMatch;
        return this;
    }

    @Override
    public CertificateImpl withData(String data) {
        this.createOrUpdateParameter.withData(data);
        return this;
    }

    @Override
    public CertificateImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public CertificateImpl withFormat(CertificateFormat format) {
        this.createOrUpdateParameter.withFormat(format);
        return this;
    }

    @Override
    public CertificateImpl withPassword(String password) {
        this.createOrUpdateParameter.withPassword(password);
        return this;
    }

    @Override
    public CertificateImpl withThumbprint(String thumbprint) {
        this.createOrUpdateParameter.withThumbprint(thumbprint);
        return this;
    }

    @Override
    public CertificateImpl withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.createOrUpdateParameter.withThumbprintAlgorithm(thumbprintAlgorithm);
        return this;
    }

}
