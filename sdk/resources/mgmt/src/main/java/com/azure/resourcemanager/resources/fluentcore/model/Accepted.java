// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.fluentcore.model;

import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.SyncPoller;

/**
 * The accepted LRO (long running operation).
 *
 * @param <T> the type of final result
 */
public interface Accepted<T> {

    /**
     * Gets the accepted result of LRO.
     *
     * @return the accepted result
     */
    PollResponse<T> getAcceptedResult();

    /**
     * Gets the {@link SyncPoller} of LRO.
     *
     * @return the sync poller.
     */
    SyncPoller<Void, T> getSyncPoller();

    /**
     * Gets the final result of LRO.
     *
     * @return the final result.
     */
    T getFinalResult();
}
