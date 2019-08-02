/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceCertificateResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import java.util.Map;

/**
 * Type representing AppServiceCertificateResource.
 */
public interface AppServiceCertificateResource extends HasInner<AppServiceCertificateResourceInner>, Indexable, Refreshable<AppServiceCertificateResource>, Updatable<AppServiceCertificateResource.Update>, HasManager<AppServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the keyVaultId value.
     */
    String keyVaultId();

    /**
     * @return the keyVaultSecretName value.
     */
    String keyVaultSecretName();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    KeyVaultSecretStatus provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AppServiceCertificateResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCertificateOrder, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AppServiceCertificateResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AppServiceCertificateResource definition.
         */
        interface Blank extends WithCertificateOrder {
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify CertificateOrder.
         */
        interface WithCertificateOrder {
           /**
            * Specifies resourceGroupName, certificateOrderName.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param certificateOrderName Name of the certificate order
            * @return the next definition stage
            */
            WithLocation withExistingCertificateOrder(String resourceGroupName, String certificateOrderName);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource Location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify KeyVaultId.
         */
        interface WithKeyVaultId {
            /**
             * Specifies keyVaultId.
             * @param keyVaultId Key Vault resource Id
             * @return the next definition stage
             */
            WithCreate withKeyVaultId(String keyVaultId);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify KeyVaultSecretName.
         */
        interface WithKeyVaultSecretName {
            /**
             * Specifies keyVaultSecretName.
             * @param keyVaultSecretName Key Vault secret name
             * @return the next definition stage
             */
            WithCreate withKeyVaultSecretName(String keyVaultSecretName);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify Tags.
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
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AppServiceCertificateResource>, DefinitionStages.WithKeyVaultId, DefinitionStages.WithKeyVaultSecretName, DefinitionStages.WithKind, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a AppServiceCertificateResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AppServiceCertificateResource>, UpdateStages.WithKeyVaultId, UpdateStages.WithKeyVaultSecretName, UpdateStages.WithKind {
    }

    /**
     * Grouping of AppServiceCertificateResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the appservicecertificateresource update allowing to specify KeyVaultId.
         */
        interface WithKeyVaultId {
            /**
             * Specifies keyVaultId.
             * @param keyVaultId Key Vault resource Id
             * @return the next update stage
             */
            Update withKeyVaultId(String keyVaultId);
        }

        /**
         * The stage of the appservicecertificateresource update allowing to specify KeyVaultSecretName.
         */
        interface WithKeyVaultSecretName {
            /**
             * Specifies keyVaultSecretName.
             * @param keyVaultSecretName Key Vault secret name
             * @return the next update stage
             */
            Update withKeyVaultSecretName(String keyVaultSecretName);
        }

        /**
         * The stage of the appservicecertificateresource update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

    }
}
