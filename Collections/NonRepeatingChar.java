// Find the first non repeating character in a string using hashmap
// aabccde, Output: b

import java.util.*;

class NonRepeatingChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        String inputString = sc.next();
        char[] converted = inputString.toCharArray();

        for(int i=0; i<converted.length; i++){
            // System.out.println(converted[i]);
            char ch = converted[i];
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        
        // System.out.println(hm);

        for(Map.Entry<Character, Integer> ent: hm.entrySet()){
            if(ent.getValue() == 1){
                System.out.println(ent.getKey());
                return;
            }
        }

        System.out.println("null");
    }
}