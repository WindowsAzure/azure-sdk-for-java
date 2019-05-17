/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.CognitiveServicesManager;
import java.util.Map;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.CognitiveServicesAccountInner;

/**
 * Type representing CognitiveServicesAccount.
 */
public interface CognitiveServicesAccount extends HasInner<CognitiveServicesAccountInner>, Resource, GroupableResourceCore<CognitiveServicesManager, CognitiveServicesAccountInner>, HasResourceGroup, Refreshable<CognitiveServicesAccount>, Updatable<CognitiveServicesAccount.Update>, HasManager<CognitiveServicesManager> {
    /**
     * @return the customSubDomainName value.
     */
    String customSubDomainName();

    /**
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the internalId value.
     */
    String internalId();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the networkAcls value.
     */
    NetworkRuleSet networkAcls();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * The entirety of the CognitiveServicesAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithProperties, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CognitiveServicesAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CognitiveServicesAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the CognitiveServicesAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the cognitiveservicesaccount definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            * @param kind Required. Gets or sets the Kind of the resource
            * @return the next definition stage
*/
            WithProperties withKind(String kind);
        }

        /**
         * The stage of the cognitiveservicesaccount definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Must exist in the request. Must be an empty object. Must not be null
            * @return the next definition stage
*/
            WithSku withProperties(Object properties);
        }

        /**
         * The stage of the cognitiveservicesaccount definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku Required. Gets or sets the SKU of the resource
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CognitiveServicesAccount>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a CognitiveServicesAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CognitiveServicesAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku, UpdateStages.WithTags, UpdateStages.WithProperties {
    }

    /**
     * Grouping of CognitiveServicesAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cognitiveservicesaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Gets or sets the SKU of the resource
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the cognitiveservicesaccount update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the cognitiveservicesaccount update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Additional properties for Account. Only provided fields will be updated
             * @return the next update stage
             */
            Update withProperties(Object properties);
        }

    }
}
