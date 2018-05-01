/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.spellcheck.models;


/**
 * The "spellCheckMethod operation optional parameters class.
 */
public class SpellCheckMethodOptionalParameter {
        /**
        * A comma-delimited list of one or more languages to use for user interface strings. The list is in decreasing order of preference. For additional information, including expected format, see [RFC2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). This header and the setLang query parameter are mutually exclusive; do not specify both. If you set this header, you must also specify the cc query parameter. Bing will use the first supported language it finds from the list, and combine that language with the cc parameter value to determine the market to return results for. If the list does not include a supported language, Bing will find the closest language and market that supports the request, and may use an aggregated or default market for the results instead of a specified one. You should use this header and the cc query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. A user interface string is a string that's used as a label in a user interface. There are very few user interface strings in the JSON response objects. Any links in the response objects to Bing.com properties will apply the specified language.
        */
        private String acceptLanguage;

        /**
        * By default, Bing returns cached content, if available. To prevent Bing from returning cached content, set the Pragma header to no-cache (for example, Pragma: no-cache).
        */
        private String pragma;

        /**
        * The user agent originating the request. Bing uses the user agent to provide mobile users with an optimized experience. Although optional, you are strongly encouraged to always specify this header. The user-agent should be the same string that any commonly used browser would send. For information about user agents, see [RFC 2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
        */
        private String userAgent;

        /**
        * Bing uses this header to provide users with consistent behavior across Bing API calls. Bing often flights new features and improvements, and it uses the client ID as a key for assigning traffic on different flights. If you do not use the same client ID for a user across multiple requests, then Bing may assign the user to multiple conflicting flights. Being assigned to multiple conflicting flights can lead to an inconsistent user experience. For example, if the second request has a different flight assignment than the first, the experience may be unexpected. Also, Bing can use the client ID to tailor web results to that client ID’s search history, providing a richer experience for the user. Bing also uses this header to help improve result rankings by analyzing the activity generated by a client ID. The relevance improvements help with better quality of results delivered by Bing APIs and in turn enables higher click-through rates for the API consumer. IMPORTANT: Although optional, you should consider this header required. Persisting the client ID across multiple requests for the same end user and device combination enables 1) the API consumer to receive a consistent user experience, and 2) higher click-through rates via better quality of results from the Bing APIs. Each user that uses your application on the device must have a unique, Bing generated client ID. If you do not include this header in the request, Bing generates an ID and returns it in the X-MSEdge-ClientID response header. The only time that you should NOT include this header in a request is the first time the user uses your app on that device. Use the client ID for each Bing API request that your app makes for this user on the device. Persist the client ID. To persist the ID in a browser app, use a persistent HTTP cookie to ensure the ID is used across all sessions. Do not use a session cookie. For other apps such as mobile apps, use the device's persistent storage to persist the ID. The next time the user uses your app on that device, get the client ID that you persisted. Bing responses may or may not include this header. If the response includes this header, capture the client ID and use it for all subsequent Bing requests for the user on that device. If you include the X-MSEdge-ClientID, you must not include cookies in the request.
        */
        private String clientId;

        /**
        * The IPv4 or IPv6 address of the client device. The IP address is used to discover the user's location. Bing uses the location information to determine safe search behavior. Although optional, you are encouraged to always specify this header and the X-Search-Location header. Do not obfuscate the address (for example, by changing the last octet to 0). Obfuscating the address results in the location not being anywhere near the device's actual location, which may result in Bing serving erroneous results.
        */
        private String clientIp;

