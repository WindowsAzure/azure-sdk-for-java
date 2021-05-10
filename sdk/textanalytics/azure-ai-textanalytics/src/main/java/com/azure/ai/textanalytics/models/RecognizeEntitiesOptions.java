// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;

/**
 * The {@link RecognizeEntitiesOptions} model.
 */
@Fluent
public final class RecognizeEntitiesOptions extends TextAnalyticsRequestOptions {
    private StringIndexType stringIndexType;

    /**
     * Set the model version. This value indicates which model will be used for scoring, e.g. "latest", "2019-10-01".
     * If a model-version is not specified, the API will default to the latest, non-preview version.
     *
     * @param modelVersion The model version.
     *
     * @return The {@link RecognizeEntitiesOptions} object itself.
     */
    @Override
    public RecognizeEntitiesOptions setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    /**
     * Set the value of {@code includeStatistics}. The default value is false by default.
     * If set to true, indicates that the service should return document and document batch statistics
     * with the results of the operation.
     *
     * @param includeStatistics If a boolean value was specified in the request this field will contain
     * information about the document payload.
     *
     * @return the {@link RecognizeEntitiesOptions} object itself.
     */
    @Override
    public RecognizeEntitiesOptions setIncludeStatistics(boolean includeStatistics) {
        super.setIncludeStatistics(includeStatistics);
        return this;
    }

    /**
     * Set the value of {@code disableServiceLogs}.
     *
     * @param disableServiceLogs If a boolean value was specified in the request this field will contain
     * logging information about the document payload.
     *
     * @return the {@link RecognizeEntitiesOptions} object itself.
     */
    @Override
    public RecognizeEntitiesOptions setServiceLogsDisabled(boolean disableServiceLogs) {
        super.setServiceLogsDisabled(disableServiceLogs);
        return this;
    }

    /**
     * Get the value of {@code stringIndexType}.
     *
     * @return The value of {@code stringIndexType}.
     */
    public StringIndexType getStringIndexType() {
        return stringIndexType;
    }

    /**
     * Set the value of {@code stringIndexType}.
     * The {@link StringIndexType#UTF16CODE_UNIT} will be used as default type if there is no value assign to it.
     *
     * @param stringIndexType It used to set the value of string indexing type.
     *
     * @return the {@link RecognizeEntitiesOptions} object itself.
     */
    public RecognizeEntitiesOptions setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }
}
