import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = 3;

        TreeSet<Integer> numbersSet = IntStream
                .iterate(1, i -> i + 1)
                .limit(n)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));

        TreeSet<Integer> subset = new TreeSet<>();

        while (true) {
            Integer max = numbersSet
                    .stream().filter(i -> !subset.contains(i)).max(Integer::compare).orElse(null);

            if (max == null) {
                break;
            }

            subset.add(max);
            subset.removeIf(i -> i > max);

            System.out.println(subset);
        }
    }
}