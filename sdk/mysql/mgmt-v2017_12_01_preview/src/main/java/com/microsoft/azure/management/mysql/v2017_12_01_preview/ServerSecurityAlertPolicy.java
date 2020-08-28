/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation.ServerSecurityAlertPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation.DBforMySQLManager;
import java.util.List;

/**
 * Type representing ServerSecurityAlertPolicy.
 */
public interface ServerSecurityAlertPolicy extends HasInner<ServerSecurityAlertPolicyInner>, Indexable, Refreshable<ServerSecurityAlertPolicy>, Updatable<ServerSecurityAlertPolicy.Update>, HasManager<DBforMySQLManager> {
    /**
     * @return the disabledAlerts value.
     */
    List<String> disabledAlerts();

    /**
     * @return the emailAccountAdmins value.
     */
    Boolean emailAccountAdmins();

    /**
     * @return the emailAddresses value.
     */
    List<String> emailAddresses();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * @return the state value.
     */
    ServerSecurityAlertPolicyState state();

    /**
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ServerSecurityAlertPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithState, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerSecurityAlertPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerSecurityAlertPolicy definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @return the next definition stage
            */
            WithState withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify State.
         */
        interface WithState {
           /**
            * Specifies state.
            * @param state Specifies the state of the policy, whether it is enabled or disabled. Possible values include: 'Enabled', 'Disabled'
            * @return the next definition stage
            */
            WithCreate withState(ServerSecurityAlertPolicyState state);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify DisabledAlerts.
         */
        interface WithDisabledAlerts {
            /**
             * Specifies disabledAlerts.
             * @param disabledAlerts Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
             * @return the next definition stage
             */
            WithCreate withDisabledAlerts(List<String> disabledAlerts);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify EmailAccountAdmins.
         */
        interface WithEmailAccountAdmins {
            /**
             * Specifies emailAccountAdmins.
             * @param emailAccountAdmins Specifies that the alert is sent to the account administrators
             * @return the next definition stage
             */
            WithCreate withEmailAccountAdmins(Boolean emailAccountAdmins);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify EmailAddresses.
         */
        interface WithEmailAddresses {
            /**
             * Specifies emailAddresses.
             * @param emailAddresses Specifies an array of e-mail addresses to which the alert is sent
             * @return the next definition stage
             */
            WithCreate withEmailAddresses(List<String> emailAddresses);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             * @param retentionDays Specifies the number of days to keep in the Threat Detection audit logs
             * @return the next definition stage
             */
            WithCreate withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             * @param storageAccountAccessKey Specifies the identifier key of the Threat Detection audit storage account
             * @return the next definition stage
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             * @param storageEndpoint Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs
             * @return the next definition stage
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerSecurityAlertPolicy>, DefinitionStages.WithDisabledAlerts, DefinitionStages.WithEmailAccountAdmins, DefinitionStages.WithEmailAddresses, DefinitionStages.WithRetentionDays, DefinitionStages.WithStorageAccountAccessKey, DefinitionStages.WithStorageEndpoint {
        }
    }
    /**
     * The template for a ServerSecurityAlertPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerSecurityAlertPolicy>, UpdateStages.WithDisabledAlerts, UpdateStages.WithEmailAccountAdmins, UpdateStages.WithEmailAddresses, UpdateStages.WithRetentionDays, UpdateStages.WithStorageAccountAccessKey, UpdateStages.WithStorageEndpoint {
    }

    /**
     * Grouping of ServerSecurityAlertPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serversecurityalertpolicy update allowing to specify DisabledAlerts.
         */
        interface WithDisabledAlerts {
            /**
             * Specifies disabledAlerts.
             * @param disabledAlerts Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
             * @return the next update stage
             */
            Update withDisabledAlerts(List<String> disabledAlerts);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify EmailAccountAdmins.
         */
        interface WithEmailAccountAdmins {
            /**
             * Specifies emailAccountAdmins.
             * @param emailAccountAdmins Specifies that the alert is sent to the account administrators
             * @return the next update stage
             */
            Update withEmailAccountAdmins(Boolean emailAccountAdmins);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify EmailAddresses.
         */
        interface WithEmailAddresses {
            /**
             * Specifies emailAddresses.
             * @param emailAddresses Specifies an array of e-mail addresses to which the alert is sent
             * @return the next update stage
             */
            Update withEmailAddresses(List<String> emailAddresses);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             * @param retentionDays Specifies the number of days to keep in the Threat Detection audit logs
             * @return the next update stage
             */
            Update withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             * @param storageAccountAccessKey Specifies the identifier key of the Threat Detection audit storage account
             * @return the next update stage
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             * @param storageEndpoint Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs
             * @return the next update stage
             */
            Update withStorageEndpoint(String storageEndpoint);
        }

    }
}
