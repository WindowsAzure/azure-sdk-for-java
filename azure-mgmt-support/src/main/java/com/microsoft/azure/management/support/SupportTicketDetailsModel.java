/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.support.implementation.SupportTicketDetailsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.support.implementation.SupportManager;
import org.joda.time.DateTime;

/**
 * Type representing SupportTicketDetailsModel.
 */
public interface SupportTicketDetailsModel extends HasInner<SupportTicketDetailsInner>, Indexable, Updatable<SupportTicketDetailsModel.Update>, HasManager<SupportManager> {
    /**
     * @return the contactDetails value.
     */
    ContactProfile contactDetails();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the enrollmentId value.
     */
    String enrollmentId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the modifiedDate value.
     */
    DateTime modifiedDate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the problemClassificationDisplayName value.
     */
    String problemClassificationDisplayName();

    /**
     * @return the problemClassificationId value.
     */
    String problemClassificationId();

    /**
     * @return the problemStartTime value.
     */
    DateTime problemStartTime();

    /**
     * @return the productionOutage value.
     */
    Boolean productionOutage();

    /**
     * @return the quotaTicketDetails value.
     */
    QuotaTicketDetails quotaTicketDetails();

    /**
     * @return the require24X7Response value.
     */
    Boolean require24X7Response();

    /**
     * @return the serviceDisplayName value.
     */
    String serviceDisplayName();

    /**
     * @return the serviceId value.
     */
    String serviceId();

    /**
     * @return the serviceLevelAgreement value.
     */
    ServiceLevelAgreement serviceLevelAgreement();

    /**
     * @return the severity value.
     */
    SeverityLevel severity();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the supportEngineer value.
     */
    SupportEngineer supportEngineer();

    /**
     * @return the supportPlanType value.
     */
    String supportPlanType();

    /**
     * @return the supportTicketId value.
     */
    String supportTicketId();

    /**
     * @return the technicalTicketDetails value.
     */
    TechnicalTicketDetails technicalTicketDetails();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a SupportTicketDetailsModel update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SupportTicketDetailsModel>, UpdateStages.WithContactDetails, UpdateStages.WithSeverity {
    }

    /**
     * Grouping of SupportTicketDetailsModel update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the supportticketdetailsmodel update allowing to specify ContactDetails.
         */
        interface WithContactDetails {
            /**
             * Specifies contactDetails.
             * @param contactDetails Contact details to be updated on the support ticket
             * @return the next update stage
             */
            Update withContactDetails(UpdateContactProfile contactDetails);
        }

        /**
         * The stage of the supportticketdetailsmodel update allowing to specify Severity.
         */
        interface WithSeverity {
            /**
             * Specifies severity.
             * @param severity Severity level. Possible values include: 'minimal', 'moderate', 'critical'
             * @return the next update stage
             */
            Update withSeverity(SeverityLevel severity);
        }

    }
}
