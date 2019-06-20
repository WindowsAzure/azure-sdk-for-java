/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.PrivateCloudLocationVirtualMachineTemplateModel;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualDiskController;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualDisk;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNic;

class PrivateCloudLocationVirtualMachineTemplateModelImpl extends IndexableRefreshableWrapperImpl<PrivateCloudLocationVirtualMachineTemplateModel, VirtualMachineTemplateInner> implements PrivateCloudLocationVirtualMachineTemplateModel {
    private final VMwareCloudSimpleManager manager;
    private String pcName;
    private String virtualMachineTemplateName;

    PrivateCloudLocationVirtualMachineTemplateModelImpl(VirtualMachineTemplateInner inner,  VMwareCloudSimpleManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.pcName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateClouds");
        this.virtualMachineTemplateName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineTemplates");
    }

    @Override
    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VirtualMachineTemplateInner> getInnerAsync() {
        VirtualMachineTemplateByPCsInner client = this.manager().inner().virtualMachineTemplateByPCs();
        return client.getAsync(this.pcName, this.virtualMachineTemplateName);
    }



    @Override
    public Integer amountOfRam() {
        return this.inner().amountOfRam();
    }

    @Override
    public List<VirtualDiskController> controllers() {
        return this.inner().controllers();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public List<VirtualDisk> disks() {
        return this.inner().disks();
    }

    @Override
    public Boolean exposeToGuestVM() {
        return this.inner().exposeToGuestVM();
    }

    @Override
    public String guestOS() {
        return this.inner().guestOS();
    }

    @Override
    public String guestOSType() {
        return this.inner().guestOSType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<VirtualNic> nics() {
        return this.inner().nics();
    }

    @Override
    public Integer numberOfCores() {
        return this.inner().numberOfCores();
    }

    @Override
    public String path() {
        return this.inner().path();
    }

    @Override
    public String privateCloudId() {
        return this.inner().privateCloudId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vmwaretools() {
        return this.inner().vmwaretools();
    }

    @Override
    public List<String> vSphereNetworks() {
        return this.inner().vSphereNetworks();
    }

    @Override
    public List<String> vSphereTags() {
        return this.inner().vSphereTags();
    }

}
