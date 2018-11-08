/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Resource validation request content.
 */
@JsonFlatten
public class ValidateRequest {
    /**
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Resource type used for verification. Possible values include:
     * 'ServerFarm', 'Site'.
     */
    @JsonProperty(value = "type", required = true)
    private ValidateResourceTypes type;

    /**
     * Expected location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * ARM resource ID of an App Service plan that would host the app.
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * Name of the target SKU for the App Service plan.
     */
    @JsonProperty(value = "properties.skuName")
    private String skuName;

    /**
     * &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.needLinuxWorkers")
    private Boolean needLinuxWorkers;

    /**
     * &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.isSpot")
    private Boolean isSpot;

    /**
     * Target capacity of the App Service plan (number of VM's).
     */
    @JsonProperty(value = "properties.capacity")
    private Integer capacity;

    /**
     * Name of App Service Environment where app or App Service plan should be
     * created.
     */
    @JsonProperty(value = "properties.hostingEnvironment")
    private String hostingEnvironment;

    /**
     * &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a
     * windows container.
     */
    @JsonProperty(value = "properties.isXenon")
    private Boolean isXenon;

    /**
     * Get resource name to verify.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name to verify.
     *
     * @param name the name value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type used for verification. Possible values include: 'ServerFarm', 'Site'.
     *
     * @return the type value
     */
    public ValidateResourceTypes type() {
        return this.type;
    }

    /**
     * Set resource type used for verification. Possible values include: 'ServerFarm', 'Site'.
     *
     * @param type the type value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withType(ValidateResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get expected location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set expected location of the resource.
     *
     * @param location the location value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get aRM resource ID of an App Service plan that would host the app.
     *
     * @return the serverFarmId value
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set aRM resource ID of an App Service plan that would host the app.
     *
     * @param serverFarmId the serverFarmId value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get name of the target SKU for the App Service plan.
     *
     * @return the skuName value
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set name of the target SKU for the App Service plan.
     *
     * @param skuName the skuName value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the needLinuxWorkers value
     */
    public Boolean needLinuxWorkers() {
        return this.needLinuxWorkers;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param needLinuxWorkers the needLinuxWorkers value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withNeedLinuxWorkers(Boolean needLinuxWorkers) {
        this.needLinuxWorkers = needLinuxWorkers;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isSpot value
     */
    public Boolean isSpot() {
        return this.isSpot;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isSpot the isSpot value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }

    /**
     * Get target capacity of the App Service plan (number of VM's).
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set target capacity of the App Service plan (number of VM's).
     *
     * @param capacity the capacity value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get name of App Service Environment where app or App Service plan should be created.
     *
     * @return the hostingEnvironment value
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set name of App Service Environment where app or App Service plan should be created.
     *
     * @param hostingEnvironment the hostingEnvironment value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @return the isXenon value
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @param isXenon the isXenon value to set
     * @return the ValidateRequest object itself.
     */
    public ValidateRequest withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

}
