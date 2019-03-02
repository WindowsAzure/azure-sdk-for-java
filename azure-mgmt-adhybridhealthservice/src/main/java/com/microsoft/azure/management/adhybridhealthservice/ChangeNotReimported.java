/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The changes which are not re-imported.
 */
public class ChangeNotReimported {
    /**
     * The delta changes that is not re-imported.
     */
    @JsonProperty(value = "delta")
    private ChangeNotReimportedDelta delta;

    /**
     * The object entry in a change that is not re-imported.
     */
    @JsonProperty(value = "entry")
    private ChangeNotReimportedEntry entry;

    /**
     * Get the delta changes that is not re-imported.
     *
     * @return the delta value
     */
    public ChangeNotReimportedDelta delta() {
        return this.delta;
    }

    /**
     * Set the delta changes that is not re-imported.
     *
     * @param delta the delta value to set
     * @return the ChangeNotReimported object itself.
     */
    public ChangeNotReimported withDelta(ChangeNotReimportedDelta delta) {
        this.delta = delta;
        return this;
    }

    /**
     * Get the object entry in a change that is not re-imported.
     *
     * @return the entry value
     */
    public ChangeNotReimportedEntry entry() {
        return this.entry;
    }

    /**
     * Set the object entry in a change that is not re-imported.
     *
     * @param entry the entry value to set
     * @return the ChangeNotReimported object itself.
     */
    public ChangeNotReimported withEntry(ChangeNotReimportedEntry entry) {
        this.entry = entry;
        return this;
    }

}
