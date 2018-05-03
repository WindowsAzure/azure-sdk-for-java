/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.entitysearch.implementation;

import com.microsoft.azure.cognitiveservices.search.entitysearch.models.SearchOptionalParameter;
import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.search.entitysearch.BingEntities;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.search.entitysearch.models.AnswerType;
import com.microsoft.azure.cognitiveservices.search.entitysearch.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.search.entitysearch.models.ResponseFormat;
import com.microsoft.azure.cognitiveservices.search.entitysearch.models.SafeSearch;
import com.microsoft.azure.cognitiveservices.search.entitysearch.models.SearchResponse;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingEntities.
 */
public class BingEntitiesImpl implements BingEntities {
    /** The Retrofit service to perform REST calls. */
    private BingEntitiesService service;
    /** The service client containing this operation class. */
    private BingEntitySearchAPIImpl client;

    /**
     * Initializes an instance of BingEntitiesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BingEntitiesImpl(Retrofit retrofit, BingEntitySearchAPIImpl client) {
        this.service = retrofit.create(BingEntitiesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BingEntities to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BingEntitiesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.search.entitysearch.BingEntities search" })
        @GET("entities")
        Observable<Response<ResponseBody>> search(@Header("X-BingApis-SDK") String xBingApisSDK, @Header("Accept-Language") String acceptLanguage, @Header("Pragma") String pragma, @Header("User-Agent") String userAgent, @Header("X-MSEdge-ClientID") String clientId, @Header("X-MSEdge-ClientIP") String clientIp, @Header("X-Search-Location") String location, @Query("cc") String countryCode, @Query("mkt") String market, @Query("q") String query, @Query("ResponseFilter") String responseFilter, @Query("ResponseFormat") String responseFormat, @Query("SafeSearch") SafeSearch safeSearch, @Query("SetLang") String setLang);

    }


    /**
     * The Entity Search API lets you send a search query to Bing and get back search results that include entities and places. Place results include restaurants, hotel, or other local businesses. For places, the query can specify the name of the local business or it can ask for a list (for example, restaurants near me). Entity results include persons, places, or things. Place in this context is tourist attractions, states, countries, etc.
     *
     * @param query The user's search term.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SearchResponse object if successful.
     */
    public SearchResponse search(String query, SearchOptionalParameter searchOptionalParameter) {
        return searchWithServiceResponseAsync(query, searchOptionalParameter).toBlocking().single().body();
    }

