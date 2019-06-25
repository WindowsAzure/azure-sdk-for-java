/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.ManagedInstanceInner;

/**
 * Type representing ManagedInstance.
 */
public interface ManagedInstance extends HasInner<ManagedInstanceInner>, Resource, GroupableResourceCore<SqlManager, ManagedInstanceInner>, HasResourceGroup, Refreshable<ManagedInstance>, Updatable<ManagedInstance.Update>, HasManager<SqlManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the dnsZone value.
     */
    String dnsZone();

    /**
     * @return the dnsZonePartner value.
     */
    String dnsZonePartner();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the instancePoolId value.
     */
    String instancePoolId();

    /**
     * @return the licenseType value.
     */
    ManagedInstanceLicenseType licenseType();

    /**
     * @return the maintenanceWindowSettings value.
     */
    MaintenanceWindowSettings maintenanceWindowSettings();

    /**
     * @return the managedInstanceCreateMode value.
     */
    ManagedServerCreateMode managedInstanceCreateMode();

    /**
     * @return the proxyOverride value.
     */
    ManagedInstanceProxyOverride proxyOverride();

    /**
     * @return the publicDataEndpointEnabled value.
     */
    Boolean publicDataEndpointEnabled();

    /**
     * @return the restorePointInTime value.
     */
    DateTime restorePointInTime();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sourceManagedInstanceId value.
     */
    String sourceManagedInstanceId();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the storageSizeInGB value.
     */
    Integer storageSizeInGB();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the timezoneId value.
     */
    String timezoneId();

    /**
     * @return the vCores value.
     */
    Integer vCores();

    /**
     * The entirety of the ManagedInstance definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedInstance definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedInstance definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ManagedInstance definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the managedinstance update allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance update allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the managedinstance update allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             */
            WithCreate withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the managedinstance update allowing to specify InstancePoolId.
         */
        interface WithInstancePoolId {
            /**
             * Specifies instancePoolId.
             */
            WithCreate withInstancePoolId(String instancePoolId);
        }

        /**
         * The stage of the managedinstance update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            WithCreate withLicenseType(ManagedInstanceLicenseType licenseType);
        }

        /**
         * The stage of the managedinstance update allowing to specify MaintenanceWindowSettings.
         */
        interface WithMaintenanceWindowSettings {
            /**
             * Specifies maintenanceWindowSettings.
             */
            WithCreate withMaintenanceWindowSettings(MaintenanceWindowSettings maintenanceWindowSettings);
        }

        /**
         * The stage of the managedinstance update allowing to specify ManagedInstanceCreateMode.
         */
        interface WithManagedInstanceCreateMode {
            /**
             * Specifies managedInstanceCreateMode.
             */
            WithCreate withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode);
        }

        /**
         * The stage of the managedinstance update allowing to specify ProxyOverride.
         */
        interface WithProxyOverride {
            /**
             * Specifies proxyOverride.
             */
            WithCreate withProxyOverride(ManagedInstanceProxyOverride proxyOverride);
        }

        /**
         * The stage of the managedinstance update allowing to specify PublicDataEndpointEnabled.
         */
        interface WithPublicDataEndpointEnabled {
            /**
             * Specifies publicDataEndpointEnabled.
             */
            WithCreate withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled);
        }

        /**
         * The stage of the managedinstance update allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             */
            WithCreate withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the managedinstance update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance update allowing to specify SourceManagedInstanceId.
         */
        interface WithSourceManagedInstanceId {
            /**
             * Specifies sourceManagedInstanceId.
             */
            WithCreate withSourceManagedInstanceId(String sourceManagedInstanceId);
        }

        /**
         * The stage of the managedinstance update allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             */
            WithCreate withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance update allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             */
            WithCreate withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance update allowing to specify TimezoneId.
         */
        interface WithTimezoneId {
            /**
             * Specifies timezoneId.
             */
            WithCreate withTimezoneId(String timezoneId);
        }

        /**
         * The stage of the managedinstance update allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             */
            WithCreate withVCores(Integer vCores);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedInstance>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdministratorLogin, DefinitionStages.WithAdministratorLoginPassword, DefinitionStages.WithCollation, DefinitionStages.WithDnsZonePartner, DefinitionStages.WithIdentity, DefinitionStages.WithInstancePoolId, DefinitionStages.WithLicenseType, DefinitionStages.WithMaintenanceWindowSettings, DefinitionStages.WithManagedInstanceCreateMode, DefinitionStages.WithProxyOverride, DefinitionStages.WithPublicDataEndpointEnabled, DefinitionStages.WithRestorePointInTime, DefinitionStages.WithSku, DefinitionStages.WithSourceManagedInstanceId, DefinitionStages.WithStorageSizeInGB, DefinitionStages.WithSubnetId, DefinitionStages.WithTimezoneId, DefinitionStages.WithVCores {
        }
    }
    /**
     * The template for a ManagedInstance update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedInstance>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdministratorLogin, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithCollation, UpdateStages.WithDnsZonePartner, UpdateStages.WithInstancePoolId, UpdateStages.WithLicenseType, UpdateStages.WithMaintenanceWindowSettings, UpdateStages.WithManagedInstanceCreateMode, UpdateStages.WithProxyOverride, UpdateStages.WithPublicDataEndpointEnabled, UpdateStages.WithRestorePointInTime, UpdateStages.WithSku, UpdateStages.WithSourceManagedInstanceId, UpdateStages.WithStorageSizeInGB, UpdateStages.WithSubnetId, UpdateStages.WithTimezoneId, UpdateStages.WithVCores {
    }

    /**
     * Grouping of ManagedInstance update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managedinstance {0} allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             */
            Update withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             */
            Update withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify InstancePoolId.
         */
        interface WithInstancePoolId {
            /**
             * Specifies instancePoolId.
             */
            Update withInstancePoolId(String instancePoolId);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            Update withLicenseType(ManagedInstanceLicenseType licenseType);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify MaintenanceWindowSettings.
         */
        interface WithMaintenanceWindowSettings {
            /**
             * Specifies maintenanceWindowSettings.
             */
            Update withMaintenanceWindowSettings(MaintenanceWindowSettings maintenanceWindowSettings);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify ManagedInstanceCreateMode.
         */
        interface WithManagedInstanceCreateMode {
            /**
             * Specifies managedInstanceCreateMode.
             */
            Update withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify ProxyOverride.
         */
        interface WithProxyOverride {
            /**
             * Specifies proxyOverride.
             */
            Update withProxyOverride(ManagedInstanceProxyOverride proxyOverride);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify PublicDataEndpointEnabled.
         */
        interface WithPublicDataEndpointEnabled {
            /**
             * Specifies publicDataEndpointEnabled.
             */
            Update withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             */
            Update withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify SourceManagedInstanceId.
         */
        interface WithSourceManagedInstanceId {
            /**
             * Specifies sourceManagedInstanceId.
             */
            Update withSourceManagedInstanceId(String sourceManagedInstanceId);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             */
            Update withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             */
            Update withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify TimezoneId.
         */
        interface WithTimezoneId {
            /**
             * Specifies timezoneId.
             */
            Update withTimezoneId(String timezoneId);
        }

        /**
         * The stage of the managedinstance {0} allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             */
            Update withVCores(Integer vCores);
        }

    }
}
