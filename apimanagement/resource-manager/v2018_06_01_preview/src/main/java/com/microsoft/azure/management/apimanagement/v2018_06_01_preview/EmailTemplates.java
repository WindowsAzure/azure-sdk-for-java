/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.EmailTemplatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EmailTemplates.
 */
public interface EmailTemplates extends SupportsCreating<EmailTemplateContract.DefinitionStages.Blank>, HasInner<EmailTemplatesInner> {
    /**
     * Lists a collection of properties defined within a service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EmailTemplateContract> listByServiceAsync(final String resourceGroupName, final String serviceName);

    /**
     * Gets the entity state (Etag) version of the email template specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier. Possible values include: 'applicationApprovedNotificationMessage', 'accountClosedDeveloper', 'quotaLimitApproachingDeveloperNotificationMessage', 'newDeveloperNotificationMessage', 'emailChangeIdentityDefault', 'inviteUserNotificationMessage', 'newCommentNotificationMessage', 'confirmSignUpIdentityDefault', 'newIssueNotificationMessage', 'purchaseDeveloperNotificationMessage', 'passwordResetIdentityDefault', 'passwordResetByAdminNotificationMessage', 'rejectDeveloperNotificationMessage', 'requestDeveloperNotificationMessage'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, TemplateName templateName);

    /**
     * Gets the details of the email template specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier. Possible values include: 'applicationApprovedNotificationMessage', 'accountClosedDeveloper', 'quotaLimitApproachingDeveloperNotificationMessage', 'newDeveloperNotificationMessage', 'emailChangeIdentityDefault', 'inviteUserNotificationMessage', 'newCommentNotificationMessage', 'confirmSignUpIdentityDefault', 'newIssueNotificationMessage', 'purchaseDeveloperNotificationMessage', 'passwordResetIdentityDefault', 'passwordResetByAdminNotificationMessage', 'rejectDeveloperNotificationMessage', 'requestDeveloperNotificationMessage'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EmailTemplateContract> getAsync(String resourceGroupName, String serviceName, TemplateName templateName);

    /**
     * Reset the Email Template to default template provided by the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param templateName Email Template Name Identifier. Possible values include: 'applicationApprovedNotificationMessage', 'accountClosedDeveloper', 'quotaLimitApproachingDeveloperNotificationMessage', 'newDeveloperNotificationMessage', 'emailChangeIdentityDefault', 'inviteUserNotificationMessage', 'newCommentNotificationMessage', 'confirmSignUpIdentityDefault', 'newIssueNotificationMessage', 'purchaseDeveloperNotificationMessage', 'passwordResetIdentityDefault', 'passwordResetByAdminNotificationMessage', 'rejectDeveloperNotificationMessage', 'requestDeveloperNotificationMessage'
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, TemplateName templateName, String ifMatch);

}
