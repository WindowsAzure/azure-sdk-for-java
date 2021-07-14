// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScanningFunctionality. */
public final class ScanningFunctionality extends ExpandableStringEnum<ScanningFunctionality> {
    /** Static value ScannerDevice for ScanningFunctionality. */
    public static final ScanningFunctionality SCANNER_DEVICE = fromString("ScannerDevice");

    /** Static value NotScannerDevice for ScanningFunctionality. */
    public static final ScanningFunctionality NOT_SCANNER_DEVICE = fromString("NotScannerDevice");

    /**
     * Creates or finds a ScanningFunctionality from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScanningFunctionality.
     */
    @JsonCreator
    public static ScanningFunctionality fromString(String name) {
        return fromString(name, ScanningFunctionality.class);
    }

    /** @return known ScanningFunctionality values. */
    public static Collection<ScanningFunctionality> values() {
        return values(ScanningFunctionality.class);
    }
}
