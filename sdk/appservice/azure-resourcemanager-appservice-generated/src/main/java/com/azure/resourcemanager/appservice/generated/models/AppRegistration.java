// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the app registration for providers that have app ids and app secrets. */
@JsonFlatten
@Fluent
public class AppRegistration extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppRegistration.class);

    /*
     * The App ID of the app used for login.
     */
    @JsonProperty(value = "properties.appId")
    private String appId;

    /*
     * The app setting name that contains the app secret.
     */
    @JsonProperty(value = "properties.appSecretSettingName")
    private String appSecretSettingName;

    /**
     * Get the appId property: The App ID of the app used for login.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: The App ID of the app used for login.
     *
     * @param appId the appId value to set.
     * @return the AppRegistration object itself.
     */
    public AppRegistration withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appSecretSettingName property: The app setting name that contains the app secret.
     *
     * @return the appSecretSettingName value.
     */
    public String appSecretSettingName() {
        return this.appSecretSettingName;
    }

    /**
     * Set the appSecretSettingName property: The app setting name that contains the app secret.
     *
     * @param appSecretSettingName the appSecretSettingName value to set.
     * @return the AppRegistration object itself.
     */
    public AppRegistration withAppSecretSettingName(String appSecretSettingName) {
        this.appSecretSettingName = appSecretSettingName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppRegistration withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
