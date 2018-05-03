/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.CreateReviewsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.CreateJobOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddVideoFrameOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.GetVideoFramesOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.CreateVideoReviewsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddVideoFrameUrlOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddVideoFrameStreamOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.CreateReviewBodyItem;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.CreateVideoReviewsBodyItem;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Frames;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Job;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.JobId;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Review;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.TranscriptModerationBodyItem;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.VideoFrameBodyItem;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Reviews.
 */
public interface Reviews {
    /**
     * Returns review details for the review Id passed.
     *
     * @param teamName Your Team Name.
     * @param reviewId Id of the review.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Review object if successful.
     */
    Review getReview(String teamName, String reviewId);

    /**
     * Returns review details for the review Id passed.
     *
     * @param teamName Your Team Name.
     * @param reviewId Id of the review.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Review object
     */
    Observable<Review> getReviewAsync(String teamName, String reviewId);

    /**
     * Get the Job Details for a Job Id.
     *
     * @param teamName Your Team Name.
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Job object if successful.
     */
    Job getJobDetails(String teamName, String jobId);

    /**
     * Get the Job Details for a Job Id.
     *
     * @param teamName Your Team Name.
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Job object
     */
    Observable<Job> getJobDetailsAsync(String teamName, String jobId);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param urlContentType The content type.
     * @param createReviewBody Body for create reviews API
     * @param createReviewsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> createReviews(String teamName, String urlContentType, List<CreateReviewBodyItem> createReviewBody, CreateReviewsOptionalParameter createReviewsOptionalParameter);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param urlContentType The content type.
     * @param createReviewBody Body for create reviews API
     * @param createReviewsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    Observable<List<String>> createReviewsAsync(String teamName, String urlContentType, List<CreateReviewBodyItem> createReviewBody, CreateReviewsOptionalParameter createReviewsOptionalParameter);

    /**
     * A job Id will be returned for the content posted on this endpoint.
     *  Once the content is evaluated against the Workflow provided the review will be created or ignored based on
     *  the workflow expression.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;p&gt;
     *  &lt;h4&gt;Job Completion CallBack Sample&lt;/h4&gt;&lt;br/&gt;
     *  {&lt;br/&gt;
     *  "JobId": "&lt;Job Id&gt;,&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id, if the Job resulted in a Review to be created&gt;",&lt;br/&gt;
     *  "WorkFlowId": "default",&lt;br/&gt;
     *  "Status": "&lt;This will be one of Complete, InProgress, Error&gt;",&lt;br/&gt;
     *  "ContentType": "Image",&lt;br/&gt;
     *  "ContentId": "&lt;This is the ContentId that was specified on input&gt;",&lt;br/&gt;
     *  "CallBackType": "Job",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;
     *  &lt;p&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;&lt;br/&gt;
     *  {
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param contentType Image, Text or Video. Possible values include: 'Image', 'Text', 'Video'
     * @param contentId Id/Name to identify the content submitted.
     * @param workflowName Workflow Name that you want to invoke.
     * @param jobContentType The content type. Possible values include: 'application/json', 'image/jpeg'
     * @param contentValue Content to evaluate for a job.
     * @param createJobOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobId object if successful.
     */
    JobId createJob(String teamName, String contentType, String contentId, String workflowName, String jobContentType, String contentValue, CreateJobOptionalParameter createJobOptionalParameter);

