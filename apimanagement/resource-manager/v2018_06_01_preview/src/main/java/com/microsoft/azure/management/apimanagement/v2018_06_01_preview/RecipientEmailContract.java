/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.RecipientEmailContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;

/**
 * Type representing RecipientEmailContract.
 */
public interface RecipientEmailContract extends HasInner<RecipientEmailContractInner>, Indexable, Updatable<RecipientEmailContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the email value.
     */
    String email();

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
     * The entirety of the RecipientEmailContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNotification, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RecipientEmailContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RecipientEmailContract definition.
         */
        interface Blank extends WithNotification {
        }

        /**
         * The stage of the recipientemailcontract definition allowing to specify Notification.
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
        interface WithCreate extends Creatable<RecipientEmailContract> {
        }
    }
    /**
     * The template for a RecipientEmailContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RecipientEmailContract> {
    }

    /**
     * Grouping of RecipientEmailContract update stages.
     */
    interface UpdateStages {
    }
}
