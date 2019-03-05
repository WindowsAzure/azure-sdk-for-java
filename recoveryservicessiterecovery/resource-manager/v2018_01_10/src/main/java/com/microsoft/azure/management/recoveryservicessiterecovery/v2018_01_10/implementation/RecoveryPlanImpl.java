/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.RecoveryPlan;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.UpdateRecoveryPlanInputProperties;
import java.util.List;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.CreateRecoveryPlanInputProperties;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.RecoveryPlanProperties;
import rx.functions.Func1;

class RecoveryPlanImpl extends CreatableUpdatableImpl<RecoveryPlan, RecoveryPlanInner, RecoveryPlanImpl> implements RecoveryPlan, RecoveryPlan.Definition, RecoveryPlan.Update {
    private final RecoveryServicesManager manager;
    private String recoveryPlanName;
    private CreateRecoveryPlanInputProperties cproperties;
    private UpdateRecoveryPlanInputProperties uproperties;

    RecoveryPlanImpl(String name, RecoveryServicesManager manager) {
        super(name, new RecoveryPlanInner());
        this.manager = manager;
        // Set resource name
        this.recoveryPlanName = name;
        //
        this.cproperties = new CreateRecoveryPlanInputProperties();
        this.uproperties = new UpdateRecoveryPlanInputProperties();
    }

    RecoveryPlanImpl(RecoveryPlanInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.recoveryPlanName = inner.name();
        // set resource ancestor and positional variables
        this.recoveryPlanName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationRecoveryPlans");
        //
        this.cproperties = new CreateRecoveryPlanInputProperties();
        this.uproperties = new UpdateRecoveryPlanInputProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RecoveryPlan> createResourceAsync() {
        ReplicationRecoveryPlansInner client = this.manager().inner().replicationRecoveryPlans();
        return client.createAsync(this.recoveryPlanName, this.cproperties)
            .map(new Func1<RecoveryPlanInner, RecoveryPlanInner>() {
               @Override
               public RecoveryPlanInner call(RecoveryPlanInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RecoveryPlan> updateResourceAsync() {
        ReplicationRecoveryPlansInner client = this.manager().inner().replicationRecoveryPlans();
        return client.updateAsync(this.recoveryPlanName, this.uproperties)
            .map(new Func1<RecoveryPlanInner, RecoveryPlanInner>() {
               @Override
               public RecoveryPlanInner call(RecoveryPlanInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RecoveryPlanInner> getInnerAsync() {
        ReplicationRecoveryPlansInner client = this.manager().inner().replicationRecoveryPlans();
        return client.getAsync(this.recoveryPlanName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new CreateRecoveryPlanInputProperties();
        this.uproperties = new UpdateRecoveryPlanInputProperties();
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
    public RecoveryPlanProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RecoveryPlanImpl withExistingVault() {
        return this;
    }

    @Override
    public RecoveryPlanImpl withProperties(CreateRecoveryPlanInputProperties properties) {
        this.cproperties = properties;
        return this;
    }

    @Override
    public RecoveryPlanImpl withProperties(UpdateRecoveryPlanInputProperties properties) {
        this.uproperties = properties;
        return this;
    }

}
