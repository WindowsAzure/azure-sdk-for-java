// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.management;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Supplier;

public class PagedListTests {
    private PagedList<Integer> list;

    @BeforeEach
    public void setupList() {
        list = new PagedList<Integer>(new TestPage(0, 21)) {
            @Override
            public Page<Integer> nextPage(String nextPageLink) {
                int pageNum = Integer.parseInt(nextPageLink);
                return new TestPage(pageNum, 21);
            }
        };
    }

    @Test
    public void sizeTest() {
        assertEquals(20, list.size());
    }

    @Test
    public void getTest() {
        assertEquals(15, (int) list.get(15));
    }

    @Test
    public void iterateTest() {
        int j = 0;
        for (int i : list) {
            assertEquals(i, j++);
        }
    }

    @Test
    public void removeTest() {
        Integer i = list.get(10);
        list.remove(10);
        assertEquals(19, list.size());
        assertEquals(19, (int) list.get(18));
    }

    @Test
    public void addTest() {
        Integer i = list.get(10);
        list.add(100);
        assertEquals(21, list.size());
        assertEquals(100, (int) list.get(11));
        assertEquals(19, (int) list.get(20));
    }

    @Test
    public void containsTest() {
        assertTrue(list.contains(0));
        assertTrue(list.contains(3));
        assertTrue(list.contains(19));
        assertFalse(list.contains(20));
    }

    @Test
    public void containsAllTest() {
        List<Integer> subList = new ArrayList<>();
        subList.addAll(Arrays.asList(0, 3, 19));
        assertTrue(list.containsAll(subList));
        subList.add(20);
        assertFalse(list.containsAll(subList));
    }

    @Test
    public void subListTest() {
        List<Integer> subList = list.subList(5, 15);
        assertEquals(10, subList.size());
        assertTrue(list.containsAll(subList));
        assertEquals(7, (int) subList.get(2));
    }

    @Test
    public void testIndexOf() {
        assertEquals(15, list.indexOf(15));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(15, list.lastIndexOf(15));
    }


    @Test
    public void testIteratorWithListSizeInvocation() {
        ListIterator<Integer> itr = list.listIterator();
        list.size();
        int j = 0;
        while (itr.hasNext()) {
            assertEquals(j++, (long) itr.next());
        }
    }

    @Test
    public void testIteratorPartsWithSizeInvocation() {
        ListIterator<Integer> itr = list.listIterator();
        int j = 0;
        while (j < 5) {
            assertTrue(itr.hasNext());
            assertEquals(j++, (long) itr.next());
        }
        list.size();
        while (j < 10) {
            assertTrue(itr.hasNext());
            assertEquals(j++, (long) itr.next());
        }
    }

    @Test
    public void testIteratorWithLoadNextPageInvocation() {
        ListIterator<Integer> itr = list.listIterator();
        int j = 0;
        while (j < 5) {
            assertTrue(itr.hasNext());
            assertEquals(j++, (long) itr.next());
        }
        list.loadNextPage();
        while (j < 10) {
            assertTrue(itr.hasNext());
            assertEquals(j++, (long) itr.next());
        }
        list.loadNextPage();
        while (itr.hasNext()) {
            assertEquals(j++, (long) itr.next());
        }
        assertEquals(20, j);
    }

    @Test
    public void testIteratorOperations() {
        ListIterator<Integer> itr1 = list.listIterator();
        IllegalStateException expectedException = null;
        try {
            itr1.remove();
        } catch (IllegalStateException ex) {
            expectedException = ex;
        }
        assertNotNull(expectedException);

        ListIterator<Integer> itr2 = list.listIterator();
        assertTrue(itr2.hasNext());
        assertEquals(0, (long) itr2.next());
        itr2.remove();
        assertTrue(itr2.hasNext());
        assertEquals(1, (long) itr2.next());

        itr2.set(100);
        assertTrue(itr2.hasPrevious());
        assertEquals(100, (long) itr2.previous());
        assertTrue(itr2.hasNext());
        assertEquals(100, (long) itr2.next());
    }

