// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import org.junit.Assert;
import org.junit.Test;

public class SendOptionsTest {

    /**
     * Verifies that the default values are correctly set when creating an instance.
     */
    @Test
    public void createDefault() {
        SendOptions options = new SendOptions();
        Assert.assertNull(options.partitionKey());
    }

    /**
     * Verifies we can set partitionKey on the send options.
     */
    @Test
    public void setPartitionKey() {
        String partitionKey = "My partition key";
        SendOptions options = new SendOptions();

        options.partitionKey(partitionKey);
        Assert.assertEquals(partitionKey, options.partitionKey());
    }

    /**
     * Verifies we can create a clone that is independent of the original.
     */
    @Test
    public void cloneIdentical() {
        // Arrange
        String partitionKey = "My partition key";
        SendOptions options = new SendOptions().partitionKey(partitionKey);

        // Act
        SendOptions clone = (SendOptions) options.clone();

        // Assert
        Assert.assertNotSame(clone, options);

        Assert.assertEquals(partitionKey, options.partitionKey());
        Assert.assertEquals(partitionKey, clone.partitionKey());
    }


    /**
     * Verifies we can modify contents of the clone without affecting the original.
     */
    @Test
    public void cloneModifyContents() {
        // Arrange
        String originalPartitionKey = "Some partition key";
        String partitionKey = "A new partition key";

        SendOptions options = new SendOptions().partitionKey(originalPartitionKey);
        SendOptions clone = (SendOptions) options.clone();

        // Act
        clone.partitionKey(partitionKey);

        // Assert
        Assert.assertEquals(partitionKey, clone.partitionKey());
        Assert.assertEquals(originalPartitionKey, options.partitionKey());
    }
}
