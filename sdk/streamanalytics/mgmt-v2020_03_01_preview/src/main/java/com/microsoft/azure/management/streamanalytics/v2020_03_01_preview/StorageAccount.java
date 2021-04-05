/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that are associated with an Azure Storage account.
 */
public class StorageAccount {
    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /**
     * The account key for the Azure Storage account. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /**
     * Get the name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountName the accountName value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountKey value
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountKey the accountKey value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

}
