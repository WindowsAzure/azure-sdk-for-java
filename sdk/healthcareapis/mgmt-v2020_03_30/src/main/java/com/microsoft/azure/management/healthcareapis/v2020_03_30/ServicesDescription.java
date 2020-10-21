/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.HealthcareApisManager;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.ServicesDescriptionInner;

/**
 * Type representing ServicesDescription.
 */
public interface ServicesDescription extends HasInner<ServicesDescriptionInner>, Resource, GroupableResourceCore<HealthcareApisManager, ServicesDescriptionInner>, HasResourceGroup, Refreshable<ServicesDescription>, Updatable<ServicesDescription.Update>, HasManager<HealthcareApisManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the identity value.
     */
    ServicesResourceIdentity identity();

    /**
     * @return the kind value.
     */
    Kind kind();

    /**
     * @return the properties value.
     */
    ServicesProperties properties();

    /**
     * The entirety of the ServicesDescription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServicesDescription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServicesDescription definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ServicesDescription definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            * @param kind The kind of the service. Possible values include: 'fhir', 'fhir-Stu3', 'fhir-R4'
            * @return the next definition stage
*/
            WithCreate withKind(Kind kind);
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag An etag associated with the resource, used for optimistic concurrency when editing it
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Setting indicating whether the service has a managed identity associated with it
             * @return the next definition stage
             */
            WithCreate withIdentity(ServicesResourceIdentity identity);
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The common properties of a service
             * @return the next definition stage
             */
            WithCreate withProperties(ServicesProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServicesDescription>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag, DefinitionStages.WithIdentity, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a ServicesDescription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServicesDescription>, Resource.UpdateWithTags<Update>, UpdateStages.WithPublicNetworkAccess {
    }

    /**
     * Grouping of ServicesDescription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the servicesdescription update allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess Control permission for data plane traffic coming from public networks while private endpoint is enabled. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

    }
}
