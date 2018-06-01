/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for KeyVaultSecretStatus.
 */
public enum KeyVaultSecretStatus {
    /** Enum value Initialized. */
    INITIALIZED("Initialized"),

    /** Enum value WaitingOnCertificateOrder. */
    WAITING_ON_CERTIFICATE_ORDER("WaitingOnCertificateOrder"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value CertificateOrderFailed. */
    CERTIFICATE_ORDER_FAILED("CertificateOrderFailed"),

    /** Enum value OperationNotPermittedOnKeyVault. */
    OPERATION_NOT_PERMITTED_ON_KEY_VAULT("OperationNotPermittedOnKeyVault"),

    /** Enum value AzureServiceUnauthorizedToAccessKeyVault. */
    AZURE_SERVICE_UNAUTHORIZED_TO_ACCESS_KEY_VAULT("AzureServiceUnauthorizedToAccessKeyVault"),

    /** Enum value KeyVaultDoesNotExist. */
    KEY_VAULT_DOES_NOT_EXIST("KeyVaultDoesNotExist"),

    /** Enum value KeyVaultSecretDoesNotExist. */
    KEY_VAULT_SECRET_DOES_NOT_EXIST("KeyVaultSecretDoesNotExist"),

    /** Enum value UnknownError. */
    UNKNOWN_ERROR("UnknownError"),

    /** Enum value ExternalPrivateKey. */
    EXTERNAL_PRIVATE_KEY("ExternalPrivateKey"),

    /** Enum value Unknown. */
    UNKNOWN("Unknown");

    /** The actual serialized value for a KeyVaultSecretStatus instance. */
    private String value;

    KeyVaultSecretStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeyVaultSecretStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed KeyVaultSecretStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static KeyVaultSecretStatus fromString(String value) {
        KeyVaultSecretStatus[] items = KeyVaultSecretStatus.values();
        for (KeyVaultSecretStatus item : items) {
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
