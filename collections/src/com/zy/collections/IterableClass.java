package com.zy.collections;

import java.util.*;

public class IterableClass implements Iterable<String> {
    private String[] words = "And this is how we know the Earth to be banana-shaped".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }
//            @Override
//            public void remove() {
//                throw new UnsupportedOperationException("remove");
//            }
        };
    }
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int index = words.length - 1;
                    @Override
                    public boolean hasNext() {
                        return index >= 0;
                    }
                    @Override
                    public String next() {
                        return words[index--];
                    }
                };
            }
        };
    }
    public Iterable<String> randomes() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private Random random = new Random(47);
                    @Override
                    public boolean hasNext() {
                        return true;
                    }
                    @Override
                    public String next() {
                        return words[random.nextInt(words.length)];
                    }
                };
            }
        };
    }
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            private List<String> shuffled = new ArrayList<>(Arrays.asList(words));
            {
                Collections.shuffle(shuffled, new Random(47));
            }
            @Override
            public Iterator<String> iterator() {
                return shuffled.iterator();
            }
        };
    }

    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        IterableClass iterableClass = new IterableClass();
        for (String word : iterableClass) {
            System.out.println(word);
        }

        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        test(Arrays.asList(1,2,3));
        String[] strings = {"A", "B", "C"};
//        test(strings);
        test(Arrays.asList(strings));
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
