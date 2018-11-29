/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ApplicationEventInner;

/**
 * Chaos Restart Code Package Fault Scheduled event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosRestartCodePackageFaultScheduled")
public class ChaosRestartCodePackageFaultScheduledEvent extends ApplicationEventInner {
    /**
     * Id of fault group.
     */
    @JsonProperty(value = "FaultGroupId", required = true)
    private UUID faultGroupId;

    /**
     * Id of fault.
     */
    @JsonProperty(value = "FaultId", required = true)
    private UUID faultId;

    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /**
     * Service manifest name.
     */
    @JsonProperty(value = "ServiceManifestName", required = true)
    private String serviceManifestName;

    /**
     * Code package name.
     */
    @JsonProperty(value = "CodePackageName", required = true)
    private String codePackageName;

    /**
     * Id of Service package activation.
     */
    @JsonProperty(value = "ServicePackageActivationId", required = true)
    private String servicePackageActivationId;

    /**
     * Get id of fault group.
     *
     * @return the faultGroupId value
     */
    public UUID faultGroupId() {
        return this.faultGroupId;
    }

    /**
     * Set id of fault group.
     *
     * @param faultGroupId the faultGroupId value to set
     * @return the ChaosRestartCodePackageFaultScheduledEvent object itself.
     */
    public ChaosRestartCodePackageFaultScheduledEvent withFaultGroupId(UUID faultGroupId) {
        this.faultGroupId = faultGroupId;
        return this;
    }

    /**
     * Get id of fault.
     *
     * @return the faultId value
     */
    public UUID faultId() {
        return this.faultId;
    }

    /**
     * Set id of fault.
     *
     * @param faultId the faultId value to set
     * @return the ChaosRestartCodePackageFaultScheduledEvent object itself.
     */
    public ChaosRestartCodePackageFaultScheduledEvent withFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

    /**
     * Get the name of a Service Fabric node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set
     * @return the ChaosRestartCodePackageFaultScheduledEvent object itself.
     */
    public ChaosRestartCodePackageFaultScheduledEvent withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get service manifest name.
     *
     * @return the serviceManifestName value
     */
    public String serviceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set service manifest name.
     *
     * @param serviceManifestName the serviceManifestName value to set
     * @return the ChaosRestartCodePackageFaultScheduledEvent object itself.
     */
    public ChaosRestartCodePackageFaultScheduledEvent withServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get code package name.
     *
     * @return the codePackageName value
     */
    public String codePackageName() {
        return this.codePackageName;
    }

    /**
     * Set code package name.
     *
     * @param codePackageName the codePackageName value to set
     * @return the ChaosRestartCodePackageFaultScheduledEvent object itself.
     */
    public ChaosRestartCodePackageFaultScheduledEvent withCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
        return this;
    }

    /**
     * Get id of Service package activation.
     *
     * @return the servicePackageActivationId value
     */
    public String servicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set id of Service package activation.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set
     * @return the ChaosRestartCodePackageFaultScheduledEvent object itself.
     */
    public ChaosRestartCodePackageFaultScheduledEvent withServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

}
