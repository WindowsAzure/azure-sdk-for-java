/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.DBforPostgreSQLManager;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ServerInner;

/**
 * Type representing Server.
 */
public interface Server extends HasInner<ServerInner>, Resource, GroupableResourceCore<DBforPostgreSQLManager, ServerInner>, HasResourceGroup, Refreshable<Server>, Updatable<Server.Update>, HasManager<DBforPostgreSQLManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the byokEnforcement value.
     */
    String byokEnforcement();

    /**
     * @return the earliestRestoreDate value.
     */
    DateTime earliestRestoreDate();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the infrastructureEncryption value.
     */
    InfrastructureEncryption infrastructureEncryption();

    /**
     * @return the masterServerId value.
     */
    String masterServerId();

    /**
     * @return the minimalTlsVersion value.
     */
    MinimalTlsVersionEnum minimalTlsVersion();

    /**
     * @return the privateEndpointConnections value.
     */
    List<ServerPrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccessEnum publicNetworkAccess();

    /**
     * @return the replicaCapacity value.
     */
    Integer replicaCapacity();

    /**
     * @return the replicationRole value.
     */
    String replicationRole();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sslEnforcement value.
     */
    SslEnforcementEnum sslEnforcement();

    /**
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * @return the userVisibleState value.
     */
    ServerState userVisibleState();

    /**
     * @return the version value.
     */
    ServerVersion version();

    /**
     * The entirety of the Server definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Server definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Server definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Server definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithProperties> {
        }

        /**
         * The stage of the server definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the server
            * @return the next definition stage
*/
            WithCreate withProperties(ServerPropertiesForCreate properties);
        }

        /**
         * The stage of the server definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Azure Active Directory identity of the server
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the server definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU (pricing tier) of the server
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Server>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIdentity, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a Server update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Server>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithIdentity, UpdateStages.WithMinimalTlsVersion, UpdateStages.WithPublicNetworkAccess, UpdateStages.WithReplicationRole, UpdateStages.WithSku, UpdateStages.WithSslEnforcement, UpdateStages.WithStorageProfile, UpdateStages.WithVersion {
    }

    /**
     * Grouping of Server update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the server update allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The password of the administrator login
             * @return the next update stage
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the server update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Azure Active Directory identity of the server
             * @return the next update stage
             */
            Update withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the server update allowing to specify MinimalTlsVersion.
         */
        interface WithMinimalTlsVersion {
            /**
             * Specifies minimalTlsVersion.
             * @param minimalTlsVersion Enforce a minimal Tls version for the server. Possible values include: 'TLS1_0', 'TLS1_1', 'TLS1_2', 'TLSEnforcementDisabled'
             * @return the next update stage
             */
            Update withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion);
        }

        /**
         * The stage of the server update allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess);
        }

        /**
         * The stage of the server update allowing to specify ReplicationRole.
         */
        interface WithReplicationRole {
            /**
             * Specifies replicationRole.
             * @param replicationRole The replication role of the server
             * @return the next update stage
             */
            Update withReplicationRole(String replicationRole);
        }

        /**
         * The stage of the server update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU (pricing tier) of the server
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the server update allowing to specify SslEnforcement.
         */
        interface WithSslEnforcement {
            /**
             * Specifies sslEnforcement.
             * @param sslEnforcement Enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withSslEnforcement(SslEnforcementEnum sslEnforcement);
        }

        /**
         * The stage of the server update allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             * @param storageProfile Storage profile of a server
             * @return the next update stage
             */
            Update withStorageProfile(StorageProfile storageProfile);
        }

        /**
         * The stage of the server update allowing to specify Version.
         */
        interface WithVersion {
            /**
             * Specifies version.
             * @param version The version of a server. Possible values include: '9.5', '9.6', '10', '10.0', '10.2', '11'
             * @return the next update stage
             */
            Update withVersion(ServerVersion version);
        }

    }
}
