// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.fluentcore.arm.models.HasManager;
import com.azure.management.resources.fluentcore.model.HasInner;
import com.azure.management.storage.StorageManager;
import com.azure.management.storage.fluent.inner.LegalHoldInner;
import java.util.List;

/** Type representing LegalHold. */
@Fluent
public interface LegalHold extends HasInner<LegalHoldInner>, HasManager<StorageManager> {
    /** @return the hasLegalHold value. */
    Boolean hasLegalHold();

    /** @return the tags value. */
    List<String> tags();
}
