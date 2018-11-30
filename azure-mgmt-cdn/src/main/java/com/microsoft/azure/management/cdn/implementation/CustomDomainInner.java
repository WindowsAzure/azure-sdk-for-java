/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import com.microsoft.azure.management.cdn.CustomDomainResourceState;
import com.microsoft.azure.management.cdn.CustomHttpsProvisioningState;
import com.microsoft.azure.management.cdn.CustomHttpsProvisioningSubstate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Friendly domain name mapping to the endpoint hostname that the customer
 * provides for branding purposes, e.g. www.contoso.com.
 */
@JsonFlatten
public class CustomDomainInner extends ProxyResource {
    /**
     * The host name of the custom domain. Must be a domain name.
     */
    @JsonProperty(value = "properties.hostName", required = true)
    private String hostName;

    /**
     * Resource status of the custom domain. Possible values include:
     * 'Creating', 'Active', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomainResourceState resourceState;

    /**
     * Provisioning status of Custom Https of the custom domain. Possible
     * values include: 'Enabling', 'Enabled', 'Disabling', 'Disabled',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.customHttpsProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningState customHttpsProvisioningState;

    /**
     * Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step. Possible values include:
     * 'SubmittingDomainControlValidationRequest',
     * 'PendingDomainControlValidationREquestApproval',
     * 'DomainControlValidationRequestApproved',
     * 'DomainControlValidationRequestRejected',
     * 'DomainControlValidationRequestTimedOut', 'IssuingCertificate',
     * 'DeployingCertificate', 'CertificateDeployed', 'DeletingCertificate',
     * 'CertificateDeleted'.
     */
    @JsonProperty(value = "properties.customHttpsProvisioningSubstate", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate;

    /**
     * Special validation or data may be required when delivering CDN to some
     * regions due to local compliance reasons. E.g. ICP license number of a
     * custom domain is required to deliver content in China.
     */
    @JsonProperty(value = "properties.validationData")
    private String validationData;

    /**
     * Provisioning status of the custom domain.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the host name of the custom domain. Must be a domain name.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the host name of the custom domain. Must be a domain name.
     *
     * @param hostName the hostName value to set
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get resource status of the custom domain. Possible values include: 'Creating', 'Active', 'Deleting'.
     *
     * @return the resourceState value
     */
    public CustomDomainResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get provisioning status of Custom Https of the custom domain. Possible values include: 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Failed'.
     *
     * @return the customHttpsProvisioningState value
     */
    public CustomHttpsProvisioningState customHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }

    /**
     * Get provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. Possible values include: 'SubmittingDomainControlValidationRequest', 'PendingDomainControlValidationREquestApproval', 'DomainControlValidationRequestApproved', 'DomainControlValidationRequestRejected', 'DomainControlValidationRequestTimedOut', 'IssuingCertificate', 'DeployingCertificate', 'CertificateDeployed', 'DeletingCertificate', 'CertificateDeleted'.
     *
     * @return the customHttpsProvisioningSubstate value
     */
    public CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }

    /**
     * Get special validation or data may be required when delivering CDN to some regions due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in China.
     *
     * @return the validationData value
     */
    public String validationData() {
        return this.validationData;
    }

    /**
     * Set special validation or data may be required when delivering CDN to some regions due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in China.
     *
     * @param validationData the validationData value to set
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withValidationData(String validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get provisioning status of the custom domain.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
