/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.CertificateResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.AppPlatformManager;
import java.util.List;

/**
 * Type representing CertificateResource.
 */
public interface CertificateResource extends HasInner<CertificateResourceInner>, Indexable, Updatable<CertificateResource.Update>, HasManager<AppPlatformManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    CertificateProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CertificateResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CertificateResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CertificateResource definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the certificateresource definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the certificateresource definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the Service resource
            * @return the next definition stage
            */
            WithProperties withServiceName(String serviceName);
        }

        /**
         * The stage of the certificateresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the certificate resource payload
            * @return the next definition stage
            */
            WithCreate withProperties(CertificateProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CertificateResource> {
        }
    }
    /**
     * The template for a CertificateResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CertificateResource>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of CertificateResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the certificateresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the certificate resource payload
             * @return the next update stage
             */
            Update withProperties(CertificateProperties properties);
        }

    }
}
