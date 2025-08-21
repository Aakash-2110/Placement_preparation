import java.util.Scanner;

public class LongestHappyPrefix {
    String longestPrefix(String s) {
        int n = s.length();
        
        for (int len = n - 1; len > 0; len--) {
            String prefix = s.substring(0, len);
            String suffix = s.substring(n - len);

            if (prefix.equals(suffix)) {
                return prefix;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        LongestHappyPrefix obj = new LongestHappyPrefix();
        
        String result = obj.longestPrefix(s);
        System.out.println("Longest Happy Prefix: " + (result.isEmpty() ? "\"\"" : result));
        
        sc.close();
    }
}




/*class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n]; 

        int len = 0; 
        for (int i = 1; i < n; ) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int longest = lps[n - 1];
        return s.substring(0, longest);
    }
}*/
