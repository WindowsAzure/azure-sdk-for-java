/*
 * Copyright (C) 2012 The Guava Authors
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

import java.io.Serializable;
import java.util.List;


/**
 * An ordering that treats all references as equals, even nulls.
 *
 * @author Emily Soldal
 */
final class AllEqualOrdering extends Ordering<Object> implements Serializable {
  static final AllEqualOrdering INSTANCE = new AllEqualOrdering();

  @Override
  public int compare(Object left, Object right) {
    return 0;
  }

  @Override
  public <E> List<E> sortedCopy(Iterable<E> iterable) {
    return Lists.newArrayList(iterable);
  }

  @Override
  public <E> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
    return ImmutableList.copyOf(iterable);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public <S> Ordering<S> reverse() {
    return (Ordering<S>) this;
  }

  private Object readResolve() {
    return INSTANCE;
  }

  @Override
  public String toString() {
    return "Ordering.allEqual()";
  }

  private static final long serialVersionUID = 0;
}