    /**
     * The Entity Search API lets you send a search query to Bing and get back search results that include entities and places. Place results include restaurants, hotel, or other local businesses. For places, the query can specify the name of the local business or it can ask for a list (for example, restaurants near me). Entity results include persons, places, or things. Place in this context is tourist attractions, states, countries, etc.
     *
     * @param query The user's search term.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SearchResponse> searchAsync(String query, SearchOptionalParameter searchOptionalParameter, final ServiceCallback<SearchResponse> serviceCallback) {
        return ServiceFuture.fromResponse(searchWithServiceResponseAsync(query, searchOptionalParameter), serviceCallback);
    }

    /**
     * The Entity Search API lets you send a search query to Bing and get back search results that include entities and places. Place results include restaurants, hotel, or other local businesses. For places, the query can specify the name of the local business or it can ask for a list (for example, restaurants near me). Entity results include persons, places, or things. Place in this context is tourist attractions, states, countries, etc.
     *
     * @param query The user's search term.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchResponse object
     */
    public Observable<SearchResponse> searchAsync(String query, SearchOptionalParameter searchOptionalParameter) {
        return searchWithServiceResponseAsync(query, searchOptionalParameter).map(new Func1<ServiceResponse<SearchResponse>, SearchResponse>() {
            @Override
            public SearchResponse call(ServiceResponse<SearchResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * The Entity Search API lets you send a search query to Bing and get back search results that include entities and places. Place results include restaurants, hotel, or other local businesses. For places, the query can specify the name of the local business or it can ask for a list (for example, restaurants near me). Entity results include persons, places, or things. Place in this context is tourist attractions, states, countries, etc.
     *
     * @param query The user's search term.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchResponse object
     */
    public Observable<ServiceResponse<SearchResponse>> searchWithServiceResponseAsync(String query, SearchOptionalParameter searchOptionalParameter) {
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        final String xBingApisSDK = "true";
        final String acceptLanguage = searchOptionalParameter != null ? searchOptionalParameter.acceptLanguage() : null;
        final String pragma = searchOptionalParameter != null ? searchOptionalParameter.pragma() : null;
        final String userAgent = searchOptionalParameter != null ? searchOptionalParameter.userAgent() : this.client.userAgent();
        final String clientId = searchOptionalParameter != null ? searchOptionalParameter.clientId() : null;
        final String clientIp = searchOptionalParameter != null ? searchOptionalParameter.clientIp() : null;
        final String location = searchOptionalParameter != null ? searchOptionalParameter.location() : null;
        final String countryCode = searchOptionalParameter != null ? searchOptionalParameter.countryCode() : null;
        final String market = searchOptionalParameter != null ? searchOptionalParameter.market() : null;
        final List<AnswerType> responseFilter = searchOptionalParameter != null ? searchOptionalParameter.responseFilter() : null;
        final List<ResponseFormat> responseFormat = searchOptionalParameter != null ? searchOptionalParameter.responseFormat() : null;
        final SafeSearch safeSearch = searchOptionalParameter != null ? searchOptionalParameter.safeSearch() : null;
        final String setLang = searchOptionalParameter != null ? searchOptionalParameter.setLang() : null;
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);

        return searchWithServiceResponseAsync(query, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, responseFilter, responseFormat, safeSearch, setLang);
    }

    /**
     * The Entity Search API lets you send a search query to Bing and get back search results that include entities and places. Place results include restaurants, hotel, or other local businesses. For places, the query can specify the name of the local business or it can ask for a list (for example, restaurants near me). Entity results include persons, places, or things. Place in this context is tourist attractions, states, countries, etc.
     *
     * @param query The user's search term.
     * @param acceptLanguage A comma-delimited list of one or more languages to use for user interface strings. The list is in decreasing order of preference. For additional information, including expected format, see [RFC2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). This header and the setLang query parameter are mutually exclusive; do not specify both. If you set this header, you must also specify the cc query parameter. Bing will use the first supported language it finds from the list, and combine that language with the cc parameter value to determine the market to return results for. If the list does not include a supported language, Bing will find the closest language and market that supports the request, and may use an aggregated or default market for the results instead of a specified one. You should use this header and the cc query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. A user interface string is a string that's used as a label in a user interface. There are very few user interface strings in the JSON response objects. Any links in the response objects to Bing.com properties will apply the specified language.
     * @param pragma By default, Bing returns cached content, if available. To prevent Bing from returning cached content, set the Pragma header to no-cache (for example, Pragma: no-cache).
     * @param userAgent The user agent originating the request. Bing uses the user agent to provide mobile users with an optimized experience. Although optional, you are strongly encouraged to always specify this header. The user-agent should be the same string that any commonly used browser would send. For information about user agents, see [RFC 2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
     * @param clientId Bing uses this header to provide users with consistent behavior across Bing API calls. Bing often flights new features and improvements, and it uses the client ID as a key for assigning traffic on different flights. If you do not use the same client ID for a user across multiple requests, then Bing may assign the user to multiple conflicting flights. Being assigned to multiple conflicting flights can lead to an inconsistent user experience. For example, if the second request has a different flight assignment than the first, the experience may be unexpected. Also, Bing can use the client ID to tailor web results to that client ID’s search history, providing a richer experience for the user. Bing also uses this header to help improve result rankings by analyzing the activity generated by a client ID. The relevance improvements help with better quality of results delivered by Bing APIs and in turn enables higher click-through rates for the API consumer. IMPORTANT: Although optional, you should consider this header required. Persisting the client ID across multiple requests for the same end user and device combination enables 1) the API consumer to receive a consistent user experience, and 2) higher click-through rates via better quality of results from the Bing APIs. Each user that uses your application on the device must have a unique, Bing generated client ID. If you do not include this header in the request, Bing generates an ID and returns it in the X-MSEdge-ClientID response header. The only time that you should NOT include this header in a request is the first time the user uses your app on that device. Use the client ID for each Bing API request that your app makes for this user on the device. Persist the client ID. To persist the ID in a browser app, use a persistent HTTP cookie to ensure the ID is used across all sessions. Do not use a session cookie. For other apps such as mobile apps, use the device's persistent storage to persist the ID. The next time the user uses your app on that device, get the client ID that you persisted. Bing responses may or may not include this header. If the response includes this header, capture the client ID and use it for all subsequent Bing requests for the user on that device. If you include the X-MSEdge-ClientID, you must not include cookies in the request.
     * @param clientIp The IPv4 or IPv6 address of the client device. The IP address is used to discover the user's location. Bing uses the location information to determine safe search behavior. Although optional, you are encouraged to always specify this header and the X-Search-Location header. Do not obfuscate the address (for example, by changing the last octet to 0). Obfuscating the address results in the location not being anywhere near the device's actual location, which may result in Bing serving erroneous results.
     * @param location A semicolon-delimited list of key/value pairs that describe the client's geographical location. Bing uses the location information to determine safe search behavior and to return relevant local content. Specify the key/value pair as &lt;key&gt;:&lt;value&gt;. The following are the keys that you use to specify the user's location. lat (required): The latitude of the client's location, in degrees. The latitude must be greater than or equal to -90.0 and less than or equal to +90.0. Negative values indicate southern latitudes and positive values indicate northern latitudes. long (required): The longitude of the client's location, in degrees. The longitude must be greater than or equal to -180.0 and less than or equal to +180.0. Negative values indicate western longitudes and positive values indicate eastern longitudes. re (required): The radius, in meters, which specifies the horizontal accuracy of the coordinates. Pass the value returned by the device's location service. Typical values might be 22m for GPS/Wi-Fi, 380m for cell tower triangulation, and 18,000m for reverse IP lookup. ts (optional): The UTC UNIX timestamp of when the client was at the location. (The UNIX timestamp is the number of seconds since January 1, 1970.) head (optional): The client's relative heading or direction of travel. Specify the direction of travel as degrees from 0 through 360, counting clockwise relative to true north. Specify this key only if the sp key is nonzero. sp (optional): The horizontal velocity (speed), in meters per second, that the client device is traveling. alt (optional): The altitude of the client device, in meters. are (optional): The radius, in meters, that specifies the vertical accuracy of the coordinates. Specify this key only if you specify the alt key. Although many of the keys are optional, the more information that you provide, the more accurate the location results are. Although optional, you are encouraged to always specify the user's geographical location. Providing the location is especially important if the client's IP address does not accurately reflect the user's physical location (for example, if the client uses VPN). For optimal results, you should include this header and the X-MSEdge-ClientIP header, but at a minimum, you should include this header.
     * @param countryCode A 2-character country code of the country where the results come from. This API supports only the United States market. If you specify this query parameter, it must be set to us. If you set this parameter, you must also specify the Accept-Language header. Bing uses the first supported language it finds from the languages list, and combine that language with the country code that you specify to determine the market to return results for. If the languages list does not include a supported language, Bing finds the closest language and market that supports the request, or it may use an aggregated or default market for the results instead of a specified one. You should use this query parameter and the Accept-Language query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. This parameter and the mkt query parameter are mutually exclusive—do not specify both.
     * @param market The market where the results come from. You are strongly encouraged to always specify the market, if known. Specifying the market helps Bing route the request and return an appropriate and optimal response. This parameter and the cc query parameter are mutually exclusive—do not specify both.
     * @param responseFilter A comma-delimited list of answers to include in the response. If you do not specify this parameter, the response includes all search answers for which there's relevant data.
     * @param responseFormat The media type to use for the response. The following are the possible case-insensitive values: JSON, JSONLD. The default is JSON. If you specify JSONLD, the response body includes JSON-LD objects that contain the search results.
     * @param safeSearch A filter used to filter adult content. Off: Return webpages with adult text, images, or videos. Moderate: Return webpages with adult text, but not adult images or videos. Strict: Do not return webpages with adult text, images, or videos. The default is Moderate. If the request comes from a market that Bing's adult policy requires that safeSearch is set to Strict, Bing ignores the safeSearch value and uses Strict. If you use the site: query operator, there is the chance that the response may contain adult content regardless of what the safeSearch query parameter is set to. Use site: only if you are aware of the content on the site and your scenario supports the possibility of adult content. Possible values include: 'Off', 'Moderate', 'Strict'
     * @param setLang The language to use for user interface strings. Specify the language using the ISO 639-1 2-letter language code. For example, the language code for English is EN. The default is EN (English). Although optional, you should always specify the language. Typically, you set setLang to the same language specified by mkt unless the user wants the user interface strings displayed in a different language. This parameter and the Accept-Language header are mutually exclusive; do not specify both. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Also, any links to Bing.com properties in the response objects apply the specified language.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchResponse object
     */
    public Observable<ServiceResponse<SearchResponse>> searchWithServiceResponseAsync(String query, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, String countryCode, String market, List<AnswerType> responseFilter, List<ResponseFormat> responseFormat, SafeSearch safeSearch, String setLang) {
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        Validator.validate(responseFilter);
        Validator.validate(responseFormat);
        final String xBingApisSDK = "true";
        String responseFilterConverted = this.client.serializerAdapter().serializeList(responseFilter, CollectionFormat.CSV);
        String responseFormatConverted = this.client.serializerAdapter().serializeList(responseFormat, CollectionFormat.CSV);
        return service.search(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, countryCode, market, query, responseFilterConverted, responseFormatConverted, safeSearch, setLang)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResponse>>>() {
                @Override
                public Observable<ServiceResponse<SearchResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SearchResponse> clientResponse = searchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SearchResponse> searchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
