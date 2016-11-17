/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.UpgradeHint;

import java.util.UUID;

/**
 * Implementation for Upgrade hint interface.
 */
@LangDefinition
class UpgradeHintImpl
        extends WrapperImpl<UpgradeHintInner>
        implements UpgradeHint {

    protected UpgradeHintImpl(UpgradeHintInner innerObject) {
        super(innerObject);
    }

    @Override
    public String targetServiceLevelObjective() {
        return this.inner().targetServiceLevelObjective();
    }

    @Override
    public UUID targetServiceLevelObjectiveId() {
        return this.inner().targetServiceLevelObjectiveId();
    }

}
