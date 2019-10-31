// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.test.utils;

import com.azure.core.test.TestMode;
import com.azure.core.test.models.RecordedData;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Objects;

/**
 * Provides random string names. If the test mode is {@link TestMode#PLAYBACK}, then names are fetched from
 * {@link RecordedData}. If the test mode is {@link TestMode#RECORD}, then the names are randomly generated and
 * persisted to {@link RecordedData}.
 */
public class TestResourceNamer extends ResourceNamer {
    private final TestMode testMode;
    private final RecordedData recordedData;

    /**
     * Constructor of TestResourceNamer
     *
     * @param name test name as prefix
     * @param testMode the test mode {@link TestMode#PLAYBACK} or {@link TestMode#RECORD}
     * @param recordedData the recorded data with list of network call
     */
    public TestResourceNamer(String name, TestMode testMode, RecordedData recordedData) {
        super(name);

        // Only need recordedData if the test is running in playback or record.
        if (testMode != TestMode.LIVE) {
            Objects.requireNonNull(recordedData, "'recordedData' cannot be null.");
        }

        this.recordedData = recordedData;
        this.testMode = testMode;
    }

    /**
     * Gets a random name.
     *
     * @param prefix the prefix to be used if possible
     * @param maxLen the max length for the random generated name
     * @return the random name
     */
    @Override
    public String randomName(String prefix, int maxLen) {
        if (testMode == TestMode.PLAYBACK) {
            return recordedData.removeVariable();
        } else {
            String name = super.randomName(prefix, maxLen);

            if (testMode == TestMode.RECORD) {
                recordedData.addVariable(name);
            }

            return name;
        }
    }

    /**
     * Gets a random UUID.
     *
     * @return A random UUID.
     */
    @Override
    public String randomUuid() {
        if (testMode == TestMode.PLAYBACK) {
            return recordedData.removeVariable();
        } else {
            String uuid = super.randomUuid();

            if (testMode == TestMode.RECORD) {
                recordedData.addVariable(uuid);
            }

            return uuid;
        }
    }

    /**
     * Gets an OffsetDateTime of UTC now.
     *
     * @return OffsetDateTime of UTC now.
     */
    public OffsetDateTime now() {
        if (testMode == TestMode.PLAYBACK) {
            return OffsetDateTime.parse(recordedData.removeVariable());
        } else {
            OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);

            if (testMode == TestMode.RECORD) {
                recordedData.addVariable(now.toString());
            }

            return now;
        }
    }

    /**
     * Record the value into recordedData, and pop it up when playback.
     *
     * @param value the value needs to record.
     * @return the recorded value.
     */
    public String recordValueFromConfig(String value) {
        if (testMode == TestMode.PLAYBACK) {
            return recordedData.removeVariable();
        } else {
            if (testMode == TestMode.RECORD) {
                recordedData.addVariable(value);
            }

            return value;
        }
    }
}
