/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.fluentcore.model.HasInner;
import com.azure.management.resources.fluentcore.model.Indexable;
import com.azure.management.resources.models.ProviderInner;

import java.util.List;

/**
 * An immutable client-side representation of an Azure resource provider.
 */
@Fluent
public interface Provider extends
        Indexable,
        HasInner<ProviderInner> {

    /**
     * @return the namespace of the provider
     */
    String namespace();

    /**
     * @return the registration state of the provider, indicating whether this
     * resource provider is registered in the current subscription
     */
    String registrationState();

    /**
     * @return the list of provider resource types
     */
    List<ProviderResourceType> resourceTypes();
}
