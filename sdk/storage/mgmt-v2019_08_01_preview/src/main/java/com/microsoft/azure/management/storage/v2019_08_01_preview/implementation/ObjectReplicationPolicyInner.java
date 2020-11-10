/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ObjectReplicationPolicyRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The replication policy between two storage accounts. Multiple rules can be
 * defined in one policy.
 */
@JsonFlatten
public class ObjectReplicationPolicyInner extends ProxyResource {
    /**
     * A unique id for object replication policy.
     */
    @JsonProperty(value = "properties.policyId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyId;

    /**
     * Indicates when the policy is enabled on the source account.
     */
    @JsonProperty(value = "properties.enabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime enabledTime;

    /**
     * Required. Source account name.
     */
    @JsonProperty(value = "properties.sourceAccount", required = true)
    private String sourceAccount;

    /**
     * Required. Destination account name.
     */
    @JsonProperty(value = "properties.destinationAccount", required = true)
    private String destinationAccount;

    /**
     * The storage account object replication rules.
     */
    @JsonProperty(value = "properties.rules")
    private List<ObjectReplicationPolicyRule> rules;

    /**
     * Get a unique id for object replication policy.
     *
     * @return the policyId value
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Get indicates when the policy is enabled on the source account.
     *
     * @return the enabledTime value
     */
    public DateTime enabledTime() {
        return this.enabledTime;
    }

    /**
     * Get required. Source account name.
     *
     * @return the sourceAccount value
     */
    public String sourceAccount() {
        return this.sourceAccount;
    }

    /**
     * Set required. Source account name.
     *
     * @param sourceAccount the sourceAccount value to set
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Get required. Destination account name.
     *
     * @return the destinationAccount value
     */
    public String destinationAccount() {
        return this.destinationAccount;
    }

    /**
     * Set required. Destination account name.
     *
     * @param destinationAccount the destinationAccount value to set
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
        return this;
    }

    /**
     * Get the storage account object replication rules.
     *
     * @return the rules value
     */
    public List<ObjectReplicationPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the storage account object replication rules.
     *
     * @param rules the rules value to set
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withRules(List<ObjectReplicationPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

}
