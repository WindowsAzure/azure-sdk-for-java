/*
 * The MIT License (MIT)
 * Copyright (c) 2018 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.azure.data.cosmos.internal.changefeed.implementation;

import com.azure.data.cosmos.CosmosItemProperties;
import com.azure.data.cosmos.internal.changefeed.ChangeFeedObserver;
import com.azure.data.cosmos.internal.changefeed.ChangeFeedObserverCloseReason;
import com.azure.data.cosmos.internal.changefeed.ChangeFeedObserverContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;

class DefaultObserver implements ChangeFeedObserver {
    private final  Logger log = LoggerFactory.getLogger(DefaultObserver.class);
    private Consumer<List<CosmosItemProperties>> consumer;

    public DefaultObserver(Consumer<List<CosmosItemProperties>> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void open(ChangeFeedObserverContext context) {
        log.info("Open processing from thread {}", Thread.currentThread().getId());
    }

    @Override
    public void close(ChangeFeedObserverContext context, ChangeFeedObserverCloseReason reason) {
        log.info("Close processing from thread {}", Thread.currentThread().getId());
    }

    @Override
    public void processChanges(ChangeFeedObserverContext context, List<CosmosItemProperties> docs) {
        log.info("Start processing from thread {}", Thread.currentThread().getId());
        consumer.accept(docs);
        log.info("Done processing from thread {}", Thread.currentThread().getId());
    }
}
