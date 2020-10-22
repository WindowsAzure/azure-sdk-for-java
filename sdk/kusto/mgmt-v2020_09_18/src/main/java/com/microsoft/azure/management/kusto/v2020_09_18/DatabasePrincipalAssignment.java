/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.kusto.v2020_09_18.implementation.DatabasePrincipalAssignmentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2020_09_18.implementation.KustoManager;

/**
 * Type representing DatabasePrincipalAssignment.
 */
public interface DatabasePrincipalAssignment extends HasInner<DatabasePrincipalAssignmentInner>, Indexable, Refreshable<DatabasePrincipalAssignment>, Updatable<DatabasePrincipalAssignment.Update>, HasManager<KustoManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the principalId value.
     */
    String principalId();

    /**
     * @return the principalName value.
     */
    String principalName();

    /**
     * @return the principalType value.
     */
    PrincipalType principalType();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the role value.
     */
    DatabasePrincipalRole role();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the tenantName value.
     */
    String tenantName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DatabasePrincipalAssignment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithPrincipalId, DefinitionStages.WithPrincipalType, DefinitionStages.WithRole, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatabasePrincipalAssignment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatabasePrincipalAssignment definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the databaseprincipalassignment definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, clusterName, databaseName.
            * @param resourceGroupName The name of the resource group containing the Kusto cluster
            * @param clusterName The name of the Kusto cluster
            * @param databaseName The name of the database in the Kusto cluster
            * @return the next definition stage
            */
            WithPrincipalId withExistingDatabasis(String resourceGroupName, String clusterName, String databaseName);
        }

        /**
         * The stage of the databaseprincipalassignment definition allowing to specify PrincipalId.
         */
        interface WithPrincipalId {
           /**
            * Specifies principalId.
            * @param principalId The principal ID assigned to the database principal. It can be a user email, application ID, or security group name
            * @return the next definition stage
            */
            WithPrincipalType withPrincipalId(String principalId);
        }

        /**
         * The stage of the databaseprincipalassignment definition allowing to specify PrincipalType.
         */
        interface WithPrincipalType {
           /**
            * Specifies principalType.
            * @param principalType Principal type. Possible values include: 'App', 'Group', 'User'
            * @return the next definition stage
            */
            WithRole withPrincipalType(PrincipalType principalType);
        }

        /**
         * The stage of the databaseprincipalassignment definition allowing to specify Role.
         */
        interface WithRole {
           /**
            * Specifies role.
            * @param role Database principal role. Possible values include: 'Admin', 'Ingestor', 'Monitor', 'User', 'UnrestrictedViewers', 'Viewer'
            * @return the next definition stage
            */
            WithCreate withRole(DatabasePrincipalRole role);
        }

        /**
         * The stage of the databaseprincipalassignment definition allowing to specify TenantId.
         */
        interface WithTenantId {
            /**
             * Specifies tenantId.
             * @param tenantId The tenant id of the principal
             * @return the next definition stage
             */
            WithCreate withTenantId(String tenantId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatabasePrincipalAssignment>, DefinitionStages.WithTenantId {
        }
    }
    /**
     * The template for a DatabasePrincipalAssignment update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatabasePrincipalAssignment>, UpdateStages.WithTenantId {
    }

    /**
     * Grouping of DatabasePrincipalAssignment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the databaseprincipalassignment update allowing to specify TenantId.
         */
        interface WithTenantId {
            /**
             * Specifies tenantId.
             * @param tenantId The tenant id of the principal
             * @return the next update stage
             */
            Update withTenantId(String tenantId);
        }

    }
}
