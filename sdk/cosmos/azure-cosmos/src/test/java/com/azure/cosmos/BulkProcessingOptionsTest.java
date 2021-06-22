// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos;

import com.azure.cosmos.implementation.ImplementationBridgeHelpers;
import com.azure.cosmos.implementation.batch.PartitionScopeThresholds;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ConcurrentMap;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertEquals;

public class BulkProcessingOptionsTest {

    private static final Random rnd = new Random();
    private static final ImplementationBridgeHelpers.BulkProcessingThresholdsHelper.BulkProcessingThresholdsAccessor
        bulkProcessingThresholdsAccessor = ImplementationBridgeHelpers
            .BulkProcessingThresholdsHelper
            .getBulkProcessingThresholdsAccessor();

    @Test(groups = { "unit" })
    public void minAndMaxTargetRetryRateMustNotBeNegative() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new BulkProcessingOptions<Object>().setTargetedMicroBatchRetryRate(-0.001, 0));

        assertThrows(
            IllegalArgumentException.class,
            () -> new BulkProcessingOptions<Object>().setTargetedMicroBatchRetryRate(0.3, 0.29999));
    }

    @Test(groups = { "unit" })
    public void minAndMaxTargetRetryRate() {
        BulkProcessingOptions<Object> options = new BulkProcessingOptions<Object>();

        double rnd1 = rnd.nextDouble();
        double rnd2 = rnd.nextDouble();
        double randomMin = Math.min(rnd1, rnd2);
        double randomMax = Math.max(rnd1, rnd2);
        assertEquals(
            randomMin,
            options.setTargetedMicroBatchRetryRate(randomMin, randomMax).getMinTargetedMicroBatchRetryRate());
        assertEquals(
            randomMax,
            options.setTargetedMicroBatchRetryRate(randomMin, randomMax).getMaxTargetedMicroBatchRetryRate());
    }

    @Test(groups = { "unit" })
    public void thresholdsInstanceCanBePassedAcrossBulkProcessingOptionsInstances() {
        BulkProcessingOptions<Object> initialOptions = new BulkProcessingOptions<Object>();
        BulkProcessingThresholds<Object> thresholds = initialOptions.getThresholds();
        ConcurrentMap<String, PartitionScopeThresholds<Object>> partitionScopeThresholdsMap =
            bulkProcessingThresholdsAccessor.getPartitionScopeThresholds(thresholds);
        BulkProcessingOptions<Object> optionsWithThresholds =
            new BulkProcessingOptions<Object>(null, thresholds);

        Assert.assertSame(thresholds, optionsWithThresholds.getThresholds());
        Assert.assertSame(
            partitionScopeThresholdsMap,
            bulkProcessingThresholdsAccessor.getPartitionScopeThresholds(optionsWithThresholds.getThresholds()));
    }
}
