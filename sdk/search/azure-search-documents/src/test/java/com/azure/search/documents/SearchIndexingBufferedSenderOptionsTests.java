// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests {@link SearchIndexingBufferedSenderOptions}.
 */
public class SearchIndexingBufferedSenderOptionsTests {
    private Boolean autoFlush;
    private Duration flushWindow;
    private Integer batchSize;
    private Integer documentTryLimit;
    @Test
    public void autoFlushDefaultsTrue() {
        SearchIndexingBufferedSenderOptions<Integer> options = new SearchIndexingBufferedSenderOptions<>();
        assertTrue(options.getAutoFlush());

        options.setAutoFlush(null);
        assertTrue(options.getAutoFlush());
    }

    @Test
    public void flushWindowDefaults60Seconds() {
        SearchIndexingBufferedSenderOptions<Integer> options = new SearchIndexingBufferedSenderOptions<>();
        assertEquals(Duration.ofSeconds(60), options.getFlushWindow());

        options.setFlushWindow(null);
        assertEquals(Duration.ofSeconds(60), options.getFlushWindow());
    }

    @Test
    public void batchSizeDefaults1000() {
        SearchIndexingBufferedSenderOptions<Integer> options = new SearchIndexingBufferedSenderOptions<>();
        assertEquals(1000, options.getBatchSize());

        options.setBatchSize(null);
        assertEquals(1000, options.getBatchSize());
    }

    @Test
    public void invalidBatchSizeThrows() {
        SearchIndexingBufferedSenderOptions<Integer> options = new SearchIndexingBufferedSenderOptions<>();
        assertThrows(IllegalArgumentException.class, () -> options.setBatchSize(0));
        assertThrows(IllegalArgumentException.class, () -> options.setBatchSize(-1));
    }

    @Test
    public void documentTryLimitDefaults10() {
        SearchIndexingBufferedSenderOptions<Integer> options = new SearchIndexingBufferedSenderOptions<>();
        assertEquals(10, options.getDocumentTryLimit());

        options.setDocumentTryLimit(null);
        assertEquals(10, options.getDocumentTryLimit());
    }

    @Test
    public void invalidDocumentTryLimitThrows() {
        SearchIndexingBufferedSenderOptions<Integer> options = new SearchIndexingBufferedSenderOptions<>();
        assertThrows(IllegalArgumentException.class, () -> options.setDocumentTryLimit(0));
        assertThrows(IllegalArgumentException.class, () -> options.setDocumentTryLimit(-1));
    }
}
