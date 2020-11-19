/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Task;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.TaskUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.SystemData;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.IdentityProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.TaskStatus;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PlatformProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.AgentProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.TaskStepProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.TriggerProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Credentials;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PlatformUpdateParameters;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.TaskStepUpdateParameters;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.TriggerUpdateParameters;
import rx.functions.Func1;

class TaskImpl extends CreatableUpdatableImpl<Task, TaskInner, TaskImpl> implements Task, Task.Definition, Task.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String taskName;
    private TaskUpdateParameters updateParameter;

    TaskImpl(String name, ContainerRegistryManager manager) {
        super(name, new TaskInner());
        this.manager = manager;
        // Set resource name
        this.taskName = name;
        //
        this.updateParameter = new TaskUpdateParameters();
    }

    TaskImpl(TaskInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.taskName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.taskName = IdParsingUtils.getValueFromIdByName(inner.id(), "tasks");
        //
        this.updateParameter = new TaskUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Task> createResourceAsync() {
        TasksInner client = this.manager().inner().tasks();
        return client.createAsync(this.resourceGroupName, this.registryName, this.taskName, this.inner())
            .map(new Func1<TaskInner, TaskInner>() {
               @Override
               public TaskInner call(TaskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Task> updateResourceAsync() {
        TasksInner client = this.manager().inner().tasks();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.taskName, this.updateParameter)
            .map(new Func1<TaskInner, TaskInner>() {
               @Override
               public TaskInner call(TaskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TaskInner> getInnerAsync() {
        TasksInner client = this.manager().inner().tasks();
        return client.getAsync(this.resourceGroupName, this.registryName, this.taskName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new TaskUpdateParameters();
    }

    @Override
    public AgentProperties agentConfiguration() {
        return this.inner().agentConfiguration();
    }

    @Override
    public String agentPoolName() {
        return this.inner().agentPoolName();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public Credentials credentials() {
        return this.inner().credentials();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public IdentityProperties identity() {
        return this.inner().identity();
    }

    @Override
    public Boolean isSystemTask() {
        return this.inner().isSystemTask();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String logTemplate() {
        return this.inner().logTemplate();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PlatformProperties platform() {
        return this.inner().platform();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public TaskStatus status() {
        return this.inner().status();
    }

    @Override
    public TaskStepProperties step() {
        return this.inner().step();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Integer timeout() {
        return this.inner().timeout();
    }

    @Override
    public TriggerProperties trigger() {
        return this.inner().trigger();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TaskImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public TaskImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public TaskImpl withIsSystemTask(Boolean isSystemTask) {
        this.inner().withIsSystemTask(isSystemTask);
        return this;
    }

    @Override
    public TaskImpl withPlatform(PlatformProperties platform) {
        this.inner().withPlatform(platform);
        return this;
    }

    @Override
    public TaskImpl withStep(TaskStepProperties step) {
        this.inner().withStep(step);
        return this;
    }

    @Override
    public TaskImpl withTrigger(TriggerProperties trigger) {
        this.inner().withTrigger(trigger);
        return this;
    }

    @Override
    public TaskImpl withPlatform(PlatformUpdateParameters platform) {
        this.updateParameter.withPlatform(platform);
        return this;
    }

    @Override
    public TaskImpl withStep(TaskStepUpdateParameters step) {
        this.updateParameter.withStep(step);
        return this;
    }

    @Override
    public TaskImpl withTrigger(TriggerUpdateParameters trigger) {
        this.updateParameter.withTrigger(trigger);
        return this;
    }

    @Override
    public TaskImpl withAgentConfiguration(AgentProperties agentConfiguration) {
        if (isInCreateMode()) {
            this.inner().withAgentConfiguration(agentConfiguration);
        } else {
            this.updateParameter.withAgentConfiguration(agentConfiguration);
        }
        return this;
    }

    @Override
    public TaskImpl withAgentPoolName(String agentPoolName) {
        if (isInCreateMode()) {
            this.inner().withAgentPoolName(agentPoolName);
        } else {
            this.updateParameter.withAgentPoolName(agentPoolName);
        }
        return this;
    }

    @Override
    public TaskImpl withCredentials(Credentials credentials) {
        if (isInCreateMode()) {
            this.inner().withCredentials(credentials);
        } else {
            this.updateParameter.withCredentials(credentials);
        }
        return this;
    }

    @Override
    public TaskImpl withIdentity(IdentityProperties identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public TaskImpl withLogTemplate(String logTemplate) {
        if (isInCreateMode()) {
            this.inner().withLogTemplate(logTemplate);
        } else {
            this.updateParameter.withLogTemplate(logTemplate);
        }
        return this;
    }

    @Override
    public TaskImpl withStatus(TaskStatus status) {
        if (isInCreateMode()) {
            this.inner().withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public TaskImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public TaskImpl withTimeout(Integer timeout) {
        if (isInCreateMode()) {
            this.inner().withTimeout(timeout);
        } else {
            this.updateParameter.withTimeout(timeout);
        }
        return this;
    }

}
