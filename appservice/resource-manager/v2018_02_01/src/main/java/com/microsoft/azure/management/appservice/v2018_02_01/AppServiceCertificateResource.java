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
            */
            WithLocation withExistingCertificateOrder(String resourceGroupName, String certificateOrderName);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify KeyVaultId.
         */
        interface WithKeyVaultId {
            /**
             * Specifies keyVaultId.
             */
            WithCreate withKeyVaultId(String keyVaultId);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify KeyVaultSecretName.
         */
        interface WithKeyVaultSecretName {
            /**
             * Specifies keyVaultSecretName.
             */
            WithCreate withKeyVaultSecretName(String keyVaultSecretName);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the appservicecertificateresource definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
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
             */
            Update withKeyVaultId(String keyVaultId);
        }

        /**
         * The stage of the appservicecertificateresource update allowing to specify KeyVaultSecretName.
         */
        interface WithKeyVaultSecretName {
            /**
             * Specifies keyVaultSecretName.
             */
            Update withKeyVaultSecretName(String keyVaultSecretName);
        }

        /**
         * The stage of the appservicecertificateresource update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

    }
}
