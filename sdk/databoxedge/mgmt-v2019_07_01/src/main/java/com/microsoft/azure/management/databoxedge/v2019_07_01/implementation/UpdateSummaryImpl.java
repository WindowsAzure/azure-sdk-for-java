/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_07_01.UpdateSummary;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import com.microsoft.azure.management.databoxedge.v2019_07_01.UpdateOperation;
import com.microsoft.azure.management.databoxedge.v2019_07_01.InstallRebootBehavior;
import java.util.List;

class UpdateSummaryImpl extends WrapperImpl<UpdateSummaryInner> implements UpdateSummary {
    private final DataBoxEdgeManager manager;
    UpdateSummaryImpl(UpdateSummaryInner inner, DataBoxEdgeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public DateTime deviceLastScannedDateTime() {
        return this.inner().deviceLastScannedDateTime();
    }

    @Override
    public String deviceVersionNumber() {
        return this.inner().deviceVersionNumber();
    }

    @Override
    public String friendlyDeviceVersionName() {
        return this.inner().friendlyDeviceVersionName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String inProgressDownloadJobId() {
        return this.inner().inProgressDownloadJobId();
    }

    @Override
    public DateTime inProgressDownloadJobStartedDateTime() {
        return this.inner().inProgressDownloadJobStartedDateTime();
    }

    @Override
    public String inProgressInstallJobId() {
        return this.inner().inProgressInstallJobId();
    }

    @Override
    public DateTime inProgressInstallJobStartedDateTime() {
        return this.inner().inProgressInstallJobStartedDateTime();
    }

    @Override
    public DateTime lastCompletedDownloadJobDateTime() {
        return this.inner().lastCompletedDownloadJobDateTime();
    }

    @Override
    public DateTime lastCompletedInstallJobDateTime() {
        return this.inner().lastCompletedInstallJobDateTime();
    }

    @Override
    public DateTime lastCompletedScanJobDateTime() {
        return this.inner().lastCompletedScanJobDateTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public UpdateOperation ongoingUpdateOperation() {
        return this.inner().ongoingUpdateOperation();
    }

    @Override
    public InstallRebootBehavior rebootBehavior() {
        return this.inner().rebootBehavior();
    }

    @Override
    public Integer totalNumberOfUpdatesAvailable() {
        return this.inner().totalNumberOfUpdatesAvailable();
    }

    @Override
    public Integer totalNumberOfUpdatesPendingDownload() {
        return this.inner().totalNumberOfUpdatesPendingDownload();
    }

    @Override
    public Integer totalNumberOfUpdatesPendingInstall() {
        return this.inner().totalNumberOfUpdatesPendingInstall();
    }

    @Override
    public Double totalUpdateSizeInBytes() {
        return this.inner().totalUpdateSizeInBytes();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<String> updateTitles() {
        return this.inner().updateTitles();
    }

}
