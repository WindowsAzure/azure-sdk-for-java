/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.DeployedServiceReplicaInfoInner;

/**
 * Information about a stateless service instance deployed on a node.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
public class DeployedStatelessServiceInstanceInfo extends DeployedServiceReplicaInfoInner {
    /**
     * Id of a stateless service instance. InstanceId is used by Service Fabric
     * to uniquely identify an instance of a partition of a stateless service.
     * It is unique within a partition and does not change for the lifetime of
     * the instance. If the instance has failed over on the same or different
     * node, it will get a different value for the InstanceId.
     */
    @JsonProperty(value = "InstanceId")
    private String instanceId;

    /**
     * Get id of a stateless service instance. InstanceId is used by Service Fabric to uniquely identify an instance of a partition of a stateless service. It is unique within a partition and does not change for the lifetime of the instance. If the instance has failed over on the same or different node, it will get a different value for the InstanceId.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Set id of a stateless service instance. InstanceId is used by Service Fabric to uniquely identify an instance of a partition of a stateless service. It is unique within a partition and does not change for the lifetime of the instance. If the instance has failed over on the same or different node, it will get a different value for the InstanceId.
     *
     * @param instanceId the instanceId value to set
     * @return the DeployedStatelessServiceInstanceInfo object itself.
     */
    public DeployedStatelessServiceInstanceInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
