/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.TroubleshootingResultInner;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing TroubleshootingResult.
 */
public interface TroubleshootingResult extends HasInner<TroubleshootingResultInner>, HasManager<NetworkManager> {
    /**
     * @return the code value.
     */
    String code();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the results value.
     */
    List<TroubleshootingDetails> results();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

}
