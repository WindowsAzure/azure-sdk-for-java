// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.perf;

import com.azure.perf.test.core.PerfStressProgram;

/**
 * Runs the EventHubs performance test.
 *
 * <p>To run from command line. Package the project into a jar with dependencies via mvn clean package.
 * Then run the program via java -jar 'compiled-jar-with-dependencies-path' </p>
 *
 * <p> To run from IDE, set all the required environment variables in IntelliJ via Run -&gt; EditConfigurations
 * section.
 * Then run the App's main method via IDE.</p>
 */
public class App {

    /**
     * Runs the Performance Test.
     * @param args the arguments to be used for performance testing
     */
    public static void main(String[] args) {
        PerfStressProgram.run(new Class<?>[]{
            SendEventBatchTest.class
        }, args);
    }
}
