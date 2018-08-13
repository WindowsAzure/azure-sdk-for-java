/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.spellcheck.implementation;

import com.microsoft.azure.cognitiveservices.language.spellcheck.models.SpellCheckerOptionalParameter;
import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.language.spellcheck.BingSpellCheckOperations;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.language.spellcheck.models.ActionType;
import com.microsoft.azure.cognitiveservices.language.spellcheck.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.spellcheck.models.SpellCheck;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingSpellCheckOperations.
 */
public class BingSpellCheckOperationsImpl implements BingSpellCheckOperations {
    /** The Retrofit service to perform REST calls. */
    private BingSpellCheckOperationsService service;
    /** The service client containing this operation class. */
    private BingSpellCheckAPIImpl client;

    /**
     * Initializes an instance of BingSpellCheckOperationsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BingSpellCheckOperationsImpl(Retrofit retrofit, BingSpellCheckAPIImpl client) {
        this.service = retrofit.create(BingSpellCheckOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BingSpellCheckOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BingSpellCheckOperationsService {
        @FormUrlEncoded
        @POST("spellcheck")
        Observable<Response<ResponseBody>> spellChecker(@Header("X-BingApis-SDK") String xBingApisSDK, @Header("Accept-Language") String acceptLanguage, @Header("Pragma") String pragma, @Header("User-Agent") String userAgent, @Header("X-MSEdge-ClientID") String clientId, @Header("X-MSEdge-ClientIP") String clientIp, @Header("X-Search-Location") String location, @Query("ActionType") ActionType actionType, @Query("AppName") String appName, @Query("cc") String countryCode, @Query("ClientMachineName") String clientMachineName, @Query("DocId") String docId, @Query("mkt") String market, @Query("SessionId") String sessionId, @Query("SetLang") String setLang, @Query("UserId") String userId, @Field("Mode") String mode, @Field("PreContextText") String preContextText, @Field("PostContextText") String postContextText, @Field("Text") String text);

    }


    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a web-based spell-checker that leverages machine learning and statistical machine translation to dynamically train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request. Because of the query string length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param spellCheckerOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SpellCheck object if successful.
     */
    public SpellCheck spellChecker(String text, SpellCheckerOptionalParameter spellCheckerOptionalParameter) {
        return spellCheckerWithServiceResponseAsync(text, spellCheckerOptionalParameter).toBlocking().single().body();
    }

    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a web-based spell-checker that leverages machine learning and statistical machine translation to dynamically train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request. Because of the query string length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param spellCheckerOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SpellCheck> spellCheckerAsync(String text, SpellCheckerOptionalParameter spellCheckerOptionalParameter, final ServiceCallback<SpellCheck> serviceCallback) {
        return ServiceFuture.fromResponse(spellCheckerWithServiceResponseAsync(text, spellCheckerOptionalParameter), serviceCallback);
    }

    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a web-based spell-checker that leverages machine learning and statistical machine translation to dynamically train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request. Because of the query string length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param spellCheckerOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SpellCheck object
     */
    public Observable<SpellCheck> spellCheckerAsync(String text, SpellCheckerOptionalParameter spellCheckerOptionalParameter) {
        return spellCheckerWithServiceResponseAsync(text, spellCheckerOptionalParameter).map(new Func1<ServiceResponse<SpellCheck>, SpellCheck>() {
            @Override
            public SpellCheck call(ServiceResponse<SpellCheck> response) {
                return response.body();
            }
        });
    }

    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a web-based spell-checker that leverages machine learning and statistical machine translation to dynamically train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request. Because of the query string length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param spellCheckerOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SpellCheck object
     */
    public Observable<ServiceResponse<SpellCheck>> spellCheckerWithServiceResponseAsync(String text, SpellCheckerOptionalParameter spellCheckerOptionalParameter) {
        if (text == null) {
            throw new IllegalArgumentException("Parameter text is required and cannot be null.");
        }
        final String acceptLanguage = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.acceptLanguage() : null;
        final String pragma = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.pragma() : null;
        final String userAgent = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.userAgent() : this.client.userAgent();
        final String clientId = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.clientId() : null;
        final String clientIp = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.clientIp() : null;
        final String location = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.location() : null;
        final ActionType actionType = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.actionType() : null;
        final String appName = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.appName() : null;
        final String countryCode = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.countryCode() : null;
        final String clientMachineName = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.clientMachineName() : null;
        final String docId = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.docId() : null;
        final String market = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.market() : null;
        final String sessionId = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.sessionId() : null;
        final String setLang = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.setLang() : null;
        final String userId = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.userId() : null;
        final String mode = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.mode() : null;
        final String preContextText = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.preContextText() : null;
        final String postContextText = spellCheckerOptionalParameter != null ? spellCheckerOptionalParameter.postContextText() : null;

        return spellCheckerWithServiceResponseAsync(text, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText);
    }

    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a web-based spell-checker that leverages machine learning and statistical machine translation to dynamically train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request. Because of the query string length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param acceptLanguage A comma-delimited list of one or more languages to use for user interface strings. The list is in decreasing order of preference. For additional information, including expected format, see [RFC2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). This header and the setLang query parameter are mutually exclusive; do not specify both. If you set this header, you must also specify the cc query parameter. Bing will use the first supported language it finds from the list, and combine that language with the cc parameter value to determine the market to return results for. If the list does not include a supported language, Bing will find the closest language and market that supports the request, and may use an aggregated or default market for the results instead of a specified one. You should use this header and the cc query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. A user interface string is a string that's used as a label in a user interface. There are very few user interface strings in the JSON response objects. Any links in the response objects to Bing.com properties will apply the specified language.
     * @param pragma By default, Bing returns cached content, if available. To prevent Bing from returning cached content, set the Pragma header to no-cache (for example, Pragma: no-cache).
     * @param userAgent The user agent originating the request. Bing uses the user agent to provide mobile users with an optimized experience. Although optional, you are strongly encouraged to always specify this header. The user-agent should be the same string that any commonly used browser would send. For information about user agents, see [RFC 2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
     * @param clientId Bing uses this header to provide users with consistent behavior across Bing API calls. Bing often flights new features and improvements, and it uses the client ID as a key for assigning traffic on different flights. If you do not use the same client ID for a user across multiple requests, then Bing may assign the user to multiple conflicting flights. Being assigned to multiple conflicting flights can lead to an inconsistent user experience. For example, if the second request has a different flight assignment than the first, the experience may be unexpected. Also, Bing can use the client ID to tailor web results to that client ID’s search history, providing a richer experience for the user. Bing also uses this header to help improve result rankings by analyzing the activity generated by a client ID. The relevance improvements help with better quality of results delivered by Bing APIs and in turn enables higher click-through rates for the API consumer. IMPORTANT: Although optional, you should consider this header required. Persisting the client ID across multiple requests for the same end user and device combination enables 1) the API consumer to receive a consistent user experience, and 2) higher click-through rates via better quality of results from the Bing APIs. Each user that uses your application on the device must have a unique, Bing generated client ID. If you do not include this header in the request, Bing generates an ID and returns it in the X-MSEdge-ClientID response header. The only time that you should NOT include this header in a request is the first time the user uses your app on that device. Use the client ID for each Bing API request that your app makes for this user on the device. Persist the client ID. To persist the ID in a browser app, use a persistent HTTP cookie to ensure the ID is used across all sessions. Do not use a session cookie. For other apps such as mobile apps, use the device's persistent storage to persist the ID. The next time the user uses your app on that device, get the client ID that you persisted. Bing responses may or may not include this header. If the response includes this header, capture the client ID and use it for all subsequent Bing requests for the user on that device. If you include the X-MSEdge-ClientID, you must not include cookies in the request.
     * @param clientIp The IPv4 or IPv6 address of the client device. The IP address is used to discover the user's location. Bing uses the location information to determine safe search behavior. Although optional, you are encouraged to always specify this header and the X-Search-Location header. Do not obfuscate the address (for example, by changing the last octet to 0). Obfuscating the address results in the location not being anywhere near the device's actual location, which may result in Bing serving erroneous results.
     * @param location A semicolon-delimited list of key/value pairs that describe the client's geographical location. Bing uses the location information to determine safe search behavior and to return relevant local content. Specify the key/value pair as &lt;key&gt;:&lt;value&gt;. The following are the keys that you use to specify the user's location. lat (required): The latitude of the client's location, in degrees. The latitude must be greater than or equal to -90.0 and less than or equal to +90.0. Negative values indicate southern latitudes and positive values indicate northern latitudes. long (required): The longitude of the client's location, in degrees. The longitude must be greater than or equal to -180.0 and less than or equal to +180.0. Negative values indicate western longitudes and positive values indicate eastern longitudes. re (required): The radius, in meters, which specifies the horizontal accuracy of the coordinates. Pass the value returned by the device's location service. Typical values might be 22m for GPS/Wi-Fi, 380m for cell tower triangulation, and 18,000m for reverse IP lookup. ts (optional): The UTC UNIX timestamp of when the client was at the location. (The UNIX timestamp is the number of seconds since January 1, 1970.) head (optional): The client's relative heading or direction of travel. Specify the direction of travel as degrees from 0 through 360, counting clockwise relative to true north. Specify this key only if the sp key is nonzero. sp (optional): The horizontal velocity (speed), in meters per second, that the client device is traveling. alt (optional): The altitude of the client device, in meters. are (optional): The radius, in meters, that specifies the vertical accuracy of the coordinates. Specify this key only if you specify the alt key. Although many of the keys are optional, the more information that you provide, the more accurate the location results are. Although optional, you are encouraged to always specify the user's geographical location. Providing the location is especially important if the client's IP address does not accurately reflect the user's physical location (for example, if the client uses VPN). For optimal results, you should include this header and the  X-Search-ClientIP header, but at a minimum, you should include this header.
     * @param actionType A string that's used by logging to determine whether the request is coming from an interactive session or a page load. The following are the possible values. 1) Edit—The request is from an interactive session 2) Load—The request is from a page load. Possible values include: 'Edit', 'Load'
     * @param appName The unique name of your app. The name must be known by Bing. Do not include this parameter unless you have previously contacted Bing to get a unique app name. To get a unique name, contact your Bing Business Development manager.
     * @param countryCode A 2-character country code of the country where the results come from. This API supports only the United States market. If you specify this query parameter, it must be set to us. If you set this parameter, you must also specify the Accept-Language header. Bing uses the first supported language it finds from the languages list, and combine that language with the country code that you specify to determine the market to return results for. If the languages list does not include a supported language, Bing finds the closest language and market that supports the request, or it may use an aggregated or default market for the results instead of a specified one. You should use this query parameter and the Accept-Language query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. This parameter and the mkt query parameter are mutually exclusive—do not specify both.
     * @param clientMachineName A unique name of the device that the request is being made from. Generate a unique value for each device (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
     * @param docId A unique ID that identifies the document that the text belongs to. Generate a unique value for each document (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
     * @param market The market where the results come from. You are strongly encouraged to always specify the market, if known. Specifying the market helps Bing route the request and return an appropriate and optimal response. This parameter and the cc query parameter are mutually exclusive—do not specify both.
     * @param sessionId A unique ID that identifies this user session. Generate a unique value for each user session (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections
     * @param setLang The language to use for user interface strings. Specify the language using the ISO 639-1 2-letter language code. For example, the language code for English is EN. The default is EN (English). Although optional, you should always specify the language. Typically, you set setLang to the same language specified by mkt unless the user wants the user interface strings displayed in a different language. This parameter and the Accept-Language header are mutually exclusive—do not specify both. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Also, any links to Bing.com properties in the response objects apply the specified language.
     * @param userId A unique ID that identifies the user. Generate a unique value for each user (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
     * @param mode The type of spelling and grammar checks to perform. The following are the possible values (the values are case insensitive). The default is Proof. 1) Proof—Finds most spelling and grammar mistakes. 2) Spell—Finds most spelling mistakes but does not find some of the grammar errors that Proof catches (for example, capitalization and repeated words). Possible values include: 'proof', 'spell'
     * @param preContextText A string that gives context to the text string. For example, the text string petal is valid. However, if you set preContextText to bike, the context changes and the text string becomes not valid. In this case, the API suggests that you change petal to pedal (as in bike pedal). This text is not checked for grammar or spelling errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request.
     * @param postContextText A string that gives context to the text string. For example, the text string read is valid. However, if you set postContextText to carpet, the context changes and the text string becomes not valid. In this case, the API suggests that you change read to red (as in red carpet). This text is not checked for grammar or spelling errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SpellCheck object
     */
    public Observable<ServiceResponse<SpellCheck>> spellCheckerWithServiceResponseAsync(String text, String acceptLanguage, String pragma, String userAgent, String clientId, String clientIp, String location, ActionType actionType, String appName, String countryCode, String clientMachineName, String docId, String market, String sessionId, String setLang, String userId, String mode, String preContextText, String postContextText) {
        if (text == null) {
            throw new IllegalArgumentException("Parameter text is required and cannot be null.");
        }
        final String xBingApisSDK = "true";
        return service.spellChecker(xBingApisSDK, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText, text)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SpellCheck>>>() {
                @Override
                public Observable<ServiceResponse<SpellCheck>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SpellCheck> clientResponse = spellCheckerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SpellCheck> spellCheckerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SpellCheck, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SpellCheck>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    @Override
    public BingSpellCheckOperationsSpellCheckerParameters spellChecker() {
        return new BingSpellCheckOperationsSpellCheckerParameters(this);
    }

    /**
     * Internal class implementing BingSpellCheckOperationsSpellCheckerDefinition.
     */
    class BingSpellCheckOperationsSpellCheckerParameters implements BingSpellCheckOperationsSpellCheckerDefinition {
        private BingSpellCheckOperationsImpl parent;
        private String text;
        private String acceptLanguage;
        private String pragma;
        private String userAgent;
        private String clientId;
        private String clientIp;
        private String location;
        private ActionType actionType;
        private String appName;
        private String countryCode;
        private String clientMachineName;
        private String docId;
        private String market;
        private String sessionId;
        private String setLang;
        private String userId;
        private String mode;
        private String preContextText;
        private String postContextText;

        /**
         * Constructor.
         * @param parent the parent object.
         */
        BingSpellCheckOperationsSpellCheckerParameters(BingSpellCheckOperationsImpl parent) {
            this.parent = parent;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withText(String text) {
            this.text = text;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withAcceptLanguage(String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withPragma(String pragma) {
            this.pragma = pragma;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withLocation(String location) {
            this.location = location;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withActionType(ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withAppName(String appName) {
            this.appName = appName;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withClientMachineName(String clientMachineName) {
            this.clientMachineName = clientMachineName;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withDocId(String docId) {
            this.docId = docId;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withMarket(String market) {
            this.market = market;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withSetLang(String setLang) {
            this.setLang = setLang;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withMode(String mode) {
            this.mode = mode;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withPreContextText(String preContextText) {
            this.preContextText = preContextText;
            return this;
        }

        @Override
        public BingSpellCheckOperationsSpellCheckerParameters withPostContextText(String postContextText) {
            this.postContextText = postContextText;
            return this;
        }

        @Override
        public SpellCheck execute() {
        return spellCheckerWithServiceResponseAsync(text, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText).toBlocking().single().body();
    }

        @Override
        public Observable<SpellCheck> executeAsync() {
            return spellCheckerWithServiceResponseAsync(text, acceptLanguage, pragma, userAgent, clientId, clientIp, location, actionType, appName, countryCode, clientMachineName, docId, market, sessionId, setLang, userId, mode, preContextText, postContextText).map(new Func1<ServiceResponse<SpellCheck>, SpellCheck>() {
                @Override
                public SpellCheck call(ServiceResponse<SpellCheck> response) {
                    return response.body();
                }
            });
        }
    }

}
