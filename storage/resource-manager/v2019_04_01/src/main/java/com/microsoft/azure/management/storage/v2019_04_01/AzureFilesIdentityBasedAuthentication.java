/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for Azure Files identity based authentication.
 */
public class AzureFilesIdentityBasedAuthentication {
    /**
     * Indicates the directory service used. Possible values include: 'None',
     * 'AADDS'.
     */
    @JsonProperty(value = "directoryServiceOptions", required = true)
    private DirectoryServiceOptions directoryServiceOptions;

    /**
     * Get indicates the directory service used. Possible values include: 'None', 'AADDS'.
     *
     * @return the directoryServiceOptions value
     */
    public DirectoryServiceOptions directoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    /**
     * Set indicates the directory service used. Possible values include: 'None', 'AADDS'.
     *
     * @param directoryServiceOptions the directoryServiceOptions value to set
     * @return the AzureFilesIdentityBasedAuthentication object itself.
     */
    public AzureFilesIdentityBasedAuthentication withDirectoryServiceOptions(DirectoryServiceOptions directoryServiceOptions) {
        this.directoryServiceOptions = directoryServiceOptions;
        return this;
    }

}
