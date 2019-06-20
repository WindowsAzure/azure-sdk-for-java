/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.RecipientUserContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;

/**
 * Type representing RecipientUserContract.
 */
public interface RecipientUserContract extends HasInner<RecipientUserContractInner>, Indexable, Updatable<RecipientUserContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userId value.
     */
    String userId();

    /**
     * The entirety of the RecipientUserContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNotification, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RecipientUserContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RecipientUserContract definition.
         */
        interface Blank extends WithNotification {
        }

        /**
         * The stage of the recipientusercontract definition allowing to specify Notification.
         */
        interface WithNotification {
           /**
            * Specifies resourceGroupName, serviceName, notificationName.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
            * @return the next definition stage
            */
            WithCreate withExistingNotification(String resourceGroupName, String serviceName, NotificationName notificationName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RecipientUserContract> {
        }
    }
    /**
     * The template for a RecipientUserContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RecipientUserContract> {
    }

    /**
     * Grouping of RecipientUserContract update stages.
     */
    interface UpdateStages {
    }
}
