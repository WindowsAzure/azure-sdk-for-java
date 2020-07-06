/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image repository credential.
 */
public class ImageRepositoryCredential {
    /**
     * Image repository url (e.g.: mcr.microsoft.com).
     */
    @JsonProperty(value = "imageRepositoryUrl", required = true)
    private String imageRepositoryUrl;

    /**
     * Repository user name.
     */
    @JsonProperty(value = "userName", required = true)
    private String userName;

    /**
     * Repository user password.
     */
    @JsonProperty(value = "password")
    private AsymmetricEncryptedSecret password;

    /**
     * Get image repository url (e.g.: mcr.microsoft.com).
     *
     * @return the imageRepositoryUrl value
     */
    public String imageRepositoryUrl() {
        return this.imageRepositoryUrl;
    }

    /**
     * Set image repository url (e.g.: mcr.microsoft.com).
     *
     * @param imageRepositoryUrl the imageRepositoryUrl value to set
     * @return the ImageRepositoryCredential object itself.
     */
    public ImageRepositoryCredential withImageRepositoryUrl(String imageRepositoryUrl) {
        this.imageRepositoryUrl = imageRepositoryUrl;
        return this;
    }

    /**
     * Get repository user name.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set repository user name.
     *
     * @param userName the userName value to set
     * @return the ImageRepositoryCredential object itself.
     */
    public ImageRepositoryCredential withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get repository user password.
     *
     * @return the password value
     */
    public AsymmetricEncryptedSecret password() {
        return this.password;
    }

    /**
     * Set repository user password.
     *
     * @param password the password value to set
     * @return the ImageRepositoryCredential object itself.
     */
    public ImageRepositoryCredential withPassword(AsymmetricEncryptedSecret password) {
        this.password = password;
        return this;
    }

}
