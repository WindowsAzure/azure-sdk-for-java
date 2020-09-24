/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.CertificateOrderActionType;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Certificate order action.
 */
@JsonFlatten
public class CertificateOrderActionInner extends ProxyOnlyResource {
    /**
     * Action type. Possible values include: 'CertificateIssued',
     * 'CertificateOrderCanceled', 'CertificateOrderCreated',
     * 'CertificateRevoked', 'DomainValidationComplete', 'FraudDetected',
     * 'OrgNameChange', 'OrgValidationComplete', 'SanDrop', 'FraudCleared',
     * 'CertificateExpired', 'CertificateExpirationWarning',
     * 'FraudDocumentationRequired', 'Unknown'.
     */
    @JsonProperty(value = "properties.actionType", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateOrderActionType actionType;

    /**
     * Time at which the certificate action was performed.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * Get action type. Possible values include: 'CertificateIssued', 'CertificateOrderCanceled', 'CertificateOrderCreated', 'CertificateRevoked', 'DomainValidationComplete', 'FraudDetected', 'OrgNameChange', 'OrgValidationComplete', 'SanDrop', 'FraudCleared', 'CertificateExpired', 'CertificateExpirationWarning', 'FraudDocumentationRequired', 'Unknown'.
     *
     * @return the actionType value
     */
    public CertificateOrderActionType actionType() {
        return this.actionType;
    }

    /**
     * Get time at which the certificate action was performed.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

}
