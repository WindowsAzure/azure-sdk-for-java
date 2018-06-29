/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupStatusResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.FabricName;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionStatus;

class BackupStatusResponseImpl extends WrapperImpl<BackupStatusResponseInner> implements BackupStatusResponse {
    private final RecoveryServicesManager manager;
    BackupStatusResponseImpl(BackupStatusResponseInner inner, RecoveryServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public String containerName() {
        return this.inner().containerName();
    }

    @Override
    public String errorCode() {
        return this.inner().errorCode();
    }

    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public FabricName fabricName() {
        return this.inner().fabricName();
    }

    @Override
    public String policyName() {
        return this.inner().policyName();
    }

    @Override
    public String protectedItemName() {
        return this.inner().protectedItemName();
    }

    @Override
    public ProtectionStatus protectionStatus() {
        return this.inner().protectionStatus();
    }

    @Override
    public String registrationStatus() {
        return this.inner().registrationStatus();
    }

    @Override
    public String vaultId() {
        return this.inner().vaultId();
    }

}
