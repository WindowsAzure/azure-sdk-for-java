// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics;

import com.azure.ai.textanalytics.models.DetectedLanguage;

import java.util.concurrent.TimeUnit;

/**
 * Sample demonstrate how to detect language of a text input in asynchronously call.
 */
public class HelloWorldAsync {
    /**
     * Main method to invoke this demo about how to detect language of a text input.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsAsyncClient client = new TextAnalyticsClientBuilder()
            .subscriptionKey("subscription-key")
            .endpoint("https://servicename.cognitiveservices.azure.com/")
            .buildAsyncClient();

        // The text that need be analysed.
        String text = "hello world";

        client.detectLanguage(text).subscribe(
            result -> {
                final DetectedLanguage primaryLanguage = result.getPrimaryLanguage();
                System.out.printf("Detected Language: %s, ISO 6391 Name: %s, Score: %s.%n",
                    primaryLanguage.getName(), primaryLanguage.getIso6391Name(), primaryLanguage.getScore());
            },
            error -> System.err.println("There was an error detecting language of the text." + error),
            () -> System.out.println("Language detected."));

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ignored) {
        }
    }
}
