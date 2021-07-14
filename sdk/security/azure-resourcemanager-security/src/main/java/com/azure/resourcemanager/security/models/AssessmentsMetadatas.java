// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AssessmentsMetadatas. */
public interface AssessmentsMetadatas {
    /**
     * Get metadata information on all assessment types.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types.
     */
    PagedIterable<SecurityAssessmentMetadata> list();

    /**
     * Get metadata information on all assessment types.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types.
     */
    PagedIterable<SecurityAssessmentMetadata> list(Context context);

    /**
     * Get metadata information on an assessment type.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type.
     */
    SecurityAssessmentMetadata get(String assessmentMetadataName);

    /**
     * Get metadata information on an assessment type.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type.
     */
    Response<SecurityAssessmentMetadata> getWithResponse(String assessmentMetadataName, Context context);

    /**
     * Get metadata information on all assessment types in a specific subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types in a specific subscription.
     */
    PagedIterable<SecurityAssessmentMetadata> listBySubscription();

    /**
     * Get metadata information on all assessment types in a specific subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types in a specific subscription.
     */
    PagedIterable<SecurityAssessmentMetadata> listBySubscription(Context context);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    SecurityAssessmentMetadata getInSubscription(String assessmentMetadataName);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    Response<SecurityAssessmentMetadata> getInSubscriptionWithResponse(String assessmentMetadataName, Context context);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInSubscription(String assessmentMetadataName);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteInSubscriptionWithResponse(String assessmentMetadataName, Context context);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    SecurityAssessmentMetadata getInSubscriptionById(String id);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    Response<SecurityAssessmentMetadata> getInSubscriptionByIdWithResponse(String id, Context context);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInSubscriptionById(String id);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteInSubscriptionByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SecurityAssessmentMetadata resource.
     *
     * @param name resource name.
     * @return the first stage of the new SecurityAssessmentMetadata definition.
     */
    SecurityAssessmentMetadata.DefinitionStages.Blank define(String name);
}
