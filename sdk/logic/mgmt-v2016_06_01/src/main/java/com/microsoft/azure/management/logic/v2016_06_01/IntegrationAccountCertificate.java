/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.IntegrationAccountCertificateInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing IntegrationAccountCertificate.
 */
public interface IntegrationAccountCertificate extends HasInner<IntegrationAccountCertificateInner>, Indexable, Refreshable<IntegrationAccountCertificate>, Updatable<IntegrationAccountCertificate.Update>, HasManager<LogicManager> {
    /**
     * @return the changedTime value.
     */
    DateTime changedTime();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the key value.
     */
    KeyVaultKeyReference keyVal();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the metadata value.
     */
    Object metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the publicCertificate value.
     */
    String publicCertificate();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the IntegrationAccountCertificate definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithIntegrationAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IntegrationAccountCertificate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IntegrationAccountCertificate definition.
         */
        interface Blank extends WithIntegrationAccount {
        }

        /**
         * The stage of the integrationaccountcertificate definition allowing to specify IntegrationAccount.
         */
        interface WithIntegrationAccount {
           /**
            * Specifies resourceGroupName, integrationAccountName.
            * @param resourceGroupName The resource group name
            * @param integrationAccountName The integration account name
            * @return the next definition stage
            */
            WithCreate withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName);
        }

        /**
         * The stage of the integrationaccountcertificate definition allowing to specify Key.
         */
        interface WithKey {
            /**
             * Specifies key.
             * @param key The key details in the key vault
             * @return the next definition stage
             */
            WithCreate withKey(KeyVaultKeyReference key);
        }

        /**
         * The stage of the integrationaccountcertificate definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the integrationaccountcertificate definition allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             * @param metadata The metadata
             * @return the next definition stage
             */
            WithCreate withMetadata(Object metadata);
        }

        /**
         * The stage of the integrationaccountcertificate definition allowing to specify PublicCertificate.
         */
        interface WithPublicCertificate {
            /**
             * Specifies publicCertificate.
             * @param publicCertificate The public certificate
             * @return the next definition stage
             */
            WithCreate withPublicCertificate(String publicCertificate);
        }

        /**
         * The stage of the integrationaccountcertificate definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IntegrationAccountCertificate>, DefinitionStages.WithKey, DefinitionStages.WithLocation, DefinitionStages.WithMetadata, DefinitionStages.WithPublicCertificate, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a IntegrationAccountCertificate update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IntegrationAccountCertificate>, UpdateStages.WithKey, UpdateStages.WithLocation, UpdateStages.WithMetadata, UpdateStages.WithPublicCertificate, UpdateStages.WithTags {
    }

    /**
     * Grouping of IntegrationAccountCertificate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the integrationaccountcertificate update allowing to specify Key.
         */
        interface WithKey {
            /**
             * Specifies key.
             * @param key The key details in the key vault
             * @return the next update stage
             */
            Update withKey(KeyVaultKeyReference key);
        }

        /**
         * The stage of the integrationaccountcertificate update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the integrationaccountcertificate update allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             * @param metadata The metadata
             * @return the next update stage
             */
            Update withMetadata(Object metadata);
        }

        /**
         * The stage of the integrationaccountcertificate update allowing to specify PublicCertificate.
         */
        interface WithPublicCertificate {
            /**
             * Specifies publicCertificate.
             * @param publicCertificate The public certificate
             * @return the next update stage
             */
            Update withPublicCertificate(String publicCertificate);
        }

        /**
         * The stage of the integrationaccountcertificate update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
