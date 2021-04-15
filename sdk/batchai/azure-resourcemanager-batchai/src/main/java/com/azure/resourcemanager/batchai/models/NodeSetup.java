// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Node setup settings. */
@Fluent
public final class NodeSetup {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NodeSetup.class);

    /*
     * Setup task to run on cluster nodes when nodes got created or rebooted.
     * The setup task code needs to be idempotent. Generally the setup task is
     * used to download static data that is required for all jobs that run on
     * the cluster VMs and/or to download/install software.
     */
    @JsonProperty(value = "setupTask")
    private SetupTask setupTask;

    /*
     * Mount volumes to be available to setup task and all jobs executing on
     * the cluster. The volumes will be mounted at location specified by
     * $AZ_BATCHAI_MOUNT_ROOT environment variable.
     */
    @JsonProperty(value = "mountVolumes")
    private MountVolumes mountVolumes;

    /*
     * Settings for performance counters collecting and uploading.
     */
    @JsonProperty(value = "performanceCountersSettings")
    private PerformanceCountersSettings performanceCountersSettings;

    /**
     * Get the setupTask property: Setup task to run on cluster nodes when nodes got created or rebooted. The setup task
     * code needs to be idempotent. Generally the setup task is used to download static data that is required for all
     * jobs that run on the cluster VMs and/or to download/install software.
     *
     * @return the setupTask value.
     */
    public SetupTask setupTask() {
        return this.setupTask;
    }

    /**
     * Set the setupTask property: Setup task to run on cluster nodes when nodes got created or rebooted. The setup task
     * code needs to be idempotent. Generally the setup task is used to download static data that is required for all
     * jobs that run on the cluster VMs and/or to download/install software.
     *
     * @param setupTask the setupTask value to set.
     * @return the NodeSetup object itself.
     */
    public NodeSetup withSetupTask(SetupTask setupTask) {
        this.setupTask = setupTask;
        return this;
    }

    /**
     * Get the mountVolumes property: Mount volumes to be available to setup task and all jobs executing on the cluster.
     * The volumes will be mounted at location specified by $AZ_BATCHAI_MOUNT_ROOT environment variable.
     *
     * @return the mountVolumes value.
     */
    public MountVolumes mountVolumes() {
        return this.mountVolumes;
    }

    /**
     * Set the mountVolumes property: Mount volumes to be available to setup task and all jobs executing on the cluster.
     * The volumes will be mounted at location specified by $AZ_BATCHAI_MOUNT_ROOT environment variable.
     *
     * @param mountVolumes the mountVolumes value to set.
     * @return the NodeSetup object itself.
     */
    public NodeSetup withMountVolumes(MountVolumes mountVolumes) {
        this.mountVolumes = mountVolumes;
        return this;
    }

    /**
     * Get the performanceCountersSettings property: Settings for performance counters collecting and uploading.
     *
     * @return the performanceCountersSettings value.
     */
    public PerformanceCountersSettings performanceCountersSettings() {
        return this.performanceCountersSettings;
    }

    /**
     * Set the performanceCountersSettings property: Settings for performance counters collecting and uploading.
     *
     * @param performanceCountersSettings the performanceCountersSettings value to set.
     * @return the NodeSetup object itself.
     */
    public NodeSetup withPerformanceCountersSettings(PerformanceCountersSettings performanceCountersSettings) {
        this.performanceCountersSettings = performanceCountersSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (setupTask() != null) {
            setupTask().validate();
        }
        if (mountVolumes() != null) {
            mountVolumes().validate();
        }
        if (performanceCountersSettings() != null) {
            performanceCountersSettings().validate();
        }
    }
}
