// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.analytics.synapse.spark;

import com.azure.analytics.synapse.spark.models.SparkBatchJob;
import com.azure.analytics.synapse.spark.models.SparkBatchJobCollection;
import com.azure.analytics.synapse.spark.models.SparkBatchJobOptions;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.Arrays;

public class HelloWorld {

    /**
     * Authenticates with the Synapse workspace and shows how to set, get, update and delete a spark job in the workspace.
     *
     * @param args Unused. Arguments to the program.
     * @throws IllegalArgumentException when invalid workspace endpoint is passed.
     */
    public static void main(String[] args) throws  IllegalArgumentException {
        // Instantiate a Spark Batch client that will be used to call the service. Notice that the client is using default Azure
        // credentials. To make default credentials work, ensure that environment variables 'AZURE_CLIENT_ID',
        // 'AZURE_CLIENT_KEY' and 'AZURE_TENANT_ID' are set with the service principal credentials.
        SparkBatchClient batchClient = new SparkClientBuilder()
            .endpoint("https://{YOUR_WORKSPACE_NAME}.dev.azuresynapse.net")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildSparkBatchClient();

        String storageAccount = "<storage-account>";
        String fileSystem = "<file-system>";
        String name = "<job-name>";
        String file = String.format("abfss://%s@%s.dfs.core.windows.net/samples/java/wordcount/wordcount.jar", fileSystem, storageAccount);
        SparkBatchJobOptions options = new SparkBatchJobOptions()
            .setName(name)
            .setFile(file)
            .setClassName("WordCount")
            .setArguments(Arrays.asList(
                String.format("abfss://%s@%s.dfs.core.windows.net/samples/java/wordcount/shakespeare.txt", fileSystem, storageAccount),
                String.format("abfss://%s@%s.dfs.core.windows.net/samples/java/wordcount/result/", fileSystem, storageAccount)
            ))
            .setDriverMemory("28g")
            .setDriverCores(4)
            .setExecutorMemory("28g")
            .setExecutorCores(4)
            .setExecutorCount(2);

        SparkBatchJob jobCreated = batchClient.createSparkBatchJob(options);

        // List Spark batch jobs
        SparkBatchJobCollection jobs = batchClient.getSparkBatchJobs();
        for (SparkBatchJob job : jobs.getSessions()) {
            System.out.println(job.getName());
        }

        // Cancel Spark batch job
        int jobId = 0;
        batchClient.cancelSparkBatchJob(jobId);
    }
}
