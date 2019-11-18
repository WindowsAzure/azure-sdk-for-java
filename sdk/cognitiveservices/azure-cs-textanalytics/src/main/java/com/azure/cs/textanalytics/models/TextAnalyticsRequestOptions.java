// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cs.textanalytics.models;

public final class TextAnalyticsRequestOptions {
    private String modelVersion;
    private boolean showStats;

    public String getModelVersion() {
        return modelVersion;
    }

    public TextAnalyticsRequestOptions setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public boolean isShowStats() {
        return showStats;
    }

    public TextAnalyticsRequestOptions setShowStats(boolean showStats) {
        this.showStats = showStats;
        return this;
    }
}
