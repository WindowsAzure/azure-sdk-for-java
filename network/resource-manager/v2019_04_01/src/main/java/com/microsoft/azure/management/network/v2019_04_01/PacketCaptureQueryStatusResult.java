/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.PacketCaptureQueryStatusResultInner;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing PacketCaptureQueryStatusResult.
 */
public interface PacketCaptureQueryStatusResult extends HasInner<PacketCaptureQueryStatusResultInner>, HasManager<NetworkManager> {
    /**
     * @return the captureStartTime value.
     */
    DateTime captureStartTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the packetCaptureError value.
     */
    List<PcError> packetCaptureError();

    /**
     * @return the packetCaptureStatus value.
     */
    PcStatus packetCaptureStatus();

    /**
     * @return the stopReason value.
     */
    String stopReason();

}
