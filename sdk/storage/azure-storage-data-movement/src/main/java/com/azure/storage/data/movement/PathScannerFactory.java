// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.data.movement;

public final class PathScannerFactory {
    private final String path;

    public PathScannerFactory(String path) {
        this.path = path;
    }

    public PathScanner getPathScanner() { return new PathScanner(path); }
}
