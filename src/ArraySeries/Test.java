import java.util.LinkedHashMap;

public class Test {

    public static void main(String args[]){
        String str = "apple";
        LinkedHashMap<Character, Integer> charToCount = new LinkedHashMap<>();
        for(char c: str.toCharArray()) {
            if(!charToCount.containsKey(c)) {
                charToCount.put(c,1);
            } else {
                charToCount.put(c, charToCount.get(c)+1);
            }
        }
        for(Character c: charToCount.keySet()){
            System.out.println(c+"="+charToCount.get(c));
        }

            //o/p -> a=1,p=2,l=1,e=1
    }
}
