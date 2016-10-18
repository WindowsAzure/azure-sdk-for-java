/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;


/**
 * The observed impact information for a recommended action.
 */
public class ImpactRecord {
    /**
     * The dimensionName property.
     */
    private String dimensionName;

    /**
     * The unit property.
     */
    private String unit;

    /**
     * The absoluteValue property.
     */
    private Double absoluteValue;

    /**
     * The changeValueAbsolute property.
     */
    private Double changeValueAbsolute;

    /**
     * The changeValueRelative property.
     */
    private Double changeValueRelative;

    /**
     * Get the dimensionName value.
     *
     * @return the dimensionName value
     */
    public String dimensionName() {
        return this.dimensionName;
    }

    /**
     * Set the dimensionName value.
     *
     * @param dimensionName the dimensionName value to set
     * @return the ImpactRecord object itself.
     */
    public ImpactRecord withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the ImpactRecord object itself.
     */
    public ImpactRecord withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the absoluteValue value.
     *
     * @return the absoluteValue value
     */
    public Double absoluteValue() {
        return this.absoluteValue;
    }

    /**
     * Set the absoluteValue value.
     *
     * @param absoluteValue the absoluteValue value to set
     * @return the ImpactRecord object itself.
     */
    public ImpactRecord withAbsoluteValue(Double absoluteValue) {
        this.absoluteValue = absoluteValue;
        return this;
    }

    /**
     * Get the changeValueAbsolute value.
     *
     * @return the changeValueAbsolute value
     */
    public Double changeValueAbsolute() {
        return this.changeValueAbsolute;
    }

    /**
     * Set the changeValueAbsolute value.
     *
     * @param changeValueAbsolute the changeValueAbsolute value to set
     * @return the ImpactRecord object itself.
     */
    public ImpactRecord withChangeValueAbsolute(Double changeValueAbsolute) {
        this.changeValueAbsolute = changeValueAbsolute;
        return this;
    }

    /**
     * Get the changeValueRelative value.
     *
     * @return the changeValueRelative value
     */
    public Double changeValueRelative() {
        return this.changeValueRelative;
    }

    /**
     * Set the changeValueRelative value.
     *
     * @param changeValueRelative the changeValueRelative value to set
     * @return the ImpactRecord object itself.
     */
    public ImpactRecord withChangeValueRelative(Double changeValueRelative) {
        this.changeValueRelative = changeValueRelative;
        return this;
    }

}
