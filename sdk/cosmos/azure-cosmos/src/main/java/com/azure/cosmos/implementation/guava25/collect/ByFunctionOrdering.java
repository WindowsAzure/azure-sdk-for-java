/*
 * Copyright (C) 2007 The Guava Authors
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

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

import com.azure.cosmos.implementation.guava25.base.Function;
import com.azure.cosmos.implementation.guava25.base.Objects;
import java.io.Serializable;


/**
 * An ordering that orders elements by applying an order to the result of a function on those
 * elements.
 */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
  final Function<F, ? extends T> function;
  final Ordering<T> ordering;

  ByFunctionOrdering(Function<F, ? extends T> function, Ordering<T> ordering) {
    this.function = checkNotNull(function);
    this.ordering = checkNotNull(ordering);
  }

  @Override
  public int compare(F left, F right) {
    return ordering.compare(function.apply(left), function.apply(right));
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }
    if (object instanceof ByFunctionOrdering) {
      ByFunctionOrdering<?, ?> that = (ByFunctionOrdering<?, ?>) object;
      return this.function.equals(that.function) && this.ordering.equals(that.ordering);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(function, ordering);
  }

  @Override
  public String toString() {
    return ordering + ".onResultOf(" + function + ")";
  }

  private static final long serialVersionUID = 0;
}
