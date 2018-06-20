/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmos-db.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.implementation.DocumentDBManager;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.implementation.DatabaseAccountListKeysResultInner;

/**
 * Type representing DatabaseAccountListKeysResult.
 */
public interface DatabaseAccountListKeysResult extends HasInner<DatabaseAccountListKeysResultInner>, HasManager<DocumentDBManager> {
    /**
     * @return the primaryMasterKey value.
     */
    String primaryMasterKey();

    /**
     * @return the primaryReadonlyMasterKey value.
     */
    String primaryReadonlyMasterKey();

    /**
     * @return the secondaryMasterKey value.
     */
    String secondaryMasterKey();

    /**
     * @return the secondaryReadonlyMasterKey value.
     */
    String secondaryReadonlyMasterKey();

}
