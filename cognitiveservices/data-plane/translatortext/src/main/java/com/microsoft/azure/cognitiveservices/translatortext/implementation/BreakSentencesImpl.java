/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.translatortext.BreakSentences;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.translatortext.models.BreakSentenceSuccessItem;
import com.microsoft.azure.cognitiveservices.translatortext.models.BreakSentenceTextInput;
import com.microsoft.azure.cognitiveservices.translatortext.models.ErrorMessageException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BreakSentences.
 */
public class BreakSentencesImpl implements BreakSentences {
    /** The Retrofit service to perform REST calls. */
    private BreakSentencesService service;
    /** The service client containing this operation class. */
    private TranslatorTextClientImpl client;

    /**
     * Initializes an instance of BreakSentencesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BreakSentencesImpl(Retrofit retrofit, TranslatorTextClientImpl client) {
        this.service = retrofit.create(BreakSentencesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BreakSentences to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BreakSentencesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.translatortext.BreakSentences breakSentencePost" })
        @POST("BreakSentence")
        Observable<Response<ResponseBody>> breakSentencePost(@Query("api-version") String apiVersion, @Query("Language") String language, @Query("Script") String script, @Header("ClientTraceId") String clientTraceId, @Body List<BreakSentenceTextInput> text, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;BreakSentenceSuccessItem&gt; object if successful.
     */
    public List<BreakSentenceSuccessItem> breakSentencePost(String apiVersion, List<BreakSentenceTextInput> text) {
        return breakSentencePostWithServiceResponseAsync(apiVersion, text).toBlocking().single().body();
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BreakSentenceSuccessItem>> breakSentencePostAsync(String apiVersion, List<BreakSentenceTextInput> text, final ServiceCallback<List<BreakSentenceSuccessItem>> serviceCallback) {
        return ServiceFuture.fromResponse(breakSentencePostWithServiceResponseAsync(apiVersion, text), serviceCallback);
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BreakSentenceSuccessItem&gt; object
     */
    public Observable<List<BreakSentenceSuccessItem>> breakSentencePostAsync(String apiVersion, List<BreakSentenceTextInput> text) {
        return breakSentencePostWithServiceResponseAsync(apiVersion, text).map(new Func1<ServiceResponse<List<BreakSentenceSuccessItem>>, List<BreakSentenceSuccessItem>>() {
            @Override
            public List<BreakSentenceSuccessItem> call(ServiceResponse<List<BreakSentenceSuccessItem>> response) {
                return response.body();
            }
        });
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BreakSentenceSuccessItem&gt; object
     */
    public Observable<ServiceResponse<List<BreakSentenceSuccessItem>>> breakSentencePostWithServiceResponseAsync(String apiVersion, List<BreakSentenceTextInput> text) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        if (text == null) {
            throw new IllegalArgumentException("Parameter text is required and cannot be null.");
        }
        Validator.validate(text);
        final String language = null;
        final String script = null;
        final String clientTraceId = null;
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.breakSentencePost(apiVersion, language, script, clientTraceId, text, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<BreakSentenceSuccessItem>>>>() {
                @Override
                public Observable<ServiceResponse<List<BreakSentenceSuccessItem>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<BreakSentenceSuccessItem>> clientResponse = breakSentencePostDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param language Language tag of the language of the input text. If not specified, Translator will apply automatic language detection.
     * @param script Script identifier of the script used by the input text. If a script is not specified, the default script of the language will be assumed.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;BreakSentenceSuccessItem&gt; object if successful.
     */
    public List<BreakSentenceSuccessItem> breakSentencePost(String apiVersion, List<BreakSentenceTextInput> text, String language, String script, String clientTraceId) {
        return breakSentencePostWithServiceResponseAsync(apiVersion, text, language, script, clientTraceId).toBlocking().single().body();
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param language Language tag of the language of the input text. If not specified, Translator will apply automatic language detection.
     * @param script Script identifier of the script used by the input text. If a script is not specified, the default script of the language will be assumed.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BreakSentenceSuccessItem>> breakSentencePostAsync(String apiVersion, List<BreakSentenceTextInput> text, String language, String script, String clientTraceId, final ServiceCallback<List<BreakSentenceSuccessItem>> serviceCallback) {
        return ServiceFuture.fromResponse(breakSentencePostWithServiceResponseAsync(apiVersion, text, language, script, clientTraceId), serviceCallback);
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param language Language tag of the language of the input text. If not specified, Translator will apply automatic language detection.
     * @param script Script identifier of the script used by the input text. If a script is not specified, the default script of the language will be assumed.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BreakSentenceSuccessItem&gt; object
     */
    public Observable<List<BreakSentenceSuccessItem>> breakSentencePostAsync(String apiVersion, List<BreakSentenceTextInput> text, String language, String script, String clientTraceId) {
        return breakSentencePostWithServiceResponseAsync(apiVersion, text, language, script, clientTraceId).map(new Func1<ServiceResponse<List<BreakSentenceSuccessItem>>, List<BreakSentenceSuccessItem>>() {
            @Override
            public List<BreakSentenceSuccessItem> call(ServiceResponse<List<BreakSentenceSuccessItem>> response) {
                return response.body();
            }
        });
    }

    /**
     * Identifies the position of sentence boundaries in a piece of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Sentence boundaries are computed for the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     * If the `language` query parameter is specified, then all array elements must be in the same language. Otherwise, language auto-detection is applied to each array element independently.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `sentLen`- An array of integers representing the lengths of the sentences in the text element. The length of the array is the number of sentences, and the values are the length of each sentence.
     * `detectedLanguage`- An object describing the detected language through the following properties
       * `language`- Code of the detected language.
       * `score`- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * Note that the `detectedLanguage` property is only present in the result object when language auto-detection is requested.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param language Language tag of the language of the input text. If not specified, Translator will apply automatic language detection.
     * @param script Script identifier of the script used by the input text. If a script is not specified, the default script of the language will be assumed.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BreakSentenceSuccessItem&gt; object
     */
    public Observable<ServiceResponse<List<BreakSentenceSuccessItem>>> breakSentencePostWithServiceResponseAsync(String apiVersion, List<BreakSentenceTextInput> text, String language, String script, String clientTraceId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        if (text == null) {
            throw new IllegalArgumentException("Parameter text is required and cannot be null.");
        }
        Validator.validate(text);
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.breakSentencePost(apiVersion, language, script, clientTraceId, text, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<BreakSentenceSuccessItem>>>>() {
                @Override
                public Observable<ServiceResponse<List<BreakSentenceSuccessItem>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<BreakSentenceSuccessItem>> clientResponse = breakSentencePostDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<BreakSentenceSuccessItem>> breakSentencePostDelegate(Response<ResponseBody> response) throws ErrorMessageException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<BreakSentenceSuccessItem>, ErrorMessageException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<BreakSentenceSuccessItem>>() { }.getType())
                .registerError(ErrorMessageException.class)
                .build(response);
    }

}
