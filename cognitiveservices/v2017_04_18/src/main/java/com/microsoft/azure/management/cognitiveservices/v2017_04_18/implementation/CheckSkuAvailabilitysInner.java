/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CheckSkuAvailabilityParameter;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Kind;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.SkuName;
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
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in CheckSkuAvailabilitys.
 */
public class CheckSkuAvailabilitysInner {
    /** The Retrofit service to perform REST calls. */
    private CheckSkuAvailabilitysService service;
    /** The service client containing this operation class. */
    private CognitiveServicesManagementClientImpl client;

    /**
     * Initializes an instance of CheckSkuAvailabilitysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CheckSkuAvailabilitysInner(Retrofit retrofit, CognitiveServicesManagementClientImpl client) {
        this.service = retrofit.create(CheckSkuAvailabilitysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CheckSkuAvailabilitys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CheckSkuAvailabilitysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cognitiveservices.v2017_04_18.CheckSkuAvailabilitys list" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.CognitiveServices/locations/{location}/checkSkuAvailability")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CheckSkuAvailabilityParameter parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource. Possible values include: 'Bing.Autosuggest.v7', 'Bing.CustomSearch', 'Bing.Search.v7', 'Bing.Speech', 'Bing.SpellCheck.v7', 'ComputerVision', 'ContentModerator', 'CustomSpeech', 'CustomVision.Prediction', 'CustomVision.Training', 'Emotion', 'Face', 'LUIS', 'QnAMaker', 'SpeakerRecognition', 'SpeechTranslation', 'TextAnalytics', 'TextTranslation', 'WebLM'
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckSkuAvailabilityResultListInner object if successful.
     */
    public CheckSkuAvailabilityResultListInner list(String location, List<SkuName> skus, Kind kind, String type) {
        return listWithServiceResponseAsync(location, skus, kind, type).toBlocking().single().body();
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource. Possible values include: 'Bing.Autosuggest.v7', 'Bing.CustomSearch', 'Bing.Search.v7', 'Bing.Speech', 'Bing.SpellCheck.v7', 'ComputerVision', 'ContentModerator', 'CustomSpeech', 'CustomVision.Prediction', 'CustomVision.Training', 'Emotion', 'Face', 'LUIS', 'QnAMaker', 'SpeakerRecognition', 'SpeechTranslation', 'TextAnalytics', 'TextTranslation', 'WebLM'
     * @param type The Type of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckSkuAvailabilityResultListInner> listAsync(String location, List<SkuName> skus, Kind kind, String type, final ServiceCallback<CheckSkuAvailabilityResultListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location, skus, kind, type), serviceCallback);
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource. Possible values include: 'Bing.Autosuggest.v7', 'Bing.CustomSearch', 'Bing.Search.v7', 'Bing.Speech', 'Bing.SpellCheck.v7', 'ComputerVision', 'ContentModerator', 'CustomSpeech', 'CustomVision.Prediction', 'CustomVision.Training', 'Emotion', 'Face', 'LUIS', 'QnAMaker', 'SpeakerRecognition', 'SpeechTranslation', 'TextAnalytics', 'TextTranslation', 'WebLM'
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckSkuAvailabilityResultListInner object
     */
    public Observable<CheckSkuAvailabilityResultListInner> listAsync(String location, List<SkuName> skus, Kind kind, String type) {
        return listWithServiceResponseAsync(location, skus, kind, type).map(new Func1<ServiceResponse<CheckSkuAvailabilityResultListInner>, CheckSkuAvailabilityResultListInner>() {
            @Override
            public CheckSkuAvailabilityResultListInner call(ServiceResponse<CheckSkuAvailabilityResultListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource. Possible values include: 'Bing.Autosuggest.v7', 'Bing.CustomSearch', 'Bing.Search.v7', 'Bing.Speech', 'Bing.SpellCheck.v7', 'ComputerVision', 'ContentModerator', 'CustomSpeech', 'CustomVision.Prediction', 'CustomVision.Training', 'Emotion', 'Face', 'LUIS', 'QnAMaker', 'SpeakerRecognition', 'SpeechTranslation', 'TextAnalytics', 'TextTranslation', 'WebLM'
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckSkuAvailabilityResultListInner object
     */
    public Observable<ServiceResponse<CheckSkuAvailabilityResultListInner>> listWithServiceResponseAsync(String location, List<SkuName> skus, Kind kind, String type) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (kind == null) {
            throw new IllegalArgumentException("Parameter kind is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        Validator.validate(skus);
        CheckSkuAvailabilityParameter parameters = new CheckSkuAvailabilityParameter();
        parameters.withSkus(skus);
        parameters.withKind(kind);
        parameters.withType(type);
        return service.list(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckSkuAvailabilityResultListInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckSkuAvailabilityResultListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckSkuAvailabilityResultListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckSkuAvailabilityResultListInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CheckSkuAvailabilityResultListInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CheckSkuAvailabilityResultListInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
