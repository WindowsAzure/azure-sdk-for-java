/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionPolicyResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.RecoveryServicesManager;
import java.util.Map;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionPolicyInner;

/**
 * Type representing VaultProtectionPolicyResource.
 */
public interface VaultProtectionPolicyResource extends HasInner<ProtectionPolicyResourceInner>, Indexable, Refreshable<VaultProtectionPolicyResource>, Updatable<VaultProtectionPolicyResource.Update>, HasManager<RecoveryServicesManager> {
    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ProtectionPolicyInner properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the VaultProtectionPolicyResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVault, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VaultProtectionPolicyResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VaultProtectionPolicyResource definition.
         */
        interface Blank extends WithVault {
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Vault.
         */
        interface WithVault {
           /**
            * Specifies vaultName, resourceGroupName.
            * @param vaultName The name of the Recovery Services vault
            * @param resourceGroupName The name of the resource group associated with the Recovery Services vault
            * @return the next definition stage
            */
            WithCreate withExistingVault(String vaultName, String resourceGroupName);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag Optional ETag
             * @return the next definition stage
             */
            WithCreate withETag(String eTag);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID represents the complete path to the resource
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Resource name associated with the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next definition stage
             */
            WithCreate withProperties(ProtectionPolicyInner properties);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the vaultprotectionpolicyresource definition allowing to specify Type.
         */
        interface WithType {
            /**
             * Specifies type.
             * @param type Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/
             * @return the next definition stage
             */
            WithCreate withType(String type);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VaultProtectionPolicyResource>, DefinitionStages.WithETag, DefinitionStages.WithId, DefinitionStages.WithLocation, DefinitionStages.WithName, DefinitionStages.WithProperties, DefinitionStages.WithTags, DefinitionStages.WithType {
        }
    }
    /**
     * The template for a VaultProtectionPolicyResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VaultProtectionPolicyResource>, UpdateStages.WithETag, UpdateStages.WithId, UpdateStages.WithLocation, UpdateStages.WithName, UpdateStages.WithProperties, UpdateStages.WithTags, UpdateStages.WithType {
    }

    /**
     * Grouping of VaultProtectionPolicyResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag Optional ETag
             * @return the next update stage
             */
            Update withETag(String eTag);
        }

        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID represents the complete path to the resource
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Resource name associated with the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next update stage
             */
            Update withProperties(ProtectionPolicyInner properties);
        }

        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the vaultprotectionpolicyresource update allowing to specify Type.
         */
        interface WithType {
            /**
             * Specifies type.
             * @param type Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/
             * @return the next update stage
             */
            Update withType(String type);
        }

    }
}
