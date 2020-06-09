/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_04_01.implementation.DdosCustomPolicyInner;

/**
 * Type representing DdosCustomPolicy.
 */
public interface DdosCustomPolicy extends HasInner<DdosCustomPolicyInner>, Resource, GroupableResourceCore<NetworkManager, DdosCustomPolicyInner>, HasResourceGroup, Refreshable<DdosCustomPolicy>, Updatable<DdosCustomPolicy.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the protocolCustomSettings value.
     */
    List<ProtocolCustomSettingsFormat> protocolCustomSettings();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the publicIPAddresses value.
     */
    List<SubResource> publicIPAddresses();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * The entirety of the DdosCustomPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DdosCustomPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DdosCustomPolicy definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DdosCustomPolicy definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the ddoscustompolicy definition allowing to specify ProtocolCustomSettings.
         */
        interface WithProtocolCustomSettings {
            /**
             * Specifies protocolCustomSettings.
             * @param protocolCustomSettings The protocol-specific DDoS policy customization parameters
             * @return the next definition stage
             */
            WithCreate withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DdosCustomPolicy>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithProtocolCustomSettings {
        }
    }
    /**
     * The template for a DdosCustomPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DdosCustomPolicy>, Resource.UpdateWithTags<Update>, UpdateStages.WithProtocolCustomSettings {
    }

    /**
     * Grouping of DdosCustomPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ddoscustompolicy update allowing to specify ProtocolCustomSettings.
         */
        interface WithProtocolCustomSettings {
            /**
             * Specifies protocolCustomSettings.
             * @param protocolCustomSettings The protocol-specific DDoS policy customization parameters
             * @return the next update stage
             */
            Update withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings);
        }

    }
}
