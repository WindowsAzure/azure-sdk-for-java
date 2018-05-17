/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.GetPatternsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.GetIntentPatternsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PatternRuleCreateObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PatternRuleInfo;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PatternRuleUpdateObject;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Patterns.
 */
public interface Patterns {

    /**
     * Adds one pattern to the specified application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param pattern The input pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PatternRuleInfo object if successful.
     */
    PatternRuleInfo addPattern(UUID appId, String versionId, PatternRuleCreateObject pattern);

    /**
     * Adds one pattern to the specified application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param pattern The input pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PatternRuleInfo object
     */
    Observable<PatternRuleInfo> addPatternAsync(UUID appId, String versionId, PatternRuleCreateObject pattern);


    /**
     * Returns an application version's patterns.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param getPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> getPatterns(UUID appId, String versionId, GetPatternsOptionalParameter getPatternsOptionalParameter);

    /**
     * Returns an application version's patterns.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param getPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> getPatternsAsync(UUID appId, String versionId, GetPatternsOptionalParameter getPatternsOptionalParameter);


    /**
     * Updates patterns.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns An array represents the patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> updatePatterns(UUID appId, String versionId, List<PatternRuleUpdateObject> patterns);

    /**
     * Updates patterns.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns An array represents the patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> updatePatternsAsync(UUID appId, String versionId, List<PatternRuleUpdateObject> patterns);



    /**
     * Adds a batch of patterns to the specified application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns A JSON array containing patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> batchAddPatterns(UUID appId, String versionId, List<PatternRuleCreateObject> patterns);

    /**
     * Adds a batch of patterns to the specified application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns A JSON array containing patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> batchAddPatternsAsync(UUID appId, String versionId, List<PatternRuleCreateObject> patterns);



    /**
     * Deletes the patterns with the specified IDs.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternIds The patterns IDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus deletePatterns(UUID appId, String versionId, List<UUID> patternIds);

    /**
     * Deletes the patterns with the specified IDs.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternIds The patterns IDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deletePatternsAsync(UUID appId, String versionId, List<UUID> patternIds);



    /**
     * Updates a pattern.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @param pattern An object representing a pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PatternRuleInfo object if successful.
     */
    PatternRuleInfo updatePattern(UUID appId, String versionId, UUID patternId, PatternRuleUpdateObject pattern);

    /**
     * Updates a pattern.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @param pattern An object representing a pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PatternRuleInfo object
     */
    Observable<PatternRuleInfo> updatePatternAsync(UUID appId, String versionId, UUID patternId, PatternRuleUpdateObject pattern);



    /**
     * Deletes the pattern with the specified ID.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus deletePattern(UUID appId, String versionId, UUID patternId);

    /**
     * Deletes the pattern with the specified ID.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deletePatternAsync(UUID appId, String versionId, UUID patternId);


    /**
     * Returns patterns to be retrieved for the specific intent.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param intentId The intent classifier ID.
     * @param getIntentPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> getIntentPatterns(UUID appId, String versionId, UUID intentId, GetIntentPatternsOptionalParameter getIntentPatternsOptionalParameter);

    /**
     * Returns patterns to be retrieved for the specific intent.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param intentId The intent classifier ID.
     * @param getIntentPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> getIntentPatternsAsync(UUID appId, String versionId, UUID intentId, GetIntentPatternsOptionalParameter getIntentPatternsOptionalParameter);

}
