import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person {
    String name,age,city;
    public Person(String name, String age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}



public class Practice {
    public static void practice2() {
        List<String> arr = List.of("silent", "listen", "ate", "eat", "tea", "meow", "weom", "distinct");
        List<List<String>> anagram = arr.stream().collect(Collectors.groupingBy(k-> {
            char[] ch = k.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        })).values().stream().toList();
        System.out.println(anagram);
        String a = "swiss";
        Character firstRepeating = a.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(k -> k.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);

        String abbu = "A boy hasthmethun karta hai";
        System.out.println(Arrays.stream(abbu.split("\\s+")).max(Comparator.comparingInt(String::length)).orElse("0"));
        String distinct = abbu.chars()
                .distinct() //intstream
                .mapToObj(c -> String.valueOf((char) c))//need to specify char here
                .collect(Collectors.joining());
        System.out.println(distinct);
    }
    public static void main(String args[]) throws JsonProcessingException {
        String abbu = "abbca";

    }
}