        /**
        * A semicolon-delimited list of key/value pairs that describe the client's geographical location. Bing uses the location information to determine safe search behavior and to return relevant local content. Specify the key/value pair as &lt;key&gt;:&lt;value&gt;. The following are the keys that you use to specify the user's location. lat (required): The latitude of the client's location, in degrees. The latitude must be greater than or equal to -90.0 and less than or equal to +90.0. Negative values indicate southern latitudes and positive values indicate northern latitudes. long (required): The longitude of the client's location, in degrees. The longitude must be greater than or equal to -180.0 and less than or equal to +180.0. Negative values indicate western longitudes and positive values indicate eastern longitudes. re (required): The radius, in meters, which specifies the horizontal accuracy of the coordinates. Pass the value returned by the device's location service. Typical values might be 22m for GPS/Wi-Fi, 380m for cell tower triangulation, and 18,000m for reverse IP lookup. ts (optional): The UTC UNIX timestamp of when the client was at the location. (The UNIX timestamp is the number of seconds since January 1, 1970.) head (optional): The client's relative heading or direction of travel. Specify the direction of travel as degrees from 0 through 360, counting clockwise relative to true north. Specify this key only if the sp key is nonzero. sp (optional): The horizontal velocity (speed), in meters per second, that the client device is traveling. alt (optional): The altitude of the client device, in meters. are (optional): The radius, in meters, that specifies the vertical accuracy of the coordinates. Specify this key only if you specify the alt key. Although many of the keys are optional, the more information that you provide, the more accurate the location results are. Although optional, you are encouraged to always specify the user's geographical location. Providing the location is especially important if the client's IP address does not accurately reflect the user's physical location (for example, if the client uses VPN). For optimal results, you should include this header and the  X-Search-ClientIP header, but at a minimum, you should include this header.
        */
        private String location;

        /**
        * A string that's used by logging to determine whether the request is coming from an interactive session or a page load. The following are the possible values. 1) Edit—The request is from an interactive session 2) Load—The request is from a page load. Possible values include: 'Edit', 'Load'.
        */
        private ActionType actionType;

        /**
        * The unique name of your app. The name must be known by Bing. Do not include this parameter unless you have previously contacted Bing to get a unique app name. To get a unique name, contact your Bing Business Development manager.
        */
        private String appName;

        /**
        * A 2-character country code of the country where the results come from. This API supports only the United States market. If you specify this query parameter, it must be set to us. If you set this parameter, you must also specify the Accept-Language header. Bing uses the first supported language it finds from the languages list, and combine that language with the country code that you specify to determine the market to return results for. If the languages list does not include a supported language, Bing finds the closest language and market that supports the request, or it may use an aggregated or default market for the results instead of a specified one. You should use this query parameter and the Accept-Language query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. This parameter and the mkt query parameter are mutually exclusive—do not specify both.
        */
        private String countryCode;

        /**
        * A unique name of the device that the request is being made from. Generate a unique value for each device (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        */
        private String clientMachineName;

        /**
        * A unique ID that identifies the document that the text belongs to. Generate a unique value for each document (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        */
        private String docId;

        /**
        * The market where the results come from. You are strongly encouraged to always specify the market, if known. Specifying the market helps Bing route the request and return an appropriate and optimal response. This parameter and the cc query parameter are mutually exclusive—do not specify both.
        */
        private String market;

        /**
        * A unique ID that identifies this user session. Generate a unique value for each user session (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        */
        private String sessionId;

        /**
        * The language to use for user interface strings. Specify the language using the ISO 639-1 2-letter language code. For example, the language code for English is EN. The default is EN (English). Although optional, you should always specify the language. Typically, you set setLang to the same language specified by mkt unless the user wants the user interface strings displayed in a different language. This parameter and the Accept-Language header are mutually exclusive—do not specify both. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Also, any links to Bing.com properties in the response objects apply the specified language.
        */
        private String setLang;

        /**
        * A unique ID that identifies the user. Generate a unique value for each user (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        */
        private String userId;

        /**
        * The type of spelling and grammar checks to perform. The following are the possible values (the values are case insensitive). The default is Proof. 1) Proof—Finds most spelling and grammar mistakes. 2) Spell—Finds most spelling mistakes but does not find some of the grammar errors that Proof catches (for example, capitalization and repeated words). Possible values include: 'proof', 'spell'.
        */
        private String mode;

        /**
        * A string that gives context to the text string. For example, the text string petal is valid. However, if you set preContextText to bike, the context changes and the text string becomes not valid. In this case, the API suggests that you change petal to pedal (as in bike pedal). This text is not checked for grammar or spelling errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request.
        */
        private String preContextText;

        /**
        * A string that gives context to the text string. For example, the text string read is valid. However, if you set postContextText to carpet, the context changes and the text string becomes not valid. In this case, the API suggests that you change read to red (as in red carpet). This text is not checked for grammar or spelling errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request.
        */
        private String postContextText;

