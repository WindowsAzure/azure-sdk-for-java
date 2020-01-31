/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01.implementation;

import com.microsoft.azure.management.managedapplications.v2019_07_01.ProvisioningState;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationBillingDetailsDefinition;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationJitAccessPolicy;
import java.util.List;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationAuthorization;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationManagementMode;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPackageContact;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPackageSupportUrls;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationArtifact;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationClientDetails;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Plan;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Identity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.managedapplications.v2019_07_01.GenericResource;

/**
 * Information about managed application.
 */
@JsonFlatten
public class ApplicationInner extends GenericResource {
    /**
     * The managed resource group Id.
     */
    @JsonProperty(value = "properties.managedResourceGroupId")
    private String managedResourceGroupId;

    /**
     * The fully qualified path of managed application definition Id.
     */
    @JsonProperty(value = "properties.applicationDefinitionId")
    private String applicationDefinitionId;

    /**
     * Name and value pairs that define the managed application parameters. It
     * can be a JObject or a well formed JSON string.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * Name and value pairs that define the managed application outputs.
     */
    @JsonProperty(value = "properties.outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /**
     * The managed application provisioning state. Possible values include:
     * 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created',
     * 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The managed application billing details.
     */
    @JsonProperty(value = "properties.billingDetails", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationBillingDetailsDefinition billingDetails;

    /**
     * The managed application Jit access policy.
     */
    @JsonProperty(value = "properties.jitAccessPolicy")
    private ApplicationJitAccessPolicy jitAccessPolicy;

    /**
     * The publisher tenant Id.
     */
    @JsonProperty(value = "properties.publisherTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherTenantId;

    /**
     * The  read-only authorizations property that is retrieved from the
     * application package.
     */
    @JsonProperty(value = "properties.authorizations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationAuthorization> authorizations;

    /**
     * The managed application management mode. Possible values include:
     * 'NotSpecified', 'Unmanaged', 'Managed'.
     */
    @JsonProperty(value = "properties.managementMode", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationManagementMode managementMode;

    /**
     * The read-only customer support property that is retrieved from the
     * application package.
     */
    @JsonProperty(value = "properties.customerSupport", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationPackageContact customerSupport;

    /**
     * The read-only support URLs property that is retrieved from the
     * application package.
     */
    @JsonProperty(value = "properties.supportUrls", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationPackageSupportUrls supportUrls;

    /**
     * The collection of managed application artifacts.
     */
    @JsonProperty(value = "properties.artifacts", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationArtifact> artifacts;

    /**
     * The client entity that created the JIT request.
     */
    @JsonProperty(value = "properties.createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationClientDetails createdBy;

    /**
     * The client entity that last updated the JIT request.
     */
    @JsonProperty(value = "properties.updatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationClientDetails updatedBy;

    /**
     * The plan information.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /**
     * The kind of the managed application. Allowed values are MarketPlace and
     * ServiceCatalog.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the managed resource group Id.
     *
     * @return the managedResourceGroupId value
     */
    public String managedResourceGroupId() {
        return this.managedResourceGroupId;
    }

    /**
     * Set the managed resource group Id.
     *
     * @param managedResourceGroupId the managedResourceGroupId value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withManagedResourceGroupId(String managedResourceGroupId) {
        this.managedResourceGroupId = managedResourceGroupId;
        return this;
    }

    /**
     * Get the fully qualified path of managed application definition Id.
     *
     * @return the applicationDefinitionId value
     */
    public String applicationDefinitionId() {
        return this.applicationDefinitionId;
    }

    /**
     * Set the fully qualified path of managed application definition Id.
     *
     * @param applicationDefinitionId the applicationDefinitionId value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withApplicationDefinitionId(String applicationDefinitionId) {
        this.applicationDefinitionId = applicationDefinitionId;
        return this;
    }

    /**
     * Get name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     *
     * @param parameters the parameters value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get name and value pairs that define the managed application outputs.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the managed application provisioning state. Possible values include: 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the managed application billing details.
     *
     * @return the billingDetails value
     */
    public ApplicationBillingDetailsDefinition billingDetails() {
        return this.billingDetails;
    }

    /**
     * Get the managed application Jit access policy.
     *
     * @return the jitAccessPolicy value
     */
    public ApplicationJitAccessPolicy jitAccessPolicy() {
        return this.jitAccessPolicy;
    }

    /**
     * Set the managed application Jit access policy.
     *
     * @param jitAccessPolicy the jitAccessPolicy value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withJitAccessPolicy(ApplicationJitAccessPolicy jitAccessPolicy) {
        this.jitAccessPolicy = jitAccessPolicy;
        return this;
    }

    /**
     * Get the publisher tenant Id.
     *
     * @return the publisherTenantId value
     */
    public String publisherTenantId() {
        return this.publisherTenantId;
    }

    /**
     * Get the  read-only authorizations property that is retrieved from the application package.
     *
     * @return the authorizations value
     */
    public List<ApplicationAuthorization> authorizations() {
        return this.authorizations;
    }

    /**
     * Get the managed application management mode. Possible values include: 'NotSpecified', 'Unmanaged', 'Managed'.
     *
     * @return the managementMode value
     */
    public ApplicationManagementMode managementMode() {
        return this.managementMode;
    }

    /**
     * Get the read-only customer support property that is retrieved from the application package.
     *
     * @return the customerSupport value
     */
    public ApplicationPackageContact customerSupport() {
        return this.customerSupport;
    }

    /**
     * Get the read-only support URLs property that is retrieved from the application package.
     *
     * @return the supportUrls value
     */
    public ApplicationPackageSupportUrls supportUrls() {
        return this.supportUrls;
    }

    /**
     * Get the collection of managed application artifacts.
     *
     * @return the artifacts value
     */
    public List<ApplicationArtifact> artifacts() {
        return this.artifacts;
    }

    /**
     * Get the client entity that created the JIT request.
     *
     * @return the createdBy value
     */
    public ApplicationClientDetails createdBy() {
        return this.createdBy;
    }

    /**
     * Get the client entity that last updated the JIT request.
     *
     * @return the updatedBy value
     */
    public ApplicationClientDetails updatedBy() {
        return this.updatedBy;
    }

    /**
     * Get the plan information.
     *
     * @return the plan value
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan information.
     *
     * @param plan the plan value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @param kind the kind value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity of the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the resource.
     *
     * @param identity the identity value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

}
