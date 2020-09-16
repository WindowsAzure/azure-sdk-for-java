// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualMachineSizeTypes. */
public final class VirtualMachineSizeTypes extends ExpandableStringEnum<VirtualMachineSizeTypes> {
    /** Static value Basic_A0 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes BASIC_A0 = fromString("Basic_A0");

    /** Static value Basic_A1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes BASIC_A1 = fromString("Basic_A1");

    /** Static value Basic_A2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes BASIC_A2 = fromString("Basic_A2");

    /** Static value Basic_A3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes BASIC_A3 = fromString("Basic_A3");

    /** Static value Basic_A4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes BASIC_A4 = fromString("Basic_A4");

    /** Static value Standard_A0 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A0 = fromString("Standard_A0");

    /** Static value Standard_A1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A1 = fromString("Standard_A1");

    /** Static value Standard_A2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A2 = fromString("Standard_A2");

    /** Static value Standard_A3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A3 = fromString("Standard_A3");

    /** Static value Standard_A4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A4 = fromString("Standard_A4");

    /** Static value Standard_A5 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A5 = fromString("Standard_A5");

    /** Static value Standard_A6 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A6 = fromString("Standard_A6");

    /** Static value Standard_A7 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A7 = fromString("Standard_A7");

    /** Static value Standard_A8 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A8 = fromString("Standard_A8");

    /** Static value Standard_A9 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A9 = fromString("Standard_A9");

    /** Static value Standard_A10 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A10 = fromString("Standard_A10");

    /** Static value Standard_A11 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A11 = fromString("Standard_A11");

    /** Static value Standard_A1_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A1V2 = fromString("Standard_A1_v2");

    /** Static value Standard_A2_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A2V2 = fromString("Standard_A2_v2");

    /** Static value Standard_A4_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A4V2 = fromString("Standard_A4_v2");

    /** Static value Standard_A8_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A8V2 = fromString("Standard_A8_v2");

    /** Static value Standard_A2m_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A2MV2 = fromString("Standard_A2m_v2");

    /** Static value Standard_A4m_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A4MV2 = fromString("Standard_A4m_v2");

    /** Static value Standard_A8m_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_A8MV2 = fromString("Standard_A8m_v2");

    /** Static value Standard_B1s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_B1S = fromString("Standard_B1s");

    /** Static value Standard_B1ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_B1MS = fromString("Standard_B1ms");

    /** Static value Standard_B2s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_B2S = fromString("Standard_B2s");

    /** Static value Standard_B2ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_B2MS = fromString("Standard_B2ms");

    /** Static value Standard_B4ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_B4MS = fromString("Standard_B4ms");

    /** Static value Standard_B8ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_B8MS = fromString("Standard_B8ms");

    /** Static value Standard_D1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D1 = fromString("Standard_D1");

    /** Static value Standard_D2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D2 = fromString("Standard_D2");

    /** Static value Standard_D3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D3 = fromString("Standard_D3");

    /** Static value Standard_D4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D4 = fromString("Standard_D4");

    /** Static value Standard_D11 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D11 = fromString("Standard_D11");

    /** Static value Standard_D12 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D12 = fromString("Standard_D12");

    /** Static value Standard_D13 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D13 = fromString("Standard_D13");

    /** Static value Standard_D14 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D14 = fromString("Standard_D14");

    /** Static value Standard_D1_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D1V2 = fromString("Standard_D1_v2");

    /** Static value Standard_D2_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D2V2 = fromString("Standard_D2_v2");

    /** Static value Standard_D3_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D3V2 = fromString("Standard_D3_v2");

    /** Static value Standard_D4_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D4V2 = fromString("Standard_D4_v2");

    /** Static value Standard_D5_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D5V2 = fromString("Standard_D5_v2");

    /** Static value Standard_D2_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D2V3 = fromString("Standard_D2_v3");

    /** Static value Standard_D4_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D4V3 = fromString("Standard_D4_v3");

    /** Static value Standard_D8_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D8V3 = fromString("Standard_D8_v3");

    /** Static value Standard_D16_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D16V3 = fromString("Standard_D16_v3");

    /** Static value Standard_D32_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D32V3 = fromString("Standard_D32_v3");

    /** Static value Standard_D64_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D64V3 = fromString("Standard_D64_v3");

    /** Static value Standard_D2s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D2SV3 = fromString("Standard_D2s_v3");

    /** Static value Standard_D4s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D4SV3 = fromString("Standard_D4s_v3");

    /** Static value Standard_D8s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D8SV3 = fromString("Standard_D8s_v3");

    /** Static value Standard_D16s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D16SV3 = fromString("Standard_D16s_v3");

    /** Static value Standard_D32s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D32SV3 = fromString("Standard_D32s_v3");

    /** Static value Standard_D64s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D64SV3 = fromString("Standard_D64s_v3");

    /** Static value Standard_D11_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D11V2 = fromString("Standard_D11_v2");

    /** Static value Standard_D12_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D12V2 = fromString("Standard_D12_v2");

    /** Static value Standard_D13_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D13V2 = fromString("Standard_D13_v2");

    /** Static value Standard_D14_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D14V2 = fromString("Standard_D14_v2");

    /** Static value Standard_D15_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_D15V2 = fromString("Standard_D15_v2");

    /** Static value Standard_DS1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS1 = fromString("Standard_DS1");

    /** Static value Standard_DS2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS2 = fromString("Standard_DS2");

    /** Static value Standard_DS3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS3 = fromString("Standard_DS3");

    /** Static value Standard_DS4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS4 = fromString("Standard_DS4");

    /** Static value Standard_DS11 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS11 = fromString("Standard_DS11");

    /** Static value Standard_DS12 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS12 = fromString("Standard_DS12");

    /** Static value Standard_DS13 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS13 = fromString("Standard_DS13");

    /** Static value Standard_DS14 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS14 = fromString("Standard_DS14");

    /** Static value Standard_DS1_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS1V2 = fromString("Standard_DS1_v2");

    /** Static value Standard_DS2_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS2V2 = fromString("Standard_DS2_v2");

    /** Static value Standard_DS3_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS3V2 = fromString("Standard_DS3_v2");

    /** Static value Standard_DS4_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS4V2 = fromString("Standard_DS4_v2");

    /** Static value Standard_DS5_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS5V2 = fromString("Standard_DS5_v2");

    /** Static value Standard_DS11_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS11V2 = fromString("Standard_DS11_v2");

    /** Static value Standard_DS12_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS12V2 = fromString("Standard_DS12_v2");

    /** Static value Standard_DS13_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS13V2 = fromString("Standard_DS13_v2");

    /** Static value Standard_DS14_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS14V2 = fromString("Standard_DS14_v2");

    /** Static value Standard_DS15_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS15V2 = fromString("Standard_DS15_v2");

    /** Static value Standard_DS13-4_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS134V2 = fromString("Standard_DS13-4_v2");

    /** Static value Standard_DS13-2_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS132V2 = fromString("Standard_DS13-2_v2");

    /** Static value Standard_DS14-8_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS148V2 = fromString("Standard_DS14-8_v2");

    /** Static value Standard_DS14-4_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_DS144V2 = fromString("Standard_DS14-4_v2");

    /** Static value Standard_E2_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E2V3 = fromString("Standard_E2_v3");

    /** Static value Standard_E4_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E4V3 = fromString("Standard_E4_v3");

    /** Static value Standard_E8_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E8V3 = fromString("Standard_E8_v3");

    /** Static value Standard_E16_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E16V3 = fromString("Standard_E16_v3");

    /** Static value Standard_E32_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E32V3 = fromString("Standard_E32_v3");

    /** Static value Standard_E64_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E64V3 = fromString("Standard_E64_v3");

    /** Static value Standard_E2s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E2SV3 = fromString("Standard_E2s_v3");

    /** Static value Standard_E4s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E4SV3 = fromString("Standard_E4s_v3");

    /** Static value Standard_E8s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E8SV3 = fromString("Standard_E8s_v3");

    /** Static value Standard_E16s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E16SV3 = fromString("Standard_E16s_v3");

    /** Static value Standard_E32s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E32SV3 = fromString("Standard_E32s_v3");

    /** Static value Standard_E64s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E64SV3 = fromString("Standard_E64s_v3");

    /** Static value Standard_E32-16_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E3216V3 = fromString("Standard_E32-16_v3");

    /** Static value Standard_E32-8s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E328SV3 = fromString("Standard_E32-8s_v3");

    /** Static value Standard_E64-32s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E6432SV3 = fromString("Standard_E64-32s_v3");

    /** Static value Standard_E64-16s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_E6416SV3 = fromString("Standard_E64-16s_v3");

    /** Static value Standard_F1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F1 = fromString("Standard_F1");

    /** Static value Standard_F2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F2 = fromString("Standard_F2");

    /** Static value Standard_F4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F4 = fromString("Standard_F4");

    /** Static value Standard_F8 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F8 = fromString("Standard_F8");

    /** Static value Standard_F16 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F16 = fromString("Standard_F16");

    /** Static value Standard_F1s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F1S = fromString("Standard_F1s");

    /** Static value Standard_F2s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F2S = fromString("Standard_F2s");

    /** Static value Standard_F4s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F4S = fromString("Standard_F4s");

    /** Static value Standard_F8s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F8S = fromString("Standard_F8s");

    /** Static value Standard_F16s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F16S = fromString("Standard_F16s");

    /** Static value Standard_F2s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F2SV2 = fromString("Standard_F2s_v2");

    /** Static value Standard_F4s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F4SV2 = fromString("Standard_F4s_v2");

    /** Static value Standard_F8s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F8SV2 = fromString("Standard_F8s_v2");

    /** Static value Standard_F16s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F16SV2 = fromString("Standard_F16s_v2");

    /** Static value Standard_F32s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F32SV2 = fromString("Standard_F32s_v2");

    /** Static value Standard_F64s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F64SV2 = fromString("Standard_F64s_v2");

    /** Static value Standard_F72s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_F72SV2 = fromString("Standard_F72s_v2");

    /** Static value Standard_G1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_G1 = fromString("Standard_G1");

    /** Static value Standard_G2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_G2 = fromString("Standard_G2");

    /** Static value Standard_G3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_G3 = fromString("Standard_G3");

    /** Static value Standard_G4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_G4 = fromString("Standard_G4");

    /** Static value Standard_G5 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_G5 = fromString("Standard_G5");

    /** Static value Standard_GS1 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS1 = fromString("Standard_GS1");

    /** Static value Standard_GS2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS2 = fromString("Standard_GS2");

    /** Static value Standard_GS3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS3 = fromString("Standard_GS3");

    /** Static value Standard_GS4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS4 = fromString("Standard_GS4");

    /** Static value Standard_GS5 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS5 = fromString("Standard_GS5");

    /** Static value Standard_GS4-8 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS48 = fromString("Standard_GS4-8");

    /** Static value Standard_GS4-4 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS44 = fromString("Standard_GS4-4");

    /** Static value Standard_GS5-16 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS516 = fromString("Standard_GS5-16");

    /** Static value Standard_GS5-8 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_GS58 = fromString("Standard_GS5-8");

    /** Static value Standard_H8 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_H8 = fromString("Standard_H8");

    /** Static value Standard_H16 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_H16 = fromString("Standard_H16");

    /** Static value Standard_H8m for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_H8M = fromString("Standard_H8m");

    /** Static value Standard_H16m for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_H16M = fromString("Standard_H16m");

    /** Static value Standard_H16r for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_H16R = fromString("Standard_H16r");

    /** Static value Standard_H16mr for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_H16MR = fromString("Standard_H16mr");

    /** Static value Standard_L4s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_L4S = fromString("Standard_L4s");

    /** Static value Standard_L8s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_L8S = fromString("Standard_L8s");

    /** Static value Standard_L16s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_L16S = fromString("Standard_L16s");

    /** Static value Standard_L32s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_L32S = fromString("Standard_L32s");

    /** Static value Standard_M64s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M64S = fromString("Standard_M64s");

    /** Static value Standard_M64ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M64MS = fromString("Standard_M64ms");

    /** Static value Standard_M128s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M128S = fromString("Standard_M128s");

    /** Static value Standard_M128ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M128MS = fromString("Standard_M128ms");

    /** Static value Standard_M64-32ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M6432MS = fromString("Standard_M64-32ms");

    /** Static value Standard_M64-16ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M6416MS = fromString("Standard_M64-16ms");

    /** Static value Standard_M128-64ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M12864MS = fromString("Standard_M128-64ms");

    /** Static value Standard_M128-32ms for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_M12832MS = fromString("Standard_M128-32ms");

    /** Static value Standard_NC6 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC6 = fromString("Standard_NC6");

    /** Static value Standard_NC12 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC12 = fromString("Standard_NC12");

    /** Static value Standard_NC24 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC24 = fromString("Standard_NC24");

    /** Static value Standard_NC24r for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC24R = fromString("Standard_NC24r");

    /** Static value Standard_NC6s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC6SV2 = fromString("Standard_NC6s_v2");

    /** Static value Standard_NC12s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC12SV2 = fromString("Standard_NC12s_v2");

    /** Static value Standard_NC24s_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC24SV2 = fromString("Standard_NC24s_v2");

    /** Static value Standard_NC24rs_v2 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC24RS_V2 = fromString("Standard_NC24rs_v2");

    /** Static value Standard_NC6s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC6SV3 = fromString("Standard_NC6s_v3");

    /** Static value Standard_NC12s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC12SV3 = fromString("Standard_NC12s_v3");

    /** Static value Standard_NC24s_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC24SV3 = fromString("Standard_NC24s_v3");

    /** Static value Standard_NC24rs_v3 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NC24RS_V3 = fromString("Standard_NC24rs_v3");

    /** Static value Standard_ND6s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_ND6S = fromString("Standard_ND6s");

    /** Static value Standard_ND12s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_ND12S = fromString("Standard_ND12s");

    /** Static value Standard_ND24s for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_ND24S = fromString("Standard_ND24s");

    /** Static value Standard_ND24rs for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_ND24RS = fromString("Standard_ND24rs");

    /** Static value Standard_NV6 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NV6 = fromString("Standard_NV6");

    /** Static value Standard_NV12 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NV12 = fromString("Standard_NV12");

    /** Static value Standard_NV24 for VirtualMachineSizeTypes. */
    public static final VirtualMachineSizeTypes STANDARD_NV24 = fromString("Standard_NV24");

    /**
     * Creates or finds a VirtualMachineSizeTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualMachineSizeTypes.
     */
    @JsonCreator
    public static VirtualMachineSizeTypes fromString(String name) {
        return fromString(name, VirtualMachineSizeTypes.class);
    }

    /** @return known VirtualMachineSizeTypes values. */
    public static Collection<VirtualMachineSizeTypes> values() {
        return values(VirtualMachineSizeTypes.class);
    }
}
