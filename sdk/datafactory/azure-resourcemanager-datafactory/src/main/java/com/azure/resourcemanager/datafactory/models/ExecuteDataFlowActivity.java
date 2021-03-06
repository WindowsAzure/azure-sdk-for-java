// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Execute data flow activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecuteDataFlow")
@JsonFlatten
@Fluent
public class ExecuteDataFlowActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExecuteDataFlowActivity.class);

    /*
     * Data flow reference.
     */
    @JsonProperty(value = "typeProperties.dataFlow", required = true)
    private DataFlowReference dataFlow;

    /*
     * Staging info for execute data flow activity.
     */
    @JsonProperty(value = "typeProperties.staging")
    private DataFlowStagingInfo staging;

    /*
     * The integration runtime reference.
     */
    @JsonProperty(value = "typeProperties.integrationRuntime")
    private IntegrationRuntimeReference integrationRuntime;

    /*
     * Compute properties for data flow activity.
     */
    @JsonProperty(value = "typeProperties.compute")
    private ExecuteDataFlowActivityTypePropertiesCompute compute;

    /*
     * Trace level setting used for data flow monitoring output. Supported
     * values are: 'coarse', 'fine', and 'none'. Type: string (or Expression
     * with resultType string)
     */
    @JsonProperty(value = "typeProperties.traceLevel")
    private Object traceLevel;

    /*
     * Continue on error setting used for data flow execution. Enables
     * processing to continue if a sink fails. Type: boolean (or Expression
     * with resultType boolean)
     */
    @JsonProperty(value = "typeProperties.continueOnError")
    private Object continueOnError;

    /*
     * Concurrent run setting used for data flow execution. Allows sinks with
     * the same save order to be processed concurrently. Type: boolean (or
     * Expression with resultType boolean)
     */
    @JsonProperty(value = "typeProperties.runConcurrently")
    private Object runConcurrently;

    /**
     * Get the dataFlow property: Data flow reference.
     *
     * @return the dataFlow value.
     */
    public DataFlowReference dataFlow() {
        return this.dataFlow;
    }

    /**
     * Set the dataFlow property: Data flow reference.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withDataFlow(DataFlowReference dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get the staging property: Staging info for execute data flow activity.
     *
     * @return the staging value.
     */
    public DataFlowStagingInfo staging() {
        return this.staging;
    }

    /**
     * Set the staging property: Staging info for execute data flow activity.
     *
     * @param staging the staging value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withStaging(DataFlowStagingInfo staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the integrationRuntime property: The integration runtime reference.
     *
     * @return the integrationRuntime value.
     */
    public IntegrationRuntimeReference integrationRuntime() {
        return this.integrationRuntime;
    }

    /**
     * Set the integrationRuntime property: The integration runtime reference.
     *
     * @param integrationRuntime the integrationRuntime value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withIntegrationRuntime(IntegrationRuntimeReference integrationRuntime) {
        this.integrationRuntime = integrationRuntime;
        return this;
    }

    /**
     * Get the compute property: Compute properties for data flow activity.
     *
     * @return the compute value.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute compute() {
        return this.compute;
    }

    /**
     * Set the compute property: Compute properties for data flow activity.
     *
     * @param compute the compute value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        this.compute = compute;
        return this;
    }

    /**
     * Get the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @return the traceLevel value.
     */
    public Object traceLevel() {
        return this.traceLevel;
    }

    /**
     * Set the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @param traceLevel the traceLevel value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withTraceLevel(Object traceLevel) {
        this.traceLevel = traceLevel;
        return this;
    }

    /**
     * Get the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnError value.
     */
    public Object continueOnError() {
        return this.continueOnError;
    }

    /**
     * Set the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnError the continueOnError value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withContinueOnError(Object continueOnError) {
        this.continueOnError = continueOnError;
        return this;
    }

    /**
     * Get the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @return the runConcurrently value.
     */
    public Object runConcurrently() {
        return this.runConcurrently;
    }

    /**
     * Set the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @param runConcurrently the runConcurrently value to set.
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withRunConcurrently(Object runConcurrently) {
        this.runConcurrently = runConcurrently;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteDataFlowActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataFlow() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataFlow in model ExecuteDataFlowActivity"));
        } else {
            dataFlow().validate();
        }
        if (staging() != null) {
            staging().validate();
        }
        if (integrationRuntime() != null) {
            integrationRuntime().validate();
        }
        if (compute() != null) {
            compute().validate();
        }
    }
}