    /**
     * A job Id will be returned for the content posted on this endpoint.
     *  Once the content is evaluated against the Workflow provided the review will be created or ignored based on
     *  the workflow expression.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;p&gt;
     *  &lt;h4&gt;Job Completion CallBack Sample&lt;/h4&gt;&lt;br/&gt;
     *  {&lt;br/&gt;
     *  "JobId": "&lt;Job Id&gt;,&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id, if the Job resulted in a Review to be created&gt;",&lt;br/&gt;
     *  "WorkFlowId": "default",&lt;br/&gt;
     *  "Status": "&lt;This will be one of Complete, InProgress, Error&gt;",&lt;br/&gt;
     *  "ContentType": "Image",&lt;br/&gt;
     *  "ContentId": "&lt;This is the ContentId that was specified on input&gt;",&lt;br/&gt;
     *  "CallBackType": "Job",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;
     *  &lt;p&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;&lt;br/&gt;
     *  {
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param contentType Image, Text or Video. Possible values include: 'Image', 'Text', 'Video'
     * @param contentId Id/Name to identify the content submitted.
     * @param workflowName Workflow Name that you want to invoke.
     * @param jobContentType The content type. Possible values include: 'application/json', 'image/jpeg'
     * @param contentValue Content to evaluate for a job.
     * @param createJobOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobId object
     */
    Observable<JobId> createJobAsync(String teamName, String contentType, String contentId, String workflowName, String jobContentType, String contentValue, CreateJobOptionalParameter createJobOptionalParameter);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param addVideoFrameOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addVideoFrame(String teamName, String reviewId, AddVideoFrameOptionalParameter addVideoFrameOptionalParameter);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param addVideoFrameOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the deferred object if successful.
     */
    Observable<Void> addVideoFrameAsync(String teamName, String reviewId, AddVideoFrameOptionalParameter addVideoFrameOptionalParameter);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param getVideoFramesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Frames object if successful.
     */
    Frames getVideoFrames(String teamName, String reviewId, GetVideoFramesOptionalParameter getVideoFramesOptionalParameter);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param getVideoFramesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Frames object
     */
    Observable<Frames> getVideoFramesAsync(String teamName, String reviewId, GetVideoFramesOptionalParameter getVideoFramesOptionalParameter);

    /**
     * Publish video review to make it available for review.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void publishVideoReview(String teamName, String reviewId);

    /**
     * Publish video review to make it available for review.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the deferred object if successful.
     */
    Observable<Void> publishVideoReviewAsync(String teamName, String reviewId);

    /**
     * This API adds a transcript screen text result file for a video review. Transcript screen text result file is a result of Screen Text API . In order to generate transcript screen text result file , a transcript file has to be screened for profanity using Screen Text API.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param contentType The content type.
     * @param transcriptModerationBody Body for add video transcript moderation result API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addVideoTranscriptModerationResult(String teamName, String reviewId, String contentType, List<TranscriptModerationBodyItem> transcriptModerationBody);

    /**
     * This API adds a transcript screen text result file for a video review. Transcript screen text result file is a result of Screen Text API . In order to generate transcript screen text result file , a transcript file has to be screened for profanity using Screen Text API.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param contentType The content type.
     * @param transcriptModerationBody Body for add video transcript moderation result API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the deferred object if successful.
     */
    Observable<Void> addVideoTranscriptModerationResultAsync(String teamName, String reviewId, String contentType, List<TranscriptModerationBodyItem> transcriptModerationBody);

    /**
     * This API adds a transcript file (text version of all the words spoken in a video) to a video review. The file should be a valid WebVTT format.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param vTTfile Transcript file of the video.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addVideoTranscript(String teamName, String reviewId, byte[] vTTfile);

    /**
     * This API adds a transcript file (text version of all the words spoken in a video) to a video review. The file should be a valid WebVTT format.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param vTTfile Transcript file of the video.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the deferred object if successful.
     */
    Observable<Void> addVideoTranscriptAsync(String teamName, String reviewId, byte[] vTTfile);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param contentType The content type.
     * @param createVideoReviewsBody Body for create reviews API
     * @param createVideoReviewsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> createVideoReviews(String teamName, String contentType, List<CreateVideoReviewsBodyItem> createVideoReviewsBody, CreateVideoReviewsOptionalParameter createVideoReviewsOptionalParameter);

