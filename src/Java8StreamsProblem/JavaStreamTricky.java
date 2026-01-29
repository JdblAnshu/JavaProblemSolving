import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamTricky {
    public static void main(String args[]) {
        System.out.println("Tricky Stream Problems");
        //1
        List<String> list = List.of("Java", "JavaScript", "Python", "Jaeger");

        long count = list.stream()
                .filter(s -> s.startsWith("Ja"))
                .count();

        System.out.println(count); // 3

        String wordWithMaxVowels = list.stream()
                .max(Comparator.comparingInt(s ->
                        s.replaceAll("[^aeiouAEIOU]", "").length()))
                .orElse("");

        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);

        String sentence = "Who are we fighting for if not for ourselves";
        longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        String joined = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(joined);

        String reverseConcat = list.stream()
                .reduce("", (a, b) -> b + a);
        //anagram ??
        Map<String, List<String>> map =
                list.stream().collect(Collectors.groupingBy(
                        s -> s.chars().sorted()
                                .mapToObj(c -> String.valueOf((char)c))
                                .collect(Collectors.joining())
                ));



        List<String> nonull = list.stream()
                .filter(Objects::nonNull)
                .toList();

        List<String> reversed = list.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .toList();
        System.out.println(reversed);





        //2
        String input = "swiss";

        Character res0 = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(res0);

        Character mostFrequent = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        //3 Uppercase conversion
        list = List.of("java", "spring", "stream");
        List<String> result = list.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);


        //4
        List<Integer> list1 = List.of(1, 2, 3, 2, 4, 3, 5);

        Set<Integer> duplicates = list1.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(duplicates); // [2, 3]
        //Parallel stream
        int sum = list1.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //average
        double avg = list1.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        int n =6;
        int nth = list1.stream()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .orElse(-1);

        //sum of squares
        sum = list1.stream()
                .filter(k -> k % 2 == 0)
                .map(k -> k * k)
                .mapToInt(Integer::intValue)
                .sum();

        //skip and limit
        result = list.stream()
                .skip(2)
                .limit(3)
                .toList();


        //shorter version
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupes = list1.stream()
                .filter(k -> !seen.add(k))
                .collect(Collectors.toSet());

        //5 Grouping by string length
        List<String> list2 = List.of("Java", "Stream", "API", "Code");

        Map<Integer, List<String>> result2 = list2.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result2);

        //common in 2 lists
        List<Integer> common = list1.stream()
                .filter(new HashSet<>(list2)::contains)
                .toList();
        System.out.println(common);

        //6 flatmap listof list
        List<List<Integer>> list3 = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5)
        );

        List<Integer> res3 = list3.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(res3); // [1, 2, 3, 4, 5]

        //7 flatmap multiple lists.
        List<Integer> ilist1 = List.of(1, 2);
        List<Integer> ilist2 = List.of(3, 4);
        List<Integer> ilist3 = List.of(5, 6);
        List<Integer> res4 = Stream.of(ilist1, ilist2, ilist3)
                .flatMap(List::stream)
                .toList();
        System.out.println(res4); // [1, 2, 3, 4, 5, 6]

        Map<String, Integer> map2 = Map.of("a", 1, "b", 2, "c", 3);
        Map<Integer, String> reversedMap = map2.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey
                ));
        Map<String, Integer> thresholdMap = map2.entrySet().stream()
                .filter(entry -> entry.getValue()> 2)
                .collect(Collectors.toMap(
                        e-> e.getKey(),
                        e -> e.getValue()
                ));

        //Running sum ??
//        AtomicInteger atomicsum = new AtomicInteger();
//        List<Integer> atomicResult = list.stream()
//                .map(atomicsum::addAndGet)
//                .toList();

        //Fibonacci using streams ??
        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .map(a -> a[0])
                .toList();

        //Pyramid print ??
        IntStream.rangeClosed(1, n)
                .mapToObj(i -> "*".repeat(i))
                .forEach(System.out::println);

        //All subsequences ??
        String str = "abcd";
        List<String> res = IntStream.range(0, 1 << str.length())
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < str.length(); j++)
                        if ((i & (1 << j)) != 0) sb.append(str.charAt(j));
                    return sb.toString();
                }).toList();

    }
}
