// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.FormField;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Async sample for recognizing US receipt information using file source URL.
 */
public class RecognizeReceiptsFromUrlAsync {

    /**
     * Main method to invoke this demo.
     *
     * @param args Unused. Arguments to the program.
     */
    @SuppressWarnings("unchecked")
    public static void main(final String[] args) {
        // Instantiate a client that will be used to call the service.
        FormRecognizerAsyncClient client = new FormRecognizerClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildAsyncClient();

        String receiptUrl = "https://raw.githubusercontent.com/Azure/azure-sdk-for-java/master/sdk/formrecognizer"
            + "/azure-ai-formrecognizer/src/samples/java/sample-forms/receipts/contoso-allinone.jpg";
        PollerFlux<OperationResult, List<RecognizedForm>> recognizeReceiptPoller =
            client.beginRecognizeReceiptsFromUrl(receiptUrl);

        Mono<List<RecognizedForm>> receiptPageResults = recognizeReceiptPoller
            .last()
            .flatMap(trainingOperationResponse -> {
                if (trainingOperationResponse.getStatus().isComplete()) {
                    System.out.println("Polling completed successfully");
                    // training completed successfully, retrieving final result.
                    return trainingOperationResponse.getFinalResult();
                } else {
                    return Mono.error(new RuntimeException("Polling completed unsuccessfully with status:"
                        + trainingOperationResponse.getStatus()));
                }
            });

        receiptPageResults.subscribe(recognizedReceipts -> {
            for (int i = 0; i < recognizedReceipts.size(); i++) {
                RecognizedForm recognizedReceipt = recognizedReceipts.get(i);
                Map<String, FormField<?>> recognizedFields = recognizedReceipt.getFields();
                System.out.printf("----------- Recognized Receipt page %d -----------%n", i);
                FormField<?> merchantNameField = recognizedFields.get("MerchantName");
                if (merchantNameField != null) {
                    Object merchantNameFieldValue = recognizedFields.get("MerchantName").getFieldValue();
                    if (merchantNameFieldValue instanceof String) {
                        System.out.printf("Merchant Name: %s, confidence: %.2f%n",
                            merchantNameFieldValue, merchantNameField.getConfidence());
                    }
                }

                FormField<?> merchantAddressField = recognizedFields.get("MerchantAddress");
                if (merchantAddressField != null) {
                    Object merchantAddressFieldValue = recognizedFields.get("MerchantAddress").getFieldValue();
                    if (merchantAddressFieldValue instanceof String) {
                        System.out.printf("Merchant Address: %s, confidence: %.2f%n",
                            merchantAddressFieldValue, merchantAddressField.getConfidence());
                    }
                }

                FormField<?> transactionDateField = recognizedFields.get("TransactionDate");
                if (transactionDateField != null) {
                    Object transactionDateFieldValue = recognizedFields.get("TransactionDate").getFieldValue();
                    if (transactionDateFieldValue instanceof LocalDate) {
                        LocalDate transactionDate = (LocalDate) transactionDateFieldValue;
                        System.out.printf("Transaction Date: %s, confidence: %.2f%n",
                            transactionDate, transactionDateField.getConfidence());
                    }
                }

                FormField<?> receiptItemsField = recognizedFields.get("Items");
                if (receiptItemsField != null) {
                    System.out.printf("Receipt Items: %n");
                    if (receiptItemsField.getFieldValue() instanceof List) {
                        List<FormField<?>> receiptItems = (List<FormField<?>>) receiptItemsField.getFieldValue();
                        receiptItems.forEach(receiptItem -> {
                            if (receiptItem.getFieldValue() instanceof Map) {
                                ((Map<String, FormField<?>>) receiptItem.getFieldValue()).forEach((key, formField) -> {
                                    if ("Name".equals(key)) {
                                        if (formField.getFieldValue() instanceof String) {
                                            System.out.printf("Name: %s, confidence: %.2fs%n",
                                                formField.getFieldValue(),
                                                formField.getConfidence());
                                        }
                                    }
                                    if ("Quantity".equals(key)) {
                                        if (formField.getFieldValue() instanceof Integer) {
                                            System.out.printf("Quantity: %d, confidence: %.2f%n",
                                                formField.getFieldValue(), formField.getConfidence());
                                        }
                                    }
                                    if ("Price".equals(key)) {
                                        if (formField.getFieldValue() instanceof Float) {
                                            System.out.printf("Price: %f, confidence: %.2f%n",
                                                formField.getFieldValue(),
                                                formField.getConfidence());
                                        }
                                    }
                                    if ("TotalPrice".equals(key)) {
                                        if (formField.getFieldValue() instanceof Float) {
                                            System.out.printf("Total Price: %f, confidence: %.2f%n",
                                                formField.getFieldValue(),
                                                formField.getConfidence());
                                        }
                                    }
                                });
                            }
                        });
                    }
                    System.out.print("-----------------------------------");
                }
            }
        });

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
