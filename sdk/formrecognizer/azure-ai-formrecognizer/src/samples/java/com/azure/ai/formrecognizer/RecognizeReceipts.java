// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.FormField;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.polling.SyncPoller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Sample for recognizing commonly found US receipt fields from a local file input stream.
 * For a suggested approach to extracting information from receipts, see StronglyTypedRecognizedForm.java.
 * See fields found on a receipt here:
 * https://aka.ms/azsdk/python/formrecognizer/receiptfields
 */
public class RecognizeReceipts {

    /**
     * Main method to invoke this demo.
     *
     * @param args Unused. Arguments to the program.
     *
     * @throws IOException from reading file.
     */
    @SuppressWarnings("unchecked")
    public static void main(final String[] args) throws IOException {
        // Instantiate a client that will be used to call the service.
        FormRecognizerClient client = new FormRecognizerClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildClient();

        File sourceFile = new File("../formrecognizer/azure-ai-formrecognizer/src/samples/java/sample-forms/"
            + "receipts/contoso-allinone.jpg");
        byte[] fileContent = Files.readAllBytes(sourceFile.toPath());
        InputStream targetStream = new ByteArrayInputStream(fileContent);

        SyncPoller<OperationResult, List<RecognizedReceipt>> analyzeReceiptPoller =
            client.beginRecognizeReceipts(targetStream, sourceFile.length());

        List<RecognizedForm> receiptPageResults = analyzeReceiptPoller.getFinalResult();

        for (int i = 0; i < receiptPageResults.size(); i++) {
            RecognizedForm recognizedReceipt = receiptPageResults.get(i);
            Map<String, FormField<?>> recognizedFields = recognizedReceipt.getFields();
            System.out.printf("----------- Recognized Receipt page %d -----------%n", i);
            FormField<?> merchantNameField = recognizedFields.get("MerchantName");
            if (merchantNameField != null) {
                Object merchantNameFieldValue = merchantNameField.getValue();
                if (merchantNameFieldValue instanceof String) {
                    String merchantName = (String) merchantNameFieldValue;
                    System.out.printf("Merchant Name: %s, confidence: %.2f%n",
                        merchantName, merchantNameField.getConfidence());
                }
            }

            FormField<?> merchantAddressField = recognizedFields.get("MerchantAddress");
            if (merchantAddressField != null) {
                Object merchantAddressFieldValue = merchantAddressField.getValue();
                if (merchantAddressFieldValue instanceof String) {
                    String merchantAddress = (String) merchantAddressFieldValue;
                    System.out.printf("Merchant Address: %s, confidence: %.2f%n",
                        merchantAddress, merchantAddressField.getConfidence());
                }
            }

            FormField<?> transactionDateField = recognizedFields.get("TransactionDate");
            if (transactionDateField != null) {
                Object transactionDateFieldValue = transactionDateField.getValue();
                if (transactionDateFieldValue instanceof LocalDate) {
                    LocalDate transactionDate = (LocalDate) transactionDateFieldValue;
                    System.out.printf("Transaction Date: %s, confidence: %.2f%n",
                        transactionDate, transactionDateField.getConfidence());
                }
            }

            FormField<?> receiptItemsField = recognizedFields.get("Items");
            if (receiptItemsField != null) {
                System.out.printf("Receipt Items: %n");
                if (receiptItemsField.getValue() instanceof List) {
                    List<FormField<?>> receiptItems = (List<FormField<?>>) receiptItemsField.getValue();
                    receiptItems.forEach(receiptItem -> {
                        if (receiptItem.getValue() instanceof Map) {
                            ((Map<String, FormField<?>>) receiptItem.getValue()).forEach((key, formField) -> {
                                if ("Name".equals(key)) {
                                    if (formField.getValue() instanceof String) {
                                        String name = (String) formField.getValue();
                                        System.out.printf("Name: %s, confidence: %.2fs%n",
                                            name, formField.getConfidence());
                                    }
                                }
                                if ("Quantity".equals(key)) {
                                    if (formField.getValue() instanceof Integer) {
                                        Integer quantity = (Integer) formField.getValue();
                                        System.out.printf("Quantity: %d, confidence: %.2f%n",
                                            quantity, formField.getConfidence());
                                    }
                                }
                                if ("Price".equals(key)) {
                                    if (formField.getValue() instanceof Float) {
                                        Float price = (Float) formField.getValue();
                                        System.out.printf("Price: %f, confidence: %.2f%n",
                                            price, formField.getConfidence());
                                    }
                                }
                                if ("TotalPrice".equals(key)) {
                                    if (formField.getValue() instanceof Float) {
                                        Float totalPrice = (Float) formField.getValue();
                                        System.out.printf("Total Price: %f, confidence: %.2f%n",
                                            totalPrice, formField.getConfidence());
                                    }
                                }
                            });
                        }
                    });
                }
            }
            System.out.print("-----------------------------------");
        }
    }
}
