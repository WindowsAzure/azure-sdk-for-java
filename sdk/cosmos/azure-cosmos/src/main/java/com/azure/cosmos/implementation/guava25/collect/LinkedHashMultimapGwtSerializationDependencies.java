/*
 * Copyright (C) 2016 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Portions Copyright (c) Microsoft Corporation
 */

package com.azure.cosmos.implementation.guava25.collect;

import java.util.Collection;
import java.util.Map;

/**
 * A dummy superclass to support GWT serialization of the element types of a {@link
 * LinkedHashMultimap}. The GWT supersource for this class contains a field for each type.
 *
 * <p>For details about this hack, see {@link GwtSerializationDependencies}, which takes the same
 * approach but with a subclass rather than a superclass.
 *
 * <p>TODO(cpovirk): Consider applying this subclass approach to our other types.
 */
abstract class LinkedHashMultimapGwtSerializationDependencies<K, V>
    extends AbstractSetMultimap<K, V> {
  LinkedHashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
    super(map);
  }
}
