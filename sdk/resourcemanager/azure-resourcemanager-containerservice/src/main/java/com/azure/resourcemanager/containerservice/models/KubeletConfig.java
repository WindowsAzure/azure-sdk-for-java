// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Kubelet configurations of agent nodes. */
@Fluent
public final class KubeletConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KubeletConfig.class);

    /*
     * CPU Manager policy to use.
     */
    @JsonProperty(value = "cpuManagerPolicy")
    private String cpuManagerPolicy;

    /*
     * Enable CPU CFS quota enforcement for containers that specify CPU limits.
     */
    @JsonProperty(value = "cpuCfsQuota")
    private Boolean cpuCfsQuota;

    /*
     * Sets CPU CFS quota period value.
     */
    @JsonProperty(value = "cpuCfsQuotaPeriod")
    private String cpuCfsQuotaPeriod;

    /*
     * The percent of disk usage after which image garbage collection is always
     * run.
     */
    @JsonProperty(value = "imageGcHighThreshold")
    private Integer imageGcHighThreshold;

    /*
     * The percent of disk usage before which image garbage collection is never
     * run.
     */
    @JsonProperty(value = "imageGcLowThreshold")
    private Integer imageGcLowThreshold;

    /*
     * Topology Manager policy to use.
     */
    @JsonProperty(value = "topologyManagerPolicy")
    private String topologyManagerPolicy;

    /*
     * Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     */
    @JsonProperty(value = "allowedUnsafeSysctls")
    private List<String> allowedUnsafeSysctls;

    /*
     * If set to true it will make the Kubelet fail to start if swap is enabled
     * on the node.
     */
    @JsonProperty(value = "failSwapOn")
    private Boolean failSwapOn;

    /*
     * The maximum size (e.g. 10Mi) of container log file before it is rotated.
     */
    @JsonProperty(value = "containerLogMaxSizeMB")
    private Integer containerLogMaxSizeMB;

    /*
     * The maximum number of container log files that can be present for a
     * container. The number must be ≥ 2.
     */
    @JsonProperty(value = "containerLogMaxFiles")
    private Integer containerLogMaxFiles;

    /*
     * The maximum number of processes per pod.
     */
    @JsonProperty(value = "podMaxPids")
    private Integer podMaxPids;

    /**
     * Get the cpuManagerPolicy property: CPU Manager policy to use.
     *
     * @return the cpuManagerPolicy value.
     */
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    /**
     * Set the cpuManagerPolicy property: CPU Manager policy to use.
     *
     * @param cpuManagerPolicy the cpuManagerPolicy value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withCpuManagerPolicy(String cpuManagerPolicy) {
        this.cpuManagerPolicy = cpuManagerPolicy;
        return this;
    }

    /**
     * Get the cpuCfsQuota property: Enable CPU CFS quota enforcement for containers that specify CPU limits.
     *
     * @return the cpuCfsQuota value.
     */
    public Boolean cpuCfsQuota() {
        return this.cpuCfsQuota;
    }

    /**
     * Set the cpuCfsQuota property: Enable CPU CFS quota enforcement for containers that specify CPU limits.
     *
     * @param cpuCfsQuota the cpuCfsQuota value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withCpuCfsQuota(Boolean cpuCfsQuota) {
        this.cpuCfsQuota = cpuCfsQuota;
        return this;
    }

    /**
     * Get the cpuCfsQuotaPeriod property: Sets CPU CFS quota period value.
     *
     * @return the cpuCfsQuotaPeriod value.
     */
    public String cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }

    /**
     * Set the cpuCfsQuotaPeriod property: Sets CPU CFS quota period value.
     *
     * @param cpuCfsQuotaPeriod the cpuCfsQuotaPeriod value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withCpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        return this;
    }

    /**
     * Get the imageGcHighThreshold property: The percent of disk usage after which image garbage collection is always
     * run.
     *
     * @return the imageGcHighThreshold value.
     */
    public Integer imageGcHighThreshold() {
        return this.imageGcHighThreshold;
    }

    /**
     * Set the imageGcHighThreshold property: The percent of disk usage after which image garbage collection is always
     * run.
     *
     * @param imageGcHighThreshold the imageGcHighThreshold value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withImageGcHighThreshold(Integer imageGcHighThreshold) {
        this.imageGcHighThreshold = imageGcHighThreshold;
        return this;
    }

    /**
     * Get the imageGcLowThreshold property: The percent of disk usage before which image garbage collection is never
     * run.
     *
     * @return the imageGcLowThreshold value.
     */
    public Integer imageGcLowThreshold() {
        return this.imageGcLowThreshold;
    }

    /**
     * Set the imageGcLowThreshold property: The percent of disk usage before which image garbage collection is never
     * run.
     *
     * @param imageGcLowThreshold the imageGcLowThreshold value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withImageGcLowThreshold(Integer imageGcLowThreshold) {
        this.imageGcLowThreshold = imageGcLowThreshold;
        return this;
    }

    /**
     * Get the topologyManagerPolicy property: Topology Manager policy to use.
     *
     * @return the topologyManagerPolicy value.
     */
    public String topologyManagerPolicy() {
        return this.topologyManagerPolicy;
    }

    /**
     * Set the topologyManagerPolicy property: Topology Manager policy to use.
     *
     * @param topologyManagerPolicy the topologyManagerPolicy value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withTopologyManagerPolicy(String topologyManagerPolicy) {
        this.topologyManagerPolicy = topologyManagerPolicy;
        return this;
    }

    /**
     * Get the allowedUnsafeSysctls property: Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     *
     * @return the allowedUnsafeSysctls value.
     */
    public List<String> allowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls;
    }

    /**
     * Set the allowedUnsafeSysctls property: Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     *
     * @param allowedUnsafeSysctls the allowedUnsafeSysctls value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        return this;
    }

    /**
     * Get the failSwapOn property: If set to true it will make the Kubelet fail to start if swap is enabled on the
     * node.
     *
     * @return the failSwapOn value.
     */
    public Boolean failSwapOn() {
        return this.failSwapOn;
    }

    /**
     * Set the failSwapOn property: If set to true it will make the Kubelet fail to start if swap is enabled on the
     * node.
     *
     * @param failSwapOn the failSwapOn value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withFailSwapOn(Boolean failSwapOn) {
        this.failSwapOn = failSwapOn;
        return this;
    }

    /**
     * Get the containerLogMaxSizeMB property: The maximum size (e.g. 10Mi) of container log file before it is rotated.
     *
     * @return the containerLogMaxSizeMB value.
     */
    public Integer containerLogMaxSizeMB() {
        return this.containerLogMaxSizeMB;
    }

    /**
     * Set the containerLogMaxSizeMB property: The maximum size (e.g. 10Mi) of container log file before it is rotated.
     *
     * @param containerLogMaxSizeMB the containerLogMaxSizeMB value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withContainerLogMaxSizeMB(Integer containerLogMaxSizeMB) {
        this.containerLogMaxSizeMB = containerLogMaxSizeMB;
        return this;
    }

    /**
     * Get the containerLogMaxFiles property: The maximum number of container log files that can be present for a
     * container. The number must be ≥ 2.
     *
     * @return the containerLogMaxFiles value.
     */
    public Integer containerLogMaxFiles() {
        return this.containerLogMaxFiles;
    }

    /**
     * Set the containerLogMaxFiles property: The maximum number of container log files that can be present for a
     * container. The number must be ≥ 2.
     *
     * @param containerLogMaxFiles the containerLogMaxFiles value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withContainerLogMaxFiles(Integer containerLogMaxFiles) {
        this.containerLogMaxFiles = containerLogMaxFiles;
        return this;
    }

    /**
     * Get the podMaxPids property: The maximum number of processes per pod.
     *
     * @return the podMaxPids value.
     */
    public Integer podMaxPids() {
        return this.podMaxPids;
    }

    /**
     * Set the podMaxPids property: The maximum number of processes per pod.
     *
     * @param podMaxPids the podMaxPids value to set.
     * @return the KubeletConfig object itself.
     */
    public KubeletConfig withPodMaxPids(Integer podMaxPids) {
        this.podMaxPids = podMaxPids;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
