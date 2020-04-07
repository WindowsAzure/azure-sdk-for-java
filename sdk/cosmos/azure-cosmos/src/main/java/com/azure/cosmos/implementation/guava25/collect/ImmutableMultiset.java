/*
 * Copyright (C) 2008 The Guava Authors
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



import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;



/**
 * A {@link Multiset} whose contents will never change, with many other important properties
 * detailed at {@link ImmutableCollection}.
 *
 * <p><b>Grouped iteration.</b> In all current implementations, duplicate elements always appear
 * consecutively when iterating. Elements iterate in order by the <i>first</i> appearance of that
 * element when the multiset was created.
 *
 * <p>See the Guava User Guide article on <a href=
 * "https://github.com/google/guava/wiki/ImmutableCollectionsExplained"> immutable collections</a>.
 *
 * @author Jared Levy
 * @author Louis Wasserman
 * @since 2.0
 */
@SuppressWarnings("serial") // we're overriding default serialization
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E>
    implements Multiset<E> {

  /**
   * Returns a {@code Collector} that accumulates the input elements into a new {@code
   * ImmutableMultiset}. Elements iterate in order by the <i>first</i> appearance of that element in
   * encounter order.
   *
   * @since 21.0
   */

  public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
    return toImmutableMultiset(Function.identity(), e -> 1);
  }

  /**
   * Returns a {@code Collector} that accumulates elements into an {@code ImmutableMultiset} whose
   * elements are the result of applying {@code elementFunction} to the inputs, with counts equal to
   * the result of applying {@code countFunction} to the inputs.
   *
   * <p>If the mapped elements contain duplicates (according to {@link Object#equals}), the first
   * occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
   * the outputs of {@code countFunction.applyAsInt(t)} for each {@code t} mapped to that element.
   *
   * @since 22.0
   */
  public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(
      Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
    checkNotNull(elementFunction);
    checkNotNull(countFunction);
    return Collector.of(
        LinkedHashMultiset::create,
        (multiset, t) ->
            multiset.add(checkNotNull(elementFunction.apply(t)), countFunction.applyAsInt(t)),
        (multiset1, multiset2) -> {
          multiset1.addAll(multiset2);
          return multiset1;
        },
        (Multiset<E> multiset) -> copyFromEntries(multiset.entrySet()));
  }

  /** Returns the empty immutable multiset. */
  @SuppressWarnings({"unchecked", "rawtypes"}) // all supported methods are covariant
  public static <E> ImmutableMultiset<E> of() {
    return (ImmutableMultiset<E>) RegularImmutableMultiset.EMPTY;
  }

  /**
   * Returns an immutable multiset containing a single element.
   *
   * @throws NullPointerException if {@code element} is null
   * @since 6.0 (source-compatible since 2.0)
   */
  @SuppressWarnings({"unchecked", "rawtypes"}) // generic array created but never written
  public static <E> ImmutableMultiset<E> of(E element) {
    return copyFromElements(element);
  }

  /**
   * Returns an immutable multiset containing the given elements, in order.
   *
   * @throws NullPointerException if any element is null
   * @since 6.0 (source-compatible since 2.0)
   */
  @SuppressWarnings({"unchecked", "rawtypes"}) //
  public static <E> ImmutableMultiset<E> of(E e1, E e2) {
    return copyFromElements(e1, e2);
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any element is null
   * @since 6.0 (source-compatible since 2.0)
   */
  @SuppressWarnings({"unchecked", "rawtypes"}) //
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3) {
    return copyFromElements(e1, e2, e3);
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any element is null
   * @since 6.0 (source-compatible since 2.0)
   */
  @SuppressWarnings({"unchecked", "rawtypes"}) //
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3, E e4) {
    return copyFromElements(e1, e2, e3, e4);
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any element is null
   * @since 6.0 (source-compatible since 2.0)
   */
  @SuppressWarnings({"unchecked", "rawtypes"}) //
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3, E e4, E e5) {
    return copyFromElements(e1, e2, e3, e4, e5);
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any element is null
   * @since 6.0 (source-compatible since 2.0)
   */
  @SuppressWarnings({"unchecked", "rawtypes"}) //
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E... others) {
    return new Builder<E>().add(e1).add(e2).add(e3).add(e4).add(e5).add(e6).add(others).build();
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any of {@code elements} is null
   * @since 6.0
   */
  public static <E> ImmutableMultiset<E> copyOf(E[] elements) {
    return copyFromElements(elements);
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any of {@code elements} is null
   */
  public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> elements) {
    if (elements instanceof ImmutableMultiset) {
      @SuppressWarnings({"unchecked", "rawtypes"}) // all supported methods are covariant
      ImmutableMultiset<E> result = (ImmutableMultiset<E>) elements;
      if (!result.isPartialView()) {
        return result;
      }
    }

    Multiset<? extends E> multiset =
        (elements instanceof Multiset)
            ? Multisets.cast(elements)
            : LinkedHashMultiset.create(elements);

    return copyFromEntries(multiset.entrySet());
  }

  /**
   * Returns an immutable multiset containing the given elements, in the "grouped iteration order"
   * described in the class documentation.
   *
   * @throws NullPointerException if any of {@code elements} is null
   */
  public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> elements) {
    Multiset<E> multiset = LinkedHashMultiset.create();
    Iterators.addAll(multiset, elements);
    return copyFromEntries(multiset.entrySet());
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  private static <E> ImmutableMultiset<E> copyFromElements(E... elements) {
    Multiset<E> multiset = LinkedHashMultiset.create();
    Collections.addAll(multiset, elements);
    return copyFromEntries(multiset.entrySet());
  }

  static <E> ImmutableMultiset<E> copyFromEntries(
      Collection<? extends Entry<? extends E>> entries) {
    if (entries.isEmpty()) {
      return of();
    } else {
      return RegularImmutableMultiset.create(entries);
    }
  }

  ImmutableMultiset() {}

  @Override
  public UnmodifiableIterator<E> iterator() {
    final Iterator<Entry<E>> entryIterator = entrySet().iterator();
    return new UnmodifiableIterator<E>() {
      int remaining;
      E element;

      @Override
      public boolean hasNext() {
        return (remaining > 0) || entryIterator.hasNext();
      }

      @Override
      public E next() {
        if (remaining <= 0) {
          Entry<E> entry = entryIterator.next();
          element = entry.getElement();
          remaining = entry.getCount();
        }
        remaining--;
        return element;
      }
    };
  }

  private transient ImmutableList<E> asList;

  @Override
  public ImmutableList<E> asList() {
    ImmutableList<E> result = asList;
    return (result == null) ? asList = super.asList() : result;
  }

  @Override
  public boolean contains(Object object) {
    return count(object) > 0;
  }

  /**
   * Guaranteed to throw an exception and leave the collection unmodified.
   *
   * @throws UnsupportedOperationException always
   * @deprecated Unsupported operation.
   */
  @Deprecated
  @Override
  public final int add(E element, int occurrences) {
    throw new UnsupportedOperationException();
  }

  /**
   * Guaranteed to throw an exception and leave the collection unmodified.
   *
   * @throws UnsupportedOperationException always
   * @deprecated Unsupported operation.
   */
  @Deprecated
  @Override
  public final int remove(Object element, int occurrences) {
    throw new UnsupportedOperationException();
  }

  /**
   * Guaranteed to throw an exception and leave the collection unmodified.
   *
   * @throws UnsupportedOperationException always
   * @deprecated Unsupported operation.
   */
  @Deprecated
  @Override
  public final int setCount(E element, int count) {
    throw new UnsupportedOperationException();
  }

  /**
   * Guaranteed to throw an exception and leave the collection unmodified.
   *
   * @throws UnsupportedOperationException always
   * @deprecated Unsupported operation.
   */
  @Deprecated
  @Override
  public final boolean setCount(E element, int oldCount, int newCount) {
    throw new UnsupportedOperationException();
  }

  @Override
  int copyIntoArray(Object[] dst, int offset) {
    for (Multiset.Entry<E> entry : entrySet()) {
      Arrays.fill(dst, offset, offset + entry.getCount(), entry.getElement());
      offset += entry.getCount();
    }
    return offset;
  }

  @Override
  public boolean equals(Object object) {
    return Multisets.equalsImpl(this, object);
  }

  @Override
  public int hashCode() {
    return Sets.hashCodeImpl(entrySet());
  }

  @Override
  public String toString() {
    return entrySet().toString();
  }

  /** @since 21.0 (present with return type {@code Set} since 2.0) */
  @Override
  public abstract ImmutableSet<E> elementSet();

  private transient ImmutableSet<Entry<E>> entrySet;

  @Override
  public ImmutableSet<Entry<E>> entrySet() {
    ImmutableSet<Entry<E>> es = entrySet;
    return (es == null) ? (entrySet = createEntrySet()) : es;
  }

  private ImmutableSet<Entry<E>> createEntrySet() {
    return isEmpty() ? ImmutableSet.<Entry<E>>of() : new EntrySet();
  }

  abstract Entry<E> getEntry(int index);

  private final class EntrySet extends IndexedImmutableSet<Entry<E>> {
    @Override
    boolean isPartialView() {
      return ImmutableMultiset.this.isPartialView();
    }

    @Override
    Entry<E> get(int index) {
      return getEntry(index);
    }

    @Override
    public int size() {
      return elementSet().size();
    }

    @Override
    public boolean contains(Object o) {
      if (o instanceof Entry) {
        Entry<?> entry = (Entry<?>) o;
        if (entry.getCount() <= 0) {
          return false;
        }
        int count = count(entry.getElement());
        return count == entry.getCount();
      }
      return false;
    }

    @Override
    public int hashCode() {
      return ImmutableMultiset.this.hashCode();
    }

    @Override
    Object writeReplace() {
      return new EntrySetSerializedForm<E>(ImmutableMultiset.this);
    }

    private static final long serialVersionUID = 0;
  }

  static class EntrySetSerializedForm<E> implements Serializable {
    final ImmutableMultiset<E> multiset;

    EntrySetSerializedForm(ImmutableMultiset<E> multiset) {
      this.multiset = multiset;
    }

    Object readResolve() {
      return multiset.entrySet();
    }
  }

  @Override
  Object writeReplace() {
    return new SerializedForm(this);
  }

  /**
   * Returns a new builder. The generated builder is equivalent to the builder created by the {@link
   * Builder} constructor.
   */
  public static <E> Builder<E> builder() {
    return new Builder<E>();
  }

  /**
   * A builder for creating immutable multiset instances, especially {@code public static final}
   * multisets ("constant multisets"). Example:
   *
   * <pre>{@code
   * public static final ImmutableMultiset<Bean> BEANS =
   *     new ImmutableMultiset.Builder<Bean>()
   *         .addCopies(Bean.COCOA, 4)
   *         .addCopies(Bean.GARDEN, 6)
   *         .addCopies(Bean.RED, 8)
   *         .addCopies(Bean.BLACK_EYED, 10)
   *         .build();
   * }</pre>
   *
   * <p>Builder instances can be reused; it is safe to call {@link #build} multiple times to build
   * multiple multisets in series.
   *
   * @since 2.0
   */
  @SuppressWarnings("unchecked")
  public static class Builder<E> extends ImmutableCollection.Builder<E> {
    final Multiset<E> contents;

    /**
     * Creates a new builder. The returned builder is equivalent to the builder generated by {@link
     * ImmutableMultiset#builder}.
     */
    public Builder() {
      this(LinkedHashMultiset.<E>create());
    }

    Builder(Multiset<E> contents) {
      this.contents = contents;
    }

    /**
     * Adds {@code element} to the {@code ImmutableMultiset}.
     *
     * @param element the element to add
     * @return this {@code Builder} object
     * @throws NullPointerException if {@code element} is null
     */
    @Override
    public Builder<E> add(E element) {
      contents.add(checkNotNull(element));
      return this;
    }

    /**
     * Adds each element of {@code elements} to the {@code ImmutableMultiset}.
     *
     * @param elements the elements to add
     * @return this {@code Builder} object
     * @throws NullPointerException if {@code elements} is null or contains a null element
     */
    @SuppressWarnings("unchecked")
    @Override
    public Builder<E> add(E... elements) {
      super.add(elements);
      return this;
    }

    /**
     * Adds a number of occurrences of an element to this {@code ImmutableMultiset}.
     *
     * @param element the element to add
     * @param occurrences the number of occurrences of the element to add. May be zero, in which
     *     case no change will be made.
     * @return this {@code Builder} object
     * @throws NullPointerException if {@code element} is null
     * @throws IllegalArgumentException if {@code occurrences} is negative, or if this operation
     *     would result in more than {@link Integer#MAX_VALUE} occurrences of the element
     */
    public Builder<E> addCopies(E element, int occurrences) {
      contents.add(checkNotNull(element), occurrences);
      return this;
    }

    /**
     * Adds or removes the necessary occurrences of an element such that the element attains the
     * desired count.
     *
     * @param element the element to add or remove occurrences of
     * @param count the desired count of the element in this multiset
     * @return this {@code Builder} object
     * @throws NullPointerException if {@code element} is null
     * @throws IllegalArgumentException if {@code count} is negative
     */
    public Builder<E> setCount(E element, int count) {
      contents.setCount(checkNotNull(element), count);
      return this;
    }

    /**
     * Adds each element of {@code elements} to the {@code ImmutableMultiset}.
     *
     * @param elements the {@code Iterable} to add to the {@code ImmutableMultiset}
     * @return this {@code Builder} object
     * @throws NullPointerException if {@code elements} is null or contains a null element
     */
    @Override
    public Builder<E> addAll(Iterable<? extends E> elements) {
      if (elements instanceof Multiset) {
        Multiset<? extends E> multiset = Multisets.cast(elements);
        multiset.forEachEntry((e, n) -> contents.add(checkNotNull(e), n));
      } else {
        super.addAll(elements);
      }
      return this;
    }

    /**
     * Adds each element of {@code elements} to the {@code ImmutableMultiset}.
     *
     * @param elements the elements to add to the {@code ImmutableMultiset}
     * @return this {@code Builder} object
     * @throws NullPointerException if {@code elements} is null or contains a null element
     */
    @Override
    public Builder<E> addAll(Iterator<? extends E> elements) {
      super.addAll(elements);
      return this;
    }

    /**
     * Returns a newly-created {@code ImmutableMultiset} based on the contents of the {@code
     * Builder}.
     */
    @Override
    public ImmutableMultiset<E> build() {
      return copyOf(contents);
    }


    ImmutableMultiset<E> buildJdkBacked() {
      if (contents.isEmpty()) {
        return of();
      }
      return JdkBackedImmutableMultiset.create(contents.entrySet());
    }
  }

  static final class ElementSet<E> extends ImmutableSet.Indexed<E> {
    private final List<Entry<E>> entries;
    private final Multiset<E> delegate;

    ElementSet(List<Entry<E>> entries, Multiset<E> delegate) {
      this.entries = entries;
      this.delegate = delegate;
    }

    @Override
    E get(int index) {
      return entries.get(index).getElement();
    }

    @Override
    public boolean contains(Object object) {
      return delegate.contains(object);
    }

    @Override
    boolean isPartialView() {
      return true;
    }

    @Override
    public int size() {
      return entries.size();
    }
  }

  static final class SerializedForm implements Serializable {
    final Object[] elements;
    final int[] counts;

    SerializedForm(Multiset<?> multiset) {
      int distinct = multiset.entrySet().size();
      elements = new Object[distinct];
      counts = new int[distinct];
      int i = 0;
      for (Entry<?> entry : multiset.entrySet()) {
        elements[i] = entry.getElement();
        counts[i] = entry.getCount();
        i++;
      }
    }

    Object readResolve() {
      LinkedHashMultiset<Object> multiset = LinkedHashMultiset.create(elements.length);
      for (int i = 0; i < elements.length; i++) {
        multiset.add(elements[i], counts[i]);
      }
      return ImmutableMultiset.copyOf(multiset);
    }

    private static final long serialVersionUID = 0;
  }
}
