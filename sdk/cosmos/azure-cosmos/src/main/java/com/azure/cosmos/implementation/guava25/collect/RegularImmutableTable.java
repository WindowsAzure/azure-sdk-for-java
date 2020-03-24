///*
// * Copyright (C) 2009 The Guava Authors
// *
// * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
// * in compliance with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software distributed under the License
// * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
// * or implied. See the License for the specific language governing permissions and limitations under
// * the License.
// */

//
//import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
//
//
///**
// * An implementation of {@link ImmutableTable} holding an arbitrary number of cells.
// *
// * @author Gregory Kick
// */
//abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
//  RegularImmutableTable() {}
//
//  abstract Cell<R, C, V> getCell(int iterationIndex);
//
//  @Override
//  final ImmutableSet<Cell<R, C, V>> createCellSet() {
//    return isEmpty() ? ImmutableSet.<Cell<R, C, V>>of() : new CellSet();
//  }
//
//  private final class CellSet extends IndexedImmutableSet<Cell<R, C, V>> {
//    @Override
//    public int size() {
//      return RegularImmutableTable.this.size();
//    }
//
//    @Override
//    Cell<R, C, V> get(int index) {
//      return getCell(index);
//    }
//
//    @Override
//    public boolean contains(Object object) {
//      if (object instanceof Cell) {
//        Cell<?, ?, ?> cell = (Cell<?, ?, ?>) object;
//        Object value = RegularImmutableTable.this.get(cell.getRowKey(), cell.getColumnKey());
//        return value != null && value.equals(cell.getValue());
//      }
//      return false;
//    }
//
//    @Override
//    boolean isPartialView() {
//      return false;
//    }
//  }
//
//  abstract V getValue(int iterationIndex);
//
//  @Override
//  final ImmutableCollection<V> createValues() {
//    return isEmpty() ? ImmutableList.<V>of() : new Values();
//  }
//
//  private final class Values extends ImmutableList<V> {
//    @Override
//    public int size() {
//      return RegularImmutableTable.this.size();
//    }
//
//    @Override
//    public V get(int index) {
//      return getValue(index);
//    }
//
//    @Override
//    boolean isPartialView() {
//      return true;
//    }
//  }
//
//  static <R, C, V> RegularImmutableTable<R, C, V> forCells(
//      List<Cell<R, C, V>> cells,
//      final Comparator<? super R> rowComparator,
//      final Comparator<? super C> columnComparator) {
//    checkNotNull(cells);
//    if (rowComparator != null || columnComparator != null) {
//      /*
//       * This sorting logic leads to a cellSet() ordering that may not be expected and that isn't
//       * documented in the Javadoc. If a row Comparator is provided, cellSet() iterates across the
//       * columns in the first row, the columns in the second row, etc. If a column Comparator is
//       * provided but a row Comparator isn't, cellSet() iterates across the rows in the first
//       * column, the rows in the second column, etc.
//       */
//      Comparator<Cell<R, C, V>> comparator =
//          new Comparator<Cell<R, C, V>>() {
//            @Override
//            public int compare(Cell<R, C, V> cell1, Cell<R, C, V> cell2) {
//              int rowCompare =
//                  (rowComparator == null)
//                      ? 0
//                      : rowComparator.compare(cell1.getRowKey(), cell2.getRowKey());
//              if (rowCompare != 0) {
//                return rowCompare;
//              }
//              return (columnComparator == null)
//                  ? 0
//                  : columnComparator.compare(cell1.getColumnKey(), cell2.getColumnKey());
//            }
//          };
//      Collections.sort(cells, comparator);
//    }
//    return forCellsInternal(cells, rowComparator, columnComparator);
//  }
//
//  static <R, C, V> RegularImmutableTable<R, C, V> forCells(Iterable<Cell<R, C, V>> cells) {
//    return forCellsInternal(cells, null, null);
//  }
//
//  private static <R, C, V> RegularImmutableTable<R, C, V> forCellsInternal(
//      Iterable<Cell<R, C, V>> cells,
//      Comparator<? super R> rowComparator,
//      Comparator<? super C> columnComparator) {
//    Set<R> rowSpaceBuilder = new LinkedHashSet<>();
//    Set<C> columnSpaceBuilder = new LinkedHashSet<>();
//    ImmutableList<Cell<R, C, V>> cellList = ImmutableList.copyOf(cells);
//    for (Cell<R, C, V> cell : cells) {
//      rowSpaceBuilder.add(cell.getRowKey());
//      columnSpaceBuilder.add(cell.getColumnKey());
//    }
//
//    ImmutableSet<R> rowSpace =
//        (rowComparator == null)
//            ? ImmutableSet.copyOf(rowSpaceBuilder)
//            : ImmutableSet.copyOf(ImmutableList.sortedCopyOf(rowComparator, rowSpaceBuilder));
//    ImmutableSet<C> columnSpace =
//        (columnComparator == null)
//            ? ImmutableSet.copyOf(columnSpaceBuilder)
//            : ImmutableSet.copyOf(ImmutableList.sortedCopyOf(columnComparator, columnSpaceBuilder));
//
//    return forOrderedComponents(cellList, rowSpace, columnSpace);
//  }
//
//  /** A factory that chooses the most space-efficient representation of the table. */
//  static <R, C, V> RegularImmutableTable<R, C, V> forOrderedComponents(
//      ImmutableList<Cell<R, C, V>> cellList,
//      ImmutableSet<R> rowSpace,
//      ImmutableSet<C> columnSpace) {
//    // use a dense table if more than half of the cells have values
//    // TODO(gak): tune this condition based on empirical evidence
//    return (cellList.size() > (((long) rowSpace.size() * columnSpace.size()) / 2))
//        ? new DenseImmutableTable<R, C, V>(cellList, rowSpace, columnSpace)
//        : new SparseImmutableTable<R, C, V>(cellList, rowSpace, columnSpace);
//  }
//}
