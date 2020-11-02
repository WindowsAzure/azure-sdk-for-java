/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_03_01.AuthenticationType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The upload registration certificate response.
 */
public class UploadCertificateResponseInner {
    /**
     * Specifies authentication type. Possible values include: 'Invalid',
     * 'AzureActiveDirectory'.
     */
    @JsonProperty(value = "authType")
    private AuthenticationType authType;

    /**
     * The resource ID of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Azure Active Directory tenant authority.
     */
    @JsonProperty(value = "aadAuthority", required = true)
    private String aadAuthority;

    /**
     * Azure Active Directory tenant ID.
     */
    @JsonProperty(value = "aadTenantId", required = true)
    private String aadTenantId;

    /**
     * Azure Active Directory service principal client ID.
     */
    @JsonProperty(value = "servicePrincipalClientId", required = true)
    private String servicePrincipalClientId;

    /**
     * Azure Active Directory service principal object ID.
     */
    @JsonProperty(value = "servicePrincipalObjectId", required = true)
    private String servicePrincipalObjectId;

    /**
     * The azure management endpoint audience.
     */
    @JsonProperty(value = "azureManagementEndpointAudience", required = true)
    private String azureManagementEndpointAudience;

    /**
     * Get specifies authentication type. Possible values include: 'Invalid', 'AzureActiveDirectory'.
     *
     * @return the authType value
     */
    public AuthenticationType authType() {
        return this.authType;
    }

    /**
     * Set specifies authentication type. Possible values include: 'Invalid', 'AzureActiveDirectory'.
     *
     * @param authType the authType value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withAuthType(AuthenticationType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the resource ID of the Data Box Edge/Gateway device.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource ID of the Data Box Edge/Gateway device.
     *
     * @param resourceId the resourceId value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get azure Active Directory tenant authority.
     *
     * @return the aadAuthority value
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Set azure Active Directory tenant authority.
     *
     * @param aadAuthority the aadAuthority value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withAadAuthority(String aadAuthority) {
        this.aadAuthority = aadAuthority;
        return this;
    }

    /**
     * Get azure Active Directory tenant ID.
     *
     * @return the aadTenantId value
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Set azure Active Directory tenant ID.
     *
     * @param aadTenantId the aadTenantId value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withAadTenantId(String aadTenantId) {
        this.aadTenantId = aadTenantId;
        return this;
    }

    /**
     * Get azure Active Directory service principal client ID.
     *
     * @return the servicePrincipalClientId value
     */
    public String servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }

    /**
     * Set azure Active Directory service principal client ID.
     *
     * @param servicePrincipalClientId the servicePrincipalClientId value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withServicePrincipalClientId(String servicePrincipalClientId) {
        this.servicePrincipalClientId = servicePrincipalClientId;
        return this;
    }

    /**
     * Get azure Active Directory service principal object ID.
     *
     * @return the servicePrincipalObjectId value
     */
    public String servicePrincipalObjectId() {
        return this.servicePrincipalObjectId;
    }

    /**
     * Set azure Active Directory service principal object ID.
     *
     * @param servicePrincipalObjectId the servicePrincipalObjectId value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withServicePrincipalObjectId(String servicePrincipalObjectId) {
        this.servicePrincipalObjectId = servicePrincipalObjectId;
        return this;
    }

    /**
     * Get the azure management endpoint audience.
     *
     * @return the azureManagementEndpointAudience value
     */
    public String azureManagementEndpointAudience() {
        return this.azureManagementEndpointAudience;
    }

    /**
     * Set the azure management endpoint audience.
     *
     * @param azureManagementEndpointAudience the azureManagementEndpointAudience value to set
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withAzureManagementEndpointAudience(String azureManagementEndpointAudience) {
        this.azureManagementEndpointAudience = azureManagementEndpointAudience;
        return this;
    }

}
