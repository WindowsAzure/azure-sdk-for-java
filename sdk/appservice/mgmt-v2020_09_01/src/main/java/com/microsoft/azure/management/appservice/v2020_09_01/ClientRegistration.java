/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The ClientRegistration model.
 */
@JsonFlatten
public class ClientRegistration extends ProxyOnlyResource {
    /**
     * The clientId property.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /**
     * The clientSecretSettingName property.
     */
    @JsonProperty(value = "properties.clientSecretSettingName")
    private String clientSecretSettingName;

    /**
     * Get the clientId value.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId value.
     *
     * @param clientId the clientId value to set
     * @return the ClientRegistration object itself.
     */
    public ClientRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecretSettingName value.
     *
     * @return the clientSecretSettingName value
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName value.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set
     * @return the ClientRegistration object itself.
     */
    public ClientRegistration withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
        return this;
    }

}
