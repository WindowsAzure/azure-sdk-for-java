/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation;

import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.HanaProvisioningStatesEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * SAP monitor info on Azure (ARM properties and SAP monitor properties).
 */
@JsonFlatten
@SkipParentValidation
public class SapMonitorInner extends Resource {
    /**
     * Specifies the SAP monitor unique ID.
     */
    @JsonProperty(value = "properties.hanaSubnet")
    private String hanaSubnet;

    /**
     * Hostname of the HANA instance.
     */
    @JsonProperty(value = "properties.hanaHostname")
    private String hanaHostname;

    /**
     * Database name of the HANA instance.
     */
    @JsonProperty(value = "properties.hanaDbName")
    private String hanaDbName;

    /**
     * Database port of the HANA instance.
     */
    @JsonProperty(value = "properties.hanaDbSqlPort")
    private Integer hanaDbSqlPort;

    /**
     * Database username of the HANA instance.
     */
    @JsonProperty(value = "properties.hanaDbUsername")
    private String hanaDbUsername;

    /**
     * Database password of the HANA instance.
     */
    @JsonProperty(value = "properties.hanaDbPassword")
    private String hanaDbPassword;

    /**
     * State of provisioning of the HanaInstance. Possible values include:
     * 'Accepted', 'Creating', 'Updating', 'Failed', 'Succeeded', 'Deleting',
     * 'Migrating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private HanaProvisioningStatesEnum provisioningState;

    /**
     * Get specifies the SAP monitor unique ID.
     *
     * @return the hanaSubnet value
     */
    public String hanaSubnet() {
        return this.hanaSubnet;
    }

    /**
     * Set specifies the SAP monitor unique ID.
     *
     * @param hanaSubnet the hanaSubnet value to set
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withHanaSubnet(String hanaSubnet) {
        this.hanaSubnet = hanaSubnet;
        return this;
    }

    /**
     * Get hostname of the HANA instance.
     *
     * @return the hanaHostname value
     */
    public String hanaHostname() {
        return this.hanaHostname;
    }

    /**
     * Set hostname of the HANA instance.
     *
     * @param hanaHostname the hanaHostname value to set
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withHanaHostname(String hanaHostname) {
        this.hanaHostname = hanaHostname;
        return this;
    }

    /**
     * Get database name of the HANA instance.
     *
     * @return the hanaDbName value
     */
    public String hanaDbName() {
        return this.hanaDbName;
    }

    /**
     * Set database name of the HANA instance.
     *
     * @param hanaDbName the hanaDbName value to set
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withHanaDbName(String hanaDbName) {
        this.hanaDbName = hanaDbName;
        return this;
    }

    /**
     * Get database port of the HANA instance.
     *
     * @return the hanaDbSqlPort value
     */
    public Integer hanaDbSqlPort() {
        return this.hanaDbSqlPort;
    }

    /**
     * Set database port of the HANA instance.
     *
     * @param hanaDbSqlPort the hanaDbSqlPort value to set
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withHanaDbSqlPort(Integer hanaDbSqlPort) {
        this.hanaDbSqlPort = hanaDbSqlPort;
        return this;
    }

    /**
     * Get database username of the HANA instance.
     *
     * @return the hanaDbUsername value
     */
    public String hanaDbUsername() {
        return this.hanaDbUsername;
    }

    /**
     * Set database username of the HANA instance.
     *
     * @param hanaDbUsername the hanaDbUsername value to set
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withHanaDbUsername(String hanaDbUsername) {
        this.hanaDbUsername = hanaDbUsername;
        return this;
    }

    /**
     * Get database password of the HANA instance.
     *
     * @return the hanaDbPassword value
     */
    public String hanaDbPassword() {
        return this.hanaDbPassword;
    }

    /**
     * Set database password of the HANA instance.
     *
     * @param hanaDbPassword the hanaDbPassword value to set
     * @return the SapMonitorInner object itself.
     */
    public SapMonitorInner withHanaDbPassword(String hanaDbPassword) {
        this.hanaDbPassword = hanaDbPassword;
        return this;
    }

    /**
     * Get state of provisioning of the HanaInstance. Possible values include: 'Accepted', 'Creating', 'Updating', 'Failed', 'Succeeded', 'Deleting', 'Migrating'.
     *
     * @return the provisioningState value
     */
    public HanaProvisioningStatesEnum provisioningState() {
        return this.provisioningState;
    }

}
