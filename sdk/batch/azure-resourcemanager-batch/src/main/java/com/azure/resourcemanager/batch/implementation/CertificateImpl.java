// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.CertificateInner;
import com.azure.resourcemanager.batch.models.Certificate;
import com.azure.resourcemanager.batch.models.CertificateCreateOrUpdateParameters;
import com.azure.resourcemanager.batch.models.CertificateFormat;
import com.azure.resourcemanager.batch.models.CertificateProvisioningState;
import com.azure.resourcemanager.batch.models.DeleteCertificateError;
import java.time.OffsetDateTime;

public final class CertificateImpl implements Certificate, Certificate.Definition, Certificate.Update {
    private CertificateInner innerObject;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String thumbprintAlgorithm() {
        return this.innerModel().thumbprintAlgorithm();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public CertificateFormat format() {
        return this.innerModel().format();
    }

    public CertificateProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime provisioningStateTransitionTime() {
        return this.innerModel().provisioningStateTransitionTime();
    }

    public CertificateProvisioningState previousProvisioningState() {
        return this.innerModel().previousProvisioningState();
    }

    public OffsetDateTime previousProvisioningStateTransitionTime() {
        return this.innerModel().previousProvisioningStateTransitionTime();
    }

    public String publicData() {
        return this.innerModel().publicData();
    }

    public DeleteCertificateError deleteCertificateError() {
        return this.innerModel().deleteCertificateError();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public CertificateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String certificateName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private CertificateCreateOrUpdateParameters createParameters;

    private String updateIfMatch;

    private CertificateCreateOrUpdateParameters updateParameters;

    public CertificateImpl withExistingBatchAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Certificate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createWithResponse(
                    resourceGroupName,
                    accountName,
                    certificateName,
                    createParameters,
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public Certificate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createWithResponse(
                    resourceGroupName,
                    accountName,
                    certificateName,
                    createParameters,
                    createIfMatch,
                    createIfNoneMatch,
                    context)
                .getValue();
        return this;
    }

    CertificateImpl(String name, com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerObject = new CertificateInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
        this.createParameters = new CertificateCreateOrUpdateParameters();
    }

    public CertificateImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new CertificateCreateOrUpdateParameters();
        return this;
    }

    public Certificate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .updateWithResponse(
                    resourceGroupName, accountName, certificateName, updateParameters, updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .updateWithResponse(
                    resourceGroupName, accountName, certificateName, updateParameters, updateIfMatch, context)
                .getValue();
        return this;
    }

    CertificateImpl(CertificateInner innerObject, com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "batchAccounts");
        this.certificateName = Utils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public Certificate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, accountName, certificateName, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, accountName, certificateName, context)
                .getValue();
        return this;
    }

    public Certificate cancelDeletion() {
        return serviceManager.certificates().cancelDeletion(resourceGroupName, accountName, certificateName);
    }

    public Response<Certificate> cancelDeletionWithResponse(Context context) {
        return serviceManager
            .certificates()
            .cancelDeletionWithResponse(resourceGroupName, accountName, certificateName, context);
    }

    public CertificateImpl withThumbprintAlgorithm(String thumbprintAlgorithm) {
        if (isInCreateMode()) {
            this.createParameters.withThumbprintAlgorithm(thumbprintAlgorithm);
            return this;
        } else {
            this.updateParameters.withThumbprintAlgorithm(thumbprintAlgorithm);
            return this;
        }
    }

    public CertificateImpl withThumbprint(String thumbprint) {
        if (isInCreateMode()) {
            this.createParameters.withThumbprint(thumbprint);
            return this;
        } else {
            this.updateParameters.withThumbprint(thumbprint);
            return this;
        }
    }

    public CertificateImpl withFormat(CertificateFormat format) {
        if (isInCreateMode()) {
            this.createParameters.withFormat(format);
            return this;
        } else {
            this.updateParameters.withFormat(format);
            return this;
        }
    }

    public CertificateImpl withData(String data) {
        if (isInCreateMode()) {
            this.createParameters.withData(data);
            return this;
        } else {
            this.updateParameters.withData(data);
            return this;
        }
    }

    public CertificateImpl withPassword(String password) {
        if (isInCreateMode()) {
            this.createParameters.withPassword(password);
            return this;
        } else {
            this.updateParameters.withPassword(password);
            return this;
        }
    }

    public CertificateImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public CertificateImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
