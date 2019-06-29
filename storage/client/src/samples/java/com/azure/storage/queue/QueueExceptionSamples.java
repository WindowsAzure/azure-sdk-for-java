// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue;

import com.azure.core.http.rest.Response;
import com.azure.storage.queue.models.StorageErrorCode;
import com.azure.storage.queue.models.StorageErrorException;

import java.util.UUID;

public class QueueExceptionSamples {
    private static final String accountName = System.getenv("AZURE_STORAGE_ACCOUNT_NAME");
    private static final String sasToken = System.getenv("PRIMARY_SAS_TOKEN");

    public static void main(String[] args) {
        // Create a queue service client.
        String queueServiceURL = String.format("https://%s.queue.core.windows.net/%s", accountName, sasToken);
        QueueServiceClient queueServiceClient = QueueServiceClient.builder().endpoint(queueServiceURL).build();

        // Create queue client.
        Response<QueueClient> queueClientResponse = null;
        try {
            queueClientResponse = queueServiceClient.createQueue(generateRandomName("delete-not-exist", 16));
            System.out.println("Successfully create the queue! Status code: " + String.valueOf(queueClientResponse.statusCode()));
        } catch (StorageErrorException e) {
            System.out.println(String.format("Error creating a queue. Error message: %s", e.value().message()));
        }
        QueueClient queueClient = queueClientResponse.value();
        queueClient.enqueueMessage("Hello, message 1!");
        queueClient.enqueueMessage("Hello, message 2!");

        // Delete message with wrong message id.
        try {
            queueClientResponse.value().dequeueMessages().forEach(
                msg -> {
                    queueClient.deleteMessage("wrong id", msg.popReceipt());
                }
            );
        } catch (StorageErrorException e) {
            if (e.getMessage().contains(StorageErrorCode.MESSAGE_NOT_FOUND.toString())) {
                System.out.println("This is the error expected to throw");
            } else {
                System.out.println("This is not the error we expect!");
            }
        }

        // Delete message with wrong pop receipt.
        try {
            queueClient.dequeueMessages().forEach(
                msg -> {
                    queueClient.deleteMessage(msg.messageId(), "Wrong Pop Receipt");
                }
            );
        } catch (StorageErrorException e) {
            if (e.getMessage().contains(StorageErrorCode.INVALID_QUERY_PARAMETER_VALUE.toString())) {
                System.out.println("This is the error expected to throw");
            } else {
                System.out.println("This is not the error we expect!");
            }
        }
    }

    private static String generateRandomName(String prefix, int length) {
        int len = length > prefix.length() ? length - prefix.length() : 0;
        return prefix + UUID.randomUUID().toString().substring(0, len);
    }
}
