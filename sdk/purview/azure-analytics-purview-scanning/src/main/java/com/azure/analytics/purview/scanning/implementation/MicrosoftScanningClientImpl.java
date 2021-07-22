package com.azure.analytics.purview.scanning.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the MicrosoftScanningClient type. */
public final class MicrosoftScanningClientImpl {
    /** The scanning endpoint of your purview account. Example: https://{accountName}.scan.purview.azure.com. */
    private final String endpoint;

    /**
     * Gets The scanning endpoint of your purview account. Example: https://{accountName}.scan.purview.azure.com.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The KeyVaultConnectionsImpl object to access its operations. */
    private final KeyVaultConnectionsImpl keyVaultConnections;

    /**
     * Gets the KeyVaultConnectionsImpl object to access its operations.
     *
     * @return the KeyVaultConnectionsImpl object.
     */
    public KeyVaultConnectionsImpl getKeyVaultConnections() {
        return this.keyVaultConnections;
    }

    /** The ClassificationRulesImpl object to access its operations. */
    private final ClassificationRulesImpl classificationRules;

    /**
     * Gets the ClassificationRulesImpl object to access its operations.
     *
     * @return the ClassificationRulesImpl object.
     */
    public ClassificationRulesImpl getClassificationRules() {
        return this.classificationRules;
    }

    /** The DataSourcesImpl object to access its operations. */
    private final DataSourcesImpl dataSources;

    /**
     * Gets the DataSourcesImpl object to access its operations.
     *
     * @return the DataSourcesImpl object.
     */
    public DataSourcesImpl getDataSources() {
        return this.dataSources;
    }

    /** The FiltersImpl object to access its operations. */
    private final FiltersImpl filters;

    /**
     * Gets the FiltersImpl object to access its operations.
     *
     * @return the FiltersImpl object.
     */
    public FiltersImpl getFilters() {
        return this.filters;
    }

    /** The ScansImpl object to access its operations. */
    private final ScansImpl scans;

    /**
     * Gets the ScansImpl object to access its operations.
     *
     * @return the ScansImpl object.
     */
    public ScansImpl getScans() {
        return this.scans;
    }

    /** The ScanResultsImpl object to access its operations. */
    private final ScanResultsImpl scanResults;

    /**
     * Gets the ScanResultsImpl object to access its operations.
     *
     * @return the ScanResultsImpl object.
     */
    public ScanResultsImpl getScanResults() {
        return this.scanResults;
    }

    /** The ScanRulesetsImpl object to access its operations. */
    private final ScanRulesetsImpl scanRulesets;

    /**
     * Gets the ScanRulesetsImpl object to access its operations.
     *
     * @return the ScanRulesetsImpl object.
     */
    public ScanRulesetsImpl getScanRulesets() {
        return this.scanRulesets;
    }

    /** The SystemScanRulesetsImpl object to access its operations. */
    private final SystemScanRulesetsImpl systemScanRulesets;

    /**
     * Gets the SystemScanRulesetsImpl object to access its operations.
     *
     * @return the SystemScanRulesetsImpl object.
     */
    public SystemScanRulesetsImpl getSystemScanRulesets() {
        return this.systemScanRulesets;
    }

    /** The TriggersImpl object to access its operations. */
    private final TriggersImpl triggers;

    /**
     * Gets the TriggersImpl object to access its operations.
     *
     * @return the TriggersImpl object.
     */
    public TriggersImpl getTriggers() {
        return this.triggers;
    }

    /**
     * Initializes an instance of MicrosoftScanningClient client.
     *
     * @param endpoint The scanning endpoint of your purview account. Example:
     *     https://{accountName}.scan.purview.azure.com.
     * @param apiVersion Api Version.
     */
    public MicrosoftScanningClientImpl(String endpoint, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                apiVersion);
    }

    /**
     * Initializes an instance of MicrosoftScanningClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The scanning endpoint of your purview account. Example:
     *     https://{accountName}.scan.purview.azure.com.
     * @param apiVersion Api Version.
     */
    public MicrosoftScanningClientImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of MicrosoftScanningClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The scanning endpoint of your purview account. Example:
     *     https://{accountName}.scan.purview.azure.com.
     * @param apiVersion Api Version.
     */
    public MicrosoftScanningClientImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.keyVaultConnections = new KeyVaultConnectionsImpl(this);
        this.classificationRules = new ClassificationRulesImpl(this);
        this.dataSources = new DataSourcesImpl(this);
        this.filters = new FiltersImpl(this);
        this.scans = new ScansImpl(this);
        this.scanResults = new ScanResultsImpl(this);
        this.scanRulesets = new ScanRulesetsImpl(this);
        this.systemScanRulesets = new SystemScanRulesetsImpl(this);
        this.triggers = new TriggersImpl(this);
    }
}
