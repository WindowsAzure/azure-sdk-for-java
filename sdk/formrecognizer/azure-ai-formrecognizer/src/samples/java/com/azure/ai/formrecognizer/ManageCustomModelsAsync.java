// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.core.credential.AzureKeyCredential;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Sample for demonstrating common custom model management operations.
 */
public class ManageCustomModelsAsync {

    /**
     * Main program to invoke the demo for performing operations of a custom model.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(final String[] args) {
        // Instantiate a client that will be used to call the service.
        FormTrainingAsyncClient client = new FormRecognizerClientBuilder()
            .apiKey(new AzureKeyCredential("{api_key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildAsyncClient().getFormTrainingAsyncClient();

        AtomicReference<String> modelId = null;

        // First, we see how many custom models we have, and what our limit is
        client.getAccountProperties().subscribe(accountProperties ->
            System.out.printf("The account has %s custom models, and we can have at most %s custom models",
                accountProperties.getCount(), accountProperties.getLimit()));

        // Next, we get a paged list of all of our custom models
        System.out.println("We have following models in the account:");
        client.listModels().subscribe(customFormModelInfo -> {
            System.out.printf("Model Id: %s%n", customFormModelInfo.getModelId());
            // get custom model info
            modelId.set(customFormModelInfo.getModelId());
            client.getCustomModel(customFormModelInfo.getModelId()).subscribe(customModel -> {
                System.out.printf("Model Id: %s%n", customModel.getModelId());
                System.out.printf("Model Status: %s%n", customModel.getModelStatus());
                System.out.printf("Created on: %s%n", customModel.getCreatedOn());
                System.out.printf("Updated on: %s%n", customModel.getLastUpdatedOn());
                customModel.getSubModels().forEach(customFormSubModel -> {
                    System.out.printf("Custom Model Form type: %s%n", customFormSubModel.getFormType());
                    System.out.printf("Custom Model Accuracy: %s%n", customFormSubModel.getAccuracy());
                    if (customFormSubModel.getFieldMap() != null) {
                        customFormSubModel.getFieldMap().forEach((fieldText, customFormModelField) -> {
                            System.out.printf("Field Text: %s%n", fieldText);
                            System.out.printf("Field Accuracy: %s%n", customFormModelField.getAccuracy());
                        });
                    }

                });
            });
        });

        // Delete Custom Model
        System.out.printf("Deleted model with model Id: %s%n", modelId.get(),
            client.deleteModelWithResponse(modelId.get()));
    }
}
