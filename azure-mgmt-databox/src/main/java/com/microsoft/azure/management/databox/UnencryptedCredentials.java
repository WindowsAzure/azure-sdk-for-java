/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databox.implementation.DataBoxManager;
import com.microsoft.azure.management.databox.implementation.UnencryptedCredentialsInner;

/**
 * Type representing UnencryptedCredentials.
 */
public interface UnencryptedCredentials extends HasInner<UnencryptedCredentialsInner>, HasManager<DataBoxManager> {
    /**
     * @return the jobName value.
     */
    String jobName();

    /**
     * @return the jobSecrets value.
     */
    JobSecrets jobSecrets();

}
