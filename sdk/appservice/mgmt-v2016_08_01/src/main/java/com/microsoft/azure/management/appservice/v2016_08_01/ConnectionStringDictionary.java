/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.WebManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.ConnectionStringDictionaryInner;
import java.util.Map;

/**
 * Type representing ConnectionStringDictionary.
 */
public interface ConnectionStringDictionary extends HasInner<ConnectionStringDictionaryInner>, HasManager<WebManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    Map<String, ConnStringValueTypePair> properties();

    /**
     * @return the type value.
     */
    String type();

}
