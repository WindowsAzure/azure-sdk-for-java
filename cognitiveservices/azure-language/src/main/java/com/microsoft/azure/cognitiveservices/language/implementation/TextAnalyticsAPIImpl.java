/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.cognitiveservices.language.implementation;

import com.microsoft.azure.cognitiveservices.language.TextAnalyticsAPI;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.language.models.AzureRegions;
import com.microsoft.azure.cognitiveservices.language.models.BatchInput;
import com.microsoft.azure.cognitiveservices.language.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.models.KeyPhraseBatchResult;
import com.microsoft.azure.cognitiveservices.language.models.LanguageBatchResult;
import com.microsoft.azure.cognitiveservices.language.models.MultiLanguageBatchInput;
import com.microsoft.azure.cognitiveservices.language.models.SentimentBatchResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
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
 * Initializes a new instance of the TextAnalyticsAPI class.
 */
public class TextAnalyticsAPIImpl extends ServiceClient implements TextAnalyticsAPI {
    /**
     * The Retrofit service to perform REST calls.
     */
    private TextAnalyticsAPIService service;

    /** Subscription key in header. */
    private String subscriptionKey;

    /**
     * Gets Subscription key in header.
     *
     * @return the subscriptionKey value.
     */
    public String subscriptionKey() {
        return this.subscriptionKey;
    }

    /**
     * Sets Subscription key in header.
     *
     * @param subscriptionKey the subscriptionKey value.
     * @return the service client itself
     */
    public TextAnalyticsAPIImpl withSubscriptionKey(String subscriptionKey) {
        this.subscriptionKey = subscriptionKey;
        return this;
    }

    /** Supported Azure regions for Cognitive Services endpoints. Possible values include: 'westus', 'westeurope', 'southeastasia', 'eastus2', 'westcentralus'. */
    private AzureRegions azureRegion;

    /**
     * Gets Supported Azure regions for Cognitive Services endpoints. Possible values include: 'westus', 'westeurope', 'southeastasia', 'eastus2', 'westcentralus'.
     *
     * @return the azureRegion value.
     */
    public AzureRegions azureRegion() {
        return this.azureRegion;
    }

    /**
     * Sets Supported Azure regions for Cognitive Services endpoints. Possible values include: 'westus', 'westeurope', 'southeastasia', 'eastus2', 'westcentralus'.
     *
     * @param azureRegion the azureRegion value.
     * @return the service client itself
     */
    public TextAnalyticsAPIImpl withAzureRegion(AzureRegions azureRegion) {
        this.azureRegion = azureRegion;
        return this;
    }

    /**
     * Initializes an instance of TextAnalyticsAPI client.
     */
    public TextAnalyticsAPIImpl() {
        this("https://{AzureRegion}.api.cognitive.microsoft.com/text/analytics");
    }

