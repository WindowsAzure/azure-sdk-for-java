/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext;

import com.microsoft.azure.cognitiveservices.translatortext.models.ErrorMessageException;
import com.microsoft.azure.cognitiveservices.translatortext.models.TransliterateSuccessItem;
import com.microsoft.azure.cognitiveservices.translatortext.models.TransliterateTextInput;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Transliterates.
 */
public interface Transliterates {
    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;TransliterateSuccessItem&gt; object if successful.
     */
    List<TransliterateSuccessItem> post(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts);

    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<TransliterateSuccessItem>> postAsync(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts, final ServiceCallback<List<TransliterateSuccessItem>> serviceCallback);

    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TransliterateSuccessItem&gt; object
     */
    Observable<List<TransliterateSuccessItem>> postAsync(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts);

    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TransliterateSuccessItem&gt; object
     */
    Observable<ServiceResponse<List<TransliterateSuccessItem>>> postWithServiceResponseAsync(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts);
    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @param ocpApimSubscriptionKey This is used to pass a key for auth. If you are passing a token for auth then use the previous header auth option. **ONE OF THESE METHODS MUST BE USED.**
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;TransliterateSuccessItem&gt; object if successful.
     */
    List<TransliterateSuccessItem> post(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts, String ocpApimSubscriptionKey, String xClientTraceId);

    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @param ocpApimSubscriptionKey This is used to pass a key for auth. If you are passing a token for auth then use the previous header auth option. **ONE OF THESE METHODS MUST BE USED.**
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<TransliterateSuccessItem>> postAsync(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts, String ocpApimSubscriptionKey, String xClientTraceId, final ServiceCallback<List<TransliterateSuccessItem>> serviceCallback);

    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @param ocpApimSubscriptionKey This is used to pass a key for auth. If you are passing a token for auth then use the previous header auth option. **ONE OF THESE METHODS MUST BE USED.**
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TransliterateSuccessItem&gt; object
     */
    Observable<List<TransliterateSuccessItem>> postAsync(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts, String ocpApimSubscriptionKey, String xClientTraceId);

    /**
     * Converts the text of a language in one script into another type of script. Example-
     Japanese script "こんにちは"
     Same word in Latin script "konnichiha".
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param language Specifies the language of the text to convert from one script to another. Possible languages are listed in the `transliteration` scope obtained by querying the service for its supported languages.
     * @param fromScript Specifies the script used by the input text. Lookup supported languages using the `transliteration` scope, to find input scripts available for the selected language.
     * @param toScript Specifies the output script. Lookup supported languages using the `transliteration` scope, to find output scripts available for the selected combination of input language and input script.
     * @param texts # Request body
       The body of the request is a JSON array. Each array element is a JSON object with a string property named `Text`, which represents the string to convert.
       The following limitations apply:
       * The array can have at most 10 elements.
       * The text value of an array element cannot exceed 1,000 characters including spaces.
       * The entire text included in the request cannot exceed 5,000 characters including spaces.
     # Response body
       A successful response is a JSON array with one result for each element in the input array. A result object includes the following properties:
       * `text`- A string which is the result of converting the input string to the output script.
       * `script`- A string specifying the script used in the output.
     * @param ocpApimSubscriptionKey This is used to pass a key for auth. If you are passing a token for auth then use the previous header auth option. **ONE OF THESE METHODS MUST BE USED.**
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. You can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TransliterateSuccessItem&gt; object
     */
    Observable<ServiceResponse<List<TransliterateSuccessItem>>> postWithServiceResponseAsync(String apiVersion, String language, String fromScript, String toScript, List<TransliterateTextInput> texts, String ocpApimSubscriptionKey, String xClientTraceId);

}
