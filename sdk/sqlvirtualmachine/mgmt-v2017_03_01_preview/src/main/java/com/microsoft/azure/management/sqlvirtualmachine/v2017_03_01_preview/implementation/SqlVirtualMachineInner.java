/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ResourceIdentity;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlServerLicenseType;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlManagementMode;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlImageSku;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.WsfcDomainCredentials;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.AutoPatchingSettings;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.AutoBackupSettings;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.KeyVaultCredentialSettings;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ServerConfigurationsManagementSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A SQL virtual machine.
 */
@JsonFlatten
public class SqlVirtualMachineInner extends Resource {
    /**
     * Azure Active Directory identity of the server.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /**
     * ARM Resource id of underlying virtual machine created from SQL
     * marketplace image.
     */
    @JsonProperty(value = "properties.virtualMachineResourceId")
    private String virtualMachineResourceId;

    /**
     * Provisioning state to track the async operation status.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     */
    @JsonProperty(value = "properties.sqlImageOffer")
    private String sqlImageOffer;

    /**
     * SQL Server license type. Possible values include: 'PAYG', 'AHUB'.
     */
    @JsonProperty(value = "properties.sqlServerLicenseType")
    private SqlServerLicenseType sqlServerLicenseType;

    /**
     * SQL Server Management type. Possible values include: 'Full',
     * 'LightWeight', 'NoAgent'.
     */
    @JsonProperty(value = "properties.sqlManagement")
    private SqlManagementMode sqlManagement;

    /**
     * SQL Server edition type. Possible values include: 'Developer',
     * 'Express', 'Standard', 'Enterprise', 'Web'.
     */
    @JsonProperty(value = "properties.sqlImageSku")
    private SqlImageSku sqlImageSku;

    /**
     * ARM resource id of the SQL virtual machine group this SQL virtual
     * machine is or will be part of.
     */
    @JsonProperty(value = "properties.sqlVirtualMachineGroupResourceId")
    private String sqlVirtualMachineGroupResourceId;

    /**
     * Domain credentials for setting up Windows Server Failover Cluster for
     * SQL availability group.
     */
    @JsonProperty(value = "properties.wsfcDomainCredentials")
    private WsfcDomainCredentials wsfcDomainCredentials;

    /**
     * Auto patching settings for applying critical security updates to SQL
     * virtual machine.
     */
    @JsonProperty(value = "properties.autoPatchingSettings")
    private AutoPatchingSettings autoPatchingSettings;

    /**
     * Auto backup settings for SQL Server.
     */
    @JsonProperty(value = "properties.autoBackupSettings")
    private AutoBackupSettings autoBackupSettings;

    /**
     * Key vault credential settings.
     */
    @JsonProperty(value = "properties.keyVaultCredentialSettings")
    private KeyVaultCredentialSettings keyVaultCredentialSettings;

    /**
     * SQL Server configuration management settings.
     */
    @JsonProperty(value = "properties.serverConfigurationsManagementSettings")
    private ServerConfigurationsManagementSettings serverConfigurationsManagementSettings;

    /**
     * Get azure Active Directory identity of the server.
     *
     * @return the identity value
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set azure Active Directory identity of the server.
     *
     * @param identity the identity value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get aRM Resource id of underlying virtual machine created from SQL marketplace image.
     *
     * @return the virtualMachineResourceId value
     */
    public String virtualMachineResourceId() {
        return this.virtualMachineResourceId;
    }

    /**
     * Set aRM Resource id of underlying virtual machine created from SQL marketplace image.
     *
     * @param virtualMachineResourceId the virtualMachineResourceId value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withVirtualMachineResourceId(String virtualMachineResourceId) {
        this.virtualMachineResourceId = virtualMachineResourceId;
        return this;
    }

    /**
     * Get provisioning state to track the async operation status.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get sQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @return the sqlImageOffer value
     */
    public String sqlImageOffer() {
        return this.sqlImageOffer;
    }

    /**
     * Set sQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @param sqlImageOffer the sqlImageOffer value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlImageOffer(String sqlImageOffer) {
        this.sqlImageOffer = sqlImageOffer;
        return this;
    }

    /**
     * Get sQL Server license type. Possible values include: 'PAYG', 'AHUB'.
     *
     * @return the sqlServerLicenseType value
     */
    public SqlServerLicenseType sqlServerLicenseType() {
        return this.sqlServerLicenseType;
    }

