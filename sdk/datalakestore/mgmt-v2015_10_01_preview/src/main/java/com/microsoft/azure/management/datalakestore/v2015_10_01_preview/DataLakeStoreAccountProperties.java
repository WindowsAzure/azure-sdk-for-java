/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store account properties information.
 */
public class DataLakeStoreAccountProperties {
    /**
     * the status of the Data Lake Store account while being provisioned.
     * Possible values include: 'Failed', 'Creating', 'Running', 'Succeeded',
     * 'Patching', 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountStatus provisioningState;

    /**
     * the status of the Data Lake Store account after provisioning has
     * completed. Possible values include: 'active', 'suspended'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountState state;

    /**
     * the account creation time.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The current state of encryption for this Data Lake store account.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "encryptionState")
    private EncryptionState encryptionState;

    /**
     * The current state of encryption provisioning for this Data Lake store
     * account. Possible values include: 'Creating', 'Succeeded'.
     */
    @JsonProperty(value = "encryptionProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionProvisioningState encryptionProvisioningState;

    /**
     * The Key vault encryption configuration.
     */
    @JsonProperty(value = "encryptionConfig")
    private EncryptionConfig encryptionConfig;

    /**
     * the account last modified time.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * the gateway host.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * the default owner group for all new folders and files created in the
     * Data Lake Store account.
     */
    @JsonProperty(value = "defaultGroup")
    private String defaultGroup;

    /**
     * Get the status of the Data Lake Store account while being provisioned. Possible values include: 'Failed', 'Creating', 'Running', 'Succeeded', 'Patching', 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     *
     * @return the provisioningState value
     */
    public DataLakeStoreAccountStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status of the Data Lake Store account after provisioning has completed. Possible values include: 'active', 'suspended'.
     *
     * @return the state value
     */
    public DataLakeStoreAccountState state() {
        return this.state;
    }

    /**
     * Get the account creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the current state of encryption for this Data Lake store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the encryptionState value
     */
    public EncryptionState encryptionState() {
        return this.encryptionState;
    }

    /**
     * Set the current state of encryption for this Data Lake store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param encryptionState the encryptionState value to set
     * @return the DataLakeStoreAccountProperties object itself.
     */
    public DataLakeStoreAccountProperties withEncryptionState(EncryptionState encryptionState) {
        this.encryptionState = encryptionState;
        return this;
    }

    /**
     * Get the current state of encryption provisioning for this Data Lake store account. Possible values include: 'Creating', 'Succeeded'.
     *
     * @return the encryptionProvisioningState value
     */
    public EncryptionProvisioningState encryptionProvisioningState() {
        return this.encryptionProvisioningState;
    }

    /**
     * Get the Key vault encryption configuration.
     *
     * @return the encryptionConfig value
     */
    public EncryptionConfig encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Set the Key vault encryption configuration.
     *
     * @param encryptionConfig the encryptionConfig value to set
     * @return the DataLakeStoreAccountProperties object itself.
     */
    public DataLakeStoreAccountProperties withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    /**
     * Get the account last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the gateway host.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the gateway host.
     *
     * @param endpoint the endpoint value to set
     * @return the DataLakeStoreAccountProperties object itself.
     */
    public DataLakeStoreAccountProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the default owner group for all new folders and files created in the Data Lake Store account.
     *
     * @return the defaultGroup value
     */
    public String defaultGroup() {
        return this.defaultGroup;
    }

    /**
     * Set the default owner group for all new folders and files created in the Data Lake Store account.
     *
     * @param defaultGroup the defaultGroup value to set
     * @return the DataLakeStoreAccountProperties object itself.
     */
    public DataLakeStoreAccountProperties withDefaultGroup(String defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

}
