// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource validation request content. */
@JsonFlatten
@Fluent
public class ValidateRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateRequest.class);

    /*
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type used for verification.
     */
    @JsonProperty(value = "type", required = true)
    private ValidateResourceTypes type;

    /*
     * Expected location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * ARM resource ID of an App Service plan that would host the app.
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /*
     * Name of the target SKU for the App Service plan.
     */
    @JsonProperty(value = "properties.skuName")
    private String skuName;

    /*
     * <code>true</code> if App Service plan is for Linux workers; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.needLinuxWorkers")
    private Boolean needLinuxWorkers;

    /*
     * <code>true</code> if App Service plan is for Spot instances; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.isSpot")
    private Boolean isSpot;

    /*
     * Target capacity of the App Service plan (number of VMs).
     */
    @JsonProperty(value = "properties.capacity")
    private Integer capacity;

    /*
     * Name of App Service Environment where app or App Service plan should be
     * created.
     */
    @JsonProperty(value = "properties.hostingEnvironment")
    private String hostingEnvironment;

    /*
     * <code>true</code> if App Service plan is running as a windows container
     */
    @JsonProperty(value = "properties.isXenon")
    private Boolean isXenon;

    /*
     * Base URL of the container registry
     */
    @JsonProperty(value = "properties.containerRegistryBaseUrl")
    private String containerRegistryBaseUrl;

    /*
     * Username for to access the container registry
     */
    @JsonProperty(value = "properties.containerRegistryUsername")
    private String containerRegistryUsername;

    /*
     * Password for to access the container registry
     */
    @JsonProperty(value = "properties.containerRegistryPassword")
    private String containerRegistryPassword;

    /*
     * Repository name (image name)
     */
    @JsonProperty(value = "properties.containerImageRepository")
    private String containerImageRepository;

    /*
     * Image tag
     */
    @JsonProperty(value = "properties.containerImageTag")
    private String containerImageTag;

    /*
     * Platform (windows or linux)
     */
    @JsonProperty(value = "properties.containerImagePlatform")
    private String containerImagePlatform;

    /*
     * App Service Environment Properties
     */
    @JsonProperty(value = "properties.appServiceEnvironment")
    private AppServiceEnvironment appServiceEnvironment;

    /**
     * Get the name property: Resource name to verify.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name to verify.
     *
     * @param name the name value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     *
     * @return the type value.
     */
    public ValidateResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     *
     * @param type the type value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withType(ValidateResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the location property: Expected location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Expected location of the resource.
     *
     * @param location the location value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the serverFarmId property: ARM resource ID of an App Service plan that would host the app.
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId property: ARM resource ID of an App Service plan that would host the app.
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the skuName property: Name of the target SKU for the App Service plan.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: Name of the target SKU for the App Service plan.
     *
     * @param skuName the skuName value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the needLinuxWorkers property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the needLinuxWorkers value.
     */
    public Boolean needLinuxWorkers() {
        return this.needLinuxWorkers;
    }

    /**
     * Set the needLinuxWorkers property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param needLinuxWorkers the needLinuxWorkers value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withNeedLinuxWorkers(Boolean needLinuxWorkers) {
        this.needLinuxWorkers = needLinuxWorkers;
        return this;
    }

    /**
     * Get the isSpot property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isSpot value.
     */
    public Boolean isSpot() {
        return this.isSpot;
    }

    /**
     * Set the isSpot property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isSpot the isSpot value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }

    /**
     * Get the capacity property: Target capacity of the App Service plan (number of VMs).
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Target capacity of the App Service plan (number of VMs).
     *
     * @param capacity the capacity value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the hostingEnvironment property: Name of App Service Environment where app or App Service plan should be
     * created.
     *
     * @return the hostingEnvironment value.
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment property: Name of App Service Environment where app or App Service plan should be
     * created.
     *
     * @param hostingEnvironment the hostingEnvironment value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /**
     * Get the isXenon property: &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set the isXenon property: &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @param isXenon the isXenon value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Get the containerRegistryBaseUrl property: Base URL of the container registry.
     *
     * @return the containerRegistryBaseUrl value.
     */
    public String containerRegistryBaseUrl() {
        return this.containerRegistryBaseUrl;
    }

    /**
     * Set the containerRegistryBaseUrl property: Base URL of the container registry.
     *
     * @param containerRegistryBaseUrl the containerRegistryBaseUrl value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withContainerRegistryBaseUrl(String containerRegistryBaseUrl) {
        this.containerRegistryBaseUrl = containerRegistryBaseUrl;
        return this;
    }

    /**
     * Get the containerRegistryUsername property: Username for to access the container registry.
     *
     * @return the containerRegistryUsername value.
     */
    public String containerRegistryUsername() {
        return this.containerRegistryUsername;
    }

    /**
     * Set the containerRegistryUsername property: Username for to access the container registry.
     *
     * @param containerRegistryUsername the containerRegistryUsername value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withContainerRegistryUsername(String containerRegistryUsername) {
        this.containerRegistryUsername = containerRegistryUsername;
        return this;
    }

    /**
     * Get the containerRegistryPassword property: Password for to access the container registry.
     *
     * @return the containerRegistryPassword value.
     */
    public String containerRegistryPassword() {
        return this.containerRegistryPassword;
    }

    /**
     * Set the containerRegistryPassword property: Password for to access the container registry.
     *
     * @param containerRegistryPassword the containerRegistryPassword value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withContainerRegistryPassword(String containerRegistryPassword) {
        this.containerRegistryPassword = containerRegistryPassword;
        return this;
    }

    /**
     * Get the containerImageRepository property: Repository name (image name).
     *
     * @return the containerImageRepository value.
     */
    public String containerImageRepository() {
        return this.containerImageRepository;
    }

    /**
     * Set the containerImageRepository property: Repository name (image name).
     *
     * @param containerImageRepository the containerImageRepository value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withContainerImageRepository(String containerImageRepository) {
        this.containerImageRepository = containerImageRepository;
        return this;
    }

    /**
     * Get the containerImageTag property: Image tag.
     *
     * @return the containerImageTag value.
     */
    public String containerImageTag() {
        return this.containerImageTag;
    }

    /**
     * Set the containerImageTag property: Image tag.
     *
     * @param containerImageTag the containerImageTag value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withContainerImageTag(String containerImageTag) {
        this.containerImageTag = containerImageTag;
        return this;
    }

    /**
     * Get the containerImagePlatform property: Platform (windows or linux).
     *
     * @return the containerImagePlatform value.
     */
    public String containerImagePlatform() {
        return this.containerImagePlatform;
    }

    /**
     * Set the containerImagePlatform property: Platform (windows or linux).
     *
     * @param containerImagePlatform the containerImagePlatform value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withContainerImagePlatform(String containerImagePlatform) {
        this.containerImagePlatform = containerImagePlatform;
        return this;
    }

    /**
     * Get the appServiceEnvironment property: App Service Environment Properties.
     *
     * @return the appServiceEnvironment value.
     */
    public AppServiceEnvironment appServiceEnvironment() {
        return this.appServiceEnvironment;
    }

    /**
     * Set the appServiceEnvironment property: App Service Environment Properties.
     *
     * @param appServiceEnvironment the appServiceEnvironment value to set.
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withAppServiceEnvironment(AppServiceEnvironment appServiceEnvironment) {
        this.appServiceEnvironment = appServiceEnvironment;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ValidateRequest"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ValidateRequest"));
        }
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model ValidateRequest"));
        }
        if (appServiceEnvironment() != null) {
            appServiceEnvironment().validate();
        }
    }
}
