// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.storage.interceptor;
import java.util.Map;

public class NetworkCallRecord {
    public String Method;
    public String Uri;
    public Map<String, String> Headers;
    public Map<String, String> Response;
    public Errors Errors;
}
