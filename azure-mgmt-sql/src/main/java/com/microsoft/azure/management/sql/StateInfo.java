/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import org.joda.time.DateTime;

/**
 * The state information for a recommended action.
 */
public class StateInfo {
    /**
     * The currentValue property.
     */
    private String currentValue;

    /**
     * The actionInitiatedBy property.
     */
    private String actionInitiatedBy;

    /**
     * The lastModified property.
     */
    private DateTime lastModified;

    /**
     * Get the currentValue value.
     *
     * @return the currentValue value
     */
    public String currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue value.
     *
     * @param currentValue the currentValue value to set
     * @return the StateInfo object itself.
     */
    public StateInfo withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the actionInitiatedBy value.
     *
     * @return the actionInitiatedBy value
     */
    public String actionInitiatedBy() {
        return this.actionInitiatedBy;
    }

    /**
     * Set the actionInitiatedBy value.
     *
     * @param actionInitiatedBy the actionInitiatedBy value to set
     * @return the StateInfo object itself.
     */
    public StateInfo withActionInitiatedBy(String actionInitiatedBy) {
        this.actionInitiatedBy = actionInitiatedBy;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the StateInfo object itself.
     */
    public StateInfo withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

}
