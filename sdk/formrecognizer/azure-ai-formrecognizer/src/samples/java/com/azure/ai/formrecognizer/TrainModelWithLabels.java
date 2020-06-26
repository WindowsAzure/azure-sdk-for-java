// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.CustomFormModel;
import com.azure.ai.formrecognizer.models.CustomFormSubmodel;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.TrainingDocumentInfo;
import com.azure.ai.formrecognizer.training.FormTrainingClient;
import com.azure.ai.formrecognizer.training.FormTrainingClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.polling.SyncPoller;

/**
 * Sample to train a model with labeled data.
 * For instructions on setting up forms for training in an Azure Storage Blob Container, see
 * https://docs.microsoft.com/azure/cognitive-services/form-recognizer/build-training-data-set#upload-your-training-data
 * For this sample, you can use the training forms found in https://aka.ms/azsdk/formrecognizer/docs/trainingdocs to
 * create your own custom models.
 * Further, see RecognizeCustomForms.java to recognize forms with your custom built model.
 */
public class TrainModelWithLabels {

    /**
     * Main method to invoke this demo.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.

        FormTrainingClient client = new FormTrainingClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildClient();

        // Train custom model
        String trainingFilesUrl = "{CONTAINER_SAS_URL}"; // The shared access signature (SAS) Url of your Azure Blob Storage container with your forms.
        SyncPoller<OperationResult, CustomFormModel> trainingPoller = client.beginTraining(trainingFilesUrl, true);

        CustomFormModel customFormModel = trainingPoller.getFinalResult();

        // Model Info
        System.out.printf("Model Id: %s%n", customFormModel.getModelId());
        System.out.printf("Model Status: %s%n", customFormModel.getModelStatus());
        System.out.printf("Training started on: %s%n", customFormModel.getTrainingStartedOn());
        System.out.printf("Training completed on: %s%n%n", customFormModel.getTrainingCompletedOn());

        // looping through the sub-models, which contains the fields they were trained on
        // The labels are based on the ones you gave the training document.
        System.out.println("Recognized Fields:");
        // Since the data is labeled, we are able to return the accuracy of the model
        customFormModel.getSubmodels().forEach(customFormSubmodel -> {
            System.out.printf("Sub-model accuracy: %.2f%n", customFormSubmodel.getAccuracy());
            customFormSubmodel.getFields().forEach((label, customFormModelField) ->
                System.out.printf("Field: %s Field Name: %s Field Accuracy: %.2f%n",
                    label, customFormModelField.getName(), customFormModelField.getAccuracy()));
        });
        System.out.println();
        customFormModel.getTrainingDocuments().forEach(trainingDocumentInfo -> {
            System.out.printf("Document name: %s%n", trainingDocumentInfo.getName());
            System.out.printf("Document status: %s%n", trainingDocumentInfo.getName());
            System.out.printf("Document page count: %d%n", trainingDocumentInfo.getPageCount());
            if (!trainingDocumentInfo.getDocumentErrors().isEmpty()) {
                System.out.println("Document Errors:");
                trainingDocumentInfo.getDocumentErrors().forEach(formRecognizerError ->
                    System.out.printf("Error code %s, Error message: %s%n", formRecognizerError.getCode(),
                        formRecognizerError.getMessage()));
            }
        });
    }
}