    /**
     * The reviews created would show up for Reviewers on your team. As Reviewers complete reviewing, results of
     *  the Review would be POSTED (i.e. HTTP POST) on the specified CallBackEndpoint.
     *  &lt;h3&gt;CallBack Schemas &lt;/h3&gt;
     *  &lt;h4&gt;Review Completion CallBack Sample&lt;/h4&gt;
     *  &lt;p&gt;
     *  {&lt;br/&gt;
     *  "ReviewId": "&lt;Review Id&gt;",&lt;br/&gt;
     *  "ModifiedOn": "2016-10-11T22:36:32.9934851Z",&lt;br/&gt;
     *  "ModifiedBy": "&lt;Name of the Reviewer&gt;",&lt;br/&gt;
     *  "CallBackType": "Review",&lt;br/&gt;
     *  "ContentId": "&lt;The ContentId that was specified input&gt;",&lt;br/&gt;
     *  "Metadata": {&lt;br/&gt;
     *  "adultscore": "0.xxx",&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "racyscore": "0.xxx",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  },&lt;br/&gt;
     *  "ReviewerResultTags": {&lt;br/&gt;
     *  "a": "False",&lt;br/&gt;
     *  "r": "True"&lt;br/&gt;
     *  }&lt;br/&gt;
     *  }&lt;br/&gt;
     *  &lt;/p&gt;.
     *
     * @param teamName Your team name.
     * @param contentType The content type.
     * @param createVideoReviewsBody Body for create reviews API
     * @param createVideoReviewsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    Observable<List<String>> createVideoReviewsAsync(String teamName, String contentType, List<CreateVideoReviewsBodyItem> createVideoReviewsBody, CreateVideoReviewsOptionalParameter createVideoReviewsOptionalParameter);

    /**
     * Use this method to add frames for a video review.Timescale: This parameter is a factor which is used to
     *  convert the timestamp on a frame into milliseconds. Timescale is provided in the output of the Content
     *  Moderator video media processor on the Azure Media Services platform.Timescale in the Video Moderation
     *  output is Ticks/Second.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param contentType The content type.
     * @param videoFrameBody Body for add video frames API
     * @param addVideoFrameUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addVideoFrameUrl(String teamName, String reviewId, String contentType, List<VideoFrameBodyItem> videoFrameBody, AddVideoFrameUrlOptionalParameter addVideoFrameUrlOptionalParameter);

    /**
     * Use this method to add frames for a video review.Timescale: This parameter is a factor which is used to
     *  convert the timestamp on a frame into milliseconds. Timescale is provided in the output of the Content
     *  Moderator video media processor on the Azure Media Services platform.Timescale in the Video Moderation
     *  output is Ticks/Second.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param contentType The content type.
     * @param videoFrameBody Body for add video frames API
     * @param addVideoFrameUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the deferred object if successful.
     */
    Observable<Void> addVideoFrameUrlAsync(String teamName, String reviewId, String contentType, List<VideoFrameBodyItem> videoFrameBody, AddVideoFrameUrlOptionalParameter addVideoFrameUrlOptionalParameter);

    /**
     * Use this method to add frames for a video review.Timescale: This parameter is a factor which is used to
     *  convert the timestamp on a frame into milliseconds. Timescale is provided in the output of the Content
     *  Moderator video media processor on the Azure Media Services platform.Timescale in the Video Moderation
     *  output is Ticks/Second.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param contentType The content type.
     * @param frameImageZip Zip file containing frame images.
     * @param frameMetadata Metadata of the frame.
     * @param addVideoFrameStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addVideoFrameStream(String teamName, String reviewId, String contentType, byte[] frameImageZip, String frameMetadata, AddVideoFrameStreamOptionalParameter addVideoFrameStreamOptionalParameter);

    /**
     * Use this method to add frames for a video review.Timescale: This parameter is a factor which is used to
     *  convert the timestamp on a frame into milliseconds. Timescale is provided in the output of the Content
     *  Moderator video media processor on the Azure Media Services platform.Timescale in the Video Moderation
     *  output is Ticks/Second.
     *
     * @param teamName Your team name.
     * @param reviewId Id of the review.
     * @param contentType The content type.
     * @param frameImageZip Zip file containing frame images.
     * @param frameMetadata Metadata of the frame.
     * @param addVideoFrameStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the deferred object if successful.
     */
    Observable<Void> addVideoFrameStreamAsync(String teamName, String reviewId, String contentType, byte[] frameImageZip, String frameMetadata, AddVideoFrameStreamOptionalParameter addVideoFrameStreamOptionalParameter);

}
