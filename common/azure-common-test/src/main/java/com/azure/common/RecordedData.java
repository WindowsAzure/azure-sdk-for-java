// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common;

import com.azure.common.models.NetworkCallRecord;

import java.util.LinkedList;

public class RecordedData {
    private final LinkedList<NetworkCallRecord> networkCallRecords;
    private final LinkedList<String> variables;

    public RecordedData() {
        networkCallRecords = new LinkedList<>();
        variables = new LinkedList<>();
    }

    public LinkedList<NetworkCallRecord> getNetworkCallRecords() {
        return networkCallRecords;
    }

    public LinkedList<String> getVariables() {
        return variables;
    }
}
