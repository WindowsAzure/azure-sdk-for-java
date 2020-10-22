/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OpenShiftContainerServiceVMSize.
 */
public final class OpenShiftContainerServiceVMSize extends ExpandableStringEnum<OpenShiftContainerServiceVMSize> {
    /** Static value Standard_D2s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_D2S_V3 = fromString("Standard_D2s_v3");

    /** Static value Standard_D4s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_D4S_V3 = fromString("Standard_D4s_v3");

    /** Static value Standard_D8s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_D8S_V3 = fromString("Standard_D8s_v3");

    /** Static value Standard_D16s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_D16S_V3 = fromString("Standard_D16s_v3");

    /** Static value Standard_D32s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_D32S_V3 = fromString("Standard_D32s_v3");

    /** Static value Standard_D64s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_D64S_V3 = fromString("Standard_D64s_v3");

    /** Static value Standard_DS4_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_DS4_V2 = fromString("Standard_DS4_v2");

    /** Static value Standard_DS5_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_DS5_V2 = fromString("Standard_DS5_v2");

    /** Static value Standard_F8s_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F8S_V2 = fromString("Standard_F8s_v2");

    /** Static value Standard_F16s_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F16S_V2 = fromString("Standard_F16s_v2");

    /** Static value Standard_F32s_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F32S_V2 = fromString("Standard_F32s_v2");

    /** Static value Standard_F64s_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F64S_V2 = fromString("Standard_F64s_v2");

    /** Static value Standard_F72s_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F72S_V2 = fromString("Standard_F72s_v2");

    /** Static value Standard_F8s for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F8S = fromString("Standard_F8s");

    /** Static value Standard_F16s for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_F16S = fromString("Standard_F16s");

    /** Static value Standard_E4s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_E4S_V3 = fromString("Standard_E4s_v3");

    /** Static value Standard_E8s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_E8S_V3 = fromString("Standard_E8s_v3");

    /** Static value Standard_E16s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_E16S_V3 = fromString("Standard_E16s_v3");

    /** Static value Standard_E20s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_E20S_V3 = fromString("Standard_E20s_v3");

    /** Static value Standard_E32s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_E32S_V3 = fromString("Standard_E32s_v3");

    /** Static value Standard_E64s_v3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_E64S_V3 = fromString("Standard_E64s_v3");

    /** Static value Standard_GS2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_GS2 = fromString("Standard_GS2");

    /** Static value Standard_GS3 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_GS3 = fromString("Standard_GS3");

    /** Static value Standard_GS4 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_GS4 = fromString("Standard_GS4");

    /** Static value Standard_GS5 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_GS5 = fromString("Standard_GS5");

    /** Static value Standard_DS12_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_DS12_V2 = fromString("Standard_DS12_v2");

    /** Static value Standard_DS13_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_DS13_V2 = fromString("Standard_DS13_v2");

    /** Static value Standard_DS14_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_DS14_V2 = fromString("Standard_DS14_v2");

    /** Static value Standard_DS15_v2 for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_DS15_V2 = fromString("Standard_DS15_v2");

    /** Static value Standard_L4s for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_L4S = fromString("Standard_L4s");

    /** Static value Standard_L8s for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_L8S = fromString("Standard_L8s");

    /** Static value Standard_L16s for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_L16S = fromString("Standard_L16s");

    /** Static value Standard_L32s for OpenShiftContainerServiceVMSize. */
    public static final OpenShiftContainerServiceVMSize STANDARD_L32S = fromString("Standard_L32s");

    /**
     * Creates or finds a OpenShiftContainerServiceVMSize from its string representation.
     * @param name a name to look for
     * @return the corresponding OpenShiftContainerServiceVMSize
     */
    @JsonCreator
    public static OpenShiftContainerServiceVMSize fromString(String name) {
        return fromString(name, OpenShiftContainerServiceVMSize.class);
    }

    /**
     * @return known OpenShiftContainerServiceVMSize values
     */
    public static Collection<OpenShiftContainerServiceVMSize> values() {
        return values(OpenShiftContainerServiceVMSize.class);
    }
}
