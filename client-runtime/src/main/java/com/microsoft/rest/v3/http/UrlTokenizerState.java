/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest.v3.http;

enum UrlTokenizerState {
    SCHEME,

    SCHEME_OR_HOST,

    HOST,

    PORT,

    PATH,

    QUERY,

    DONE
}