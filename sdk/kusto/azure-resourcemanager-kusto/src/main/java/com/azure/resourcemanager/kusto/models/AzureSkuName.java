// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureSkuName. */
public final class AzureSkuName extends ExpandableStringEnum<AzureSkuName> {
    /** Static value Standard_DS13_v2+1TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_DS13_V2_1TB_PS = fromString("Standard_DS13_v2+1TB_PS");

    /** Static value Standard_DS13_v2+2TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_DS13_V2_2TB_PS = fromString("Standard_DS13_v2+2TB_PS");

    /** Static value Standard_DS14_v2+3TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_DS14_V2_3TB_PS = fromString("Standard_DS14_v2+3TB_PS");

    /** Static value Standard_DS14_v2+4TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_DS14_V2_4TB_PS = fromString("Standard_DS14_v2+4TB_PS");

    /** Static value Standard_D13_v2 for AzureSkuName. */
    public static final AzureSkuName STANDARD_D13_V2 = fromString("Standard_D13_v2");

    /** Static value Standard_D14_v2 for AzureSkuName. */
    public static final AzureSkuName STANDARD_D14_V2 = fromString("Standard_D14_v2");

    /** Static value Standard_L8s for AzureSkuName. */
    public static final AzureSkuName STANDARD_L8S = fromString("Standard_L8s");

    /** Static value Standard_L16s for AzureSkuName. */
    public static final AzureSkuName STANDARD_L16S = fromString("Standard_L16s");

    /** Static value Standard_L8s_v2 for AzureSkuName. */
    public static final AzureSkuName STANDARD_L8S_V2 = fromString("Standard_L8s_v2");

    /** Static value Standard_L16s_v2 for AzureSkuName. */
    public static final AzureSkuName STANDARD_L16S_V2 = fromString("Standard_L16s_v2");

    /** Static value Standard_D11_v2 for AzureSkuName. */
    public static final AzureSkuName STANDARD_D11_V2 = fromString("Standard_D11_v2");

    /** Static value Standard_D12_v2 for AzureSkuName. */
    public static final AzureSkuName STANDARD_D12_V2 = fromString("Standard_D12_v2");

    /** Static value Standard_L4s for AzureSkuName. */
    public static final AzureSkuName STANDARD_L4S = fromString("Standard_L4s");

    /** Static value Dev(No SLA)_Standard_D11_v2 for AzureSkuName. */
    public static final AzureSkuName DEV_NO_SLA_STANDARD_D11_V2 = fromString("Dev(No SLA)_Standard_D11_v2");

    /** Static value Standard_E64i_v3 for AzureSkuName. */
    public static final AzureSkuName STANDARD_E64I_V3 = fromString("Standard_E64i_v3");

    /** Static value Standard_E80ids_v4 for AzureSkuName. */
    public static final AzureSkuName STANDARD_E80IDS_V4 = fromString("Standard_E80ids_v4");

    /** Static value Standard_E2a_v4 for AzureSkuName. */
    public static final AzureSkuName STANDARD_E2A_V4 = fromString("Standard_E2a_v4");

    /** Static value Standard_E4a_v4 for AzureSkuName. */
    public static final AzureSkuName STANDARD_E4A_V4 = fromString("Standard_E4a_v4");

    /** Static value Standard_E8a_v4 for AzureSkuName. */
    public static final AzureSkuName STANDARD_E8A_V4 = fromString("Standard_E8a_v4");

    /** Static value Standard_E16a_v4 for AzureSkuName. */
    public static final AzureSkuName STANDARD_E16A_V4 = fromString("Standard_E16a_v4");

    /** Static value Standard_E8as_v4+1TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_E8AS_V4_1TB_PS = fromString("Standard_E8as_v4+1TB_PS");

    /** Static value Standard_E8as_v4+2TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_E8AS_V4_2TB_PS = fromString("Standard_E8as_v4+2TB_PS");

    /** Static value Standard_E16as_v4+3TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_E16AS_V4_3TB_PS = fromString("Standard_E16as_v4+3TB_PS");

    /** Static value Standard_E16as_v4+4TB_PS for AzureSkuName. */
    public static final AzureSkuName STANDARD_E16AS_V4_4TB_PS = fromString("Standard_E16as_v4+4TB_PS");

    /** Static value Dev(No SLA)_Standard_E2a_v4 for AzureSkuName. */
    public static final AzureSkuName DEV_NO_SLA_STANDARD_E2A_V4 = fromString("Dev(No SLA)_Standard_E2a_v4");

    /**
     * Creates or finds a AzureSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureSkuName.
     */
    @JsonCreator
    public static AzureSkuName fromString(String name) {
        return fromString(name, AzureSkuName.class);
    }

    /** @return known AzureSkuName values. */
    public static Collection<AzureSkuName> values() {
        return values(AzureSkuName.class);
    }
}