    /**
     * Set sQL Server license type. Possible values include: 'PAYG', 'AHUB'.
     *
     * @param sqlServerLicenseType the sqlServerLicenseType value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType) {
        this.sqlServerLicenseType = sqlServerLicenseType;
        return this;
    }

    /**
     * Get sQL Server Management type. Possible values include: 'Full', 'LightWeight', 'NoAgent'.
     *
     * @return the sqlManagement value
     */
    public SqlManagementMode sqlManagement() {
        return this.sqlManagement;
    }

    /**
     * Set sQL Server Management type. Possible values include: 'Full', 'LightWeight', 'NoAgent'.
     *
     * @param sqlManagement the sqlManagement value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlManagement(SqlManagementMode sqlManagement) {
        this.sqlManagement = sqlManagement;
        return this;
    }

    /**
     * Get sQL Server edition type. Possible values include: 'Developer', 'Express', 'Standard', 'Enterprise', 'Web'.
     *
     * @return the sqlImageSku value
     */
    public SqlImageSku sqlImageSku() {
        return this.sqlImageSku;
    }

    /**
     * Set sQL Server edition type. Possible values include: 'Developer', 'Express', 'Standard', 'Enterprise', 'Web'.
     *
     * @param sqlImageSku the sqlImageSku value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlImageSku(SqlImageSku sqlImageSku) {
        this.sqlImageSku = sqlImageSku;
        return this;
    }

    /**
     * Get aRM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     *
     * @return the sqlVirtualMachineGroupResourceId value
     */
    public String sqlVirtualMachineGroupResourceId() {
        return this.sqlVirtualMachineGroupResourceId;
    }

    /**
     * Set aRM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     *
     * @param sqlVirtualMachineGroupResourceId the sqlVirtualMachineGroupResourceId value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withSqlVirtualMachineGroupResourceId(String sqlVirtualMachineGroupResourceId) {
        this.sqlVirtualMachineGroupResourceId = sqlVirtualMachineGroupResourceId;
        return this;
    }

    /**
     * Get domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     *
     * @return the wsfcDomainCredentials value
     */
    public WsfcDomainCredentials wsfcDomainCredentials() {
        return this.wsfcDomainCredentials;
    }

    /**
     * Set domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     *
     * @param wsfcDomainCredentials the wsfcDomainCredentials value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials) {
        this.wsfcDomainCredentials = wsfcDomainCredentials;
        return this;
    }

    /**
     * Get auto patching settings for applying critical security updates to SQL virtual machine.
     *
     * @return the autoPatchingSettings value
     */
    public AutoPatchingSettings autoPatchingSettings() {
        return this.autoPatchingSettings;
    }

    /**
     * Set auto patching settings for applying critical security updates to SQL virtual machine.
     *
     * @param autoPatchingSettings the autoPatchingSettings value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings) {
        this.autoPatchingSettings = autoPatchingSettings;
        return this;
    }

    /**
     * Get auto backup settings for SQL Server.
     *
     * @return the autoBackupSettings value
     */
    public AutoBackupSettings autoBackupSettings() {
        return this.autoBackupSettings;
    }

    /**
     * Set auto backup settings for SQL Server.
     *
     * @param autoBackupSettings the autoBackupSettings value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withAutoBackupSettings(AutoBackupSettings autoBackupSettings) {
        this.autoBackupSettings = autoBackupSettings;
        return this;
    }

    /**
     * Get key vault credential settings.
     *
     * @return the keyVaultCredentialSettings value
     */
    public KeyVaultCredentialSettings keyVaultCredentialSettings() {
        return this.keyVaultCredentialSettings;
    }

    /**
     * Set key vault credential settings.
     *
     * @param keyVaultCredentialSettings the keyVaultCredentialSettings value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withKeyVaultCredentialSettings(KeyVaultCredentialSettings keyVaultCredentialSettings) {
        this.keyVaultCredentialSettings = keyVaultCredentialSettings;
        return this;
    }

    /**
     * Get sQL Server configuration management settings.
     *
     * @return the serverConfigurationsManagementSettings value
     */
    public ServerConfigurationsManagementSettings serverConfigurationsManagementSettings() {
        return this.serverConfigurationsManagementSettings;
    }

    /**
     * Set sQL Server configuration management settings.
     *
     * @param serverConfigurationsManagementSettings the serverConfigurationsManagementSettings value to set
     * @return the SqlVirtualMachineInner object itself.
     */
    public SqlVirtualMachineInner withServerConfigurationsManagementSettings(ServerConfigurationsManagementSettings serverConfigurationsManagementSettings) {
        this.serverConfigurationsManagementSettings = serverConfigurationsManagementSettings;
        return this;
    }

}
