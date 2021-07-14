// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupInner;
import java.util.List;

/** An immutable client-side representation of AdaptiveApplicationControlGroup. */
public interface AdaptiveApplicationControlGroup {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the enforcementMode property: The application control policy enforcement/protection mode of the machine
     * group.
     *
     * @return the enforcementMode value.
     */
    EnforcementMode enforcementMode();

    /**
     * Gets the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script are used for
     * Windows, Executable is used for Linux.
     *
     * @return the protectionMode value.
     */
    ProtectionMode protectionMode();

    /**
     * Gets the configurationStatus property: The configuration status of the machines group or machine or rule.
     *
     * @return the configurationStatus value.
     */
    ConfigurationStatus configurationStatus();

    /**
     * Gets the recommendationStatus property: The initial recommendation status of the machine group or machine.
     *
     * @return the recommendationStatus value.
     */
    RecommendationStatus recommendationStatus();

    /**
     * Gets the issues property: The issues property.
     *
     * @return the issues value.
     */
    List<AdaptiveApplicationControlIssueSummary> issues();

    /**
     * Gets the sourceSystem property: The source type of the machine group.
     *
     * @return the sourceSystem value.
     */
    SourceSystem sourceSystem();

    /**
     * Gets the vmRecommendations property: The vmRecommendations property.
     *
     * @return the vmRecommendations value.
     */
    List<VmRecommendation> vmRecommendations();

    /**
     * Gets the pathRecommendations property: The pathRecommendations property.
     *
     * @return the pathRecommendations value.
     */
    List<PathRecommendation> pathRecommendations();

    /**
     * Gets the location property: Location where the resource is stored.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupInner object.
     *
     * @return the inner object.
     */
    AdaptiveApplicationControlGroupInner innerModel();

    /** The entirety of the AdaptiveApplicationControlGroup definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The AdaptiveApplicationControlGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the AdaptiveApplicationControlGroup definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the AdaptiveApplicationControlGroup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies ascLocation.
             *
             * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
             *     locations.
             * @return the next definition stage.
             */
            WithCreate withExistingLocation(String ascLocation);
        }
        /**
         * The stage of the AdaptiveApplicationControlGroup definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithEnforcementMode,
                DefinitionStages.WithProtectionMode,
                DefinitionStages.WithVmRecommendations,
                DefinitionStages.WithPathRecommendations {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AdaptiveApplicationControlGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AdaptiveApplicationControlGroup create(Context context);
        }
        /** The stage of the AdaptiveApplicationControlGroup definition allowing to specify enforcementMode. */
        interface WithEnforcementMode {
            /**
             * Specifies the enforcementMode property: The application control policy enforcement/protection mode of the
             * machine group.
             *
             * @param enforcementMode The application control policy enforcement/protection mode of the machine group.
             * @return the next definition stage.
             */
            WithCreate withEnforcementMode(EnforcementMode enforcementMode);
        }
        /** The stage of the AdaptiveApplicationControlGroup definition allowing to specify protectionMode. */
        interface WithProtectionMode {
            /**
             * Specifies the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script
             * are used for Windows, Executable is used for Linux..
             *
             * @param protectionMode The protection mode of the collection/file types. Exe/Msi/Script are used for
             *     Windows, Executable is used for Linux.
             * @return the next definition stage.
             */
            WithCreate withProtectionMode(ProtectionMode protectionMode);
        }
        /** The stage of the AdaptiveApplicationControlGroup definition allowing to specify vmRecommendations. */
        interface WithVmRecommendations {
            /**
             * Specifies the vmRecommendations property: The vmRecommendations property..
             *
             * @param vmRecommendations The vmRecommendations property.
             * @return the next definition stage.
             */
            WithCreate withVmRecommendations(List<VmRecommendation> vmRecommendations);
        }
        /** The stage of the AdaptiveApplicationControlGroup definition allowing to specify pathRecommendations. */
        interface WithPathRecommendations {
            /**
             * Specifies the pathRecommendations property: The pathRecommendations property..
             *
             * @param pathRecommendations The pathRecommendations property.
             * @return the next definition stage.
             */
            WithCreate withPathRecommendations(List<PathRecommendation> pathRecommendations);
        }
    }
    /**
     * Begins update for the AdaptiveApplicationControlGroup resource.
     *
     * @return the stage of resource update.
     */
    AdaptiveApplicationControlGroup.Update update();

    /** The template for AdaptiveApplicationControlGroup update. */
    interface Update
        extends UpdateStages.WithEnforcementMode,
            UpdateStages.WithProtectionMode,
            UpdateStages.WithVmRecommendations,
            UpdateStages.WithPathRecommendations {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AdaptiveApplicationControlGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AdaptiveApplicationControlGroup apply(Context context);
    }
    /** The AdaptiveApplicationControlGroup update stages. */
    interface UpdateStages {
        /** The stage of the AdaptiveApplicationControlGroup update allowing to specify enforcementMode. */
        interface WithEnforcementMode {
            /**
             * Specifies the enforcementMode property: The application control policy enforcement/protection mode of the
             * machine group.
             *
             * @param enforcementMode The application control policy enforcement/protection mode of the machine group.
             * @return the next definition stage.
             */
            Update withEnforcementMode(EnforcementMode enforcementMode);
        }
        /** The stage of the AdaptiveApplicationControlGroup update allowing to specify protectionMode. */
        interface WithProtectionMode {
            /**
             * Specifies the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script
             * are used for Windows, Executable is used for Linux..
             *
             * @param protectionMode The protection mode of the collection/file types. Exe/Msi/Script are used for
             *     Windows, Executable is used for Linux.
             * @return the next definition stage.
             */
            Update withProtectionMode(ProtectionMode protectionMode);
        }
        /** The stage of the AdaptiveApplicationControlGroup update allowing to specify vmRecommendations. */
        interface WithVmRecommendations {
            /**
             * Specifies the vmRecommendations property: The vmRecommendations property..
             *
             * @param vmRecommendations The vmRecommendations property.
             * @return the next definition stage.
             */
            Update withVmRecommendations(List<VmRecommendation> vmRecommendations);
        }
        /** The stage of the AdaptiveApplicationControlGroup update allowing to specify pathRecommendations. */
        interface WithPathRecommendations {
            /**
             * Specifies the pathRecommendations property: The pathRecommendations property..
             *
             * @param pathRecommendations The pathRecommendations property.
             * @return the next definition stage.
             */
            Update withPathRecommendations(List<PathRecommendation> pathRecommendations);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AdaptiveApplicationControlGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AdaptiveApplicationControlGroup refresh(Context context);
}
