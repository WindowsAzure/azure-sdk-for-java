/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters to list backup copies.
 */
public class BMSRPQueryObject {
    /**
     * Backup copies created after this time.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * Backup copies created before this time.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * RestorePoint type. Possible values include: 'Invalid', 'Full', 'Log',
     * 'Differential', 'FullAndDifferential', 'All'.
     */
    @JsonProperty(value = "restorePointQueryType")
    private RestorePointQueryType restorePointQueryType;

    /**
     * In Get Recovery Point, it tells whether extended information about
     * recovery point is asked.
     */
    @JsonProperty(value = "extendedInfo")
    private Boolean extendedInfo;

    /**
     * Get backup copies created after this time.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set backup copies created after this time.
     *
     * @param startDate the startDate value to set
     * @return the BMSRPQueryObject object itself.
     */
    public BMSRPQueryObject withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get backup copies created before this time.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set backup copies created before this time.
     *
     * @param endDate the endDate value to set
     * @return the BMSRPQueryObject object itself.
     */
    public BMSRPQueryObject withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get restorePoint type. Possible values include: 'Invalid', 'Full', 'Log', 'Differential', 'FullAndDifferential', 'All'.
     *
     * @return the restorePointQueryType value
     */
    public RestorePointQueryType restorePointQueryType() {
        return this.restorePointQueryType;
    }

    /**
     * Set restorePoint type. Possible values include: 'Invalid', 'Full', 'Log', 'Differential', 'FullAndDifferential', 'All'.
     *
     * @param restorePointQueryType the restorePointQueryType value to set
     * @return the BMSRPQueryObject object itself.
     */
    public BMSRPQueryObject withRestorePointQueryType(RestorePointQueryType restorePointQueryType) {
        this.restorePointQueryType = restorePointQueryType;
        return this;
    }

    /**
     * Get in Get Recovery Point, it tells whether extended information about recovery point is asked.
     *
     * @return the extendedInfo value
     */
    public Boolean extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set in Get Recovery Point, it tells whether extended information about recovery point is asked.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the BMSRPQueryObject object itself.
     */
    public BMSRPQueryObject withExtendedInfo(Boolean extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