        /**
        * Get the acceptLanguage value.
        *
        * @return the acceptLanguage value
        */
        public String acceptLanguage() {
            return this.acceptLanguage;
        }

        /**
        * Get the pragma value.
        *
        * @return the pragma value
        */
        public String pragma() {
            return this.pragma;
        }

        /**
        * Get the userAgent value.
        *
        * @return the userAgent value
        */
        public String userAgent() {
            return this.userAgent;
        }

        /**
        * Get the clientId value.
        *
        * @return the clientId value
        */
        public String clientId() {
            return this.clientId;
        }

        /**
        * Get the clientIp value.
        *
        * @return the clientIp value
        */
        public String clientIp() {
            return this.clientIp;
        }

        /**
        * Get the location value.
        *
        * @return the location value
        */
        public String location() {
            return this.location;
        }

        /**
        * Get the actionType value.
        *
        * @return the actionType value
        */
        public ActionType actionType() {
            return this.actionType;
        }

        /**
        * Get the appName value.
        *
        * @return the appName value
        */
        public String appName() {
            return this.appName;
        }

        /**
        * Get the countryCode value.
        *
        * @return the countryCode value
        */
        public String countryCode() {
            return this.countryCode;
        }

        /**
        * Get the clientMachineName value.
        *
        * @return the clientMachineName value
        */
        public String clientMachineName() {
            return this.clientMachineName;
        }

        /**
        * Get the docId value.
        *
        * @return the docId value
        */
        public String docId() {
            return this.docId;
        }

        /**
        * Get the market value.
        *
        * @return the market value
        */
        public String market() {
            return this.market;
        }

        /**
        * Get the sessionId value.
        *
        * @return the sessionId value
        */
        public String sessionId() {
            return this.sessionId;
        }

        /**
        * Get the setLang value.
        *
        * @return the setLang value
        */
        public String setLang() {
            return this.setLang;
        }

        /**
        * Get the userId value.
        *
        * @return the userId value
        */
        public String userId() {
            return this.userId;
        }

        /**
        * Get the mode value.
        *
        * @return the mode value
        */
        public String mode() {
            return this.mode;
        }

        /**
        * Get the preContextText value.
        *
        * @return the preContextText value
        */
        public String preContextText() {
            return this.preContextText;
        }

        /**
        * Get the postContextText value.
        *
        * @return the postContextText value
        */
        public String postContextText() {
            return this.postContextText;
        }

