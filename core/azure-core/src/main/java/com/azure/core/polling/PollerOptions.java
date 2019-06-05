// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.polling;

/** Place to provide configuration options for Poller **/
public class PollerOptions {

    private int timeoutInMilliSeconds;
    private int pollIntervalInMillis;

    /*This will ensure that poll interval grow exponentially by factor specified here.
     * This should always be more than 1.*/
    private float pollIntervalGrowthFactor = 1.0f;


    /** Constructor
     * @param timeoutInMilliSeconds    This is the max time after that poller will giveup and not poll anymore.
     * @param pollIntervalInMillis     This will ensure that poll happens only once in pollIntervalInMillis
     * @param pollIntervalGrowthFactor This will ensure that poll interval grow exponentially by factor specified here.
     *                                 This should always be more than 1.
     **/
    public PollerOptions(int timeoutInMilliSeconds,
                         int pollIntervalInMillis,
                         float pollIntervalGrowthFactor) {
        this.timeoutInMilliSeconds = timeoutInMilliSeconds;
        this.pollIntervalInMillis = pollIntervalInMillis;
        this.pollIntervalGrowthFactor = pollIntervalGrowthFactor;
    }

    /** Get timeout
     * @return int timeout in milliseconds **/
    public int getTimeoutInMilliSeconds() {
        return timeoutInMilliSeconds;
    }
    /**get poll interval
     * @return int poll interval in milliseconds **/
    public int getPollIntervalInMillis() {
        return pollIntervalInMillis;
    }

    /**get poll interval growth factor
     * @return int poll interval  growth factor. **/

    public float getPollIntervalGrowthFactor() {
        return pollIntervalGrowthFactor;
    }
}
