/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.Certificate;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.CertificatePatchResource;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.v2018_02_01.KeyVaultSecretStatus;
import rx.functions.Func1;

class CertificateImpl extends GroupableResourceCoreImpl<Certificate, CertificateInner, CertificateImpl, CertificateRegistrationManager> implements Certificate, Certificate.Definition, Certificate.Update {
    private CertificatePatchResource updateParameter;
    CertificateImpl(String name, CertificateInner inner, CertificateRegistrationManager manager) {
        super(name, inner, manager);
        this.updateParameter = new CertificatePatchResource();
    }

    @Override
    public Observable<Certificate> createResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
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
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
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
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new CertificatePatchResource();
    }

    @Override
    public byte[] cerBlob() {
        return this.inner().cerBlob();
    }

    @Override
    public DateTime expirationDate() {
        return this.inner().expirationDate();
    }

    @Override
    public String friendlyName() {
        return this.inner().friendlyName();
    }

    @Override
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.inner().hostingEnvironmentProfile();
    }

    @Override
    public List<String> hostNames() {
        return this.inner().hostNames();
    }

    @Override
    public DateTime issueDate() {
        return this.inner().issueDate();
    }

    @Override
    public String issuer() {
        return this.inner().issuer();
    }

    @Override
    public String keyVaultId() {
        return this.inner().keyVaultId();
    }

    @Override
    public String keyVaultSecretName() {
        return this.inner().keyVaultSecretName();
    }

    @Override
    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.inner().keyVaultSecretStatus();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String password() {
        return this.inner().password();
    }

    @Override
    public byte[] pfxBlob() {
        return this.inner().pfxBlob();
    }

    @Override
    public String publicKeyHash() {
        return this.inner().publicKeyHash();
    }

    @Override
    public String selfLink() {
        return this.inner().selfLink();
    }

    @Override
    public String serverFarmId() {
        return this.inner().serverFarmId();
    }

    @Override
    public String siteName() {
        return this.inner().siteName();
    }

    @Override
    public String subjectName() {
        return this.inner().subjectName();
    }

    @Override
    public String thumbprint() {
        return this.inner().thumbprint();
    }

    @Override
    public Boolean valid() {
        return this.inner().valid();
    }

    @Override
    public CertificateImpl withPassword(String password) {
        this.inner().withPassword(password);
        return this;
    }

    @Override
    public CertificateImpl withHostNames(List<String> hostNames) {
        if (isInCreateMode()) {
            this.inner().withHostNames(hostNames);
        } else {
            this.updateParameter.withHostNames(hostNames);
        }
        return this;
    }

    @Override
    public CertificateImpl withKeyVaultId(String keyVaultId) {
        if (isInCreateMode()) {
            this.inner().withKeyVaultId(keyVaultId);
        } else {
            this.updateParameter.withKeyVaultId(keyVaultId);
        }
        return this;
    }

    @Override
    public CertificateImpl withKeyVaultSecretName(String keyVaultSecretName) {
        if (isInCreateMode()) {
            this.inner().withKeyVaultSecretName(keyVaultSecretName);
        } else {
            this.updateParameter.withKeyVaultSecretName(keyVaultSecretName);
        }
        return this;
    }

    @Override
    public CertificateImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public CertificateImpl withPfxBlob(byte[] pfxBlob) {
        if (isInCreateMode()) {
            this.inner().withPfxBlob(pfxBlob);
        } else {
            this.updateParameter.withPfxBlob(pfxBlob);
        }
        return this;
    }

    @Override
    public CertificateImpl withServerFarmId(String serverFarmId) {
        if (isInCreateMode()) {
            this.inner().withServerFarmId(serverFarmId);
        } else {
            this.updateParameter.withServerFarmId(serverFarmId);
        }
        return this;
    }

}
