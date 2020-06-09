/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BalancePropertiesNewPurchasesDetailsItem model.
 */
public class BalancePropertiesNewPurchasesDetailsItem {
    /**
     * the name of new purchase.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * the value of new purchase.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal value;

    /**
     * Get the name of new purchase.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value of new purchase.
     *
     * @return the value value
     */
    public BigDecimal value() {
        return this.value;
    }

}
