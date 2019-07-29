/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for all execution activities.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Execution")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DatabricksNotebook", value = DatabricksNotebookActivity.class),
    @JsonSubTypes.Type(name = "DataLakeAnalyticsU-SQL", value = DataLakeAnalyticsUSQLActivity.class),
    @JsonSubTypes.Type(name = "AzureMLUpdateResource", value = AzureMLUpdateResourceActivity.class),
    @JsonSubTypes.Type(name = "AzureMLBatchExecution", value = AzureMLBatchExecutionActivity.class),
    @JsonSubTypes.Type(name = "GetMetadata", value = GetMetadataActivity.class),
    @JsonSubTypes.Type(name = "WebActivity", value = WebActivity.class),
    @JsonSubTypes.Type(name = "Lookup", value = LookupActivity.class),
    @JsonSubTypes.Type(name = "SqlServerStoredProcedure", value = SqlServerStoredProcedureActivity.class),
    @JsonSubTypes.Type(name = "Custom", value = CustomActivity.class),
    @JsonSubTypes.Type(name = "ExecuteSSISPackage", value = ExecuteSSISPackageActivity.class),
    @JsonSubTypes.Type(name = "HDInsightSpark", value = HDInsightSparkActivity.class),
    @JsonSubTypes.Type(name = "HDInsightStreaming", value = HDInsightStreamingActivity.class),
    @JsonSubTypes.Type(name = "HDInsightMapReduce", value = HDInsightMapReduceActivity.class),
    @JsonSubTypes.Type(name = "HDInsightPig", value = HDInsightPigActivity.class),
    @JsonSubTypes.Type(name = "HDInsightHive", value = HDInsightHiveActivity.class),
    @JsonSubTypes.Type(name = "Copy", value = CopyActivity.class)
})
public class ExecutionActivity extends Activity {
    /**
     * Linked service reference.
     */
    @JsonProperty(value = "linkedServiceName")
    private LinkedServiceReference linkedServiceName;

    /**
     * Activity policy.
     */
    @JsonProperty(value = "policy")
    private ActivityPolicy policy;

    /**
     * Get linked service reference.
     *
     * @return the linkedServiceName value
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the ExecutionActivity object itself.
     */
    public ExecutionActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get activity policy.
     *
     * @return the policy value
     */
    public ActivityPolicy policy() {
        return this.policy;
    }

    /**
     * Set activity policy.
     *
     * @param policy the policy value to set
     * @return the ExecutionActivity object itself.
     */
    public ExecutionActivity withPolicy(ActivityPolicy policy) {
        this.policy = policy;
        return this;
    }

}
