/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.formrecognizer;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.cognitiveservices.formrecognizer.models.AnalyzeResult;
import com.microsoft.azure.cognitiveservices.formrecognizer.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.formrecognizer.models.KeysResult;
import com.microsoft.azure.cognitiveservices.formrecognizer.models.ModelResult;
import com.microsoft.azure.cognitiveservices.formrecognizer.models.ModelsResult;
import com.microsoft.azure.cognitiveservices.formrecognizer.models.TrainResult;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * The interface for CognitiveServiceFormRecognizerAPIV1Preview class.
 */
public interface CognitiveServiceFormRecognizerAPIV1Preview {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com)..
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus2.api.cognitive.microsoft.com)..
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    CognitiveServiceFormRecognizerAPIV1Preview withEndpoint(String endpoint);

    /**
     * Gets The preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets The preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    CognitiveServiceFormRecognizerAPIV1Preview withAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    CognitiveServiceFormRecognizerAPIV1Preview withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    CognitiveServiceFormRecognizerAPIV1Preview withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Train Model.
     * The train request must include a source parameter that is either an externally accessible Azure Storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration
      setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained are expected to be under the source. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg' and 'image/png'."
      Other content is ignored when training a model.
     *
     * @param source Get or set source path.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrainResult object if successful.
     */
    TrainResult trainCustomModel(String source);

    /**
     * Train Model.
     * The train request must include a source parameter that is either an externally accessible Azure Storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration
      setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained are expected to be under the source. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg' and 'image/png'."
      Other content is ignored when training a model.
     *
     * @param source Get or set source path.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrainResult> trainCustomModelAsync(String source, final ServiceCallback<TrainResult> serviceCallback);

    /**
     * Train Model.
     * The train request must include a source parameter that is either an externally accessible Azure Storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration
      setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained are expected to be under the source. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg' and 'image/png'."
      Other content is ignored when training a model.
     *
     * @param source Get or set source path.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrainResult object
     */
    Observable<TrainResult> trainCustomModelAsync(String source);

    /**
     * Train Model.
     * The train request must include a source parameter that is either an externally accessible Azure Storage blob container Uri (preferably a Shared Access Signature Uri) or valid path to a data folder in a locally mounted drive. When local paths are specified, they must follow the Linux/Unix path format and be an absolute path rooted to the input mount configuration
      setting value e.g., if '{Mounts:Input}' configuration setting value is '/input' then a valid source path would be '/input/contosodataset'. All data to be trained are expected to be under the source. Models are trained using documents that are of the following content type - 'application/pdf', 'image/jpeg' and 'image/png'."
      Other content is ignored when training a model.
     *
     * @param source Get or set source path.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrainResult object
     */
    Observable<ServiceResponse<TrainResult>> trainCustomModelWithServiceResponseAsync(String source);

    /**
     * Get Keys.
     * Use the API to retrieve the keys that were
      extracted by the specified model.
     *
     * @param id Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KeysResult object if successful.
     */
    KeysResult getExtractedKeysByCustomModelId(UUID id);

    /**
     * Get Keys.
     * Use the API to retrieve the keys that were
      extracted by the specified model.
     *
     * @param id Model identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<KeysResult> getExtractedKeysByCustomModelIdAsync(UUID id, final ServiceCallback<KeysResult> serviceCallback);

    /**
     * Get Keys.
     * Use the API to retrieve the keys that were
      extracted by the specified model.
     *
     * @param id Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KeysResult object
     */
    Observable<KeysResult> getExtractedKeysByCustomModelIdAsync(UUID id);

    /**
     * Get Keys.
     * Use the API to retrieve the keys that were
      extracted by the specified model.
     *
     * @param id Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KeysResult object
     */
    Observable<ServiceResponse<KeysResult>> getExtractedKeysByCustomModelIdWithServiceResponseAsync(UUID id);

    /**
     * Get Models.
     * Get information about all trained models.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ModelsResult object if successful.
     */
    ModelsResult getListOfCustomModels();

    /**
     * Get Models.
     * Get information about all trained models.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ModelsResult> getListOfCustomModelsAsync(final ServiceCallback<ModelsResult> serviceCallback);

    /**
     * Get Models.
     * Get information about all trained models.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelsResult object
     */
    Observable<ModelsResult> getListOfCustomModelsAsync();

    /**
     * Get Models.
     * Get information about all trained models.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelsResult object
     */
    Observable<ServiceResponse<ModelsResult>> getListOfCustomModelsWithServiceResponseAsync();

    /**
     * Get Model.
     * Get information about a model.
     *
     * @param id Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ModelResult object if successful.
     */
    ModelResult getCustomModelById(UUID id);

    /**
     * Get Model.
     * Get information about a model.
     *
     * @param id Model identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ModelResult> getCustomModelByIdAsync(UUID id, final ServiceCallback<ModelResult> serviceCallback);

    /**
     * Get Model.
     * Get information about a model.
     *
     * @param id Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelResult object
     */
    Observable<ModelResult> getCustomModelByIdAsync(UUID id);

    /**
     * Get Model.
     * Get information about a model.
     *
     * @param id Model identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelResult object
     */
    Observable<ServiceResponse<ModelResult>> getCustomModelByIdWithServiceResponseAsync(UUID id);

    /**
     * Delete Model.
     * Delete model artifacts.
     *
     * @param id The identifier of the model to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteCustomModelById(UUID id);

    /**
     * Delete Model.
     * Delete model artifacts.
     *
     * @param id The identifier of the model to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteCustomModelByIdAsync(UUID id, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete Model.
     * Delete model artifacts.
     *
     * @param id The identifier of the model to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteCustomModelByIdAsync(UUID id);

    /**
     * Delete Model.
     * Delete model artifacts.
     *
     * @param id The identifier of the model to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteCustomModelByIdWithServiceResponseAsync(UUID id);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyzeResult object if successful.
     */
    AnalyzeResult analyzeCustomModel(UUID id, byte[] formStream);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyzeResult> analyzeCustomModelAsync(UUID id, byte[] formStream, final ServiceCallback<AnalyzeResult> serviceCallback);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyzeResult object
     */
    Observable<AnalyzeResult> analyzeCustomModelAsync(UUID id, byte[] formStream);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyzeResult object
     */
    Observable<ServiceResponse<AnalyzeResult>> analyzeCustomModelWithServiceResponseAsync(UUID id, byte[] formStream);
    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @param keys An optional list of known keys to extract the values for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyzeResult object if successful.
     */
    AnalyzeResult analyzeCustomModel(UUID id, byte[] formStream, List<String> keys);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @param keys An optional list of known keys to extract the values for.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyzeResult> analyzeCustomModelAsync(UUID id, byte[] formStream, List<String> keys, final ServiceCallback<AnalyzeResult> serviceCallback);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @param keys An optional list of known keys to extract the values for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyzeResult object
     */
    Observable<AnalyzeResult> analyzeCustomModelAsync(UUID id, byte[] formStream, List<String> keys);

    /**
     * Analyze Form.
     * The document to analyze must be of a supported content type - 'application/pdf', 'image/jpeg' or 'image/png'. The response contains not just the extracted information of the analyzed form but also information about content that was not extracted along with a reason.
     *
     * @param id Model Identifier to analyze the document with.
     * @param formStream Upload content of type 'application/pdf', 'image/jpeg' or 'image/png' for processing.
     * @param keys An optional list of known keys to extract the values for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyzeResult object
     */
    Observable<ServiceResponse<AnalyzeResult>> analyzeCustomModelWithServiceResponseAsync(UUID id, byte[] formStream, List<String> keys);

}