    /**
     * Initializes an instance of TextAnalyticsAPI client.
     *
     * @param baseUrl the base URL of the host
     */
    private TextAnalyticsAPIImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of TextAnalyticsAPI client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public TextAnalyticsAPIImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://{AzureRegion}.api.cognitive.microsoft.com/text/analytics", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of TextAnalyticsAPI client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    private TextAnalyticsAPIImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of TextAnalyticsAPI client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public TextAnalyticsAPIImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        initializeService();
    }

    private void initializeService() {
        service = retrofit().create(TextAnalyticsAPIService.class);
    }

    /**
     * The interface defining all the services for TextAnalyticsAPI to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TextAnalyticsAPIService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.TextAnalyticsAPI keyPhrases" })
        @POST("v2.0/keyPhrases")
        Observable<Response<ResponseBody>> keyPhrases(@Header("Ocp-Apim-Subscription-Key") String subscriptionKey, @Body MultiLanguageBatchInput input, @Header("x-ms-parameterized-host") String parameterizedHost);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.TextAnalyticsAPI detectLanguage" })
        @POST("v2.0/languages")
        Observable<Response<ResponseBody>> detectLanguage(@Header("Ocp-Apim-Subscription-Key") String subscriptionKey, @Body BatchInput input, @Query("numberOfLanguagesToDetect") Integer numberOfLanguagesToDetect, @Header("x-ms-parameterized-host") String parameterizedHost);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.TextAnalyticsAPI sentiment" })
        @POST("v2.0/sentiment")
        Observable<Response<ResponseBody>> sentiment(@Header("Ocp-Apim-Subscription-Key") String subscriptionKey, @Body MultiLanguageBatchInput input, @Header("x-ms-parameterized-host") String parameterizedHost);

    }

    /**
     * The API returns a list of strings denoting the key talking points in the input text.
     * We employ techniques from Microsoft Office's sophisticated Natural Language Processing toolkit. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by key phrase extraction.
     *
     * @param input Collection of documents to analyze. Documents can now contain a language field to indicate the text language
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KeyPhraseBatchResult object if successful.
     */
    public KeyPhraseBatchResult keyPhrases(MultiLanguageBatchInput input) {
        return keyPhrasesWithServiceResponseAsync(input).toBlocking().single().body();
    }

    /**
     * The API returns a list of strings denoting the key talking points in the input text.
     * We employ techniques from Microsoft Office's sophisticated Natural Language Processing toolkit. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by key phrase extraction.
     *
     * @param input Collection of documents to analyze. Documents can now contain a language field to indicate the text language
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KeyPhraseBatchResult> keyPhrasesAsync(MultiLanguageBatchInput input, final ServiceCallback<KeyPhraseBatchResult> serviceCallback) {
        return ServiceFuture.fromResponse(keyPhrasesWithServiceResponseAsync(input), serviceCallback);
    }

    /**
     * The API returns a list of strings denoting the key talking points in the input text.
     * We employ techniques from Microsoft Office's sophisticated Natural Language Processing toolkit. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by key phrase extraction.
     *
     * @param input Collection of documents to analyze. Documents can now contain a language field to indicate the text language
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KeyPhraseBatchResult object
     */
    public Observable<KeyPhraseBatchResult> keyPhrasesAsync(MultiLanguageBatchInput input) {
        return keyPhrasesWithServiceResponseAsync(input).map(new Func1<ServiceResponse<KeyPhraseBatchResult>, KeyPhraseBatchResult>() {
            @Override
            public KeyPhraseBatchResult call(ServiceResponse<KeyPhraseBatchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * The API returns a list of strings denoting the key talking points in the input text.
     * We employ techniques from Microsoft Office's sophisticated Natural Language Processing toolkit. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by key phrase extraction.
     *
     * @param input Collection of documents to analyze. Documents can now contain a language field to indicate the text language
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KeyPhraseBatchResult object
     */
    public Observable<ServiceResponse<KeyPhraseBatchResult>> keyPhrasesWithServiceResponseAsync(MultiLanguageBatchInput input) {
        if (this.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.azureRegion() is required and cannot be null.");
        }
        if (this.subscriptionKey() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionKey() is required and cannot be null.");
        }
        if (input == null) {
            throw new IllegalArgumentException("Parameter input is required and cannot be null.");
        }
        Validator.validate(input);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.azureRegion());
        return service.keyPhrases(this.subscriptionKey(), input, parameterizedHost)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KeyPhraseBatchResult>>>() {
                @Override
                public Observable<ServiceResponse<KeyPhraseBatchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KeyPhraseBatchResult> clientResponse = keyPhrasesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KeyPhraseBatchResult> keyPhrasesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<KeyPhraseBatchResult, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<KeyPhraseBatchResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LanguageBatchResult object if successful.
     */
    public LanguageBatchResult detectLanguage(BatchInput input) {
        return detectLanguageWithServiceResponseAsync(input).toBlocking().single().body();
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LanguageBatchResult> detectLanguageAsync(BatchInput input, final ServiceCallback<LanguageBatchResult> serviceCallback) {
        return ServiceFuture.fromResponse(detectLanguageWithServiceResponseAsync(input), serviceCallback);
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LanguageBatchResult object
     */
    public Observable<LanguageBatchResult> detectLanguageAsync(BatchInput input) {
        return detectLanguageWithServiceResponseAsync(input).map(new Func1<ServiceResponse<LanguageBatchResult>, LanguageBatchResult>() {
            @Override
            public LanguageBatchResult call(ServiceResponse<LanguageBatchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LanguageBatchResult object
     */
    public Observable<ServiceResponse<LanguageBatchResult>> detectLanguageWithServiceResponseAsync(BatchInput input) {
        if (this.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.azureRegion() is required and cannot be null.");
        }
        if (this.subscriptionKey() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionKey() is required and cannot be null.");
        }
        if (input == null) {
            throw new IllegalArgumentException("Parameter input is required and cannot be null.");
        }
        Validator.validate(input);
        final Integer numberOfLanguagesToDetect = null;
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.azureRegion());
        return service.detectLanguage(this.subscriptionKey(), input, numberOfLanguagesToDetect, parameterizedHost)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LanguageBatchResult>>>() {
                @Override
                public Observable<ServiceResponse<LanguageBatchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LanguageBatchResult> clientResponse = detectLanguageDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @param numberOfLanguagesToDetect (Optional. Deprecated) Number of languages to detect. Set to 1 by default. Irrespective of the value, the language with the highest score is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LanguageBatchResult object if successful.
     */
    public LanguageBatchResult detectLanguage(BatchInput input, Integer numberOfLanguagesToDetect) {
        return detectLanguageWithServiceResponseAsync(input, numberOfLanguagesToDetect).toBlocking().single().body();
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @param numberOfLanguagesToDetect (Optional. Deprecated) Number of languages to detect. Set to 1 by default. Irrespective of the value, the language with the highest score is returned.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LanguageBatchResult> detectLanguageAsync(BatchInput input, Integer numberOfLanguagesToDetect, final ServiceCallback<LanguageBatchResult> serviceCallback) {
        return ServiceFuture.fromResponse(detectLanguageWithServiceResponseAsync(input, numberOfLanguagesToDetect), serviceCallback);
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @param numberOfLanguagesToDetect (Optional. Deprecated) Number of languages to detect. Set to 1 by default. Irrespective of the value, the language with the highest score is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LanguageBatchResult object
     */
    public Observable<LanguageBatchResult> detectLanguageAsync(BatchInput input, Integer numberOfLanguagesToDetect) {
        return detectLanguageWithServiceResponseAsync(input, numberOfLanguagesToDetect).map(new Func1<ServiceResponse<LanguageBatchResult>, LanguageBatchResult>() {
            @Override
            public LanguageBatchResult call(ServiceResponse<LanguageBatchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * The API returns the detected language and a numeric score between 0 and 1.
     * Scores close to 1 indicate 100% certainty that the identified language is true. A total of 120 languages are supported.
     *
     * @param input Collection of documents to analyze.
     * @param numberOfLanguagesToDetect (Optional. Deprecated) Number of languages to detect. Set to 1 by default. Irrespective of the value, the language with the highest score is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LanguageBatchResult object
     */
    public Observable<ServiceResponse<LanguageBatchResult>> detectLanguageWithServiceResponseAsync(BatchInput input, Integer numberOfLanguagesToDetect) {
        if (this.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.azureRegion() is required and cannot be null.");
        }
        if (this.subscriptionKey() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionKey() is required and cannot be null.");
        }
        if (input == null) {
            throw new IllegalArgumentException("Parameter input is required and cannot be null.");
        }
        Validator.validate(input);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.azureRegion());
        return service.detectLanguage(this.subscriptionKey(), input, numberOfLanguagesToDetect, parameterizedHost)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LanguageBatchResult>>>() {
                @Override
                public Observable<ServiceResponse<LanguageBatchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LanguageBatchResult> clientResponse = detectLanguageDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LanguageBatchResult> detectLanguageDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<LanguageBatchResult, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<LanguageBatchResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * The API returns a numeric score between 0 and 1.
     * Scores close to 1 indicate positive sentiment, while scores close to 0 indicate negative sentiment. Sentiment score is generated using classification techniques. The input features to the classifier include n-grams, features generated from part-of-speech tags, and word embeddings. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by sentiment analysis.
     *
     * @param input Collection of documents to analyze.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SentimentBatchResult object if successful.
     */
    public SentimentBatchResult sentiment(MultiLanguageBatchInput input) {
        return sentimentWithServiceResponseAsync(input).toBlocking().single().body();
    }

    /**
     * The API returns a numeric score between 0 and 1.
     * Scores close to 1 indicate positive sentiment, while scores close to 0 indicate negative sentiment. Sentiment score is generated using classification techniques. The input features to the classifier include n-grams, features generated from part-of-speech tags, and word embeddings. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by sentiment analysis.
     *
     * @param input Collection of documents to analyze.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SentimentBatchResult> sentimentAsync(MultiLanguageBatchInput input, final ServiceCallback<SentimentBatchResult> serviceCallback) {
        return ServiceFuture.fromResponse(sentimentWithServiceResponseAsync(input), serviceCallback);
    }

    /**
     * The API returns a numeric score between 0 and 1.
     * Scores close to 1 indicate positive sentiment, while scores close to 0 indicate negative sentiment. Sentiment score is generated using classification techniques. The input features to the classifier include n-grams, features generated from part-of-speech tags, and word embeddings. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by sentiment analysis.
     *
     * @param input Collection of documents to analyze.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SentimentBatchResult object
     */
    public Observable<SentimentBatchResult> sentimentAsync(MultiLanguageBatchInput input) {
        return sentimentWithServiceResponseAsync(input).map(new Func1<ServiceResponse<SentimentBatchResult>, SentimentBatchResult>() {
            @Override
            public SentimentBatchResult call(ServiceResponse<SentimentBatchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * The API returns a numeric score between 0 and 1.
     * Scores close to 1 indicate positive sentiment, while scores close to 0 indicate negative sentiment. Sentiment score is generated using classification techniques. The input features to the classifier include n-grams, features generated from part-of-speech tags, and word embeddings. See the &lt;a href="https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/overview#supported-languages"&gt;Text Analytics Documentation&lt;/a&gt; for details about the languages that are supported by sentiment analysis.
     *
     * @param input Collection of documents to analyze.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SentimentBatchResult object
     */
    public Observable<ServiceResponse<SentimentBatchResult>> sentimentWithServiceResponseAsync(MultiLanguageBatchInput input) {
        if (this.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.azureRegion() is required and cannot be null.");
        }
        if (this.subscriptionKey() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionKey() is required and cannot be null.");
        }
        if (input == null) {
            throw new IllegalArgumentException("Parameter input is required and cannot be null.");
        }
        Validator.validate(input);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.azureRegion());
        return service.sentiment(this.subscriptionKey(), input, parameterizedHost)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SentimentBatchResult>>>() {
                @Override
                public Observable<ServiceResponse<SentimentBatchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SentimentBatchResult> clientResponse = sentimentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SentimentBatchResult> sentimentDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<SentimentBatchResult, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SentimentBatchResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