        /**
        * Set the acceptLanguage value.
        * <p>
        * A comma-delimited list of one or more languages to use for user interface strings. The list is in decreasing order of preference. For additional information, including expected format, see [RFC2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). This header and the setLang query parameter are mutually exclusive; do not specify both. If you set this header, you must also specify the cc query parameter. Bing will use the first supported language it finds from the list, and combine that language with the cc parameter value to determine the market to return results for. If the list does not include a supported language, Bing will find the closest language and market that supports the request, and may use an aggregated or default market for the results instead of a specified one. You should use this header and the cc query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. A user interface string is a string that's used as a label in a user interface. There are very few user interface strings in the JSON response objects. Any links in the response objects to Bing.com properties will apply the specified language.
        *
        * @param acceptLanguage the acceptLanguage value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withAcceptLanguage(String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
        * Set the pragma value.
        * <p>
        * By default, Bing returns cached content, if available. To prevent Bing from returning cached content, set the Pragma header to no-cache (for example, Pragma: no-cache).
        *
        * @param pragma the pragma value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withPragma(String pragma) {
            this.pragma = pragma;
            return this;
        }

        /**
        * Set the userAgent value.
        * <p>
        * The user agent originating the request. Bing uses the user agent to provide mobile users with an optimized experience. Although optional, you are strongly encouraged to always specify this header. The user-agent should be the same string that any commonly used browser would send. For information about user agents, see [RFC 2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
        *
        * @param userAgent the userAgent value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /**
        * Set the clientId value.
        * <p>
        * Bing uses this header to provide users with consistent behavior across Bing API calls. Bing often flights new features and improvements, and it uses the client ID as a key for assigning traffic on different flights. If you do not use the same client ID for a user across multiple requests, then Bing may assign the user to multiple conflicting flights. Being assigned to multiple conflicting flights can lead to an inconsistent user experience. For example, if the second request has a different flight assignment than the first, the experience may be unexpected. Also, Bing can use the client ID to tailor web results to that client ID’s search history, providing a richer experience for the user. Bing also uses this header to help improve result rankings by analyzing the activity generated by a client ID. The relevance improvements help with better quality of results delivered by Bing APIs and in turn enables higher click-through rates for the API consumer. IMPORTANT: Although optional, you should consider this header required. Persisting the client ID across multiple requests for the same end user and device combination enables 1) the API consumer to receive a consistent user experience, and 2) higher click-through rates via better quality of results from the Bing APIs. Each user that uses your application on the device must have a unique, Bing generated client ID. If you do not include this header in the request, Bing generates an ID and returns it in the X-MSEdge-ClientID response header. The only time that you should NOT include this header in a request is the first time the user uses your app on that device. Use the client ID for each Bing API request that your app makes for this user on the device. Persist the client ID. To persist the ID in a browser app, use a persistent HTTP cookie to ensure the ID is used across all sessions. Do not use a session cookie. For other apps such as mobile apps, use the device's persistent storage to persist the ID. The next time the user uses your app on that device, get the client ID that you persisted. Bing responses may or may not include this header. If the response includes this header, capture the client ID and use it for all subsequent Bing requests for the user on that device. If you include the X-MSEdge-ClientID, you must not include cookies in the request.
        *
        * @param clientId the clientId value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
        * Set the clientIp value.
        * <p>
        * The IPv4 or IPv6 address of the client device. The IP address is used to discover the user's location. Bing uses the location information to determine safe search behavior. Although optional, you are encouraged to always specify this header and the X-Search-Location header. Do not obfuscate the address (for example, by changing the last octet to 0). Obfuscating the address results in the location not being anywhere near the device's actual location, which may result in Bing serving erroneous results.
        *
        * @param clientIp the clientIp value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
        * Set the location value.
        * <p>
        * A semicolon-delimited list of key/value pairs that describe the client's geographical location. Bing uses the location information to determine safe search behavior and to return relevant local content. Specify the key/value pair as &lt;key&gt;:&lt;value&gt;. The following are the keys that you use to specify the user's location. lat (required): The latitude of the client's location, in degrees. The latitude must be greater than or equal to -90.0 and less than or equal to +90.0. Negative values indicate southern latitudes and positive values indicate northern latitudes. long (required): The longitude of the client's location, in degrees. The longitude must be greater than or equal to -180.0 and less than or equal to +180.0. Negative values indicate western longitudes and positive values indicate eastern longitudes. re (required): The radius, in meters, which specifies the horizontal accuracy of the coordinates. Pass the value returned by the device's location service. Typical values might be 22m for GPS/Wi-Fi, 380m for cell tower triangulation, and 18,000m for reverse IP lookup. ts (optional): The UTC UNIX timestamp of when the client was at the location. (The UNIX timestamp is the number of seconds since January 1, 1970.) head (optional): The client's relative heading or direction of travel. Specify the direction of travel as degrees from 0 through 360, counting clockwise relative to true north. Specify this key only if the sp key is nonzero. sp (optional): The horizontal velocity (speed), in meters per second, that the client device is traveling. alt (optional): The altitude of the client device, in meters. are (optional): The radius, in meters, that specifies the vertical accuracy of the coordinates. Specify this key only if you specify the alt key. Although many of the keys are optional, the more information that you provide, the more accurate the location results are. Although optional, you are encouraged to always specify the user's geographical location. Providing the location is especially important if the client's IP address does not accurately reflect the user's physical location (for example, if the client uses VPN). For optimal results, you should include this header and the  X-Search-ClientIP header, but at a minimum, you should include this header.
        *
        * @param location the location value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withLocation(String location) {
            this.location = location;
            return this;
        }

        /**
        * Set the actionType value.
        * <p>
        * A string that's used by logging to determine whether the request is coming from an interactive session or a page load. The following are the possible values. 1) Edit—The request is from an interactive session 2) Load—The request is from a page load. Possible values include: 'Edit', 'Load'.
        *
        * @param actionType the actionType value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withActionType(ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
        * Set the appName value.
        * <p>
        * The unique name of your app. The name must be known by Bing. Do not include this parameter unless you have previously contacted Bing to get a unique app name. To get a unique name, contact your Bing Business Development manager.
        *
        * @param appName the appName value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withAppName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
        * Set the countryCode value.
        * <p>
        * A 2-character country code of the country where the results come from. This API supports only the United States market. If you specify this query parameter, it must be set to us. If you set this parameter, you must also specify the Accept-Language header. Bing uses the first supported language it finds from the languages list, and combine that language with the country code that you specify to determine the market to return results for. If the languages list does not include a supported language, Bing finds the closest language and market that supports the request, or it may use an aggregated or default market for the results instead of a specified one. You should use this query parameter and the Accept-Language query parameter only if you specify multiple languages; otherwise, you should use the mkt and setLang query parameters. This parameter and the mkt query parameter are mutually exclusive—do not specify both.
        *
        * @param countryCode the countryCode value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
        * Set the clientMachineName value.
        * <p>
        * A unique name of the device that the request is being made from. Generate a unique value for each device (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        *
        * @param clientMachineName the clientMachineName value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withClientMachineName(String clientMachineName) {
            this.clientMachineName = clientMachineName;
            return this;
        }

        /**
        * Set the docId value.
        * <p>
        * A unique ID that identifies the document that the text belongs to. Generate a unique value for each document (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        *
        * @param docId the docId value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withDocId(String docId) {
            this.docId = docId;
            return this;
        }

        /**
        * Set the market value.
        * <p>
        * The market where the results come from. You are strongly encouraged to always specify the market, if known. Specifying the market helps Bing route the request and return an appropriate and optimal response. This parameter and the cc query parameter are mutually exclusive—do not specify both.
        *
        * @param market the market value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withMarket(String market) {
            this.market = market;
            return this;
        }

        /**
        * Set the sessionId value.
        * <p>
        * A unique ID that identifies this user session. Generate a unique value for each user session (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        *
        * @param sessionId the sessionId value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
        * Set the setLang value.
        * <p>
        * The language to use for user interface strings. Specify the language using the ISO 639-1 2-letter language code. For example, the language code for English is EN. The default is EN (English). Although optional, you should always specify the language. Typically, you set setLang to the same language specified by mkt unless the user wants the user interface strings displayed in a different language. This parameter and the Accept-Language header are mutually exclusive—do not specify both. A user interface string is a string that's used as a label in a user interface. There are few user interface strings in the JSON response objects. Also, any links to Bing.com properties in the response objects apply the specified language.
        *
        * @param setLang the setLang value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withSetLang(String setLang) {
            this.setLang = setLang;
            return this;
        }

        /**
        * Set the userId value.
        * <p>
        * A unique ID that identifies the user. Generate a unique value for each user (the value is unimportant). The service uses the ID to help debug issues and improve the quality of corrections.
        *
        * @param userId the userId value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
        * Set the mode value.
        * <p>
        * The type of spelling and grammar checks to perform. The following are the possible values (the values are case insensitive). The default is Proof. 1) Proof—Finds most spelling and grammar mistakes. 2) Spell—Finds most spelling mistakes but does not find some of the grammar errors that Proof catches (for example, capitalization and repeated words). Possible values include: 'proof', 'spell'.
        *
        * @param mode the mode value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withMode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
        * Set the preContextText value.
        * <p>
        * A string that gives context to the text string. For example, the text string petal is valid. However, if you set preContextText to bike, the context changes and the text string becomes not valid. In this case, the API suggests that you change petal to pedal (as in bike pedal). This text is not checked for grammar or spelling errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request.
        *
        * @param preContextText the preContextText value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withPreContextText(String preContextText) {
            this.preContextText = preContextText;
            return this;
        }

        /**
        * Set the postContextText value.
        * <p>
        * A string that gives context to the text string. For example, the text string read is valid. However, if you set postContextText to carpet, the context changes and the text string becomes not valid. In this case, the API suggests that you change read to red (as in red carpet). This text is not checked for grammar or spelling errors. The combined length of the text string, preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this parameter in the query string of a GET request or in the body of a POST request.
        *
        * @param postContextText the postContextText value to set
        * @return the spellCheckMethodOptionalParameter object itself.
        */
        public SpellCheckMethodOptionalParameter withPostContextText(String postContextText) {
            this.postContextText = postContextText;
            return this;
        }

    }