    @Test
    public void testAddViaIteratorWhileIterating() {
        ListIterator<Integer> itr1 = list.listIterator();
        while (itr1.hasNext()) {
            Integer val = itr1.next();
            if (val < 10) {
                itr1.add(99);
            }
        }
        assertEquals(30, list.size());
    }

    @Test
    public void testRemoveViaIteratorWhileIterating() {
        ListIterator<Integer> itr1 = list.listIterator();
        while (itr1.hasNext()) {
            itr1.next();
            itr1.remove();
        }
        assertEquals(0, list.size());
    }

    @Test
    public void canHandleIntermediateEmptyPage() {
        List<Integer> pagedList = new PagedList<Integer>(new Page<Integer>() {
            @Override
            public String nextPageLink() {
                return "A";
            }

            @Override
            public List<Integer> items() {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                return list;
            }
        }) {
            @Override
            public Page<Integer> nextPage(String nextPageLink) {
                if (nextPageLink == "A") {
                    return new Page<Integer>() {
                        @Override
                        public String nextPageLink() {
                            return "B";
                        }

                        @Override
                        public List<Integer> items() {
                            return new ArrayList<>(); // EMPTY PAGE
                        }
                    };
                } else if (nextPageLink == "B") {
                    return new Page<Integer>() {
                        @Override
                        public String nextPageLink() {
                            return "C";
                        }

                        @Override
                        public List<Integer> items() {
                            List<Integer> list = new ArrayList<>();
                            list.add(3);
                            list.add(4);
                            return list;
                        }
                    };
                } else if (nextPageLink == "C") {
                    return new Page<Integer>() {
                        @Override
                        public String nextPageLink() {
                            return null;
                        }

                        @Override
                        public List<Integer> items() {
                            List<Integer> list = new ArrayList<>();
                            list.add(5);
                            list.add(6);
                            return list;
                        }
                    };
                }
                throw new RuntimeException("nextPage should not be called after a page with next link as null");
            }
        };
        ListIterator<Integer> itr = pagedList.listIterator();
        int c = 1;
        while (itr.hasNext()) {
            assertEquals(c, (int) itr.next());
            c++;
        }
        assertEquals(7, c);
    }

    @Test
    public void canCreateFluxFromPagedList() {
        // Test lazy flux can be created by ensuring loadNextPage invoked lazily
        //
        class FluxFromPagedList {
            int loadNextPageCallCount;

            Flux<Integer> toFlux() {
                return firstFlux().concatWith(nextFlux());
            }

            Flux<Integer> firstFlux() {
                return Flux.defer((Supplier<Flux<Integer>>) () -> Flux.fromIterable(list.currentPage().items()));
            }

            Flux<Integer> nextFlux() {
                return Flux.defer((Supplier<Flux<Integer>>) () -> {
                    if (list.hasNextPage()) {
                        list.loadNextPage();
                        loadNextPageCallCount++;
                        return Flux.fromIterable(list.currentPage().items()).concatWith(Flux.defer(new Supplier<Flux<Integer>>() {
                            @Override
                            public Flux<Integer> get() {
                                return nextFlux();
                            }
                        }));
                    } else {
                        return Flux.empty();
                    }
                });
            }
        }

        FluxFromPagedList obpl = new FluxFromPagedList();

        final Integer[] cnt = new Integer[] { 0 };
        obpl.toFlux().subscribe(integer -> {
            assertEquals(cnt[0], integer);
            cnt[0]++;
        });
        assertEquals(20, (long) cnt[0]);
        assertEquals(19, obpl.loadNextPageCallCount);
    }


    public static class TestPage implements Page<Integer> {
        private int page;
        private int max;

        public TestPage(int page, int max) {
            this.page = page;
            this.max = max;
        }

        @Override
        public String nextPageLink() {
            if (page + 1 == max) {
                return null;
            }
            return Integer.toString(page + 1);
        }

        @Override
        public List<Integer> items() {
            if (page + 1 != max) {
                List<Integer> items = new ArrayList<>();
                items.add(page);
                return items;
            } else {
                return new ArrayList<>();
            }
        }
    }
}
