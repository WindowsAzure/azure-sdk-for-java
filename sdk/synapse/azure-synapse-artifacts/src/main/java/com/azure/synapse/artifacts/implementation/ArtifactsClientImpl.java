// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the ArtifactsClient type. */
public final class ArtifactsClientImpl {
    /** The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net. */
    private final String endpoint;

    /**
     * Gets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
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

    /** The LinkedServicesImpl object to access its operations. */
    private final LinkedServicesImpl linkedServices;

    /**
     * Gets the LinkedServicesImpl object to access its operations.
     *
     * @return the LinkedServicesImpl object.
     */
    public LinkedServicesImpl getLinkedServices() {
        return this.linkedServices;
    }

    /** The DatasetsImpl object to access its operations. */
    private final DatasetsImpl datasets;

    /**
     * Gets the DatasetsImpl object to access its operations.
     *
     * @return the DatasetsImpl object.
     */
    public DatasetsImpl getDatasets() {
        return this.datasets;
    }

    /** The PipelinesImpl object to access its operations. */
    private final PipelinesImpl pipelines;

    /**
     * Gets the PipelinesImpl object to access its operations.
     *
     * @return the PipelinesImpl object.
     */
    public PipelinesImpl getPipelines() {
        return this.pipelines;
    }

    /** The PipelineRunsImpl object to access its operations. */
    private final PipelineRunsImpl pipelineRuns;

    /**
     * Gets the PipelineRunsImpl object to access its operations.
     *
     * @return the PipelineRunsImpl object.
     */
    public PipelineRunsImpl getPipelineRuns() {
        return this.pipelineRuns;
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

    /** The TriggerRunsImpl object to access its operations. */
    private final TriggerRunsImpl triggerRuns;

    /**
     * Gets the TriggerRunsImpl object to access its operations.
     *
     * @return the TriggerRunsImpl object.
     */
    public TriggerRunsImpl getTriggerRuns() {
        return this.triggerRuns;
    }

    /** The DataFlowsImpl object to access its operations. */
    private final DataFlowsImpl dataFlows;

    /**
     * Gets the DataFlowsImpl object to access its operations.
     *
     * @return the DataFlowsImpl object.
     */
    public DataFlowsImpl getDataFlows() {
        return this.dataFlows;
    }

    /** The DataFlowDebugSessionsImpl object to access its operations. */
    private final DataFlowDebugSessionsImpl dataFlowDebugSessions;

    /**
     * Gets the DataFlowDebugSessionsImpl object to access its operations.
     *
     * @return the DataFlowDebugSessionsImpl object.
     */
    public DataFlowDebugSessionsImpl getDataFlowDebugSessions() {
        return this.dataFlowDebugSessions;
    }

    /** The SqlScriptsImpl object to access its operations. */
    private final SqlScriptsImpl sqlScripts;

    /**
     * Gets the SqlScriptsImpl object to access its operations.
     *
     * @return the SqlScriptsImpl object.
     */
    public SqlScriptsImpl getSqlScripts() {
        return this.sqlScripts;
    }

    /** The SparkJobDefinitionsImpl object to access its operations. */
    private final SparkJobDefinitionsImpl sparkJobDefinitions;

    /**
     * Gets the SparkJobDefinitionsImpl object to access its operations.
     *
     * @return the SparkJobDefinitionsImpl object.
     */
    public SparkJobDefinitionsImpl getSparkJobDefinitions() {
        return this.sparkJobDefinitions;
    }

    /** The NotebooksImpl object to access its operations. */
    private final NotebooksImpl notebooks;

    /**
     * Gets the NotebooksImpl object to access its operations.
     *
     * @return the NotebooksImpl object.
     */
    public NotebooksImpl getNotebooks() {
        return this.notebooks;
    }

    /** The WorkspacesImpl object to access its operations. */
    private final WorkspacesImpl workspaces;

    /**
     * Gets the WorkspacesImpl object to access its operations.
     *
     * @return the WorkspacesImpl object.
     */
    public WorkspacesImpl getWorkspaces() {
        return this.workspaces;
    }

    /** The SqlPoolsImpl object to access its operations. */
    private final SqlPoolsImpl sqlPools;

    /**
     * Gets the SqlPoolsImpl object to access its operations.
     *
     * @return the SqlPoolsImpl object.
     */
    public SqlPoolsImpl getSqlPools() {
        return this.sqlPools;
    }

    /** The BigDataPoolsImpl object to access its operations. */
    private final BigDataPoolsImpl bigDataPools;

    /**
     * Gets the BigDataPoolsImpl object to access its operations.
     *
     * @return the BigDataPoolsImpl object.
     */
    public BigDataPoolsImpl getBigDataPools() {
        return this.bigDataPools;
    }

    /** The IntegrationRuntimesImpl object to access its operations. */
    private final IntegrationRuntimesImpl integrationRuntimes;

    /**
     * Gets the IntegrationRuntimesImpl object to access its operations.
     *
     * @return the IntegrationRuntimesImpl object.
     */
    public IntegrationRuntimesImpl getIntegrationRuntimes() {
        return this.integrationRuntimes;
    }

    /** The WorkspaceGitRepoManagementsImpl object to access its operations. */
    private final WorkspaceGitRepoManagementsImpl workspaceGitRepoManagements;

    /**
     * Gets the WorkspaceGitRepoManagementsImpl object to access its operations.
     *
     * @return the WorkspaceGitRepoManagementsImpl object.
     */
    public WorkspaceGitRepoManagementsImpl getWorkspaceGitRepoManagements() {
        return this.workspaceGitRepoManagements;
    }

    /**
     * Initializes an instance of ArtifactsClient client.
     *
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    public ArtifactsClientImpl(String endpoint) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint);
    }

    /**
     * Initializes an instance of ArtifactsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    public ArtifactsClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of ArtifactsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     */
    public ArtifactsClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = "2019-06-01-preview";
        this.linkedServices = new LinkedServicesImpl(this);
        this.datasets = new DatasetsImpl(this);
        this.pipelines = new PipelinesImpl(this);
        this.pipelineRuns = new PipelineRunsImpl(this);
        this.triggers = new TriggersImpl(this);
        this.triggerRuns = new TriggerRunsImpl(this);
        this.dataFlows = new DataFlowsImpl(this);
        this.dataFlowDebugSessions = new DataFlowDebugSessionsImpl(this);
        this.sqlScripts = new SqlScriptsImpl(this);
        this.sparkJobDefinitions = new SparkJobDefinitionsImpl(this);
        this.notebooks = new NotebooksImpl(this);
        this.workspaces = new WorkspacesImpl(this);
        this.sqlPools = new SqlPoolsImpl(this);
        this.bigDataPools = new BigDataPoolsImpl(this);
        this.integrationRuntimes = new IntegrationRuntimesImpl(this);
        this.workspaceGitRepoManagements = new WorkspaceGitRepoManagementsImpl(this);
    }
}
