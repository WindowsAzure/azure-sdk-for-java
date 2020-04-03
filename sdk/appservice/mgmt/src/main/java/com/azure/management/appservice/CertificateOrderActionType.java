// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CertificateOrderActionType.
 */
public enum CertificateOrderActionType {
    /**
     * Enum value CertificateIssued.
     */
    CERTIFICATE_ISSUED("CertificateIssued"),

    /**
     * Enum value CertificateOrderCanceled.
     */
    CERTIFICATE_ORDER_CANCELED("CertificateOrderCanceled"),

    /**
     * Enum value CertificateOrderCreated.
     */
    CERTIFICATE_ORDER_CREATED("CertificateOrderCreated"),

    /**
     * Enum value CertificateRevoked.
     */
    CERTIFICATE_REVOKED("CertificateRevoked"),

    /**
     * Enum value DomainValidationComplete.
     */
    DOMAIN_VALIDATION_COMPLETE("DomainValidationComplete"),

    /**
     * Enum value FraudDetected.
     */
    FRAUD_DETECTED("FraudDetected"),

    /**
     * Enum value OrgNameChange.
     */
    ORG_NAME_CHANGE("OrgNameChange"),

    /**
     * Enum value OrgValidationComplete.
     */
    ORG_VALIDATION_COMPLETE("OrgValidationComplete"),

    /**
     * Enum value SanDrop.
     */
    SAN_DROP("SanDrop"),

    /**
     * Enum value FraudCleared.
     */
    FRAUD_CLEARED("FraudCleared"),

    /**
     * Enum value CertificateExpired.
     */
    CERTIFICATE_EXPIRED("CertificateExpired"),

    /**
     * Enum value CertificateExpirationWarning.
     */
    CERTIFICATE_EXPIRATION_WARNING("CertificateExpirationWarning"),

    /**
     * Enum value FraudDocumentationRequired.
     */
    FRAUD_DOCUMENTATION_REQUIRED("FraudDocumentationRequired"),

    /**
     * Enum value Unknown.
     */
    UNKNOWN("Unknown");

    /**
     * The actual serialized value for a CertificateOrderActionType instance.
     */
    private final String value;

    CertificateOrderActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CertificateOrderActionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CertificateOrderActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static CertificateOrderActionType fromString(String value) {
        CertificateOrderActionType[] items = CertificateOrderActionType.values();
        for (CertificateOrderActionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
