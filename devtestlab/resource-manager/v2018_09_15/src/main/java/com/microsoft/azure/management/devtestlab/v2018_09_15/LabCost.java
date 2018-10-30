/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.LabCostInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.DevTestLabManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing LabCost.
 */
public interface LabCost extends HasInner<LabCostInner>, Indexable, Refreshable<LabCost>, Updatable<LabCost.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the currencyCode value.
     */
    String currencyCode();

    /**
     * @return the endDateTime value.
     */
    DateTime endDateTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the labCostDetails value.
     */
    List<LabCostDetailsProperties> labCostDetails();

    /**
     * @return the labCostSummary value.
     */
    LabCostSummaryProperties labCostSummary();

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
    String provisioningState();

    /**
     * @return the resourceCosts value.
     */
    List<LabResourceCostProperties> resourceCosts();

    /**
     * @return the startDateTime value.
     */
    DateTime startDateTime();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetCost value.
     */
    TargetCostProperties targetCost();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * The entirety of the LabCost definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LabCost definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LabCost definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the labcost definition allowing to specify Lab.
         */
        interface WithLab {
           /**
            * Specifies resourceGroupName, labName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @return the next definition stage
            */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the labcost definition allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate The creation date of the cost
             * @return the next definition stage
             */
            WithCreate withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the labcost definition allowing to specify CurrencyCode.
         */
        interface WithCurrencyCode {
            /**
             * Specifies currencyCode.
             * @param currencyCode The currency code of the cost
             * @return the next definition stage
             */
            WithCreate withCurrencyCode(String currencyCode);
        }

        /**
         * The stage of the labcost definition allowing to specify EndDateTime.
         */
        interface WithEndDateTime {
            /**
             * Specifies endDateTime.
             * @param endDateTime The end time of the cost data
             * @return the next definition stage
             */
            WithCreate withEndDateTime(DateTime endDateTime);
        }

        /**
         * The stage of the labcost definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the labcost definition allowing to specify StartDateTime.
         */
        interface WithStartDateTime {
            /**
             * Specifies startDateTime.
             * @param startDateTime The start time of the cost data
             * @return the next definition stage
             */
            WithCreate withStartDateTime(DateTime startDateTime);
        }

        /**
         * The stage of the labcost definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the labcost definition allowing to specify TargetCost.
         */
        interface WithTargetCost {
            /**
             * Specifies targetCost.
             * @param targetCost The target cost properties
             * @return the next definition stage
             */
            WithCreate withTargetCost(TargetCostProperties targetCost);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LabCost>, DefinitionStages.WithCreatedDate, DefinitionStages.WithCurrencyCode, DefinitionStages.WithEndDateTime, DefinitionStages.WithLocation, DefinitionStages.WithStartDateTime, DefinitionStages.WithTags, DefinitionStages.WithTargetCost {
        }
    }
    /**
     * The template for a LabCost update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LabCost>, UpdateStages.WithCreatedDate, UpdateStages.WithCurrencyCode, UpdateStages.WithEndDateTime, UpdateStages.WithLocation, UpdateStages.WithStartDateTime, UpdateStages.WithTags, UpdateStages.WithTargetCost {
    }

    /**
     * Grouping of LabCost update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the labcost update allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate The creation date of the cost
             * @return the next update stage
             */
            Update withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the labcost update allowing to specify CurrencyCode.
         */
        interface WithCurrencyCode {
            /**
             * Specifies currencyCode.
             * @param currencyCode The currency code of the cost
             * @return the next update stage
             */
            Update withCurrencyCode(String currencyCode);
        }

        /**
         * The stage of the labcost update allowing to specify EndDateTime.
         */
        interface WithEndDateTime {
            /**
             * Specifies endDateTime.
             * @param endDateTime The end time of the cost data
             * @return the next update stage
             */
            Update withEndDateTime(DateTime endDateTime);
        }

        /**
         * The stage of the labcost update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the labcost update allowing to specify StartDateTime.
         */
        interface WithStartDateTime {
            /**
             * Specifies startDateTime.
             * @param startDateTime The start time of the cost data
             * @return the next update stage
             */
            Update withStartDateTime(DateTime startDateTime);
        }

        /**
         * The stage of the labcost update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the labcost update allowing to specify TargetCost.
         */
        interface WithTargetCost {
            /**
             * Specifies targetCost.
             * @param targetCost The target cost properties
             * @return the next update stage
             */
            Update withTargetCost(TargetCostProperties targetCost);
        }

    }
}
