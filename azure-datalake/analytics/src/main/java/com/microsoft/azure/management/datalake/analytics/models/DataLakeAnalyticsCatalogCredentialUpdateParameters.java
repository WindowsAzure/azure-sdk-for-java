/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Analytics catalog credential update parameters.
 */
public class DataLakeAnalyticsCatalogCredentialUpdateParameters {
    /**
     * the current password for the credential and user with access to the data
     * source. This is required if the requester is not the account owner.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * the new password for the credential and user with access to the data
     * source.
     */
    @JsonProperty(value = "newPassword")
    private String newPassword;

    /**
     * the URI identifier for the data source this credential can connect to in
     * the format &lt;hostname&gt;:&lt;port&gt;.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * the object identifier for the user associated with this credential with
     * access to the data source.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /**
     * Get the current password for the credential and user with access to the data source. This is required if the requester is not the account owner.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the current password for the credential and user with access to the data source. This is required if the requester is not the account owner.
     *
     * @param password the password value to set
     * @return the DataLakeAnalyticsCatalogCredentialUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogCredentialUpdateParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the new password for the credential and user with access to the data source.
     *
     * @return the newPassword value
     */
    public String newPassword() {
        return this.newPassword;
    }

    /**
     * Set the new password for the credential and user with access to the data source.
     *
     * @param newPassword the newPassword value to set
     * @return the DataLakeAnalyticsCatalogCredentialUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogCredentialUpdateParameters withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * Get the URI identifier for the data source this credential can connect to in the format &lt;hostname&gt;:&lt;port&gt;.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI identifier for the data source this credential can connect to in the format &lt;hostname&gt;:&lt;port&gt;.
     *
     * @param uri the uri value to set
     * @return the DataLakeAnalyticsCatalogCredentialUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogCredentialUpdateParameters withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the object identifier for the user associated with this credential with access to the data source.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the object identifier for the user associated with this credential with access to the data source.
     *
     * @param userId the userId value to set
     * @return the DataLakeAnalyticsCatalogCredentialUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogCredentialUpdateParameters withUserId(String userId) {
        this.userId = userId;
        return this;
    }

}
